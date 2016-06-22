package br.ufpe.ines.decode.plugin.handlers;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.dialog.NativeDialogFactory;

public class FinishExperimentHandler  extends AbstractHandler {

	private ExperimentManager manager = ExperimentManager.getInstance();
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
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		String selected = NativeDialogFactory.fileSelectionDialog(
				window.getShell(), "Save as...", SWT.OPEN);
		try {
			if (selected != null)
				manager.export(selected);
		} catch (IOException e) {
			e.printStackTrace();
			MessageDialog.openInformation(window.getShell(), "CommandLog", "Experiment NOT Created");
		}
		MessageDialog.openInformation(window.getShell(), "CommandLog", "Experiment Finished");
		return null;
	}
}
