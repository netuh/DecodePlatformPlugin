package br.ufpe.ines.decode.plugin.control;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.eclipse.epp.usagedata.internal.gathering.monitors.UsageMonitor;

import br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask;
import br.edu.ufpe.ines.decode.taskDescription.Measurement;
import br.edu.ufpe.ines.decode.taskDescription.ModeledTask;
import br.edu.ufpe.ines.decode.taskDescription.Random;
import br.edu.ufpe.ines.decode.taskDescription.measurements.AnyAction;
import br.ufpe.ines.decode.plugin.sandbox.UsageMonitorFactory;

public class ExperimentExecutionManager {

	protected static ExperimentExecutionManager singleton = new ExperimentExecutionManager();
	private ExperimentalTask currentTaskSet;
	private boolean started = false;
	private boolean configured = false;
	private List<UsageMonitor> activeMonitors = new LinkedList<UsageMonitor> (); 
	protected Queue<ExperimentalTask> lifoQueue = Collections.asLifoQueue(new LinkedList<ExperimentalTask>());

	public static ExperimentExecutionManager getInstance() {
		if (singleton == null)
			singleton = new ExperimentExecutionManager();
		return singleton;
	}

	public void setCurrentActionSet(ModeledTask modeledTask) {
		findTask(modeledTask);
		currentTaskSet = lifoQueue.poll();
	}
	
	private void findTask (ModeledTask task){
		if (task instanceof ExperimentalTask){
			lifoQueue.add((ExperimentalTask)task);
		}
		if (task instanceof Random){
			Random taskRandom = (Random)task;
			taskRandom.getTasks().forEach(aTask -> findTask(aTask));
		}
	}

	public ExperimentalTask getCurrentTask() {
		return currentTaskSet;
	}
	
	private void nextAtomicTask() {
		currentTaskSet = lifoQueue.poll();
		//return currentTaskSet;
	}

	public boolean hasSelected() {
		return currentTaskSet != null;
	}

	public boolean hasStarted() {
		return started;
	}

	public void startObserving() {
		for (Measurement measurement : currentTaskSet.getMeasurements()) {
			if (measurement instanceof AnyAction){
				//AnyAction measuAnyAction = (AnyAction)measurement;
				
				activeMonitors.addAll(UsageMonitorFactory.startAllMonitor());
			}
		}
		started = true;
	}

	public void setConfigured() {
		configured = true;
	}

	public boolean hasConfirured() {
		return configured;
	}

	public void stopObserving() {
		for (UsageMonitor usageMonitor : activeMonitors) {
			usageMonitor.stopMonitoring();
		}
		activeMonitors.clear();
	}

	public void finishCurrentTask() {
		stopObserving();
		nextAtomicTask();
		started = false;
		configured = false;
	}

}
