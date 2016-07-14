package br.ufpe.ines.decode.plugin.control;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

import br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask;
import br.edu.ufpe.ines.decode.taskDescription.ModeledTask;
import br.edu.ufpe.ines.decode.taskDescription.Random;

public class ExperimentExecutionManager {

	protected static ExperimentExecutionManager singleton = new ExperimentExecutionManager();
	private ExperimentalTask currentTaskSet;
	protected Queue<ExperimentalTask> lifoQueue = Collections.asLifoQueue(new LinkedList<ExperimentalTask>());

	public static ExperimentExecutionManager getInstance() {
		if (singleton == null)
			singleton = new ExperimentExecutionManager();
		return singleton;
	}

	public void setCurrentActionSet(ModeledTask modeledTask) {
		findTask(modeledTask);
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

	public ExperimentalTask getCurrentAtomicTask() {
		currentTaskSet = lifoQueue.poll();
		return currentTaskSet;
	}

}
