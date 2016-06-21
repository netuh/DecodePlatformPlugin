package br.ufpe.ines.decode.plugin.table;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.model.ConfiguredExperiment;

public class ExperimentLabelProvider  extends LabelProvider implements ITableLabelProvider {

	protected static ExperimentManager manager = ExperimentManager.getInstance();

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		if (!(element instanceof ConfiguredExperiment)) {
			return null;
		}
		ConfiguredExperiment model = (ConfiguredExperiment) element;
		switch (columnIndex) {
		case 1:
			return model.getImage();
		default:
			break;
		}
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (!(element instanceof ConfiguredExperiment)) {
			return "";
		}
		ConfiguredExperiment model = (ConfiguredExperiment) element;
		switch (columnIndex) {
		case 0:
			return model.getBasicExperiment().getId();
		default:
			break;
		}
		return "";
	}
}