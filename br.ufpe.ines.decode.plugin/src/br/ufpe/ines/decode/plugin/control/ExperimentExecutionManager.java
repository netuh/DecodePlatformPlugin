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
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.dataCollection.CollectedDataInterface;

public class ExperimentExecutionManager {

	private static ExperimentExecutionManager singleton = new ExperimentExecutionManager();
	private ExperimentalTask currentTaskSet;
	private String chooseTrack;
	private boolean started = false;
	private boolean configured = false;
	private List<UsageMonitor> activeMonitors = new LinkedList<UsageMonitor> ();
	private List<IProject> createdProject = new LinkedList<IProject> ();
	protected Queue<ExperimentalTask> lifoQueue = 
			Collections.asLifoQueue(new LinkedList<ExperimentalTask>());
	private Map<Integer, List<CollectedDataInterface>> data =
			new HashMap<Integer, List<CollectedDataInterface>>();

	protected ExperimentExecutionManager(){
		
	}
	
	public static ExperimentExecutionManager getInstance() {
		if (singleton == null)
			singleton = new ExperimentExecutionManager();
		return singleton;
	}
	
	public ExperimentalTask getCurrentTaskSet() {
		return currentTaskSet;
	}

	public void setCurrentTaskSet(ExperimentalTask currentTaskSet) {
		this.currentTaskSet = currentTaskSet;
	}

	public String getChooseTrack() {
		return chooseTrack;
	}

	public void setChooseTrack(String chooseTrack) {
		this.chooseTrack = chooseTrack;
	}

	public boolean isStarted() {
		return started;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}

	public boolean isConfigured() {
		return configured;
	}

	public void setConfigured(boolean configured) {
		this.configured = configured;
	}

	public List<UsageMonitor> getActiveMonitors() {
		return activeMonitors;
	}

	public void setActiveMonitors(List<UsageMonitor> activeMonitors) {
		this.activeMonitors = activeMonitors;
	}

	public List<IProject> getCreatedProject() {
		return createdProject;
	}

	public void setCreatedProject(List<IProject> createdProject) {
		this.createdProject = createdProject;
	}

	public Queue<ExperimentalTask> getLifoQueue() {
		return lifoQueue;
	}

	public void setLifoQueue(Queue<ExperimentalTask> lifoQueue) {
		this.lifoQueue = lifoQueue;
	}

	public Map<Integer, List<CollectedDataInterface>> getData() {
		return data;
	}

	public void setData(Map<Integer, List<CollectedDataInterface>> data) {
		this.data = data;
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

	public void addData(CollectedDataInterface aPieceOfData) {
		List<CollectedDataInterface> innerData = data.get(currentTaskSet.hashCode());
		if (innerData == null){
			innerData = new LinkedList<CollectedDataInterface>();
			data.put(currentTaskSet.hashCode(),innerData);
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
	
	public ExperimentExecutionManagerSerilizable serialize() {
		ExperimentExecutionManagerSerilizable copy = new ExperimentExecutionManagerSerilizable();
		copy.setActiveMonitors(activeMonitors);
		copy.setCurrentTaskSet(currentTaskSet);
		copy.setCreatedProject(createdProject);
		copy.setLifoQueue(lifoQueue);
		copy.setData(data);

		copy.setStarted(started);
		copy.setConfigured(started);
		
		copy.setChooseTrack(chooseTrack);
		return copy;
	}
	
	public class ExperimentExecutionManagerSerilizable extends ExperimentExecutionManager{
		
	}

	public void reload(ExperimentExecutionManagerSerilizable staff) {
		if (staff != null){
			this.setActiveMonitors(staff.getActiveMonitors());
			this.setCurrentTaskSet(staff.getCurrentTaskSet());
			this.setCreatedProject(staff.getCreatedProject());
			this.setLifoQueue(staff.getLifoQueue());
			this.setData(staff.getData());
	
			this.setStarted(staff.isStarted());
			this.setConfigured(staff.isConfigured());
			
			this.setChooseTrack(staff.getChooseTrack());
		}
	}
}
