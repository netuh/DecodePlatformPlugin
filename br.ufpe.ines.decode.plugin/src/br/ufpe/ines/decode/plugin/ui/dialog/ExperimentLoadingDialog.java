package br.ufpe.ines.decode.plugin.ui.dialog;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.osgi.framework.Bundle;

import br.edu.ufpe.ines.decode.CodingExperiment;
import br.edu.ufpe.ines.decode.taskDescription.ModeledTask;
import br.ufpe.ines.decode.plugin.Activator;
import br.ufpe.ines.decode.plugin.control.ExperimentExecutionManager;
import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.ui.dialog.table.ExperimentContentProvider;
import br.ufpe.ines.decode.plugin.ui.dialog.table.ExperimentLabelProvider;

public class ExperimentLoadingDialog extends Dialog {

	public enum OperationMode {
		DEFAULT,
		TESTING
	};

	static final Logger logger = Logger.getLogger(ExperimentLoadingDialog.class);
	public static String[] COLUMN_NAMES = new String[] { "Experiments", "Status" };
	public static int[] COLUMN_WIDTHS = new int[] { 300, 50 };
	
	private CodingExperiment selectedExperiment;
	private ExperimentManager manager = ExperimentManager.getInstance();
	private ExperimentExecutionManager manager2 = ExperimentExecutionManager.getInstance();

	public ExperimentLoadingDialog(final Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText("Available Experiments");
		shell.setSize(400, 250);
	}

	@Override
	protected Control createDialogArea(final Composite parent) {
		final Composite body = (Composite) super.createDialogArea(parent);
		final Button buttonOpenMessage = new Button(body, SWT.PUSH);
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		final URL fullPathString = FileLocator.find(bundle, new Path("icons/ic_unarchive.png"), null);
		ImageDescriptor imageDesc = ImageDescriptor.createFromURL(fullPathString);
		Image image = imageDesc.createImage();
		buttonOpenMessage.setImage(image);
		buttonOpenMessage.setToolTipText("Load New Experiment");

		final TableViewer tableViewer = new TableViewer(body, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		Table table = tableViewer.getTable();
		GridData gd_table = new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1);
		gd_table.heightHint = 60;
		table.setLayoutData(gd_table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		for (int i = 0; i < COLUMN_NAMES.length; i++) {
			TableColumn tableColumn = new TableColumn(table, SWT.LEFT);
			tableColumn.setText(COLUMN_NAMES[i]);
			tableColumn.setWidth(COLUMN_WIDTHS[i]);
		}

		tableViewer.setContentProvider(new ExperimentContentProvider());
		tableViewer.setLabelProvider(new ExperimentLabelProvider());

		tableViewer.setInput(manager.getLoadedExperiments());
		buttonOpenMessage.addListener(SWT.Selection, e -> {
			switch (e.type) {
			case SWT.Selection:
				String selected = NativeDialogFactory.fileSelectionDialog(
		        		parent.getShell(), "Save as...", SWT.OPEN);
				try {
					//manager.experimentFromFile2(selected);
					manager.loadDecodeModel(selected);
				} catch (Exception e1) {
					logger.debug(e1.getMessage(), e1);
				}
				tableViewer.setInput(manager.getLoadedExperiments());
				break;
			}
		});
		tableViewer.addSelectionChangedListener(event -> {
			if (event.getSelection() instanceof StructuredSelection) {
				StructuredSelection selection = (StructuredSelection) event.getSelection();
				if (selection.getFirstElement() instanceof CodingExperiment)
					selectedExperiment = (CodingExperiment) selection.getFirstElement();
			}
		});
		return body;
	}
	
	@Override
	  protected void createButtonsForButtonBar(Composite parent) {
	    Button okButton = createButton(parent, IDialogConstants.OK_ID, "Select Experiment", true);
	    okButton.addListener( SWT.Selection, event -> presentSelection() );
	    createButton(parent, IDialogConstants.CANCEL_ID,
	        IDialogConstants.CANCEL_LABEL, false);
	  }
	
	protected void presentSelection(){
		if (selectedExperiment != null){
			ElementListSelectionDialog dialog = 
					  new ElementListSelectionDialog(getParentShell(), new LabelProvider());
			Map<String,ModeledTask> tasks = new HashMap<String,ModeledTask>();
			selectedExperiment.getTask().getTasks().forEach(e->tasks.put(e.getName(),e));
			dialog.setElements(tasks.keySet().toArray());
			dialog.setTitle("Which operating system are you using");
			dialog.setMessage("Choose Your Action");
			dialog.setMultipleSelection(false);
			dialog.setEmptySelectionMessage("Select at least one");
			if (dialog.open() == Window.OK){
				manager2.setCurrentActionSet(dialog.getFirstResult().toString(), tasks.get(dialog.getFirstResult()));
			}
		}
	}
}
