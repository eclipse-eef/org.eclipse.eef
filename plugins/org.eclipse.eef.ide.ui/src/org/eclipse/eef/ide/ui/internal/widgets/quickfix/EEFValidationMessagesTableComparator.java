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
package org.eclipse.eef.ide.ui.internal.widgets.quickfix;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.ui.forms.IMessage;

/**
 * The comparator used to order the message.
 *
 * @author sbegaudeau
 */
public class EEFValidationMessagesTableComparator extends ViewerComparator {
	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.ViewerComparator#compare(org.eclipse.jface.viewers.Viewer, java.lang.Object,
	 *      java.lang.Object)
	 */
	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		if (e1 instanceof IMessage && e2 instanceof IMessage) {
			IMessage message1 = (IMessage) e1;
			IMessage message2 = (IMessage) e2;

			int result = 0;
			if (message1.getMessageType() == message2.getMessageType() && message1.getMessage() != null) {
				result = message1.getMessage().compareTo(message2.getMessage());
			} else {
				result = message1.getMessageType() - message2.getMessageType();
			}
			return result;
		}
		return super.compare(viewer, e1, e2);
	}
}
