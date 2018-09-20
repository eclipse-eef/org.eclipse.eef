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

import org.eclipse.eef.properties.ui.api.AbstractEEFSection;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.legacy.internal.eef2legacy.LegacyTabbedPropertySheetPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ISection;

/**
 * Wraps an {@link ISection} to an {@link AbstractEEFSection}.
 *
 * @author mbats
 */
public class EEFLegacySection extends AbstractEEFSection {
	/**
	 * The legacy section.
	 */
	private ISection legacySection;

	/**
	 * The constructor.
	 *
	 * @param legacySection
	 *            A legacy section
	 */
	public EEFLegacySection(ISection legacySection) {
		this.legacySection = legacySection;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.AbstractEEFSection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage)
	 */
	@Override
	public void createControls(Composite parent, EEFTabbedPropertySheetPage eefTabbedPropertySheetPage) {
		legacySection.createControls(parent, new LegacyTabbedPropertySheetPage(eefTabbedPropertySheetPage));
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.AbstractEEFSection#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		legacySection.aboutToBeHidden();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.AbstractEEFSection#dispose()
	 */
	@Override
	public void dispose() {
		legacySection.dispose();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return legacySection.equals(obj);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.AbstractEEFSection#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		legacySection.aboutToBeShown();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.AbstractEEFSection#getMinimumHeight()
	 */
	@Override
	public int getMinimumHeight() {
		return legacySection.getMinimumHeight();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return legacySection.hashCode();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.AbstractEEFSection#refresh()
	 */
	@Override
	public void refresh() {
		legacySection.refresh();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.AbstractEEFSection#setInput(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void setInput(IWorkbenchPart workbenchPart, ISelection currentSelection) {
		legacySection.setInput(workbenchPart, currentSelection);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.AbstractEEFSection#shouldUseExtraSpace()
	 */
	@Override
	public boolean shouldUseExtraSpace() {
		return legacySection.shouldUseExtraSpace();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return legacySection.toString();
	}
}
