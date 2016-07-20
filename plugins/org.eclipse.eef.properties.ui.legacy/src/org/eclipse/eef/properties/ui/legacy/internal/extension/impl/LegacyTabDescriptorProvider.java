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
package org.eclipse.eef.properties.ui.legacy.internal.extension.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.eef.properties.ui.api.IEEFTabDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFTabDescriptorProvider;
import org.eclipse.eef.properties.ui.legacy.internal.EEFPropertiesUiLegacyPlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Provides the tab descriptors defined thanks to the legacy org.eclipse.ui.views.properties.tabbed.propertyTabs
 * extension point.
 *
 * @author mbats
 */
public class LegacyTabDescriptorProvider implements IEEFTabDescriptorProvider {

	/**
	 * {@inheritDoc}
	 *
	 * @see IEEFTabDescriptorProvider#get(IWorkbenchPart part, ISelection selection, String contributorId)
	 */
	@Override
	public Collection<IEEFTabDescriptor> get(IWorkbenchPart part, ISelection selection, String contributorId) {
		// Get legacy tab descriptors
		LegacyPropertyTabRegistry legacyTabDescriptorRegistry = EEFPropertiesUiLegacyPlugin.getImplementation().getTabbedPropertyTabsRegistry();
		List<IEEFTabDescriptor> legacyEefTabDescriptors = legacyTabDescriptorRegistry.getPropertyTabs(contributorId);
		return legacyEefTabDescriptors;
	}
}
