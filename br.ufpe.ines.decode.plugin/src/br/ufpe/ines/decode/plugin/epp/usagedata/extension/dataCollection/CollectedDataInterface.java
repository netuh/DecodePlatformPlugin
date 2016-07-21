package br.ufpe.ines.decode.plugin.epp.usagedata.extension.dataCollection;

import br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions.ActionInterface;

public interface CollectedDataInterface {

	public ActionInterface getActionType();

	public void setActionType(ActionInterface actionType);
}
