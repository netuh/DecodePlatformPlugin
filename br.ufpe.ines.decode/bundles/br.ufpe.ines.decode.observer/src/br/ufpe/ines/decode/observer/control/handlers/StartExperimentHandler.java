package br.ufpe.ines.decode.observer.control.handlers;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IBundleGroupProvider;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osgi.framework.Bundle;

import br.ufpe.ines.decode.decode.taskDescription.EclipseParameter;
import br.ufpe.ines.decode.decode.taskDescription.Parameter;
import br.ufpe.ines.decode.observer.control.ExperimentExecutionManager;
import br.ufpe.ines.decode.observer.model.CurrentExecutableTask;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class StartExperimentHandler extends AbstractHandler {

	private ExperimentExecutionManager manager = ExperimentExecutionManager.getInstance();
	static final Logger logger = Logger.getLogger(StartExperimentHandler.class);

	/**
	 * The constructor.
	 */
	public StartExperimentHandler() {
		super();
	}
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		CurrentExecutableTask task = manager.getExecutionTask();
		List<Parameter> restriction = task.getTaskModel().getAllParameters();
		if (!restriction.isEmpty()){
			for (Parameter aRestriction : restriction) {
				List<String> restricNotSatisfied = verify(aRestriction);
				if (!restricNotSatisfied.isEmpty()){
					MessageDialog.openInformation(window.getShell(),
							"Experiment NOT stared",
							"The following restriction has to be satisfied: "+ aRestriction.toString());
					return null;
				}
			}
		}
		
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        IProject[] projects = workspaceRoot.getProjects();
        List<String> createdProjects = task.getProjectNames();
        for (IProject iProject : projects) {
        	if (!createdProjects.contains(iProject.getName())){
        		try {
					iProject.close(null);
				} catch (CoreException e) {
					MessageDialog.openInformation(window.getShell(), "Message", "Experiment NOT Started");
				}
        	}
		}
		MessageDialog.openInformation(window.getShell(), "Message", "Experiment Started");
		task.start();
		return null;
	}

	private List<String> verify(Parameter aRestriction) {
		List<String> restricNotSatisfied = new LinkedList<String>();
		for (IBundleGroupProvider provider : Platform.getBundleGroupProviders()) {
			System.out.println("provider.getName="+provider.getName());
		}
		if (aRestriction instanceof EclipseParameter){
			EclipseParameter er = (EclipseParameter)aRestriction;
			for (String bundleId : er.getForbiden()) {
				//"gr.uom.java.jdeodorant"
				Bundle b1 = Platform.getBundle(bundleId);
				if (b1 != null)
					restricNotSatisfied.add(bundleId);
			}

			for (String bundleId : er.getRequired()) {
				//"gr.uom.java.jdeodorant"
				Bundle b1 = Platform.getBundle(bundleId);
				if (b1 == null)
					restricNotSatisfied.add(bundleId);
			}
		}
		return restricNotSatisfied;
	}
}
