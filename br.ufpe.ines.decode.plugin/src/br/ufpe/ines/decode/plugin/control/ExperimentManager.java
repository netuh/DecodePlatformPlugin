package br.ufpe.ines.decode.plugin.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
import java.util.stream.Collectors;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.log4j.Logger;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.ufpe.ines.decode.plugin.Activator;
import br.ufpe.ines.decode.plugin.model.Experiment;
import br.ufpe.ines.decode.plugin.model.LoggedAction;
import br.ufpe.ines.decode.plugin.util.FileUtil;

public class ExperimentManager {
	
	protected static ExperimentManager singleton = new ExperimentManager();
	private static final Logger logger = Logger.getLogger(ExperimentManager.class);

	private Experiment selectedExperiment;
	private Experiment currentRunning;
	private Map<Experiment, List<File>> loadedExperiments = new HashMap<Experiment, List<File>>();
	private Map<Experiment, String> configurationExperiments = new HashMap<Experiment, String>();
	private Map<Experiment, List<LoggedAction>> expActions = new LinkedHashMap<Experiment, List<LoggedAction>>();

	private CountDownLatch latchAction = new CountDownLatch(1);
	
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

	public synchronized void setSelectedExperiment(Experiment newSelectedExperiment) {
		selectedExperiment = newSelectedExperiment;
		latchAction = new CountDownLatch(1);
	}
	
	public Experiment getSelectedExperiment() {
		return selectedExperiment;
	}

	public void cleanExperiment() {
		loadedExperiments.clear();
		expActions.clear();
		selectedExperiment = null;
		currentRunning = null;
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
		logger.debug("Experiment to add="+countryObj.getId());
		logger.debug("contains="+loadedExperiments.keySet().contains(countryObj));
		loadedExperiments.keySet().stream().forEach(exp -> logger.debug("Experiments in Set="+exp.getId()));
		loadedExperiments.put(countryObj, otherFiles);
		expActions.put(countryObj, new LinkedList<LoggedAction>());
	}

	public File getDefaultFile(String id, String file) {
		Experiment exp = loadedExperiments.keySet().stream()
				.filter(exp1 -> exp1.getId().equals(id))
				.findFirst().get();
		return loadedExperiments.get(exp).stream()
				.filter(f -> f.getName().equals(file))
				.findFirst().get();
	}

	public Image getImage(Experiment exp) {
		return new Image(Display.getDefault(), Activator.class.getResourceAsStream("/icons/sample.gif"));
	}

	public String getStatus(Experiment exp) {
		if (exp == null)
			return "ERROR";
		if (exp.equals(currentRunning))
			return "Started";
		if (exp.equals(selectedExperiment))
			return "Selected";
		return "Ok";
	}

	public List<String> getLoggedActions(Experiment exp) {
		return expActions.get(exp).stream().map(p -> p.getFile()).collect(Collectors.toList());
	}
	
	public List<LocalDateTime> getLoggedTimes(Experiment exp) {
		List<LocalDateTime> list1 = expActions.get(exp).stream().map(p -> p.getTimeStamp()).collect(Collectors.toList());
		List<String> list2 = expActions.get(exp).stream().map(p -> p.getFile()).collect(Collectors.toList());
		logger.debug("list1 size="+list1.size());
		logger.debug("list2 size="+list2.size());
		return expActions.get(exp).stream().map(p -> p.getTimeStamp()).collect(Collectors.toList());
	}

	public void addAction(Experiment exp, String fileName, LocalDateTime localDateTime) {
		LoggedAction la = new LoggedAction();
		la.setFile(fileName);
		la.setTimeStamp(localDateTime);
		expActions.get(exp).add(la);
		synchronized (localDateTime) {
			latchAction.countDown();
			latchAction = new CountDownLatch(1);
		}
	}
	
	public void waitAction() throws InterruptedException {
        latchAction.await();
    }

	public List<File> getFiles(Experiment exp) {
		return loadedExperiments.get(exp);
	}

	public void startSelected(String projectName) {
		currentRunning = selectedExperiment;
		configurationExperiments.put(selectedExperiment, projectName);
	}

	public void export(String selected) throws IOException {
		File f = new File(selected);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(expActions.get(currentRunning));
		FileWriter writer = new FileWriter(f);
		writer.write(json);
		writer.close();
		selectedExperiment = null;
		currentRunning = null;
	}

}
