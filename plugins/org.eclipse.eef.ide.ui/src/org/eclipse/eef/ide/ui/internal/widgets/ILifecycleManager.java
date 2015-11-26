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
package org.eclipse.eef.ide.ui.internal.widgets;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * Implementations of this interface will be used to handle the lifecycle of the widgets and controllers created for a
 * description.
 *
 * @author sbegaudeau
 */
public interface ILifecycleManager {
	/**
	 * Creates the controls for the description.
	 * 
	 * @param parent
	 *            The composite parent
	 * @param tabbedPropertySheetPage
	 *            The tabbed property sheet page
	 */
	void createControl(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage);

	/**
	 * Prepares for the widgets to be shown.
	 */
	void aboutToBeShown();

	/**
	 * Refresh the widgets.
	 */
	void refresh();

	/**
	 * Prepares for the widgets to be hidden.
	 */
	void aboutToBeHidden();

	/**
	 * Disposes the content created. The widgets created under the composite will be disposed by SWT already.
	 */
	void dispose();
}
