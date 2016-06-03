package br.ufpe.ines.decode.plugin.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerActivation;
import org.eclipse.ui.handlers.IHandlerService;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.handlers.SampleHandler;

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
		assertFalse(bot.toolbarButtonWithTooltip("Start Experiment").isEnabled());
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
		assertFalse(bot.toolbarButtonWithTooltip("Start Experiment").isEnabled());
	}
	
	@Test
	public void clickOkEmpty() throws Exception {
		assertFalse(bot.toolbarButtonWithTooltip("Start Experiment").isEnabled());
		bot.toolbarButtonWithTooltip("Select Experiment").click();
		SWTBotTable tab = bot.table();
		assertNotNull(tab);
		assertEquals(tab.rowCount(), EXPERIMENT_IDS.length);
		for (int i = 0; i < EXPERIMENT_IDS.length; i++) {
			assertEquals(EXPERIMENT_IDS[i],tab.cell(i, 0));
		}
		
		bot.button("OK").click();
		assertNull(manager.getSelectedExperiment());
		assertFalse(bot.toolbarButtonWithTooltip("Start Experiment").isEnabled());
	}
	
	@Test
	public void clickOkSelectFirst() throws Exception {
		assertFalse(bot.toolbarButtonWithTooltip("Start Experiment").isEnabled());
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
		assertTrue(bot.toolbarButtonWithTooltip("Start Experiment").isEnabled());
	}
	
	@Test
	public void clickOkSelectSecondAfterFirst() throws Exception {
		assertFalse(bot.toolbarButtonWithTooltip("Start Experiment").isEnabled());
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
		assertTrue(bot.toolbarButtonWithTooltip("Start Experiment").isEnabled());
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
		//TODO workaround - try to setEnable of the handler
		IWorkbench workbench = PlatformUI.getWorkbench(); 
        IHandlerService handlerService = (IHandlerService) workbench 
                .getService(IHandlerService.class);
        SampleHandler sh = new SampleHandler();
        IHandlerActivation activateHandler = handlerService.activateHandler( 
        		"br.ufpe.ines.decode.plugin.handler.startExperiment", sh); 
        handlerService.deactivateHandler(activateHandler);
	}
}
