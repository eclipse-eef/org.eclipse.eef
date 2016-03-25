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
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
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
	private Text text;

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
			this.text = widgetFactory.createText(parent, "", SWT.H_SCROLL | SWT.V_SCROLL | SWT.WRAP); //$NON-NLS-1$
			formData.height = lineCount * text.getLineHeight();
		} else {
			this.text = widgetFactory.createText(parent, "", SWT.NONE); //$NON-NLS-1$
		}

		// Set text style
		EEFTextStyle style = description.getStyle();
		if (style != null) {
			// Set font
			// Get default font
			Font defaultFont = text.getFont();
			FontData defaultFontData = defaultFont.getFontData()[0];
			String fontNameExpression = style.getFontNameExpression();
			String fontName = defaultFontData.getName();
			Eval eval = new Eval(this.interpreter, this.variableManager);
			if (fontNameExpression != null && !fontNameExpression.isEmpty()) {
				EAttribute eAttribute = EefPackage.Literals.EEF_TEXT_STYLE__FONT_NAME_EXPRESSION;
				String fontNameValue = eval.get(eAttribute, fontNameExpression, String.class);
				if (fontNameValue != null) {
					// Get font name
					fontName = fontNameValue;
				}
			}

			String fontSizeExpression = style.getFontSizeExpression();
			int fontSize = defaultFontData.getHeight();
			if (fontNameExpression != null && !fontNameExpression.isEmpty()) {
				EAttribute eAttribute = EefPackage.Literals.EEF_TEXT_STYLE__FONT_SIZE_EXPRESSION;
				Integer fontSizeValue = eval.get(eAttribute, fontSizeExpression, Integer.class);
				if (fontSizeValue != null && fontSizeValue.intValue() != fontSize) {
					fontSize = fontSizeValue;
				}
			}

			String fontStyleExpression = style.getFontStyleExpression();
			int fontStyle = defaultFontData.getStyle();
			if (fontNameExpression != null && !fontNameExpression.isEmpty()) {
				EAttribute eAttribute = EefPackage.Literals.EEF_TEXT_STYLE__FONT_STYLE_EXPRESSION;
				Integer fontStyleValue = eval.get(eAttribute, fontStyleExpression, Integer.class);
				if (fontStyleValue != null && fontStyleValue.intValue() != fontStyle) {
					// Get font style
					fontStyle = fontStyleValue;
				}
			}

			EEFFont font = new EEFFont(fontName, fontSize, fontStyle);
			this.text.setFont(font.getFont());

			// Set background color
			String backgroundColorExpression = style.getBackgroundColorExpression();
			EAttribute eAttribute = EefPackage.Literals.EEF_TEXT_STYLE__BACKGROUND_COLOR_EXPRESSION;
			String backgroundColorCode = eval.get(eAttribute, backgroundColorExpression, String.class);
			if (backgroundColorCode != null && !backgroundColorCode.isEmpty()) {
				EEFColor backgroundColor = new EEFColor(backgroundColorCode);
				this.text.setBackground(backgroundColor.getColor());
			}

			// Set foreground color
			String foregroundColorExpression = style.getForegroundColorExpression();
			eAttribute = EefPackage.Literals.EEF_TEXT_STYLE__FOREGROUND_COLOR_EXPRESSION;
			String foregroundColorCode = eval.get(eAttribute, foregroundColorExpression, String.class);
			if (foregroundColorCode != null && !foregroundColorCode.isEmpty()) {
				EEFColor foregroundColor = new EEFColor(foregroundColorCode);
				this.text.setForeground(foregroundColor.getColor());
			}
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
					text.setText(Objects.firstNonNull(value, "")); //$NON-NLS-1$
					if (!text.isEnabled()) {
						text.setEnabled(true);
					}
				}
			}
		});
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
