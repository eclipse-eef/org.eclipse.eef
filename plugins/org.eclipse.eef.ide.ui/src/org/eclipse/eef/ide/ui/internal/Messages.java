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
package org.eclipse.eef.ide.ui.internal;

import org.eclipse.eef.ide.internal.I18N;
import org.eclipse.eef.ide.internal.I18N.TranslatableMessage;

/**
 * Utility class used for the internationalization.
 *
 * @author sbegaudeau
 */
public final class Messages {

	static {
		I18N.initializeMessages(Messages.class, EEFIdeUiPlugin.INSTANCE);
	}

	// CHECKSTYLE:OFF
	@TranslatableMessage
	public static String EEFContainerLifecycleManager_BlankDomainClassExpression;

	@TranslatableMessage
	public static String EEFContainerLifecycleManager_BlankSwitchExpression;

	// CHECKSTYLE:ON

	/**
	 * The constructor.
	 */
	private Messages() {
		// Prevents instanciation.
	}
}
