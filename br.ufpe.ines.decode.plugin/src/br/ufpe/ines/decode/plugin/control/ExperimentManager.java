package br.ufpe.ines.decode.plugin.control;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import br.ufpe.ines.decode.plugin.model.Experiment;

public class ExperimentManager {
	
	protected static ExperimentManager singleton = new ExperimentManager();
	private Experiment selectedExperiment;
	
	public static ExperimentManager getInstance(){
		if (singleton == null)
			singleton = new ExperimentManager();
		return singleton;
	}
	
	private List<Experiment> loadedExperiments = new LinkedList<Experiment>();
	
	protected ExperimentManager(){
		//Singleton
	}

	public Collection<Experiment> getExperiments() {
		return loadedExperiments;
	}

	public void setSelectedExperiment(Experiment newSelectedExperiment) {
		System.out.println("set="+newSelectedExperiment);
		selectedExperiment = newSelectedExperiment;
	}
	
	public Experiment getSelectedExperiment() {
		System.out.println("selected="+selectedExperiment);
		return selectedExperiment;
	}

	public void addExperiment(String experimentId) {
		loadedExperiments.add(new Experiment(experimentId));
	}

	public void cleanExperiment() {
		loadedExperiments.clear();
	}

}
