package br.ufpe.ines.decode.plugin.control;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.edu.ufpe.ines.decode.CodingExperiment;
import br.edu.ufpe.ines.decode.artifacts.JavaProject;
import br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask;
import br.edu.ufpe.ines.decode.taskDescription.ModeledTask;
import br.edu.ufpe.ines.decode.taskDescription.Random;
import br.ufpe.ines.decode.plugin.control.loader.ExecutionExportation;
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.dataCollection.CollectedDataInterface;
import br.ufpe.ines.decode.plugin.model.CurrentExecutableTask;
import br.ufpe.ines.decode.plugin.model.TaskStatus;

public class ExperimentExecutionManager {

	private static ExperimentExecutionManager singleton = new ExperimentExecutionManager();

	private ExperimentManager manager = ExperimentManager.getInstance();

	private String chooseTrack;
	private CodingExperiment experiment;

	private CurrentExecutableTask task;
	private Queue<String> lifoQueue = Collections.asLifoQueue(new LinkedList<String>());
	private Map<String, List<CollectedDataInterface>> data = new HashMap<String, List<CollectedDataInterface>>();

	protected ExperimentExecutionManager() {

	}

	public static ExperimentExecutionManager getInstance() {
		if (singleton == null)
			singleton = new ExperimentExecutionManager();
		return singleton;
	}
//
//	public void setCurrentActionSet(String experimentId, String taskTrack, ModeledTask modeledTask) {
//		chooseTrack = taskTrack;
//		this.experimentId = experimentId;
//		data.clear();
//		createdProject.clear();
//		activeMonitors.clear();
//		findTask(modeledTask);
//		currentTaskSet = lifoQueue.poll();
//	}
//
//	private void findTask(ModeledTask task) {
//		if (task instanceof ExperimentalTask) {
//			lifoQueue.add((ExperimentalTask) task);
//		}
//		if (task instanceof Random) {
//			Random taskRandom = (Random) task;
//			EList<ModeledTask> taskSet = taskRandom.getTasks();
//			Collections.shuffle(taskSet);
//			taskSet.forEach(aTask -> findTask(aTask));
//		}
//	}
//
//	public ExperimentalTask getCurrentTask() {
//		return currentTaskSet;
//	}
//
//	private void nextAtomicTask() {
//		currentTaskSet = lifoQueue.poll();
//	}
//
//	public boolean hasSelected() {
//		return currentTaskSet != null;
//	}
//
//	public boolean hasStarted() {
//		return started;
//	}
//
//	public void startObserving() {
//		for (Measurement measurement : currentTaskSet.getMeasurements()) {
//			if (measurement instanceof AnyAction) {
//				AnyAction measuAnyAction = (AnyAction) measurement;
//				List<LogType> actions = new LinkedList<LogType>();
//				measuAnyAction.getLog().forEach(action -> actions.add(action));
//				activeMonitors.addAll(UsageMonitorFactory.startAllMonitor(actions, null));
//			}
//		}
//		started = true;
//	}
//
//	public void setConfigured() {
//		configured = true;
//	}
//
//	public boolean hasConfirured() {
//		return configured;
//	}
//
//	public void stopObserving() {
//		for (UsageMonitor usageMonitor : activeMonitors) {
//			usageMonitor.stopMonitoring();
//		}
//		activeMonitors.clear();
//	}
//
//	public void finishCurrentTask() {
//		stopObserving();
//		nextAtomicTask();
//
//		createdProject.clear();
//		started = false;
//		configured = false;
//	}
//
//	public void addData(CollectedDataInterface aPieceOfData) {
//		List<CollectedDataInterface> innerData = data.get(currentTaskSet.getElementId());
//		if (innerData == null) {
//			innerData = new LinkedList<CollectedDataInterface>();
//			data.put(currentTaskSet.getElementId(), innerData);
//		}
//		innerData.add(aPieceOfData);
//	}
//
//	public void exportData(String selected) throws IOException {
//		File f = new File(selected);
//		Gson gson = new GsonBuilder().setPrettyPrinting().create();
//		Map<String, Object> identiData = new HashMap<String, Object>();
//		identiData.put(chooseTrack, data);
//		String json = gson.toJson(identiData);
//		FileWriter writer = new FileWriter(f);
//		writer.write(json);
//		writer.close();
//	}
//
//	public void addCreatedProject(IProject project) {
//		createdProject.add(project);
//	}
//
//	public boolean isCreated(IProject iProject) {
//		return createdProject.contains(iProject);
//	}
//
//	public ExecutionExportation getExportation() {
//		if (currentTaskSet == null) {
//			return null;
//		}
//		ExecutionExportation ee = new ExecutionExportation();
//		ee.setExperimentID(experimentId);
//		ee.setChooseTrack(chooseTrack);
//		ee.setConfigured(configured);
//		ee.setData(data);
//		List<String> ids = lifoQueue.stream().map(ExperimentalTask::getElementId).collect(Collectors.toList());
//		ee.setTaskOrder(ids);
//		List<String> projectIds = createdProject.stream().map(IProject::getName).collect(Collectors.toList());
//		ee.setProjectIds(projectIds);
//		ee.setTaskId(currentTaskSet.getElementId());
//		return ee;
//	}
//
//	public void configure(ExecutionExportation fileNames) {
//		data = fileNames.getData();
//		configured = fileNames.getConfigured();
//		CodingExperiment ce = manager.getLoadedExperiment(fileNames.getExperimentID());
//		List<String> taskOrder = fileNames.getTaskOrder();
//		taskOrder.add(0, fileNames.getTaskId());
//		for (String projectName : fileNames.getProjectIds()) {
//			System.out.println("projectName="+projectName);
//			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
//			IProject project = root.getProject(projectName);
//			createdProject.add(project);
//			configured = true;
//		}
//		setCurrentActionSet2(ce, taskOrder, fileNames.getChooseTrack());
//	}
//
//	public void setCurrentActionSet2(CodingExperiment selectedExperiment, List<String> taskIds, String chooseTrack) {
//		this.chooseTrack = chooseTrack;
//		this.experimentId = selectedExperiment.getElementId();
//		List<ModeledTask> foundTasks = new LinkedList<ModeledTask>();
//		for (String taskId : taskIds) {
//			ModeledTask taskToAdd = null;
//			for (ModeledTask modeledTask : selectedExperiment.getTask().getTasks()) {
//				ModeledTask foundTask = findTask(taskId, modeledTask);
//				if (foundTask != null) {
//					taskToAdd = foundTask;
//					break;
//				}
//			}
//			foundTasks.add(taskToAdd);
//		}
//		List<ExperimentalTask> listTasks = new LinkedList<ExperimentalTask>();
//		for (ModeledTask modeledTask : foundTasks) {
//			listTasks.addAll(reduce(modeledTask));
//		}
//		data.clear();
//		createdProject.clear();
//		activeMonitors.clear();
//		lifoQueue.clear();
//		lifoQueue.addAll(listTasks);
//		currentTaskSet = lifoQueue.poll();
//	}
//
	private List<ExperimentalTask> reduce(ModeledTask task) {
		if (task instanceof ExperimentalTask) {
			return Arrays.asList((ExperimentalTask) task);
		}
		if (task instanceof Random) {
			Random taskRandom = (Random) task;
			EList<ModeledTask> taskSet = taskRandom.getTasks();
			//Collections.shuffle(taskSet);
			List<ExperimentalTask> random = new LinkedList<ExperimentalTask>();
			for (ModeledTask modeledTask : taskSet) {
				random.addAll(reduce(modeledTask));
			}
			return random;
		}
		return Collections.<ExperimentalTask>emptyList();
	}

