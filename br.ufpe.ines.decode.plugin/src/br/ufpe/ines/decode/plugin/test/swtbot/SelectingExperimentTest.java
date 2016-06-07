package br.ufpe.ines.decode.plugin.test.swtbot;

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
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.dialog.NativeDialogFactory;
import br.ufpe.ines.decode.plugin.handlers.StartExperimentHandler;
import br.ufpe.ines.decode.plugin.util.FileUtil;

@RunWith(SWTBotJunit4ClassRunner.class)
public class SelectingExperimentTest {

	private final String SELECT_EXPERIMENT_LABEL = "Select Experiment";
	private final String START_EXPERIMENT_LABEL = "Start Experiment";
	private final String CANCEL_LABEL = "Cancel";
	private final String OK_LABEL = "OK";

	private static SWTWorkbenchBot bot;
	private ExperimentManager manager = ExperimentManager.getInstance();

	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		List<SWTBotView> views = bot.views();
		for (SWTBotView view : views) {
			if ("Welcome".equals(view.getTitle())) {
				view.close();
			}
		}
	}

	@After
	public void clearExperiments() {
		manager.cleanExperiment();
		manager.setSelectedExperiment(null);
		IWorkbench workbench = PlatformUI.getWorkbench();
		IHandlerService handlerService = (IHandlerService) workbench.getService(IHandlerService.class);
		StartExperimentHandler sh = new StartExperimentHandler();
		IHandlerActivation activateHandler = handlerService
				.activateHandler("br.ufpe.ines.decode.plugin.handler.startExperiment", sh);
		handlerService.deactivateHandler(activateHandler);
	}

	@Test
	public void testLoadButtonCancel() throws Exception {
		NativeDialogFactory.setMode(NativeDialogFactory.OperationMode.TESTING);

		testButtonsAndClick();
		testPopUpFile("experimentDesc/experiment1.zip", "OK");

		SWTBotTable tab = bot.table();
		assertTrue("id not found," + "NewExperiment1", findInTable(tab, "NewExperiment1"));
		bot.button(CANCEL_LABEL).click();
		verifyNotSelected();
	}


	@Test
	public void testLoadButtonOK1() throws Exception {
		NativeDialogFactory.setMode(NativeDialogFactory.OperationMode.TESTING);
		testButtonsAndClick();

		testPopUpFile("experimentDesc/experiment1.zip", "OK");

		SWTBotTable tab = bot.table();
		String newExperimentId = "NewExperiment1";
		assertTrue("id not found," + newExperimentId, findInTable(tab, newExperimentId));
		tab.select(newExperimentId);
		bot.button(OK_LABEL).click();
		verifySelected(newExperimentId);
	}
	
	@Test
	public void testLoadButtonOK2() throws Exception {
		NativeDialogFactory.setMode(NativeDialogFactory.OperationMode.TESTING);

		testButtonsAndClick();
		testPopUpFile("experimentDesc/experiment2.zip", "OK");

		SWTBotTable tab = bot.table();
		String newExperimentId = "NewExperiment2";
		assertTrue("id not found," + newExperimentId, findInTable(tab, newExperimentId));
		tab.select(newExperimentId);
		bot.button(OK_LABEL).click();
		verifySelected(newExperimentId);
	}
	
	@Test
	public void testLoadButtonCancel1() throws Exception {
		NativeDialogFactory.setMode(NativeDialogFactory.OperationMode.TESTING);
		testButtonsAndClick();

		testPopUpFile("experimentDesc/experiment1.zip", "Cancel");

		SWTBotTable tab = bot.table();
		String newExperimentId = "NewExperiment1";
		assertFalse("id not found," + newExperimentId, findInTable(tab, newExperimentId));
		bot.button(CANCEL_LABEL).click();
		verifyNotSelected();
	}

	private boolean findInTable(SWTBotTable tab, String experimentId) {
		for (int i = 0; i < tab.rowCount(); i++) {
			if (tab.cell(i, 0).equals(experimentId))
				return true;
		}
		return false;
	}

	private void verifySelected(String selectedExperimentId) {
		assertEquals(selectedExperimentId, manager.getSelectedExperiment().getId());
		assertNotNull(manager.getSelectedExperiment());
		assertTrue(bot.toolbarButtonWithTooltip(START_EXPERIMENT_LABEL).isEnabled());
	}

	private void testButtonsAndClick() {
		assertFalse("Start Button not enabled", bot.toolbarButtonWithTooltip(START_EXPERIMENT_LABEL).isEnabled());
		assertTrue("Select Button enabled", bot.toolbarButtonWithTooltip(SELECT_EXPERIMENT_LABEL).isEnabled());
		bot.toolbarButtonWithTooltip(SELECT_EXPERIMENT_LABEL).click();
		assertNotNull(bot.buttonWithTooltip("Load New Experiment"));
	}
	
	private void testPopUpFile(String resourcePath, String buttonName) {
		bot.buttonWithTooltip("Load New Experiment").click();
		String filePath = FileUtil.loadResource(resourcePath).getAbsolutePath();

		bot.text().setText(filePath);
		bot.button(buttonName).click();
	}

	private void verifyNotSelected() {
		assertNull(manager.getSelectedExperiment());
		assertFalse(bot.toolbarButtonWithTooltip(START_EXPERIMENT_LABEL).isEnabled());
	}
}
