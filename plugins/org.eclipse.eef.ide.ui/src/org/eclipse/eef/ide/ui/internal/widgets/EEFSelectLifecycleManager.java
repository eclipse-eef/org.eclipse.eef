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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.eef.EEFSelectDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EEFExpressionUtils.EEFSelect;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFSelectController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
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
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
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
	 * The mouse listener on the combo.
	 */
	private MouseListener mouseListener;

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
	public EEFSelectLifecycleManager(EEFSelectDescription description, IVariableManager variableManager, IInterpreter interpreter,
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
					controller.updateValue(newValue);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// Nothing to do
			}
		};
		this.combo.addSelectionListener(this.selectionListener);

		this.mouseListener = new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// Nothing to do
			}

			@Override
			public void mouseDown(MouseEvent e) {
				// Delay the computation of the candidates until the user click on the combo
				controller.computeCandidates();
			}

			@Override
			public void mouseUp(MouseEvent e) {
				// Nothing to do
			}

		};
		this.combo.addMouseListener(this.mouseListener);

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
					comboViewer.setSelection(selection, true);
					if (!combo.isEnabled()) {
						combo.setEnabled(true);
					}
				}
			}
		});

		// Set combo items
		this.controller.onNewCandidates(new IConsumer<List<Object>>() {
			@Override
			public void apply(final List<Object> value) {
				ISelection selection = comboViewer.getSelection();
				if (!combo.isDisposed()) {
					if (value != null) {
						Object[] candidates = value.toArray();
						for (int i = 0; i < candidates.length; i++) {
							if (candidates[i] == null) {
								candidates[i] = NO_VALUE;
							}
						}
						comboViewer.setInput(candidates);
					} else {
						comboViewer.setInput(null);
					}
					comboViewer.setSelection(selection, true);
					if (!combo.isEnabled()) {
						combo.setEnabled(true);
					}
				}

				combo.setCursor(new Cursor(Display.getCurrent(), SWT.CURSOR_ARROW));
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

		if (!combo.isDisposed()) {
			this.combo.removeSelectionListener(this.selectionListener);
			this.combo.removeMouseListener(this.mouseListener);
		}
		this.controller.removeNewValueConsumer();
		this.controller.removeNewCandidatesConsumer();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();
		this.combo.setEnabled(isEnabled());
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

			return EvalFactory.of(EEFSelectLifecycleManager.this.interpreter, variables).logIfInvalidType(String.class).logIfBlank(eAttribute)
					.evaluate(expression);
		}
	}
}
