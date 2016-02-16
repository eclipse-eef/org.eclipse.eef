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

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.eef.common.api.AbstractEEFEclipsePlugin;
import org.eclipse.eef.ide.api.extensions.AbstractRegistryEventListener;
import org.eclipse.eef.ide.api.extensions.IItemRegistry;
import org.eclipse.eef.ide.api.extensions.impl.DescriptorRegistryEventListener;
import org.eclipse.eef.ide.api.extensions.impl.ItemRegistry;
import org.eclipse.eef.ide.ui.api.IEEFLifecycleManagerProvider;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
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
		 * Return the eefCustomDescriptionProviderRegistry.
		 *
		 * @return the eefCustomDescriptionProviderRegistry
		 */
		public IItemRegistry<IEEFLifecycleManagerProvider> getEEFCustomDescriptionProviderRegistry() {
			return this.eefLifecycleManagerProviderRegistry;
		}
	}
}
