package br.ufpe.ines.decode.observer.epp.usagedata.extension.data;

import br.ufpe.ines.decode.observer.epp.usagedata.extension.actions.ActionInterface;

public interface CollectedDataInterface {

	public ActionInterface getActionType();
	
	public String[] getData();
	
	public void setData(String[] data);

	public void setActionType(ActionInterface actionType);
}
