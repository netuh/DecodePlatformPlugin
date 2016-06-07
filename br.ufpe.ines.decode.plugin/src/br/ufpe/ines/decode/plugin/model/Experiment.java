package br.ufpe.ines.decode.plugin.model;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import br.ufpe.ines.decode.plugin.Activator;

public class Experiment {

	private String experimentId;
	private String domain;
	private String language;
	private List<SourceCode> sources = new LinkedList<SourceCode>();

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

	public void addSouce(SourceCode source){
		sources.add(source);
	}
	
	public void removeSouce(SourceCode source){
		sources.remove(source);
	}

	public List<SourceCode> getSources() {
		return sources;
	}
	
}
