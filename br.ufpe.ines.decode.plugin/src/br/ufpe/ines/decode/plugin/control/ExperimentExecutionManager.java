package br.ufpe.ines.decode.plugin.control;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import org.eclipse.core.resources.IProject;
import org.eclipse.epp.usagedata.internal.gathering.monitors.UsageMonitor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask;
import br.edu.ufpe.ines.decode.taskDescription.Measurement;
import br.edu.ufpe.ines.decode.taskDescription.ModeledTask;
import br.edu.ufpe.ines.decode.taskDescription.Random;
import br.edu.ufpe.ines.decode.taskDescription.measurements.AnyAction;
import br.edu.ufpe.ines.decode.taskDescription.measurements.LogType;
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.UsageMonitorFactory;
import br.ufpe.ines.decode.plugin.model.CollectedData;

public class ExperimentExecutionManager {

	private static ExperimentExecutionManager singleton = new ExperimentExecutionManager();
	private ExperimentalTask currentTaskSet;
	private String chooseTrack;
	private boolean started = false;
	private boolean configured = false;
	private List<UsageMonitor> activeMonitors = new LinkedList<UsageMonitor> ();
	private List<IProject> createdProject = new LinkedList<IProject> ();
	protected Queue<ExperimentalTask> lifoQueue = Collections.asLifoQueue(new LinkedList<ExperimentalTask>());
	private Map<ExperimentalTask, List<CollectedData>> data = new HashMap<ExperimentalTask, List<CollectedData>>();

	public static ExperimentExecutionManager getInstance() {
		if (singleton == null)
			singleton = new ExperimentExecutionManager();
		return singleton;
	}

	public void setCurrentActionSet(String taskTrack, ModeledTask modeledTask) {
		chooseTrack = taskTrack;
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
				AnyAction measuAnyAction = (AnyAction)measurement;
				List<LogType> actions = new LinkedList<LogType>(); 
				measuAnyAction.getLog().forEach(action -> actions.add(action));
				activeMonitors.addAll(UsageMonitorFactory.startAllMonitor(actions));
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

		createdProject.clear();
		started = false;
		configured = false;
	}

	public void addData(CollectedData aPieceOfData) {
		List<CollectedData> innerData = data.get(currentTaskSet);
		if (innerData == null){
			innerData = new LinkedList<CollectedData>();
			data.put(currentTaskSet,innerData);
		}
		innerData.add(aPieceOfData);
	}

	public void exportData(String selected) throws IOException {
		File f = new File(selected);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Map <String, Object> identiData = new HashMap<String, Object>();
		identiData.put(chooseTrack, data);
		String json = gson.toJson(identiData);
		FileWriter writer = new FileWriter(f);
		writer.write(json);
		writer.close();
	}

	public void addCreatedProject(IProject project) {
		createdProject.add(project);
	}

	public boolean isCreated(IProject iProject) {
		return createdProject.contains(iProject);
	}

}
