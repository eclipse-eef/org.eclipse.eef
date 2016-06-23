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

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.eef.properties.ui.legacy.internal.EEFPropertiesUiLegacyPlugin;
import org.eclipse.eef.properties.ui.legacy.internal.Messages;
import org.eclipse.eef.properties.ui.legacy.internal.extension.AbstractRegistryEventListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.views.properties.tabbed.IActionProvider;
import org.eclipse.ui.views.properties.tabbed.ISectionDescriptorProvider;
import org.eclipse.ui.views.properties.tabbed.ITabDescriptorProvider;
import org.eclipse.ui.views.properties.tabbed.ITypeMapper;

/**
 * Utility class used to retrieved the descriptors of property contributor extension.
 *
 * @author mbats
 */
public class LegacyPropertyContributorRegistryEventListener extends AbstractRegistryEventListener {

	/** PropertyContributor tag of extension point. */
	public static final String TAG_PROPERTY_CONTRIBUTOR = "propertyContributor"; //$NON-NLS-1$

	/** Required contributorId attribute of extension point. */
	public static final String CONTRIBUTOR_ID_ATTR = "contributorId"; //$NON-NLS-1$

	/** Optional typeMapper attribute of extension point. */
	public static final String TYPE_MAPPER_ATTR = "typeMapper"; //$NON-NLS-1$

	/** Optional labelProvider attribute of extension point. */
	public static final String LABEL_PROVIDER_ATTR = "labelProvider"; //$NON-NLS-1$

	/** Optional actionProvider attribute of extension point. */
	public static final String ACTION_PROVIDER_ATTR = "actionProvider"; //$NON-NLS-1$

	/** Optional sectionDescriptorProvider attribute of extension point. */
	public static final String SECTION_DESCRIPTOR_PROVIDER_ATTR = "sectionDescriptorProvider"; //$NON-NLS-1$

	/** Optional tabDescriptorProvider attribute of extension point. */
	public static final String TAB_DESCRIPTOR_PROVIDER_ATTR = "tabDescriptorProvider"; //$NON-NLS-1$

	/** Optional overridableTabListContentProvider attribute of extension point. */
	public static final String OVERRIDABLE_TAB_LIST_CONTENT_PROVIDER_ATTR = "overridableTabListContentProvider"; //$NON-NLS-1$

	/** PropertyCategory tag of extension point. */
	public static final String TAG_PROPERTY_CATEGORY = "propertyCategory"; //$NON-NLS-1$

	/** Optional category attribute of extension point. */
	public static final String CATEGORY_ATTR = "category"; //$NON-NLS-1$

	/**
	 * The item registry.
	 */
	private LegacyPropertyContributorRegistry propertyContributorRegistry;

	/**
	 * The constructor.
	 *
	 * @param namespace
	 *            The namespace of the extension point
	 * @param extensionPointID
	 *            The identifier of the extension point
	 * @param itemRegistry
	 *            The item registry
	 */
	public LegacyPropertyContributorRegistryEventListener(String namespace, String extensionPointID, LegacyPropertyContributorRegistry itemRegistry) {
		super(namespace, extensionPointID);
		this.propertyContributorRegistry = itemRegistry;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.internal.extensions.AbstractRegistryEventListener#validateConfigurationElement(org.eclipse.core.runtime.IConfigurationElement)
	 */
	@Override
	protected boolean validateConfigurationElement(IConfigurationElement configurationElement) {
		boolean isValid = false;
		if (TAG_PROPERTY_CONTRIBUTOR.equals(configurationElement.getName())) {
			if (!this.isValidAttribute(configurationElement, CONTRIBUTOR_ID_ATTR)) {
				String message = MessageFormat.format(Messages.RegistryEventListener_missingAttribute, configurationElement.getNamespaceIdentifier(),
						CONTRIBUTOR_ID_ATTR);
				EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, null);
			} else {
				isValid = true;
			}
		} else if (TAG_PROPERTY_CATEGORY.equals(configurationElement.getName())) {
			isValid = true;
		}

		return isValid;
	}

