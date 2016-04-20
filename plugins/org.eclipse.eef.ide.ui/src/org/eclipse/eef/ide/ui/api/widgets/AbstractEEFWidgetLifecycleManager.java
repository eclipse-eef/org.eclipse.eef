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

import java.util.List;

import org.eclipse.eef.EEFConditionalStyle;
import org.eclipse.eef.EEFDynamicMappingFor;
import org.eclipse.eef.EEFDynamicMappingIf;
import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFTextStyle;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Icons;
import org.eclipse.eef.ide.ui.internal.Messages;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFColor;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFFont;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

/**
 * Parent of all the lifecycle managers.
 *
 * @author sbegaudeau
 */
public abstract class AbstractEEFWidgetLifecycleManager extends AbstractEEFLifecycleManager {

	/**
	 * The variable manager.
	 */
	protected IVariableManager variableManager;

	/**
	 * The interpreter.
	 */
	protected IInterpreter interpreter;

	/**
	 * The editing context adapter.
	 */
	protected EditingContextAdapter contextAdapter;

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
	 * @param contextAdapter
	 *            The editing context adapter
	 */
	public AbstractEEFWidgetLifecycleManager(IVariableManager variableManager, IInterpreter interpreter, EditingContextAdapter contextAdapter) {
		this.variableManager = variableManager;
		this.interpreter = interpreter;
		this.contextAdapter = contextAdapter;
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

		Composite composite = parent;

		// If we are in a group, we will always create a label (empty or not) for the 3 columns layout of the group.
		boolean isInGroup = this.isInGroup();

		// Some widgets (like a checkbox) will not have a separated "label" widget for their label. Those widgets will
		// thus never create another widget expect in the group (for the layout).
		boolean needsSeparatedLabel = this.needSeparatedLabel();

		// Finally if the label expression is blank, we will not create a label inside of a group (for the layout).
		boolean isBlankLabel = Util.isBlank(this.getWidgetDescription().getLabelExpression());

		boolean needsLabel = isInGroup || (!isBlankLabel && needsSeparatedLabel);
		boolean needsHelp = isInGroup || !Util.isBlank(this.getWidgetDescription().getHelpExpression());

		// If we are not in a group, we will create a composite to hold all the label and help of the widget if
		// necessary
		if (!isInGroup && (needsLabel || needsHelp)) {
			composite = widgetFactory.createComposite(parent);

			// We will only create the necessary number of columns for this "invisible" composite
			int numColumn = 1;
			if (needsLabel) {
				numColumn = numColumn + 1;
			}
			if (needsHelp) {
				numColumn = numColumn + 1;
			}
			GridLayout layout = new GridLayout(numColumn, false);
			composite.setLayout(layout);

			GridData layoutData = new GridData(GridData.FILL_HORIZONTAL);
			layoutData.horizontalSpan = 1;
			composite.setLayoutData(layoutData);
		}

		if (needsLabel) {
			this.label = widgetFactory.createStyledText(composite, SWT.NONE);
			this.label.setEditable(false);
			this.label.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
		}

		if (needsHelp) {
			this.help = widgetFactory.createCLabel(composite, ""); //$NON-NLS-1$
			if (!Util.isBlank(this.getWidgetDescription().getHelpExpression())) {
				this.help.setImage(EEFIdeUiPlugin.getPlugin().getImageRegistry().get(Icons.HELP));
				this.help.setToolTipText(""); //$NON-NLS-1$
			}
		}

		this.createMainControl(composite, formContainer);
	}

	/**
	 * Indicates if the widget description is located directly under a group or if it is under a container.
	 *
	 * @return <code>true</code> if the widget description is directly under a group, <code>false</code> otherwise
	 */
	private boolean isInGroup() {
		EObject eContainer = this.getWidgetDescription().eContainer();

		// Test if the widget description is in a dynamic mapping directly under a group
		if (eContainer instanceof EEFDynamicMappingIf && eContainer.eContainer() instanceof EEFDynamicMappingFor) {
			EEFDynamicMappingFor dynamicMappingFor = (EEFDynamicMappingFor) eContainer.eContainer();
			return dynamicMappingFor.eContainer() instanceof EEFGroupDescription;
		}

		// Otherwise, let's test if it is directly under a group
		return eContainer instanceof EEFGroupDescription;
	}

