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
import org.eclipse.eef.EEFRadioConditionalStyle;
import org.eclipse.eef.EEFRadioDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EEFWidgetStyle;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EEFExpressionUtils.EEFSelect;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFRadioController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
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
	public EEFRadioLifecycleManager(EEFRadioDescription description, IVariableManager variableManager, IInterpreter interpreter,
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

		this.radioGroupViewer = new RadioGroupViewer(parent, widgetFactory, this.description.getNumberOfColumns());
		this.radioGroup = radioGroupViewer.getRadioGroup();
		this.radioGroupViewer.setContentProvider(ArrayContentProvider.getInstance());
		this.radioGroupViewer.setLabelProvider(new EEFRadioLabelProvider());

		this.radioGroupViewer.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);

		FormData radioGroupFormData = new FormData();
		radioGroupFormData.left = new FormAttachment(0, LABEL_WIDTH);
		this.radioGroup.setLayoutData(radioGroupFormData);

		this.controller = new EEFControllersFactory().createRadioController(this.description, this.variableManager, this.interpreter,
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
		return ((EEFRadioConditionalStyle) conditionalStyle).getStyle();
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
		return this.radioGroup;
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
				IStructuredSelection selection = radioGroupViewer.getStructuredSelection();
				Object newValue = selection.getFirstElement();
				controller.updateValue(newValue);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// Nothing to do
			}
		};
		this.radioGroup.addSelectionListener(this.selectionListener);

		// Set radio group value
		this.controller.onNewValue(new IConsumer<Object>() {
			@Override
			public void apply(Object value) {
				if (!radioGroup.isDisposed()) {
					final ISelection selection;
					if (value != null) {
						selection = new StructuredSelection(value);
					} else {
						selection = null;
					}
					radioGroupViewer.setSelection(selection);
					if (!radioGroup.isEnabled()) {
						radioGroup.setEnabled(true);
					}
				}
			}
		});

		// Set radio group items
		this.controller.onNewCandidates(new IConsumer<List<Object>>() {
			@Override
			public void apply(List<Object> candidates) {
				if (!radioGroup.isDisposed()) {
					if (candidates != null) {
						radioGroupViewer.setInput(candidates.toArray());
					} else {
						radioGroupViewer.setInput(null);
					}
					if (!radioGroup.isEnabled()) {
						radioGroup.setEnabled(true);
					}
					radioGroupViewer.refresh(true);
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
		if (!radioGroup.isDisposed()) {
			this.radioGroup.removeSelectionListener(this.selectionListener);
		}
		this.controller.removeNewValueConsumer();
		this.controller.removeNewCandidatesConsumer();
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
			variables.put(EEFSelect.CANDIDATE, element);

			return new Eval(EEFRadioLifecycleManager.this.interpreter, variables).get(eAttribute, expression, String.class);
		}
	}
}
