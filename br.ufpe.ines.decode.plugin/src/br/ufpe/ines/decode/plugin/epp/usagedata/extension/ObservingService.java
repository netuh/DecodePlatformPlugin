package br.ufpe.ines.decode.plugin.epp.usagedata.extension;

import java.time.Instant;
import java.util.List;

import br.edu.ufpe.ines.decode.taskDescription.measurements.LogType;
import br.ufpe.ines.decode.plugin.control.ExperimentExecutionManager;
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions.ActionInterface;
import br.ufpe.ines.decode.plugin.model.CollectedData;

public class ObservingService {

	private ExperimentExecutionManager manager = ExperimentExecutionManager.getInstance();
	private List<LogType> logType;

	public ObservingService(List<LogType> logType) {
		this.logType = logType;
	}

	public void recordEvent(ActionInterface actionType, String commandId, String bundleId) {
		for (LogType aLogType : logType) {
			if (aLogType.equals(LogType.LOG_TIME)){
				CollectedData aPieceOfData = new CollectedData (actionType, commandId, bundleId, Instant.MIN); 
				manager.addData(aPieceOfData);
			}
		}
	}

}
