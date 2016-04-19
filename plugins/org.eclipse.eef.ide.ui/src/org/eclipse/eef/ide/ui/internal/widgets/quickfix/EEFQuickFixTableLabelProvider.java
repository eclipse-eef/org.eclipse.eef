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

import org.eclipse.eef.EEFValidationFixDescription;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Icons;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * The label provider of the table viewer showing all the quick fixes available.
 *
 * @author sbegaudeau
 */
public class EEFQuickFixTableLabelProvider extends LabelProvider {
	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object element) {
		if (element instanceof EEFValidationFixDescription) {
			EEFValidationFixDescription validationFix = (EEFValidationFixDescription) element;
			return validationFix.getName();
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
		if (element instanceof EEFValidationFixDescription) {
			return EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.FIX);
		}
		return super.getImage(element);
	}
}
