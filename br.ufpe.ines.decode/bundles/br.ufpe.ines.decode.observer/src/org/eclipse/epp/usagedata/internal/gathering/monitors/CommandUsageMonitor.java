/*******************************************************************************
 * Copyright (c) 2007 The Eclipse Foundation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    The Eclipse Foundation - initial API and implementation
 *******************************************************************************/
package org.eclipse.epp.usagedata.internal.gathering.monitors;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IExecutionListener;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;

import br.ufpe.ines.decode.observer.epp.usagedata.extension.ObservingService;
import br.ufpe.ines.decode.observer.epp.usagedata.extension.actions.ActionCommand;

/**
 * Instances of this class monitor invocations of commands in the workbench.
 * 
 * @author Wayne Beaton
 */
public class CommandUsageMonitor implements UsageMonitor {
	private static final String COMMANDS_EXTENSION_POINT = "org.eclipse.ui.commands"; //$NON-NLS-1$

	/**
	 * The {@link #executionListener} is installed into the
	 * {@link ICommandService} so that it can be notified when a command is
	 * invoked.
	 */
	private IExecutionListener executionListener;

	private ExtensionIdToBundleMapper commandToBundleIdMapper;

	@Override
	public void startMonitoring(final ObservingService usageDataService) {
		executionListener = new IExecutionListener() {
			public void notHandled(String commandId, NotHandledException exception) {
				usageDataService.recordEvent(ActionCommand.NO_HANDLER, commandId, getBundleId(commandId));
			}

			public void postExecuteFailure(String commandId, ExecutionException exception) {
				usageDataService.recordEvent(ActionCommand.FAILED, commandId, getBundleId(commandId));
			}

			public void postExecuteSuccess(String commandId, Object returnValue) {
				usageDataService.recordEvent(ActionCommand.EXECUTED, commandId, getBundleId(commandId));
			}

			public void preExecute(String commandId, ExecutionEvent event) {

			}
		};
		getCommandService().addExecutionListener(executionListener);
		commandToBundleIdMapper = new ExtensionIdToBundleMapper(COMMANDS_EXTENSION_POINT);
	}

	private ICommandService getCommandService() {
		return (ICommandService) PlatformUI.getWorkbench().getAdapter(ICommandService.class);
	}

	@Override
	public void stopMonitoring() {
		ICommandService commandService = getCommandService();
		if (commandService != null)
			commandService.removeExecutionListener(executionListener);
		commandToBundleIdMapper.dispose();
	}

	/**
	 * This method fetches the bundle id (symbolic name) of the bundle that
	 * defines the command, commandId.
	 * 
	 * @param commandId
	 * @return
	 */
	protected synchronized String getBundleId(String commandId) {
		return commandToBundleIdMapper.getBundleId(commandId);
	}
}
