package br.ufpe.ines.decode.plugin.control.handlers;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import br.ufpe.ines.decode.plugin.control.ExperimentExecutionManager;
import br.ufpe.ines.decode.plugin.model.CurrentExecutableTask;
import br.ufpe.ines.decode.plugin.ui.dialog.NativeDialogFactory;

public class FinishExperimentHandler  extends AbstractHandler {

	private ExperimentExecutionManager manager = ExperimentExecutionManager.getInstance();
	static final Logger logger = Logger.getLogger(StartExperimentHandler.class);

	/**
	 * The constructor.
	 */
	public FinishExperimentHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		CurrentExecutableTask nextTask = manager.finishCurrentTask();
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		if (nextTask != null) {
			MessageDialog.openInformation(window.getShell(), "Message", "Task Finished");
		} else {
			String selected = NativeDialogFactory.fileSelectionDialog(
					window.getShell(), "Save as...", SWT.SAVE);
			try {
				manager.exportData(selected);
				MessageDialog.openInformation(window.getShell(), "Message", "File correctly Exported");
			} catch (IOException e) {
				MessageDialog.openInformation(window.getShell(), "Message", "Error on Exportation");
				e.printStackTrace();
			}
		}
		return null;
	}
}
