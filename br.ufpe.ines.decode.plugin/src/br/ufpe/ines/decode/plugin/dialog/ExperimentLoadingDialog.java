package br.ufpe.ines.decode.plugin.dialog;

import java.net.URL;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.osgi.framework.Bundle;

import br.ufpe.ines.decode.plugin.Activator;
import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.model.Experiment;
import br.ufpe.ines.decode.plugin.table.ExperimentContentProvider;
import br.ufpe.ines.decode.plugin.table.ExperimentLabelProvider;

public class ExperimentLoadingDialog extends Dialog {

	public enum OperationMode {
		DEFAULT,
		TESTING
	};

	static final Logger logger = Logger.getLogger(ExperimentLoadingDialog.class);
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
		final Button buttonOpenMessage = new Button(body, SWT.PUSH);
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		final URL fullPathString = FileLocator.find(bundle, new Path("icons/sample.gif"), null);
		ImageDescriptor imageDesc = ImageDescriptor.createFromURL(fullPathString);
		Image image = imageDesc.createImage();
		buttonOpenMessage.setImage(image);
		buttonOpenMessage.setToolTipText("Load New Experiment");

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
		buttonOpenMessage.addListener(SWT.Selection, e -> {
			switch (e.type) {
			case SWT.Selection:
				String selected = NativeDialogFactory.fileSelectionDialog(
		        		parent.getShell(), "Save as...", SWT.OPEN);
				manager.experimentFromFile(selected);
				//manager.addExperiment("NewExperiment1");
				tableViewer.setInput(manager.getExperiments());
				break;
			}
		});

		tableViewer.addSelectionChangedListener(event -> {
			if (event.getSelection() instanceof StructuredSelection) {
				StructuredSelection selection = (StructuredSelection) event.getSelection();
				if (selection.getFirstElement() instanceof Experiment)
					selectedExperiment = (Experiment) selection.getFirstElement();
			}
		});
		return body;
	}
	
	public Experiment getSelectedExperiment() {
		return selectedExperiment;
	}
}
