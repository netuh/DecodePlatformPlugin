package br.ufpe.ines.decode.plugin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import br.ufpe.ines.decode.plugin.control.ExperimentExecutionManager;
import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.control.export.ExecutionExportation;
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.dataCollection.CollectedDataDeserializer;
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.dataCollection.CollectedDataInterface;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin implements IStartup {

	public static final String FILE_LIST_JSON = "fileList.json";
	public static final String FILE_EXPORTATION_JSON = "exportation.json";

	// The plug-in ID
	public static final String PLUGIN_ID = "br.ufpe.ines.decode.plugin"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private ExperimentManager manager = ExperimentManager.getInstance();
	private ExperimentExecutionManager manager2 = ExperimentExecutionManager.getInstance();
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(final BundleContext context) throws Exception {
		super.start(context);
//		File file1 = context.getDataFile(FILE_LIST_JSON);
//		file1.delete();
//		File file2 = context.getDataFile(FILE_EXPORTATION_JSON);
//		file2.delete();
		loadFiles2(context);
		plugin = this;
		//  SWTBot IDE Features	2.4.0.201604200752	org.eclipse.swtbot.ide.feature.group	Eclipse.org
		URL confURL = getBundle().getEntry("resources/log4j.properties");
		PropertyConfigurator.configure(FileLocator.toFileURL(confURL).getFile());
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
		saveFiles(context);
	}

	private void loadFiles2(final BundleContext context) throws FileNotFoundException {
		File file1 = context.getDataFile(FILE_LIST_JSON);
		if (file1.exists()){
			Gson gson = new Gson();
			List<String> fileNames = gson.
					fromJson(new FileReader(file1),
							 new TypeToken<List<String>>(){}.getType());
			System.out.println("fileNames="+fileNames);
			if (fileNames != null) {
				for (String fileName : fileNames) {
					File file2 = context.getDataFile(fileName);
					manager.loadDecodeModel(file2);
				}
			}
		}
		
		File file2 = context.getDataFile(FILE_EXPORTATION_JSON);
		if (file2.exists()){
			System.out.println("=START=");
			try (Stream<String> stream = Files.lines(file2.toPath())) {

				stream.forEach(System.out::println);

			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("=END=");
			GsonBuilder gsonBuilder = new GsonBuilder();
			gsonBuilder.registerTypeAdapter(CollectedDataInterface.class, new CollectedDataDeserializer());
			Gson gson = gsonBuilder.create();
			ExecutionExportation fileNames = gson.
					fromJson(new FileReader(file2),ExecutionExportation.class);
			if (fileNames != null)
				manager2.configure(fileNames);
		}
	}

	private void saveFiles(BundleContext context) throws IOException {
		File file1 = context.getDataFile(FILE_LIST_JSON);
		if(file1.exists()){
			file1.delete();
		}
		file1.createNewFile();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		List<String> fileNames = new LinkedList<String>();
		for (String filePath : manager.getFiles()) {
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
		FileWriter writer = new FileWriter(file1);
		String json = gson.toJson(fileNames);
		writer.write(json);
		writer.close();
		
		File file2 = context.getDataFile(FILE_EXPORTATION_JSON);
		if (!file2.exists())
			file2.createNewFile();
		ExecutionExportation ee = manager2.getExportation();
		if (ee != null) {
			writer = new FileWriter(file2);
			json = gson.toJson(ee);
			writer.write(json);
			writer.close();
		}
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	@Override
	public void earlyStartup() {
		System.out.println("aqui1");
	}
}
