package br.ufpe.ines.decode.plugin.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerActivation;
import org.eclipse.ui.handlers.IHandlerService;
import org.junit.BeforeClass;
import org.junit.Test;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.handlers.StartExperimentHandler;
import br.ufpe.ines.decode.plugin.model.Experiment;

public class ExperimentManagerTest {

	protected static ExperimentManager manager = ExperimentManager.getInstance();

	@BeforeClass
	public static void beforeClass() throws Exception {
		manager.cleanExperiment();
		manager.setSelectedExperiment(null);
		IWorkbench workbench = PlatformUI.getWorkbench();
		IHandlerService handlerService = (IHandlerService) workbench.getService(IHandlerService.class);
		StartExperimentHandler sh = new StartExperimentHandler();
		IHandlerActivation activateHandler = handlerService
				.activateHandler("br.ufpe.ines.decode.plugin.handler.startExperiment", sh);
		handlerService.deactivateHandler(activateHandler);
	}
	
	@Test
	public void testFileDomain() {
		assertTrue(manager.getExperiments().isEmpty());
		Experiment exp = evaluateFile(
				"/Users/netuh/git/DecodePlatformPlugin/br.ufpe.ines.decode.plugin/experimentDesc/experiment1.json",
				"NewExperiment1");
		assertEquals("br.ufpe.ines.decode.experiment1", exp.getDomain());
		assertEquals("java", exp.getLanguage());
		assertTrue(manager.getExperiments().size() == 1);
		exp = evaluateFile(
				"/Users/netuh/git/DecodePlatformPlugin/br.ufpe.ines.decode.plugin/experimentDesc/experiment2.json",
				"NewExperiment2");
		assertEquals("br.ufpe.ines.decode.experiment2", exp.getDomain());
		assertEquals("java", exp.getLanguage());
		assertTrue(manager.getExperiments().size() == 2);
		manager.cleanExperiment();
		assertTrue(manager.getExperiments().isEmpty());
	}

	private Experiment evaluateFile(String filePath, String id) {
		assertFalse(manager.getExperiments().stream().anyMatch(exp -> exp.getId().equals(id)));
		manager.experimentFromFile(filePath);
		Optional<Experiment> exp2 = manager.getExperiments().stream().filter(i -> i.getId().equals(id)).findFirst();
		return exp2.get();
	}

}
