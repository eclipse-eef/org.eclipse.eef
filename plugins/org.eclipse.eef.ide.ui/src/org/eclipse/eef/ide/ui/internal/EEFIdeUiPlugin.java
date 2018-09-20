/*******************************************************************************
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.internal;

import java.net.URL;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.common.api.AbstractEEFEclipsePlugin;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.sirius.ext.ide.api.AbstractRegistryEventListener;
import org.eclipse.sirius.ext.ide.api.DescriptorRegistryEventListener;
import org.eclipse.sirius.ext.ide.api.IItemDescriptor;
import org.eclipse.sirius.ext.ide.api.IItemRegistry;
import org.eclipse.sirius.ext.ide.api.ItemRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.graphics.Image;
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
		 * The name of the extension point for the lifecycle manager provider.
		 */
		private static final String EEF_LIFECYCLE_MANAGER_PROVIDER_EXTENSION_POINT = "eefLifecycleManagerProvider"; //$NON-NLS-1$

		/**
		 * The image registry.
		 */
		private ImageRegistry imageRegistry;

		/**
		 * The {@link IItemRegistry} used to retrieve the lifecycle manager provider
		 * {@link IEEFLifecycleManagerProvider}.
		 */
		private IItemRegistry<IEEFLifecycleManagerProvider> eefLifecycleManagerProviderRegistry;

		/**
		 * The extension registry listener used to populate the registry of lifecycle manager provider
		 * {@link IEEFLifecycleManagerProvider}.
		 */
		private AbstractRegistryEventListener eefLifecycleManagerProviderListener;

		/**
		 * The constructor.
		 */
		public Implementation() {
			super(PLUGIN_ID);

			EEFIdeUiPlugin.plugin = this;
			this.imageRegistry = this.createImageRegistry();
			this.imageRegistry.put(Icons.HELP, this.getImageDescriptor(Icons.HELP));
			this.imageRegistry.put(Icons.CREATE, this.getImageDescriptor(Icons.CREATE));
			this.imageRegistry.put(Icons.SEARCH, this.getImageDescriptor(Icons.SEARCH));
			this.imageRegistry.put(Icons.UNSET, this.getImageDescriptor(Icons.UNSET));
			this.imageRegistry.put(Icons.UP, this.getImageDescriptor(Icons.UP));
			this.imageRegistry.put(Icons.DOWN, this.getImageDescriptor(Icons.DOWN));
			this.imageRegistry.put(Icons.INFO, this.getImageDescriptor(Icons.INFO));
			this.imageRegistry.put(Icons.WARNING, this.getImageDescriptor(Icons.WARNING));
			this.imageRegistry.put(Icons.ERROR, this.getImageDescriptor(Icons.ERROR));
			this.imageRegistry.put(Icons.FIX, this.getImageDescriptor(Icons.FIX));
			this.imageRegistry.put(Icons.PERMISSION_DENIED, this.getImageDescriptor(Icons.PERMISSION_DENIED));
			this.imageRegistry.put(Icons.PERMISSION_GRANTED_TO_CURRENT_USER_EXCLUSIVELY,
					this.getImageDescriptor(Icons.PERMISSION_GRANTED_TO_CURRENT_USER_EXCLUSIVELY));
			this.imageRegistry.put(Icons.PERMISSION_NO_WRITE, this.getImageDescriptor(Icons.PERMISSION_NO_WRITE));
			this.imageRegistry.put(Icons.PLACEHOLDER, this.getImageDescriptor(Icons.PLACEHOLDER));
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
		public ImageDescriptor getImageDescriptor(final String path) {
			return AbstractUIPlugin.imageDescriptorFromPlugin(EEFIdeUiPlugin.PLUGIN_ID, path);
		}

		/**
		 * Returns the image for the given URL.
		 *
		 * @param url
		 *            The url of the image
		 * @return The image found or <code>null</code> if it could not be found
		 */
		public Image getImage(URL url) {
			Image image = this.imageRegistry.get(url.toString());
			if (image == null) {
				ImageDescriptor imageDescriptor = ImageDescriptor.createFromURL(url);
				this.imageRegistry.put(url.toString(), imageDescriptor);
				image = this.imageRegistry.get(url.toString());
			}
			return image;
		}

		/**
		 * Returns the image registry.
		 *
		 * @return The image registry
		 */
		public ImageRegistry getImageRegistry() {
			return this.imageRegistry;
		}

		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.core.runtime.Plugin#start(org.osgi.framework.BundleContext)
		 */
		@Override
		public void start(BundleContext context) throws Exception {
			super.start(context);
			IExtensionRegistry registry = Platform.getExtensionRegistry();

			this.eefLifecycleManagerProviderRegistry = new ItemRegistry<IEEFLifecycleManagerProvider>();
			this.eefLifecycleManagerProviderListener = new DescriptorRegistryEventListener<IEEFLifecycleManagerProvider>(PLUGIN_ID,
					EEF_LIFECYCLE_MANAGER_PROVIDER_EXTENSION_POINT, this.eefLifecycleManagerProviderRegistry);
			registry.addListener(this.eefLifecycleManagerProviderListener, PLUGIN_ID + '.' + EEF_LIFECYCLE_MANAGER_PROVIDER_EXTENSION_POINT);
			this.eefLifecycleManagerProviderListener.readRegistry(registry);

		}

		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
		 */
		@Override
		public void stop(BundleContext context) throws Exception {
			super.stop(context);

			IExtensionRegistry registry = Platform.getExtensionRegistry();

			registry.removeListener(this.eefLifecycleManagerProviderListener);
			this.eefLifecycleManagerProviderListener = null;
			this.eefLifecycleManagerProviderRegistry = null;
		}

		/**
		 * Return the lifecycle manager provider supporting the given description.
		 *
		 * @param eefControlDescription
		 *            The description of the control to create
		 * @return The lifecycle manager provider
		 */
		public IEEFLifecycleManagerProvider getEEFLifecycleManagerProvider(EEFControlDescription eefControlDescription) {
			for (IItemDescriptor<IEEFLifecycleManagerProvider> itemDescriptor : this.eefLifecycleManagerProviderRegistry.getItemDescriptors()) {
				// Search the first lifecycle manager in the contribution supporting the given control
				IEEFLifecycleManagerProvider eefLifecycleManagerProvider = itemDescriptor.getItem();
				if (eefLifecycleManagerProvider.canHandle(eefControlDescription)) {
					return eefLifecycleManagerProvider;
				}
			}
			return null;
		}
	}
}
