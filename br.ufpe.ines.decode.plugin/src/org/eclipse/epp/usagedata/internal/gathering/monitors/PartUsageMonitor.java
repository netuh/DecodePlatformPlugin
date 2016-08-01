/*******************************************************************************
 * Copyright (c) 2008 The Eclipse Foundation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    The Eclipse Foundation - initial API and implementation
 *******************************************************************************/
package org.eclipse.epp.usagedata.internal.gathering.monitors;

import org.eclipse.ui.IPageListener;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveListener;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import br.ufpe.ines.decode.plugin.epp.usagedata.extension.ObservingService;
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions.ActionPart;

/**
 * Instances of the {@link PartUsageMonitor} class monitor the use of parts in
 * the workbench. More specifically, it is notified whenever a view or editor is
 * opened, closed, activated (given focus), etc. and sends some of these events
 * to the UsageDataService. In the spirit of doing far too much in one place,
 * instances also monitor opening, closing, activation, and deactivation of
 * workbench windows. While we're at it, instances also monitor the activation
 * of perspectives.
 * <p>
 * When sent the {@link #startMonitoring(UsageDataService)} message, an instance
 * adds several listeners to various elements of the workbench. Those listeners
 * are removed when the instance is sent {@link #stopMonitoring()}. The
 * listeners either record events, or add/remove listeners to windows and pages
 * as they are opened/closed.
 * </p>
 * 
 * @author Wayne Beaton
 * 
 */
public class PartUsageMonitor implements UsageMonitor {

	private static final String WORKBENCH_BUNDLE_ID = "org.eclipse.ui.workbench"; //$NON-NLS-1$
	private static final String PERSPECTIVES_EXTENSION_POINT = "org.eclipse.ui.perspectives"; //$NON-NLS-1$

	private ObservingService usageDataService;
	
	private IWindowListener windowListener = new IWindowListener() {
		public void windowOpened(IWorkbenchWindow window) {
			ActionPart action = ActionPart.OPENED;
			action.findKind(window);
			usageDataService.recordEvent(action, WORKBENCH_BUNDLE_ID);
			hookListener(window);
		}

		public void windowClosed(IWorkbenchWindow window) {
			ActionPart action = ActionPart.CLOSED;
			action.findKind(window);
			usageDataService.recordEvent(action, WORKBENCH_BUNDLE_ID);
			unhookListeners(window);
		}

		public void windowActivated(IWorkbenchWindow window) {
			ActionPart action = ActionPart.ACTIVATED;
			action.findKind(window);
			usageDataService.recordEvent(action, WORKBENCH_BUNDLE_ID);
		}

		public void windowDeactivated(IWorkbenchWindow window) {
			ActionPart action = ActionPart.DEACTIVATED;
			action.findKind(window);
			usageDataService.recordEvent(action, WORKBENCH_BUNDLE_ID);
		}

	};
	
	private IPageListener pageListener = new IPageListener() {
		public void pageActivated(IWorkbenchPage page) {
		}

		public void pageClosed(IWorkbenchPage page) {
			unhookListeners(page);			
		}

		public void pageOpened(IWorkbenchPage page) {
			hookListeners(page);			
		}
		
	};
	
	private IPartListener partListener = new IPartListener() {
		public void partActivated(IWorkbenchPart part) {
			//String event, IWorkbenchPart part
			IWorkbenchPartSite site = part.getSite();
			ActionPart action = ActionPart.ACTIVATED;
			action.findKind(site);
			usageDataService.recordEvent(action, site.getId(), site.getPluginId());
		}

		public void partDeactivated(IWorkbenchPart part) {
			// Don't care.
		}

		public void partBroughtToTop(IWorkbenchPart part) {
			// Don't care.
		}

		public void partClosed(IWorkbenchPart part) {
			IWorkbenchPartSite site = part.getSite();
			ActionPart action = ActionPart.CLOSED;
			action.findKind(part);
			usageDataService.recordEvent(action, site.getId(), site.getPluginId());
		}

		public void partOpened(IWorkbenchPart part) {
			IWorkbenchPartSite site = part.getSite();
			ActionPart action = ActionPart.OPENED;
			action.findKind(part);
			usageDataService.recordEvent(action, site.getId(), site.getPluginId());
		}
	};

