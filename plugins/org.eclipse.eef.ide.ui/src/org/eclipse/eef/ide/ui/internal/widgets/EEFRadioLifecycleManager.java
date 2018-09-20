/*******************************************************************************
 * Copyright (c) 2016, 2018 Obeo.
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

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFRadioDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EEFExpressionUtils.EEFSelect;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IEEFRadioController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * This class will be used in order to manager the lifecycle of a radio button.
 *
 * @author mbats
 */
public class EEFRadioLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * The description.
	 */
	private EEFRadioDescription description;

	/**
	 * The radio group viewer.
	 */
	private RadioGroupViewer radioGroupViewer;

	/**
	 * The radio group.
	 */
	private RadioGroup radioGroup;

	/**
	 * The controller.
	 */
	private IEEFRadioController controller;

	/**
	 * The listener on the combo.
	 */
	private SelectionListener selectionListener;

	/**
	 * Used to make the SelectionListener reentrant, to avoid infinite loops when we need to revert the UI state on
	 * error (as reverting the UI re-triggers the SelectionListener).
	 */
	private AtomicBoolean updateInProgress = new AtomicBoolean(false);

	/**
	 * The reference value of the selection, as last rendered from the state of the actual model.
	 */
	private ISelection referenceSelection;

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
	public EEFRadioLifecycleManager(EEFRadioDescription description, IVariableManager variableManager, IInterpreter interpreter,
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

		this.radioGroupViewer = new RadioGroupViewer(parent, widgetFactory, this.description.getNumberOfColumns());
		this.radioGroup = radioGroupViewer.getRadioGroup();
		GridData gridData = new GridData();
		gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
		this.radioGroup.setLayoutData(gridData);
		this.radioGroupViewer.setContentProvider(ArrayContentProvider.getInstance());
		this.radioGroupViewer.setLabelProvider(new EEFRadioLabelProvider());

		this.radioGroupViewer.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);

		this.controller = new EEFControllersFactory().createRadioController(this.description, this.variableManager, this.interpreter,
				this.editingContextAdapter);
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
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return this.radioGroup;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		// UI edited by user => update model if possible, revert UI change otherwise
		this.selectionListener = new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (!updateInProgress.compareAndSet(false, true)) {
					try {
						IStructuredSelection selection = getStructuredSelection(radioGroupViewer);
						Object newValue = selection.getFirstElement();
						IStatus result = controller.updateValue(newValue);
						if (result != null && result.getSeverity() == IStatus.ERROR && referenceSelection != null) {
							EEFIdeUiPlugin.INSTANCE.log(result);
							radioGroupViewer.setSelection(referenceSelection);
						} else {
							refresh();
						}
					} finally {
						updateInProgress.set(false);
					}
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// Nothing to do
			}
		};
		this.radioGroup.addSelectionListener(this.selectionListener);

		// Set radio group value
		this.controller.onNewValue((value) -> {
			if (!this.radioGroup.isDisposed()) {
				final ISelection selection;
				if (value != null) {
					selection = new StructuredSelection(value);
				} else {
					selection = null;
				}
				this.radioGroupViewer.setSelection(selection);
				this.referenceSelection = selection;
				if (!this.radioGroup.isEnabled()) {
					this.radioGroup.setEnabled(true);
				}
			}
		});

		// Set radio group items
		this.controller.onNewCandidates((candidates) -> {
			if (!this.radioGroup.isDisposed()) {
				if (candidates != null) {
					this.radioGroupViewer.setInput(candidates.toArray());
				} else {
					this.radioGroupViewer.setInput(null);
				}
				if (!this.radioGroup.isEnabled()) {
					this.radioGroup.setEnabled(true);
				}
				this.radioGroupViewer.refresh(true);
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
		if (!this.radioGroup.isDisposed()) {
			this.radioGroup.removeSelectionListener(this.selectionListener);
		}
		this.controller.removeNewValueConsumer();
		this.controller.removeNewCandidatesConsumer();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#setEnabled(boolean)
	 */
	@Override
	protected void setEnabled(boolean isEnabled) {
		if (!this.radioGroup.isDisposed()) {
			this.radioGroup.setEnabled(isEnabled);
		}
	}

	/**
	 * Radio widget label provider.
	 *
	 * @author mbats
	 */
	private final class EEFRadioLabelProvider extends LabelProvider {
		@Override
		public String getText(Object element) {
			String expression = description.getCandidateDisplayExpression();
			EAttribute eAttribute = EefPackage.Literals.EEF_RADIO_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION;

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.put(EEFExpressionUtils.SELF, variableManager.getVariables().get(EEFExpressionUtils.SELF));
			variables.put(EEFExpressionUtils.INPUT, variableManager.getVariables().get(EEFExpressionUtils.INPUT));
			variables.put(EEFSelect.CANDIDATE, element);

			return EvalFactory.of(EEFRadioLifecycleManager.this.interpreter, variables).logIfInvalidType(String.class).logIfBlank(eAttribute)
					.evaluate(expression);
		}
	}
}
