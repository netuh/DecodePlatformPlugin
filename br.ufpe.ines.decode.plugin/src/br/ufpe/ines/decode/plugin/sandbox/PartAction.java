package br.ufpe.ines.decode.plugin.sandbox;

import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.IWorkbenchWindow;

public enum PartAction implements ActionInterface {
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

		public static String findEquivalent(Object element) {
			if (element instanceof IWorkbenchPart){
				IWorkbenchPartSite site = ((IWorkbenchPart)element).getSite();
				return getKind(site).getDescription();
			}
			if (element instanceof IPerspectiveDescriptor){
				return PERSPECTIVE.getDescription();
			}
			if (element instanceof IWorkbenchWindow){
				return WORKBENCH.getDescription();
			}
			
			return UNKNOWN.getDescription();
		}

		private static ELEMENT getKind(IWorkbenchPartSite site) {
			if (site instanceof IEditorSite)
				return EDITOR;
			else if (site instanceof IViewSite)
				return VIEW;
			return PART;
		}
	}

	private String kind;
	private String description;
	private PartAction(String kind) {
		this.kind = kind;
	}
	
	@Override
	public String getKind() {
		return kind;
	}

	@Override
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String element) {
		description = element;
	}
}
