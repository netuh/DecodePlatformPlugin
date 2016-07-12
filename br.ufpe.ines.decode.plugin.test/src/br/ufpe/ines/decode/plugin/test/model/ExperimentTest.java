package br.ufpe.ines.decode.plugin.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.ufpe.ines.decode.plugin.model.Experiment;
import br.ufpe.ines.decode.plugin.model.SourceCode;

public class ExperimentTest {

	@Test
	public void testEquals(){
		String experimentId1 = "experiment1";
		String experimentDomain1 = "a.b.c";
		String experimentLanguage1 = "java";

		Experiment exp1 = new Experiment();
		exp1.setId(experimentId1);
		exp1.setDomain(experimentDomain1);
		exp1.setLanguage(experimentLanguage1);

		Experiment exp2 = new Experiment();
		exp2.setId(experimentId1);
		exp2.setDomain(experimentDomain1);
		exp2.setLanguage(experimentLanguage1);

		assertEquals(exp2,exp1);
	}
	
	@Test
	public void basicTestBasic(){
		String experimentId1 = "experiment1";
		String experimentDomain1 = "a.b.c";
		String experimentLanguage1 = "java";
		
		String experimentId2 = "experiment2";
		String experimentDomain2 = "d.e.f";
		String experimentLanguage2 = "c";
		Experiment exp1 = new Experiment();
		assertNull(exp1.getId());
		assertNull(exp1.getDomain());
		assertNull(exp1.getLanguage());
		assertTrue(exp1.getSources().isEmpty());
		exp1.setId(experimentId1);
		exp1.setDomain(experimentDomain1);
		exp1.setLanguage(experimentLanguage1);
		assertEquals(exp1.getId(),experimentId1);
		assertEquals(exp1.getDomain(), experimentDomain1);
		assertEquals(exp1.getLanguage(), experimentLanguage1);
		assertNotEquals(exp1.getId(),experimentId2);
		assertNotEquals(exp1.getDomain(), experimentDomain2);
		assertNotEquals(exp1.getDomain(), experimentLanguage2);
		Experiment exp2 = new Experiment();
		assertNotEquals(exp2,exp1);
		exp2.setId(experimentId2);
		exp2.setDomain(experimentDomain2);
		exp2.setLanguage(experimentLanguage2);
		assertNotEquals(exp2,exp1);
	}
	
	@Test
	public void basicTestSources(){
		SourceCode[] sources = {new SourceCode("source1.java", "pack1"),
				new SourceCode("source2.java", null),
				new SourceCode("source3.java", "pack2")};
				
		Experiment exp1 = new Experiment();
		assertNull(exp1.getId());
		assertNull(exp1.getDomain());
		assertNull(exp1.getLanguage());
		assertTrue(exp1.getSources().isEmpty());
		for (SourceCode aSource : sources) {
			exp1.addSouce(aSource);
		}
		for (SourceCode aSource : sources) {
			assertTrue("Source not contains "+aSource.getFile(),exp1.getSources().contains(aSource));
		}
		SourceCode anotherSC = new SourceCode("source3.java", "pack2");
		assertFalse("Source not contains "+anotherSC,exp1.getSources().contains(anotherSC));
	}
}
