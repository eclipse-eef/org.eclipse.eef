/*******************************************************************************
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.core.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.core.api.EEFContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EEFText;
import org.eclipse.eef.core.api.IConsumer;
import org.eclipse.eef.core.api.IVariableManager;
import org.eclipse.eef.interpreter.api.IEvaluationResult;
import org.eclipse.eef.interpreter.api.IInterpreter;

/**
 * The implementation of the {@link EEFText}.
 *
 * @author sbegaudeau
 */
public class EEFTextImpl extends AbstractEEFWidgetImpl implements EEFText {

	/**
	 * The description.
	 */
	private EEFTextDescription eefTextDescription;

	/**
	 * The parent.
	 */
	private EEFContainer eefContainer;

	/**
	 * The consumer of the value expression.
	 */
	private IConsumer<String> valueExpressionConsumer;

	/**
	 * The consumer of the label expression.
	 */
	private IConsumer<String> labelExpressionConsumer;

	/**
	 * The constructor.
	 *
	 * @param eefContainer
	 *            The parent of the widget
	 * @param eefTextDescription
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 */
	public EEFTextImpl(EEFContainer eefContainer, EEFTextDescription eefTextDescription, IVariableManager variableManager, IInterpreter interpreter) {
		super(variableManager, interpreter);
		this.eefTextDescription = eefTextDescription;
		this.eefContainer = eefContainer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFObject#createControl()
	 */
	@Override
	public void createControl() {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.internal.AbstractEEFChildObject#fireUpdatedInput()
	 */
	@Override
	public void fireUpdatedInput() {
		String valueExpression = this.eefTextDescription.getValueExpression();
		if (valueExpression != null) {
			IEvaluationResult evaluationResult = this.getInterpreter().evaluateExpression(this.getVariableManager().getVariables(), null,
					valueExpression);
			Object value = evaluationResult.getValue();
			if (value instanceof String && this.valueExpressionConsumer != null) {
				this.valueExpressionConsumer.apply((String) value);
			}
		}

		String labelExpression = this.eefTextDescription.getLabelExpression();
		if (labelExpression != null) {
			IEvaluationResult evaluationResult = this.getInterpreter().evaluateExpression(this.getVariableManager().getVariables(), null,
					labelExpression);
			Object value = evaluationResult.getValue();
			if (value instanceof String && this.labelExpressionConsumer != null) {
				this.labelExpressionConsumer.apply((String) value);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFText#updateValue(java.lang.String)
	 */
	@Override
	public void updateValue(String newValue) {
		String editExpression = this.eefTextDescription.getEditExpression();
		if (editExpression != null) {
			Map<String, Object> variables = new HashMap<String, Object>();
			variables.putAll(this.getVariableManager().getVariables());
			variables.put(EEFExpressionUtils.EEFText.NEW_VALUE, newValue);
			this.getInterpreter().evaluateExpression(variables, null, editExpression);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFText#addValueExpressionConsumer(org.eclipse.eef.core.api.IConsumer)
	 */
	@Override
	public void addValueExpressionConsumer(IConsumer<String> consumer) {
		this.valueExpressionConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFText#removeValueExpressionConsumer()
	 */
	@Override
	public void removeValueExpressionConsumer() {
		this.valueExpressionConsumer = null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFText#addLabelExpressionConsumer(org.eclipse.eef.core.api.IConsumer)
	 */
	@Override
	public void addLabelExpressionConsumer(IConsumer<String> consumer) {
		this.labelExpressionConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFText#removeLabelExpressionConsumer()
	 */
	@Override
	public void removeLabelExpressionConsumer() {
		this.labelExpressionConsumer = null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFText#getDescription()
	 */
	@Override
	public EEFTextDescription getDescription() {
		return this.eefTextDescription;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFChildObject#getParent()
	 */
	@Override
	public EEFContainer getParent() {
		return this.eefContainer;
	}
}
