package br.ufpe.ines.decode.plugin.control.handlers;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import br.ufpe.ines.decode.plugin.control.ExperimentExecutionManager;

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
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        IProject[] projects = workspaceRoot.getProjects();
        for (IProject iProject : projects) {
        	if(!manager.isCreated(iProject)){
        		try {
					iProject.close(null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
        	}
		}
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(window.getShell(), "CommandLog", "Experiment Started");
		manager.startObserving();
		return null;
	}
}
