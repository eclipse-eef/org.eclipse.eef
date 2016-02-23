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
package org.eclipse.eef.core.internal.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.eef.EEFMultipleReferencesDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFMultipleReferencesController;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.core.api.utils.ISuccessfulResultConsumer;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class will be used in order to manage the behavior of the multiple references widget.
 *
 * @author mbats
 */
public class EEFMultipleReferencesController extends AbstractEEFWidgetController implements IEEFMultipleReferencesController {
	/**
	 * The description.
	 */
	private EEFMultipleReferencesDescription description;

	/**
	 * The editing domain.
	 */
	private TransactionalEditingDomain editingDomain;

	/**
	 * The consumer of a new value of the list.
	 */
	private IConsumer<List<Object>> newValueConsumer;

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
	public EEFMultipleReferencesController(EEFMultipleReferencesDescription description, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain) {
		super(variableManager, interpreter);
		this.description = description;
		this.editingDomain = editingDomain;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.internal.controllers.AbstractEEFCustomWidgetController#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();

		String valueExpression = this.description.getValueExpression();
		EAttribute valueExpressionEAttribute = EefPackage.Literals.EEF_MULTIPLE_REFERENCES_DESCRIPTION__VALUE_EXPRESSION;

		this.newEval().call(valueExpressionEAttribute, valueExpression, new ISuccessfulResultConsumer<Object>() {
			@Override
			public void apply(Object value) {
				if (value instanceof Iterable<?>) {
					List<Object> candidates = new ArrayList<Object>();
					for (Object iterator : (Iterable<?>) value) {
						candidates.add(iterator);
					}
					EEFMultipleReferencesController.this.newValueConsumer.apply(candidates);
				}
			}
		});
	}

	@Override
	public void onNewValue(IConsumer<List<Object>> consumer) {
		this.newValueConsumer = consumer;
	}

	@Override
	public void removeNewValueConsumer() {
		this.newValueConsumer = null;
	}

	@Override
	public void create() {
		final Command command = new RecordingCommand(this.editingDomain) {
			@Override
			protected void doExecute() {
				String expression = EEFMultipleReferencesController.this.description.getCreateExpression();
				EAttribute attr = EefPackage.Literals.EEF_MULTIPLE_REFERENCES_DESCRIPTION__CREATE_EXPRESSION;
				EEFMultipleReferencesController.this.newEval().call(attr, expression);
			}
		};
		this.editingDomain.getCommandStack().execute(command);
	}

	@Override
	public void search() {
		final Command command = new RecordingCommand(this.editingDomain) {
			@Override
			protected void doExecute() {
				String expression = EEFMultipleReferencesController.this.description.getSearchExpression();
				EAttribute attr = EefPackage.Literals.EEF_MULTIPLE_REFERENCES_DESCRIPTION__SEARCH_EXPRESSION;
				EEFMultipleReferencesController.this.newEval().call(attr, expression);
			}
		};
		this.editingDomain.getCommandStack().execute(command);
	}

	@Override
	public void unset(final List<Object> elements) {
		final Command command = new RecordingCommand(this.editingDomain) {
			@Override
			protected void doExecute() {
				String expression = EEFMultipleReferencesController.this.description.getUnsetExpression();
				EAttribute attr = EefPackage.Literals.EEF_MULTIPLE_REFERENCES_DESCRIPTION__UNSET_EXPRESSION;
				Map<String, Object> variables = new HashMap<String, Object>();
				variables.putAll(EEFMultipleReferencesController.this.variableManager.getVariables());
				variables.put(EEFExpressionUtils.EEFMultiReferences.SELECTION, elements);

				new Eval(EEFMultipleReferencesController.this.interpreter, variables).call(attr, expression);

			}
		};
		this.editingDomain.getCommandStack().execute(command);
	}

	@Override
	public void up(final List<Object> elements) {
		final Command command = new RecordingCommand(this.editingDomain) {
			@Override
			protected void doExecute() {
				String expression = EEFMultipleReferencesController.this.description.getUpExpression();
				EAttribute attr = EefPackage.Literals.EEF_MULTIPLE_REFERENCES_DESCRIPTION__UP_EXPRESSION;
				Map<String, Object> variables = new HashMap<String, Object>();
				variables.putAll(EEFMultipleReferencesController.this.variableManager.getVariables());
				variables.put(EEFExpressionUtils.EEFMultiReferences.SELECTION, elements);

				new Eval(EEFMultipleReferencesController.this.interpreter, variables).call(attr, expression);

			}
		};
		this.editingDomain.getCommandStack().execute(command);
	}

	@Override
	public void down(final List<Object> elements) {
		final Command command = new RecordingCommand(this.editingDomain) {
			@Override
			protected void doExecute() {
				String expression = EEFMultipleReferencesController.this.description.getDownExpression();
				EAttribute attr = EefPackage.Literals.EEF_MULTIPLE_REFERENCES_DESCRIPTION__DOWN_EXPRESSION;
				Map<String, Object> variables = new HashMap<String, Object>();
				variables.putAll(EEFMultipleReferencesController.this.variableManager.getVariables());
				variables.put(EEFExpressionUtils.EEFMultiReferences.SELECTION, elements);

				new Eval(EEFMultipleReferencesController.this.interpreter, variables).call(attr, expression);

			}
		};
		this.editingDomain.getCommandStack().execute(command);
	}

	@Override
	public void onClick(final Object element) {
		final Command command = new RecordingCommand(this.editingDomain) {
			@Override
			protected void doExecute() {
				String expression = EEFMultipleReferencesController.this.description.getOnClickExpression();
				EAttribute attr = EefPackage.Literals.EEF_MULTIPLE_REFERENCES_DESCRIPTION__ON_CLICK_EXPRESSION;
				Map<String, Object> variables = new HashMap<String, Object>();
				variables.putAll(EEFMultipleReferencesController.this.variableManager.getVariables());
				variables.put(EEFExpressionUtils.EEFMultiReferences.SELECTION, element);

				new Eval(EEFMultipleReferencesController.this.interpreter, variables).call(attr, expression);

			}
		};
		this.editingDomain.getCommandStack().execute(command);
	}

	@Override
	protected EEFWidgetDescription getDescription() {
		return this.description;
	}

}
