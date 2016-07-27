package br.ufpe.ines.decode.plugin.control.loader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.osgi.framework.BundleContext;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.ufpe.ines.decode.plugin.control.ExperimentExecutionManager;
import br.ufpe.ines.decode.plugin.control.ExperimentManager;

public class ExperimentSaver {

	private BundleContext context;
	private Gson gson = new GsonBuilder().setPrettyPrinting().create();
	protected static final String FILE_LIST_JSON = "fileList.json";
	protected static final String FILE_EXPORTATION_JSON = "exportation.json";

	public ExperimentSaver(BundleContext context) {
		this.context = context;
	}

	public void saveExperiments() throws IOException {
		File file1 = cleanFile(FILE_LIST_JSON);
		List<String> fileNames = new LinkedList<String>();
		for (String filePath : ExperimentManager.getInstance().getFiles()) {
			File f = new File(filePath);
			File fileToCopy = context.getDataFile(f.getName());
			if (!FileUtils.contentEquals(f, fileToCopy)){
				if (fileToCopy.exists()){
					fileToCopy.delete();
					fileToCopy.createNewFile();
				}
			    FileUtils.copyFile(f, fileToCopy);
			}
		    fileNames.add(f.getName());
		}
		saveFile(file1, fileNames);
	}

	public void saveExecutionExperiments() throws IOException {
		File file2 = cleanFile(FILE_EXPORTATION_JSON);
		ExecutionExportation ee = ExperimentExecutionManager.getInstance().buildExportationData();
		if (ee != null) {
			saveFile(file2, ee);
		}
	}

	private File cleanFile(String fileName) throws IOException {
		File aFile = context.getDataFile(fileName);
		if(aFile.exists()){
			aFile.delete();
		}
		aFile.createNewFile();
		return aFile;
	}

	private void saveFile(File file2, Object ee) throws IOException {
		FileWriter writer = new FileWriter(file2);
		String json = gson.toJson(ee);
		writer.write(json);
		writer.close();
	}
}
