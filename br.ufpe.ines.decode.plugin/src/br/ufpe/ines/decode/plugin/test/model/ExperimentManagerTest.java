package br.ufpe.ines.decode.plugin.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Optional;

import org.apache.commons.compress.archivers.ArchiveException;
import org.eclipse.swt.graphics.Image;
import org.junit.Before;
import org.junit.Test;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.model.Experiment;

public class ExperimentManagerTest {

	protected static ExperimentManager manager = ExperimentManager.getInstance();

	@Before
	public void beforeClass() throws Exception {
		manager.cleanExperiment();
		manager.setSelectedExperiment(null);
	}
	
	@Test
    public void testManagerBasic() throws Exception {
		assertTrue(manager.getExperiments().isEmpty());
		Experiment exp = evaluateFile2("/Users/netuh/git/DecodePlatformPlugin/br.ufpe.ines.decode.plugin/experimentDesc/experiment1.zip",
				"NewExperiment1");
		assertEquals("br.ufpe.ines.decode.experiment1", exp.getDomain());
		assertEquals("java", exp.getLanguage());
		assertTrue(manager.getExperiments().size() == 1);
		exp = evaluateFile2(
				"/Users/netuh/git/DecodePlatformPlugin/br.ufpe.ines.decode.plugin/experimentDesc/experiment2.zip",
				"NewExperiment2");
		assertEquals("br.ufpe.ines.decode.experiment2", exp.getDomain());
		assertEquals("java", exp.getLanguage());
		assertTrue(manager.getExperiments().size() == 2);
		manager.cleanExperiment();
		assertTrue(manager.getExperiments().isEmpty());

    }
	
	@Test
    public void testManagerImage() throws Exception {
		assertTrue(manager.getExperiments().isEmpty());
		Experiment exp = evaluateFile2("/Users/netuh/git/DecodePlatformPlugin/br.ufpe.ines.decode.plugin/experimentDesc/experiment1.zip",
				"NewExperiment1");
		Image imgExp1 = manager.getImage(exp);
		Experiment exp2 = evaluateFile2("/Users/netuh/git/DecodePlatformPlugin/br.ufpe.ines.decode.plugin/experimentDesc/experiment2.zip",
				"NewExperiment2");
		Image imgExp2 = manager.getImage(exp2);
		assertNotEquals(imgExp1, imgExp2);
    }
	
	@Test
    public void testManagerExperimentStatus() throws Exception {
		assertTrue(manager.getExperiments().isEmpty());
		Experiment exp = evaluateFile2("/Users/netuh/git/DecodePlatformPlugin/br.ufpe.ines.decode.plugin/experimentDesc/experiment1.zip",
				"NewExperiment1");
		String status = manager.getStatus(exp);
		Experiment exp2 = evaluateFile2("/Users/netuh/git/DecodePlatformPlugin/br.ufpe.ines.decode.plugin/experimentDesc/experiment2.zip",
				"NewExperiment2");
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
		Experiment exp = evaluateFile2("/Users/netuh/git/DecodePlatformPlugin/br.ufpe.ines.decode.plugin/experimentDesc/experiment1.zip",
				"NewExperiment1");
		Experiment exp2 = evaluateFile2("/Users/netuh/git/DecodePlatformPlugin/br.ufpe.ines.decode.plugin/experimentDesc/experiment2.zip",
				"NewExperiment2");
		manager.setSelectedExperiment(exp);
		assertTrue(manager.getLoggedActions(exp).isEmpty());
		LocalDateTime sinceBefore = LocalDateTime.now();
		manager.addAction(exp, "Source.java", sinceBefore);
		assertEquals(1, manager.getLoggedActions(exp).size());
		assertEquals(1, manager.getLoggedTimes(exp).size());
		assertEquals("Source.java", manager.getLoggedActions(exp).get(0));
		assertEquals(sinceBefore, manager.getLoggedTimes(exp).get(0));
		LocalDateTime sinceBefore2 = LocalDateTime.now();
		manager.addAction(exp, "Source.java",sinceBefore2);
		assertEquals(2, manager.getLoggedActions(exp).size());
		assertEquals("Source.java", manager.getLoggedActions(exp).get(1));
		assertEquals(sinceBefore2, manager.getLoggedTimes(exp).get(1));
		assertNotEquals(sinceBefore, manager.getLoggedTimes(exp).get(1));
		
		assertEquals(0, manager.getLoggedActions(exp2).size());
		
		manager.addAction(exp, "Source.java",LocalDateTime.now());
		assertEquals(3, manager.getLoggedActions(exp).size());
		
		assertEquals(0, manager.getLoggedActions(exp2).size());
		
		manager.addAction(exp2, "Source.java",LocalDateTime.now());
		assertEquals(3, manager.getLoggedActions(exp).size());
		
		assertEquals(1, manager.getLoggedActions(exp2).size());
    }

	private Experiment evaluateFile2(String filePath, String id) throws ArchiveException, IOException{
		assertFalse(manager.getExperiments().stream().anyMatch(exp -> exp.getId().equals(id)));
		manager.experimentFromFile2(filePath);
		Optional<Experiment> exp2 = manager.getExperiments().stream().filter(i -> i.getId().equals(id)).findFirst();
		return exp2.get();
	}

}
