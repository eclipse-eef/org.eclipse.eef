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
import org.eclipse.eef.EEFLabelConditionalStyle;
import org.eclipse.eef.EEFLabelDescription;
import org.eclipse.eef.EEFLabelStyle;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditionContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFLabelController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * This class will be used in order to manage the lifecycle of a label.
 *
 * @author mbats
 */
public class EEFLabelLifecycleManager extends AbstractEEFWidgetLifecycleManager {
	/**
	 * The description.
	 */
	private EEFLabelDescription description;

	/**
	 * The body.
	 */
	private StyledText body;

	/**
	 * The controller.
	 */
	private IEEFLabelController controller;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param contextAdapter
	 *            The editing context adapter
	 */
	public EEFLabelLifecycleManager(EEFLabelDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditionContextAdapter contextAdapter) {
		super(variableManager, interpreter, contextAdapter);
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
		FormData buttonFormData = new FormData();
		buttonFormData.left = new FormAttachment(0, LABEL_WIDTH);

		this.body = new StyledText(parent, SWT.WRAP);
		this.body.setLayoutData(buttonFormData);

		this.controller = new EEFControllersFactory().createLabelController(this.description, this.variableManager, this.interpreter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.ILifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.controller.onNewBody(new IConsumer<String>() {
			@Override
			public void apply(String value) {
				if (!body.isDisposed()) {
					if (!(body.getText() != null && body.getText().equals(value))) {
						body.setText(Objects.firstNonNull(value, "")); //$NON-NLS-1$
					}
					// Set style
					setStyle();
				}
			}
		});
	}

	/**
	 * Set the style.
	 */
	private void setStyle() {
		EEFLabelStyle textStyle = description.getStyle();
		List<EEFLabelConditionalStyle> conditionalStyles = description.getConditionalStyles();
		if (conditionalStyles != null) {
			for (EEFLabelConditionalStyle eefTextConditionalStyle : conditionalStyles) {
				String preconditionExpression = eefTextConditionalStyle.getPreconditionExpression();
				Boolean preconditionValid = new Eval(interpreter, variableManager).get(preconditionExpression, Boolean.class);
				if (preconditionValid != null && preconditionValid.booleanValue()) {
					textStyle = eefTextConditionalStyle.getStyle();
					break;
				}
			}
		}
		setLabelStyle(textStyle, body);
	}

	/**
	 * Set the text style.
	 *
	 * @param style
	 *            Style
	 * @param text
	 *            The text
	 */
	private void setLabelStyle(EEFLabelStyle style, StyledText text) {
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
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.ILifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();
		this.controller.removeNewBodyConsumer();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.ILifecycleManager#dispose()
	 */
	@Override
	protected IEEFWidgetController getController() {
		return this.controller;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getController()
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
		return this.description.getStyle();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getWidgetStyle(org.eclipse.eef.EEFConditionalStyle)
	 */
	@Override
	protected EEFWidgetStyle getWidgetStyle(EEFConditionalStyle conditionalStyle) {
		if (conditionalStyle instanceof EEFLabelConditionalStyle) {
			return ((EEFLabelConditionalStyle) conditionalStyle).getStyle();
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
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return this.body;
	}

}
