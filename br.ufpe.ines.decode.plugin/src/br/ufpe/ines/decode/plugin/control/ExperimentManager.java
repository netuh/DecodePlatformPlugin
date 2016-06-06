package br.ufpe.ines.decode.plugin.control;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;

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
		selectedExperiment = newSelectedExperiment;
	}
	
	public Experiment getSelectedExperiment() {
		return selectedExperiment;
	}

	public void addExperiment(String experimentId) {
		loadedExperiments.add(new Experiment(experimentId));
	}

	public void cleanExperiment() {
		loadedExperiments.clear();
	}

	public void experimentFromFile(String filePath) {
		
		System.out.println("name333333"+filePath);
		BufferedReader br = null;
		try {
			br = new BufferedReader( new FileReader(filePath));
		} catch (FileNotFoundException e) {
			System.out.println("deu erro, oh");
			e.printStackTrace();
		}
		if (br == null) {
			System.out.println("NULLLLL");
			return;
		}
		Gson gson = new Gson();
		System.out.println("NOT NULLLLL1");
		Experiment countryObj = gson.fromJson(br, Experiment.class);
		System.out.println("NOT NULLLLL2");
		System.out.println("Experiment Id="+countryObj.getId());
		loadedExperiments.add(countryObj);
	}

}
