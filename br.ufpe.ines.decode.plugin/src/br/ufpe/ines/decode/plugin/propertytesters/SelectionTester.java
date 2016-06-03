package br.ufpe.ines.decode.plugin.propertytesters;

import org.eclipse.core.expressions.PropertyTester;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;

public class SelectionTester extends PropertyTester {

	private ExperimentManager manager = ExperimentManager.getInstance();

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if ("hasNonEmptyTextSelection".equals(property)) {
			return manager.getSelectedExperiment() != null;
		}
		return true;
	}

	

}