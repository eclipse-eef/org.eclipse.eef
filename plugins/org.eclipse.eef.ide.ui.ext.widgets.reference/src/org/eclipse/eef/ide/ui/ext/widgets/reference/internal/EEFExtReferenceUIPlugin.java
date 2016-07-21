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
package org.eclipse.eef.ide.ui.ext.widgets.reference.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.eef.ide.api.extensions.IItemDescriptor;
import org.eclipse.eef.ide.api.extensions.impl.DescriptorRegistryEventListener;
import org.eclipse.eef.ide.api.extensions.impl.ItemRegistry;
import org.eclipse.eef.ide.ui.ext.widgets.reference.api.IEEFExtReferenceViewerFilterProvider;
import org.eclipse.eef.ide.ui.ext.widgets.reference.api.IEEFExtReferenceViewerFilterProvider.ContextKind;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.osgi.framework.BundleContext;

/**
 * The implementation of {@link EMFPlugin} for this bundle.
 *
 * @author sbegaudeau
 */
public class EEFExtReferenceUIPlugin extends EMFPlugin {

	/**
	 * The symbolic name of the bundle.
	 */
	public static final String PLUGIN_ID = "org.eclipse.eef.ide.ui.ext.widgets.reference"; //$NON-NLS-1$

	/**
	 * The singleton instance of the plugin.
	 */
	public static final EEFExtReferenceUIPlugin INSTANCE = new EEFExtReferenceUIPlugin();

	/**
	 * The one instance of this class.
	 */
	private static Implementation plugin;

	/**
	 * The constructor.
	 */
	public EEFExtReferenceUIPlugin() {
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
	 * @author sbegaudeau
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * The path of the add icon.
		 */
		public static final String ADD_ICON_PATH = "full16/Add_16x16.gif"; //$NON-NLS-1$

		/**
		 * The path of the remove icon.
		 */
		public static final String REMOVE_ICON_PATH = "full16/Delete_16x16.gif"; //$NON-NLS-1$

		/**
		 * The path of the up icon.
		 */
		public static final String UP_ICON_PATH = "full16/ArrowUp_16x16.gif"; //$NON-NLS-1$

		/**
		 * The path of the down icon.
		 */
		public static final String DOWN_ICON_PATH = "full16/ArrowDown_16x16.gif"; //$NON-NLS-1$

		/**
		 * The path of the browse icon.
		 */
		public static final String BROWSE_ICON_PATH = "full16/Browse_16x16.gif"; //$NON-NLS-1$

		/**
		 * The path of the new reference wizard banner icon.
		 */
		public static final String NEW_WIZBAN_PATH = "wizban/new_wiz.png"; //$NON-NLS-1$

		/**
		 * The name of the extention point for the viewer filter providers.
		 */
		private static final String EEF_EXT_REFERENCE_VIEWER_FILTER_PROVIDER = "eefExtReferenceViewerFilterProvider"; //$NON-NLS-1$

		/**
		 * The item registry for the {@link IEEFExtReferenceViewerFilterProvider}.
		 */
		private ItemRegistry<IEEFExtReferenceViewerFilterProvider> eefViewerFilterProviderRegistry;

		/**
		 * The extension registry listener for the {@link IEEFExtReferenceViewerFilterProvider}.
		 */
		private DescriptorRegistryEventListener<IEEFExtReferenceViewerFilterProvider> eefViewerFilterProviderListener;

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

			IExtensionRegistry registry = Platform.getExtensionRegistry();
			this.eefViewerFilterProviderRegistry = new ItemRegistry<>();
			this.eefViewerFilterProviderListener = new DescriptorRegistryEventListener<>(PLUGIN_ID, EEF_EXT_REFERENCE_VIEWER_FILTER_PROVIDER,
					this.eefViewerFilterProviderRegistry);
			registry.addListener(this.eefViewerFilterProviderListener, PLUGIN_ID + '.' + EEF_EXT_REFERENCE_VIEWER_FILTER_PROVIDER);
			this.eefViewerFilterProviderListener.readRegistry(registry);

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
			registry.removeListener(this.eefViewerFilterProviderListener);
			this.eefViewerFilterProviderListener = null;
			this.eefViewerFilterProviderRegistry = null;
		}

		/**
		 * Returns the viewer filters to use for the given context kind.
		 * 
		 * @param contextKind
		 *            The context
		 * @return The list of the viewer filters
		 */
		public List<ViewerFilter> getViewFilters(ContextKind contextKind) {
			List<ViewerFilter> viewerFilters = new ArrayList<>();

			List<IItemDescriptor<IEEFExtReferenceViewerFilterProvider>> itemDescriptors = this.eefViewerFilterProviderRegistry.getItemDescriptors();
			for (IItemDescriptor<IEEFExtReferenceViewerFilterProvider> itemDescriptor : itemDescriptors) {
				IEEFExtReferenceViewerFilterProvider viewerFilterProvider = itemDescriptor.getItem();
				viewerFilters.addAll(viewerFilterProvider.getViewerFilters(contextKind));
			}

			return viewerFilters;
		}
	}

}
