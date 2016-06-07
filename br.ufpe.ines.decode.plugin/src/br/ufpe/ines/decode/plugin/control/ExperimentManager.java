package br.ufpe.ines.decode.plugin.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.log4j.Logger;

import com.google.gson.Gson;

import br.ufpe.ines.decode.plugin.model.Experiment;
import br.ufpe.ines.decode.plugin.util.FileUtil;

public class ExperimentManager {
	
	protected static ExperimentManager singleton = new ExperimentManager();
	private Experiment selectedExperiment;
	static final Logger logger = Logger.getLogger(ExperimentManager.class);
	private Map<Experiment, List<File>> loadedExperiments = new HashMap<Experiment, List<File>>();
	
	public static ExperimentManager getInstance(){
		if (singleton == null)
			singleton = new ExperimentManager();
		return singleton;
	}
	
	protected ExperimentManager(){
		//Singleton
	}

	public Collection<Experiment> getExperiments() {
		return loadedExperiments.keySet();
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
		List<File> otherFiles = Arrays.asList(folderFile.listFiles());
		experimentFromFile(c.getAbsolutePath(), otherFiles);
	}
	
	private void experimentFromFile(String filePath, List<File> otherFiles){
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
		loadedExperiments.put(countryObj, otherFiles);
	}

	public File getFile(String id, String file) {
		Experiment exp = loadedExperiments.keySet().stream().filter(exp1 -> exp1.getId().equals(id)).findFirst().get();
		return loadedExperiments.get(exp).stream().filter(f -> f.getName().equals(file)).findFirst().get();
	}

}
