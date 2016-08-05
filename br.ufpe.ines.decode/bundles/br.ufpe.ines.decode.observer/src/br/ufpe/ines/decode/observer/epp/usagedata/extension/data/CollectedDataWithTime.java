package br.ufpe.ines.decode.observer.epp.usagedata.extension.data;

import java.time.Instant;

import br.ufpe.ines.decode.observer.epp.usagedata.extension.actions.ActionInterface;

public class CollectedDataWithTime extends AtomicCollectedData {

	private Instant instant;

	public CollectedDataWithTime(ActionInterface actionType, Instant min, String[] data) {
		super(actionType, data);
		this.instant = min;
	}

	public Instant getInstant() {
		return instant;
	}

	public void setInstant(Instant instant) {
		this.instant = instant;
	}

}
