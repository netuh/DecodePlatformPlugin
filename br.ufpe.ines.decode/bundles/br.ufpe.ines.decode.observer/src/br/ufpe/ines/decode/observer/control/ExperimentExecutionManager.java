package br.ufpe.ines.decode.observer.control;

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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.ufpe.ines.decode.decode.CodingExperiment;
import br.ufpe.ines.decode.decode.artifacts.JavaProject;
import br.ufpe.ines.decode.decode.taskDescription.ExperimentalTask;
import br.ufpe.ines.decode.decode.taskDescription.ModeledTask;
import br.ufpe.ines.decode.decode.taskDescription.Random;
import br.ufpe.ines.decode.decode.taskDescription.Sequencial;
import br.ufpe.ines.decode.observer.control.loader.ExecutionExportation;
import br.ufpe.ines.decode.observer.epp.usagedata.extension.data.CollectedDataInterface;
import br.ufpe.ines.decode.observer.model.CurrentExecutableTask;
import br.ufpe.ines.decode.observer.model.TaskStatus;

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

	private List<ExperimentalTask> reduce(ModeledTask task) {
		if (task instanceof ExperimentalTask) {
			return Arrays.asList((ExperimentalTask) task);
		}
		if (task instanceof Random) {
			Random taskRandom = (Random) task;
			//EList<ModeledTask> taskSet = taskRandom.getTasks();
			List<ModeledTask> tasksToShuffle = new ArrayList<ModeledTask>();
			tasksToShuffle.addAll(taskRandom.getTasks());
			Collections.shuffle(tasksToShuffle);
			List<ExperimentalTask> random = new LinkedList<ExperimentalTask>();
			for (ModeledTask modeledTask : tasksToShuffle) {
				random.addAll(reduce(modeledTask));
			}
			return random;
		}
		
		if (task instanceof Sequencial) {
			Sequencial taskRandom = (Sequencial) task;
			//EList<ModeledTask> taskSet = taskRandom.getTasks();
			List<ModeledTask> tasksToShuffle = new ArrayList<ModeledTask>();
			tasksToShuffle.addAll(taskRandom.getTasks());
			List<ExperimentalTask> random = new LinkedList<ExperimentalTask>();
			for (ModeledTask modeledTask : tasksToShuffle) {
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
			List<ModeledTask> tasksToShuffle = new ArrayList<ModeledTask>();
			tasksToShuffle.addAll(randomTask.getTasks());
			Collections.shuffle(tasksToShuffle);
			for (ModeledTask innerTask : tasksToShuffle) {
				ModeledTask taskReturn = findTask(taskId, innerTask);
				if (taskReturn != null)
					return taskReturn;
			}
		}
		if (aTask instanceof Sequencial) {
			Sequencial randomTask = (Sequencial) aTask;
			List<ModeledTask> tasksToShuffle = new ArrayList<ModeledTask>();
			tasksToShuffle.addAll(randomTask.getTasks());
			Collections.shuffle(tasksToShuffle);
			for (ModeledTask innerTask : tasksToShuffle) {
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
		System.out.println("listTasks="+listTasks.size());
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
		System.out.println("taskId="+taskId);
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
		if (!lifoQueue.isEmpty()){
			ExperimentalTask currentTask = (ExperimentalTask) findInExperiment(experiment, lifoQueue.poll());
			task = new CurrentExecutableTask(currentTask);		
		} else {
			task = null;
		}
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
