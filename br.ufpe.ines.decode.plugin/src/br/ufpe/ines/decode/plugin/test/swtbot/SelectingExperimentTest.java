package br.ufpe.ines.decode.plugin.test.swtbot;

import static org.junit.Assert.*;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.ufpe.ines.decode.plugin.util.FileUtil;

@RunWith(SWTBotJunit4ClassRunner.class)
public class SelectingExperimentTest extends SWTBotDECODE {

	protected final String LOAD_NEW_EXPERIMENT_TOOLTIP_LABEL = "Load New Experiment";

	@Test
	public void testCancel() throws Exception {
		defaultInteraction(EXPERIMENT1);
		bot.button(BUTTON_LABEL_CANCEL).click();
		assertNull(manager.getSelectedExperiment());
		testDefaultToolbarStatus();
	}

	@Test
	public void testLoadExperiment1() throws Exception {
		SWTBotTable tab = defaultInteraction(EXPERIMENT1);
		tab.select(EXPERIMENT1[INDEX_PROJECT_NAME]);
		bot.button(BUTTON_LABEL_OK).click();
		verifySelectedExperiment(EXPERIMENT1[INDEX_PROJECT_NAME]);
	}

	@Test
	public void testLoadExperiment2() throws Exception {
		SWTBotTable tab = defaultInteraction(EXPERIMENT2);
		tab.select(EXPERIMENT2[INDEX_PROJECT_NAME]);
		bot.button(BUTTON_LABEL_OK).click();
		verifySelectedExperiment(EXPERIMENT2[INDEX_PROJECT_NAME]);
	}

	@Test
	public void testLoadTwoExperiments() throws Exception {
		defaultInteraction(EXPERIMENT1);
		loadNewExperiment(EXPERIMENT2[INDEX_FILE], BUTTON_LABEL_OK);

		SWTBotTable tab = bot.table();
		assertTrue(tab.containsItem(EXPERIMENT1[INDEX_PROJECT_NAME]));
		assertTrue(tab.containsItem(EXPERIMENT2[INDEX_PROJECT_NAME]));
		
		tab.select(EXPERIMENT1[INDEX_PROJECT_NAME]);
		bot.button(BUTTON_LABEL_OK).click();
		verifySelectedExperiment(EXPERIMENT1[INDEX_PROJECT_NAME]);
	}
	
	@Test
	public void testCancelNewExperiment() throws Exception {
		testDefaultToolbarStatus();
		bot.toolbarButtonWithTooltip(SELECT_EXPERIMENT_TOOLTIP_LABEL).click();
		loadNewExperiment(EXPERIMENT1[INDEX_FILE], BUTTON_LABEL_CANCEL);

		SWTBotTable tab = bot.table();
		assertFalse(tab.containsItem(EXPERIMENT1[INDEX_PROJECT_NAME]));
		
		bot.button(BUTTON_LABEL_CANCEL).click();
		testDefaultToolbarStatus();
	}
	
	@Test
	public void testCancelNewExperiment2() throws Exception {
		testDefaultToolbarStatus();
		bot.toolbarButtonWithTooltip(SELECT_EXPERIMENT_TOOLTIP_LABEL).click();
		loadNewExperiment(EXPERIMENT1[INDEX_FILE], BUTTON_LABEL_CANCEL);

		SWTBotTable tab = bot.table();
		assertFalse(tab.containsItem(EXPERIMENT1[INDEX_PROJECT_NAME]));
		
		bot.button(BUTTON_LABEL_OK).click();
		testDefaultToolbarStatus();
	}

	private SWTBotTable defaultInteraction(String[] experimentDescription) {
		testDefaultToolbarStatus();
		bot.toolbarButtonWithTooltip(SELECT_EXPERIMENT_TOOLTIP_LABEL).click();

		loadNewExperiment(experimentDescription[INDEX_FILE], BUTTON_LABEL_OK);

		SWTBotTable tab = bot.table();
		assertTrue(tab.containsItem(experimentDescription[INDEX_PROJECT_NAME]));
		return tab;
	}

	private void loadNewExperiment(String resourcePath, String buttonName) {
		bot.buttonWithTooltip(LOAD_NEW_EXPERIMENT_TOOLTIP_LABEL).click();
		String filePath = FileUtil.loadResource(resourcePath).getAbsolutePath();

		bot.text().setText(filePath);
		bot.button(buttonName).click();
	}
}
