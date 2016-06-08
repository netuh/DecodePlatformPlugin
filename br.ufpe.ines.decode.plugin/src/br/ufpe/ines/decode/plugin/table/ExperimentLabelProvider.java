package br.ufpe.ines.decode.plugin.table;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.model.Experiment;

public class ExperimentLabelProvider  extends LabelProvider implements ITableLabelProvider {

	protected static ExperimentManager manager = ExperimentManager.getInstance();

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		if (!(element instanceof Experiment)) {
			return null;
		}
		Experiment model = (Experiment) element;
		switch (columnIndex) {
		case 1:
			return manager.getImage(model);
		default:
			break;
		}
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (!(element instanceof Experiment)) {
			return "";
		}
		Experiment model = (Experiment) element;
		switch (columnIndex) {
		case 0:
			return model.getId();
		default:
			break;
		}
		return "";
	}
}