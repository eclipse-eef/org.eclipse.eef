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
package org.eclipse.eef.properties.ui.legacy.internal.legacy2eef;

import org.eclipse.eef.properties.ui.api.IEEFTabbedPropertySheetPageContributor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.forms.widgets.Form;

/**
 * Wraps a TabbedPropertySheetPage contributor to an {@link IEEFTabbedPropertySheetPageContributor}.
 *
 * @author mbats
 */
public class EEFLegacyTabbedPropertySheetPageContributor implements IEEFTabbedPropertySheetPageContributor {

	@Override
	public String getContributorId() {
		return null; // no issue here... in theory :)
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFTabbedPropertySheetPageContributor#updateFormTitle(org.eclipse.ui.forms.widgets.Form,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void updateFormTitle(Form form, ISelection selection) {
		// let's do nothing, this is fine in theory :)
	}

}
