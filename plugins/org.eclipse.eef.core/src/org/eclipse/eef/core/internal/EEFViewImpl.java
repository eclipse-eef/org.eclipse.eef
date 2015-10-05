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

import org.eclipse.eef.EEFPageDescription;
import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.EEFView;
import org.eclipse.eef.core.api.IVariableManager;
import org.eclipse.eef.interpreter.api.IEvaluationResult;
import org.eclipse.eef.interpreter.api.IInterpreter;
import org.eclipse.emf.common.util.Diagnostic;

/**
 * The implementation of the {@link EEFView}.
 *
 * @author sbegaudeau
 */
public class EEFViewImpl extends AbstractEEFObject implements EEFView {

	/**
	 * The description.
	 */
	private EEFViewDescription eefViewDescription;

	/**
	 * The {@link EEFPage} of the view.
	 */
	private List<EEFPage> eefPages = new ArrayList<EEFPage>();

	/**
	 * The constructor.
	 *
	 * @param eefViewDescription
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 */
	public EEFViewImpl(EEFViewDescription eefViewDescription, IVariableManager variableManager, IInterpreter interpreter) {
		super(variableManager, interpreter);
		this.eefViewDescription = eefViewDescription;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFObject#createControl()
	 */
	@Override
	public void createControl() {
		List<EEFPageDescription> eefPageDescriptions = this.getDescription().getPages();
		for (EEFPageDescription eefPageDescription : eefPageDescriptions) {
			IVariableManager childVariableManager = this.getVariableManager().createChild();

			final String semanticCandidateExpression = eefPageDescription.getSemanticCandidateExpression();
			if (semanticCandidateExpression != null && semanticCandidateExpression.trim().length() > 0) {
				IEvaluationResult evaluationResult = this.getInterpreter().evaluateExpression(this.getVariableManager().getVariables(), null,
						semanticCandidateExpression);
				if (Diagnostic.OK == evaluationResult.getDiagnostic().getSeverity()) {
					childVariableManager.put(EEFExpressionUtils.EEFPage.PAGE_SEMANTIC_CANDIDATE, evaluationResult.getValue());
				}
			}

			EEFPageImpl ePage = new EEFPageImpl(this, eefPageDescription, childVariableManager, this.getInterpreter());
			ePage.createControl();
			eefPages.add(ePage);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFView#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object object) {
		this.getVariableManager().put(EEFExpressionUtils.EEFView.VIEW_SEMANTIC_CANDIDATE, object);
		for (EEFPage eefPage : this.eefPages) {
			if (eefPage instanceof EEFPageImpl) {
				EEFPageImpl eefPageImpl = (EEFPageImpl) eefPage;
				eefPageImpl.fireUpdatedInput();
			}
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFView#getPages()
	 */
	@Override
	public List<EEFPage> getPages() {
		return this.eefPages;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFView#getDescription()
	 */
	@Override
	public EEFViewDescription getDescription() {
		return this.eefViewDescription;
	}
}
