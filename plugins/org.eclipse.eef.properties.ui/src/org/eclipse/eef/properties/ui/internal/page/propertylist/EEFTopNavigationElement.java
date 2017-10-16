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
 *     Obeo - Contribution to the EEF project
 *******************************************************************************/
package org.eclipse.eef.properties.ui.internal.page.propertylist;

import org.eclipse.eef.properties.ui.internal.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;

/**
 * The top navigation element in the tabbed property list. It looks like a scroll button when scrolling is needed or is
 * just a spacer when no scrolling is required.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 */
public class EEFTopNavigationElement extends Canvas {

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
	public EEFTopNavigationElement(final EEFTabbedPropertyList tabbedPropertyList) {
		super(tabbedPropertyList, SWT.NO_FOCUS);
		this.tabPropertyList = tabbedPropertyList;

		this.addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent event) {
				EEFTopNavigationElement.this.paint(event);
			}
		});

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				if (tabbedPropertyList.isUpScrollRequired()) {
					tabbedPropertyList.setBottomVisibleIndex(tabbedPropertyList.getBottomVisibleIndex() - 1);
					if (tabbedPropertyList.getTopVisibleIndex() != 0) {
						tabbedPropertyList.setTopVisibleIndex(tabbedPropertyList.getTopVisibleIndex() - 1);
					}
					tabbedPropertyList.layoutTabs();
					tabbedPropertyList.getTopNavigationElement().redraw();
					tabbedPropertyList.getBottomNavigationElement().redraw();
				}
			}
		});
	}

	/**
	 * Pain the element.
	 *
	 * @param event
	 *            The pain event
	 */
	@SuppressWarnings({ "checkstyle:magicnumber" })
	protected void paint(PaintEvent event) {
		event.gc.setBackground(this.tabPropertyList.getColorHolder().getWidgetBackground());
		event.gc.setForeground(this.tabPropertyList.getColorHolder().getWidgetForeground());
		Rectangle bounds = getBounds();

		if (this.tabPropertyList.getNumberOfElements() != 0) {
			event.gc.fillRectangle(0, 0, bounds.width, bounds.height);
			event.gc.setForeground(this.tabPropertyList.getColorHolder().getWidgetNormalShadow());
			event.gc.drawLine(bounds.width - 1, 0, bounds.width - 1, bounds.height - 1);
		} else {
			event.gc.setBackground(this.tabPropertyList.getColorHolder().getListBackground());
			event.gc.fillRectangle(0, 0, bounds.width, bounds.height);
			int textIndent = EEFTabbedPropertyList.INDENT;
			FontMetrics fm = event.gc.getFontMetrics();
			int height = fm.getHeight();
			int textMiddle = (bounds.height - height) / 2;
			event.gc.setForeground(this.tabPropertyList.getColorHolder().getWidgetForeground());
			String propertiesNotAvailable = Messages.EEFTopNavigationElement_noPropertiesAvailable;
			event.gc.drawText(propertiesNotAvailable, textIndent, textMiddle);
		}

		if (this.tabPropertyList.isUpScrollRequired()) {
			event.gc.setForeground(this.tabPropertyList.getColorHolder().getWidgetDarkShadow());
			int middle = bounds.width / 2;
			event.gc.drawLine(middle + 1, 3, middle + 5, 7);
			event.gc.drawLine(middle, 3, middle - 4, 7);
			event.gc.drawLine(middle - 3, 7, middle + 4, 7);

			event.gc.setForeground(this.tabPropertyList.getColorHolder().getListBackground());
			event.gc.drawLine(middle, 4, middle + 1, 4);
			event.gc.drawLine(middle - 1, 5, middle + 2, 5);
			event.gc.drawLine(middle - 2, 6, middle + 3, 6);

			event.gc.setForeground(this.tabPropertyList.getColorHolder().getWidgetNormalShadow());
			event.gc.drawLine(0, 0, bounds.width - 2, 0);
			event.gc.setForeground(this.tabPropertyList.getColorHolder().getNavigationElementShadowStroke());
			event.gc.drawLine(0, 1, bounds.width - 2, 1);
			event.gc.drawLine(0, bounds.height - 1, bounds.width - 2, bounds.height - 1);
		}
	}

}
