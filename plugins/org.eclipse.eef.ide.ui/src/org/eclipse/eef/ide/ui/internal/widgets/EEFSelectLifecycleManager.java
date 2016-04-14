/*******************************************************************************
 * Copyright (c) 2016 Obeo.
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.eef.EEFConditionalStyle;
import org.eclipse.eef.EEFSelectConditionalStyle;
import org.eclipse.eef.EEFSelectDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EEFExpressionUtils.EEFSelect;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFSelectController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
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
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
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
	public EEFSelectLifecycleManager(EEFSelectDescription description, IVariableManager variableManager, IInterpreter interpreter,
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
		EEFWidgetFactory widgetFactory = formContainer.getWidgetFactory();

		this.comboViewer = new ComboViewer(parent, SWT.READ_ONLY);
		this.combo = comboViewer.getCombo();
		this.comboViewer.setContentProvider(ArrayContentProvider.getInstance());
		this.comboViewer.setLabelProvider(new EEFSelectLabelProvider());

		this.comboViewer.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);

		FormData comboFormData = new FormData();
		comboFormData.left = new FormAttachment(0, LABEL_WIDTH);
		comboFormData.right = new FormAttachment(100, 0);
		this.combo.setLayoutData(comboFormData);

		if (!isEnabled()) {
			this.combo.setEnabled(false);
		}

		this.controller = new EEFControllersFactory().createSelectController(this.description, this.variableManager, this.interpreter,
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
		return this.description.getStyle();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#getWidgetStyle(org.eclipse.eef.EEFConditionalStyle)
	 */
	@Override
	protected EEFWidgetStyle getWidgetStyle(EEFConditionalStyle conditionalStyle) {
		if (conditionalStyle instanceof EEFSelectConditionalStyle) {
			return ((EEFSelectConditionalStyle) conditionalStyle).getStyle();
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
		return this.combo;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.ILifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.selectionListener = new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				IStructuredSelection selection = comboViewer.getStructuredSelection();
				Object newValue = selection.getFirstElement();
				controller.updateValue(newValue);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// Nothing to do
			}
		};
		this.combo.addSelectionListener(this.selectionListener);

		// Set combo value
		this.controller.onNewValue(new IConsumer<Object>() {
			@Override
			public void apply(Object value) {
				if (!combo.isDisposed() && !(combo.getText() != null && combo.getText().equals(value))) {
					final ISelection selection;
					if (value != null) {
						selection = new StructuredSelection(value);
					} else {
						selection = null;
					}
					comboViewer.setSelection(selection);
					if (isEnabled() && !combo.isEnabled()) {
						combo.setEnabled(true);
					}
				}
			}
		});

		// Set combo items
		this.controller.onNewCandidates(new IConsumer<List<Object>>() {
			@Override
			public void apply(List<Object> value) {
				if (!combo.isDisposed()) {
					if (value != null) {
						comboViewer.setInput(value.toArray());
					} else {
						comboViewer.setInput(null);
					}
					if (isEnabled() && !combo.isEnabled()) {
						combo.setEnabled(true);
					}
				}
			}
		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.ILifecycleManager#aboutToBeHidden()
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
			variables.put(EEFSelect.CANDIDATE, element);

			return new Eval(EEFSelectLifecycleManager.this.interpreter, variables).get(eAttribute, expression, String.class);
		}
	}
}
