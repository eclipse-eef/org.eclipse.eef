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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFSelectDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EEFExpressionUtils.EEFSelect;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IEEFSelectController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * This class will be used in order to manager the lifecycle of a combo.
 *
 * @author mbats
 */
public class EEFSelectLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	/**
	 * Special value to replace "null" as a combo value.
	 */
	private static final Object NO_VALUE = new Object() {
		@Override
		public String toString() {
			return "<null>"; //$NON-NLS-1$
		}
	};

	/**
	 * The description.
	 */
	private EEFSelectDescription description;

	/**
	 * The combo viewer.
	 */
	private ComboViewer comboViewer;

	/**
	 * The combo.
	 */
	private Combo combo;

	/**
	 * The controller.
	 */
	private IEEFSelectController controller;

	/**
	 * The listener on the combo.
	 */
	private SelectionListener selectionListener;

	/**
	 * The reference value of the selection, as last rendered from the state of the actual model.
	 */
	private ISelection referenceValue;

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
	public EEFSelectLifecycleManager(EEFSelectDescription description, IVariableManager variableManager, IInterpreter interpreter,
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

		this.comboViewer = new ComboViewer(parent, SWT.READ_ONLY);
		this.combo = comboViewer.getCombo();
		GridData gridData = new GridData();
		gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
		this.combo.setLayoutData(gridData);
		this.comboViewer.setContentProvider(ArrayContentProvider.getInstance());
		this.comboViewer.setLabelProvider(new EEFSelectLabelProvider());

		this.comboViewer.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);

		this.controller = new EEFControllersFactory().createSelectController(this.description, this.variableManager, this.interpreter,
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
		return this.combo;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.selectionListener = new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (!EEFSelectLifecycleManager.this.container.isRenderingInProgress()) {
					IStructuredSelection selection = getStructuredSelection(comboViewer);
					Object newValue = selection.getFirstElement();
					if (newValue == NO_VALUE) {
						newValue = null;
					}
					IStatus result = controller.updateValue(newValue);
					if (result != null && result.getSeverity() == IStatus.ERROR) {
						EEFIdeUiPlugin.INSTANCE.log(result);
						comboViewer.setSelection(referenceValue);
					} else {
						refresh();
					}
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// Nothing to do
			}
		};
		this.combo.addSelectionListener(this.selectionListener);

		// Set combo value
		this.controller.onNewValue((value) -> {
			if (!this.combo.isDisposed() && !(this.combo.getText() != null && this.combo.getText().equals(value))) {
				final ISelection selection;
				if (value != null) {
					selection = new StructuredSelection(value);
				} else {
					selection = null;
				}
				this.referenceValue = selection;
				this.comboViewer.setSelection(this.referenceValue, true);
				if (!this.combo.isEnabled()) {
					this.combo.setEnabled(true);
				}
			}
		});

		// Set combo items
		this.controller.onNewCandidates((value) -> {
			if (!this.combo.isDisposed()) {
				if (this.combo.getListVisible() && this.avoidUpdatingOpenedCombo()) {
					return;
				}
				if (this.forceCloseToUpdateCombo()) {
					this.combo.setListVisible(false);
				}
				if (value != null) {
					Object[] candidates = value.toArray();
					for (int i = 0; i < candidates.length; i++) {
						if (candidates[i] == null) {
							candidates[i] = NO_VALUE;
						}
					}
					this.comboViewer.setInput(candidates);
				} else {
					this.comboViewer.setInput(null);
				}
				if (!this.combo.isEnabled()) {
					this.combo.setEnabled(true);
				}
			}
		});
	}

	/**
	 * Needed to workaround https://bugs.eclipse.org/530181, which happens at least under to Windows 7.
	 *
	 * @return true if we should avoid accepting new/updated input while the combo is opened/visible.
	 */
	private boolean avoidUpdatingOpenedCombo() {
		// Default to true under Windows 7.
		boolean win7 = "Windows7".equals(System.getProperty("org.osgi.framework.os.name")); //$NON-NLS-1$ //$NON-NLS-2$
		return Boolean.valueOf(System.getProperty("org.eclipse.eef.avoidUpdatingOpenedCombo", Boolean.toString(win7))).booleanValue(); //$NON-NLS-1$
	}

	/**
	 * Checks configuration flag to see if we must close of already opened combos to update their contents (instead of
	 * possibly displaying stale values on OSes that do not support updating opened combos).
	 *
	 * @return true if the combo must be force-closed for its content to be updated.
	 */
	private boolean forceCloseToUpdateCombo() {
		return Boolean.valueOf(System.getProperty("org.eclipse.eef.forceCloseToUpdateCombo", Boolean.toString(false))).booleanValue(); //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();

		if (!combo.isDisposed()) {
			this.combo.removeSelectionListener(this.selectionListener);
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
		if (!this.combo.isDisposed()) {
			this.combo.setEnabled(isEnabled);
		}
	}

	/**
	 * Select widget label provider.
	 *
	 * @author mbats
	 */
	private final class EEFSelectLabelProvider extends LabelProvider {
		@Override
		public String getText(Object element) {
			String expression = description.getCandidateDisplayExpression();
			EAttribute eAttribute = EefPackage.Literals.EEF_SELECT_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION;

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.put(EEFExpressionUtils.SELF, variableManager.getVariables().get(EEFExpressionUtils.SELF));
			variables.put(EEFExpressionUtils.INPUT, variableManager.getVariables().get(EEFExpressionUtils.INPUT));
			variables.put(EEFSelect.CANDIDATE, element);

			return EvalFactory.of(EEFSelectLifecycleManager.this.interpreter, variables).logIfInvalidType(String.class).logIfBlank(eAttribute)
					.evaluate(expression);
		}
	}
}
