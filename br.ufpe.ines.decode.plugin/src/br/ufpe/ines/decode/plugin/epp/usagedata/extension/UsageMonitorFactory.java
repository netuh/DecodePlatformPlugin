package br.ufpe.ines.decode.plugin.epp.usagedata.extension;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.epp.usagedata.internal.gathering.monitors.BundleUsageMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.CommandUsageMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.LogMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.PartUsageMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.SystemInfoMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.UsageMonitor;

import br.edu.ufpe.ines.decode.taskDescription.measurements.LogType;

public class UsageMonitorFactory {

	public static List<UsageMonitor> startAllMonitor(List<LogType> eList) {
		ObservingService observer = new ObservingService(eList);
		
		
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

}
