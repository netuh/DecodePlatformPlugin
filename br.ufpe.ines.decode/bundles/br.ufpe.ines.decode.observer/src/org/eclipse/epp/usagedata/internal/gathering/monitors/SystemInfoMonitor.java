/*******************************************************************************
 * Copyright (c) 2009 The Eclipse Foundation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    The Eclipse Foundation - initial API and implementation
 *******************************************************************************/
package org.eclipse.epp.usagedata.internal.gathering.monitors;

import org.eclipse.core.runtime.Platform;

import br.ufpe.ines.decode.observer.epp.usagedata.extension.ObservingService;
import br.ufpe.ines.decode.observer.epp.usagedata.extension.actions.ActionSystemInfo;

/**
 * This monitor captures information about the System. Specifically,
 * we capture:
 * <ul>
 * <li>Operating System</li>
 * <li>System Architecture</li>
 * <li>Window System</li>
 * <li>Locale</li>
 * <li>Number of processors available</li>
 * <li>And a number of system properties</li>
 * 
 */
public class SystemInfoMonitor implements UsageMonitor {
	
	public void startMonitoring(ObservingService usageDataService) {
		/*
		 * If you look deep enough into the call chain, there is some
		 * possibility that these Platform.xxx methods can cause a
		 * runtime exception. We'll catch and log that potential exception.
		 */
		try {
			usageDataService.recordEvent(ActionSystemInfo.INFO_OS, Platform.getOS());
			usageDataService.recordEvent(ActionSystemInfo.INFO_ARCH, Platform.getOSArch());
			usageDataService.recordEvent(ActionSystemInfo.INFO_WS, Platform.getWS());
			usageDataService.recordEvent(ActionSystemInfo.INFO_LOCALE,  Platform.getNL());
		} catch (Exception e) {
			//TODO FIX IT
		}
		
		usageDataService.recordEvent(ActionSystemInfo.INFO_PROCESSORS, String.valueOf(Runtime.getRuntime().availableProcessors()));
		for (Object aProperty : System.getProperties().keySet()) {
			ActionSystemInfo action = ActionSystemInfo.PROPERTY;
			String propertyString = aProperty.toString();
			usageDataService.recordEvent(action, propertyString, System.getProperty(propertyString));
		}
	}

	public void stopMonitoring() {
	}

}
