package br.ufpe.ines.decode.observer.ui.dialog.table;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import br.ufpe.ines.decode.decode.CodingExperiment;
import br.ufpe.ines.decode.observer.Activator;

public class ExperimentLabelProvider  extends LabelProvider implements ITableLabelProvider {

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		if (!(element instanceof CodingExperiment)) {
			return null;
		}
		//CodingExperiment model = (CodingExperiment) element;
		switch (columnIndex) {
		case 1:
			return new Image(Display.getDefault(), Activator.class.getResourceAsStream("/icons/ic_event_available.png"));
		default:
			break;
		}
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (!(element instanceof CodingExperiment)) {
			return "";
		}
		CodingExperiment model = (CodingExperiment) element;
		switch (columnIndex) {
		case 0:
			return model.getName();
		default:
			break;
		}
		return "";
	}
}