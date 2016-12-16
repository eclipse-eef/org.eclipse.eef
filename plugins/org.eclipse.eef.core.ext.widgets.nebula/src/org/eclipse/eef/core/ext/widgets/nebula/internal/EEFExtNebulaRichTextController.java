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
package org.eclipse.eef.core.ext.widgets.nebula.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.core.ext.widgets.nebula.api.IEEFExtNebulaRichTextController;
import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextDescription;
import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EefExtWidgetsNebulaPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * The controller of the EEF Extension Nebula RichText widget.
 *
 * @author arichard
 */
public class EEFExtNebulaRichTextController extends AbstractEEFWidgetController
		implements IEEFExtNebulaRichTextController {

	/**
	 * The description.
	 */
	private EEFExtNebulaRichTextDescription description;

	/**
	 * The editing context adapter.
	 */
	private EditingContextAdapter contextAdapter;

	/**
	 * The consumer of a new value of the RichText.
	 */
	private IConsumer<Object> newValueConsumer;

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
	public EEFExtNebulaRichTextController(EEFExtNebulaRichTextDescription description, IVariableManager variableManager,
			IInterpreter interpreter, EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter);
		this.description = description;
		this.contextAdapter = contextAdapter;
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

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.eef.core.ext.widgets.nebula.api.IEEFExtNebulaRichTextController#updateValue(java.lang.String)
	 */
	@Override
	public IStatus updateValue(final String text) {
		return this.contextAdapter.performModelChange(() -> {
			String editExpression = EEFExtNebulaRichTextController.this.description.getEditExpression();
			EAttribute eAttribute = EefExtWidgetsNebulaPackage.Literals.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__EDIT_EXPRESSION;

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.putAll(EEFExtNebulaRichTextController.this.variableManager.getVariables());
			variables.put(EEFExpressionUtils.EEFText.NEW_VALUE, text);

			EvalFactory.of(EEFExtNebulaRichTextController.this.interpreter, variables).logIfBlank(eAttribute)
					.call(editExpression);
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

		String valueExpression = this.description.getValueExpression();
		this.newEval().call(valueExpression, this.newValueConsumer);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.ext.widgets.nebula.api.IEEFExtNebulaRichTextController#onNewValue(org.eclipse.eef.core.api.controllers.IConsumer)
	 */
	@Override
	public void onNewValue(IConsumer<Object> consumer) {
		this.newValueConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.ext.widgets.nebula.api.IEEFExtNebulaRichTextController#removeNewValueConsumer()
	 */
	@Override
	public void removeNewValueConsumer() {
		this.newValueConsumer = null;
	}
}
