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

import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.FormColors;

/**
 * Utility class used to initialize and hold colors.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 */
public class EEFTabbedPropertyListColorHolder {

	/**
	 * The widget factory.
	 */
	private EEFWidgetFactory widgetFactory;

	/**
	 * The list background color.
	 */
	private Color listBackground;

	/**
	 * The widget background color.
	 */
	private Color widgetBackground;

	/**
	 * The widget dark shadow color.
	 */
	private Color widgetDarkShadow;

	/**
	 * The widget foreground color.
	 */
	private Color widgetForeground;

	/**
	 * The widget normal shadow color.
	 */
	private Color widgetNormalShadow;

	/**
	 * The default gradient start color.
	 */
	private Color defaultGradientStart;

	/**
	 * The default gradient end color.
	 */
	private Color defaultGradientEnd;

	/**
	 * The navigation element shadow stroke color.
	 */
	private Color navigationElementShadowStroke;

	/**
	 * The first bottom navigation element shadow stroke color.
	 */
	private Color bottomNavigationElementShadowStroke1;

	/**
	 * The second bottom navigation element shadow stroke color.
	 */
	private Color bottomNavigationElementShadowStroke2;

	/**
	 * The hover gradient start color.
	 */
	private Color hoverGradientStart;

	/**
	 * The hover gradient end color.
	 */
	private Color hoverGradientEnd;

	/**
	 * The indented default background color.
	 */
	private Color indentedDefaultBackground;

	/**
	 * The indented hover background color.
	 */
	private Color indentedHoverBackground;

	/**
	 * The constructor.
	 *
	 * @param widgetFactory
	 *            The widget factory
	 */
	public EEFTabbedPropertyListColorHolder(EEFWidgetFactory widgetFactory) {
		this.widgetFactory = widgetFactory;
		this.initializeColors();
	}

	/**
	 * Initializes the colors.
	 */
	@SuppressWarnings({ "checkstyle:magicnumber" })
	private void initializeColors() {
		// Color 3 COLOR_LIST_BACKGROUND
		this.listBackground = Display.getCurrent().getSystemColor(SWT.COLOR_LIST_BACKGROUND);

		// Color 13 COLOR_WIDGET_BACKGROUND
		this.widgetBackground = Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND);

