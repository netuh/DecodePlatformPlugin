package br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions;

public enum ActionCommand implements ActionInterface{
	EXECUTED("executed"),
	FAILED("failed"),
	NO_HANDLER("no handler");

	private final String description;
	private ActionCommand(String description) {
	    this.description = description;
	}

	@Override
	public String getKind() {
		return "Command";
	}

	@Override
	public String getDescription() {
		return description;
	}
//	BUNDLE,
//	KIND_LOG,
//	WORKBENCH,
//	PERSPECTIVE,
//	EDITOR,
//	VIEW,
//	PART,
//	SYSINFO;
}
