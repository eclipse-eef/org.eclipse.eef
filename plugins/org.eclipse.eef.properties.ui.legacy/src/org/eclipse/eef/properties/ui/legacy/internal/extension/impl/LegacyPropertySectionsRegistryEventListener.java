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

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.eef.properties.ui.api.IEEFTypeMapper;
import org.eclipse.eef.properties.ui.legacy.internal.EEFPropertiesUiLegacyPlugin;
import org.eclipse.eef.properties.ui.legacy.internal.Messages;
import org.eclipse.eef.properties.ui.legacy.internal.extension.AbstractRegistryEventListener;
import org.eclipse.eef.properties.ui.legacy.internal.legacy2eef.EEFLegacyTypeMapper;
import org.eclipse.ui.views.properties.tabbed.ITypeMapper;

/**
 * Utility class used to retrieved the descriptors of property sections extension.
 *
 * @author mbats
 */
public class LegacyPropertySectionsRegistryEventListener extends AbstractRegistryEventListener {

	/** PropertyTab tag of extension point. */
	public static final String TAG_PROPERTY_SECTIONS = "propertySections"; //$NON-NLS-1$

	/** Id attribute of extension point. */
	public static final String CONTRIBUTOR_ID_ATTR = "contributorId"; //$NON-NLS-1$

	/** PropertyTab tag of extension point. */
	public static final String TAG_PROPERTY_SECTION = "propertySection"; //$NON-NLS-1$

	/** Required tab attribute of extension point. */
	public static final String TAB_ATTR = "tab"; //$NON-NLS-1$

	/** Required id attribute of extension point. */
	public static final String ID_ATTR = "id"; //$NON-NLS-1$

	/** Required class attribute of extension point. */
	public static final String CLASS_ATTR = "class"; //$NON-NLS-1$

	/** Optional afterSection attribute of extension point. */
	public static final String AFTER_SECTION_ATTR = "afterSection"; //$NON-NLS-1$

	/** Optional enablesFor attribute of extension point. */
	public static final String ENABLES_FOR_ATTR = "enablesFor"; //$NON-NLS-1$

	/** Optional filter attribute of extension point. */
	public static final String FILTER_ATTR = "filter"; //$NON-NLS-1$

	/** Optional input child of extension point. */
	public static final String ELEMENT_INPUT = "input"; //$NON-NLS-1$

	/** Optional type attribute of extension point. */
	public static final String ATT_INPUT_TYPE = "type"; //$NON-NLS-1$

	/**
	 * The item registry.
	 */
	private LegacyPropertySectionRegistry propertySectionRegistry;

	/**
	 * The constructor.
	 *
	 * @param namespace
	 *            The namespace of the extension point
	 * @param extensionPointID
	 *            The identifier of the extension point
	 * @param itemRegistry
	 *            The ItemRegistry
	 */
	public LegacyPropertySectionsRegistryEventListener(String namespace, String extensionPointID, LegacyPropertySectionRegistry itemRegistry) {
		super(namespace, extensionPointID);
		this.propertySectionRegistry = itemRegistry;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.internal.extensions.AbstractRegistryEventListener#validateConfigurationElement(org.eclipse.core.runtime.IConfigurationElement)
	 */
	@Override
	protected boolean validateConfigurationElement(IConfigurationElement configurationElement) {
		boolean isValid = false;
		if (TAG_PROPERTY_SECTIONS.equals(configurationElement.getName())) {
			if (!this.isValidAttribute(configurationElement, CONTRIBUTOR_ID_ATTR)) {
				String message = MessageFormat.format(Messages.RegistryEventListener_missingAttribute, configurationElement.getNamespaceIdentifier(),
						CONTRIBUTOR_ID_ATTR);
				EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, null);
			} else {
				isValid = true;
			}
		} else if (TAG_PROPERTY_SECTION.equals(configurationElement.getName())) {
			if (!this.isValidAttribute(configurationElement, TAB_ATTR)) {
				String message = MessageFormat.format(Messages.RegistryEventListener_missingAttribute, configurationElement.getNamespaceIdentifier(),
						TAB_ATTR);
				EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, null);
			} else if (!this.isValidAttribute(configurationElement, ID_ATTR)) {
				String message = MessageFormat.format(Messages.RegistryEventListener_missingAttribute, configurationElement.getNamespaceIdentifier(),
						ID_ATTR);
				EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, null);
			} else if (!this.isValidAttribute(configurationElement, CLASS_ATTR)) {
				String message = MessageFormat.format(Messages.RegistryEventListener_missingAttribute, configurationElement.getNamespaceIdentifier(),
						CLASS_ATTR);
				EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, null);
			} else {
				isValid = true;
			}
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
		if (TAG_PROPERTY_SECTIONS.equals(configurationElement.getName())) {
			String contributorId = configurationElement.getAttribute(CONTRIBUTOR_ID_ATTR);
			IConfigurationElement[] propertySections = configurationElement.getChildren(TAG_PROPERTY_SECTION);
			for (IConfigurationElement propertySection : propertySections) {
				// Get the type mapper from contributor ID
				ITypeMapper typeMapper = EEFPropertiesUiLegacyPlugin.getImplementation().getTabbedPropertyContributorRegistry()
						.getTypeMapper(contributorId);

				IEEFTypeMapper eefTypeMapper = null;
				if (typeMapper != null) {
					eefTypeMapper = new EEFLegacyTypeMapper(typeMapper);
				}

				LegacyPropertySectionItemDescriptor legacySectionDescriptor = new LegacyPropertySectionItemDescriptor(propertySection, eefTypeMapper);

				this.propertySectionRegistry.add(legacySectionDescriptor);
			}
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
		return this.propertySectionRegistry.remove(configurationElement.getAttribute(ID_ATTR));
	}

}
