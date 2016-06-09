package br.ufpe.ines.decode.plugin.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.compress.archivers.ArchiveException;
import org.eclipse.swt.graphics.Image;
import org.junit.Before;
import org.junit.Test;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.model.Experiment;

public class ExperimentManagerTest {

	private static final String DEFAULT_FILE_NAME1 = "Source1.java";
	private static final String DEFAULT_FILE_NAME2 = "Source2.java";
	
	private static final String[] EXPERIMENT1 = { "./experimentDesc/experiment1.zip", "NewExperiment1",
			"br.ufpe.ines.decode.experiment1", "java" };
	private static final String[] EXPERIMENT2 = { "./experimentDesc/experiment2.zip", "NewExperiment2",
			"br.ufpe.ines.decode.experiment2", "java" };
	
	private static final int INDEX_FILE = 0;
	private static final int INDEX_PROJECT_NAME = 1;
	private static final int INDEX_DOMAIN = 2;
	private static final int INDEX_LANGUAGE = 3;
	
	protected static ExperimentManager manager = ExperimentManager.getInstance();

	@Before
	public void beforeClass() throws Exception {
		manager.cleanExperiment();
	}

	@Test
	public void testManagerBasic() throws Exception {
		assertTrue(manager.getExperiments().isEmpty());
		assertNotNull(addExperiment(EXPERIMENT1));
		assertTrue(manager.getExperiments().size() == 1);
		assertNotNull(addExperiment(EXPERIMENT2));
		assertTrue(manager.getExperiments().size() == 2);
		manager.cleanExperiment();
		assertTrue(manager.getExperiments().isEmpty());

	}

	@Test
	public void testManagerImage() throws Exception {
		assertTrue(manager.getExperiments().isEmpty());
		Experiment exp = addExperiment(EXPERIMENT1);
		Image imgExp1 = manager.getImage(exp);
		Experiment exp2 = addExperiment(EXPERIMENT2);
		Image imgExp2 = manager.getImage(exp2);
		assertNotEquals(imgExp1, imgExp2);
	}

	@Test
	public void testManagerExperimentStatus() throws Exception {
		assertTrue(manager.getExperiments().isEmpty());
		Experiment exp = addExperiment(EXPERIMENT1);
		String status = manager.getStatus(exp);
		Experiment exp2 = addExperiment(EXPERIMENT2);
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
		Experiment exp = addExperiment(EXPERIMENT1);
		Experiment exp2 = addExperiment(EXPERIMENT2);
		manager.setSelectedExperiment(exp);
		assertTrue(manager.getLoggedActions(exp).isEmpty());

		LocalDateTime sinceBefore = LocalDateTime.now();
		manager.addAction(exp, DEFAULT_FILE_NAME1, sinceBefore);
		assertEquals(1, manager.getLoggedActions(exp).size());
		assertEquals(1, manager.getLoggedTimes(exp).size());
		assertEquals(DEFAULT_FILE_NAME1, manager.getLoggedActions(exp).get(0));
		assertEquals(sinceBefore, manager.getLoggedTimes(exp).get(0));

		LocalDateTime sinceBefore2 = LocalDateTime.now();
		manager.addAction(exp, DEFAULT_FILE_NAME1, sinceBefore2);
		assertEquals(2, manager.getLoggedActions(exp).size());
		assertEquals(DEFAULT_FILE_NAME1, manager.getLoggedActions(exp).get(1));
		assertEquals(sinceBefore2, manager.getLoggedTimes(exp).get(1));
		assertNotEquals(sinceBefore, manager.getLoggedTimes(exp).get(1));
		assertEquals(0, manager.getLoggedActions(exp2).size());

		manager.addAction(exp, DEFAULT_FILE_NAME1, LocalDateTime.now());
		assertEquals(3, manager.getLoggedActions(exp).size());
		assertEquals(0, manager.getLoggedActions(exp2).size());

		manager.addAction(exp2, DEFAULT_FILE_NAME2, LocalDateTime.now());
		assertEquals(3, manager.getLoggedActions(exp).size());
		assertEquals(1, manager.getLoggedActions(exp2).size());
	}

	private Experiment addExperiment(String[] experimentData) throws ArchiveException, IOException {
		assertFalse(manager.getExperiments().stream().anyMatch(exp -> exp.getId().equals(experimentData[INDEX_PROJECT_NAME])));
		manager.experimentFromFile2(experimentData[INDEX_FILE]);
		Experiment exp = manager.getExperiments().stream()
				.filter(i -> i.getId().equals(experimentData[INDEX_PROJECT_NAME]))
				.findFirst()
				.get();
		assertEquals(experimentData[INDEX_DOMAIN], exp.getDomain());
		assertEquals(experimentData[INDEX_LANGUAGE], exp.getLanguage());
		return exp;
	}
}
