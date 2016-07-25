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
import java.util.stream.Collectors;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.epp.usagedata.internal.gathering.monitors.UsageMonitor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.edu.ufpe.ines.decode.CodingExperiment;
import br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask;
import br.edu.ufpe.ines.decode.taskDescription.Measurement;
import br.edu.ufpe.ines.decode.taskDescription.ModeledTask;
import br.edu.ufpe.ines.decode.taskDescription.Random;
import br.edu.ufpe.ines.decode.taskDescription.measurements.AnyAction;
import br.edu.ufpe.ines.decode.taskDescription.measurements.LogType;
import br.ufpe.ines.decode.plugin.control.export.ExecutionExportation;
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.UsageMonitorFactory;
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.dataCollection.CollectedDataInterface;

public class ExperimentExecutionManager {

	private static ExperimentExecutionManager singleton = new ExperimentExecutionManager();
	
	private ExperimentManager manager = ExperimentManager.getInstance();
	
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

	private String experimentId;

	protected ExperimentExecutionManager(){
		
	}
	
	public static ExperimentExecutionManager getInstance() {
		if (singleton == null)
			singleton = new ExperimentExecutionManager();
		return singleton;
	}

	public void setCurrentActionSet(String experimentId, String taskTrack, ModeledTask modeledTask) {
		chooseTrack = taskTrack;
		this.experimentId = experimentId;
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
	
	public ExecutionExportation getExportation(){
		if (currentTaskSet == null){
			return null;
		}
		ExecutionExportation ee = new ExecutionExportation();
		ee.setExperimentID(experimentId);
		ee.setChooseTrack(chooseTrack);
		ee.setData(data);
		List<String> ids =  lifoQueue.stream()
                .map(ExperimentalTask::getElementId).collect(Collectors.toList());
		ee.setTaskOrder(ids);
		List<String> projectIds =  createdProject.stream()
                .map(IProject::getName).collect(Collectors.toList());
		ee.setProjectIds(projectIds);
		ee.setTaskId(currentTaskSet.getElementId());
		return ee;
	}

	public void configure(ExecutionExportation fileNames) {
		data = fileNames.getData();
		experimentId = fileNames.getExperimentID();
		chooseTrack = fileNames.getChooseTrack();
		
		for (String projectName : fileNames.getProjectIds()) {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IProject project = root.getProject(projectName);
			createdProject.add(project);
			configured = true;
		}
		CodingExperiment ce =manager.getLoadedExperiment(fileNames.getExperimentID());
		String taskName = fileNames.getTaskId();
		System.out.println("fileNames.getChooseTrack()="+fileNames.getChooseTrack());
		ModeledTask task = ce.getTask().getTasks().stream()
					.filter(e -> e.getName().equals(fileNames.getChooseTrack())).findFirst().get();
		System.out.println("task="+task);
		currentTaskSet = (ExperimentalTask) findTask(task, taskName);
		System.out.println("currentTaskSet="+currentTaskSet);
		for (String taskId : fileNames.getTaskOrder()) {
			ExperimentalTask aTask = (ExperimentalTask) findTask(task, taskId);
			lifoQueue.add(aTask);
		}
		started = false;
	}

	private ModeledTask findTask(ModeledTask task, String taskName) {
		System.out.println("taskName="+taskName);
		if (task instanceof ExperimentalTask){
			ExperimentalTask randomTask = (ExperimentalTask)task;
			System.out.println("ExperimentalTask="+randomTask.getName());
			System.out.println("ExperimentalTask="+randomTask.getElementId());
		}
		if (task.getElementId().equals(taskName)){
			return task; 
		}
		if (task instanceof Random){
			Random randomTask = (Random)task;
			System.out.println("randomTask="+randomTask.getName());
			System.out.println("randomTask Size="+randomTask.getTasks().size());
			for (ModeledTask innerTask : randomTask.getTasks()) {
				ModeledTask taskReturn = findTask(innerTask, taskName);
				if (taskReturn != null)
					return taskReturn; 
			}
		}
		return null;
	}

}
