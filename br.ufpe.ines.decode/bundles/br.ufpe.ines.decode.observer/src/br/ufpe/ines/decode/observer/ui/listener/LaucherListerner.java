package br.ufpe.ines.decode.observer.ui.listener;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchListener;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;

import br.ufpe.ines.decode.observer.control.ExperimentManager;

public class LaucherListerner implements ILaunchListener {

	@SuppressWarnings("unused")
	private ExperimentManager manager = ExperimentManager.getInstance();
	static final Logger logger = Logger.getLogger(LaucherListerner.class);
	private static Instant lastExecDate=Instant.MIN;
	

//	public LaucherListerner(Experiment selectedExperiment) {
//	}

	public LaucherListerner() {
	}

	@Override
	public void launchRemoved(ILaunch launch) {
		logger.debug("launchRemoved");
	}

	@SuppressWarnings("unused")
	@Override
	public void launchAdded(ILaunch launch) {		
		logger.debug("launchAdded");

		Instant currentLocalDate = ZonedDateTime.now().toInstant();
		if(currentLocalDate.minusMillis(300).isBefore(lastExecDate))
			return;

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		//IProject project = root.getProject(manager.getAvailableProjectName());
		IProject project = root.getProject("test");
		ILaunchConfiguration config = launch.getLaunchConfiguration();
		try {
			IJavaProject javaProject = (IJavaProject) project.getNature(JavaCore.NATURE_ID);
			IFolder sourceFolder = project.getFolder("src");
			IPackageFragmentRoot srcPackage = javaProject.getPackageFragmentRoot(sourceFolder);
			List<IPackageFragment> elements = Arrays.asList(srcPackage.getChildren()).stream()
					.filter(obj -> obj instanceof IPackageFragment).map(IPackageFragment.class::cast)
					.collect(Collectors.toList());
			for (IResource iResource : config.getMappedResources()) {
				for (IPackageFragment iPackageFragment : elements) {
//					Arrays.asList(iPackageFragment.getCompilationUnits())
//							.stream()
//							.filter(p -> p.getResource().equals(iResource))
//							.findFirst().
//							ifPresent(p -> {manager.addAction(p.getElementName(), currentLocalDate);
//							lastExecDate = currentLocalDate;});
//							ifPresent(p -> {manager.addAction(exp,p.getElementName(), currentLocalDate);
//											lastExecDate = currentLocalDate;});
				}
			}
		} catch (CoreException e) {
			logger.debug(e);
			e.printStackTrace();
		}
		logger.debug("launchAdded - End");
	}

	@Override
	public void launchChanged(ILaunch launch) {
		logger.debug("launchChanged");
	}
}
