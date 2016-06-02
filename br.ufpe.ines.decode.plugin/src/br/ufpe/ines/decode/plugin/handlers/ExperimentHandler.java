package br.ufpe.ines.decode.plugin.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.dialog.ExperimentLoadingDialog;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ExperimentHandler extends AbstractHandler {

	private ExperimentManager manager = ExperimentManager.getInstance();

	/**
	 * The constructor.
	 */
	public ExperimentHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		Shell shell = window.getShell();
		ExperimentLoadingDialog dialog = new ExperimentLoadingDialog(shell);

		if (dialog.open() == Window.OK) {
			manager.setSelectedExperiment(dialog.getSelectedExperiment());
		}
		return null;
	}
}
