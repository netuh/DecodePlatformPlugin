package br.ufpe.ines.decode.plugin.test.swtbot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerActivation;
import org.eclipse.ui.handlers.IHandlerService;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.dialog.NativeDialogFactory;
import br.ufpe.ines.decode.plugin.handlers.StartExperimentHandler;
import br.ufpe.ines.decode.plugin.util.FileUtil;

public abstract class SWTBotDECODE {

	private static final Logger logger = Logger.getLogger(SWTBotDECODE.class);

	protected static SWTWorkbenchBot bot;
	protected ExperimentManager manager = ExperimentManager.getInstance();
	protected final String SELECT_EXPERIMENT_TOOLTIP_LABEL = "Select Experiment";
	protected final String START_EXPERIMENT_TOOLTIP_LABEL = "Start Experiment";
	protected final String FINISH_EXPERIMENT_TOOLTIP_LABEL = "Finish Experiment";
	
	protected final String BUTTON_LABEL_OK = "OK";
	protected final String BUTTON_LABEL_CANCEL = "Cancel";
	
	protected List<String> createdProjects;
	
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
		createdProjects = new LinkedList<String>();
	}
	
	@After
	public void deleteProject() {
		if (createdProjects == null)
			return;
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		for (String projectName : createdProjects) {
			IProject project = root.getProject(projectName);
			try {
				project.delete(true, false, null);
			} catch (CoreException e) {
				logger.debug("-cant deleted-");
				logger.debug("erro:"+e.getMessage());
				e.printStackTrace();
			}
			logger.debug("-deleted-");
		}
	}
	
	protected void testDefaultToolbarStatus() {
		assertFalse(bot.toolbarButtonWithTooltip(START_EXPERIMENT_TOOLTIP_LABEL).isEnabled());
		assertFalse(bot.toolbarButtonWithTooltip(FINISH_EXPERIMENT_TOOLTIP_LABEL).isEnabled());
		assertTrue(bot.toolbarButtonWithTooltip(SELECT_EXPERIMENT_TOOLTIP_LABEL).isEnabled());
	}
	
	protected void verifySelectedExperiment(String selectedExperimentId) {
		assertNotNull(manager.getSelectedExperiment());
		assertEquals(selectedExperimentId, manager.getSelectedExperiment().getId());
		assertTrue(bot.toolbarButtonWithTooltip(START_EXPERIMENT_TOOLTIP_LABEL).isEnabled());
	}

	protected void defaultStartExperiment(String selectedExperimentId) throws ArchiveException, IOException {
		testDefaultToolbarStatus();
		String filePath = FileUtil.loadResource(selectedExperimentId).getAbsolutePath();
		manager.experimentFromFile2(filePath);
		bot.toolbarButtonWithTooltip(SELECT_EXPERIMENT_TOOLTIP_LABEL).click();
		SWTBotTable tab = bot.table();
		tab.select(0);
		bot.button(BUTTON_LABEL_OK).click();
		assertNotNull(manager.getSelectedExperiment());
		bot.toolbarButtonWithTooltip(START_EXPERIMENT_TOOLTIP_LABEL).click();
		bot.waitUntil(Conditions.shellIsActive("CommandLog-Ok"));
		bot.button(BUTTON_LABEL_OK).click();
	}
}