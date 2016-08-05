package br.ufpe.ines.decode.observer.epp.usagedata.extension.actions;

import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.IWorkbenchWindow;

public enum ActionPart implements ActionInterface {
	DEACTIVATED("deactivated"),
	ACTIVATED("activated"),
	CLOSED("closed"),
	OPENED("opened");
	
	public enum ELEMENT {
		WORKBENCH("workbench"),
		PERSPECTIVE("perspective"),
		PART("part"),
		VIEW("view"),
		EDITOR("editor"),
		UNKNOWN("unknown");

		private String description;
		private ELEMENT(String description) {
			this.description = description;
		}

		public String getDescription() {
			return description; 
	    }
	}

	private String description;
	private String kind;
	private ActionPart(String description) {
		this.description = description;
	}
	
	@Override
	public String getKind() {
		return kind;
	}

	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public Boolean allowAddingData() {
		return true;
	}
	
	public String findKind(Object element) {
		if (element instanceof IWorkbenchPart){
			IWorkbenchPartSite site = ((IWorkbenchPart)element).getSite();
			return getKind(site).getDescription();
		}
		if (element instanceof IPerspectiveDescriptor){
			return ELEMENT.PERSPECTIVE.getDescription();
		}
		if (element instanceof IWorkbenchWindow){
			return ELEMENT.WORKBENCH.getDescription();
		}
		
		return ELEMENT.UNKNOWN.getDescription();
	}

	private static ELEMENT getKind(IWorkbenchPartSite site) {
		if (site instanceof IEditorSite)
			return ELEMENT.EDITOR;
		else if (site instanceof IViewSite)
			return ELEMENT.VIEW;
		return ELEMENT.PART;
	}
}
