package br.ufpe.ines.decode.plugin.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.compress.archivers.ArchiveException;

import com.google.gson.Gson;

import br.ufpe.ines.decode.plugin.model.Experiment;
import br.ufpe.ines.decode.plugin.util.FileUtil;

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

	public void cleanExperiment() {
		loadedExperiments.clear();
	}

	public void experimentFromFile2(String filePath) throws ArchiveException, IOException {
		File f = new File (filePath);
		Path extractionFolder = FileUtil.extractZip(f);
		final File folderFile = extractionFolder.toFile();
		File c = Arrays.asList(folderFile.listFiles()).stream().filter(f2 -> f2.getName().endsWith("json")).findFirst().get();
		experimentFromFile(c.getAbsolutePath());
	}
	
	private void experimentFromFile(String filePath){
		BufferedReader br = null;
		try {
			br = new BufferedReader( new FileReader(filePath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if (br == null) {
			return;
		}
		Gson gson = new Gson();
		Experiment countryObj = gson.fromJson(br, Experiment.class);
		loadedExperiments.add(countryObj);
	}

}
