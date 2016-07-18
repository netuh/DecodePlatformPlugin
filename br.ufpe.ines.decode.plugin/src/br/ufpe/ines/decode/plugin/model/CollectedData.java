package br.ufpe.ines.decode.plugin.model;

import java.time.Instant;

import br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions.ActionInterface;

public class CollectedData {

	private ActionInterface actionType;
	private String commandId;
	private String bundleId;
	private Instant instant;
	
	public CollectedData(ActionInterface actionType, String commandId, String bundleId, Instant instant) {
		this.actionType = actionType;
		this.commandId = commandId;
		this.bundleId = bundleId;
		this.instant = instant;
	}
	
	public ActionInterface getActionType() {
		return actionType;
	}

	public void setActionType(ActionInterface actionType) {
		this.actionType = actionType;
	}

	public String getCommandId() {
		return commandId;
	}

	public void setCommandId(String commandId) {
		this.commandId = commandId;
	}

	public String getBundleId() {
		return bundleId;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public Instant getInstant() {
		return instant;
	}

	public void setInstant(Instant instant) {
		this.instant = instant;
	}

}
