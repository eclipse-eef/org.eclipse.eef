/*******************************************************************************
 * Copyright (c) 2001, 2016 IBM Corporation and others.
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

import org.eclipse.swt.graphics.Image;

/**
 * Represents a tab to be displayed in the tab list in the tabbed property sheet page.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 * @since 1.6.0
 */
public interface IEEFTabItem {

	/**
	 * Get the icon image for the tab.
	 *
	 * @return the icon image for the tab.
	 */
	Image getImage();

	/**
	 * Get the text label for the tab.
	 *
	 * @return the text label for the tab.
	 */
	String getText();

	/**
	 * Determine if this tab is selected.
	 *
	 * @return <code>true</code> if this tab is selected.
	 */
	boolean isSelected();

	/**
	 * Determine if this tab is indented.
	 *
	 * @return <code>true</code> if this tab is indented.
	 */
	boolean isIndented();

}
