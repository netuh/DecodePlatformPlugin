package br.ufpe.ines.decode.plugin.model;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import br.ufpe.ines.decode.plugin.Activator;

public class Experiment {

	private String experimentId;

	public Experiment(String experimentId) {
		this.experimentId = experimentId;
	}

	public String getExperimentId() {
		return experimentId;
	}

	public Image getStatusImage() {
		return new Image(Display.getDefault(), Activator.class.getResourceAsStream("/icons/sample.gif"));
	}

}
