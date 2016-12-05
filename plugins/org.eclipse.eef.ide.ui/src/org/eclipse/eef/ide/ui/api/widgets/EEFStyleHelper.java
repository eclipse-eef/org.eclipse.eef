/*******************************************************************************
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.api.widgets;

import java.util.Iterator;
import java.util.List;

import org.eclipse.eef.EEFConditionalStyle;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFColor;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFFont;
import org.eclipse.eef.util.EEFConditionalStyleToWidgetStyleSwitch;
import org.eclipse.eef.util.EEFDescriptionToConditionalStylesSwitch;
import org.eclipse.eef.util.EEFDescriptionToWidgetStyleSwitch;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;

/**
 * This utility class contains various helper method to manipulate styles.
 *
 * @author sbegaudeau
 */
public class EEFStyleHelper {
	/**
	 * The interpreter.
	 */
	private IInterpreter interpreter;

	/**
	 * The variable manager.
	 */
	private IVariableManager variableManager;

	/**
	 * The constructor.
	 *
	 * @param interpreter
	 *            The interpreter
	 * @param variableManager
	 *            The variable manager
	 */
	public EEFStyleHelper(IInterpreter interpreter, IVariableManager variableManager) {
		this.interpreter = interpreter;
		this.variableManager = variableManager;
	}

	/**
	 * Returns the widget style to use from the given widget description.
	 *
	 * @param widgetDescription
	 *            The widget description
	 * @return The widget style to use
	 */
	public EEFWidgetStyle getWidgetStyle(EEFWidgetDescription widgetDescription) {
		EEFWidgetStyle widgetStyle = null;
		List<EEFConditionalStyle> conditionalStyles = this.getDescriptionToConditionalStylesSwitch().doSwitch(widgetDescription);
		Iterator<EEFConditionalStyle> iterator = conditionalStyles.iterator();
		while (widgetStyle == null && iterator.hasNext()) {
			EEFConditionalStyle conditionalStyle = iterator.next();
			String preconditionExpression = conditionalStyle.getPreconditionExpression();
			Boolean preconditionValid = EvalFactory.of(interpreter, variableManager).logIfInvalidType(Boolean.class).evaluate(preconditionExpression);
			if (preconditionValid != null && preconditionValid.booleanValue()) {
				widgetStyle = this.getConditionalStyleToWidgetStyleSwitch().doSwitch(conditionalStyle);
			}
		}

		if (widgetStyle == null) {
			widgetStyle = this.getDescriptionToWidgetStyleSwitch().doSwitch(widgetDescription);
		}

		return widgetStyle;
	}

	/**
	 * Returns the switch to use to find the conditional styles of a widget description. The switch returned should be
	 * able to handle the default use case, as a result it is highly recommended to return a composed switch with the
	 * default one and new switches. Example:<br>
	 * <code>
	 * return new ComposedSwitch<>(Arrays.asList(new EEFDescriptionToConditionalStylesSwitch(), new
	 * CustomDescriptionToConditionalStylesSwitch()));
	 * </code>
	 *
	 * @return The switch to use to find the conditional styles of a widget description
	 */
	protected Switch<List<EEFConditionalStyle>> getDescriptionToConditionalStylesSwitch() {
		return new EEFDescriptionToConditionalStylesSwitch();
	}

	/**
	 * Returns the switch to use to find the style of a conditional style. The switch returned should be able to handle
	 * the default use case, as a result it is highly recommended to return a composed switch with the default one and
	 * new switches. Example:<br>
	 * <code>
	 * return new ComposedSwitch<>(Arrays.asList(new EEFConditionalStyleToWidgetStyleSwitch(), new
	 * CustomConditionalStyleToWidgetStyleSwitch()));
	 * </code>
	 *
	 * @return The switch to use to find the style of a conditional style
	 */
	protected Switch<EEFWidgetStyle> getConditionalStyleToWidgetStyleSwitch() {
		return new EEFConditionalStyleToWidgetStyleSwitch();
	}

	/**
	 * Returns the switch to use to find the style of a description. The switch returned should be able to handle the
	 * default use case, as a result it is highly recommended to return a composed switch with the default one and new
	 * switches. Example:<br>
	 * <code>
	 * return new ComposedSwitch<>(Arrays.asList(new EEFDescriptionToWidgetStyleSwitch(), new
	 * EEFDescriptionToWidgetStyleSwitch()));
	 * </code>
	 *
	 * @return The switch to use to find the style of a description.
	 */
	protected Switch<EEFWidgetStyle> getDescriptionToWidgetStyleSwitch() {
		return new EEFDescriptionToWidgetStyleSwitch();
	}

