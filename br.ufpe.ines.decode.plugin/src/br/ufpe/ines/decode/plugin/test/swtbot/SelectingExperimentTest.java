package br.ufpe.ines.decode.plugin.test.swtbot;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.ufpe.ines.decode.plugin.test.util.TestContants;
import br.ufpe.ines.decode.plugin.util.FileUtil;

@RunWith(SWTBotJunit4ClassRunner.class)
public class SelectingExperimentTest extends SWTBotDECODE {

	protected final String LOAD_NEW_EXPERIMENT_TOOLTIP_LABEL = "Load New Experiment";

	@Test
	public void testCancel() throws Exception {
		defaultInteraction(TestContants.EXPERIMENT1);
		bot.button(BUTTON_LABEL_CANCEL).click();
		testDefaultToolbarStatus();
	}

	@Test
	public void testLoadExperiment1() throws Exception {
		SWTBotTable tab = defaultInteraction(TestContants.EXPERIMENT1);
		tab.select(TestContants.EXPERIMENT1[TestContants.INDEX_EXPERIMENT_ID]);
		bot.button(BUTTON_LABEL_OK).click();
		assertTrue(bot.toolbarButtonWithTooltip(START_EXPERIMENT_TOOLTIP_LABEL).isEnabled());
	}

	@Test
	public void testLoadExperiment2() throws Exception {
		SWTBotTable tab = defaultInteraction(TestContants.EXPERIMENT2);
		tab.select(TestContants.EXPERIMENT2[TestContants.INDEX_EXPERIMENT_ID]);
		bot.button(BUTTON_LABEL_OK).click();
		assertTrue(bot.toolbarButtonWithTooltip(START_EXPERIMENT_TOOLTIP_LABEL).isEnabled());
	}

	@Test
	public void testLoadTwoExperiments() throws Exception {
		defaultInteraction(TestContants.EXPERIMENT1);
		loadNewExperiment(TestContants.EXPERIMENT2[TestContants.INDEX_FILE], BUTTON_LABEL_OK);

		SWTBotTable tab = bot.table();
		assertTrue(tab.containsItem(TestContants.EXPERIMENT1[TestContants.INDEX_EXPERIMENT_ID]));
		assertTrue(tab.containsItem(TestContants.EXPERIMENT2[TestContants.INDEX_EXPERIMENT_ID]));
		
		tab.select(TestContants.EXPERIMENT1[TestContants.INDEX_EXPERIMENT_ID]);
		bot.button(BUTTON_LABEL_OK).click();
		assertTrue(bot.toolbarButtonWithTooltip(START_EXPERIMENT_TOOLTIP_LABEL).isEnabled());
	}
	
	@Test
	public void testCancelNewExperiment() throws Exception {
		testDefaultToolbarStatus();
		bot.toolbarButtonWithTooltip(SELECT_EXPERIMENT_TOOLTIP_LABEL).click();
		loadNewExperiment(TestContants.EXPERIMENT1[TestContants.INDEX_FILE], BUTTON_LABEL_CANCEL);

		SWTBotTable tab = bot.table();
		assertFalse(tab.containsItem(TestContants.EXPERIMENT1[TestContants.INDEX_EXPERIMENT_ID]));
		
		bot.button(BUTTON_LABEL_CANCEL).click();
		testDefaultToolbarStatus();
	}
	
	@Test
	public void testCancelNewExperiment2() throws Exception {
		testDefaultToolbarStatus();
		bot.toolbarButtonWithTooltip(SELECT_EXPERIMENT_TOOLTIP_LABEL).click();
		loadNewExperiment(TestContants.EXPERIMENT1[TestContants.INDEX_FILE], BUTTON_LABEL_CANCEL);

		SWTBotTable tab = bot.table();
		assertFalse(tab.containsItem(TestContants.EXPERIMENT1[TestContants.INDEX_EXPERIMENT_ID]));
		
		bot.button(BUTTON_LABEL_OK).click();
		testDefaultToolbarStatus();
	}

	private SWTBotTable defaultInteraction(String[] experimentDescription) {
		testDefaultToolbarStatus();
		bot.toolbarButtonWithTooltip(SELECT_EXPERIMENT_TOOLTIP_LABEL).click();

		loadNewExperiment(experimentDescription[TestContants.INDEX_FILE], BUTTON_LABEL_OK);

		SWTBotTable tab = bot.table();
		assertTrue(tab.containsItem(experimentDescription[TestContants.INDEX_EXPERIMENT_ID]));
		return tab;
	}

	private void loadNewExperiment(String resourcePath, String buttonName) {
		bot.buttonWithTooltip(LOAD_NEW_EXPERIMENT_TOOLTIP_LABEL).click();
		String filePath = FileUtil.loadResource(resourcePath).getAbsolutePath();

		bot.text().setText(filePath);
		bot.button(buttonName).click();
	}
}
