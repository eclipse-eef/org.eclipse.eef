/*******************************************************************************
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.core.internal;

import org.eclipse.eef.core.api.AbstractEEFEclipsePlugin;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

/**
 * The plugin of the bundle.
 *
 * @author sbegaudeau
 */
public class EEFCorePlugin extends EMFPlugin {

	/**
	 * The identifier of the plugin.
	 */
	public static final String PLUGIN_ID = "org.eclipse.eef.core"; //$NON-NLS-1$

	/**
	 * The sole instance of the plugin.
	 */
	public static final EEFCorePlugin INSTANCE = new EEFCorePlugin();

	/**
	 * The sole instance of the bundle activator.
	 */
	private static Implementation plugin;

	/**
	 * The constructor.
	 */
	public EEFCorePlugin() {
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
	 * Returns the bundle activator.
	 *
	 * @return The bundle activator
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The bundle activator of the bundle.
	 *
	 * @author sbegaudeau
	 */
	public static class Implementation extends AbstractEEFEclipsePlugin {
		/**
		 * The constructor.
		 */
		public Implementation() {
			super(PLUGIN_ID);
			plugin = this;
		}
	}
}
