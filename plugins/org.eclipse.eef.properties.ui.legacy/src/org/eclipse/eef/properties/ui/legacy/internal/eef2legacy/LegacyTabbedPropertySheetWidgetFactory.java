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

import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.List;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

/**
 * Wraps an {@link EEFTabbedPropertySheetWidgetFactory} to a {@link TabbedPropertySheetWidgetFactory}.
 *
 * @author mbats
 */
public class LegacyTabbedPropertySheetWidgetFactory extends TabbedPropertySheetWidgetFactory {

	/**
	 * The EEF tabbed property sheet page widget factory.
	 */
	private EEFWidgetFactory eefWidgetFactory;

	/**
	 * The constructor.
	 *
	 * @param eefWidgetFactory
	 *            EEF tabbed property sheet page widget factory
	 */
	public LegacyTabbedPropertySheetWidgetFactory(EEFWidgetFactory eefWidgetFactory) {
		this.eefWidgetFactory = eefWidgetFactory;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetWidgetFactory#createTabFolder(Composite, int)
	 */
	@Override
	public CTabFolder createTabFolder(Composite parent, int style) {
		return this.eefWidgetFactory.createTabFolder(parent, style);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetWidgetFactory#createTabItem(CTabFolder, int)
	 */
	@Override
	public CTabItem createTabItem(CTabFolder tabFolder, int style) {
		return this.eefWidgetFactory.createTabItem(tabFolder, style);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetWidgetFactory#createList(Composite, int)
	 */
	@Override
	public List createList(Composite parent, int style) {
		return this.eefWidgetFactory.createList(parent, style);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetWidgetFactory#createComposite(Composite, int)
	 */
	@Override
	public Composite createComposite(Composite parent, int style) {
		return this.eefWidgetFactory.createComposite(parent, style);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetWidgetFactory#createComposite(Composite)
	 */
	@Override
	public Composite createComposite(Composite parent) {
		return this.eefWidgetFactory.createComposite(parent);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetWidgetFactory#createPlainComposite(Composite, int)
	 */
	@Override
	public Composite createPlainComposite(Composite parent, int style) {
		return this.eefWidgetFactory.createPlainComposite(parent, style);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetWidgetFactory#createScrolledComposite(Composite, int)
	 */
	@Override
	public ScrolledComposite createScrolledComposite(Composite parent, int style) {
		return this.eefWidgetFactory.createScrolledComposite(parent, style);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetWidgetFactory#createCCombo(Composite, int)
	 */
	@Override
	public CCombo createCCombo(Composite parent, int comboStyle) {
		return this.eefWidgetFactory.createCCombo(parent, comboStyle);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetWidgetFactory#createCCombo(Composite)
	 */
	@Override
	public CCombo createCCombo(Composite parent) {
		return this.eefWidgetFactory.createCCombo(parent);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetWidgetFactory#createGroup(Composite, String)
	 */
	@Override
	public Group createGroup(Composite parent, String text) {
		return this.eefWidgetFactory.createGroup(parent, text);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetWidgetFactory#createFlatFormComposite(Composite)
	 */
	@Override
	public Composite createFlatFormComposite(Composite parent) {
		return this.eefWidgetFactory.createFlatFormComposite(parent);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetWidgetFactory#createCLabel(Composite, String)
	 */
	@Override
	public CLabel createCLabel(Composite parent, String text) {
		return this.eefWidgetFactory.createCLabel(parent, text);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetWidgetFactory#createCLabel(Composite, String, int)
	 */
	@Override
	public CLabel createCLabel(Composite parent, String text, int style) {
		return this.eefWidgetFactory.createCLabel(parent, text, style);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetWidgetFactory#dispose()
	 */
	@Override
	public void dispose() {
		this.eefWidgetFactory.dispose();
		super.dispose();
	}

}
