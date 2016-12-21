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
package org.eclipse.eef.core.internal.controllers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFFilePickerDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFFilePickerController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class will be used in order to manage the behavior of the file picker.
 *
 * @author arichard
 */
public class EEFFilePickerController extends AbstractEEFWidgetController implements IEEFFilePickerController {
	/**
	 * The description.
	 */
	private EEFFilePickerDescription description;

	/**
	 * The editing context adapter.
	 */
	private EditingContextAdapter contextAdapter;

	/**
	 * The consumer of a new value of the text.
	 */
	private IConsumer<String> newPathConsumer;

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
	public EEFFilePickerController(EEFFilePickerDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter);
		this.description = description;
		this.contextAdapter = contextAdapter;
	}

	@Override
	public IStatus updatePath(final String text) {
		return this.contextAdapter.performModelChange(new Runnable() {
			@Override
			public void run() {
				String editExpression = EEFFilePickerController.this.description.getEditExpression();
				EAttribute eAttribute = EefPackage.Literals.EEF_FILE_PICKER_DESCRIPTION__EDIT_EXPRESSION;

				Map<String, Object> variables = new HashMap<String, Object>();
				variables.putAll(EEFFilePickerController.this.variableManager.getVariables());
				variables.put(EEFExpressionUtils.EEFFilePicker.NEW_PATH, text);

				EvalFactory.of(EEFFilePickerController.this.interpreter, variables).logIfBlank(eAttribute).call(editExpression);
			}
		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();

		String pathExpression = this.description.getPathExpression();
		this.newEval().logIfInvalidType(String.class).call(pathExpression, this.newPathConsumer);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFFilePickerController#onNewPath(org.eclipse.eef.core.api.controllers.IConsumer)
	 */
	@Override
	public void onNewPath(IConsumer<String> consumer) {
		this.newPathConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFFilePickerController#removeNewPathConsumer()
	 */
	@Override
	public void removeNewPathConsumer() {
		this.newPathConsumer = null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController#getDescription()
	 */
	@Override
	protected EEFWidgetDescription getDescription() {
		return this.description;
	}

}
