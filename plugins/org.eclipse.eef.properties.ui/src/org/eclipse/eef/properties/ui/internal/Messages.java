/*******************************************************************************
 * Copyright (c) 2015, 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.properties.ui.internal;

import org.eclipse.eef.common.api.utils.I18N;
import org.eclipse.eef.common.api.utils.I18N.TranslatableMessage;

/**
 * Utility class used to hold the messages of the bundle.
 *
 * @author mbats
 */
public final class Messages {
	static {
		I18N.initializeMessages(Messages.class, EEFTabbedPropertyViewPlugin.INSTANCE);
	}

	// CHECKSTYLE:OFF

	@TranslatableMessage
	public static String DescriptorRegistryEventListener_missingAttribute;

	@TranslatableMessage
	public static String DescriptorRegistryEventListener_extensionAlreadyContributed;

	@TranslatableMessage
	public static String EEFTabbedPropertyRegistry_MissingSectionDescriptorId;

	@TranslatableMessage
	public static String DescriptorRegistryEventListener_cannotInstantiateExtension;

	@TranslatableMessage
	public static String EEFTopNavigationElement_noPropertiesAvailable;

	@TranslatableMessage
	public static String EEFTabbedPropertyList_propertiesNotAvailable;

	// CHECKSTYLE:ON

	/**
	 * The constructor.
	 */
	private Messages() {
		// Prevents instantiation
	}
}
