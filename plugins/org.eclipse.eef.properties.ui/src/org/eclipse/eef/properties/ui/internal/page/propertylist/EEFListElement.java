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

import org.eclipse.eef.properties.ui.api.IEEFTabItem;
import org.eclipse.eef.properties.ui.internal.page.EEFTabbedPropertyComposite;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseTrackAdapter;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

/**
 * One of the tabs in the tabbed property list.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 */
public class EEFListElement extends Canvas {
	/**
	 * The tab.
	 */
	private IEEFTabItem tab;

	/**
	 * The index.
	 */
	private int index;

	/**
	 * The tabbed property list.
	 */
	private EEFTabbedPropertyList tabbedPropertyList;

	/**
	 * Indicates if the tab is selected.
	 */
	private boolean selected;

	/**
	 * Indicates if the tab is hovered.
	 */
	private boolean hover;

	/**
	 * Array of the dynamic images to use.
	 */
	private Image[] dynamicImages;

	/**
	 * The color of the text.
	 */
	private Color textColor;

	/**
	 * The constructor.
	 *
	 * @param parent
	 *            The parent composite
	 * @param tab
	 *            The tab
	 * @param index
	 *            The index of the tab
	 * @param tabbedPropertyList
	 *            The tabbed property list
	 */
	public EEFListElement(Composite parent, IEEFTabItem tab, int index, EEFTabbedPropertyList tabbedPropertyList) {
		super(parent, SWT.NO_FOCUS);
		this.tab = tab;
		this.index = index;
		this.tabbedPropertyList = tabbedPropertyList;
		this.textColor = this.tabbedPropertyList.getColorHolder().getWidgetForeground();

		this.addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent event) {
				EEFListElement.this.paint(event);
			}
		});

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent event) {
				EEFListElement.this.mouseUp(event);
			}
		});

		this.addMouseMoveListener(new MouseMoveListener() {
			@Override
			public void mouseMove(MouseEvent event) {
				if (!EEFListElement.this.hover) {
					EEFListElement.this.hover = true;
					EEFListElement.this.redraw();
				}
			}
		});

		this.addMouseTrackListener(new MouseTrackAdapter() {
			@Override
			public void mouseExit(MouseEvent event) {
				EEFListElement.this.hover = false;
				EEFListElement.this.redraw();
			}
		});
	}

	/**
	 * The constructor.
	 *
	 * @param parent
	 *            The parent composite
	 * @param tab
	 *            The tab
	 * @param dynamicImageCount
	 *            The number of dynamic images
	 * @param index
	 *            The index of the tab
	 * @param tabbedPropertyList
	 *            The tabbed property list
	 */
	public EEFListElement(Composite parent, IEEFTabItem tab, int dynamicImageCount, int index, EEFTabbedPropertyList tabbedPropertyList) {
		this(parent, tab, index, tabbedPropertyList);

		this.dynamicImages = new Image[dynamicImageCount];
		for (int i = 0; i < dynamicImageCount; i++) {
			this.dynamicImages[i] = null;
		}
	}

	/**
	 * Handle the mouse up event.
	 *
	 * @param event
	 *            The mouse up event
	 */
	protected void mouseUp(MouseEvent event) {
		if (!selected) {
			this.tabbedPropertyList.select(this.index);
			/*
			 * We set focus to the tabbed property composite so that focus is moved to the appropriate widget in the
			 * section.
			 */
			Composite tabbedPropertyComposite = getParent();
			while (!(tabbedPropertyComposite instanceof EEFTabbedPropertyComposite)) {
				tabbedPropertyComposite = tabbedPropertyComposite.getParent();
			}
			tabbedPropertyComposite.setFocus();
		}
	}

	/**
	 * Set selected value for this element.
	 *
	 * @param selected
	 *            the selected value.
	 */
	public void setSelected(boolean selected) {
		this.selected = selected;
		redraw();
	}

	/**
	 * Show the dynamic image at specified index in dynamicImages array. The image width should not be more than 16
	 * pixels. The caller is responsible for loading the image appropriately and managing it's resources.
	 *
	 * @param i
	 *            The index of the image
	 * @param image
	 *            The image to show
	 */
	public void showDynamicImage(int i, Image image) {
		if (i >= 0 && i < dynamicImages.length) {
			if (dynamicImages[i] != image) {
				dynamicImages[i] = image;
				redraw();
			}
		}
	}

	/**
	 * Hide the dynamic image at specified index in dynamicImages array. The caller is responsible for managing image
	 * resources and disposing it appropriately.
	 *
	 * @param i
	 *            The index of the image to hide
	 */
	public void hideDynamicImage(int i) {
		if (i >= 0 && i < dynamicImages.length) {
			if (dynamicImages[i] != null) {
				dynamicImages[i] = null;
				redraw();
			}
		}
	}

	/**
	 * Sets color to be used for drawing tab label text. The caller is responsible for managing the color's resources
	 * and disposing it appropriately after setDefaultTextColor() is later invoked.
	 *
	 * @param textColor
	 *            The color of the text
	 */
	public void setTextColor(Color textColor) {
		if (textColor != null && !this.textColor.equals(textColor)) {
			this.textColor = textColor;
			redraw();
		}
	}

	/**
	 * Sets default color for tab label text.
	 */
	public void setDefaultTextColor() {
		Color widgetForeground = this.tabbedPropertyList.getColorHolder().getWidgetForeground();
		if (!this.textColor.equals(widgetForeground)) {
			this.textColor = widgetForeground;
			redraw();
		}
	}

	/**
	 * Paint the element.
	 *
	 * @param e
	 *            the paint event.
	 */
	@SuppressWarnings({ "checkstyle:magicnumber" })
	private void paint(PaintEvent e) {
		/*
		 * draw the top two lines of the tab, same for selected, hover and default
		 */
		Rectangle bounds = getBounds();
		e.gc.setForeground(this.tabbedPropertyList.getColorHolder().getWidgetNormalShadow());
		e.gc.drawLine(0, 0, bounds.width - 1, 0);
		e.gc.setForeground(this.tabbedPropertyList.getColorHolder().getListBackground());
		e.gc.drawLine(0, 1, bounds.width - 1, 1);

		/* draw the fill in the tab */
		if (selected) {
			e.gc.setBackground(this.tabbedPropertyList.getColorHolder().getListBackground());
			e.gc.fillRectangle(0, 2, bounds.width, bounds.height - 1);
		} else if (hover && tab.isIndented()) {
			e.gc.setBackground(this.tabbedPropertyList.getColorHolder().getIndentedHoverBackground());
			e.gc.fillRectangle(0, 2, bounds.width - 1, bounds.height - 1);
		} else if (hover) {
			e.gc.setForeground(this.tabbedPropertyList.getColorHolder().getHoverGradientStart());
			e.gc.setBackground(this.tabbedPropertyList.getColorHolder().getHoverGradientEnd());
			e.gc.fillGradientRectangle(0, 2, bounds.width - 1, bounds.height - 1, true);
		} else if (tab.isIndented()) {
			e.gc.setBackground(this.tabbedPropertyList.getColorHolder().getIndentedDefaultBackground());
			e.gc.fillRectangle(0, 2, bounds.width - 1, bounds.height - 1);
		} else {
			e.gc.setForeground(this.tabbedPropertyList.getColorHolder().getDefaultGradientStart());
			e.gc.setBackground(this.tabbedPropertyList.getColorHolder().getDefaultGradientEnd());
			e.gc.fillGradientRectangle(0, 2, bounds.width - 1, bounds.height - 1, true);
		}

		if (!selected) {
			e.gc.setForeground(this.tabbedPropertyList.getColorHolder().getWidgetNormalShadow());
			e.gc.drawLine(bounds.width - 1, 1, bounds.width - 1, bounds.height + 1);
		}

		/*
		 * Add INDENT pixels to the left as a margin.
		 */
		int textIndent = EEFTabbedPropertyList.INDENT;
		FontMetrics fm = e.gc.getFontMetrics();
		int height = fm.getHeight();
		int textMiddle = (bounds.height - height) / 2;

		if (selected && tab.getImage() != null && !tab.getImage().isDisposed()) {
			/* draw the icon for the selected tab */
			if (tab.isIndented()) {
				textIndent = textIndent + EEFTabbedPropertyList.INDENT;
			} else {
				textIndent = textIndent - 3;
			}
			e.gc.drawImage(tab.getImage(), textIndent, textMiddle - 1);
			textIndent = textIndent + 16 + 4;
		} else if (tab.isIndented()) {
			textIndent = textIndent + EEFTabbedPropertyList.INDENT;
		}

		/* draw the text */
		e.gc.setForeground(textColor);
		if (selected) {
			/* selected tab is bold font */
			e.gc.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
		}
		e.gc.drawText(tab.getText(), textIndent, textMiddle, true);
		if (((EEFTabbedPropertyList) getParent()).getFocus() && selected) {
			/* draw a line if the tab has focus */
			Point point = e.gc.textExtent(tab.getText());
			e.gc.drawLine(textIndent, bounds.height - 4, textIndent + point.x, bounds.height - 4);
		}

		/* Draw dynamic images, if any */
		boolean hasDynamicImage = false;
		for (int i = 0; i < dynamicImages.length; i++) {
			Image dynamicImage = dynamicImages[i];
			if (dynamicImage != null && !dynamicImage.isDisposed()) {
				hasDynamicImage = true;
				break;
			}
		}
		if (hasDynamicImage) {
			int drawPosition = textIndent + e.gc.textExtent(tab.getText()).x + 4;
			boolean addSpace = false;
			for (int i = 0; i < dynamicImages.length; i++) {
				Image dynamicImage = dynamicImages[i];
				if (dynamicImage != null && !dynamicImage.isDisposed()) {
					if (addSpace) {
						drawPosition = drawPosition + 3;
					}
					e.gc.drawImage(dynamicImage, drawPosition, textMiddle - 1);
					drawPosition = drawPosition + 16;
					addSpace = true;
				}
			}
		}

		/* draw the bottom line on the tab for selected and default */
		if (!hover) {
			e.gc.setForeground(this.tabbedPropertyList.getColorHolder().getListBackground());
			e.gc.drawLine(0, bounds.height - 1, bounds.width - 2, bounds.height - 1);
		}
	}

	/**
	 * Get the tab item.
	 *
	 * @return the tab item.
	 */
	public IEEFTabItem getTabItem() {
		return tab;
	}

	@Override
	public String toString() {
		return tab.getText();
	}

}
