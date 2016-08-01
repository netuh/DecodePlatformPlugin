package org.eclipse.epp.usagedata.internal.gathering.monitors;

import br.ufpe.ines.decode.plugin.epp.usagedata.extension.ObservingService;
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions.ActionStartStopTask;

public class StartFinishMonitor implements UsageMonitor {

	private ObservingService usageDataService;

	@Override
	public void startMonitoring(ObservingService usageDataService) {
		this.usageDataService = usageDataService;
		usageDataService.recordEvent(ActionStartStopTask.BEGIN);
	}

	@Override
	public void stopMonitoring() {
		usageDataService.recordEvent(ActionStartStopTask.END);
	}

}
