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
package org.eclipse.eef.common.ui.api;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.Form;

/**
 * This interface represents the root container of the properties to be displayed, for example a tabbed property sheet
 * page, an editor or a dialog.
 *
 * @author sbegaudeau
 */
public interface IEEFFormContainer {
	/**
	 * Returns the form.
	 *
	 * @return The form
	 */
	Form getForm();

	/**
	 * Returns the shell used by the container.
	 *
	 * @return The shell used by the container
	 */
	Shell getShell();

	/**
	 * Returns the widget factory.
	 *
	 * @return The widget factory
	 */
	EEFWidgetFactory getWidgetFactory();

	/**
	 * Indicates if the form container is currently rendering the user interface.
	 *
	 * @return <code>true</code> if the user interface is currently being rendered, <code>false</code> otherwise
	 */
	boolean isRenderingInProgress();

	/**
	 * Refresh the page.
	 */
	void refreshPage();
}
