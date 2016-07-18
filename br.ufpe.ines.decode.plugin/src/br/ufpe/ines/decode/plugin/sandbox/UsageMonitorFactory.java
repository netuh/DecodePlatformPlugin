package br.ufpe.ines.decode.plugin.sandbox;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.epp.usagedata.internal.gathering.monitors.BundleUsageMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.CommandUsageMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.LogMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.PartUsageMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.SystemInfoMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.UsageMonitor;

public class UsageMonitorFactory {

	public static List<UsageMonitor> startAllMonitor() {
		List<UsageMonitor> monitors = new LinkedList<UsageMonitor>();
		CommandUsageMonitor commandMonitor = new CommandUsageMonitor();
		commandMonitor.startMonitoring(new SandBoxService());
		monitors.add(commandMonitor);
		
		BundleUsageMonitor bundleMonitor = new BundleUsageMonitor();
		bundleMonitor.startMonitoring(new SandBoxService());
		monitors.add(bundleMonitor);
		
		LogMonitor logMonitor = new LogMonitor();
		logMonitor.startMonitoring(new SandBoxService());
		monitors.add(logMonitor);
		
		PartUsageMonitor partMonitor = new PartUsageMonitor();
		partMonitor.startMonitoring(new SandBoxService());
		monitors.add(partMonitor);
		
		SystemInfoMonitor systemMonitor = new SystemInfoMonitor();
		systemMonitor.startMonitoring(new SandBoxService());
		monitors.add(systemMonitor);
		
		return monitors;
	}

}
