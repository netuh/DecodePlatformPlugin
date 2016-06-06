package br.ufpe.ines.decode.plugin.test.swtbot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerActivation;
import org.eclipse.ui.handlers.IHandlerService;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.handlers.StartExperimentHandler;

public class StartExperimentTest {

private final String[] EXPERIMENT_IDS = {"Experiment1", "Experiment2"};  
	
	private static SWTWorkbenchBot	bot;
	private ExperimentManager manager = ExperimentManager.getInstance();
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		List<SWTBotView> views=bot.views();
		for (  SWTBotView view : views) {
		    if ("Welcome".equals(view.getTitle())) {
		      view.close();
		    }
		  }
	}
	
	@Test
	public void clickOkSelectFirst() throws Exception {
		assertFalse(bot.toolbarButtonWithTooltip("Start Experiment").isEnabled());
		bot.toolbarButtonWithTooltip("Select Experiment").click();
		SWTBotTable tab = bot.table();
		assertNotNull(tab);
		assertEquals(tab.rowCount(), EXPERIMENT_IDS.length);
		for (int i = 0; i < EXPERIMENT_IDS.length; i++) {
			assertEquals(EXPERIMENT_IDS[i],tab.cell(i, 0));
		}
		tab.select(0);
		bot.button("OK").click();
		assertEquals(EXPERIMENT_IDS[0], manager.getSelectedExperiment().getId());
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
		IJavaProject javaProject = (IJavaProject)project.getNature(JavaCore.NATURE_ID);
		assertNotNull(javaProject.getRawClasspath());
		assertEquals("bin",javaProject.getOutputLocation().lastSegment());
		IClasspathEntry[] rawClasspath = javaProject.getRawClasspath();
        List <IClasspathEntry> list = new LinkedList<IClasspathEntry>(java.util.Arrays.asList(rawClasspath));
        assertTrue(list.stream().anyMatch(
                p -> p.getEntryKind()==IClasspathEntry.CPE_SOURCE &&
                	 p.getPath().lastSegment().equals("src")));

	}
	@Before
	public void populateExperiments(){
		for (String experimentId : EXPERIMENT_IDS) {
			manager.addExperiment(experimentId);			
		}
	}
	
	@After
	public void clearExperiments(){
		manager.cleanExperiment();
		manager.setSelectedExperiment(null);
		//TODO workaround - try to setEnable of the handler
		IWorkbench workbench = PlatformUI.getWorkbench(); 
        IHandlerService handlerService = (IHandlerService) workbench 
                .getService(IHandlerService.class);
        StartExperimentHandler sh = new StartExperimentHandler();
        IHandlerActivation activateHandler = handlerService.activateHandler( 
        		"br.ufpe.ines.decode.plugin.handler.startExperiment", sh); 
        handlerService.deactivateHandler(activateHandler);
	}
}
