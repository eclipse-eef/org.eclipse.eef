/*******************************************************************************
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.interpreter.aql.internal;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

/**
 * The plugin class of the bundle.
 *
 * @author sbegaudeau
 */
public class AQLInterpreterPlugin extends EMFPlugin {
	/**
	 * The identifier of the plugin.
	 */
	public static final String PLUGIN_ID = "org.eclipse.eef.interpreter.aql"; //$NON-NLS-1$

	/**
	 * The sole instance of the plugin.
	 */
	public static final AQLInterpreterPlugin INSTANCE = new AQLInterpreterPlugin();

	/**
	 * The OSGi related implementation of the plugin.
	 */
	private static Implementation plugin;

	/**
	 * The constructor.
	 */
	public AQLInterpreterPlugin() {
		super(new ResourceLocator[0]);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.common.EMFPlugin#getPluginResourceLocator()
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the OSGi related implementation.
	 *
	 * @return The OSGi related implementation
	 */
	public static Implementation getImplementation() {
		return plugin;
	}

	/**
	 * This class isused as the bundle activator of the plugin.
	 *
	 * @author sbegaudeau
	 */
	public static class Implementation extends EclipsePlugin {

		/**
		 * The constructor.
		 */
		public Implementation() {
			super();

			AQLInterpreterPlugin.plugin = this;
		}

		/**
		 * Logs an error with the exception and the given message.
		 *
		 * @param message
		 *            The message
		 * @param exception
		 *            The exception
		 */
		public void logError(String message, Exception exception) {
			IStatus status = new Status(IStatus.ERROR, PLUGIN_ID, message, exception);
			this.getLog().log(status);
		}

		/**
		 * Logs a warning with the exception and the given message.
		 *
		 * @param message
		 *            The message
		 * @param exception
		 *            The exception
		 */
		public void logWarning(String message, Exception exception) {
			IStatus status = new Status(IStatus.WARNING, PLUGIN_ID, message, exception);
			this.getLog().log(status);
		}
	}
}
