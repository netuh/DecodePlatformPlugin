package br.ufpe.ines.decode.plugin.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.log4j.Logger;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import com.google.gson.Gson;

import br.ufpe.ines.decode.plugin.Activator;
import br.ufpe.ines.decode.plugin.model.Experiment;
import br.ufpe.ines.decode.plugin.util.FileUtil;

public class ExperimentManager {
	
	protected static ExperimentManager singleton = new ExperimentManager();
	private Experiment selectedExperiment;
	static final Logger logger = Logger.getLogger(ExperimentManager.class);
	private Map<Experiment, List<File>> loadedExperiments = new HashMap<Experiment, List<File>>();
	private Map<Experiment, List<String>> expActions = new LinkedHashMap<Experiment, List<String>>();
	private Map<Experiment, List<LocalDateTime>> expActionTimes = new LinkedHashMap<Experiment, List<LocalDateTime>>();
	
	private CountDownLatch latch = new CountDownLatch(1);
	
	public static ExperimentManager getInstance(){
		if (singleton == null)
			singleton = new ExperimentManager();
		return singleton;
	}
	
	protected ExperimentManager(){
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
		expActions.put(countryObj, new LinkedList<String>());
		expActionTimes.put(countryObj, new LinkedList<LocalDateTime>());
	}

	public File getFile(String id, String file) {
		Experiment exp = loadedExperiments.keySet().stream().filter(exp1 -> exp1.getId().equals(id)).findFirst().get();
		return loadedExperiments.get(exp).stream().filter(f -> f.getName().equals(file)).findFirst().get();
	}

	public Image getImage(Experiment exp) {
		return new Image(Display.getDefault(), Activator.class.getResourceAsStream("/icons/sample.gif"));
	}

	public String getStatus(Experiment exp) {
		if (exp.equals(selectedExperiment))
			return "Selected";
		return "Ok";
	}

	public List<String> getLoggedActions(Experiment exp) {
		return expActions.get(exp);
	}
	
	public List<LocalDateTime> getLoggedTimes(Experiment exp) {
		return expActionTimes.get(exp);
	}

	public void addAction(Experiment exp, String fileName, LocalDateTime localDateTime) {
		logger.debug("added in exp="+exp.getId());
		logger.debug("added file="+fileName);
		expActions.get(exp).add(fileName);
		expActionTimes.get(exp).add(localDateTime);
		latch.countDown();
		latch = new CountDownLatch(1);
	}
	
	public void waitUntilUpdateIsCalled() throws InterruptedException {
		logger.debug("wait111");
        latch.await();
    }

	public List<File> getFiles(Experiment exp) {
		return loadedExperiments.get(exp);
	}

}
