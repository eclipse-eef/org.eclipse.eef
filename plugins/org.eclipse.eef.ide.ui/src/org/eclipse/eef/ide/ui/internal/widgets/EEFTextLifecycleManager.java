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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.EEFConditionalStyle;
import org.eclipse.eef.EEFTextConditionalStyle;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFTextStyle;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFTextController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.ide.ui.internal.widgets.styles.EEFColor;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
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
	 * The widget factory.
	 */
	private EEFWidgetFactory widgetFactory;

	/**
	 * The default background color of the text field.
	 */
	private Color defaultBackgroundColor;

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
	public EEFTextLifecycleManager(EEFTextDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter contextAdapter) {
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
		widgetFactory = formContainer.getWidgetFactory();
		defaultBackgroundColor = parent.getBackground();

		// Get text area line count
		int lineCount = description.getLineCount();

		// Create text or text area according to the defined line count
		if (lineCount > 1) {
			this.text = widgetFactory.createStyledText(parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.WRAP | SWT.MULTI);
			GridData gridData = new GridData(SWT.FILL, SWT.CENTER, true, true);
			gridData.minimumHeight = lineCount * text.getLineHeight();
			this.text.setLayoutData(gridData);
		} else {
			this.text = widgetFactory.createStyledText(parent, SWT.SINGLE);
			this.text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		}

		this.text.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);

		this.controller = new EEFControllersFactory().createTextController(this.description, this.variableManager, this.interpreter,
				this.contextAdapter);
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
		return this.description.getStyle();
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
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeShown()
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

		this.controller.onNewValue(new IConsumer<Object>() {
			@Override
			public void apply(Object value) {
				if (!text.isDisposed()) {
					if (value != null && !(text.getText() != null && text.getText().equals(value.toString()))) {
						text.setText(Util.firstNonBlank(value.toString(), "")); //$NON-NLS-1$
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
		EEFTextStyle style = this.getTextStyle();
		if (style != null) {
			this.setFont(style.getFontNameExpression(), style.getFontSizeExpression(), style.getFontStyleExpression(), text);
			this.setBackgroundColor(style.getBackgroundColorExpression(), text);
			this.setForegroundColor(style.getForegroundColorExpression(), text);
		}
	}

	/**
	 * Get the text style.
	 *
	 * @return The text style to apply on the widget
	 */
	private EEFTextStyle getTextStyle() {
		EEFTextStyle textStyle = description.getStyle();
		List<EEFTextConditionalStyle> conditionalStyles = description.getConditionalStyles();
		if (conditionalStyles != null) {
			for (EEFTextConditionalStyle eefTextConditionalStyle : conditionalStyles) {
				String preconditionExpression = eefTextConditionalStyle.getPreconditionExpression();
				Boolean preconditionValid = Eval.of(interpreter, variableManager).logIfInvalidType(Boolean.class).get(preconditionExpression);
				if (preconditionValid != null && preconditionValid.booleanValue()) {
					textStyle = eefTextConditionalStyle.getStyle();
					break;
				}
			}
		}
		return textStyle;
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
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();

		if (!text.isDisposed()) {
			this.text.removeModifyListener(this.modifyListener);
		}
		this.controller.removeNewValueConsumer();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();
		this.text.setEnabled(isEnabled());
		this.text.setBackground(getBackgroundColor());
	}

	/**
	 * Get the background color according to the current valid style.
	 *
	 * @return The background color to use in the text field.
	 */
	private Color getBackgroundColor() {
		Color color = defaultBackgroundColor;
		EEFTextStyle style = getTextStyle();
		if (!isEnabled()) {
			color = widgetFactory.getColors().getInactiveBackground();
		} else if (style != null) {
			String backgroundColorCode = style.getBackgroundColorExpression();
			if (backgroundColorCode != null && !backgroundColorCode.isEmpty()) {
				EEFColor backgroundColor = new EEFColor(backgroundColorCode);
				color = backgroundColor.getColor();
			}
		}
		return color;
	}
}
