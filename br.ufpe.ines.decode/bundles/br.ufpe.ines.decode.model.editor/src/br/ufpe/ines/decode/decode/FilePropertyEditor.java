package br.ufpe.ines.decode.decode;

import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;

public class FilePropertyEditor extends DialogCellEditor {

	public FilePropertyEditor(Composite composite) {
		super(composite);
	}

	@Override
	protected Object openDialogBox(Control cellEditorWindow) {
		FileDialog fileDialog = new FileDialog(cellEditorWindow.getShell(), SWT.OPEN);
		fileDialog.setText("Select File");
	    //fileDialog.setFilterExtensions(new String[] { "*.zip" });
	    String result = fileDialog.open();
	    return result;
	}
}