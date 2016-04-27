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
import org.eclipse.eef.properties.ui.legacy.internal.EEFPropertiesUiLegacyPlugin;
import org.eclipse.eef.properties.ui.legacy.internal.Messages;
import org.eclipse.eef.properties.ui.legacy.internal.extension.AbstractRegistryEventListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Utility class used to retrieved the descriptors of extensions.
 *
 * @author mbats
 */
public class LegacyPropertyTabsRegistryEventListener extends AbstractRegistryEventListener {

	/** PropertyTab tag of extension point. */
	public static final String TAG_PROPERTY_TABS = "propertyTabs"; //$NON-NLS-1$

	/** Required contributorId attribute of extension point. */
	public static final String CONTRIBUTOR_ID_ATTR = "contributorId"; //$NON-NLS-1$

	/** PropertyTab tag of extension point. */
	public static final String TAG_PROPERTY_TAB = "propertyTab"; //$NON-NLS-1$

	/** Required label attribute of extension point. */
	public static final String LABEL_ATTR = "label"; //$NON-NLS-1$

	/** Required category attribute of extension point. */
	public static final String CATEGORY_ATTR = "category"; //$NON-NLS-1$

	/** Optional afterTab attribute of extension point. */
	public static final String AFTER_TAB_ATTR = "afterTab"; //$NON-NLS-1$

	/** Required id attribute of extension point. */
	public static final String ID_ATTR = "id"; //$NON-NLS-1$

	/** Optional indented attribute of extension point. */
	public static final String INDENTED_ATTR = "indented"; //$NON-NLS-1$

	/** Optional image attribute of extension point. */
	public static final String IMAGE_ATTR = "image"; //$NON-NLS-1$

	/**
	 * The item registry.
	 */
	private LegacyPropertyTabRegistry propertyTabRegistry;

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
	public LegacyPropertyTabsRegistryEventListener(String namespace, String extensionPointID, LegacyPropertyTabRegistry itemRegistry) {
		super(namespace, extensionPointID);
		this.propertyTabRegistry = itemRegistry;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.internal.extensions.AbstractRegistryEventListener#validateConfigurationElement(org.eclipse.core.runtime.IConfigurationElement)
	 */
	@Override
	protected boolean validateConfigurationElement(IConfigurationElement configurationElement) {
		boolean isValid = false;
		if (TAG_PROPERTY_TABS.equals(configurationElement.getName())) {
			if (!this.isValidAttribute(configurationElement, CONTRIBUTOR_ID_ATTR)) {
				String message = MessageFormat.format(Messages.RegistryEventListener_missingAttribute, configurationElement.getNamespaceIdentifier(),
						CONTRIBUTOR_ID_ATTR);
				EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, null);
			} else {
				isValid = true;
			}
		} else if (TAG_PROPERTY_TAB.equals(configurationElement.getName())) {
			if (!this.isValidAttribute(configurationElement, LABEL_ATTR)) {
				String message = MessageFormat.format(Messages.RegistryEventListener_missingAttribute, configurationElement.getNamespaceIdentifier(),
						LABEL_ATTR);
				EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, null);
			} else if (!this.isValidAttribute(configurationElement, CATEGORY_ATTR)) {
				String message = MessageFormat.format(Messages.RegistryEventListener_missingAttribute, configurationElement.getNamespaceIdentifier(),
						CATEGORY_ATTR);
				EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, null);
			} else if (!this.isValidAttribute(configurationElement, ID_ATTR)) {
				String message = MessageFormat.format(Messages.RegistryEventListener_missingAttribute, configurationElement.getNamespaceIdentifier(),
						ID_ATTR);
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
		if (TAG_PROPERTY_TAB.equals(configurationElement.getName())) {
			String category = configurationElement.getAttribute(CATEGORY_ATTR);
			String label = configurationElement.getAttribute(LABEL_ATTR);
			String id = configurationElement.getAttribute(ID_ATTR);
			String afterTab = configurationElement.getAttribute(AFTER_TAB_ATTR);
			String indentedString = configurationElement.getAttribute(INDENTED_ATTR);
			boolean indented = indentedString != null && "true".equals(indentedString); //$NON-NLS-1$ 
			String imageString = configurationElement.getAttribute(IMAGE_ATTR);
			Image image = null;
			if (imageString != null) {
				image = AbstractUIPlugin
						.imageDescriptorFromPlugin(configurationElement.getDeclaringExtension().getNamespaceIdentifier(), imageString).createImage();
			}

			LegacyPropertyTabItemDescriptor legacyPropertyTab = new LegacyPropertyTabItemDescriptor(label, category, afterTab, id, indented, image);
			this.propertyTabRegistry.add(legacyPropertyTab);
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
		return this.propertyTabRegistry.remove(configurationElement.getAttribute(ID_ATTR)) != null;
	}

}
