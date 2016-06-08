package br.ufpe.ines.decode.plugin.test.util;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.utils.TableCollection;
import org.eclipse.swtbot.swt.finder.utils.TableRow;
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotList;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;

public class SWTBotUtils {

	/**
	 * Gets a view by name. It assumes the view MUST be opened, although not
	 * necessarily active. Open the view first if necessary.
	 * 
	 * @return Active, focused explorer view
	 */
	public static SWTBotView getView(SWTWorkbenchBot bot, String name) {
		SWTBotView explorer = bot.viewByTitle(name);
		explorer.setFocus();
		return explorer;
	}

	/**
	 * Selects a project in the currently opened view. A view must be opened
	 * prior to using this method.
	 * 
	 * @param projectName
	 * @return
	 */
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

	/**
	 * Sometimes widgets respond slowly to selection and key presses. Use this
	 * method to wait for a selection to become what you expect it to be.
	 * Otherwise, trying to proceed will probably fail the test.
	 */
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

	/**
	 * Wait for a selection to become what you expect it to be. This method
	 * assumes a SWTBotTree that only has a single column selection.
	 */
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
}
