/*******************************************************************************
 * Copyright (c) 2001, 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Obeo - Contribution in the project EEF
 *******************************************************************************/
package org.eclipse.eef.properties.ui.internal.page;

import org.eclipse.eef.properties.ui.api.IEEFTabDescriptor;
import org.eclipse.jface.viewers.LabelProvider;

/**
 * Label provider for the ListViewer.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 */
public class EEFTabbedPropertySheetPageLabelProvider extends LabelProvider {
	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object element) {
		if (element instanceof IEEFTabDescriptor) {
			return ((IEEFTabDescriptor) element).getLabel();
		}
		return super.getText(element);
	}
}
