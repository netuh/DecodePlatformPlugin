package br.ufpe.ines.decode.plugin.test.swtbot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotRootMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.ufpe.ines.decode.plugin.model.SourceCode;
import br.ufpe.ines.decode.plugin.test.util.SWTBotUtils;
import br.ufpe.ines.decode.plugin.test.util.TestContants;

@RunWith(SWTBotJunit4ClassRunner.class)
public class StartExperimentTest extends SWTBotDECODE {

	private static final String ACTION_JAVA_APPLICATION = "1 Java Application";
	private static final String ACTION_RUN_AS = "Run As";
	private static final String VIEW_PROJECT_EXPLORER = "Project Explorer";
	private static final String FOLDER_BIN = "bin";
	private static final String FOLDER_SRC = "src";

	@Test
	public void clickOkSelectFirst() throws Exception {
		defaultStartExperiment(TestContants.EXPERIMENT1[TestContants.INDEX_FILE]);

		testContent(TestContants.EXPERIMENT1[TestContants.INDEX_EXPERIMENT_ID],
				TestContants.EXPERIMENT1[TestContants.INDEX_DOMAIN]);

		runElement(TestContants.EXPERIMENT1[TestContants.INDEX_EXPERIMENT_ID],
				TestContants.EXPERIMENT1[TestContants.INDEX_DOMAIN]);
		List<String> loggedAction = manager.getLoggedActions();
		List<Instant> loggedTime = manager.getLoggedTimes();
		assertEquals(1, loggedAction.size());
		assertEquals(1, loggedTime.size());
		assertEquals("Source2.java", loggedAction.get(0));

		runElement(TestContants.EXPERIMENT1[TestContants.INDEX_EXPERIMENT_ID],
				TestContants.EXPERIMENT1[TestContants.INDEX_DOMAIN]+".pack2");
		List<String> loggedAction2 = manager.getLoggedActions();
		List<Instant> loggedTime2 = manager.getLoggedTimes();
		assertEquals(2, loggedAction2.size());
		assertEquals(2, loggedTime2.size());
		assertEquals("Source1.java", loggedAction2.get(1));
		assertEquals("Source2.java", loggedAction2.get(0));
		createdProjects.add(TestContants.EXPERIMENT1[TestContants.INDEX_EXPERIMENT_ID]);
	}
	
	@Test
	public void clickOkRun3() throws Exception {
		defaultStartExperiment(TestContants.EXPERIMENT1[TestContants.INDEX_FILE]);

		testContent(TestContants.EXPERIMENT1[TestContants.INDEX_EXPERIMENT_ID],
				TestContants.EXPERIMENT1[TestContants.INDEX_DOMAIN]);

		runElement(TestContants.EXPERIMENT1[TestContants.INDEX_EXPERIMENT_ID],
				TestContants.EXPERIMENT1[TestContants.INDEX_DOMAIN]);
		List<String> loggedAction = manager.getLoggedActions();
		List<Instant> loggedTime = manager.getLoggedTimes();
		assertEquals(1, loggedAction.size());
		assertEquals(1, loggedTime.size());
		assertEquals("Source2.java", loggedAction.get(0));

		runElement(TestContants.EXPERIMENT1[TestContants.INDEX_EXPERIMENT_ID],
				TestContants.EXPERIMENT1[TestContants.INDEX_DOMAIN]+".pack2");
		List<String> loggedAction2 = manager.getLoggedActions();
		List<Instant> loggedTime2 = manager.getLoggedTimes();
		assertEquals(2, loggedAction2.size());
		assertEquals(2, loggedTime2.size());
		assertEquals("Source1.java", loggedAction2.get(1));
		assertEquals("Source2.java", loggedAction2.get(0));
		createdProjects.add(TestContants.EXPERIMENT1[TestContants.INDEX_EXPERIMENT_ID]);
		
		runElement(TestContants.EXPERIMENT1[TestContants.INDEX_EXPERIMENT_ID],
				TestContants.EXPERIMENT1[TestContants.INDEX_DOMAIN]+".pack4");
		List<String> loggedAction3 = manager.getLoggedActions();
		List<Instant> loggedTime3 = manager.getLoggedTimes();
		assertEquals(3, loggedAction3.size());
		assertEquals(3, loggedTime3.size());
		assertEquals("Source3.java", loggedAction3.get(2));
		assertEquals("Source1.java", loggedAction3.get(1));
		assertEquals("Source2.java", loggedAction3.get(0));
		createdProjects.add(TestContants.EXPERIMENT1[TestContants.INDEX_EXPERIMENT_ID]);
	}
	
