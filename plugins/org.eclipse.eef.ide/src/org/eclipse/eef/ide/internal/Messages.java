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
package org.eclipse.eef.ide.internal;

import org.eclipse.eef.common.api.utils.I18N;
import org.eclipse.eef.common.api.utils.I18N.TranslatableMessage;

/**
 * Utility class used to hold the messages of the bundle.
 *
 * @author sbegaudeau
 */
@Deprecated
public final class Messages {

	static {
		I18N.initializeMessages(Messages.class, EEFIdePlugin.INSTANCE);
	}

	// CHECKSTYLE:OFF

	@TranslatableMessage
	public static String DescriptorRegistryEventListener_missingAttribute;

	@TranslatableMessage
	public static String DescriptorRegistryEventListener_cannotInstantiateExtension;

	@TranslatableMessage
	public static String DescriptorRegistryEventListener_extensionAlreadyContributed;

	// CHECKSTYLE:ON

	/**
	 * The constructor.
	 */
	private Messages() {
		// Prevents instantiation
	}
}