	private ModeledTask findTask(String taskId, ModeledTask aTask) {
		if (aTask.getElementId().equals(taskId))
			return aTask;
		if (aTask instanceof Random) {
			Random randomTask = (Random) aTask;
			for (ModeledTask innerTask : randomTask.getTasks()) {
				ModeledTask taskReturn = findTask(taskId, innerTask);
				if (taskReturn != null)
					return taskReturn;
			}
		}
		return null;
	}

	public void configure(CodingExperiment selectedExperiment, List<String> taskIds, String chooseTrack) {
		this.chooseTrack = chooseTrack;
		this.experiment = selectedExperiment;
		List<ModeledTask> foundTasks = new LinkedList<ModeledTask>();
		for (String taskId : taskIds) {
			ModeledTask taskToAdd = findInExperiment(selectedExperiment, taskId);
			foundTasks.add(taskToAdd);
		}
		List<ExperimentalTask> listTasks = new LinkedList<ExperimentalTask>();
		for (ModeledTask modeledTask : foundTasks) {
			listTasks.addAll(reduce(modeledTask));
		}
		data.clear();
		lifoQueue.clear();
		ExperimentalTask currentTask = listTasks.remove(0);
		lifoQueue.addAll(listTasks.stream()
								  .map(e -> e.getElementId())
								  .collect(Collectors.toList()));
		task = new CurrentExecutableTask(currentTask);
	}
	

