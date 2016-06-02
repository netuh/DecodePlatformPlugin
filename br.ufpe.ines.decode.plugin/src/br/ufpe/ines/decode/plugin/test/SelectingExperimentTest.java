package br.ufpe.ines.decode.plugin.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;

@RunWith(SWTBotJunit4ClassRunner.class)
public class SelectingExperimentTest {

	private final String[] EXPERIMENT_IDS = {"Experiment1", "Experiment2"};  
	
	private static SWTWorkbenchBot	bot;
	private ExperimentManager manager = ExperimentManager.getInstance();

	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		List<SWTBotView> views=bot.views();
		for (  SWTBotView view : views) {
		    if ("Welcome".equals(view.getTitle())) {
		      view.close();
		    }
		  }
	}
	
	@Test
	public void clickCancel() throws Exception {
		bot.toolbarButtonWithTooltip("Select Experiment").click();
		SWTBotTable tab = bot.table();
		assertNotNull(tab);
		assertEquals(tab.rowCount(), EXPERIMENT_IDS.length);
		for (int i = 0; i < EXPERIMENT_IDS.length; i++) {
			assertEquals(EXPERIMENT_IDS[i],tab.cell(i, 0));
		}
		tab.select(0);
		tab.select(1);
		bot.button("Cancel").click();
		assertNull(manager.getSelectedExperiment());
	}
	
	@Test
	public void clickOkEmpty() throws Exception {
		bot.toolbarButtonWithTooltip("Select Experiment").click();
		SWTBotTable tab = bot.table();
		assertNotNull(tab);
		assertEquals(tab.rowCount(), EXPERIMENT_IDS.length);
		for (int i = 0; i < EXPERIMENT_IDS.length; i++) {
			assertEquals(EXPERIMENT_IDS[i],tab.cell(i, 0));
		}
		
		bot.button("OK").click();
		assertNull(manager.getSelectedExperiment());
	}
	
	@Test
	public void clickOkSelectFirst() throws Exception {
		bot.toolbarButtonWithTooltip("Select Experiment").click();
		SWTBotTable tab = bot.table();
		assertNotNull(tab);
		assertEquals(tab.rowCount(), EXPERIMENT_IDS.length);
		for (int i = 0; i < EXPERIMENT_IDS.length; i++) {
			assertEquals(EXPERIMENT_IDS[i],tab.cell(i, 0));
		}
		tab.select(0);
		bot.button("OK").click();
		assertEquals(EXPERIMENT_IDS[0], manager.getSelectedExperiment().getExperimentId());
		assertNotNull(manager.getSelectedExperiment());
	}
	
	@Test
	public void clickOkSelectSecondAfterFirst() throws Exception {
		bot.toolbarButtonWithTooltip("Select Experiment").click();
		SWTBotTable tab = bot.table();
		assertNotNull(tab);
		assertEquals(tab.rowCount(), EXPERIMENT_IDS.length);
		for (int i = 0; i < EXPERIMENT_IDS.length; i++) {
			assertEquals(EXPERIMENT_IDS[i],tab.cell(i, 0));
		}
		tab.select(0);
		tab.select(1);
		bot.button("OK").click();
		assertEquals(EXPERIMENT_IDS[1], manager.getSelectedExperiment().getExperimentId());
		assertNotNull(manager.getSelectedExperiment());
	}
	
	@Before
	public void populateExperiments(){
		for (String experimentId : EXPERIMENT_IDS) {
			manager.addExperiment(experimentId);			
		}
	}
	
	@After
	public void clearExperiments(){
		manager.cleanExperiment();
		manager.setSelectedExperiment(null);
	}
}
