/*******************************************************************************
 * Copyright (c) 2015, 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.api;

import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.swt.widgets.Composite;

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
	 * @param formContainer
	 *            The form container
	 */
	void createControl(Composite parent, IEEFFormContainer formContainer);

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
