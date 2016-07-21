package br.ufpe.ines.decode.plugin.epp.usagedata.extension.dataCollection;

import java.time.Instant;

import br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions.ActionInterface;

public class CollectedDataWithTime extends AtomicCollectedData {

	private String commandId;
	private String bundleId;
	private Instant instant;

	public CollectedDataWithTime(ActionInterface actionType, String commandId, String bundleId, Instant instant) {
		super(actionType);
		this.commandId = commandId;
		this.bundleId = bundleId;
		this.instant = instant;
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
