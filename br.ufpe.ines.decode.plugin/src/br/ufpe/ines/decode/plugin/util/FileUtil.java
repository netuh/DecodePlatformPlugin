package br.ufpe.ines.decode.plugin.util;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public class FileUtil {

	public static File loadResource(String entryyPath) {
		Bundle bundle = Platform.getBundle("br.ufpe.ines.decode.plugin");
		URL fileURL = bundle.getEntry(entryyPath);
		File file = null;
		try {
		    file = new File(FileLocator.resolve(fileURL).toURI());
		} catch (URISyntaxException e1) {
		    e1.printStackTrace();
		} catch (IOException e1) {
		    e1.printStackTrace();
		}
		return  file;
	}

}
