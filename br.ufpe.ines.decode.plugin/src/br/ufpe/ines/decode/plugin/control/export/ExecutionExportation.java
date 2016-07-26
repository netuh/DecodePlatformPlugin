package br.ufpe.ines.decode.plugin.control.export;

import java.util.List;
import java.util.Map;

import br.ufpe.ines.decode.plugin.epp.usagedata.extension.dataCollection.CollectedDataInterface;

public class ExecutionExportation {

	private Map<Integer, List<CollectedDataInterface>> data;
	private List<String> taskOrder;
	private List<String> projectIds;
	private String taskId;
	private String experimentId;
	private String chooseTrack;
	private Boolean configured;
	
	public ExecutionExportation(){
		System.out.println("created");
	}

	public void setData(Map<Integer, List<CollectedDataInterface>> data) {
		this.data = data;
	}

	public void setTaskOrder(List<String> taskOrder) {
		this.taskOrder = taskOrder;
	}

	public void setProjectIds(List<String> projectIds) {
		this.projectIds = projectIds;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	
	public void setExperimentID(String experimentId) {
		this.experimentId = experimentId;
	}

	public void setChooseTrack(String chooseTrack) {
		this.chooseTrack = chooseTrack;
	}
	
	public void setConfigured(Boolean configured) {
		this.configured = configured;
	}

	public List<String> getProjectIds() {
		return projectIds;
	}

	public String getTaskId() {
		return taskId;
	}
	
	public Map<Integer, List<CollectedDataInterface>> getData() {
		return data;
	}

	public List<String> getTaskOrder() {
		return taskOrder;
	}
	
	public String getExperimentID() {
		return experimentId;
	}
	
	public String getChooseTrack() {
		return chooseTrack;
	}

	public Boolean getConfigured() {
		return configured;
	}
}
