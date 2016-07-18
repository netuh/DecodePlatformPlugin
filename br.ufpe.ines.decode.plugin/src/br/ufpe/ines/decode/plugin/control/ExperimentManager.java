package br.ufpe.ines.decode.plugin.control;

import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import br.edu.ufpe.ines.decode.CodingExperiment;
import br.edu.ufpe.ines.decode.DecodePackage;

public class ExperimentManager {

	protected static ExperimentManager singleton = new ExperimentManager();
	private Set<CodingExperiment> loadedExperiments2 = new HashSet<CodingExperiment>();
	static final Logger logger = Logger.getLogger(ExperimentManager.class);
	
//	private CodingExperiment expCodingExperiment;
//	private Set<ConfiguredExperiment> loadedExperiments = new HashSet<ConfiguredExperiment>();
//	private Map<ConfiguredExperiment, List<LoggedAction>> expActions = new LinkedHashMap<ConfiguredExperiment, List<LoggedAction>>();
//	private CountDownLatch latchAction = new CountDownLatch(1);

	public static ExperimentManager getInstance() {
		if (singleton == null)
			singleton = new ExperimentManager();
		return singleton;
	}

	protected ExperimentManager() {
	}

	public Collection<CodingExperiment> getLoadedExperiments() {
		return loadedExperiments2;
	}

//	public synchronized void setSelectedExperiment(CodingExperiment exp) {
//		expCodingExperiment = exp;
//		latchAction = new CountDownLatch(1);
//	}

//	public void cleanExperiment() {
//		loadedExperiments.clear();
//		expActions.clear();
//	}
//
//	public void experimentFromFile2(String filePath) throws Exception {
//		File f = new File(filePath);
//		Path extractionFolder = FileUtil.extractZip(f);
//		final File folderFile = extractionFolder.toFile();
//		File c = Arrays.asList(folderFile.listFiles()).stream().filter(f2 -> f2.getName().endsWith("json")).findFirst()
//				.get();
//		List<File> otherFiles = Arrays.asList(folderFile.listFiles());
//		experimentFromFile(c.getAbsolutePath(), otherFiles);
//	}
//
//	private void experimentFromFile(String filePath, List<File> otherFiles) throws Exception {
//		BufferedReader br = null;
//		try {
//			br = new BufferedReader(new FileReader(filePath));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		if (br == null) {
//			return;
//		}
//		Gson gson = new Gson();
//		Experiment countryObj = gson.fromJson(br, Experiment.class);
//		final Map<String, String> contentMap = new HashMap<String, String>();
//		for (File file2 : otherFiles) {
//			String content = new String(Files.readAllBytes(file2.toPath()));
//			contentMap.put(file2.getName(), content);
//		}
//
//		ConfiguredExperiment confExp = new ConfiguredExperiment(countryObj, contentMap); 
//		loadedExperiments.add(confExp);
//
//		expActions.put(confExp, new LinkedList<LoggedAction>());
//	}
//
//	public String getDefaultFile(String file) {
//		ConfiguredExperiment exp = findSelectedExperiment();
//		return exp.getDefaultFileContent(file);
//	}
//
//	private ConfiguredExperiment findSelectedExperiment() {
//		return loadedExperiments.stream().filter(exp1 -> exp1.getStatus().equals(ExperimentStatus.IN_PROGRESS))
//				.findFirst().get();
//	}
//
//	public List<String> getLoggedActions() {
//		return expActions.get(findSelectedExperiment()).stream().map(p -> p.getFile()).collect(Collectors.toList());
//	}
//
//	public List<Instant> getLoggedTimes() {
//		return expActions.get(findSelectedExperiment()).stream().map(p -> p.getTimeStamp())
//				.collect(Collectors.toList());
//	}
//
//	public void addAction(String fileName, Instant localDateTime) {
//		LoggedAction la = new LoggedAction();
//		la.setFile(fileName);
//		la.setTimeStamp(localDateTime);
//		expActions.get(findSelectedExperiment()).add(la);
//		synchronized (localDateTime) {
//			latchAction.countDown();
//			latchAction = new CountDownLatch(1);
//		}
//	}
//
//	public void waitAction() throws InterruptedException {
//		latchAction.await();
//	}
//
//	public Set<String> getFileNames(Experiment exp) {
//		return loadedExperiments.stream().filter(exp2 -> exp2.getBasicExperiment().equals(exp)).findFirst().get()
//				.getDefaultFileNames();
//	}
//
//	public void export(String selected) throws IOException {
//		File f = new File(selected);
//		Gson gson = new GsonBuilder().setPrettyPrinting().create();
//		String json = gson.toJson(expActions.get(findSelectedExperiment()));
//		FileWriter writer = new FileWriter(f);
//		writer.write(json);
//		writer.close();
//	}
//
//	public boolean hasStarted() {
//		return loadedExperiments.stream().anyMatch(exp -> exp.getStatus().equals(ExperimentStatus.IN_PROGRESS));
//	}
//
//	public boolean hasSelected() {
//		return expCodingExperiment != null;
//		//return loadedExperiments.stream().anyMatch(exp -> exp.getStatus().equals(ExperimentStatus.IN_PROGRESS));
//	}
//
//	public String getAvailableProjectName() {
//		return findSelectedExperiment().getBasicExperiment().getId();
//	}
//
//	public String getCurrentDomain() {
//		return findSelectedExperiment().getBasicExperiment().getDomain();
//	}
//
//	public List<SourceCode> getCurrentSources() {
//		return findSelectedExperiment().getBasicExperiment().getSources();
//	}

	public void loadDecodeModel(String selected) {
		loadedExperiments2.add(load(selected));
	}
	
	protected CodingExperiment load(String filePath) {
	    ResourceSet resourceSet = new ResourceSetImpl();
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
	    		"decode", new XMIResourceFactoryImpl());
	    DecodePackage.eINSTANCE.eClass();
	    URI fileURI = URI.createFileURI(new File(filePath).getAbsolutePath());
	    Resource resource = resourceSet.getResource(fileURI, true);
	    EObject myModelObject = resource.getContents().get(0);

	    CodingExperiment myWeb = null;
	    if (myModelObject instanceof CodingExperiment) {
	    	myWeb =(CodingExperiment) myModelObject;
	    }
	    return myWeb;
	  }
}
