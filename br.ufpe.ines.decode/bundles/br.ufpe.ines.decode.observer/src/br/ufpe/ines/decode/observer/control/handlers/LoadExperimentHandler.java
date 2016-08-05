package br.ufpe.ines.decode.observer.control.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import br.ufpe.ines.decode.observer.ui.dialog.ExperimentLoadingDialog;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class LoadExperimentHandler extends AbstractHandler {

	/**
	 * The constructor.
	 */
	public LoadExperimentHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		//List<IVersionedId> ids = new LinkedList<IVersionedId>();
		//gr.uom.java.jdeodorant;bundle-version="5.0.60"
		//ids.add(new VersionedId("gr.uom.java.jdeodorant","5.0.60"));

		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		Shell shell = window.getShell();
		ExperimentLoadingDialog dialog = new ExperimentLoadingDialog(shell);
		dialog.open();
		return null;
	}
}
