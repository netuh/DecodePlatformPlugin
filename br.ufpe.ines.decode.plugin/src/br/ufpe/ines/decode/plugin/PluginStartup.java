package br.ufpe.ines.decode.plugin;

import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IStartup;

public class PluginStartup implements IStartup {

	@Override
	public void earlyStartup() {
		Platform.getBundle(Activator.PLUGIN_ID);
		System.out.println("coisas");
	}

}
