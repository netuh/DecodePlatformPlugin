package br.ufpe.ines.decode.plugin.handlers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.listener.LaucherListerner;
import br.ufpe.ines.decode.plugin.model.SourceCode;
import br.ufpe.ines.decode.plugin.util.EclipseUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class StartExperimentHandler extends AbstractHandler {

	private ExperimentManager manager = ExperimentManager.getInstance();
	static final Logger logger = Logger.getLogger(StartExperimentHandler.class);

	/**
	 * The constructor.
	 */
	public StartExperimentHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		String projectName = EclipseUtil.getAvailableName(manager.getSelectedExperiment().getId());
		IProject project = root.getProject(projectName);
		try {
			project.create(new NullProgressMonitor());
			project.open(new NullProgressMonitor());

			IJavaProject javaProject = createJavaProject(project);
			createBin(project, javaProject);
			fixClasspath(javaProject);
			createSrc(project, javaProject);
			ILaunchManager mgr = DebugPlugin.getDefault().getLaunchManager();
			mgr.addLaunchListener(new LaucherListerner(manager.getSelectedExperiment()));
		} catch (CoreException | IOException e) {
			logger.debug(e.getMessage());
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			MessageDialog.openInformation(window.getShell(), "CommandLog-Error", "Experiment NOT Created");
		}

		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(window.getShell(), "CommandLog-Ok", "Experiment Started");
		manager.startSelected(projectName);
		return null;
	}

	private IJavaProject createJavaProject(IProject project) throws CoreException {
		IProjectDescription description = project.getDescription();
		description.setNatureIds(new String[] { JavaCore.NATURE_ID });
		project.setDescription(description, new NullProgressMonitor());
		IJavaProject javaProject = JavaCore.create(project);
		return javaProject;
	}

	private void createBin(IProject project, IJavaProject javaProject) throws CoreException, JavaModelException {
		IFolder binFolder = project.getFolder("bin");
		binFolder.create(false, true, new NullProgressMonitor());
		javaProject.setOutputLocation(binFolder.getFullPath(), new NullProgressMonitor());
	}

	private void fixClasspath(IJavaProject javaProject) throws JavaModelException {
		List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
		IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
		LibraryLocation[] locations = JavaRuntime.getLibraryLocations(vmInstall);
		for (LibraryLocation element : locations) {
			entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
		}
		javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]),
				new NullProgressMonitor());
	}

	private void createSrc(IProject project, IJavaProject javaProject) throws CoreException, JavaModelException, IOException {
		IFolder sourceFolder = project.getFolder("src");
		sourceFolder.create(false, true, null);
		IPackageFragmentRoot root2 = javaProject.getPackageFragmentRoot(sourceFolder);
		IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries[oldEntries.length] = JavaCore.newSourceEntry(root2.getPath());
		javaProject.setRawClasspath(newEntries, new NullProgressMonitor());
		
		
		String domainName = manager.getSelectedExperiment().getDomain();
		IPackageFragment pack = javaProject.getPackageFragmentRoot(sourceFolder).createPackageFragment(domainName, true, null);
		for (SourceCode sc : manager.getSelectedExperiment().getSources()) {
			if (sc.getSubPackage() != null) {
				String subDomainName = domainName+ "."+sc.getSubPackage();
				IPackageFragment subPack = javaProject.getPackageFragmentRoot(sourceFolder).createPackageFragment(subDomainName, true, null);
				loadFiles(subPack, sc);
			} else {
				loadFiles(pack, sc);
			}
		}
	}
	

	private void loadFiles(IPackageFragment pack, SourceCode sc) throws IOException, JavaModelException {
		
			String content = manager.getDefaultFile(manager.getSelectedExperiment().getId(), sc.getFile());
			//String content = new String(Files.readAllBytes(f.toPath()));
			StringBuffer buffer = new StringBuffer();
			buffer.append("package " + pack.getElementName() + ";\n");
			buffer.append("\n");
			buffer.append("\n");
			buffer.append(content);
			
			pack.createCompilationUnit(sc.getFile(), buffer.toString(), false, null);
	}
}
