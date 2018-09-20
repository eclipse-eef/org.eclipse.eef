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
package org.eclipse.eef.properties.ui.legacy.internal.extension.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.eef.properties.ui.api.IEEFTabDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFTabDescriptorProvider;
import org.eclipse.eef.properties.ui.api.IEEFTabbedPropertySheetPageContributor;
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
	 * @see IEEFTabDescriptorProvider#get(IWorkbenchPart part, ISelection selection,
	 *      IEEFTabbedPropertySheetPageContributor contributor)
	 */
	@Override
	public Collection<IEEFTabDescriptor> get(IWorkbenchPart part, ISelection selection, IEEFTabbedPropertySheetPageContributor contributor) {
		// Get legacy tab descriptors
		LegacyPropertyTabRegistry legacyTabDescriptorRegistry = EEFPropertiesUiLegacyPlugin.getImplementation().getTabbedPropertyTabsRegistry();
		List<IEEFTabDescriptor> legacyEefTabDescriptors = legacyTabDescriptorRegistry.getPropertyTabs(contributor.getContributorId());
		return legacyEefTabDescriptors;
	}
}
