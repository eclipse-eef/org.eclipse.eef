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
package org.eclipse.eef.properties.ui.internal.extension.impl;

import java.text.MessageFormat;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.eef.properties.ui.internal.EEFTabbedPropertyViewPlugin;
import org.eclipse.eef.properties.ui.internal.Messages;
import org.eclipse.eef.properties.ui.internal.extension.AbstractRegistryEventListener;
import org.eclipse.eef.properties.ui.internal.extension.IItemDescriptor;
import org.eclipse.eef.properties.ui.internal.extension.IItemRegistry;

/**
 * Utility class used to retrieved the descriptors of extensions.
 *
 * @author adaussy
 * @author sbegaudeau
 * @author mbats
 *
 * @param <T>
 *            The type of the Object described
 */
public class EEFDescriptorRegistryEventListener<T> extends AbstractRegistryEventListener {
	/** Id attribute of the extension point. */
	public static final String ID_DESCRIPTOR_ATTR = "id"; //$NON-NLS-1$

	/** Label attribute of extension point. */
	public static final String LABEL_DESCRIPTOR_ATTR = "label"; //$NON-NLS-1$

	/** Description attribute of extension point. */
	public static final String DESCRIPTION_DESCRIPTOR_ATTR = "description"; //$NON-NLS-1$

	/** Implementation class attribute of extension point. */
	public static final String IMPL_CLASS_DESCRIPTOR_ATTR = "class"; //$NON-NLS-1$

	/** Descriptor tag of extension point. */
	public static final String TAG_DESCRIPTOR = "descriptor"; //$NON-NLS-1$

	/**
	 * The item registry.
	 */
	private IItemRegistry<T> itemRegistry;

	/**
	 * The constructor.
	 *
	 * @param namespace
	 *            The namespace of the extension point
	 * @param extensionPointID
	 *            The identifier of the extension point
	 * @param itemRegistry
	 *            The {@link IItemRegistry}
	 */
	public EEFDescriptorRegistryEventListener(String namespace, String extensionPointID, IItemRegistry<T> itemRegistry) {
		super(namespace, extensionPointID);
		this.itemRegistry = itemRegistry;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.internal.extensions.AbstractRegistryEventListener#validateConfigurationElement(org.eclipse.core.runtime.IConfigurationElement)
	 */
	@Override
	protected boolean validateConfigurationElement(IConfigurationElement configurationElement) {
		boolean isValid = false;

		if (TAG_DESCRIPTOR.equals(configurationElement.getName())) {
			if (!this.isValidAttribute(configurationElement, ID_DESCRIPTOR_ATTR)) {
				String message = MessageFormat.format(Messages.DescriptorRegistryEventListener_missingAttribute,
						configurationElement.getNamespaceIdentifier(), ID_DESCRIPTOR_ATTR);
				EEFTabbedPropertyViewPlugin.getPlugin().error(message);
			} else if (!this.isValidAttribute(configurationElement, LABEL_DESCRIPTOR_ATTR)) {
				String message = MessageFormat.format(Messages.DescriptorRegistryEventListener_missingAttribute,
						configurationElement.getNamespaceIdentifier(), LABEL_DESCRIPTOR_ATTR);
				EEFTabbedPropertyViewPlugin.getPlugin().error(message);
			} else if (!this.isValidAttribute(configurationElement, DESCRIPTION_DESCRIPTOR_ATTR)) {
				String message = MessageFormat.format(Messages.DescriptorRegistryEventListener_missingAttribute,
						configurationElement.getNamespaceIdentifier(), DESCRIPTION_DESCRIPTOR_ATTR);
				EEFTabbedPropertyViewPlugin.getPlugin().error(message);
			} else if (!this.isValidAttribute(configurationElement, IMPL_CLASS_DESCRIPTOR_ATTR)) {
				String message = MessageFormat.format(Messages.DescriptorRegistryEventListener_missingAttribute,
						configurationElement.getNamespaceIdentifier(), IMPL_CLASS_DESCRIPTOR_ATTR);
				EEFTabbedPropertyViewPlugin.getPlugin().error(message);
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
	@SuppressWarnings("unchecked")
	@Override
	protected boolean processAddition(IConfigurationElement configurationElement) {
		String id = configurationElement.getAttribute(ID_DESCRIPTOR_ATTR);
		String label = configurationElement.getAttribute(LABEL_DESCRIPTOR_ATTR);
		String description = configurationElement.getAttribute(DESCRIPTION_DESCRIPTOR_ATTR);

		try {
			T instance = (T) configurationElement.createExecutableExtension(IMPL_CLASS_DESCRIPTOR_ATTR);

			ItemDescriptor<T> descriptor = new ItemDescriptor<T>(id, label, description, instance);
			IItemDescriptor<T> previous = this.itemRegistry.add(descriptor);
			if (previous != null) {
				String message = MessageFormat.format(Messages.DescriptorRegistryEventListener_extensionAlreadyContributed,
						configurationElement.getAttribute(ID_DESCRIPTOR_ATTR));
				EEFTabbedPropertyViewPlugin.getPlugin().error(message);
			}
		} catch (CoreException e) {
			String attr = configurationElement.getAttribute(IMPL_CLASS_DESCRIPTOR_ATTR);
			String message;
			if (attr != null) {
				message = MessageFormat.format(Messages.DescriptorRegistryEventListener_cannotInstantiateExtension, attr);
			} else {
				message = MessageFormat.format(Messages.DescriptorRegistryEventListener_missingAttribute,
						configurationElement.getNamespaceIdentifier(), IMPL_CLASS_DESCRIPTOR_ATTR);
			}
			EEFTabbedPropertyViewPlugin.getPlugin().error(message, e);
			return false;
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
		return this.itemRegistry.remove(configurationElement.getAttribute(ID_DESCRIPTOR_ATTR)) != null;
	}

}
