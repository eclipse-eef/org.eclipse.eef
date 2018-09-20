/*******************************************************************************
 * Copyright (c) 2016, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.properties.ui.internal.page;

import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.IMessagePrefixProvider;

/**
 * This {@link IMessagePrefixProvider} will return an empty string as the prefix.
 *
 * @author sbegaudeau
 */
public class EEFMessagePrefixProvider implements IMessagePrefixProvider {

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.forms.IMessagePrefixProvider#getPrefix(org.eclipse.swt.widgets.Control)
	 */
	@Override
	public String getPrefix(Control control) {
		return ""; //$NON-NLS-1$
	}

}
