package br.ufpe.ines.decode.plugin.epp.usagedata.extension.dataCollection;

import br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions.ActionInterface;

public class AtomicCollectedData implements CollectedDataInterface{

	
	private ActionInterface actionType;
	
	public AtomicCollectedData(ActionInterface actionType) {
		this.actionType = actionType;
	}

	@Override
	public ActionInterface getActionType() {
		return actionType;
	}

	@Override
	public void setActionType(ActionInterface actionType) {
		this.actionType = actionType;
	}

}
