package br.ufpe.ines.decode.plugin.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Optional;

import org.apache.commons.compress.archivers.ArchiveException;
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
    public void testZip2() throws Exception {
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

	private Experiment evaluateFile2(String filePath, String id) throws ArchiveException, IOException{
		assertFalse(manager.getExperiments().stream().anyMatch(exp -> exp.getId().equals(id)));
		manager.experimentFromFile2(filePath);
		Optional<Experiment> exp2 = manager.getExperiments().stream().filter(i -> i.getId().equals(id)).findFirst();
		return exp2.get();
	}

}
