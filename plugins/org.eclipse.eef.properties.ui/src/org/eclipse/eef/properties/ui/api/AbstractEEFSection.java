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
package org.eclipse.eef.properties.ui.api;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Basic implementation of {@link IEEFSection}.
 *
 * @author sbegaudeau
 */
public abstract class AbstractEEFSection implements IEEFSection {
	/**
	 * The standard label width when labels for sections line up on the left hand side of the composite.
	 */
	public static final int STANDARD_LABEL_WIDTH = 85;

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage)
	 */
	@Override
	public void createControls(Composite parent, EEFTabbedPropertySheetPage aTabbedPropertySheetPage) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSection#setInput(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void setInput(IWorkbenchPart workbenchPart, ISelection currentSelection) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSection#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		/* empty default implementation */
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSection#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		/* empty default implementation */
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSection#dispose()
	 */
	@Override
	public void dispose() {
		/* empty default implementation */
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSection#getMinimumHeight()
	 */
	@Override
	public int getMinimumHeight() {
		return SWT.DEFAULT;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSection#shouldUseExtraSpace()
	 */
	@Override
	public boolean shouldUseExtraSpace() {
		return false;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFSection#refresh()
	 */
	@Override
	public void refresh() {
		/* empty default implementation */
	}
}
