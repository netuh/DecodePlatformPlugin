package br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions;

public enum ActionLog  implements ActionInterface {
	WHAT_ERROR("error");

	private final String description;

	private ActionLog(String description) {
		this.description = description;
	}

	@Override
	public String getKind() {
		return "log";
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public Boolean allowAddingData() {
		return true;
	}
}
