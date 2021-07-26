/**
 * Copyright (c) Israel Aerospace Industries, Eclipse contributors and others 2021.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *
 */
package org.eclipse.eef.ide.ui.ext.widgets.markup;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class IDEUIExtWidgetHTMLRendererActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.eef.ide.ui.ext.widgets.markup"; //$NON-NLS-1$

	private static IDEUIExtWidgetHTMLRendererActivator plugin;

	public static IDEUIExtWidgetHTMLRendererActivator getDefault() {
		return plugin;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public Image getImage(String path) {
		Image img = getImageRegistry().get(path);
		if (img == null) {

			URL url = FileLocator.find(getBundle(), new org.eclipse.core.runtime.Path(path), null);
			if (url != null) {
				getImageRegistry().put(path, ImageDescriptor.createFromURL(url));
				img = getImageRegistry().get(path);
			}
		}
		return img;
	}

	private void doLogInfo(String message) {
		getLog().log(new Status(IStatus.INFO, PLUGIN_ID, message));
	}

	private void doLogError(String message) {
		getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, message));
	}

	private void doLogWarning(String message, Throwable e) {
		getLog().log(new Status(IStatus.WARNING, PLUGIN_ID, message, e));
	}

	public static void logError(String message) {
		if (plugin != null) {
			plugin.doLogError(message);
		} else {
			System.err.println(message);
		}
	}

	public static void logInfo(String message) {
		if (plugin != null) {
			plugin.doLogInfo(message);
		} else {
			System.out.println(message);
		}
	}

	public static void logWarning(String message, Throwable e) {
		if (plugin != null) {
			plugin.doLogWarning(message, e);
		} else {
			System.out.println(message);
		}
	}

	/**
	 * Tries to log and error (either in the eclipse logging system if the plugin is started or in System.err)
	 *
	 * @param message
	 *            the message
	 * @param e
	 *            an exception
	 */
	public static void logError(String message, Throwable e) {
		if (plugin != null) {
			plugin.doLogError(message, e);
		} else {
			System.err.println(message);
			e.printStackTrace();
		}
	}

	private void doLogError(String string, Throwable e) {
		getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, string, e));
	}

}
