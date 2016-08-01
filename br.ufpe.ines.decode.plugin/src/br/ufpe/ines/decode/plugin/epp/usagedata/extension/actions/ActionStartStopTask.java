package br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions;

public enum ActionStartStopTask implements ActionInterface {
	BEGIN("Begin"),
	END("End");

	private final String description;

	private ActionStartStopTask(String description) {
		this.description = description;
	}
	
	@Override
	public String getKind() {
		return "BeginEndTask";
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
