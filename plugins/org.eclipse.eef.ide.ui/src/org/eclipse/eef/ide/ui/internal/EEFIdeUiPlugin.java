/*******************************************************************************
 * Copyright (c) 2015, 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.internal;

import org.eclipse.eef.common.api.AbstractEEFEclipsePlugin;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The plugin class of the bundle.
 *
 * @author sbegaudeau
 */
public class EEFIdeUiPlugin extends EMFPlugin {

	/**
	 * The identifier of the plugin.
	 */
	public static final String PLUGIN_ID = "org.eclipse.eef.ide.ui"; //$NON-NLS-1$

	/**
	 * The sole instance of the plugin.
	 */
	public static final EEFIdeUiPlugin INSTANCE = new EEFIdeUiPlugin();

	/**
	 * The OSGi related implementation of the plugin.
	 */
	private static Implementation plugin;

	/**
	 * The constructor.
	 */
	public EEFIdeUiPlugin() {
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

	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * This class is used as the bundle activator of the plugin.
	 *
	 * @author sbegaudeau
	 */
	public static class Implementation extends AbstractEEFEclipsePlugin {
		/**
		 * The image registry.
		 */
		private ImageRegistry imageRegistry;

		/**
		 * The constructor.
		 */
		public Implementation() {
			super(PLUGIN_ID);

			EEFIdeUiPlugin.plugin = this;
			this.imageRegistry = this.createImageRegistry();
			this.imageRegistry.put(Icons.HELP, this.getImageDescriptor(Icons.HELP));
			this.imageRegistry.put(Icons.CREATE, this.getImageDescriptor(Icons.CREATE));
			this.imageRegistry.put(Icons.SET, this.getImageDescriptor(Icons.SET));
			this.imageRegistry.put(Icons.UNSET, this.getImageDescriptor(Icons.UNSET));
			this.imageRegistry.put(Icons.UP, this.getImageDescriptor(Icons.UP));
			this.imageRegistry.put(Icons.DOWN, this.getImageDescriptor(Icons.DOWN));
		}

		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
		 */
		@Override
		public void stop(BundleContext context) throws Exception {
			super.stop(context);
			this.imageRegistry.dispose();
		}

		/**
		 * Returns a new image registry for this plug-in. The registry will be used to manage images which are
		 * frequently used by the plug-in.
		 * <p>
		 * The default implementation of this method creates an empty registry. Subclasses may override this method if
		 * needed.
		 * </p>
		 *
		 * @return ImageRegistry the resulting registry.
		 * @see #getImageRegistry
		 */
		private ImageRegistry createImageRegistry() {
			// If we are in the UI Thread use that
			if (Display.getCurrent() != null) {
				return new ImageRegistry(Display.getCurrent());
			}

			if (PlatformUI.isWorkbenchRunning()) {
				return new ImageRegistry(PlatformUI.getWorkbench().getDisplay());
			}

			// Invalid thread access if it is not the UI Thread
			// and the workbench is not created.
			throw new SWTError(SWT.ERROR_THREAD_INVALID_ACCESS);
		}

		/**
		 * Returns the image descriptor for the image with the given path.
		 *
		 * @param path
		 *            The path of the image in the bundle
		 * @return The image descriptor of the image
		 */
		private ImageDescriptor getImageDescriptor(final String path) {
			return AbstractUIPlugin.imageDescriptorFromPlugin(EEFIdeUiPlugin.PLUGIN_ID, path);
		}

		/**
		 * Returns the image registry.
		 *
		 * @return The image registry
		 */
		public ImageRegistry getImageRegistry() {
			return this.imageRegistry;
		}
	}
}
