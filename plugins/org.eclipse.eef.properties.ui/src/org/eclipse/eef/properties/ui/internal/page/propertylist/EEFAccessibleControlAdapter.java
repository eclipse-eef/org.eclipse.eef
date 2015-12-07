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

import org.eclipse.swt.accessibility.ACC;
import org.eclipse.swt.accessibility.AccessibleControlAdapter;
import org.eclipse.swt.accessibility.AccessibleControlEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;

/**
 * Accessibility control adapter for the {@link EEFTabbedPropertyList}.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 */
public class EEFAccessibleControlAdapter extends AccessibleControlAdapter {
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
	public EEFAccessibleControlAdapter(EEFTabbedPropertyList tabbedPropertyList) {
		this.tabbedPropertyList = tabbedPropertyList;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.swt.accessibility.AccessibleControlAdapter#getChildAtPoint(org.eclipse.swt.accessibility.AccessibleControlEvent)
	 */
	@Override
	public void getChildAtPoint(AccessibleControlEvent e) {
		Point point = this.tabbedPropertyList.toControl(new Point(e.x, e.y));
		if (this.tabbedPropertyList.getBounds().contains(point)) {
			e.childID = ACC.CHILDID_SELF;
		} else {
			e.childID = ACC.CHILDID_NONE;
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.swt.accessibility.AccessibleControlAdapter#getLocation(org.eclipse.swt.accessibility.AccessibleControlEvent)
	 */
	@Override
	public void getLocation(AccessibleControlEvent e) {
		if (this.tabbedPropertyList.getSelectionIndex() != EEFTabbedPropertyList.NONE) {
			Rectangle location = this.tabbedPropertyList.getElementAt(this.tabbedPropertyList.getSelectionIndex()).getBounds();
			Point pt = this.tabbedPropertyList.toDisplay(new Point(location.x, location.y));
			e.x = pt.x;
			e.y = pt.y;
			e.width = location.width;
			e.height = location.height;
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.swt.accessibility.AccessibleControlAdapter#getChildCount(org.eclipse.swt.accessibility.AccessibleControlEvent)
	 */
	@Override
	public void getChildCount(AccessibleControlEvent e) {
		e.detail = 0;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.swt.accessibility.AccessibleControlAdapter#getRole(org.eclipse.swt.accessibility.AccessibleControlEvent)
	 */
	@Override
	public void getRole(AccessibleControlEvent e) {
		e.detail = ACC.ROLE_TABITEM;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.swt.accessibility.AccessibleControlAdapter#getState(org.eclipse.swt.accessibility.AccessibleControlEvent)
	 */
	@Override
	public void getState(AccessibleControlEvent e) {
		e.detail = ACC.STATE_NORMAL | ACC.STATE_SELECTABLE | ACC.STATE_SELECTED;
		e.detail = e.detail | ACC.STATE_FOCUSED | ACC.STATE_FOCUSABLE;
	}
}
