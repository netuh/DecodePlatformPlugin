package br.ufpe.ines.decode.plugin.dialog;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.model.Experiment;
import br.ufpe.ines.decode.plugin.table.ExperimentContentProvider;
import br.ufpe.ines.decode.plugin.table.ExperimentLabelProvider;

public class ExperimentLoadingDialog extends Dialog {

	private ExperimentManager manager = ExperimentManager.getInstance();
	public static String[] COLUMN_NAMES = new String[] { "Experiments", "Status" };
	public static int[] COLUMN_WIDTHS = new int[] { 300, 50 };
	private Experiment selectedExperiment;

	public ExperimentLoadingDialog(final Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText("Available Experiments");
		shell.setSize(400, 200);
	}

	@Override
	protected Control createDialogArea(final Composite parent) {
		final Composite body = (Composite) super.createDialogArea(parent);

		final TableViewer tableViewer = new TableViewer(body, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		Table table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		for (int i = 0; i < COLUMN_NAMES.length; i++) {
			TableColumn tableColumn = new TableColumn(table, SWT.LEFT);
			tableColumn.setText(COLUMN_NAMES[i]);
			tableColumn.setWidth(COLUMN_WIDTHS[i]);
		}

		tableViewer.setContentProvider(new ExperimentContentProvider());
		tableViewer.setLabelProvider(new ExperimentLabelProvider());

		tableViewer.setInput(manager.getExperiments());

		tableViewer.addSelectionChangedListener(event -> {
			if (event.getSelection() instanceof StructuredSelection){
				StructuredSelection selection = (StructuredSelection)event.getSelection();
				if (selection.getFirstElement() instanceof Experiment)
					selectedExperiment = (Experiment)selection.getFirstElement();
			}
		});
		return body;
	}

	public Experiment getSelectedExperiment() {
		return selectedExperiment;
	}
}
