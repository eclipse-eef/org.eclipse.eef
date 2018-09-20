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
package org.eclipse.eef.properties.ui.legacy.internal.eef2legacy;

import org.eclipse.eef.properties.ui.api.IEEFSection;
import org.eclipse.eef.properties.ui.legacy.internal.legacy2eef.EEFLegacyTabbedPropertySheetPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * Wraps an {@link IEEFSection} to an {@link ISection}.
 *
 * @author mbats
 */
public class LegacySection implements ISection {

	/**
	 * The EEF section.
	 */
	private IEEFSection eefSection;

	/**
	 * The constructor.
	 *
	 * @param eefSection
	 *            An EEF section
	 */
	public LegacySection(IEEFSection eefSection) {
		this.eefSection = eefSection;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ISection#createControls(Composite, TabbedPropertySheetPage)
	 */
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		this.eefSection.createControls(parent, new EEFLegacyTabbedPropertySheetPage(tabbedPropertySheetPage));
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ISection#setInput(IWorkbenchPart, ISelection)
	 */
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		this.eefSection.setInput(part, selection);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ISection#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		this.eefSection.aboutToBeShown();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ISection#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		this.eefSection.aboutToBeHidden();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ISection#dispose()
	 */
	@Override
	public void dispose() {
		this.eefSection.dispose();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ISection#getMinimumHeight()
	 */
	@Override
	public int getMinimumHeight() {
		return this.eefSection.getMinimumHeight();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ISection#shouldUseExtraSpace()
	 */
	@Override
	public boolean shouldUseExtraSpace() {
		return this.eefSection.shouldUseExtraSpace();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see ISection#refresh()
	 */
	@Override
	public void refresh() {
		this.eefSection.refresh();
	}

}
