package br.ufpe.ines.decode.plugin.epp.usagedata.extension.dataCollection;

import br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions.ActionInterface;

public class AtomicCollectedData implements CollectedDataInterface{

	private ActionInterface actionType;
	private String[] data;
	
	public AtomicCollectedData(ActionInterface actionType, String[] data) {
		this.actionType = actionType;
		this.data = data;
	}

	@Override
	public ActionInterface getActionType() {
		return actionType;
	}

	@Override
	public void setActionType(ActionInterface actionType) {
		this.actionType = actionType;
	}

	@Override
	public String[] getData() {
		return data;
	}

	@Override
	public void setData(String[] data) {
		this.data = data;
	}

}
