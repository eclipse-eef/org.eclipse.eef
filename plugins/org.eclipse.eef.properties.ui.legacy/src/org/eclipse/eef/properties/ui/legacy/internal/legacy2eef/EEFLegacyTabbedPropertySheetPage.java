/*******************************************************************************
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/

package org.eclipse.eef.properties.ui.legacy.internal.legacy2eef;

import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * Wraps an {@link TabbedPropertySheetPage} to an {@link EEFTabbedPropertySheetPage}.
 * 
 * @author mbats
 */
public class EEFLegacyTabbedPropertySheetPage extends EEFTabbedPropertySheetPage {

	/**
	 * The constructor.
	 * 
	 * @param tabbedPropertySheetPage
	 *            A legacy tabbed property sheet page
	 */
	public EEFLegacyTabbedPropertySheetPage(TabbedPropertySheetPage tabbedPropertySheetPage) {
		super(new EEFLegacyTabbedPropertySheetPageContributor());
	}

}
