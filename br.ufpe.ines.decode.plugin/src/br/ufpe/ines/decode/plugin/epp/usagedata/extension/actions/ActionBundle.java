package br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions;

import org.osgi.framework.BundleEvent;

public enum ActionBundle implements ActionInterface {
	UNKNOWN("unknown"),
	UPDATED("updated"), 
	UNRESOLVED("unresolved"),
	UNINSTALLED("uninstalled"),
	STOPPING("stopping"), 
	STOPPED("stopped"),
	STARTING("starting"),
	RESOLVED("resolved"),
	LAZY_ACTIVATION("lazy_activation"),
	INSTALLED("installed"),
	STARTED("started");

	private final String description;

	private ActionBundle(String description) {
		this.description = description;
	}

	@Override
	public String getKind() {
		return "bundle";
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public Boolean allowAddingData() {
		return true;
	}

	public static ActionInterface findAction(BundleEvent event) {
		switch (event.getType()) {
		case BundleEvent.INSTALLED: return INSTALLED;
		case BundleEvent.LAZY_ACTIVATION: return LAZY_ACTIVATION;
		case BundleEvent.RESOLVED: return RESOLVED;
		case BundleEvent.STARTED: return STARTED;
		case BundleEvent.STARTING: return STARTING;
		case BundleEvent.STOPPED: return STOPPED;
		case BundleEvent.STOPPING: return STOPPING;
		case BundleEvent.UNINSTALLED: return UNINSTALLED;
		case BundleEvent.UNRESOLVED: return UNRESOLVED;
		case BundleEvent.UPDATED: return UPDATED;
		default: return UNKNOWN;
	}
	}

}
