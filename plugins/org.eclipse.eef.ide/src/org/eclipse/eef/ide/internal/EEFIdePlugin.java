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
package org.eclipse.eef.ide.internal;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.eef.api.IEEFViewDescriptionProvider;
import org.eclipse.eef.core.api.AbstractEEFEclipsePlugin;
import org.eclipse.eef.ide.internal.extensions.AbstractRegistryEventListener;
import org.eclipse.eef.ide.internal.extensions.IItemRegistry;
import org.eclipse.eef.ide.internal.extensions.impl.DescriptorRegistryEventListener;
import org.eclipse.eef.ide.internal.extensions.impl.ItemRegistry;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.sirius.common.interpreter.api.IInterpreterProvider;
import org.osgi.framework.BundleContext;

/**
 * The plugin class of the bundle.
 *
 * @author sbegaudeau
 */
public class EEFIdePlugin extends EMFPlugin {

	/**
	 * The identifier of the plugin.
	 */
	public static final String PLUGIN_ID = "org.eclipse.eef.ide"; //$NON-NLS-1$

	/**
	 * The sole instance of the plugin.
	 */
	public static final EEFIdePlugin INSTANCE = new EEFIdePlugin();

	/**
	 * The name of the extension point for the view provider.
	 */
	private static final String EEF_VIEW_DESCRIPTION_PROVIDER_EXTENSION_POINT = "eefViewDescriptionProvider"; //$NON-NLS-1$

	/**
	 * The name of the extension point for the interpreter provider.
	 */
	private static final String INTERPRETER_PROVIDER_EXTENSION_POINT = "interpreterProvider"; //$NON-NLS-1$

	/**
	 * The OSGi related implementation of the plugin.
	 */
	private static Implementation plugin;

	/**
	 * The constructor.
	 */
	public EEFIdePlugin() {
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
		 * The {@link IItemRegistry} used to retrieve the EEF View Description providers.
		 */
		private IItemRegistry<IEEFViewDescriptionProvider> eefViewDescriptionProviderRegistry;

		/**
		 * The extension registry listener used to populate the registry of EEF View Description providers.
		 */
		private AbstractRegistryEventListener eefViewDescriptionProviderListener;

		/**
		 * The {@link IItemRegistry} used to retrieve the {@link IInterpreterProvider}.
		 */
		private IItemRegistry<IInterpreterProvider> interpreterProviderRegistry;

		/**
		 * The extension registry listener used to populate the registry of {@link IInterpreterProvider}.
		 */
		private AbstractRegistryEventListener interpreterProviderListener;

		/**
		 * The constructor.
		 */
		public Implementation() {
			super(PLUGIN_ID);

			EEFIdePlugin.plugin = this;
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

			this.eefViewDescriptionProviderRegistry = new ItemRegistry<IEEFViewDescriptionProvider>();
			this.eefViewDescriptionProviderListener = new DescriptorRegistryEventListener<IEEFViewDescriptionProvider>(PLUGIN_ID,
					EEF_VIEW_DESCRIPTION_PROVIDER_EXTENSION_POINT, this.eefViewDescriptionProviderRegistry);
			registry.addListener(this.eefViewDescriptionProviderListener, PLUGIN_ID + '.' + EEF_VIEW_DESCRIPTION_PROVIDER_EXTENSION_POINT);
			this.eefViewDescriptionProviderListener.readRegistry(registry);

			this.interpreterProviderRegistry = new ItemRegistry<IInterpreterProvider>();
			this.interpreterProviderListener = new DescriptorRegistryEventListener<IInterpreterProvider>(PLUGIN_ID,
					INTERPRETER_PROVIDER_EXTENSION_POINT, this.interpreterProviderRegistry);
			registry.addListener(this.interpreterProviderListener, PLUGIN_ID + '.' + INTERPRETER_PROVIDER_EXTENSION_POINT);
			this.interpreterProviderListener.readRegistry(registry);
		}

		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
		 */
		@Override
		public void stop(BundleContext context) throws Exception {
			super.stop(context);

			IExtensionRegistry registry = Platform.getExtensionRegistry();

			registry.removeListener(this.eefViewDescriptionProviderListener);
			this.eefViewDescriptionProviderListener = null;
			this.eefViewDescriptionProviderRegistry = null;

			registry.removeListener(this.interpreterProviderListener);
			this.interpreterProviderListener = null;
			this.interpreterProviderRegistry = null;
		}

		/**
		 * Return the viewProviderRegistry.
		 *
		 * @return the viewProviderRegistry
		 */
		public IItemRegistry<IEEFViewDescriptionProvider> getEEFViewDescriptionProviderRegistry() {
			return this.eefViewDescriptionProviderRegistry;
		}

		/**
		 * Return the interpreterProviderRegistry.
		 *
		 * @return the interpreterProviderRegistry
		 */
		public IItemRegistry<IInterpreterProvider> getInterpreterProviderRegistry() {
			return this.interpreterProviderRegistry;
		}
	}

}
