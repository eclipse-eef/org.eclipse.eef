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
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.eef.properties.ui.api.IEEFTabDescriptorProvider;
import org.eclipse.eef.properties.ui.internal.extension.AbstractRegistryEventListener;
import org.eclipse.eef.properties.ui.internal.extension.IItemRegistry;
import org.eclipse.eef.properties.ui.internal.extension.impl.EEFTabDescriptorProviderRegistryEventListener;
import org.eclipse.eef.properties.ui.internal.extension.impl.ItemRegistry;
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
	 * The name of the extension point for the tab descriptor provider.
	 */
	private static final String EEF_TAB_DESCRIPTOR_PROVIDER_EXTENSION_POINT = "eefTabDescriptorProvider"; //$NON-NLS-1$

	/**
	 * The {@link IItemRegistry} used to retrieve the tab descriptor provider {@link IEEFTabDescriptorProvider}.
	 */
	private IItemRegistry<IEEFTabDescriptorProvider> eefTabDescriptorProviderRegistry;

	/**
	 * The extension registry listener used to populate the registry of tab descriptor provider
	 * {@link IEEFTabDescriptorProvider}.
	 */
	private AbstractRegistryEventListener eefTabDescriptorProviderListener;

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

		IExtensionRegistry registry = Platform.getExtensionRegistry();

		this.eefTabDescriptorProviderRegistry = new ItemRegistry<IEEFTabDescriptorProvider>();
		this.eefTabDescriptorProviderListener = new EEFTabDescriptorProviderRegistryEventListener<IEEFTabDescriptorProvider>(PLUGIN_ID,
				EEF_TAB_DESCRIPTOR_PROVIDER_EXTENSION_POINT, this.eefTabDescriptorProviderRegistry);
		registry.addListener(this.eefTabDescriptorProviderListener, PLUGIN_ID + '.' + EEF_TAB_DESCRIPTOR_PROVIDER_EXTENSION_POINT);
		this.eefTabDescriptorProviderListener.readRegistry(registry);
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

		IExtensionRegistry registry = Platform.getExtensionRegistry();

		registry.removeListener(this.eefTabDescriptorProviderListener);
		this.eefTabDescriptorProviderListener = null;
		this.eefTabDescriptorProviderRegistry = null;
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

	/**
	 * Logs the given message as an error.
	 *
	 * @param message
	 *            The message to log
	 */
	public void logError(String message) {
		IStatus status = new Status(IStatus.ERROR, PLUGIN_ID, message, null);
		this.getLog().log(status);
	}

	/**
	 * Return the tabbedPropertyTabsRegistry.
	 *
	 * @return the tabbedPropertyTabsRegistry
	 */
	public IItemRegistry<IEEFTabDescriptorProvider> getEEFTabDescriptorProviderRegistry() {
		return this.eefTabDescriptorProviderRegistry;
	}
}