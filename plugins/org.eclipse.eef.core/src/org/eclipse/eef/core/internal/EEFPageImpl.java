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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFPageDescription;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.EEFView;
import org.eclipse.eef.core.api.IVariableManager;
import org.eclipse.eef.interpreter.api.IEvaluationResult;
import org.eclipse.eef.interpreter.api.IInterpreter;

/**
 * The implementation of the {@link EEFPage}.
 *
 * @author sbegaudeau
 */
public class EEFPageImpl extends AbstractEEFChildObject implements EEFPage {

	/**
	 * The containing {@link EEFView}.
	 */
	private EEFView eefView;

	/**
	 * The description.
	 */
	private EEFPageDescription eefPageDescription;

	/**
	 * The {@link EEFGroup}.
	 */
	private List<EEFGroup> eefGroups = new ArrayList<EEFGroup>();

	/**
	 * The constructor.
	 *
	 * @param eefView
	 *            The containing {@link EEFView}
	 * @param eefPageDescription
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 */
	public EEFPageImpl(EEFView eefView, EEFPageDescription eefPageDescription, IVariableManager variableManager, IInterpreter interpreter) {
		super(variableManager, interpreter);
		this.eefView = eefView;
		this.eefPageDescription = eefPageDescription;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFObject#createControl()
	 */
	@Override
	public void createControl() {
		List<EEFGroupDescription> eefGroupDescriptions = this.eefPageDescription.getGroups();
		for (EEFGroupDescription eefGroupDescription : eefGroupDescriptions) {
			String semanticCandidatesExpression = eefGroupDescription.getSemanticCandidatesExpression();
			if (semanticCandidatesExpression != null && semanticCandidatesExpression.trim().length() > 0) {
				IEvaluationResult evaluationResult = this.getInterpreter().evaluateExpression(this.getVariableManager().getVariables(), null,
						semanticCandidatesExpression);
				if (evaluationResult.getValue() instanceof Iterable<?>) {
					@SuppressWarnings("unchecked")
					Iterable<Object> groupSemanticCandidates = (Iterable<Object>) evaluationResult.getValue();
					for (Object groupSemanticCandidate : groupSemanticCandidates) {
						IVariableManager childVariableManager = this.getVariableManager().createChild();
						childVariableManager.put(EEFExpressionUtils.EEFGroup.GROUP_SEMANTIC_CANDIDATE, groupSemanticCandidate);
						EEFGroupImpl eefGroupImpl = new EEFGroupImpl(this, eefGroupDescription, childVariableManager, this.getInterpreter());
						eefGroupImpl.createControl();
						eefGroups.add(eefGroupImpl);
					}
				} else {
					Object groupSemanticCandidate = evaluationResult.getValue();
					IVariableManager childVariableManager = this.getVariableManager().createChild();
					childVariableManager.put(EEFExpressionUtils.EEFGroup.GROUP_SEMANTIC_CANDIDATE, groupSemanticCandidate);
					EEFGroupImpl eefGroupImpl = new EEFGroupImpl(this, eefGroupDescription, childVariableManager, this.getInterpreter());
					eefGroupImpl.createControl();
					eefGroups.add(eefGroupImpl);
				}
			} else {
				IVariableManager childVariableManager = this.getVariableManager().createChild();
				EEFGroupImpl eefGroupImpl = new EEFGroupImpl(this, eefGroupDescription, childVariableManager, this.getInterpreter());
				eefGroupImpl.createControl();
				eefGroups.add(eefGroupImpl);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.internal.AbstractEEFChildObject#fireUpdatedInput()
	 */
	@Override
	public void fireUpdatedInput() {
		for (EEFGroup eefGroup : this.eefGroups) {
			if (eefGroup instanceof EEFGroupImpl) {
				EEFGroupImpl eefGroupImpl = (EEFGroupImpl) eefGroup;
				eefGroupImpl.fireUpdatedInput();
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFPage#getLabel()
	 */
	@Override
	public String getLabel() {
		String labelExpression = this.eefPageDescription.getLabelExpression();
		if (labelExpression != null) {
			IEvaluationResult evaluationResult = this.getInterpreter().evaluateExpression(this.getVariableManager().getVariables(), null,
					labelExpression);
			if (evaluationResult.getValue() != null) {
				return evaluationResult.getValue().toString();
			}
		}
		return labelExpression;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFPage#getGroups()
	 */
	@Override
	public List<EEFGroup> getGroups() {
		return this.eefGroups;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFPage#getDescription()
	 */
	@Override
	public EEFPageDescription getDescription() {
		return this.eefPageDescription;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFChildObject#getParent()
	 */
	@Override
	public EEFView getParent() {
		return this.eefView;
	}

}
