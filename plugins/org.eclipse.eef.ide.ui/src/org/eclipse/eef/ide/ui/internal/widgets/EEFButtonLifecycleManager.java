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
import org.eclipse.eef.EEFButtonDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IEEFButtonController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * This class will be used in order to manager the lifecycle of a button.
 *
 * @author pcdavid
 */
public class EEFButtonLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * The minimum width of the button.
	 */
	private static final int MINIMUM_BUTTON_WIDTH = 80;

	/**
	 * The description.
	 */
	private EEFButtonDescription description;

	/**
	 * The button.
	 */
	private Button button;

	/**
	 * The controller.
	 */
	private IEEFButtonController controller;

	/**
	 * The listener on the button.
	 */
	private SelectionListener selectionListener;

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
	public EEFButtonLifecycleManager(EEFButtonDescription description, IVariableManager variableManager, IInterpreter interpreter,
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

		this.button = widgetFactory.createButton(parent, "", SWT.NONE); //$NON-NLS-1$

		GridData gridData = new GridData();
		gridData.minimumWidth = MINIMUM_BUTTON_WIDTH;
		gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
		this.button.setLayoutData(gridData);

		widgetFactory.paintBordersFor(parent);

		this.controller = new EEFControllersFactory().createButtonController(this.description, this.variableManager, this.interpreter,
				this.contextAdapter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getLabelVerticalAlignment()
	 */
	@Override
	protected int getLabelVerticalAlignment() {
		return GridData.VERTICAL_ALIGN_CENTER;
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

	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.selectionListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (!EEFButtonLifecycleManager.this.container.isRenderingInProgress()) {
					IStatus result = controller.pushed();
					if (result != null && result.getSeverity() == IStatus.ERROR) {
						EEFIdeUiPlugin.INSTANCE.log(result);
					} else {
						refresh();
					}
				}
			}
		};
		this.button.addSelectionListener(this.selectionListener);

		this.controller.onNewButtonLabel((value) -> {
			if (!button.isDisposed() && !(button.getText() != null && button.getText().equals(value))) {
				button.setText(Objects.firstNonNull(value, "")); //$NON-NLS-1$
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
		return this.button;
	}

	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();

		if (!button.isDisposed()) {
			this.button.removeSelectionListener(this.selectionListener);
		}
		this.controller.removeNewButtonLabelConsumer();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#setEnabled(boolean)
	 */
	@Override
	protected void setEnabled(boolean isEnabled) {
		if (!this.button.isDisposed()) {
			this.button.setEnabled(isEnabled);
		}
	}
}
