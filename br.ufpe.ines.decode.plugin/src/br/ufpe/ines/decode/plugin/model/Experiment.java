package br.ufpe.ines.decode.plugin.model;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import br.ufpe.ines.decode.plugin.Activator;

public class Experiment {

	private String experimentId;
	private String domain;
	private String language;

	public Experiment(String experimentId) {
		this.experimentId = experimentId;
	}
	
	public Experiment() {
	}

	public String getDomain() {
		return domain;
	}
	public String getId() {
		return experimentId;
	}
	public String getLanguage() {
		return language;
	}

	public Image getStatusImage() {
		return new Image(Display.getDefault(), Activator.class.getResourceAsStream("/icons/sample.gif"));
	}

	public void setId(String newId) {
		experimentId = newId;
	}

	public void setDomain(String newDomain) {
		domain = newDomain;
	}
	
	public void setLanguage(String newLanguage) {
		language = newLanguage;
	}

}
