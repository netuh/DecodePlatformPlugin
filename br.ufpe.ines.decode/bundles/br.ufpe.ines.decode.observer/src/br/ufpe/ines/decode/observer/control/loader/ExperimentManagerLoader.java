package br.ufpe.ines.decode.observer.control.loader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import org.osgi.framework.BundleContext;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import br.ufpe.ines.decode.observer.control.ExperimentExecutionManager;
import br.ufpe.ines.decode.observer.control.ExperimentManager;
import br.ufpe.ines.decode.observer.epp.usagedata.extension.data.CollectedDataInterface;
import br.ufpe.ines.decode.observer.epp.usagedata.extension.deserializer.CollectedDataDeserializer;

public class ExperimentManagerLoader {

	protected BundleContext context;
	protected static final String FILE_LIST_JSON = "fileList.json";
	protected static final String FILE_EXPORTATION_JSON = "exportation.json";

	public ExperimentManagerLoader(BundleContext context) {
		this.context = context;
	}

	public void loadExperimetnDescription() throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		Object objFromJSON = loadFromJSON(FILE_LIST_JSON,
										new Gson(),
										new TypeToken<List<String>>() {}.getType());
		if (objFromJSON != null && objFromJSON instanceof List<?>) {
			@SuppressWarnings("unchecked")
			List<String> fileNames = (List<String>) objFromJSON;
			for (String innerName : fileNames) {
				File file2 = context.getDataFile(innerName);
				ExperimentManager.getInstance().loadDecodeModel(file2);
			}
		}
	}

	private Object loadFromJSON(String fileName, Gson gson, Type type)
			throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		File file1 = context.getDataFile(fileName);
		if (file1.exists()) {
			Object fileNames = gson.fromJson(new FileReader(file1), type);
			return fileNames;
		}
		return null;
	}

	public void loadExecutionDescription() throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(CollectedDataInterface.class, new CollectedDataDeserializer());
		Gson gson = gsonBuilder.create();
		Object objFromJSON = loadFromJSON(FILE_EXPORTATION_JSON, 
										 gson,
										 ExecutionExportation.class);
		if (objFromJSON != null && objFromJSON instanceof ExecutionExportation) {
			ExecutionExportation fileNames = (ExecutionExportation) objFromJSON;
			ExperimentExecutionManager.getInstance().configure(fileNames);
		}
	}

}
