package br.ufpe.ines.decode.plugin.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ufpe.ines.decode.plugin.test.model.ExperimentManagerTest;
import br.ufpe.ines.decode.plugin.test.model.ExperimentTest;
import br.ufpe.ines.decode.plugin.test.swtbot.FinishExperimentTest;
import br.ufpe.ines.decode.plugin.test.swtbot.SelectingExperimentTest;
import br.ufpe.ines.decode.plugin.test.swtbot.StartExperimentTest;

@RunWith(Suite.class)
@SuiteClasses({ SelectingExperimentTest.class, StartExperimentTest.class,
				ExperimentManagerTest.class, ExperimentTest.class})
public class TestSuite {	
}
