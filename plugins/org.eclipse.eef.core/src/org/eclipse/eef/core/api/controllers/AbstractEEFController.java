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
package org.eclipse.eef.core.api.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFRuleAuditDescription;
import org.eclipse.eef.EEFValidationRuleDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.core.api.utils.EvalFactory.Eval;
import org.eclipse.eef.core.internal.controllers.InvalidValidationRuleResult;
import org.eclipse.eef.core.internal.controllers.ValidationRuleResult;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * Superclass of all the controllers containing some utility methods.
 *
 * @author sbegaudeau
 */
public abstract class AbstractEEFController implements IEEFController {
	/**
	 * The interpreter.
	 */
	protected IInterpreter interpreter;

	/**
	 * The variable manager.
	 */
	protected IVariableManager variableManager;

	/**
	 * The editing context adapter.
	 */
	protected EditingContextAdapter editingContextAdapter;

	/**
	 * The consumer of the validation messages.
	 */
	private IConsumer<List<IValidationRuleResult>> validationConsumer;

	/**
	 * The constructor.
	 *
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingContextAdapter
	 *            The editing context adapter
	 */
	public AbstractEEFController(IVariableManager variableManager, IInterpreter interpreter, EditingContextAdapter editingContextAdapter) {
		this.variableManager = variableManager;
		this.interpreter = interpreter;
		this.editingContextAdapter = editingContextAdapter;
	}

	/**
	 * Returns a new {@link Eval} instance initialized with the {@link IInterpreter} and the {@link IVariableManager}.
	 *
	 * @return a new Eval.
	 */
	protected Eval<Object> newEval() {
		return EvalFactory.of(this.interpreter, this.variableManager);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFController#onValidation(org.eclipse.eef.core.api.controllers.IConsumer)
	 */
	@Override
	public void onValidation(IConsumer<List<IValidationRuleResult>> consumer) {
		this.validationConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFController#removeValidationConsumer()
	 */
	@Override
	public void removeValidationConsumer() {
		this.validationConsumer = null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFController#refresh()
	 */
	@Override
	public void refresh() {
		List<IValidationRuleResult> validationRuleResults = this.getValidationRuleResults(this.getValidationRulesContainer(),
				this.getValidationRulesReference());
		if (this.validationConsumer != null) {
			this.validationConsumer.apply(validationRuleResults);
		}
	}

	/**
	 * Returns the EObject containing the validation rules.
	 *
	 * @return The EObject containing the validation rules
	 */
	protected abstract EObject getValidationRulesContainer();

	/**
	 * Returns the EReference containing the validation rules.
	 *
	 * @return The EReference containing the validation rules.
	 */
	protected abstract EReference getValidationRulesReference();

	/**
	 * Computes the result of the execution of all the validation rules.
	 *
	 * @param eObject
	 *            The EObject containing the validation rules
	 * @param validationRulesReference
	 *            The reference used to contain the validation rules (semantic or property based)
	 * @return The list of the validation rule results
	 */
	private List<IValidationRuleResult> getValidationRuleResults(EObject eObject, EReference validationRulesReference) {
		List<IValidationRuleResult> validationRuleResults = new ArrayList<IValidationRuleResult>();

		List<EEFValidationRuleDescription> descriptions = new ArrayList<EEFValidationRuleDescription>();
		Object validationRules = eObject.eGet(validationRulesReference);
		if (validationRules instanceof Iterable<?>) {
			for (Object validationRule : (Iterable<?>) validationRules) {
				if (validationRule instanceof EEFValidationRuleDescription) {
					descriptions.add((EEFValidationRuleDescription) validationRule);
				}
			}
		}

		EAttribute auditEAttribute = EefPackage.Literals.EEF_RULE_AUDIT_DESCRIPTION__AUDIT_EXPRESSION;
		EAttribute messageEAttribute = EefPackage.Literals.EEF_VALIDATION_RULE_DESCRIPTION__MESSAGE_EXPRESSION;

		for (EEFValidationRuleDescription validationRule : descriptions) {
			Object result = null;

			for (EEFRuleAuditDescription audit : validationRule.getAudits()) {
				String auditExpression = audit.getAuditExpression();
				result = this.newEval().logIfBlank(auditEAttribute).evaluate(auditExpression);

				if (!this.isValid(result)) {
					break;
				}
			}

			if (this.isValid(result)) {
				validationRuleResults.add(new ValidationRuleResult(validationRule));
			} else {
				Map<String, Object> variables = new HashMap<String, Object>();
				variables.putAll(this.variableManager.getVariables());
				variables.put(EEFExpressionUtils.AUDIT_RESULT, result);

				Eval<Object> eval = EvalFactory.of(this.interpreter, variables);
				String message = eval.logIfBlank(messageEAttribute).logIfInvalidType(String.class).evaluate(validationRule.getMessageExpression());

				validationRuleResults.add(new InvalidValidationRuleResult(validationRule, message, eval, this.editingContextAdapter,
						validationRule.getSeverity().getValue()));
			}
		}

		return validationRuleResults;
	}

	/**
	 * Indicates if the result of the evaluation of the audit expression is valid or not. A valid result is either:
	 * <ul>
	 * <li>A boolean with the value true</li>
	 * <li>An IStatus with a severity OK</li>
	 * <li>A diagnostic with a severity OK</li>
	 * </ul>
	 *
	 * @param result
	 *            The result of the evaluation of the audit expression
	 * @return <code>true</code> if the result is valid, <code>false</code> otherwise
	 */
	private boolean isValid(Object result) {
		boolean isValid = false;
		if (result instanceof Boolean) {
			isValid = ((Boolean) result).booleanValue();
		} else if (result instanceof IStatus) {
			isValid = ((IStatus) result).isOK();
		} else if (result instanceof Diagnostic) {
			isValid = ((Diagnostic) result).getSeverity() == Diagnostic.OK;
		}
		return isValid;
	}
}
