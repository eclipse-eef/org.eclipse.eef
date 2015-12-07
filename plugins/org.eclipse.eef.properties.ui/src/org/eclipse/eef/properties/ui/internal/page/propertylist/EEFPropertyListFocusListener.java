/*******************************************************************************
 * Copyright (c) 2001, 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Mariot Chauvin <mariot.chauvin@obeo.fr> - bug 259553
 *     Amit Joglekar <joglekar@us.ibm.com> - Support for dynamic images (bug 385795)
 *     Obeo - Contribution to the project EEF
 *******************************************************************************/
package org.eclipse.eef.properties.ui.internal.page.propertylist;

import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;

/**
 * The focus listener of the {@link EEFTabbedPropertyList}.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 */
public class EEFPropertyListFocusListener implements FocusListener {

	/**
	 * The tabbed property list.
	 */
	private EEFTabbedPropertyList tabbedPropertyList;

	/**
	 * The constructor.
	 *
	 * @param tabbedPropertyList
	 *            The tabbed property list
	 */
	public EEFPropertyListFocusListener(EEFTabbedPropertyList tabbedPropertyList) {
		this.tabbedPropertyList = tabbedPropertyList;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.swt.events.FocusListener#focusGained(org.eclipse.swt.events.FocusEvent)
	 */
	@Override
	public void focusGained(FocusEvent event) {
		this.tabbedPropertyList.setFocus(true);
		int index = this.tabbedPropertyList.getSelectionIndex();
		if (index >= 0) {
			this.tabbedPropertyList.getElementAt(index).redraw();
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.swt.events.FocusListener#focusLost(org.eclipse.swt.events.FocusEvent)
	 */
	@Override
	public void focusLost(FocusEvent event) {
		this.tabbedPropertyList.setFocus(false);
		int index = this.tabbedPropertyList.getSelectionIndex();
		if (index >= 0) {
			this.tabbedPropertyList.getElementAt(index).redraw();
		}
	}

}