	/**
	 * Indicates if the widget should create a label widget for its label.
	 *
	 * @return <code>true</code> if a label should be created, <code>false</code> otherwise.
	 */
	protected boolean needSeparatedLabel() {
		return true;
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
	 * Returns the style of the widget.
	 *
	 * @return The style of the widget
	 */
	protected abstract EEFWidgetStyle getWidgetStyle();

	/**
	 * Returns the style of the widget associated to a conditional style.
	 *
	 * @param conditionalStyle
	 *            The conditional style
	 * @return The style of the widget associated to a conditional style
	 */
	protected abstract EEFWidgetStyle getWidgetStyle(EEFConditionalStyle conditionalStyle);

	/**
	 * Returns the conditional style of the widget.
	 *
	 * @return The conditional style of the widget
	 */
	protected abstract List<EEFConditionalStyle> getWidgetConditionalStyles();

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
					// Set label style
					EEFWidgetStyle style = getWidgetStyle();
					List<EEFConditionalStyle> conditionalStyles = getWidgetConditionalStyles();
					if (conditionalStyles != null && !conditionalStyles.isEmpty()) {
						style = getConditionalStyle(conditionalStyles, style);
					}
					if (style != null) {
						setLabelFontStyle(style);
					}
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
	 * Set label font style.
	 *
	 * @param style
	 *            Label style
	 */
	private void setLabelFontStyle(EEFWidgetStyle style) {
		// Set font
		setFont(style.getLabelFontNameExpression(), EefPackage.Literals.EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION,
				style.getLabelFontSizeExpression(), EefPackage.Literals.EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION,
				style.getLabelFontStyleExpression(), EefPackage.Literals.EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION, label);

		// Set background color
		setBackgroundColor(style.getLabelBackgroundColorExpression(), EefPackage.Literals.EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION, label);

		// Set foreground color
		setForegroundColor(style.getLabelForegroundColorExpression(), EefPackage.Literals.EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION, label);
	}

	/**
	 * Get valid conditional style.
	 *
	 * @param conditionalStyles
	 *            Conditional styles
	 * @param defaultStyle
	 *            Default style
	 * @return Return the first valid conditional style else null
	 */
	private EEFWidgetStyle getConditionalStyle(List<EEFConditionalStyle> conditionalStyles, EEFWidgetStyle defaultStyle) {
		EEFWidgetStyle style = defaultStyle;
		for (EEFConditionalStyle eefConditionalStyle : conditionalStyles) {
			String preconditionExpression = eefConditionalStyle.getPreconditionExpression();
			Boolean preconditionValid = new Eval(interpreter, variableManager).get(preconditionExpression, Boolean.class);
			if (preconditionValid != null && preconditionValid.booleanValue()) {
				style = this.getWidgetStyle(eefConditionalStyle);
			}
		}
		return style;
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
			setFont(style.getFontNameExpression(), EefPackage.Literals.EEF_TEXT_STYLE__FONT_NAME_EXPRESSION, style.getFontSizeExpression(),
					EefPackage.Literals.EEF_TEXT_STYLE__FONT_SIZE_EXPRESSION, style.getFontStyleExpression(),
					EefPackage.Literals.EEF_TEXT_STYLE__FONT_STYLE_EXPRESSION, text);

			// Set background color
			setBackgroundColor(style.getBackgroundColorExpression(), EefPackage.Literals.EEF_TEXT_STYLE__BACKGROUND_COLOR_EXPRESSION, text);

			// Set foreground color
			setForegroundColor(style.getForegroundColorExpression(), EefPackage.Literals.EEF_TEXT_STYLE__FOREGROUND_COLOR_EXPRESSION, text);
		}
	}

