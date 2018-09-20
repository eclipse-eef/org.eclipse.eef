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
package org.eclipse.eef.ide.ui.properties.api;

import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.ide.ui.api.EEFTab;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.api.IEEFSection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;

/**
 * The implementation of {@link IEEFSection} using the {@link EEFSectionDescriptor}.
 *
 * @author sbegaudeau
 */
public class EEFSection implements IEEFSection {

	/**
	 * The tab managed by EEF.
	 */
	private EEFTab tab;

	/**
	 * The constructor.
	 *
	 * @param eefPage
	 *            The page
	 */
	public EEFSection(EEFPage eefPage) {
		this.tab = new EEFTab(eefPage);
	}

	@Override
	public void createControls(Composite parent, EEFTabbedPropertySheetPage tabbedPropertySheetPage) {
		this.tab.createControls(parent, tabbedPropertySheetPage);
	}

	@Override
	public void aboutToBeShown() {
		this.tab.aboutToBeShown();
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		this.tab.setInput(part, selection);
	}

	@Override
	public void refresh() {
		this.tab.refresh();
	}

	@Override
	public void aboutToBeHidden() {
		this.tab.aboutToBeHidden();
	}

	@Override
	public void dispose() {
		this.tab.dispose();
	}

	@Override
	public int getMinimumHeight() {
		return SWT.DEFAULT;
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}
}
