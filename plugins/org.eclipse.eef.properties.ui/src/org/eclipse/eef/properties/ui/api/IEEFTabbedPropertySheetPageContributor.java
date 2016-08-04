/*******************************************************************************
 * Copyright (c) 2001, 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Obeo - Contribution to the EEF project
 *******************************************************************************/
package org.eclipse.eef.properties.ui.api;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.forms.widgets.Form;

/**
 * Interface for a workbench part to contribute content to the tabbed property view.
 * <p>
 * It is expected that the contributor ID is unique for a configuration of tabs and sections. Editors and views can
 * share a configuration by sharing a contributor ID. Editors and views cannot share tabs and sections from multiple
 * contributors.
 * </p>
 * <p>
 * As a workaround, if all the elements in a structured selection implement IEEFTabbedPropertySheetPageContributor and
 * they all return the same unique contributor ID, then that configuration of tabs and sections will be used by the
 * tabbed property view for that selection.
 * </p>
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 * @since 1.6.0
 */
public interface IEEFTabbedPropertySheetPageContributor {
	/**
	 * Returns the contributor ID for the tabbed property sheet page.
	 *
	 * @return the contributor ID for the tabbed property sheet page.
	 */
	String getContributorId();

	/**
	 * Updates the text and label.
	 *
	 * @param form
	 *            The form
	 * @param selection
	 *            The current selection
	 */
	void updateFormTitle(Form form, ISelection selection);
}
