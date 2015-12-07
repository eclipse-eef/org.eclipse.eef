/*******************************************************************************
 * Copyright (c) 2001, 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Obeo - Contribution to the EEF project
 *******************************************************************************/
package org.eclipse.eef.properties.ui.internal;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The common ui properties plug-in.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 */
public class EEFTabbedPropertyViewPlugin extends AbstractUIPlugin {
	/**
	 * The symbolic name of the plugin.
	 */
	private static final String PLUGIN_ID = "org.eclipse.eef.properties.ui"; //$NON-NLS-1$

	/**
	 * The sole instance of the activator.
	 */
	private static EEFTabbedPropertyViewPlugin instance;

	/**
	 * Returns the sole instance of the plugin.
	 *
	 * @return The sole instance of the plugin
	 */
	public static EEFTabbedPropertyViewPlugin getInstance() {
		return instance;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		instance = null;
		super.stop(context);
	}

	/**
	 * Logs the given exception as an error.
	 * 
	 * @param exception
	 *            The exception to log
	 */
	public void logError(Exception exception) {
		IStatus status = new Status(IStatus.ERROR, PLUGIN_ID, exception.getMessage(), exception);
		this.getLog().log(status);
	}
}