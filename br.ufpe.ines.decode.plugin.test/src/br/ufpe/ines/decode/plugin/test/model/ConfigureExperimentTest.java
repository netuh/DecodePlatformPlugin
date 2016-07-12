package br.ufpe.ines.decode.plugin.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import br.ufpe.ines.decode.plugin.model.ConfiguredExperiment;
import br.ufpe.ines.decode.plugin.model.Experiment;
import br.ufpe.ines.decode.plugin.model.SourceCode;

public class ConfigureExperimentTest {

	@Test
	public void testEquals(){
		String experimentId1 = "experiment1";
		String experimentDomain1 = "a.b.c";
		String experimentLanguage1 = "java";

		Experiment exp1 = new Experiment();
		exp1.setId(experimentId1);
		exp1.setDomain(experimentDomain1);
		exp1.setLanguage(experimentLanguage1);
		ConfiguredExperiment ce1 = new ConfiguredExperiment(exp1);
		ConfiguredExperiment ce2 = new ConfiguredExperiment(exp1);
		assertEquals(ce1, ce2);
	}
	
	@Test
	public void testEmptyExperiment(){
		String experimentId1 = "experiment1";
		String experimentDomain1 = "a.b.c";
		String experimentLanguage1 = "java";

		final Experiment exp1 = new Experiment();
		exp1.setId(experimentId1);
		exp1.setDomain(experimentDomain1);
		exp1.setLanguage(experimentLanguage1);
		
		ConfiguredExperiment ce2 = new ConfiguredExperiment(exp1);
		assertTrue(ce2.getDefaultFileNames().isEmpty());
	}
	
	@Test
	public void testFiles() throws Exception{
		String experimentId1 = "experiment1";
		String experimentDomain1 = "a.b.c";
		String experimentLanguage1 = "java";

		final Experiment exp1 = new Experiment();
		exp1.setId(experimentId1);
		exp1.setDomain(experimentDomain1);
		exp1.setLanguage(experimentLanguage1);
		SourceCode[] sourceCodes = {new SourceCode("Source1.java", "pack1"),
				new SourceCode("Source2.java", null),
				new SourceCode("Source3.java", "pack2")};
		Arrays.asList(sourceCodes)
			.stream()
			.forEach(sc ->exp1.addSouce(sc));
		
		Map<String, String> fileContent = new HashMap<String, String>();
		fileContent.put("Source1.java", "content1");
		fileContent.put("Source2.java", "content2");
		fileContent.put("Source3.java", "content3");
		ConfiguredExperiment ce2 = new ConfiguredExperiment(exp1, fileContent);
		assertTrue(ce2.getDefaultFileNames().size() == 3);
	}
	
	@Test(expected=Exception.class)
	public void testMissingFiles() throws Exception{
		String experimentId1 = "experiment1";
		String experimentDomain1 = "a.b.c";
		String experimentLanguage1 = "java";

		final Experiment exp1 = new Experiment();
		exp1.setId(experimentId1);
		exp1.setDomain(experimentDomain1);
		exp1.setLanguage(experimentLanguage1);
		SourceCode[] sourceCodes = {new SourceCode("Source1.java", "pack1"),
				new SourceCode("Source2.java", null),
				new SourceCode("Source3.java", "pack2")};
		Arrays.asList(sourceCodes)
			.stream()
			.forEach(sc ->exp1.addSouce(sc));
		
		Map<String, String> fileContent = new HashMap<String, String>();
		fileContent.put("Source1.java", "content1");
		fileContent.put("Source2.java", "content2");
		new ConfiguredExperiment(exp1, fileContent);
		fail();
	}
}
