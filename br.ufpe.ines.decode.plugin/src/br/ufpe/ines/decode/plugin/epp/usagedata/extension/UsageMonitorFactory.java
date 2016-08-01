package br.ufpe.ines.decode.plugin.epp.usagedata.extension;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.epp.usagedata.internal.gathering.monitors.BundleUsageMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.CommandUsageMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.LogMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.PartUsageMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.StartFinishMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.SystemInfoMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.UsageMonitor;

import br.edu.ufpe.ines.decode.taskDescription.measurements.LogType;
import br.ufpe.ines.decode.plugin.model.CurrentExecutableTask;

public class UsageMonitorFactory {

	public static List<UsageMonitor> startAllMonitor(List<LogType> eList, CurrentExecutableTask task) {
		ObservingService observer = new ObservingService(eList, task);

		List<UsageMonitor> monitors = new LinkedList<UsageMonitor>();
		CommandUsageMonitor commandMonitor = new CommandUsageMonitor();
		commandMonitor.startMonitoring(observer);
		monitors.add(commandMonitor);
		
		BundleUsageMonitor bundleMonitor = new BundleUsageMonitor();
		bundleMonitor.startMonitoring(observer);
		monitors.add(bundleMonitor);
		
		LogMonitor logMonitor = new LogMonitor();
		logMonitor.startMonitoring(observer);
		monitors.add(logMonitor);
		
		PartUsageMonitor partMonitor = new PartUsageMonitor();
		partMonitor.startMonitoring(observer);
		monitors.add(partMonitor);
		
		SystemInfoMonitor systemMonitor = new SystemInfoMonitor();
		systemMonitor.startMonitoring(observer);
		monitors.add(systemMonitor);
		
		return monitors;
	}

	public static Collection<? extends UsageMonitor> startFinalTaskMonitor(List<LogType> actions,
			CurrentExecutableTask task) {
		ObservingService observer = new ObservingService(actions, task);

		List<UsageMonitor> monitors = new LinkedList<UsageMonitor>();
		StartFinishMonitor systemMonitor = new StartFinishMonitor();
		systemMonitor.startMonitoring(observer);
		monitors.add(systemMonitor);
		return monitors;
	}

}
