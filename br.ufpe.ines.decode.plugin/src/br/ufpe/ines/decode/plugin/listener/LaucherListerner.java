package br.ufpe.ines.decode.plugin.listener;

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

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.model.Experiment;

public class LaucherListerner implements ILaunchListener {

	private ExperimentManager manager = ExperimentManager.getInstance();
	private Experiment exp;
	private List<String> fileNames;
	static final Logger logger = Logger.getLogger(LaucherListerner.class);
	private String projectName;

	public LaucherListerner(Experiment selectedExperiment) {
		exp = selectedExperiment;
		fileNames = manager.getFiles(exp).stream().map(p -> p.getName())
			    .collect(Collectors.toList());
		projectName = selectedExperiment.getId();
	}

	@Override
	public void launchRemoved(ILaunch launch) {
		logger.debug("launchRemoved");
	}

	@Override
	public void launchAdded(ILaunch launch) {
		logger.debug("launchAdded");
		logger.debug("FileNames"+fileNames);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(projectName);
		
		
		ILaunchConfiguration config = launch.getLaunchConfiguration();
		try {
			IJavaProject javaProject = (IJavaProject) project.getNature(JavaCore.NATURE_ID);
			IFolder sourceFolder = project.getFolder("src");
			logger.debug("+element+");
			IPackageFragmentRoot srcPackage = javaProject.getPackageFragmentRoot(sourceFolder);
			List<IPackageFragment> elements = Arrays.asList(srcPackage.getChildren()).stream()
					.filter(obj -> obj instanceof IPackageFragment).map(IPackageFragment.class::cast)
					.collect(Collectors.toList());
			for (IResource iResource : config.getMappedResources()) {
				for (IPackageFragment iPackageFragment : elements) {
					Arrays.asList(iPackageFragment.getCompilationUnits())
							.stream()
							.filter(p -> p.getResource().equals(iResource))
							.findFirst().
							ifPresent(p -> {manager.addAction(exp,p.getElementName());});
				}
			}
		} catch (CoreException e) {
			logger.debug("Deu Ruim");
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
