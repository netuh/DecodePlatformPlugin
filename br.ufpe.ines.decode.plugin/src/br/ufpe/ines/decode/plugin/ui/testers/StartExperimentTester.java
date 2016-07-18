package br.ufpe.ines.decode.plugin.ui.testers;

import org.eclipse.core.expressions.PropertyTester;

import br.ufpe.ines.decode.plugin.control.ExperimentExecutionManager;

public class StartExperimentTester extends PropertyTester {

	private ExperimentExecutionManager manager = ExperimentExecutionManager.getInstance();

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (property.equals("hasConfiguredExperiment")) {
			return manager.hasConfirured();
		}
		if (property.equals("hasSelectedExperiment")) {
			return manager.hasSelected();
		}
		if (property.equals("hasStartedExperiment")) {
			return manager.hasStarted();
		}
		return true;
	}

	

}