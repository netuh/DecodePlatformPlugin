package br.ufpe.ines.decode.plugin.ui.testers;

import org.eclipse.core.expressions.PropertyTester;

import br.ufpe.ines.decode.plugin.control.ExperimentExecutionManager;

public class ToolBarButtonTester extends PropertyTester {

	private ExperimentExecutionManager manager = ExperimentExecutionManager.getInstance();

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (property.equals("hasSelectedExperiment")) {
			return manager.isSelected();
		}
		if (property.equals("hasConfiguredExperiment")) {
			return manager.isConfirured();
		}
		if (property.equals("hasStartedExperiment")) {
			return manager.isStarted();
		}
		return true;
	}

	

}