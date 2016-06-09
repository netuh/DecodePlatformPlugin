package br.ufpe.ines.decode.plugin.test.swtbot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotRootMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerActivation;
import org.eclipse.ui.handlers.IHandlerService;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.handlers.StartExperimentHandler;
import br.ufpe.ines.decode.plugin.model.SourceCode;
import br.ufpe.ines.decode.plugin.test.util.SWTBotUtils;
import br.ufpe.ines.decode.plugin.util.FileUtil;

@RunWith(SWTBotJunit4ClassRunner.class)
public class StartExperimentTest {

	//private static Logger logger = LogManager.getLogger(StartExperimentTest.class);
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

	@Test
	public void clickOkSelectFirst() throws Exception {
		assertFalse(bot.toolbarButtonWithTooltip("Start Experiment").isEnabled());
		String filePath = FileUtil.loadResource("experimentDesc/experiment1.zip").getAbsolutePath();
		manager.experimentFromFile2(filePath);
		bot.toolbarButtonWithTooltip("Select Experiment").click();
		SWTBotTable tab = bot.table();
		assertNotNull(tab);
		tab.select(0);
		bot.button("OK").click();
		assertNotNull(manager.getSelectedExperiment());
		bot.toolbarButtonWithTooltip("Start Experiment").click();
		bot.button("OK").click();
		String projectName = manager.getSelectedExperiment().getId();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(projectName);
		assertTrue(project.exists());
		assertTrue(project.getDescription().hasNature(JavaCore.NATURE_ID));
		assertTrue(project.getFolder("bin").exists());
		assertTrue(project.getFolder("src").exists());
		IJavaProject javaProject = (IJavaProject) project.getNature(JavaCore.NATURE_ID);
		assertNotNull(javaProject.getRawClasspath());
		assertEquals("bin", javaProject.getOutputLocation().lastSegment());

		IPackageFragmentRoot src = Arrays.asList(javaProject.getAllPackageFragmentRoots()).stream()
				.filter(obj -> obj.getPath().lastSegment().contains("src")).findFirst().get();
		List<IPackageFragment> elements = Arrays.asList(src.getChildren()).stream()
				.filter(obj -> obj instanceof IPackageFragment).map(IPackageFragment.class::cast)
				.collect(Collectors.toList());
		String projectDomain = manager.getSelectedExperiment().getDomain();
		String [] subPackages = projectDomain.trim().split(Pattern.quote(".")); 
		String fullPackage = subPackages[0];
		final String fullPackageCopy = fullPackage;
		assertTrue(elements.stream().anyMatch(obj -> obj.getHandleIdentifier().contains(fullPackageCopy)));
		for (int i = 1; i < subPackages.length; i++) {
			fullPackage += "."+subPackages[i];
			final String fullPackageCopy2 = fullPackage;
			assertTrue("Package does not contains "+fullPackage, elements.stream().anyMatch(obj -> obj.getHandleIdentifier().contains(fullPackageCopy2)));
			
		}
		final String fullPackageCopy2 = fullPackage;

		for (SourceCode sc : manager.getSelectedExperiment().getSources()) {
			IPackageFragment finalPackage;
			if (sc.getSubPackage() != null){
				final String fullPackageCopy3 = fullPackageCopy2+ "."+sc.getSubPackage();
				finalPackage = elements.stream().filter(obj -> obj.getHandleIdentifier().contains(fullPackageCopy3)).findFirst().get();
			} else {
				finalPackage = elements.stream().filter(obj -> obj.getHandleIdentifier().contains(fullPackageCopy2)).findFirst().get();
				
			}
			ICompilationUnit cu = finalPackage.getCompilationUnit(sc.getFile());
			File f = manager.getFile(manager.getSelectedExperiment().getId(), sc.getFile());
			assertTrue("SourceCode not found "+sc.getFile(),cu.exists());
			String content = new String(Files.readAllBytes(f.toPath()));
			assertTrue("Wrong content for file "+sc.getFile(),cu.getSource().contains(content));
		}
		assertFalse(src.getChildren().length < 2);
		assertTrue(manager.getLoggedActions(manager.getSelectedExperiment()).isEmpty());
		
		SWTBotTree projectTree = SWTBotUtils.selectProject(bot, "NewExperiment1", "Project Explorer");
		SWTBotTreeItem scr = projectTree.expandNode("NewExperiment1", "src");
		SWTBotTreeItem experimentNode = scr.getNode("br.ufpe.ines.decode.experiment1");
		experimentNode.getItems()[0].select();
		SWTBotRootMenu contextMenu = experimentNode.getItems()[0].contextMenu();
		SWTBotMenu runAs = contextMenu.menu("Run As", "1 Java Application");
		runAs.click();
		manager.waitUntilUpdateIsCalled();
		List<String> loggedAction = manager.getLoggedActions(manager.getSelectedExperiment());
		List<LocalDateTime> loggedTime = manager.getLoggedTimes(manager.getSelectedExperiment());
		assertEquals(1, loggedAction.size());
		assertEquals(1, loggedTime.size());
		assertEquals("Source2.java", loggedAction.get(0));
		
		experimentNode = scr.getNode("br.ufpe.ines.decode.experiment1.pack2");
		experimentNode.getItems()[0].select();
		contextMenu = experimentNode.getItems()[0].contextMenu();
		runAs = contextMenu.menu("Run As", "1 Java Application");
		runAs.click();
		manager.waitUntilUpdateIsCalled();
		loggedAction = manager.getLoggedActions(manager.getSelectedExperiment());
		assertEquals(2, loggedAction.size());
		assertEquals(2, loggedTime.size());
		assertEquals("Source1.java", loggedAction.get(1));
		assertEquals("Source2.java", loggedAction.get(0));
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
}