	/**
	 * Indicates if an attribute of the configuration element is valid.
	 *
	 * @param configurationElement
	 *            The configuration element
	 * @param attributeName
	 *            The attribute name
	 * @return <code>true</code> if the attribute is valid, <code>false</code> otherwise
	 */
	private boolean isValidAttribute(IConfigurationElement configurationElement, String attributeName) {
		return configurationElement.getAttribute(attributeName) != null && !"".equals(configurationElement.getAttribute(attributeName)); //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.internal.extensions.AbstractRegistryEventListener#processAddition(org.eclipse.core.runtime.IConfigurationElement)
	 */
	@Override
	protected boolean processAddition(IConfigurationElement configurationElement) {
		if (TAG_PROPERTY_CONTRIBUTOR.equals(configurationElement.getName())) {
			String contributorId = configurationElement.getAttribute(CONTRIBUTOR_ID_ATTR);
			ILabelProvider labelProvider = null;
			IActionProvider actionProvider = null;
			ITypeMapper typeMapper = null;
			ISectionDescriptorProvider sectionDescriptorProvider = null;
			ITabDescriptorProvider tabDescriptorProvider = null;
			boolean overridableTabListContentProvider = false;
			List<String> categories = new ArrayList<String>();
			try {
				if (configurationElement.getAttribute(LABEL_PROVIDER_ATTR) != null) {
					labelProvider = (ILabelProvider) configurationElement.createExecutableExtension(LABEL_PROVIDER_ATTR);
				}
				if (configurationElement.getAttribute(ACTION_PROVIDER_ATTR) != null) {
					actionProvider = (IActionProvider) configurationElement.createExecutableExtension(ACTION_PROVIDER_ATTR);
				}
				if (configurationElement.getAttribute(TYPE_MAPPER_ATTR) != null) {
					typeMapper = (ITypeMapper) configurationElement.createExecutableExtension(TYPE_MAPPER_ATTR);
				}
				if (configurationElement.getAttribute(SECTION_DESCRIPTOR_PROVIDER_ATTR) != null) {
					sectionDescriptorProvider = (ISectionDescriptorProvider) configurationElement
							.createExecutableExtension(SECTION_DESCRIPTOR_PROVIDER_ATTR);
				}
				if (configurationElement.getAttribute(TAB_DESCRIPTOR_PROVIDER_ATTR) != null) {
					tabDescriptorProvider = (ITabDescriptorProvider) configurationElement.createExecutableExtension(TAB_DESCRIPTOR_PROVIDER_ATTR);
				}
			} catch (CoreException e) {
				String message = MessageFormat.format(Messages.RegistryEventListener_cannotInstantiateExtension, contributorId);
				EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, e);

				return false;
			}
			if (configurationElement.getAttribute(OVERRIDABLE_TAB_LIST_CONTENT_PROVIDER_ATTR) != null) {
				String attributeBoolean = configurationElement.getAttribute(OVERRIDABLE_TAB_LIST_CONTENT_PROVIDER_ATTR);
				overridableTabListContentProvider = "true".equals(attributeBoolean); //$NON-NLS-1$
			}

			for (IConfigurationElement element : configurationElement.getChildren(TAG_PROPERTY_CATEGORY)) {
				categories.add(element.getAttribute(CATEGORY_ATTR));
			}

			LegacyPropertyContributorItemDescriptor propertyContributor = new LegacyPropertyContributorItemDescriptor();
			propertyContributor.setContributorId(contributorId);
			propertyContributor.setLabelProvider(labelProvider);
			propertyContributor.setActionProvider(actionProvider);
			propertyContributor.setTypeMapper(typeMapper);
			propertyContributor.setSectionDescriptorProvider(sectionDescriptorProvider);
			propertyContributor.setTabDescriptorProvider(tabDescriptorProvider);
			propertyContributor.setOverridableTabListContentProvider(overridableTabListContentProvider);
			propertyContributor.setCategories(categories);

			this.propertyContributorRegistry.add(propertyContributor);
		}

		return true;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.internal.extensions.AbstractRegistryEventListener#processRemoval(org.eclipse.core.runtime.IConfigurationElement)
	 */
	@Override
	protected boolean processRemoval(IConfigurationElement configurationElement) {
		return this.propertyContributorRegistry.remove(configurationElement.getAttribute(CONTRIBUTOR_ID_ATTR));
	}

}
