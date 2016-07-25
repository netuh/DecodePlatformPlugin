package br.ufpe.ines.decode.plugin;

import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IStartup;

public class Startup1 implements IStartup {

	@Override
	public void earlyStartup() {
		Platform.getBundle(Activator.PLUGIN_ID);
	}

}