	private IPerspectiveListener perspectiveListener = new IPerspectiveListener() {
		public void perspectiveActivated(IWorkbenchPage page, IPerspectiveDescriptor perspective) {
			String id = perspective.getId();
			ActionPart action = ActionPart.ACTIVATED;
			action.findKind(perspective);
			usageDataService.recordEvent(action, id, perspectiveToBundleIdMapper.getBundleId(id));
		}

		public void perspectiveChanged(IWorkbenchPage page, IPerspectiveDescriptor perspective, String changeId) {			
		}
		
	};

	private ExtensionIdToBundleMapper perspectiveToBundleIdMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.epp.usagedata.internal.gathering.UsageMonitor#register(org.eclipse.epp.usagedata.internal.gathering.UsageDataService)
	 */
	public void startMonitoring(ObservingService usageDataService) {
		this.usageDataService = usageDataService;
		IWorkbench workbench = PlatformUI.getWorkbench();		
		perspectiveToBundleIdMapper = new ExtensionIdToBundleMapper(PERSPECTIVES_EXTENSION_POINT);
		hookListeners(workbench);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.epp.usagedata.internal.gathering.UsageMonitor#deregister()
	 */
	public void stopMonitoring() {
		final IWorkbench workbench = PlatformUI.getWorkbench();
		unhookListeners(workbench);
		perspectiveToBundleIdMapper.dispose();
	}

	/**
	 * This method hooks a part listener to all currently open
	 * workbench windows.
	 * 
	 * @param workbench
	 */
	private void hookListeners(final IWorkbench workbench) {
		workbench.addWindowListener(windowListener);
		/*
		 * The syncExec code is no longer required. Previously,
		 * we were only applying the listeners to the active workbench window and
		 * Workbench#getActiveWorkbenchWindow() must be called in the ui thread.
		 */
//		workbench.getDisplay().syncExec(new Runnable() {
//			public void run() {
				for (IWorkbenchWindow window : workbench.getWorkbenchWindows()) {
					hookListener(window);
				}
//			}
//		});
	}

	private void unhookListeners(final IWorkbench workbench) {
		// If the display is disposed, then we're shutting down and the
		// listeners have already been removed.
		if (workbench.getDisplay().isDisposed())
			return;

		workbench.removeWindowListener(windowListener);
		
		// Walk through the workbench windows and unhook the listeners from each
		// of them.
//		workbench.getDisplay().syncExec(new Runnable() {
//			public void run() {
				for (IWorkbenchWindow window : workbench.getWorkbenchWindows()) {
					unhookListeners(window);
				}
//			}
//		});
	}
	
	private void hookListener(IWorkbenchWindow window) {
		if (window == null) return;
		window.addPageListener(pageListener);
		window.addPerspectiveListener(perspectiveListener);
		for (IWorkbenchPage page : window.getPages()) {
			hookListeners(page);
		}
	}

	private void unhookListeners(IWorkbenchWindow window) {
		if (window == null) return;
		window.removePageListener(pageListener);
		window.removePerspectiveListener(perspectiveListener);
		for(IWorkbenchPage page : window.getPages()) {
			unhookListeners(page);
		}
	}
	
	private void hookListeners(IWorkbenchPage page) {
		IPerspectiveDescriptor perspective = page.getPerspective();
		if (perspective != null) {
			String id = perspective.getId();
			ActionPart action = ActionPart.ACTIVATED;
			action.findKind(perspective);
			usageDataService.recordEvent(action, id, perspectiveToBundleIdMapper.getBundleId(id));
		}
		page.addPartListener(partListener);
	}

	private void unhookListeners(IWorkbenchPage page) {
		page.removePartListener(partListener);
	}
}