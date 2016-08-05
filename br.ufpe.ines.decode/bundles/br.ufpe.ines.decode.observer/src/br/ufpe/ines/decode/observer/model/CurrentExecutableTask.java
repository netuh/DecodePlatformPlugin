package br.ufpe.ines.decode.observer.model;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.epp.usagedata.internal.gathering.monitors.UsageMonitor;

import br.ufpe.ines.decode.decode.taskDescription.ExperimentalTask;
import br.ufpe.ines.decode.decode.taskDescription.Measurement;
import br.ufpe.ines.decode.decode.taskDescription.measurements.AnyAction;
import br.ufpe.ines.decode.decode.taskDescription.measurements.FinalTask;
import br.ufpe.ines.decode.decode.taskDescription.measurements.LogType;
import br.ufpe.ines.decode.observer.epp.usagedata.extension.UsageMonitorFactory;
import br.ufpe.ines.decode.observer.epp.usagedata.extension.data.CollectedDataInterface;

public class CurrentExecutableTask {

	private ExperimentalTask currentTask;
	private List<UsageMonitor> activeMonitors = new LinkedList<UsageMonitor>();
	private List<String> projectNames = new LinkedList<String>();
	private List<CollectedDataInterface> data = new LinkedList<CollectedDataInterface>();
	private TaskStatus status;

	public CurrentExecutableTask(ExperimentalTask task){
		currentTask = task;
		status = TaskStatus.LOADED;
	}

	public TaskStatus getStatus(){
		return status;
	}
	
	public void createdProjectsInConfiguration(List<String> projectNames){
		this.projectNames = projectNames;
	}

	public void start(){
		if (currentTask.getAllMeasument() != null){
			for (Measurement measurement : currentTask.getAllMeasument()) {
				if (measurement instanceof AnyAction) {
					AnyAction measuAnyAction = (AnyAction) measurement;
					List<LogType> actions = new LinkedList<LogType>();
					measuAnyAction.getLog().forEach(action -> actions.add(action));
					activeMonitors.addAll(UsageMonitorFactory.startAllMonitor(actions, this));
				}
				
				if (measurement instanceof FinalTask) {
					FinalTask measuFinalTask = (FinalTask) measurement;
					List<LogType> actions = new LinkedList<LogType>();
					measuFinalTask.getLog().forEach(action -> actions.add(action));
					activeMonitors.addAll(UsageMonitorFactory.startFinalTaskMonitor(actions, this));
				}
			}
		}
		status = TaskStatus.STARTED;
	}

	public List<CollectedDataInterface> finish() {
		for (UsageMonitor usageMonitor : activeMonitors) {
			usageMonitor.stopMonitoring();
		}
		status = TaskStatus.FINISHED;
		return data;
	}

	public void addData(CollectedDataInterface aPieceOfData) {
		data.add(aPieceOfData);
	}

	public ExperimentalTask getTaskModel() {
		return currentTask;
	}

	public void addProjectName(String name) {
		projectNames.add(name);
	}

	public void finishConfiguration() {
		status = TaskStatus.CONFIGURED;
	}

	public List<String> getProjectNames() {
		return projectNames;
	}
}