	/**
	 * Uses the given expressions to update the style using the given callback.
	 *
	 * @param fontNameExpression
	 *            The expression used to compute the name of the font
	 * @param fontSizeExpression
	 *            The expression used to compute the size of the font
	 * @param fontStyleExpression
	 *            The expression used to compute the style of the font
	 * @param defaultFont
	 *            The default font
	 * @param backgroundColorExpression
	 *            The expression used to compute the background color of the font
	 * @param foregroundColorExpression
	 *            The expression used to compute the foreground color of the font
	 * @param callback
	 *            The callback which will be called when a property of the style has been computed
	 */
	public void applyTextStyle(String fontNameExpression, String fontSizeExpression, String fontStyleExpression, Font defaultFont,
			String backgroundColorExpression, String foregroundColorExpression, IEEFTextStyleCallback callback) {
		if (!Util.isBlank(foregroundColorExpression)) {
			this.applyForegroundColor(foregroundColorExpression, callback);
		} else {
			callback.applyForegroundColor(new EEFColor((Color) null));
		}
		if (!Util.isBlank(backgroundColorExpression)) {
			this.applyBackgroundColor(backgroundColorExpression, callback);
		} else {
			callback.applyBackgroundColor(new EEFColor((Color) null));
		}

		String fontStyleValue = EvalFactory.of(interpreter, variableManager).logIfInvalidType(String.class).evaluate(fontStyleExpression);
		this.applyFont(fontNameExpression, fontSizeExpression, defaultFont, callback, fontStyleValue);
		this.applyFontStyle(callback, fontStyleValue);
	}

	/**
	 * Applies the foreground color computed using the given foreground color expression.
	 *
	 * @param foregroundColorExpression
	 *            The expression
	 * @param callback
	 *            The callback
	 */
	private void applyForegroundColor(String foregroundColorExpression, IEEFTextStyleCallback callback) {
		String foregroundColorCode = EvalFactory.of(interpreter, variableManager).logIfInvalidType(String.class).evaluate(foregroundColorExpression);
		if (!Util.isBlank(foregroundColorCode)) {
			callback.applyForegroundColor(new EEFColor(foregroundColorCode));
		}
	}

	/**
	 * Applies the background color computed using the given background color expression.
	 *
	 * @param backgroundColorExpression
	 *            The expression
	 * @param callback
	 *            The callback
	 */
	private void applyBackgroundColor(String backgroundColorExpression, IEEFTextStyleCallback callback) {
		String backgroundColorCode = EvalFactory.of(interpreter, variableManager).logIfInvalidType(String.class).evaluate(backgroundColorExpression);
		if (!Util.isBlank(backgroundColorCode)) {
			callback.applyBackgroundColor(new EEFColor(backgroundColorCode));
		}
	}

	/**
	 * Applies the font computed using the given expressions.
	 *
	 * @param fontNameExpression
	 *            The expression used to compute the name of the font
	 * @param fontSizeExpression
	 *            The expression used to compute the size of the font
	 * @param defaultFont
	 *            The default font
	 * @param callback
	 *            The callback
	 * @param fontStyleValue
	 *            The value of the font style (strikeout and/or underline)
	 */
	private void applyFont(String fontNameExpression, String fontSizeExpression, Font defaultFont, IEEFTextStyleCallback callback,
			String fontStyleValue) {
		FontData defaultFontData = defaultFont.getFontData()[0];
		String fontName = EvalFactory.of(interpreter, variableManager).logIfInvalidType(String.class).defaultValue(defaultFontData.getName())
				.evaluate(fontNameExpression);
		int fontSize = EvalFactory.of(interpreter, variableManager).logIfInvalidType(Integer.class)
				.defaultValue(Integer.valueOf(defaultFontData.getHeight())).evaluate(fontSizeExpression).intValue();

		int fontStyle = defaultFontData.getStyle();
		if (fontStyleValue == null) {
			fontStyle = 0;
		} else if (fontStyleValue.contains("bold")) { //$NON-NLS-1$
			fontStyle = fontStyle | SWT.BOLD;
		} else if (fontStyleValue.contains("italic")) { //$NON-NLS-1$
			fontStyle = fontStyle | SWT.ITALIC;
		}
		EEFFont font = new EEFFont(fontName, fontSize, fontStyle);
		callback.applyFont(font);
	}

	/**
	 * Applies the font style (underline and/or strikeout).
	 *
	 * @param callback
	 *            The callback
	 * @param fontStyleValue
	 *            The font style value
	 */
	private void applyFontStyle(IEEFTextStyleCallback callback, String fontStyleValue) {
		boolean strikeout = false;
		boolean underline = false;
		if (fontStyleValue != null && fontStyleValue.contains("underline")) { //$NON-NLS-1$
			underline = true;
		}
		if (fontStyleValue != null && fontStyleValue.contains("strike_through")) { //$NON-NLS-1$
			strikeout = true;
		}
		callback.applyFontStyle(strikeout, underline);
	}

	/**
	 * This class will be called to update the style of the text.
	 *
	 * @author sbegaudeau
	 */
	public interface IEEFTextStyleCallback {
		/**
		 * Applies the given font to the widget.
		 *
		 * @param font
		 *            The font
		 */
		void applyFont(EEFFont font);

		/**
		 * Applies the strikeout and/or underline styles.
		 *
		 * @param strikeout
		 *            <code>true</code> if the widget should be striked out, <code>false</code> otherwise
		 * @param underline
		 *            <code>true</code> if the widget should be underlined, <code>false</code> otherwise
		 */
		void applyFontStyle(boolean strikeout, boolean underline);

		/**
		 * Applies the given foreground color to the widget.
		 *
		 * @param color
		 *            The foreground color
		 */
		void applyForegroundColor(EEFColor color);

		/**
		 * Applies the given background color to the widget.
		 *
		 * @param color
		 *            The background color
		 */
		void applyBackgroundColor(EEFColor color);
	}
}
