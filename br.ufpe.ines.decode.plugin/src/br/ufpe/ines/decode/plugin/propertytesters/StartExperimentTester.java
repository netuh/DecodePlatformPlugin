package br.ufpe.ines.decode.plugin.propertytesters;

import org.eclipse.core.expressions.PropertyTester;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;

public class StartExperimentTester extends PropertyTester {

	private ExperimentManager manager = ExperimentManager.getInstance();

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (property.equals("hasSelectedExperiment")) {
			return manager.getSelectedExperiment() != null;
		}
		if (property.equals("hasStartedExperiment")) {
			return manager.getStatus(manager.getSelectedExperiment()).equals("Started");
		}
		return true;
	}

	

}