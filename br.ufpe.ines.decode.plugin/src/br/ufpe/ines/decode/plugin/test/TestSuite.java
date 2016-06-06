package br.ufpe.ines.decode.plugin.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.test.swtbot.SelectingExperimentTest;
import br.ufpe.ines.decode.plugin.test.swtbot.StartExperimentTest;

@RunWith(Suite.class)
@SuiteClasses({ SelectingExperimentTest.class, StartExperimentTest.class, ExperimentManager.class })
public class TestSuite {	
}
