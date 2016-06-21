package br.ufpe.ines.decode.plugin.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.Instant;
import java.time.ZonedDateTime;

import org.eclipse.swt.graphics.Image;
import org.junit.Before;
import org.junit.Test;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.model.ConfiguredExperiment;
import br.ufpe.ines.decode.plugin.test.util.TestContants;

public class ExperimentManagerTest {

	private static final String DEFAULT_FILE_NAME1 = "Source1.java";
	private static final String DEFAULT_FILE_NAME2 = "Source2.java";
	
	protected static ExperimentManager manager = ExperimentManager.getInstance();

	@Before
	public void beforeClass() throws Exception {
		manager.cleanExperiment();
	}

	@Test
	public void testManagerBasic() throws Exception {
		assertTrue(manager.getLoadedExperiments().isEmpty());
		assertNotNull(addExperiment(TestContants.EXPERIMENT1));
		assertEquals(1, manager.getLoadedExperiments().size());
		assertNotNull(addExperiment(TestContants.EXPERIMENT2));
		assertEquals(2, manager.getLoadedExperiments().size());
		manager.cleanExperiment();
		assertTrue(manager.getLoadedExperiments().isEmpty());
	}
	
	@Test
	public void testManagerAddingTwice() throws Exception {
		assertTrue(manager.getLoadedExperiments().isEmpty());
		ConfiguredExperiment exp = addExperiment(TestContants.EXPERIMENT1);
		assertEquals(1, manager.getLoadedExperiments().size());
		ConfiguredExperiment expCopy = addExperiment(TestContants.EXPERIMENT1);
		assertEquals(exp, expCopy);
		assertEquals(1,manager.getLoadedExperiments().size());
		manager.cleanExperiment();
		assertTrue(manager.getLoadedExperiments().isEmpty());
	}

	@Test
	public void testManagerImage() throws Exception {
		assertTrue(manager.getLoadedExperiments().isEmpty());
		ConfiguredExperiment exp = addExperiment(TestContants.EXPERIMENT1);
		Image imgExp1 = exp.getImage();
		ConfiguredExperiment exp2 = addExperiment(TestContants.EXPERIMENT2);
		Image imgExp2 = exp2.getImage();
		assertNotEquals(imgExp1, imgExp2);
	}

	@Test
	public void testManagerExperimentStatus() throws Exception {
		assertTrue(manager.getLoadedExperiments().isEmpty());
		ConfiguredExperiment exp = addExperiment(TestContants.EXPERIMENT1);
		ConfiguredExperiment exp2 = addExperiment(TestContants.EXPERIMENT2);
		assertTrue(exp.getStatus().equals(exp2.getStatus()));
		exp.statusSelect();
		assertFalse(exp.getStatus().equals(exp2.getStatus()));
		assertEquals(ConfiguredExperiment.ExperimentStatus.IN_PROGRESS, exp.getStatus());
	}

	@Test
	public void testManagerExperimentAddAction() throws Exception {
		assertTrue(manager.getLoadedExperiments().isEmpty());
		ConfiguredExperiment exp = addExperiment(TestContants.EXPERIMENT1);
		ConfiguredExperiment exp2 = addExperiment(TestContants.EXPERIMENT2);
		exp.statusSelect();
		assertTrue(manager.getLoggedActions(exp.getBasicExperiment()).isEmpty());

		Instant sinceBefore = ZonedDateTime.now().toInstant();;
		manager.addAction(exp.getBasicExperiment(), DEFAULT_FILE_NAME1, sinceBefore);
		assertEquals(1, manager.getLoggedActions(exp.getBasicExperiment()).size());
		assertEquals(1, manager.getLoggedTimes(exp.getBasicExperiment()).size());
		assertEquals(DEFAULT_FILE_NAME1, manager.getLoggedActions(exp.getBasicExperiment()).get(0));
		assertEquals(sinceBefore, manager.getLoggedTimes(exp.getBasicExperiment()).get(0));

		Instant sinceBefore2 = ZonedDateTime.now().toInstant();;
		manager.addAction(exp.getBasicExperiment(), DEFAULT_FILE_NAME1, sinceBefore2);
		assertEquals(2, manager.getLoggedActions(exp.getBasicExperiment()).size());
		assertEquals(DEFAULT_FILE_NAME1, manager.getLoggedActions(exp.getBasicExperiment()).get(1));
		assertEquals(sinceBefore2, manager.getLoggedTimes(exp.getBasicExperiment()).get(1));
		assertNotEquals(sinceBefore, manager.getLoggedTimes(exp.getBasicExperiment()).get(1));
		assertEquals(0, manager.getLoggedActions(exp2.getBasicExperiment()).size());

		manager.addAction(exp.getBasicExperiment(), DEFAULT_FILE_NAME1, ZonedDateTime.now().toInstant());
		assertEquals(3, manager.getLoggedActions(exp.getBasicExperiment()).size());
		assertEquals(0, manager.getLoggedActions(exp2.getBasicExperiment()).size());

		manager.addAction(exp2.getBasicExperiment(), DEFAULT_FILE_NAME2, ZonedDateTime.now().toInstant());
		assertEquals(3, manager.getLoggedActions(exp.getBasicExperiment()).size());
		assertEquals(1, manager.getLoggedActions(exp2.getBasicExperiment()).size());
	}

	private ConfiguredExperiment addExperiment(String[] experimentData) throws Exception {
		manager.experimentFromFile2(experimentData[TestContants.INDEX_FILE]);
		ConfiguredExperiment exp = manager.getLoadedExperiments().stream()
				.filter(i -> i.getBasicExperiment().getId().equals(experimentData[TestContants.INDEX_EXPERIMENT_ID]))
				.findFirst()
				.get();
		assertEquals(experimentData[TestContants.INDEX_DOMAIN], exp.getBasicExperiment().getDomain());
		assertEquals(experimentData[TestContants.INDEX_LANGUAGE], exp.getBasicExperiment().getLanguage());
		return exp;
	}
}
