package br.ufpe.ines.decode.plugin.test.swtbot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerActivation;
import org.eclipse.ui.handlers.IHandlerService;
import org.junit.Before;
import org.junit.BeforeClass;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.dialog.NativeDialogFactory;
import br.ufpe.ines.decode.plugin.handlers.StartExperimentHandler;

public abstract class SWTBotDECODE {

	protected static SWTWorkbenchBot bot;
	protected ExperimentManager manager = ExperimentManager.getInstance();
	protected final String SELECT_EXPERIMENT_TOOLTIP_LABEL = "Select Experiment";
	protected final String START_EXPERIMENT_TOOLTIP_LABEL = "Start Experiment";
	protected final String FINISH_EXPERIMENT_TOOLTIP_LABEL = "Finish Experiment";
	
	protected final String BUTTON_LABEL_OK = "OK";
	protected final String BUTTON_LABEL_CANCEL = "Cancel";
	
	protected static final String[] EXPERIMENT1 = { "./experimentDesc/experiment1.zip", "NewExperiment1"};
	protected static final String[] EXPERIMENT2 = { "./experimentDesc/experiment2.zip", "NewExperiment2"};
	
	protected static final int INDEX_FILE = 0;
	protected static final int INDEX_PROJECT_NAME = 1;
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		List<SWTBotView> views = bot.views();
		for (SWTBotView view : views) {
			if ("Welcome".equals(view.getTitle())) {
				view.close();
			}
		}
		NativeDialogFactory.setMode(NativeDialogFactory.OperationMode.TESTING);
	}
	
	@Before
	public void clearExperiments() {
		manager.cleanExperiment();
		IWorkbench workbench = PlatformUI.getWorkbench();
		IHandlerService handlerService = (IHandlerService) workbench.getService(IHandlerService.class);
		StartExperimentHandler sh = new StartExperimentHandler();
		IHandlerActivation startHandler = handlerService
				.activateHandler("br.ufpe.ines.decode.plugin.handler.startExperiment", sh);
		handlerService.deactivateHandler(startHandler);
		IHandlerActivation finishHandler = handlerService
				.activateHandler("br.ufpe.ines.decode.plugin.handler.finishExperiment", sh);
		handlerService.deactivateHandler(finishHandler);
	}
	
	public void testDefaultToolbarStatus() {
		assertFalse(bot.toolbarButtonWithTooltip(START_EXPERIMENT_TOOLTIP_LABEL).isEnabled());
		assertFalse(bot.toolbarButtonWithTooltip(FINISH_EXPERIMENT_TOOLTIP_LABEL).isEnabled());
		assertTrue(bot.toolbarButtonWithTooltip(SELECT_EXPERIMENT_TOOLTIP_LABEL).isEnabled());
	}
	
	protected void verifySelectedExperiment(String selectedExperimentId) {
		assertNotNull(manager.getSelectedExperiment());
		assertEquals(selectedExperimentId, manager.getSelectedExperiment().getId());
		assertTrue(bot.toolbarButtonWithTooltip(START_EXPERIMENT_TOOLTIP_LABEL).isEnabled());
	}
}
