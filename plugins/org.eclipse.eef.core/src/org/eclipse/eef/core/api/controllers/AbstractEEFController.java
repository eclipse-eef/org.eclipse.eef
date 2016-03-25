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
import java.util.List;

import org.eclipse.eef.EEFRuleAuditDescription;
import org.eclipse.eef.EEFValidationRuleDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.eef.core.internal.controllers.InvalidValidationRuleResult;
import org.eclipse.eef.core.internal.controllers.ValidationRuleResult;
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
	 */
	public AbstractEEFController(IVariableManager variableManager, IInterpreter interpreter) {
		this.variableManager = variableManager;
		this.interpreter = interpreter;
	}

	/**
	 * Returns a new {@link Eval} instance initialized with the {@link IInterpreter} and the {@link IVariableManager}.
	 *
	 * @return a new Eval.
	 */
	protected Eval newEval() {
		return new Eval(this.interpreter, this.variableManager);
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
			boolean isValid = true;

			for (EEFRuleAuditDescription audit : validationRule.getAudits()) {
				String auditExpression = audit.getAuditExpression();
				Boolean result = this.newEval().get(auditEAttribute, auditExpression, Boolean.class);
				isValid = isValid && (result != null && result.booleanValue());

				if (!isValid) {
					break;
				}
			}

			if (isValid) {
				validationRuleResults.add(new ValidationRuleResult(validationRule));
			} else {
				String messageExpression = validationRule.getMessageExpression();
				String message = this.newEval().get(messageEAttribute, messageExpression, String.class);
				validationRuleResults.add(new InvalidValidationRuleResult(validationRule, message, null, validationRule.getSeverity().getValue()));
			}
		}

		return validationRuleResults;
	}
}
