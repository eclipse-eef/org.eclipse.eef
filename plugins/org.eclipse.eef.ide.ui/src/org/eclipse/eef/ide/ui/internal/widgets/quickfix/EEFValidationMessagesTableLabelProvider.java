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

import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Icons;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.forms.IMessage;

/**
 * The label provider used to display the validation messages.
 *
 * @author sbegaudeau
 */
public class EEFValidationMessagesTableLabelProvider extends LabelProvider {
	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object element) {
		if (element instanceof IMessage) {
			return ((IMessage) element).getMessage();
		}
		return super.getText(element);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.LabelProvider#getImage(java.lang.Object)
	 */
	@Override
	public Image getImage(Object element) {
		if (element instanceof IMessage) {
			IMessage message = (IMessage) element;
			int type = message.getMessageType();

			Image image = null;

			switch (type) {
			case IMessage.ERROR:
				image = EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.ERROR);
				break;
			case IMessage.WARNING:
				image = EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.WARNING);
				break;
			case IMessage.INFORMATION:
				image = EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.INFO);
				break;
			default: // do nothing, image is already null
				break;
			}

			return image;
		}
		return super.getImage(element);
	}
}
