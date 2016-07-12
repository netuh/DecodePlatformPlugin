package br.ufpe.ines.decode.plugin.test.swtbot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotRootMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.dialog.NativeDialogFactory;
import br.ufpe.ines.decode.plugin.model.LoggedAction;
import br.ufpe.ines.decode.plugin.test.util.SWTBotUtils;
//import br.ufpe.ines.decode.plugin.test.util.SWTBotUtils;
import br.ufpe.ines.decode.plugin.util.FileUtil;

@RunWith(SWTBotJunit4ClassRunner.class)
public class FinishExperimentTest {

	private static final String FINISH_EXPERIMENT_LABEL = "Finish Experiment";
	private static Logger logger = LogManager.getLogger(FinishExperimentTest.class);
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

//	@Test
//	public void finishEmptyExperiment() throws Exception {
//		NativeDialogFactory.setMode(NativeDialogFactory.OperationMode.TESTING);
//
//		assertNotNull(FINISH_EXPERIMENT_LABEL+" does not exist", bot.toolbarButtonWithTooltip(FINISH_EXPERIMENT_LABEL));
//		assertFalse(FINISH_EXPERIMENT_LABEL+" enabled", bot.toolbarButtonWithTooltip(FINISH_EXPERIMENT_LABEL).isEnabled());
//		String filePath = FileUtil.loadResource("experimentDesc/experiment1.zip").getAbsolutePath();
//		manager.experimentFromFile2(filePath);
//		bot.toolbarButtonWithTooltip("Select Experiment").click();
//		SWTBotTable tab = bot.table();
//		assertNotNull(tab);
//		tab.select(0);
//		bot.button("OK").click();
//
//		assertFalse(FINISH_EXPERIMENT_LABEL+" enabled", bot.toolbarButtonWithTooltip(FINISH_EXPERIMENT_LABEL).isEnabled());
//		bot.toolbarButtonWithTooltip("Start Experiment").click();
//		bot.button("OK").click();
//		SWTBotToolbarButton buttonFinish = bot.toolbarButtonWithTooltip(FINISH_EXPERIMENT_LABEL);
//		assertTrue(FINISH_EXPERIMENT_LABEL+" enabled", buttonFinish.isEnabled());
//		bot.toolbarButtonWithTooltip(FINISH_EXPERIMENT_LABEL).click();
//		String outFile = "./log/out.txt";
//
//		bot.text().setText(outFile);
//		bot.button("OK").click();
//		
//		File f = new File (outFile);
//		assertTrue(f.exists());
//		logger.debug("path="+f.getAbsolutePath());
//		
//		bot.button("OK").click();
//		
//		BufferedReader br = new BufferedReader( new FileReader(f));
//		
//		Gson gson = new Gson();
//		Type type = new TypeToken<List<LoggedAction>>(){}.getType();
//		List<LoggedAction> actions = gson.fromJson(br, type);
//		assertEquals("list not Empty",0,actions.size());
//	}
	
	@Test
	public void clickOkSelectFirst() throws Exception {
		NativeDialogFactory.setMode(NativeDialogFactory.OperationMode.TESTING);
		
		String filePath = FileUtil.loadResource("experimentDesc/experiment1.zip").getAbsolutePath();
		manager.experimentFromFile2(filePath);
		bot.toolbarButtonWithTooltip("Select Experiment").click();
		SWTBotTable tab = bot.table();
		assertNotNull(tab);
		tab.select(0);
		bot.button("OK").click();
		bot.toolbarButtonWithTooltip("Start Experiment").click();
		bot.button("OK").click();

		SWTBotTree projectTree = SWTBotUtils.selectProject(bot, "NewExperiment1", "Project Explorer");
		SWTBotTreeItem scr = projectTree.expandNode("NewExperiment1", "src");
		SWTBotTreeItem experimentNode = scr.getNode("br.ufpe.ines.decode.experiment1");
		experimentNode.getItems()[0].select();
		SWTBotRootMenu contextMenu = experimentNode.getItems()[0].contextMenu();
		SWTBotMenu runAs = contextMenu.menu("Run As", "1 Java Application");
		runAs.click();
		manager.waitAction();
		
		experimentNode = scr.getNode("br.ufpe.ines.decode.experiment1.pack2");
		experimentNode.getItems()[0].select();
		contextMenu = experimentNode.getItems()[0].contextMenu();
		runAs = contextMenu.menu("Run As", "1 Java Application");
		runAs.click();
		manager.waitAction();
		
		bot.toolbarButtonWithTooltip(FINISH_EXPERIMENT_LABEL).click();
		String outFile = "./log/out2.txt";

		bot.text().setText(outFile);
		bot.button("OK").click();
		
		File f = new File (outFile);
		assertTrue(f.exists());
		logger.debug("path="+f.getAbsolutePath());
		
		bot.button("OK").click();
		
		BufferedReader br = new BufferedReader( new FileReader(f));
		
		Gson gson = new Gson();
		Type type = new TypeToken<List<LoggedAction>>(){}.getType();
		List<LoggedAction> actions = gson.fromJson(br, type);
		assertEquals("list not Empty",2,actions.size());
	}
}