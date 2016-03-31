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

import com.google.common.base.Objects;

import org.eclipse.eef.EEFTextStyle;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Icons;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFColor;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFFont;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * Parent of all the lifecycle managers.
 *
 * @author sbegaudeau
 */
public abstract class AbstractEEFWidgetLifecycleManager extends AbstractEEFLifecycleManager {

	/**
	 * Horizontal space to leave between related widgets. Each section should use these values for spacing its widgets.
	 * For example, you can use +/- HSPACE as the offset of a left or right FlatFormAttachment.
	 *
	 * The tabbed property composite also inserts VSPACE pixels between section composites if more than one section is
	 * displayed.
	 */
	public static final int HSPACE = 5;

	/**
	 * The label width that will be used for section names.
	 **/
	public static final int LABEL_WIDTH = 232;

	/**
	 * The gap between the label and the widget with the help icon.
	 */
	public static final int GAP_WITH_HELP = 25;

	/**
	 * The gap between the label and the widget without the help icon.
	 */
	public static final int GAP_WITHOUT_HELP = 20;

	/**
	 * The variable manager.
	 */
	protected IVariableManager variableManager;

	/**
	 * The interpreter.
	 */
	protected IInterpreter interpreter;

	/**
	 * The editing domain.
	 */
	protected TransactionalEditingDomain editingDomain;

	/**
	 * The label.
	 */
	protected StyledText label;

	/**
	 * The help label.
	 */
	protected CLabel help;

	/**
	 * The constructor.
	 *
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingDomain
	 *            The editing domain
	 */
	public AbstractEEFWidgetLifecycleManager(IVariableManager variableManager, IInterpreter interpreter, TransactionalEditingDomain editingDomain) {
		this.variableManager = variableManager;
		this.interpreter = interpreter;
		this.editingDomain = editingDomain;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#createControl(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.eef.common.ui.api.IEEFFormContainer)
	 */
	@Override
	public void createControl(Composite parent, IEEFFormContainer formContainer) {
		super.createControl(parent, formContainer);

		EEFWidgetFactory widgetFactory = formContainer.getWidgetFactory();

		Composite composite = widgetFactory.createFlatFormComposite(parent);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		composite.setLayoutData(gridData);

		this.createMainControl(composite, formContainer);

		Control control = this.getValidationControl();

		boolean hasHelp = !Util.isBlank(this.getWidgetDescription().getHelpExpression());

		int gap = GAP_WITHOUT_HELP;
		if (hasHelp) {
			gap = GAP_WITH_HELP;
		}

		this.label = new StyledText(composite, SWT.NONE);
		FormData labelFormData = new FormData();
		labelFormData.left = new FormAttachment(0, 0);
		labelFormData.right = new FormAttachment(control, -HSPACE - gap);
		labelFormData.top = new FormAttachment(control, 0, SWT.TOP);
		this.label.setLayoutData(labelFormData);

		if (hasHelp) {
			this.help = widgetFactory.createCLabel(composite, ""); //$NON-NLS-1$
			FormData helpFormData = new FormData();
			helpFormData.top = new FormAttachment(control, 0, SWT.TOP);
			helpFormData.left = new FormAttachment(this.label);
			this.help.setLayoutData(helpFormData);
			this.help.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.HELP));
			this.help.setToolTipText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#getController()
	 */
	@Override
	protected abstract IEEFWidgetController getController();

	/**
	 * Returns the description of the widget.
	 *
	 * @return The description of the widget
	 */
	protected abstract EEFWidgetDescription getWidgetDescription();

	/**
	 * Create the main control.
	 *
	 * @param parent
	 *            The composite parent
	 * @param formContainer
	 *            The form container
	 */
	protected abstract void createMainControl(Composite parent, IEEFFormContainer formContainer);

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.getController().onNewLabel(new IConsumer<String>() {
			@Override
			public void apply(String value) {
				if (!label.isDisposed() && !(label.getText() != null && label.getText().equals(value))) {
					label.setText(Objects.firstNonNull(value, "")); //$NON-NLS-1$
					// Set style
					setTextStyle(getWidgetDescription().getLabelStyle(), label);
				}
			}
		});

		this.getController().onNewHelp(new IConsumer<String>() {
			@Override
			public void apply(String value) {
				if (help != null && !help.isDisposed() && !(help.getText() != null && help.getText().equals(value))) {
					help.setToolTipText(Objects.firstNonNull(value, "")); //$NON-NLS-1$
				}
			}
		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();

		this.getController().removeNewLabelConsumer();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.ILifecycleManager#dispose()
	 */
	@Override
	public void dispose() {
		EEFIdeUiPlugin.getPlugin().debug("AbstractEEFWidgetLifeCycleManager#dispose()"); //$NON-NLS-1$
	}

	/**
	 * Set the text style.
	 *
	 * @param style
	 *            Style
	 * @param text
	 *            The text
	 */
	protected void setTextStyle(EEFTextStyle style, StyledText text) {
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
