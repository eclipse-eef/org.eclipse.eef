/*******************************************************************************
 * Copyright (c) 2001, 2016 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Mariot Chauvin <mariot.chauvin@obeo.fr> - bug 259553
 *     Amit Joglekar <joglekar@us.ibm.com> - Support for dynamic images (bug 385795)
 *     Obeo - Contribution to the EEF project
 *******************************************************************************/
package org.eclipse.eef.properties.ui.internal.page.propertylist;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;

/**
 * The top navigation element in the tabbed property list. It looks like a scroll button when scrolling is needed or is
 * just a spacer when no scrolling is required.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 */
public class EEFBottomNavigationElement extends Canvas {

	/**
	 * The tabbed property list.
	 */
	private EEFTabbedPropertyList tabPropertyList;

	/**
	 * The constructor.
	 *
	 * @param tabbedPropertyList
	 *            The tabbed property list
	 */
	public EEFBottomNavigationElement(final EEFTabbedPropertyList tabbedPropertyList) {
		super(tabbedPropertyList, SWT.NO_FOCUS);
		this.tabPropertyList = tabbedPropertyList;

		this.addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				EEFBottomNavigationElement.this.paint(e);
			}
		});

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				if (tabbedPropertyList.isDownScrollRequired()) {
					tabbedPropertyList.setTopVisibleIndex(tabbedPropertyList.getTopVisibleIndex() + 1);
					if (tabbedPropertyList.getBottomVisibleIndex() != tabbedPropertyList.getNumberOfElements() - 1) {
						tabbedPropertyList.setBottomVisibleIndex(tabbedPropertyList.getBottomVisibleIndex() + 1);
					}
					tabbedPropertyList.layoutTabs();
					tabbedPropertyList.getTopNavigationElement().redraw();
					tabbedPropertyList.getBottomNavigationElement().redraw();
				}
			}
		});
	}

	/**
	 * Paint the element.
	 *
	 * @param e
	 *            The paint event
	 */
	@SuppressWarnings({ "checkstyle:magicnumber" })
	protected void paint(PaintEvent e) {
		e.gc.setBackground(this.tabPropertyList.getColorHolder().getWidgetBackground());
		e.gc.setForeground(this.tabPropertyList.getColorHolder().getWidgetForeground());
		Rectangle bounds = getBounds();

		if (this.tabPropertyList.getNumberOfElements() != 0) {
			e.gc.fillRectangle(0, 0, bounds.width, bounds.height);
			e.gc.setForeground(this.tabPropertyList.getColorHolder().getWidgetNormalShadow());
			e.gc.drawLine(bounds.width - 1, 0, bounds.width - 1, bounds.height - 1);
			e.gc.drawLine(0, 0, bounds.width - 1, 0);

			e.gc.setForeground(this.tabPropertyList.getColorHolder().getBottomNavigationElementShadowStroke1());
			e.gc.drawLine(0, 1, bounds.width - 2, 1);
			e.gc.setForeground(this.tabPropertyList.getColorHolder().getBottomNavigationElementShadowStroke2());
			e.gc.drawLine(0, 2, bounds.width - 2, 2);
		} else {
			e.gc.setBackground(this.tabPropertyList.getColorHolder().getListBackground());
			e.gc.fillRectangle(0, 0, bounds.width, bounds.height);
		}

		if (this.tabPropertyList.isDownScrollRequired()) {
			e.gc.setForeground(this.tabPropertyList.getColorHolder().getWidgetDarkShadow());
			int middle = bounds.width / 2;
			int bottom = bounds.height - 3;
			e.gc.drawLine(middle + 1, bottom, middle + 5, bottom - 4);
			e.gc.drawLine(middle, bottom, middle - 4, bottom - 4);
			e.gc.drawLine(middle - 3, bottom - 4, middle + 4, bottom - 4);

			e.gc.setForeground(this.tabPropertyList.getColorHolder().getListBackground());
			e.gc.drawLine(middle, bottom - 1, middle + 1, bottom - 1);
			e.gc.drawLine(middle - 1, bottom - 2, middle + 2, bottom - 2);
			e.gc.drawLine(middle - 2, bottom - 3, middle + 3, bottom - 3);

			e.gc.setForeground(this.tabPropertyList.getColorHolder().getWidgetNormalShadow());
			e.gc.drawLine(0, bottom - 7, bounds.width - 2, bottom - 7);
			e.gc.setForeground(this.tabPropertyList.getColorHolder().getNavigationElementShadowStroke());
			e.gc.drawLine(0, bottom + 2, bounds.width - 2, bottom + 2);
			e.gc.drawLine(0, bottom - 6, bounds.width - 2, bottom - 6);
		}
	}

}
