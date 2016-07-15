package br.ufpe.ines.decode.plugin.control.handlers;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import br.ufpe.ines.decode.plugin.control.ExperimentExecutionManager;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class StartExperimentHandler extends AbstractHandler {

	private ExperimentExecutionManager manager = ExperimentExecutionManager.getInstance();
	static final Logger logger = Logger.getLogger(StartExperimentHandler.class);

	/**
	 * The constructor.
	 */
	public StartExperimentHandler() {
		super();
	}
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		manager.startObserving();
//		ILaunchManager mgr = DebugPlugin.getDefault().getLaunchManager();
//		mgr.addLaunchListener(new LaucherListerner());
		return null;
	}

//	/**
//	 * the command has been executed, so extract extract the needed information
//	 * from the application context.
//	 */
//	public Object execute(ExecutionEvent event) throws ExecutionException {
//		
//		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
//		String projectName = EclipseUtil.getAvailableName(manager.getAvailableProjectName());
//		IProject project = root.getProject(projectName);
//		try {
//			project.create(new NullProgressMonitor());
//			project.open(new NullProgressMonitor());
//
//			IJavaProject javaProject = createJavaProject(project);
//			createBin(project, javaProject);
//			fixClasspath(javaProject);
//			createSrc(project, javaProject);
//			ILaunchManager mgr = DebugPlugin.getDefault().getLaunchManager();
//			mgr.addLaunchListener(new LaucherListerner());
//		} catch (CoreException | IOException e) {
//			logger.debug(e.getMessage());
//			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
//			MessageDialog.openInformation(window.getShell(), "CommandLog-Error", "Experiment NOT Created");
//		}
//
//		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
//		MessageDialog.openInformation(window.getShell(), "CommandLog-Ok", "Experiment Started");
//		return null;
//	}
//
//	private IJavaProject createJavaProject(IProject project) throws CoreException {
//		IProjectDescription description = project.getDescription();
//		description.setNatureIds(new String[] { JavaCore.NATURE_ID });
//		project.setDescription(description, new NullProgressMonitor());
//		IJavaProject javaProject = JavaCore.create(project);
//		return javaProject;
//	}
//
//	private void createBin(IProject project, IJavaProject javaProject) throws CoreException, JavaModelException {
//		IFolder binFolder = project.getFolder("bin");
//		binFolder.create(false, true, new NullProgressMonitor());
//		javaProject.setOutputLocation(binFolder.getFullPath(), new NullProgressMonitor());
//	}
//
//	private void fixClasspath(IJavaProject javaProject) throws JavaModelException {
//		List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
//		IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
//		LibraryLocation[] locations = JavaRuntime.getLibraryLocations(vmInstall);
//		for (LibraryLocation element : locations) {
//			entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
//		}
//		javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]),
//				new NullProgressMonitor());
//	}
//
//	private void createSrc(IProject project, IJavaProject javaProject) throws CoreException, JavaModelException, IOException {
//		IFolder sourceFolder = project.getFolder("src");
//		sourceFolder.create(false, true, null);
//		IPackageFragmentRoot root2 = javaProject.getPackageFragmentRoot(sourceFolder);
//		IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
//		IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
//		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
//		newEntries[oldEntries.length] = JavaCore.newSourceEntry(root2.getPath());
//		javaProject.setRawClasspath(newEntries, new NullProgressMonitor());
//		
//		
//		String domainName = manager.getCurrentDomain();
//		IPackageFragment pack = javaProject.getPackageFragmentRoot(sourceFolder).createPackageFragment(domainName, true, null);
//		for (SourceCode sc : manager.getCurrentSources()) {
//			if (sc.getSubPackage() != null) {
//				String subDomainName = domainName+ "."+sc.getSubPackage();
//				IPackageFragment subPack = javaProject.getPackageFragmentRoot(sourceFolder).createPackageFragment(subDomainName, true, null);
//				loadFiles(subPack, sc);
//			} else {
//				loadFiles(pack, sc);
//			}
//		}
//	}
//	
//
//	private void loadFiles(IPackageFragment pack, SourceCode sc) throws IOException, JavaModelException {
//		
//			String content = manager.getDefaultFile(sc.getFile());
//			//String content = new String(Files.readAllBytes(f.toPath()));
//			StringBuffer buffer = new StringBuffer();
//			buffer.append("package " + pack.getElementName() + ";\n");
//			buffer.append("\n");
//			buffer.append("\n");
//			buffer.append(content);
//			
//			pack.createCompilationUnit(sc.getFile(), buffer.toString(), false, null);
//	}
}