	/**
	 * Set the foreground color.
	 *
	 * @param foregroundColorExpression
	 *            Foreground color expression
	 * @param eAttribute
	 *            The eAttribute
	 * @param text
	 *            The text
	 */
	protected void setForegroundColor(String foregroundColorExpression, EAttribute eAttribute, StyledText text) {
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
	 * @param backgroundColorExpression
	 *            Style
	 * @param eAttribute
	 *            The eAttribute
	 * @param text
	 *            Text
	 */
	protected void setBackgroundColor(String backgroundColorExpression, EAttribute eAttribute, StyledText text) {
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
	 * @param fontNameExpression
	 *            Font name expression
	 * @param fontNameAttribute
	 *            Font name attribute
	 * @param fontSizeExpression
	 *            Font size expression
	 * @param fontSizeAttribute
	 *            Font size attribute
	 * @param fontStyleExpression
	 *            Font style expression
	 * @param fontStyleAttribute
	 *            Font style attribute
	 * @param text
	 *            Text
	 * @param text
	 */
	protected void setFont(String fontNameExpression, EAttribute fontNameAttribute, String fontSizeExpression, EAttribute fontSizeAttribute,
			String fontStyleExpression, EAttribute fontStyleAttribute, StyledText text) {
		// Get default font
		Font defaultFont = text.getFont();
		FontData defaultFontData = defaultFont.getFontData()[0];
		String fontName = getFontName(fontNameExpression, fontNameAttribute, defaultFontData);
		int fontSize = getFontSize(fontSizeExpression, fontSizeAttribute, defaultFontData);
		int fontStyle = getFontStyle(fontStyleExpression, fontStyleAttribute, defaultFontData, text);
		EEFFont font = new EEFFont(fontName, fontSize, fontStyle);
		text.setFont(font.getFont());
	}

	/**
	 * Get the font name.
	 *
	 * @param fontNameExpression
	 *            Font name expression
	 * @param eAttribute
	 *            The eAttribute
	 * @param defaultFontData
	 *            Default font data
	 * @return Font name
	 */
	private String getFontName(String fontNameExpression, EAttribute eAttribute, FontData defaultFontData) {
		String fontName = defaultFontData.getName();
		Eval eval = new Eval(interpreter, variableManager);
		if (fontNameExpression != null && !fontNameExpression.isEmpty()) {
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
	 * @param fontSizeExpression
	 *            Font size expression
	 * @param eAttribute
	 *            The eAttribute
	 * @param defaultFontData
	 *            Default font data
	 * @return Font size
	 */
	private int getFontSize(String fontSizeExpression, EAttribute eAttribute, FontData defaultFontData) {
		int fontSize = defaultFontData.getHeight();
		if (fontSizeExpression != null && !fontSizeExpression.isEmpty()) {
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
	 * @param fontStyleExpression
	 *            Font style expression
	 * @param eAttribute
	 *            The eAttribute
	 * @param defaultFontData
	 *            Default font data
	 * @param text
	 *            The text
	 * @return Font style
	 */
	private int getFontStyle(String fontStyleExpression, EAttribute eAttribute, FontData defaultFontData, StyledText text) {
		int fontStyle = defaultFontData.getStyle();
		if (fontStyleExpression != null && !fontStyleExpression.isEmpty()) {
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

	/**
	 * Returns the <code>IStructuredSelection</code> of the specified viewer.
	 * <p>
	 * Backport of <code>StructuredViewer.getStructuredSelection()</code> which was introduced in JFace 3.11 (Mars) to
	 * work with JFace 3.10 (Luna).
	 * </p>
	 *
	 * @param viewer
	 *            the viewer.
	 * @return IStructuredSelection
	 * @throws ClassCastException
	 *             if the selection of the viewer is not an instance of IStructuredSelection
	 */
	protected IStructuredSelection getStructuredSelection(StructuredViewer viewer) throws ClassCastException {
		ISelection selection = viewer.getSelection();
		if (selection instanceof IStructuredSelection) {
			return (IStructuredSelection) selection;
		}
		throw new ClassCastException(Messages.AbstractEEFWidgetLifecycleManager_invalidSelectionType);
	}
}
