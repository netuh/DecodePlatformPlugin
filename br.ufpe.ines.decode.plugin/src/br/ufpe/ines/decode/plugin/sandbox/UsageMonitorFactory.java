package br.ufpe.ines.decode.plugin.sandbox;

import org.eclipse.epp.usagedata.internal.gathering.monitors.BundleUsageMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.CommandUsageMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.LogMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.PartUsageMonitor;
import org.eclipse.epp.usagedata.internal.gathering.monitors.SystemInfoMonitor;

public class UsageMonitorFactory {

	public static void startAllMonitor() {
		CommandUsageMonitor commandMonitor = new CommandUsageMonitor();
		commandMonitor.startMonitoring(new SandBoxService());
		
		BundleUsageMonitor bundleMonitor = new BundleUsageMonitor();
		bundleMonitor.startMonitoring(new SandBoxService());
		
		LogMonitor logMonitor = new LogMonitor();
		logMonitor.startMonitoring(new SandBoxService());
		
		PartUsageMonitor partMonitor = new PartUsageMonitor();
		partMonitor.startMonitoring(new SandBoxService());
		
		
		SystemInfoMonitor systemMonitor = new SystemInfoMonitor();
		systemMonitor.startMonitoring(new SandBoxService());
	}

}
