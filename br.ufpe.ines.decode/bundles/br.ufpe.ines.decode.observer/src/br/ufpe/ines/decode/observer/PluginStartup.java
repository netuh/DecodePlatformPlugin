package br.ufpe.ines.decode.observer;

import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IStartup;

public class PluginStartup implements IStartup {

	@Override
	public void earlyStartup() {
		Platform.getBundle(Activator.PLUGIN_ID);
	}

}
