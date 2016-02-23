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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.EEFPropertyValidationRuleDescription;
import org.eclipse.eef.EEFRuleAuditDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IValidationRuleResult;
import org.eclipse.eef.core.api.utils.ISuccessfulResultConsumer;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class is used to provide utilities to widget controller.
 *
 * @author mbats
 */
public abstract class AbstractEEFWidgetController extends AbstractEEFController implements IEEFWidgetController {

	/**
	 * The consumer of a new value of the label.
	 */
	protected IConsumer<String> newLabelConsumer;

	/**
	 * The consumer of the new value of the help.
	 */
	protected IConsumer<String> newHelpConsumer;

	/**
	 * The consumer of the validation messages.
	 */
	protected IConsumer<List<IValidationRuleResult>> validationConsumer;

	/**
	 * The constructor.
	 *
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 */
	public AbstractEEFWidgetController(IVariableManager variableManager, IInterpreter interpreter) {
		super(variableManager, interpreter);
	}

	/**
	 * Returns the widget description.
	 *
	 * @return The widget description
	 */
	protected abstract EEFWidgetDescription getDescription();

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFWidgetController#onNewLabel(org.eclipse.eef.core.api.controllers.IConsumer)
	 */
	@Override
	public void onNewLabel(IConsumer<String> consumer) {
		this.newLabelConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFWidgetController#removeNewLabelConsumer()
	 */
	@Override
	public void removeNewLabelConsumer() {
		this.newLabelConsumer = null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFWidgetController#onNewHelp(org.eclipse.eef.core.api.controllers.IConsumer)
	 */
	@Override
	public void onNewHelp(IConsumer<String> consumer) {
		this.newHelpConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFWidgetController#removeNewHelpConsumer()
	 */
	@Override
	public void removeNewHelpConsumer() {
		this.newHelpConsumer = null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFWidgetController#onValidation(org.eclipse.eef.core.api.controllers.IConsumer)
	 */
	@Override
	public void onValidation(IConsumer<List<IValidationRuleResult>> consumer) {
		this.validationConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFWidgetController#removeValidationConsumer()
	 */
	@Override
	public void removeValidationConsumer() {
		this.validationConsumer = null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFWidgetController#refresh()
	 */
	@Override
	public void refresh() {
		String labelExpression = this.getDescription().getLabelExpression();
		EAttribute labelEAttribute = EefPackage.Literals.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

		this.newEval().call(labelEAttribute, labelExpression, String.class, new ISuccessfulResultConsumer<String>() {
			@Override
			public void apply(String value) {
				AbstractEEFWidgetController.this.newLabelConsumer.apply(value);
			}
		});

		String helpExpression = this.getDescription().getHelpExpression();
		this.newEval().call(helpExpression, String.class, new ISuccessfulResultConsumer<String>() {
			@Override
			public void apply(String value) {
				AbstractEEFWidgetController.this.newHelpConsumer.apply(value);
			}
		});

		List<IValidationRuleResult> validationRuleResults = new ArrayList<IValidationRuleResult>();
		EAttribute auditEAttribute = EefPackage.Literals.EEF_RULE_AUDIT_DESCRIPTION__AUDIT_EXPRESSION;
		EAttribute messageEAttribute = EefPackage.Literals.EEF_VALIDATION_RULE_DESCRIPTION__MESSAGE_EXPRESSION;

		for (EEFPropertyValidationRuleDescription propertyValidationRule : this.getDescription().getPropertyValidationRules()) {
			boolean isValid = true;

			for (EEFRuleAuditDescription audit : propertyValidationRule.getAudits()) {
				String auditExpression = audit.getAuditExpression();
				Boolean result = this.newEval().get(auditEAttribute, auditExpression, Boolean.class);
				isValid = isValid && (result != null && result.booleanValue());

				if (!isValid) {
					break;
				}
			}

			if (isValid) {
				validationRuleResults.add(new ValidationRuleResult(propertyValidationRule));
			} else {
				String messageExpression = propertyValidationRule.getMessageExpression();
				String message = this.newEval().get(messageEAttribute, messageExpression, String.class);
				validationRuleResults.add(new InvalidValidationRuleResult(propertyValidationRule, message, null, propertyValidationRule.getSeverity()
						.getValue()));
			}
		}

		this.validationConsumer.apply(validationRuleResults);
	}

}
