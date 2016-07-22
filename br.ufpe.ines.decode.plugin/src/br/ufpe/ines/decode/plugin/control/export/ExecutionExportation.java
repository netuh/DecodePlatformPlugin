package br.ufpe.ines.decode.plugin.control.export;

import java.util.List;
import java.util.Map;
import java.util.Queue;

import br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask;
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.dataCollection.CollectedDataInterface;

public class ExecutionExportation {

	private Map<Integer, List<CollectedDataInterface>> data;
	private Queue<ExperimentalTask> lifoQueue;
	private ExperimentalTask currentTaskSet;

	public void setData(Map<Integer, List<CollectedDataInterface>> data) {
		this.data = data;
	}

	public void setTaskSequence(Queue<ExperimentalTask> lifoQueue) {
		this.lifoQueue = lifoQueue;
	}

	public void setCurrentTaskSet(ExperimentalTask currentTaskSet) {
		this.currentTaskSet = currentTaskSet;
	}

}
