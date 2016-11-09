package br.ufpe.ines.decode.observer.control.handlers;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import br.ufpe.ines.decode.decode.artifacts.JavaProject;
import br.ufpe.ines.decode.observer.control.ExperimentExecutionManager;
import br.ufpe.ines.decode.observer.model.CurrentExecutableTask;
import br.ufpe.ines.decode.observer.util.JavaProjectCreator;

public class ConfigureExperimentHandler  extends AbstractHandler {

	private ExperimentExecutionManager manager = ExperimentExecutionManager.getInstance();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		CurrentExecutableTask task = manager.getExecutionTask();
		System.out.println("toString="+task.toString());
		System.out.println("task.getTaskModel()="+task.getTaskModel().getName());
		List<JavaProject> javaProjects = task.getTaskModel().getRequires()
				  .stream()
				  .filter(c -> c instanceof JavaProject)
				  .map(JavaProject.class::cast)
				  .collect(Collectors.toList());;
		JavaProjectCreator creator = new JavaProjectCreator();  
		for (JavaProject javaProject : javaProjects) {
			try {
				IProject project = creator.createProject(javaProject);
				task.addProjectName(project.getName());
			} catch (CoreException | IOException e) {
				e.printStackTrace();
				MessageDialog.openInformation(window.getShell(),
						"Experiment NOT Configured",
						"The experiemnt NOT is ready to start.");
				return null;
			}
		}
		task.finishConfiguration();

		MessageDialog.openInformation(window.getShell(),
				"Experiment Configured",
				"The experiemnt is ready to start.");
		return null;
	}

}
