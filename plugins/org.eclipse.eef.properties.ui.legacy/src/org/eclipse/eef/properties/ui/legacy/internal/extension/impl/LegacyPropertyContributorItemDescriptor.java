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

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.eef.properties.ui.legacy.internal.EEFPropertiesUiLegacyPlugin;
import org.eclipse.eef.properties.ui.legacy.internal.Messages;
import org.eclipse.eef.properties.ui.legacy.internal.extension.IItemDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.views.properties.tabbed.IActionProvider;
import org.eclipse.ui.views.properties.tabbed.ISectionDescriptorProvider;
import org.eclipse.ui.views.properties.tabbed.ITabDescriptorProvider;
import org.eclipse.ui.views.properties.tabbed.ITypeMapper;

/**
 * The property contributor descriptor.
 *
 * @author mbats
 */
public class LegacyPropertyContributorItemDescriptor implements IItemDescriptor {
	/**
	 * The configuration element.
	 */
	private IConfigurationElement configurationElement;

	/**
	 * The constructor.
	 *
	 * @param configurationElement
	 *            The configuration element
	 */
	public LegacyPropertyContributorItemDescriptor(IConfigurationElement configurationElement) {
		this.configurationElement = configurationElement;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see IItemDescriptor#getId()
	 */
	@Override
	public String getId() {
		if (configurationElement != null) {
			return configurationElement.getAttribute(LegacyPropertyContributorRegistryEventListener.CONTRIBUTOR_ID_ATTR);

		}
		return null;
	}

	/**
	 * Return the labelProvider.
	 *
	 * @return the labelProvider
	 */
	public ILabelProvider getLabelProvider() {
		ILabelProvider labelProvider = null;
		if (configurationElement != null
				&& configurationElement.getAttribute(LegacyPropertyContributorRegistryEventListener.LABEL_PROVIDER_ATTR) != null) {
			try {
				labelProvider = (ILabelProvider) configurationElement
						.createExecutableExtension(LegacyPropertyContributorRegistryEventListener.LABEL_PROVIDER_ATTR);
			} catch (CoreException e) {
				String message = MessageFormat.format(Messages.RegistryEventListener_cannotInstantiateExtension, getId());
				EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, e);
			}
		}
		return labelProvider;
	}

	/**
	 * Return the actionProvider.
	 *
	 * @return the actionProvider
	 */
	public IActionProvider getActionProvider() {
		IActionProvider actionProvider = null;
		if (configurationElement != null
				&& configurationElement.getAttribute(LegacyPropertyContributorRegistryEventListener.ACTION_PROVIDER_ATTR) != null) {
			try {
				actionProvider = (IActionProvider) configurationElement
						.createExecutableExtension(LegacyPropertyContributorRegistryEventListener.ACTION_PROVIDER_ATTR);
			} catch (CoreException e) {
				String message = MessageFormat.format(Messages.RegistryEventListener_cannotInstantiateExtension, getId());
				EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, e);
			}
		}
		return actionProvider;
	}

	/**
	 * Return the typeMapper.
	 *
	 * @return the typeMapper
	 */
	public ITypeMapper getTypeMapper() {
		ITypeMapper typeMapper = null;
		if (configurationElement != null
				&& configurationElement.getAttribute(LegacyPropertyContributorRegistryEventListener.TYPE_MAPPER_ATTR) != null) {
			try {
				typeMapper = (ITypeMapper) configurationElement
						.createExecutableExtension(LegacyPropertyContributorRegistryEventListener.TYPE_MAPPER_ATTR);
			} catch (CoreException e) {
				String message = MessageFormat.format(Messages.RegistryEventListener_cannotInstantiateExtension, getId());
				EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, e);
			}
		}
		return typeMapper;
	}

	/**
	 * Return the sectionDescriptorProvider.
	 *
	 * @return the sectionDescriptorProvider
	 */
	public ISectionDescriptorProvider getSectionDescriptorProvider() {
		ISectionDescriptorProvider sectionDescriptorProvider = null;
		if (configurationElement != null
				&& configurationElement.getAttribute(LegacyPropertyContributorRegistryEventListener.SECTION_DESCRIPTOR_PROVIDER_ATTR) != null) {
			try {
				sectionDescriptorProvider = (ISectionDescriptorProvider) configurationElement
						.createExecutableExtension(LegacyPropertyContributorRegistryEventListener.SECTION_DESCRIPTOR_PROVIDER_ATTR);
			} catch (CoreException e) {
				String message = MessageFormat.format(Messages.RegistryEventListener_cannotInstantiateExtension, getId());
				EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, e);
			}
		}
		return sectionDescriptorProvider;
	}

	/**
	 * Return the tabDescriptorProvider.
	 *
	 * @return the tabDescriptorProvider
	 */
	public ITabDescriptorProvider getTabDescriptorProvider() {
		ITabDescriptorProvider tabDescriptorProvider = null;
		if (configurationElement != null
				&& configurationElement.getAttribute(LegacyPropertyContributorRegistryEventListener.TAB_DESCRIPTOR_PROVIDER_ATTR) != null) {
			try {
				tabDescriptorProvider = (ITabDescriptorProvider) configurationElement
						.createExecutableExtension(LegacyPropertyContributorRegistryEventListener.TAB_DESCRIPTOR_PROVIDER_ATTR);
			} catch (CoreException e) {
				String message = MessageFormat.format(Messages.RegistryEventListener_cannotInstantiateExtension, getId());
				EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, e);
			}
		}
		return tabDescriptorProvider;
	}

	/**
	 * Return the overridableTabListContentProvider.
	 *
	 * @return the overridableTabListContentProvider
	 */
	public boolean isOverridableTabListContentProvider() {
		if (configurationElement != null && configurationElement
				.getAttribute(LegacyPropertyContributorRegistryEventListener.OVERRIDABLE_TAB_LIST_CONTENT_PROVIDER_ATTR) != null) {
			String attributeBoolean = configurationElement
					.getAttribute(LegacyPropertyContributorRegistryEventListener.OVERRIDABLE_TAB_LIST_CONTENT_PROVIDER_ATTR);
			return "true".equals(attributeBoolean); //$NON-NLS-1$
		}
		return false;
	}

	/**
	 * Get categories.
	 *
	 * @return The categories
	 */
	public List<String> getCategories() {
		List<String> categories = new ArrayList<String>();
		if (configurationElement != null) {
			for (IConfigurationElement element : configurationElement
					.getChildren(LegacyPropertyContributorRegistryEventListener.TAG_PROPERTY_CATEGORY)) {
				categories.add(element.getAttribute(LegacyPropertyContributorRegistryEventListener.CATEGORY_ATTR));
			}
		}
		return categories;
	}
}
