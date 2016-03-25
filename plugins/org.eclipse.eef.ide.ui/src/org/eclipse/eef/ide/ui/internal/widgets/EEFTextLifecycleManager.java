/*******************************************************************************
 * Copyright (c) 2015, 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.internal.widgets;

import com.google.common.base.Objects;

import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFTextStyle;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFTextController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetWidgetFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * This class will be used in order to manager the lifecycle of a text.
 *
 * @author sbegaudeau
 */
public class EEFTextLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * The description.
	 */
	private EEFTextDescription description;

	/**
	 * The text.
	 */
	private StyledText text;

	/**
	 * The controller.
	 */
	private IEEFTextController controller;

	/**
	 * The listener on the text.
	 */
	private ModifyListener modifyListener;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingDomain
	 *            The editing domain
	 */
	public EEFTextLifecycleManager(EEFTextDescription description, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain) {
		super(variableManager, interpreter, editingDomain);
		this.description = description;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#createMainControl(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage)
	 */
	@Override
	protected void createMainControl(Composite parent, EEFTabbedPropertySheetPage tabbedPropertySheetPage) {
		EEFTabbedPropertySheetWidgetFactory widgetFactory = tabbedPropertySheetPage.getWidgetFactory();

		FormData formData = new FormData();
		formData.left = new FormAttachment(0, LABEL_WIDTH);
		formData.right = new FormAttachment(100, 0);

		// Get text area line count
		int lineCount = description.getLineCount();

		// Create text or text area according to the defined line count
		if (lineCount > 1) {
			this.text = new StyledText(parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.WRAP);
			formData.height = lineCount * text.getLineHeight();
		} else {
			this.text = new StyledText(parent, SWT.NONE);
		}

		this.text.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);

		this.text.setLayoutData(formData);

		this.controller = new EEFControllersFactory().createTextController(this.description, this.variableManager, this.interpreter,
				this.editingDomain);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getController()
	 */
	@Override
	protected IEEFWidgetController getController() {
		return this.controller;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.AbstractEEFWidgetLifecycleManager#getWidgetDescription()
	 */
	@Override
	protected EEFWidgetDescription getWidgetDescription() {
		return this.description;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.modifyListener = new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent event) {
				if (!EEFTextLifecycleManager.this.page.isRenderingInProgress()) {
					controller.updateValue(text.getText());
				}
			}
		};
		this.text.addModifyListener(this.modifyListener);

		this.controller.onNewValue(new IConsumer<String>() {
			@Override
			public void apply(String value) {
				if (!text.isDisposed() && !(text.getText() != null && text.getText().equals(value))) {
					String input = Objects.firstNonNull(value, ""); //$NON-NLS-1$
					text.setText(input);
					setTextStyle(input);
					if (!text.isEnabled()) {
						text.setEnabled(true);
					}
				}
			}
		});
	}

	/**
	 * Set the text style.
	 *
	 * @param input
	 *            The text
	 */
	private void setTextStyle(String input) {
		EEFTextStyle style = description.getStyle();
		if (style != null) {
			// Set font
			setFont(input, style);

			// Set background color
			setBackgroundColor(style);

			// Set foreground color
			setForegroundColor(style);
		}
	}

	/**
	 * Set the foreground color.
	 *
	 * @param style
	 *            Style
	 */
	private void setForegroundColor(EEFTextStyle style) {
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
	 */
	private void setBackgroundColor(EEFTextStyle style) {
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
	 * @param input
	 *            Text
	 * @param style
	 *            Style
	 */
	private void setFont(String input, EEFTextStyle style) {
		// Get default font
		Font defaultFont = text.getFont();
		FontData defaultFontData = defaultFont.getFontData()[0];
		String fontName = getFontName(style, defaultFontData);
		int fontSize = getFontSize(style, defaultFontData);
		int fontStyle = getFontStyle(style, defaultFontData, input);
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
	 * @param input
	 *            The input
	 * @return Font style
	 */
	private int getFontStyle(EEFTextStyle style, FontData defaultFontData, String input) {
		int fontStyle = defaultFontData.getStyle();
		String fontStyleExpression = style.getFontStyleExpression();
		if (fontStyleExpression != null && !fontStyleExpression.isEmpty()) {
			EAttribute eAttribute = EefPackage.Literals.EEF_TEXT_STYLE__FONT_STYLE_EXPRESSION;
			Eval eval = new Eval(interpreter, variableManager);
			String fontStyleValue = eval.get(eAttribute, fontStyleExpression, String.class);
			fontStyle = getFontStyle(input, fontStyleValue, fontStyle);
		}
		return fontStyle;
	}

	/**
	 * Get the font style.
	 *
	 * @param input
	 *            The input
	 * @param fontStyleValue
	 *            The font style value
	 * @param defaultFontStyle
	 *            The default font style
	 * @return Font style
	 */
	private int getFontStyle(String input, String fontStyleValue, int defaultFontStyle) {
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
		styleRange.length = input.length();
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

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return this.text;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.ILifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();

		if (!text.isDisposed()) {
			this.text.removeModifyListener(this.modifyListener);
		}
		this.controller.removeNewValueConsumer();
	}
}
