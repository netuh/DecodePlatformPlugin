package br.ufpe.ines.decode.plugin;

import java.net.URL;

import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import br.ufpe.ines.decode.plugin.control.loader.ExperimentManagerLoader;
import br.ufpe.ines.decode.plugin.control.loader.ExperimentSaver;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "br.ufpe.ines.decode.plugin"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

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
//		String FILE_LIST_JSON = "fileList.json";
//		String FILE_EXPORTATION_JSON = "exportation.json";
//		File file1 = context.getDataFile(FILE_LIST_JSON);
//		if (file1.exists()){
//			Gson gson = new Gson();
//			List<String> fileNames = gson.
//					fromJson(new FileReader(file1),
//							 new TypeToken<List<String>>(){}.getType());
//			if (fileNames != null) {
//				for (String fileName : fileNames) {
//					File file2 = context.getDataFile(fileName);
//					file2.delete();
//				}
//			}
//		}
//		file1.delete();
//		File file2 = context.getDataFile(FILE_EXPORTATION_JSON);
//		file2.delete();

		//COMMENT IT!

		ExperimentManagerLoader loader = new ExperimentManagerLoader(context);
		loader.loadExperimetnDescription();
		loader.loadExecutionDescription();
		plugin = this;
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
		ExperimentSaver saver = new ExperimentSaver(context);
		saver.saveExperiments();
		saver.saveExecutionExperiments();
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
}