	public void configure(ExecutionExportation visitor) {
		CodingExperiment experiment = manager.getLoadedExperiment(visitor.getExperimentID());
		configure(experiment, visitor.getTaskOrder(), visitor.getChooseTrack());
		if (!visitor.getProjectIds().isEmpty()){
			task.finishConfiguration();
			for (String projectId : visitor.getProjectIds()) {
				task.addProjectName(projectId);
			}
		}
		data = visitor.getData();
	}

	private ModeledTask findInExperiment(CodingExperiment selectedExperiment, String taskId) {
		ModeledTask taskToAdd = null;
		for (ModeledTask modeledTask : selectedExperiment.getTask().getTasks()) {
			ModeledTask foundTask = findTask(taskId, modeledTask);
			if (foundTask != null) {
				taskToAdd = foundTask;
				break;
			}
		}
		return taskToAdd;
	}

	public List<JavaProject> getRequiredJavaProjects() {
		ExperimentalTask taskModel = task.getTaskModel();
		return taskModel.getRequires().stream()
									  .filter(c -> c instanceof JavaProject)
									  .map(JavaProject.class::cast)
									  .collect(Collectors.toList());
	}

	public CurrentExecutableTask getExecutionTask() {
		return task;
	}

	public CurrentExecutableTask finishCurrentTask() {
		data.put(task.getTaskModel().getElementId(), task.finish());
		ExperimentalTask currentTask = (ExperimentalTask) findInExperiment(experiment, lifoQueue.poll());
		task = new CurrentExecutableTask(currentTask);
		return task;
	}

	public void exportData(String selected) throws IOException {
		File f = new File(selected);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Map<String, Object> identiData = new HashMap<String, Object>();
		identiData.put(chooseTrack, data);
		String json = gson.toJson(identiData);
		FileWriter writer = new FileWriter(f);
		writer.write(json);
		writer.close();
	}

	public boolean isConfirured() {
		if (isSelected())
			return task.getStatus().equals(TaskStatus.CONFIGURED);
		return false;
	}

	public boolean isStarted() {
		if (isSelected())
			return task.getStatus().equals(TaskStatus.STARTED);
		return false;
	}

	public boolean isSelected() {
		return task != null;
	}

	public ExecutionExportation buildExportationData() {
		if (task == null) {
			return null;
		}
		ExecutionExportation ee = new ExecutionExportation();
		ee.setExperimentID(experiment.getElementId());
		ee.setChooseTrack(chooseTrack);
		ee.setData(data);
		List<String> list = new ArrayList<String>(lifoQueue);
		list.add(0, task.getTaskModel().getElementId());
		ee.setTaskOrder(list);
		ee.setProjectIds(task.getProjectNames());
		return ee;
	}
}
