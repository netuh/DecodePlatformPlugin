package br.ufpe.ines.decode.plugin.control.handlers;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;

import br.edu.ufpe.ines.decode.artifacts.JavaProject;
import br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask;
import br.ufpe.ines.decode.plugin.control.ExperimentExecutionManager;
import br.ufpe.ines.decode.plugin.util.JavaProjectCreator;

public class ConfigureExperimentHandler  extends AbstractHandler {

	private ExperimentExecutionManager manager = ExperimentExecutionManager.getInstance();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {		
		ExperimentalTask task = manager.getCurrentTask();
		List<JavaProject> javaProjects = task.getRequires().stream().filter(c -> c instanceof JavaProject)
	    .map(JavaProject.class::cast).collect(Collectors.toList());
		JavaProjectCreator creator = new JavaProjectCreator();  
		for (JavaProject javaProject : javaProjects) {
			try {
				IProject project = creator.createProject(javaProject);
				manager.addCreatedProject(project);
			} catch (CoreException | IOException e) {
				e.printStackTrace();
			}
		}
		manager.setConfigured();
		return null;
	}

}
