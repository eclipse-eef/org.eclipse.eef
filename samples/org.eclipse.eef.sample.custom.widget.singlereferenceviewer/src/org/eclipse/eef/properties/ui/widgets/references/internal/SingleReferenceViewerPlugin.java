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
package org.eclipse.eef.properties.ui.widgets.references.internal;

import org.eclipse.eef.common.api.AbstractEEFEclipsePlugin;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

/**
 * The plugin class of the bundle.
 *
 * @author mbats
 */
public class SingleReferenceViewerPlugin extends EMFPlugin {

    /**
     * The identifier of the plugin.
     */
    public static final String PLUGIN_ID = "org.eclipse.eef.properties.ui.widgets.references"; //$NON-NLS-1$

    /**
     * The sole instance of the plugin.
     */
    public static final SingleReferenceViewerPlugin INSTANCE = new SingleReferenceViewerPlugin();

    /**
     * The OSGi related implementation of the plugin.
     */
    private static Implementation plugin;

    /**
     * The constructor.
     */
    public SingleReferenceViewerPlugin() {
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
     * @author mbats
     */
    public static class Implementation extends AbstractEEFEclipsePlugin {
        /**
         * The constructor.
         */
        public Implementation() {
            super(PLUGIN_ID);

            SingleReferenceViewerPlugin.plugin = this;
        }
    }
}
