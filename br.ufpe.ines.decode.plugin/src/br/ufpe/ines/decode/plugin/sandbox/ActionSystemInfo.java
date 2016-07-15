package br.ufpe.ines.decode.plugin.sandbox;

public enum ActionSystemInfo implements ActionInterface {
	INFO_PROCESSORS("processors"), INFO_LOCALE("locale"), INFO_WS("ws"), INFO_ARCH("arch"), INFO_OS("os"), PROPERTY(
			"property");

	private String description;

	private ActionSystemInfo(String description) {
		this.description = description;
	}

	@Override
	public String getKind() {
		return "sysinfo";
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void setDescription(String newValue) {
		if (this.equals(PROPERTY))
			description = newValue;
	}
//
//	public static String[] ALL_PROPERTIES = {
//			"java.runtime.name", //$NON-NLS-1$
//			"java.runtime.version", //$NON-NLS-1$
//			"java.specification.name", //$NON-NLS-1$
//			"java.specification.vendor", //$NON-NLS-1$
//			"java.specification.version", //$NON-NLS-1$
//			"java.vendor", //$NON-NLS-1$
//			"java.version", //$NON-NLS-1$
//			"java.vm.info", //$NON-NLS-1$
//			"java.vm.name", //$NON-NLS-1$
//			"java.vm.specification.name", //$NON-NLS-1$
//			"java.vm.specification.vendor", //$NON-NLS-1$
//			"java.vm.specification.version", //$NON-NLS-1$
//			"java.vm.vendor", //$NON-NLS-1$
//			"java.vm.version" //$NON-NLS-1$
//	};
}
