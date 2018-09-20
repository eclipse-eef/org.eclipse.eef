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
package org.eclipse.eef.properties.ui.legacy.internal;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.eef.properties.ui.legacy.internal.extension.AbstractRegistryEventListener;
import org.eclipse.eef.properties.ui.legacy.internal.extension.impl.LegacyPropertyContributorRegistry;
import org.eclipse.eef.properties.ui.legacy.internal.extension.impl.LegacyPropertyContributorRegistryEventListener;
import org.eclipse.eef.properties.ui.legacy.internal.extension.impl.LegacyPropertySectionRegistry;
import org.eclipse.eef.properties.ui.legacy.internal.extension.impl.LegacyPropertySectionsRegistryEventListener;
import org.eclipse.eef.properties.ui.legacy.internal.extension.impl.LegacyPropertyTabRegistry;
import org.eclipse.eef.properties.ui.legacy.internal.extension.impl.LegacyPropertyTabsRegistryEventListener;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.osgi.framework.BundleContext;

/**
 * The plugin class of the bundle.
 *
 * @author mbats
 */
public class EEFPropertiesUiLegacyPlugin extends EMFPlugin {

	/**
	 * The identifier of the plugin.
	 */
	public static final String PLUGIN_ID = "org.eclipse.eef.properties.ui.legacy"; //$NON-NLS-1$

	/**
	 * The identifier of the legacuy tabbed properties plugin.
	 */
	public static final String LEGACY_TABBED_PROPERTIES_PLUGIN_ID = "org.eclipse.ui.views.properties.tabbed"; //$NON-NLS-1$

	/**
	 * The sole instance of the plugin.
	 */
	public static final EEFPropertiesUiLegacyPlugin INSTANCE = new EEFPropertiesUiLegacyPlugin();

	/**
	 * The name of the extension point for the tabbed property contributor.
	 */
	private static final String PROPERTY_CONTRIBUTOR_EXTENSION_POINT = "propertyContributor"; //$NON-NLS-1$

	/**
	 * The name of the extension point for the tabbed property sections.
	 */
	private static final String PROPERTY_SECTIONS_EXTENSION_POINT = "propertySections"; //$NON-NLS-1$

	/**
	 * The name of the extension point for the tabbed property tabs.
	 */
	private static final String PROPERTY_TABS_EXTENSION_POINT = "propertyTabs"; //$NON-NLS-1$

	/**
	 * The OSGi related implementation of the plugin.
	 */
	private static Implementation plugin;

	/**
	 * The constructor.
	 */
	public EEFPropertiesUiLegacyPlugin() {
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
	 * This class is used as the bundle activator of the plugin.
	 *
	 * @author mbats
	 */
	public static class Implementation extends EclipsePlugin {

		/**
		 * The registry used to retrieve the property tab descriptor provider.
		 */
		private LegacyPropertyTabRegistry tabbedPropertyTabsRegistry;

		/**
		 * The registry used to retrieve the property section descriptor provider.
		 */
		private LegacyPropertySectionRegistry tabbedPropertySectionsRegistry;

		/**
		 * The registry used to retrieve the property contributor descriptor provider.
		 */
		private LegacyPropertyContributorRegistry tabbedPropertyContributorRegistry;

		/**
		 * The extension registry listener used to populate the registry of tabbed property tabs.
		 */
		private AbstractRegistryEventListener tabbedPropertyTabsListener;

		/**
		 * The extension registry listener used to populate the registry of tabbed property sections.
		 */
		private AbstractRegistryEventListener tabbedPropertySectionsListener;

		/**
		 * The extension registry listener used to populate the registry of tabbed property contributor.
		 */
		private AbstractRegistryEventListener tabbedPropertyContributorListener;

		/**
		 * The constructor.
		 */
		public Implementation() {
			super();

			EEFPropertiesUiLegacyPlugin.plugin = this;
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

			this.tabbedPropertyContributorRegistry = new LegacyPropertyContributorRegistry();
			this.tabbedPropertyContributorListener = new LegacyPropertyContributorRegistryEventListener(LEGACY_TABBED_PROPERTIES_PLUGIN_ID,
					PROPERTY_CONTRIBUTOR_EXTENSION_POINT, this.tabbedPropertyContributorRegistry);
			registry.addListener(this.tabbedPropertyContributorListener,
					LEGACY_TABBED_PROPERTIES_PLUGIN_ID + '.' + PROPERTY_CONTRIBUTOR_EXTENSION_POINT);
			this.tabbedPropertyContributorListener.readRegistry(registry);

			this.tabbedPropertySectionsRegistry = new LegacyPropertySectionRegistry();
			this.tabbedPropertySectionsListener = new LegacyPropertySectionsRegistryEventListener(LEGACY_TABBED_PROPERTIES_PLUGIN_ID,
					PROPERTY_SECTIONS_EXTENSION_POINT, this.tabbedPropertySectionsRegistry);
			registry.addListener(this.tabbedPropertySectionsListener, LEGACY_TABBED_PROPERTIES_PLUGIN_ID + '.' + PROPERTY_SECTIONS_EXTENSION_POINT);
			this.tabbedPropertySectionsListener.readRegistry(registry);

			this.tabbedPropertyTabsRegistry = new LegacyPropertyTabRegistry();
			this.tabbedPropertyTabsListener = new LegacyPropertyTabsRegistryEventListener(LEGACY_TABBED_PROPERTIES_PLUGIN_ID,
					PROPERTY_TABS_EXTENSION_POINT, this.tabbedPropertyTabsRegistry);
			registry.addListener(this.tabbedPropertyTabsListener, LEGACY_TABBED_PROPERTIES_PLUGIN_ID + '.' + PROPERTY_TABS_EXTENSION_POINT);
			this.tabbedPropertyTabsListener.readRegistry(registry);
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

			registry.removeListener(this.tabbedPropertyTabsListener);
			registry.removeListener(this.tabbedPropertySectionsListener);
			registry.removeListener(this.tabbedPropertyContributorListener);
			this.tabbedPropertyTabsListener = null;
			this.tabbedPropertyTabsRegistry.dispose();
			this.tabbedPropertyTabsRegistry = null;
			this.tabbedPropertySectionsListener = null;
			this.tabbedPropertySectionsRegistry = null;
			this.tabbedPropertyContributorListener = null;
			this.tabbedPropertyContributorRegistry = null;
		}

		/**
		 * Return the tabbedPropertyTabsRegistry.
		 *
		 * @return the tabbedPropertyTabsRegistry
		 */
		public LegacyPropertyTabRegistry getTabbedPropertyTabsRegistry() {
			return this.tabbedPropertyTabsRegistry;
		}

		/**
		 * Return the tabbedPropertySectionsRegistry.
		 *
		 * @return the tabbedPropertySectionsRegistry
		 */
		public LegacyPropertySectionRegistry getTabbedPropertySectionsRegistry() {
			return this.tabbedPropertySectionsRegistry;
		}

		/**
		 * Return the tabbedPropertyContributorRegistry.
		 *
		 * @return the tabbedPropertyContributorRegistry
		 */
		public LegacyPropertyContributorRegistry getTabbedPropertyContributorRegistry() {
			return this.tabbedPropertyContributorRegistry;
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
