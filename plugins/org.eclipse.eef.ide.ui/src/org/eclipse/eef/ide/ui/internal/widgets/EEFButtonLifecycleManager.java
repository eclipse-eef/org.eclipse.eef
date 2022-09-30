/*******************************************************************************
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.internal.widgets;

import java.util.Optional;

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
import org.eclipse.eef.ide.ui.internal.EEFImageUtils;
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
	 * @param editingContextAdapter
	 *            The editing context adapter
	 */
	public EEFButtonLifecycleManager(EEFButtonDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter editingContextAdapter) {
		super(variableManager, interpreter, editingContextAdapter);
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

		this.button.setLayoutData(gridData);

		if (Boolean.TRUE.equals(parent.getData(DEDICATED_GRIDPARENT))) {
			parent.setLayoutData(new GridData()); // No excessive grab
			// When using button in a container, this prevent SWT to allocated empty space on right.
		}

		this.controller = new EEFControllersFactory().createButtonController(this.description, this.variableManager, this.interpreter,
				this.editingContextAdapter);

		if (controller.isValidationAnchor()) {
			// Removing useless indentation allow regularity in widget layout.
			// Most of time, buttons are not used to show validation.
			gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
		}
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
				button.setText(Optional.ofNullable(value).orElse("")); //$NON-NLS-1$
			}
		});

		this.controller.onNewButtonImage((value) -> {
			if (!button.isDisposed()) {
				//@formatter:off
				Optional.ofNullable(value).filter(String.class::isInstance)
					.map(String.class::cast)
					.flatMap(EEFImageUtils::getImage)
					.ifPresent(button::setImage);
				//@formatter:on
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
		this.controller.removeNewButtonImageConsumer();
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
