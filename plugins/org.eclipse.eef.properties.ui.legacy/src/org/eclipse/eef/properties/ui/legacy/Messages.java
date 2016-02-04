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
package org.eclipse.eef.properties.ui.legacy;

import org.eclipse.eef.properties.ui.legacy.I18N.TranslatableMessage;
import org.eclipse.eef.properties.ui.legacy.internal.EEFPropertiesUiLegacyPlugin;

/**
 * Utility class used to hold the messages of the bundle.
 *
 * @author sbegaudeau
 * @author mbats
 */
public final class Messages {

	static {
		I18N.initializeMessages(Messages.class, EEFPropertiesUiLegacyPlugin.INSTANCE);
	}

	// CHECKSTYLE:OFF

	@TranslatableMessage
	public static String RegistryEventListener_missingAttribute;

	@TranslatableMessage
	public static String RegistryEventListener_cannotInstantiateExtension;

	@TranslatableMessage
	public static String Eef2LegacyWrapper_failedToAccessField;

	// CHECKSTYLE:ON

	/**
	 * The constructor.
	 */
	private Messages() {
		// Prevents instantiation
	}
}
