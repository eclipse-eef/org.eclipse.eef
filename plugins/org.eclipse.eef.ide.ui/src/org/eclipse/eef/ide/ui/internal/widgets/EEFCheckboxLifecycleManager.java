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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFCheckboxDescription;
import org.eclipse.eef.EEFCheckboxStyle;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFCheckboxController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper;
import org.eclipse.eef.ide.ui.api.widgets.EEFStyleHelper.IEEFTextStyleCallback;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * This class will be used in order to manager the lifecycle of a checkbox.
 *
 * @author mbats
 */
public class EEFCheckboxLifecycleManager extends AbstractEEFWidgetLifecycleManager {
	/**
	 * The description.
	 */
	private EEFCheckboxDescription description;

	/**
	 * The checkbox.
	 */
	private Button checkbox;

	/**
	 * The controller.
	 */
	private IEEFCheckboxController controller;

	/**
	 * The listener on the checkbox.
	 */
	private SelectionListener selectionListener;

	/**
	 * The reference value of the checkbox, as last rendered from the state of the actual model.
	 */
	private boolean referenceValue;

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
	public EEFCheckboxLifecycleManager(EEFCheckboxDescription description, IVariableManager variableManager, IInterpreter interpreter,
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

		this.checkbox = widgetFactory.createButton(parent, "", SWT.CHECK); //$NON-NLS-1$
		GridData gridData = new GridData();
		gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
		this.checkbox.setLayoutData(gridData);

		this.controller = new EEFControllersFactory().createCheckboxController(this.description, this.variableManager, this.interpreter,
				this.contextAdapter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#needSeparatedLabel()
	 */
	@Override
	protected boolean needSeparatedLabel() {
		return false;
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
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return this.checkbox;
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
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();
		this.getController().onNewLabel(new IConsumer<String>() {
			@Override
			public void apply(String value) {
				if (!checkbox.isDisposed() && !(checkbox.getText() != null && checkbox.getText().equals(value))) {
					checkbox.setText(Objects.firstNonNull(value, "")); //$NON-NLS-1$
				}
			}
		});
		// UI edited by user => update model if possible, revert UI change otherwise
		this.selectionListener = new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				IStatus result = controller.updateValue(checkbox.getSelection());
				if (result != null && result.getSeverity() == IStatus.ERROR) {
					EEFIdeUiPlugin.INSTANCE.log(result);
					checkbox.setSelection(referenceValue);
				} else {
					refresh();
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// Nothing to do
			}
		};
		this.checkbox.addSelectionListener(this.selectionListener);

		// Model changed => update UI
		this.controller.onNewValue(new IConsumer<Boolean>() {
			@Override
			public void apply(Boolean value) {
				if (!checkbox.isDisposed()) {
					if (value != null && checkbox.getSelection() != value.booleanValue()) {
						checkbox.setSelection(value.booleanValue());
						referenceValue = value.booleanValue();
					}
				}
			}
		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();
		if (!checkbox.isDisposed()) {
			this.checkbox.removeSelectionListener(this.selectionListener);
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
		this.checkbox.setEnabled(isEnabled());

		EEFStyleHelper styleHelper = new EEFStyleHelper(this.interpreter, this.variableManager);
		EEFWidgetStyle widgetStyle = styleHelper.getWidgetStyle(this.description);
		if (widgetStyle instanceof EEFCheckboxStyle) {
			EEFCheckboxStyle style = (EEFCheckboxStyle) widgetStyle;
			IEEFTextStyleCallback callback = new EEFCheckboxStyleCallback(this.checkbox);
			styleHelper.applyTextStyle(style.getLabelFontNameExpression(), style.getLabelFontSizeExpression(), style.getLabelFontStyleExpression(),
					this.checkbox.getFont(), style.getLabelBackgroundColorExpression(), style.getLabelForegroundColorExpression(), callback);
		}
	}
}
