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

package org.eclipse.eef.properties.ui.legacy.internal.legacy2eef;

import org.eclipse.eef.properties.ui.api.AbstractEEFPropertySection;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetWidgetFactory;
import org.eclipse.eef.properties.ui.legacy.internal.eef2legacy.LegacyTabbedPropertySheetPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;

/**
 * Wraps an {@link AbstractPropertySection} to an {@link AbstractEEFPropertySection}.
 * 
 * @author mbats
 */
public class EEFLegacySection extends AbstractEEFPropertySection {
	/**
	 * The legacy section.
	 */
	private AbstractPropertySection legacySection;

	/**
	 * The constructor.
	 * 
	 * @param legacySection
	 *            A legacy section
	 */
	public EEFLegacySection(AbstractPropertySection legacySection) {
		this.legacySection = legacySection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see AbstractPropertySection#createControls(Composite, EEFTabbedPropertySheetPage)
	 */
	@Override
	public void createControls(Composite parent, EEFTabbedPropertySheetPage eefTabbedPropertySheetPage) {
		legacySection.createControls(parent, new LegacyTabbedPropertySheetPage(eefTabbedPropertySheetPage));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see AbstractPropertySection#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		legacySection.aboutToBeHidden();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see AbstractPropertySection#dispose()
	 */
	@Override
	public void dispose() {
		legacySection.dispose();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see AbstractPropertySection#equals(Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return legacySection.equals(obj);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see AbstractPropertySection#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		legacySection.aboutToBeShown();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see AbstractPropertySection#getMinimumHeight()
	 */
	@Override
	public int getMinimumHeight() {
		return legacySection.getMinimumHeight();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see AbstractEEFPropertySection#getPart()
	 */
	@Override
	public IWorkbenchPart getPart() {
		return legacySection.getPart();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see AbstractEEFPropertySection#getSelection()
	 */
	@Override
	public ISelection getSelection() {
		return legacySection.getSelection();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see AbstractPropertySection#hashCode()
	 */
	@Override
	public int hashCode() {
		return legacySection.hashCode();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see AbstractPropertySection#refresh()
	 */
	@Override
	public void refresh() {
		legacySection.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see AbstractPropertySection#setInput(IWorkbenchPart, ISelection)
	 */
	@Override
	public void setInput(IWorkbenchPart workbenchPart, ISelection currentSelection) {
		legacySection.setInput(workbenchPart, currentSelection);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see AbstractPropertySection#shouldUseExtraSpace()
	 */
	@Override
	public boolean shouldUseExtraSpace() {
		return legacySection.shouldUseExtraSpace();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see AbstractPropertySection#toString()
	 */
	@Override
	public String toString() {
		return legacySection.toString();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see AbstractEEFPropertySection#getWidgetFactory()
	 */
	@Override
	public EEFTabbedPropertySheetWidgetFactory getWidgetFactory() {
		return new EEFLegacyTabbedPropertySheetWidgetFactory(legacySection.getWidgetFactory());
	}
}