	@Test
	public void clickOkSelectEmpty() throws Exception {
		defaultStartExperiment(TestContants.EXPERIMENT1[TestContants.INDEX_FILE]);

		testContent(TestContants.EXPERIMENT1[TestContants.INDEX_EXPERIMENT_ID],
				TestContants.EXPERIMENT1[TestContants.INDEX_DOMAIN]);

		List<String> loggedAction2 = manager.getLoggedActions();
		List<Instant> loggedTime2 = manager.getLoggedTimes();
		assertEquals(0, loggedAction2.size());
		assertEquals(0, loggedTime2.size());
		createdProjects.add(TestContants.EXPERIMENT1[TestContants.INDEX_EXPERIMENT_ID]);
	}

	private void runElement(String projectName, String projectDomain) throws InterruptedException {
		SWTBotTree projectTree = SWTBotUtils.selectProject(bot, projectName, VIEW_PROJECT_EXPLORER);
		SWTBotTreeItem scr = projectTree.expandNode(projectName, FOLDER_SRC);
		SWTBotTreeItem experimentNode = scr.getNode(projectDomain);
		experimentNode.getItems()[0].select();
		SWTBotRootMenu contextMenu = experimentNode.getItems()[0].contextMenu();
		SWTBotMenu runAs = contextMenu.menu(ACTION_RUN_AS, ACTION_JAVA_APPLICATION);
		runAs.click();
		manager.waitAction();
	}

	private void testContent(String projectName, String projectDomain) throws IOException, CoreException {
		IJavaProject javaProject = testElementarProject(projectName);
		IPackageFragmentRoot src = Arrays.asList(javaProject.getAllPackageFragmentRoots()).stream()
				.filter(obj -> obj.getPath().lastSegment().contains(FOLDER_SRC)).findFirst().get();
		List<IPackageFragment> elements = Arrays.asList(src.getChildren()).stream()
				.filter(obj -> obj instanceof IPackageFragment).map(IPackageFragment.class::cast)
				.collect(Collectors.toList());
		String fullPackageCopy2 = testPackage(elements, projectDomain);

		for (SourceCode sc : manager.getCurrentSources()) {
			final String fullPackageCopy = sc.getSubPackage() != null ?
					fullPackageCopy2 + "." + sc.getSubPackage()
					: fullPackageCopy2;
			IPackageFragment finalPackage = elements.stream()
					.filter(obj -> obj.getHandleIdentifier().contains(fullPackageCopy)).findFirst().get();
			ICompilationUnit cu = finalPackage.getCompilationUnit(sc.getFile());
			assertTrue("SourceCode not found " + sc.getFile(), cu.exists());
			String content = manager.getDefaultFile(sc.getFile());
			//String content = new String(Files.readAllBytes(f.toPath()));
			assertTrue("Wrong content for file " + sc.getFile(), cu.getSource().contains(content));
		}
		assertFalse(src.getChildren().length < 2);
		assertTrue(manager.getLoggedActions().isEmpty());
	}

	private String testPackage(List<IPackageFragment> elements, String projectDomain) {
		String[] subPackages = projectDomain.trim().split(Pattern.quote("."));
		String fullPackage = subPackages[0];
		final String fullPackageCopy = fullPackage;
		assertTrue(elements.stream().anyMatch(obj -> obj.getHandleIdentifier().contains(fullPackageCopy)));
		for (int i = 1; i < subPackages.length; i++) {
			fullPackage += "." + subPackages[i];
			final String fullPackageCopy2 = fullPackage;
			assertTrue(elements.stream().anyMatch(obj -> obj.getHandleIdentifier().endsWith(fullPackageCopy2)));
		}
		return fullPackage;
	}

	private IJavaProject testElementarProject(String projectName) throws CoreException, JavaModelException {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(projectName);
		assertTrue(project.exists());
		assertTrue(project.getDescription().hasNature(JavaCore.NATURE_ID));
		assertTrue(project.getFolder(FOLDER_BIN).exists());
		assertTrue(project.getFolder(FOLDER_SRC).exists());
		IJavaProject javaProject = (IJavaProject) project.getNature(JavaCore.NATURE_ID);
		assertNotNull(javaProject.getRawClasspath());
		assertEquals(FOLDER_BIN, javaProject.getOutputLocation().lastSegment());
		return javaProject;
	}
}
