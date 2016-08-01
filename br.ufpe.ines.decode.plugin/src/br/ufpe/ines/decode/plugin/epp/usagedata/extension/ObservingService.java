package br.ufpe.ines.decode.plugin.epp.usagedata.extension;

import java.time.Instant;
import java.util.List;

import br.edu.ufpe.ines.decode.taskDescription.measurements.LogType;
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions.ActionInterface;
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.dataCollection.AtomicCollectedData;
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.dataCollection.CollectedDataWithTime;
import br.ufpe.ines.decode.plugin.model.CurrentExecutableTask;

public class ObservingService {

	private List<LogType> whatToObsereve;
	private CurrentExecutableTask task;

	public ObservingService(List<LogType> logType, CurrentExecutableTask task) {
		this.whatToObsereve = logType;
		this.task = task;
	}

	public void recordEvent(ActionInterface actionType, String... data) {
		if (!actionType.allowAddingData()){
			AtomicCollectedData aPieceOfData = new AtomicCollectedData(actionType, data);
			task.addData(aPieceOfData);
			return;
		}
		
		
		for (LogType aLogType : whatToObsereve) {
			if (aLogType.equals(LogType.LOG_TIME)){
				CollectedDataWithTime aPieceOfData = new CollectedDataWithTime (actionType, Instant.MIN, data); 
				task.addData(aPieceOfData);
			}
		}
	}
}
