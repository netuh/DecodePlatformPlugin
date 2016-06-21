package br.ufpe.ines.decode.plugin.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.ufpe.ines.decode.plugin.model.ConfiguredExperiment;
import br.ufpe.ines.decode.plugin.model.ConfiguredExperiment.ExperimentStatus;
import br.ufpe.ines.decode.plugin.model.Experiment;
import br.ufpe.ines.decode.plugin.model.LoggedAction;
import br.ufpe.ines.decode.plugin.model.SourceCode;
import br.ufpe.ines.decode.plugin.util.FileUtil;

public class ExperimentManager {

	protected static ExperimentManager singleton = new ExperimentManager();

	private Experiment selectedExperiment;
	private ConfiguredExperiment selectedExperiment2;
	private Experiment currentRunning;
	private Set<ConfiguredExperiment> loadedExperiments = new HashSet<ConfiguredExperiment>();
	private Map<Experiment, List<LoggedAction>> expActions = new LinkedHashMap<Experiment, List<LoggedAction>>();

	private CountDownLatch latchAction = new CountDownLatch(1);

	public static ExperimentManager getInstance() {
		if (singleton == null)
			singleton = new ExperimentManager();
		return singleton;
	}

	protected ExperimentManager() {
	}

	public Collection<ConfiguredExperiment> getLoadedExperiments() {
		return loadedExperiments;
	}

	public synchronized void setSelectedExperiment(ConfiguredExperiment exp) {
		selectedExperiment = exp.getBasicExperiment();
		selectedExperiment2 = exp;
		latchAction = new CountDownLatch(1);
	}
//
//	public Experiment getSelectedExperiment() {
//		return selectedExperiment;
//	}

	public void cleanExperiment() {
		loadedExperiments.clear();
		expActions.clear();
		selectedExperiment = null;
		currentRunning = null;
	}

	public void experimentFromFile2(String filePath) throws Exception {
		File f = new File(filePath);
		Path extractionFolder = FileUtil.extractZip(f);
		final File folderFile = extractionFolder.toFile();
		File c = Arrays.asList(folderFile.listFiles()).stream().filter(f2 -> f2.getName().endsWith("json")).findFirst()
				.get();
		List<File> otherFiles = Arrays.asList(folderFile.listFiles());
		experimentFromFile(c.getAbsolutePath(), otherFiles);
	}

	private void experimentFromFile(String filePath, List<File> otherFiles) throws Exception {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filePath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if (br == null) {
			return;
		}
		Gson gson = new Gson();
		Experiment countryObj = gson.fromJson(br, Experiment.class);
		final Map<String, String> contentMap = new HashMap<String, String>();
		for (File file2 : otherFiles) {
			String content = new String(Files.readAllBytes(file2.toPath()));
			contentMap.put(file2.getName(), content);
		}

		loadedExperiments.add(new ConfiguredExperiment(countryObj, contentMap));

		expActions.put(countryObj, new LinkedList<LoggedAction>());
	}

	public String getDefaultFile(String file) {
//		ConfiguredExperiment exp = loadedExperiments.stream()
//				.filter(exp1 -> exp1.getBasicExperiment().getId().equals(id)).findFirst().get();
		return selectedExperiment2.getDefaultFileContent(file);
	}

	public List<String> getLoggedActions() {
		return expActions.get(selectedExperiment).stream().map(p -> p.getFile()).collect(Collectors.toList());
	}

	public List<Instant> getLoggedTimes() {
		return expActions.get(selectedExperiment).stream().map(p -> p.getTimeStamp()).collect(Collectors.toList());
	}

	public void addAction(String fileName, Instant localDateTime) {
		LoggedAction la = new LoggedAction();
		la.setFile(fileName);
		la.setTimeStamp(localDateTime);
		expActions.get(selectedExperiment).add(la);
		synchronized (localDateTime) {
			latchAction.countDown();
			latchAction = new CountDownLatch(1);
		}
	}

	public void waitAction() throws InterruptedException {
		latchAction.await();
	}

	public Set<String> getFileNames(Experiment exp) {
		return loadedExperiments.stream().filter(exp2 -> exp2.getBasicExperiment().equals(exp)).findFirst().get()
				.getDefaultFileNames();
	}

	public void startSelected(String projectName) {
		currentRunning = selectedExperiment;
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

	public boolean hasStarted() {
		return loadedExperiments.stream().anyMatch(exp -> exp.getStatus().equals(ExperimentStatus.IN_PROGRESS));
	}

	public boolean hasSelected() {
		return loadedExperiments.stream().anyMatch(exp -> exp.getStatus().equals(ExperimentStatus.IN_PROGRESS));
	}

	public String getAvailableProjectName() {
		return selectedExperiment.getId();
	}

	public String getCurrentDomain() {
		return selectedExperiment.getDomain();
	}

	public List<SourceCode> getCurrentSources() {
		return selectedExperiment.getSources();
	}
}
