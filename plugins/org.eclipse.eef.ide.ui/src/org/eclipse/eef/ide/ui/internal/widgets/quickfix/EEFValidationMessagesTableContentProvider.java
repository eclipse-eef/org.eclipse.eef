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
package org.eclipse.eef.ide.ui.internal.widgets.quickfix;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.ui.forms.IMessage;

/**
 * The content provider used to display the validation messages.
 *
 * @author sbegaudeau
 */
public class EEFValidationMessagesTableContentProvider implements IStructuredContentProvider {

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof IMessage[]) {
			return (IMessage[]) inputElement;
		}
		return new Object[0];
	}

}
