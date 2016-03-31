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
package org.eclipse.eef.ide.ui.internal.widgets.styles;

import org.eclipse.eef.EEFTextStyle;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;

/**
 * An helper class to manage style on styled text widget.
 *
 * @author mbats
 */
public class EEFWidgetStyleHelper {
	/**
	 * The variable manager.
	 */
	protected IVariableManager variableManager;

	/**
	 * The interpreter.
	 *
	 */
	protected IInterpreter interpreter;

	/**
	 * The constructor.
	 *
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 */
	public EEFWidgetStyleHelper(IVariableManager variableManager, IInterpreter interpreter) {
		this.variableManager = variableManager;
		this.interpreter = interpreter;
	}

	/**
	 * Set the text style.
	 *
	 * @param style
	 *            Style
	 * @param text
	 *            The text
	 */
	public void setTextStyle(EEFTextStyle style, StyledText text) {
		if (style != null) {
			// Set font
			setFont(style, text);

			// Set background color
			setBackgroundColor(style, text);

			// Set foreground color
			setForegroundColor(style, text);
		}
	}

	/**
	 * Set the foreground color.
	 *
	 * @param style
	 *            Style
	 * @param text
	 *            The text
	 */
	private void setForegroundColor(EEFTextStyle style, StyledText text) {
		EAttribute eAttribute;
		String foregroundColorExpression = style.getForegroundColorExpression();
		eAttribute = EefPackage.Literals.EEF_TEXT_STYLE__FOREGROUND_COLOR_EXPRESSION;
		Eval eval = new Eval(interpreter, variableManager);
		String foregroundColorCode = eval.get(eAttribute, foregroundColorExpression, String.class);
		if (foregroundColorCode != null && !foregroundColorCode.isEmpty()) {
			EEFColor foregroundColor = new EEFColor(foregroundColorCode);
			text.setForeground(foregroundColor.getColor());
		}
	}

	/**
	 * Set the background color.
	 *
	 * @param style
	 *            Style
	 * @param text
	 *            Text
	 */
	private void setBackgroundColor(EEFTextStyle style, StyledText text) {
		String backgroundColorExpression = style.getBackgroundColorExpression();
		EAttribute eAttribute = EefPackage.Literals.EEF_TEXT_STYLE__BACKGROUND_COLOR_EXPRESSION;
		Eval eval = new Eval(interpreter, variableManager);
		String backgroundColorCode = eval.get(eAttribute, backgroundColorExpression, String.class);
		if (backgroundColorCode != null && !backgroundColorCode.isEmpty()) {
			EEFColor backgroundColor = new EEFColor(backgroundColorCode);
			text.setBackground(backgroundColor.getColor());
		}
	}

	/**
	 * Set the font.
	 *
	 * @param text
	 *            Text
	 * @param style
	 *            Style
	 * @param text
	 */
	private void setFont(EEFTextStyle style, StyledText text) {
		// Get default font
		Font defaultFont = text.getFont();
		FontData defaultFontData = defaultFont.getFontData()[0];
		String fontName = getFontName(style, defaultFontData);
		int fontSize = getFontSize(style, defaultFontData);
		int fontStyle = getFontStyle(style, defaultFontData, text);
		EEFFont font = new EEFFont(fontName, fontSize, fontStyle);
		text.setFont(font.getFont());
	}

	/**
	 * Get the font name.
	 *
	 * @param style
	 *            Style
	 * @param defaultFontData
	 *            Default font data
	 * @return Font name
	 */
	private String getFontName(EEFTextStyle style, FontData defaultFontData) {
		String fontNameExpression = style.getFontNameExpression();
		String fontName = defaultFontData.getName();
		Eval eval = new Eval(interpreter, variableManager);
		if (fontNameExpression != null && !fontNameExpression.isEmpty()) {
			EAttribute eAttribute = EefPackage.Literals.EEF_TEXT_STYLE__FONT_NAME_EXPRESSION;
			String fontNameValue = eval.get(eAttribute, fontNameExpression, String.class);
			if (fontNameValue != null) {
				// Get font name
				fontName = fontNameValue;
			}
		}
		return fontName;
	}

	/**
	 * Get the font size.
	 *
	 * @param style
	 *            Style
	 * @param defaultFontData
	 *            Default font data
	 * @return Font size
	 */
	private int getFontSize(EEFTextStyle style, FontData defaultFontData) {
		String fontSizeExpression = style.getFontSizeExpression();
		int fontSize = defaultFontData.getHeight();
		if (fontSizeExpression != null && !fontSizeExpression.isEmpty()) {
			EAttribute eAttribute = EefPackage.Literals.EEF_TEXT_STYLE__FONT_SIZE_EXPRESSION;
			Eval eval = new Eval(interpreter, variableManager);
			Integer fontSizeValue = eval.get(eAttribute, fontSizeExpression, Integer.class);
			if (fontSizeValue != null && fontSizeValue.intValue() != fontSize) {
				fontSize = fontSizeValue;
			}
		}
		return fontSize;
	}

	/**
	 * Get the font style.
	 *
	 * @param style
	 *            Style
	 * @param defaultFontData
	 *            Default font data
	 * @param text
	 *            The text
	 * @return Font style
	 */
	private int getFontStyle(EEFTextStyle style, FontData defaultFontData, StyledText text) {
		int fontStyle = defaultFontData.getStyle();
		String fontStyleExpression = style.getFontStyleExpression();
		if (fontStyleExpression != null && !fontStyleExpression.isEmpty()) {
			EAttribute eAttribute = EefPackage.Literals.EEF_TEXT_STYLE__FONT_STYLE_EXPRESSION;
			Eval eval = new Eval(interpreter, variableManager);
			String fontStyleValue = eval.get(eAttribute, fontStyleExpression, String.class);
			fontStyle = getFontStyle(fontStyleValue, fontStyle, text);
		}
		return fontStyle;
	}

	/**
	 * Get the font style.
	 *
	 * @param fontStyleValue
	 *            The font style value
	 * @param defaultFontStyle
	 *            The default font style
	 * @param text
	 *            The text
	 * @return Font style
	 */
	private int getFontStyle(String fontStyleValue, int defaultFontStyle, StyledText text) {
		int fontStyle = defaultFontStyle;
		// Get font style
		if (fontStyleValue != null && fontStyleValue.contains("bold")) { //$NON-NLS-1$
			// Bold font
			fontStyle = fontStyle | SWT.BOLD;
		}
		if (fontStyleValue != null && fontStyleValue.contains("italic")) { //$NON-NLS-1$
			// Italic font
			fontStyle = fontStyle | SWT.ITALIC;
		}
		StyleRange styleRange = new StyleRange();
		styleRange.start = 0;
		styleRange.length = text.getCharCount();
		if (fontStyleValue != null && fontStyleValue.contains("underline")) { //$NON-NLS-1$
			// Underline is set thanks to style range and not directly thanks to the font
			styleRange.underline = true;
		}
		if (fontStyleValue != null && fontStyleValue.contains("strike_through")) { //$NON-NLS-1$
			// Strike out is set thanks to style range and not directly thanks to the font
			styleRange.strikeout = true;
		}

		text.setStyleRange(styleRange);
		return fontStyle;
	}

}
