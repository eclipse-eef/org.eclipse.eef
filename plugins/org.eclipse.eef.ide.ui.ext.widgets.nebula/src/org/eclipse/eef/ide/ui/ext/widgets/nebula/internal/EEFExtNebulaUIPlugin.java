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
package org.eclipse.eef.ide.ui.ext.widgets.nebula.internal;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.osgi.framework.BundleContext;

/**
 * The implementation of {@link EMFPlugin} for this bundle.
 *
 * @author arichard
 */
public class EEFExtNebulaUIPlugin extends EMFPlugin {

	/**
	 * The symbolic name of the bundle.
	 */
	public static final String PLUGIN_ID = "org.eclipse.eef.ide.ui.ext.widgets.nebula"; //$NON-NLS-1$

	/**
	 * The singleton instance of the plugin.
	 */
	public static final EEFExtNebulaUIPlugin INSTANCE = new EEFExtNebulaUIPlugin();

	/**
	 * The one instance of this class.
	 */
	private static Implementation plugin;

	/**
	 * The constructor.
	 */
	public EEFExtNebulaUIPlugin() {
		super(new ResourceLocator[] {});
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
	 * Returns the singleton instance of the plugin.
	 *
	 * @return The singleton instance of the plugin
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse Activator.
	 *
	 * @author arichard
	 */
	public static class Implementation extends EclipseUIPlugin {

		/**
		 * The constructor.
		 */
		public Implementation() {
			super();
			plugin = this;
		}

		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
		 */
		@Override
		public void start(BundleContext context) throws Exception {
			super.start(context);
		}

		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
		 */
		@Override
		public void stop(BundleContext context) throws Exception {
			super.stop(context);
		}
	}

}
