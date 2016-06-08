package br.ufpe.ines.decode.plugin.listener;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchListener;

import br.ufpe.ines.decode.plugin.control.ExperimentManager;
import br.ufpe.ines.decode.plugin.model.Experiment;

public class LaucherListerner implements ILaunchListener {

	private ExperimentManager manager = ExperimentManager.getInstance();
	private Experiment exp;
	private List<String> fileNames;
	static final Logger logger = Logger.getLogger(LaucherListerner.class);

	public LaucherListerner(Experiment selectedExperiment) {
		exp = selectedExperiment;
		fileNames = manager.getFiles(exp).stream().map(p -> p.getName())
			    .collect(Collectors.toList());
	}

	@Override
	public void launchRemoved(ILaunch launch) {
		logger.debug("launchRemoved");
	}

	@Override
	public void launchAdded(ILaunch launch) {
		logger.debug("launchAdded");
		logger.debug("FileNames"+fileNames);
//		System.out.println("launchAdded");
//		System.out.println("launchAdded"+ launch.getLaunchMode());
//		System.out.println("launchAdded"+ launch.getLaunchConfiguration().getName());
		ILaunchConfiguration config = launch.getLaunchConfiguration();
		try {
			Arrays.asList(config.getMappedResources())
			.stream()
			.filter(file -> fileNames.contains(file.getName()))
			.findFirst().
			ifPresent(p -> {manager.addAction(exp,p.getName());});
		} catch (CoreException e) {
			logger.debug("Deu ruim");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.debug("launchAdded - End");

	}

	@Override
	public void launchChanged(ILaunch launch) {
		logger.debug("launchChanged");
	}
}
