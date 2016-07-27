package br.ufpe.ines.decode.plugin.control.loader;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import br.ufpe.ines.decode.plugin.epp.usagedata.extension.dataCollection.CollectedDataInterface;

public class ExecutionExportation {

	private Map<String, List<CollectedDataInterface>> data;
	private List<String> taskOrder;
	private List<String> projectIds;
	private String experimentId;
	private String chooseTrack;
	
	public ExecutionExportation(){
	}

	public void setData(Map<String, List<CollectedDataInterface>> data) {
		this.data = data;
	}

	public void setTaskOrder(List<String> taskOrder) {
		this.taskOrder = taskOrder;
	}

	public void setProjectIds(List<String> projectIds) {
		this.projectIds = projectIds;
	}
	
	public void setExperimentID(String experimentId) {
		this.experimentId = experimentId;
	}

	public void setChooseTrack(String chooseTrack) {
		this.chooseTrack = chooseTrack;
	}

	public List<String> getProjectIds() {
		if (projectIds == null)
			return Collections.<String>emptyList();
		return projectIds;
	}
	
	public Map<String, List<CollectedDataInterface>> getData() {
		if (data == null)
			return Collections.<String, List<CollectedDataInterface>>emptyMap();
		return data;
	}

	public List<String> getTaskOrder() {
		if (taskOrder == null)
			return Collections.<String>emptyList();
		return taskOrder;
	}

	public String getExperimentID() {
		return experimentId;
	}
	
	public String getChooseTrack() {
		return chooseTrack;
	}
}
