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
import br.ufpe.ines.decode.plugin.model.Experiment;
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
		assertTrue(manager.getExperiments().isEmpty());
		assertNotNull(addExperiment(TestContants.EXPERIMENT1));
		assertEquals(1, manager.getExperiments().size());
		assertNotNull(addExperiment(TestContants.EXPERIMENT2));
		assertEquals(2, manager.getExperiments().size());
		manager.cleanExperiment();
		assertTrue(manager.getExperiments().isEmpty());
	}
	
	@Test
	public void testManagerAddingTwice() throws Exception {
		assertTrue(manager.getExperiments().isEmpty());
		Experiment exp = addExperiment(TestContants.EXPERIMENT1);
		assertEquals(1, manager.getExperiments().size());
		Experiment expCopy = addExperiment(TestContants.EXPERIMENT1);
		assertEquals(exp, expCopy);
		manager.getExperiments().stream().forEach(expIn -> System.out.println("expIn="+expIn.getId()));
		assertEquals(1,manager.getExperiments().size());
		manager.cleanExperiment();
		assertTrue(manager.getExperiments().isEmpty());
	}

	@Test
	public void testManagerImage() throws Exception {
		assertTrue(manager.getExperiments().isEmpty());
		Experiment exp = addExperiment(TestContants.EXPERIMENT1);
		Image imgExp1 = manager.getImage(exp);
		Experiment exp2 = addExperiment(TestContants.EXPERIMENT2);
		Image imgExp2 = manager.getImage(exp2);
		assertNotEquals(imgExp1, imgExp2);
	}

	@Test
	public void testManagerExperimentStatus() throws Exception {
		assertTrue(manager.getExperiments().isEmpty());
		Experiment exp = addExperiment(TestContants.EXPERIMENT1);
		String status = manager.getStatus(exp);
		Experiment exp2 = addExperiment(TestContants.EXPERIMENT2);
		String status2 = manager.getStatus(exp2);
		assertTrue(status.equals(status2));
		manager.setSelectedExperiment(exp);
		status = manager.getStatus(exp);
		status2 = manager.getStatus(exp2);
		assertFalse(status.equals(status2));
	}

	@Test
	public void testManagerExperimentAddAction() throws Exception {
		assertTrue(manager.getExperiments().isEmpty());
		Experiment exp = addExperiment(TestContants.EXPERIMENT1);
		Experiment exp2 = addExperiment(TestContants.EXPERIMENT2);
		manager.setSelectedExperiment(exp);
		assertTrue(manager.getLoggedActions(exp).isEmpty());

		Instant sinceBefore = ZonedDateTime.now().toInstant();;
		manager.addAction(exp, DEFAULT_FILE_NAME1, sinceBefore);
		assertEquals(1, manager.getLoggedActions(exp).size());
		assertEquals(1, manager.getLoggedTimes(exp).size());
		assertEquals(DEFAULT_FILE_NAME1, manager.getLoggedActions(exp).get(0));
		assertEquals(sinceBefore, manager.getLoggedTimes(exp).get(0));

		Instant sinceBefore2 = ZonedDateTime.now().toInstant();;
		manager.addAction(exp, DEFAULT_FILE_NAME1, sinceBefore2);
		assertEquals(2, manager.getLoggedActions(exp).size());
		assertEquals(DEFAULT_FILE_NAME1, manager.getLoggedActions(exp).get(1));
		assertEquals(sinceBefore2, manager.getLoggedTimes(exp).get(1));
		assertNotEquals(sinceBefore, manager.getLoggedTimes(exp).get(1));
		assertEquals(0, manager.getLoggedActions(exp2).size());

		manager.addAction(exp, DEFAULT_FILE_NAME1, ZonedDateTime.now().toInstant());
		assertEquals(3, manager.getLoggedActions(exp).size());
		assertEquals(0, manager.getLoggedActions(exp2).size());

		manager.addAction(exp2, DEFAULT_FILE_NAME2, ZonedDateTime.now().toInstant());
		assertEquals(3, manager.getLoggedActions(exp).size());
		assertEquals(1, manager.getLoggedActions(exp2).size());
	}

	private Experiment addExperiment(String[] experimentData) throws Exception {
		manager.experimentFromFile2(experimentData[TestContants.INDEX_FILE]);
		Experiment exp = manager.getExperiments().stream()
				.filter(i -> i.getId().equals(experimentData[TestContants.INDEX_EXPERIMENT_ID]))
				.findFirst()
				.get();
		assertEquals(experimentData[TestContants.INDEX_DOMAIN], exp.getDomain());
		assertEquals(experimentData[TestContants.INDEX_LANGUAGE], exp.getLanguage());
		return exp;
	}
}
