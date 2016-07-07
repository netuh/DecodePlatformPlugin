package be.edu.ufpe.ines.decode.sheetpage;

import java.util.List;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.ui.IActionBars;

import be.edu.ufpe.ines.decode.presentation.DecodeEditor;

public class MyPropertySheetPage extends ExtendedPropertySheetPage{

	private DecodeEditor editor;

	public MyPropertySheetPage(AdapterFactoryEditingDomain editingDomain, DecodeEditor editor) {
		super(editingDomain);
		this.editor = editor;
	}
	
	@Override
	public void setSelectionToViewer(List<?> selection) {
		editor.setSelectionToViewer(selection);
		editor.setFocus();
		System.out.println("aqui11!!!");
	}

	@Override
	public void setActionBars(IActionBars actionBars) {
		super.setActionBars(actionBars);
		editor.getActionBarContributor().shareGlobalActions(this, actionBars);
		System.out.println("aqui22!!!");
	}

	
}