		// Color 15 COLOR_WIDGET_DARK_SHADOW
		this.widgetDarkShadow = Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_DARK_SHADOW);

		// Color 16 COLOR_WIDGET_FOREGROUND
		this.widgetForeground = Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_FOREGROUND);

		// Color 19 COLOR_WIDGET_NORMAL_SHADOW
		this.widgetNormalShadow = Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_NORMAL_SHADOW);

		RGB infoBackground = Display.getCurrent().getSystemColor(SWT.COLOR_INFO_BACKGROUND).getRGB();
		RGB white = Display.getCurrent().getSystemColor(SWT.COLOR_WHITE).getRGB();
		RGB black = Display.getCurrent().getSystemColor(SWT.COLOR_BLACK).getRGB();

		/*
		 * gradient in the default tab: start colour WIDGET_NORMAL_SHADOW 100% + white 20% + INFO_BACKGROUND 60% end
		 * colour WIDGET_NORMAL_SHADOW 100% + INFO_BACKGROUND 40%
		 */
		this.defaultGradientStart = this.widgetFactory.getColors().createColor("TabbedPropertyList.defaultTabGradientStart", //$NON-NLS-1$
				FormColors.blend(infoBackground, FormColors.blend(white, widgetNormalShadow.getRGB(), 20), 60));
		this.defaultGradientEnd = this.widgetFactory.getColors().createColor("TabbedPropertyList.defaultTabGradientEnd", //$NON-NLS-1$
				FormColors.blend(infoBackground, widgetNormalShadow.getRGB(), 40));

		this.navigationElementShadowStroke = this.widgetFactory.getColors().createColor("TabbedPropertyList.shadowStroke", //$NON-NLS-1$
				FormColors.blend(white, widgetNormalShadow.getRGB(), 55));
		this.bottomNavigationElementShadowStroke1 = this.widgetFactory.getColors().createColor("TabbedPropertyList.tabShadowStroke1", //$NON-NLS-1$
				FormColors.blend(black, widgetBackground.getRGB(), 10));
		this.bottomNavigationElementShadowStroke2 = this.widgetFactory.getColors().createColor("TabbedPropertyList.tabShadowStroke2", //$NON-NLS-1$
				FormColors.blend(black, widgetBackground.getRGB(), 5));

		/*
		 * gradient in the hover tab: start colour WIDGET_BACKGROUND 100% + white 20% end colour WIDGET_BACKGROUND 100%
		 * + WIDGET_NORMAL_SHADOW 10%
		 */
		this.hoverGradientStart = this.widgetFactory.getColors().createColor("TabbedPropertyList.hoverBackgroundGradientStart", //$NON-NLS-1$
				FormColors.blend(white, widgetBackground.getRGB(), 20));
		this.hoverGradientEnd = this.widgetFactory.getColors().createColor("TabbedPropertyList.hoverBackgroundGradientEnd", //$NON-NLS-1$
				FormColors.blend(widgetNormalShadow.getRGB(), widgetBackground.getRGB(), 10));

		this.indentedDefaultBackground = this.widgetFactory.getColors().createColor("TabbedPropertyList.indentedDefaultBackground", //$NON-NLS-1$
				FormColors.blend(white, widgetBackground.getRGB(), 10));
		this.indentedHoverBackground = this.widgetFactory.getColors().createColor("TabbedPropertyList.indentedHoverBackground", //$NON-NLS-1$
				FormColors.blend(white, widgetBackground.getRGB(), 75));
	}

	/**
	 * Returns the widget foreground color.
	 *
	 * @return The widget foreground color
	 */
	public Color getWidgetForeground() {
		return this.widgetForeground;
	}

	/**
	 * Returns the widget normal shadow color.
	 *
	 * @return The widget normal shadow color
	 */
	public Color getWidgetNormalShadow() {
		return this.widgetNormalShadow;
	}

	/**
	 * Returns the list background color.
	 *
	 * @return The list background color
	 */
	public Color getListBackground() {
		return this.listBackground;
	}

	/**
	 * Returns the indented hover background color.
	 *
	 * @return The indented hover background color
	 */
	public Color getIndentedHoverBackground() {
		return this.indentedHoverBackground;
	}

	/**
	 * Returns the hover gradient start color.
	 *
	 * @return The hover gradient start color
	 */
	public Color getHoverGradientStart() {
		return this.hoverGradientStart;
	}

	/**
	 * Returns the hover gradient end color.
	 *
	 * @return The hover gradient end color
	 */
	public Color getHoverGradientEnd() {
		return this.hoverGradientEnd;
	}

	/**
	 * Returns the indented default background color.
	 *
	 * @return The indented default background color
	 */
	public Color getIndentedDefaultBackground() {
		return this.indentedDefaultBackground;
	}

	/**
	 * Returns the default gradient start color.
	 *
	 * @return The default gradient start color
	 */
	public Color getDefaultGradientStart() {
		return this.defaultGradientStart;
	}

	/**
	 * Returns the default gradient end color.
	 *
	 * @return The default gradient end color
	 */
	public Color getDefaultGradientEnd() {
		return this.defaultGradientEnd;
	}

	/**
	 * Returns the widget background color.
	 *
	 * @return The widget background color
	 */
	public Color getWidgetBackground() {
		return this.widgetBackground;
	}

	/**
	 * Returns the widget dark shadow color.
	 *
	 * @return The widget dark shadow color
	 */
	public Color getWidgetDarkShadow() {
		return this.widgetDarkShadow;
	}

	/**
	 * Returns the navigation element shadow stroke color.
	 *
	 * @return The navigation element shadow stroke color
	 */
	public Color getNavigationElementShadowStroke() {
		return this.navigationElementShadowStroke;
	}

	/**
	 * Returns the first bottom navigation element shadow stroke color.
	 *
	 * @return The first bottom navigation element shadow stroke color
	 */
	public Color getBottomNavigationElementShadowStroke1() {
		return this.bottomNavigationElementShadowStroke1;
	}

	/**
	 * Returns the second bottom navigation element shadow stroke color.
	 *
	 * @return The second bottom navigation element shadow stroke color
	 */
	public Color getBottomNavigationElementShadowStroke2() {
		return this.bottomNavigationElementShadowStroke2;
	}
}
