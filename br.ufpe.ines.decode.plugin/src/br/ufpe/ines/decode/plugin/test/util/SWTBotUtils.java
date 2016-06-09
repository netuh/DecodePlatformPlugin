package br.ufpe.ines.decode.plugin.test.util;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.utils.TableCollection;
import org.eclipse.swtbot.swt.finder.utils.TableRow;
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotList;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;

public class SWTBotUtils {

	public static SWTBotView getView(SWTWorkbenchBot bot, String name) {
		SWTBotView explorer = bot.viewByTitle(name);
		explorer.setFocus();
		return explorer;
	}

	public static SWTBotTree selectProject(SWTWorkbenchBot bot, String projectName, String viewName) {

		SWTBotView explorer = getView(bot, viewName);
		SWTBotTree tree = explorer.bot().tree();
		if (projectName != null) {
			tree.select(projectName);
			waitForSelection(bot, projectName, tree);
			return tree;
		} else {
			tree.select(new String[0]);
			waitForSelection(bot, "", tree);
			return tree;
		}
	}

	public static void waitForSelection(SWTWorkbenchBot bot, final String expected, final SWTBotList list) {
		bot.waitUntil(new DefaultCondition() {
			public boolean test() throws Exception {
				String selection = getSelection();
				return expected.equals(selection);
			}

			private String getSelection() {
				String[] selections = list.selection();
				String selection = null;
				if (selections.length == 1)
					selection = selections[0];
				return selection;
			}

			public String getFailureMessage() {
				return "Was expecting selection '" + expected + " but found '" + getSelection() + "'";
			}
		});
	}

	public static void waitForSelection(SWTWorkbenchBot bot, final String expected, final SWTBotTree tree) {
		bot.waitUntil(new DefaultCondition() {
			public boolean test() throws Exception {
				String selection = getSelection(tree);
				return expected.equals(selection);
			}

			public String getFailureMessage() {
				return "Was expecting selection \n----\n" + expected + "\n----\nbut found \n----\n" + getSelection(tree)
						+ "\n-----";
			}
		});
	}

	public static String getSelection(SWTBotTree tree) {
		TableCollection selections = tree.selection();
		String selection = "";
		for (int r = 0; r < selections.rowCount(); r++) {
			if (r > 0)
				selection += "\n";
			TableRow row = selections.get(r);
			for (int c = 0; c < row.columnCount(); c++) {
				if (c > 0)
					selection += " >> ";
				selection += row.get(c);
			}
		}
		return selection;
	}
	
	public static boolean findInTable(SWTBotTable tab, String experimentId) {
		for (int i = 0; i < tab.rowCount(); i++) {
			if (tab.cell(i, 0).equals(experimentId))
				return true;
		}
		return false;
	}
}
