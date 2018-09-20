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

import org.eclipse.eef.EEFValidationFixDescription;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

/**
 * The viewer comparator used to order the quick fixes.
 *
 * @author sbegaudeau
 */
public class EEFQuickFixTableComparator extends ViewerComparator {
	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.ViewerComparator#compare(org.eclipse.jface.viewers.Viewer, java.lang.Object,
	 *      java.lang.Object)
	 */
	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		if (e1 instanceof EEFValidationFixDescription && e2 instanceof EEFValidationFixDescription) {
			EEFValidationFixDescription validationFix1 = (EEFValidationFixDescription) e1;
			EEFValidationFixDescription validationFix2 = (EEFValidationFixDescription) e2;
			if (validationFix1.getName() != null && validationFix2.getName() != null) {
				return validationFix1.getName().compareTo(validationFix2.getName());
			}
		}
		return super.compare(viewer, e1, e2);
	}
}
