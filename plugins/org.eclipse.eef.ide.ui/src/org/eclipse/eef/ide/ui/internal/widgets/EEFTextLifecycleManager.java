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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.EEFConditionalStyle;
import org.eclipse.eef.EEFTextConditionalStyle;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFTextStyle;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.EefFactory;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFTextController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFColor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Color;
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
	 * Parent composite.
	 */
	private Composite composite;

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
	 *      org.eclipse.eef.common.ui.api.IEEFFormContainer)
	 */
	@Override
	protected void createMainControl(Composite parent, IEEFFormContainer formContainer) {
		this.composite = parent;
		EEFWidgetFactory widgetFactory = formContainer.getWidgetFactory();

		FormData formData = new FormData();
		formData.left = new FormAttachment(0, LABEL_WIDTH);
		formData.right = new FormAttachment(100, 0);

		// Get text area line count
		int lineCount = description.getLineCount();

		// Create text or text area according to the defined line count
		if (lineCount > 1) {
			this.text = widgetFactory.createStyledText(parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.WRAP);
			formData.height = lineCount * text.getLineHeight();
		} else {
			this.text = widgetFactory.createStyledText(parent, SWT.NONE);
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
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getWidgetStyle()
	 */
	@Override
	protected EEFWidgetStyle getWidgetStyle() {
		EEFWidgetStyle style = this.description.getStyle();
		if (style == null) {
			EEFTextStyle textStyle = EefFactory.eINSTANCE.createEEFTextStyle();
			super.setDefaultInheritedLabelStyle(textStyle, composite);
			setDefaultInheritedStyle(textStyle);
			style = textStyle;
		}
		return style;
	}

	/**
	 * Set style inherited from the parent group.
	 *
	 * @param style
	 *            Style
	 */
	private void setDefaultInheritedStyle(EEFTextStyle style) {
		// Set default foreground color
		Color foreground = composite.getForeground();
		if (foreground != null) {
			style.setForegroundColorExpression(new EEFColor(foreground).colorToString());
		}
		// Set default font
		Font font = composite.getFont();
		if (font != null) {
			FontData[] fontData = font.getFontData();
			if (fontData != null && fontData.length > 0) {
				style.setFontNameExpression(fontData[0].getName());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getWidgetStyle(org.eclipse.eef.EEFConditionalStyle)
	 */
	@Override
	protected EEFWidgetStyle getWidgetStyle(EEFConditionalStyle conditionalStyle) {
		if (conditionalStyle instanceof EEFTextConditionalStyle) {
			return ((EEFTextConditionalStyle) conditionalStyle).getStyle();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getWidgetConditionalStyles()
	 */
	@Override
	protected List<EEFConditionalStyle> getWidgetConditionalStyles() {
		List<EEFConditionalStyle> widgetConditionalStyles = new ArrayList<EEFConditionalStyle>();
		widgetConditionalStyles.addAll(this.description.getConditionalStyles());
		return widgetConditionalStyles;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.ILifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.modifyListener = new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent event) {
				if (!EEFTextLifecycleManager.this.container.isRenderingInProgress()) {
					controller.updateValue(text.getText());
				}
			}
		};
		this.text.addModifyListener(this.modifyListener);

		this.controller.onNewValue(new IConsumer<String>() {
			@Override
			public void apply(String value) {
				if (!text.isDisposed()) {
					if (!(text.getText() != null && text.getText().equals(value))) {
						text.setText(Objects.firstNonNull(value, "")); //$NON-NLS-1$
					}
					// Set style
					setStyle();
					if (!text.isEnabled()) {
						text.setEnabled(true);
					}
				}
			}

		});
	}

	/**
	 * Set the style.
	 */
	private void setStyle() {
		EEFTextStyle textStyle = (EEFTextStyle) getWidgetStyle();
		List<EEFTextConditionalStyle> conditionalStyles = description.getConditionalStyles();
		if (conditionalStyles != null) {
			for (EEFTextConditionalStyle eefTextConditionalStyle : conditionalStyles) {
				String preconditionExpression = eefTextConditionalStyle.getPreconditionExpression();
				Boolean preconditionValid = new Eval(interpreter, variableManager).get(preconditionExpression, Boolean.class);
				if (preconditionValid != null && preconditionValid.booleanValue()) {
					textStyle = eefTextConditionalStyle.getStyle();
					break;
				}
			}
		}
		setTextStyle(textStyle, text);
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
