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

import org.eclipse.eef.EEFLabelDescription;
import org.eclipse.eef.EEFLabelStyle;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFLabelController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.ide.ui.internal.widgets.EEFStyleHelper.IEEFTextStyleCallback;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * This class will be used in order to manage the lifecycle of a label.
 *
 * @author mbats
 */
public class EEFLabelLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * This constant is used in order to tell SWT that the label should be 300px wide even if it is not useful. The
	 * layout data should work by themselves but it seems that there is a bug with SWT so, this useless information on
	 * the width of the label make it work. Don't ask me why :)
	 */
	private static final int LABEL_WIDTH_HINT = 300;

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
		EEFWidgetFactory widgetFactory = formContainer.getWidgetFactory();
		this.body = widgetFactory.createStyledText(parent, SWT.V_SCROLL | SWT.WRAP);
		GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);

		// TODO Add a linecount property to the label and use it to compute the height of the widget
		gridData.heightHint = this.body.getLineHeight();
		gridData.widthHint = LABEL_WIDTH_HINT;
		this.body.setLayoutData(gridData);
		this.body.setEditable(false);

		this.controller = new EEFControllersFactory().createLabelController(this.description, this.variableManager, this.interpreter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.controller.onNewValue(new IConsumer<String>() {
			@Override
			public void apply(String value) {
				if (!body.isDisposed()) {
					if (!(body.getText() != null && body.getText().equals(value))) {
						body.setText(Objects.firstNonNull(value, "")); //$NON-NLS-1$
					}
					EEFLabelLifecycleManager.this.setStyle();
				}
			}
		});
	}

	/**
	 * Set the style.
	 */
	private void setStyle() {
		EEFStyleHelper styleHelper = new EEFStyleHelper(this.interpreter, this.variableManager);
		EEFWidgetStyle style = styleHelper.getWidgetStyle(this.description);
		if (style instanceof EEFLabelStyle) {
			EEFLabelStyle labelStyle = (EEFLabelStyle) style;

			IEEFTextStyleCallback callback = new EEFStyledTextStyleCallback(this.body);
			styleHelper.applyTextStyle(labelStyle.getFontNameExpression(), labelStyle.getFontSizeExpression(), labelStyle.getFontStyleExpression(),
					this.body.getFont(), labelStyle.getBackgroundColorExpression(), labelStyle.getForegroundColorExpression(), callback);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();
		this.body.setEnabled(isEnabled());
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();
		this.controller.removeNewValueConsumer();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#dispose()
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
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return this.body;
	}
}
