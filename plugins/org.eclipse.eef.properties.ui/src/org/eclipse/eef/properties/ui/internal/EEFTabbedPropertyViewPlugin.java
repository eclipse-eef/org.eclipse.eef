/*******************************************************************************
 * Copyright (c) 2001, 2016 IBM Corporation and others.
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

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.eef.common.api.AbstractEEFEclipsePlugin;
import org.eclipse.eef.properties.ui.api.IEEFTabDescriptorFilter;
import org.eclipse.eef.properties.ui.api.IEEFTabDescriptorProvider;
import org.eclipse.eef.properties.ui.internal.extension.AbstractRegistryEventListener;
import org.eclipse.eef.properties.ui.internal.extension.IItemRegistry;
import org.eclipse.eef.properties.ui.internal.extension.impl.EEFDescriptorRegistryEventListener;
import org.eclipse.eef.properties.ui.internal.extension.impl.ItemRegistry;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.osgi.framework.BundleContext;

/**
 * The common ui properties plug-in.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 */
public class EEFTabbedPropertyViewPlugin extends EMFPlugin {
	/**
	 * The symbolic name of the plugin.
	 */
	public static final String PLUGIN_ID = "org.eclipse.eef.properties.ui"; //$NON-NLS-1$

	/**
	 * The sole instance of the plugin.
	 */
	public static final EEFTabbedPropertyViewPlugin INSTANCE = new EEFTabbedPropertyViewPlugin();

	/**
	 * The OSGi related implementation of the plugin.
	 */
	private static Implementation plugin;

	/**
	 * The constructor.
	 */
	public EEFTabbedPropertyViewPlugin() {
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
	 * Returns the OSGi related implementation of the plugin.
	 *
	 * @return The OSGi related implementation of the plugin
	 */
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
		 * The name of the extension point for the tab descriptor provider.
		 */
		private static final String EEF_TAB_DESCRIPTOR_PROVIDER_EXTENSION_POINT = "eefTabDescriptorProvider"; //$NON-NLS-1$

		/**
		 * The name of the extension point for the tab descriptor filter.
		 */
		private static final String EEF_TAB_DESCRIPTOR_FILTER_EXTENSION_POINT = "eefTabDescriptorFilter"; //$NON-NLS-1$

		/**
		 * The {@link IItemRegistry} used to retrieve the tab descriptor provider {@link IEEFTabDescriptorProvider}.
		 */
		private IItemRegistry<IEEFTabDescriptorProvider> eefTabDescriptorProviderRegistry;

		/**
		 * The {@link IItemRegistry} used to retrieve the tab descriptor filter {@link IEEFTabDescriptorFilter}.
		 */
		private IItemRegistry<IEEFTabDescriptorFilter> eefTabDescriptorFilterRegistry;

		/**
		 * The extension registry listener used to populate the registry of tab descriptor provider
		 * {@link IEEFTabDescriptorProvider}.
		 */
		private AbstractRegistryEventListener eefTabDescriptorProviderListener;

		/**
		 * The extension registry listener used to populate the registry of tab descriptor filter
		 * {@link IEEFTabDescriptorFilter}.
		 */
		private AbstractRegistryEventListener eefTabDescriptorFilterListener;

		/**
		 * The constructor.
		 */
		public Implementation() {
			super(PLUGIN_ID);

			EEFTabbedPropertyViewPlugin.plugin = this;
		}

		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
		 */
		@Override
		public void start(BundleContext context) throws Exception {
			super.start(context);

			IExtensionRegistry registry = Platform.getExtensionRegistry();

			this.eefTabDescriptorProviderRegistry = new ItemRegistry<IEEFTabDescriptorProvider>();
			this.eefTabDescriptorProviderListener = new EEFDescriptorRegistryEventListener<IEEFTabDescriptorProvider>(PLUGIN_ID,
					EEF_TAB_DESCRIPTOR_PROVIDER_EXTENSION_POINT, this.eefTabDescriptorProviderRegistry);
			registry.addListener(this.eefTabDescriptorProviderListener, PLUGIN_ID + '.' + EEF_TAB_DESCRIPTOR_PROVIDER_EXTENSION_POINT);
			this.eefTabDescriptorProviderListener.readRegistry(registry);

			this.eefTabDescriptorFilterRegistry = new ItemRegistry<IEEFTabDescriptorFilter>();
			this.eefTabDescriptorFilterListener = new EEFDescriptorRegistryEventListener<IEEFTabDescriptorFilter>(PLUGIN_ID,
					EEF_TAB_DESCRIPTOR_FILTER_EXTENSION_POINT, this.eefTabDescriptorFilterRegistry);
			registry.addListener(this.eefTabDescriptorFilterListener, PLUGIN_ID + '.' + EEF_TAB_DESCRIPTOR_FILTER_EXTENSION_POINT);
			this.eefTabDescriptorFilterListener.readRegistry(registry);
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

			registry.removeListener(this.eefTabDescriptorProviderListener);
			registry.removeListener(this.eefTabDescriptorFilterListener);
			this.eefTabDescriptorProviderListener = null;
			this.eefTabDescriptorFilterListener = null;
			this.eefTabDescriptorProviderRegistry = null;
		}

		/**
		 * Return the TabDescriptorProviderRegistry.
		 *
		 * @return the TabDescriptorProviderRegistry
		 */
		public IItemRegistry<IEEFTabDescriptorProvider> getEEFTabDescriptorProviderRegistry() {
			return this.eefTabDescriptorProviderRegistry;
		}

		/**
		 * Return the TabDescriptorFilterRegistry.
		 *
		 * @return the TabDescriptorFilterRegistry
		 */
		public IItemRegistry<IEEFTabDescriptorFilter> getEEFTabDescriptorFilterRegistry() {
			return this.eefTabDescriptorFilterRegistry;
		}
	}

}