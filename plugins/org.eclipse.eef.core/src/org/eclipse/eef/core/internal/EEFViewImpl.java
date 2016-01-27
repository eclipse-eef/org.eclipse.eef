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
import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.EEFView;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IEvaluationResult;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * The implementation of the {@link EEFView}.
 *
 * @author sbegaudeau
 */
public class EEFViewImpl implements EEFView {
	/**
	 * The variable manager.
	 */
	private IVariableManager variableManager;

	/**
	 * The interpreter.
	 */
	private IInterpreter interpreter;

	/**
	 * The description.
	 */
	private EEFViewDescription eefViewDescription;

	/**
	 * The editing domain.
	 */
	private TransactionalEditingDomain editingDomain;

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
	 * @param editingDomain
	 *            The editing domain
	 */
	public EEFViewImpl(EEFViewDescription eefViewDescription, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain) {
		this.variableManager = variableManager;
		this.interpreter = interpreter;
		this.eefViewDescription = eefViewDescription;
		this.editingDomain = editingDomain;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFView#initialize()
	 */
	@Override
	public void initialize() {
		Command command = new RecordingCommand(this.editingDomain) {
			@Override
			protected void doExecute() {
				EEFViewImpl.this.doInitialize();
			}
		};

		CommandStack commandStack = this.editingDomain.getCommandStack();
		commandStack.execute(command);
	}

	/**
	 * Performs the initialization of the view by creating the necessary pages.
	 */
	private void doInitialize() {
		List<EEFPageDescription> eefPageDescriptions = EEFViewImpl.this.getDescription().getPages();
		for (EEFPageDescription eefPageDescription : eefPageDescriptions) {
			final String semanticCandidateExpression = eefPageDescription.getSemanticCandidateExpression();
			if (semanticCandidateExpression != null && semanticCandidateExpression.trim().length() > 0) {
				IEvaluationResult evaluationResult = EEFViewImpl.this.interpreter.evaluateExpression(EEFViewImpl.this.variableManager.getVariables(),
						semanticCandidateExpression);

				if (Diagnostic.OK == evaluationResult.getDiagnostic().getSeverity() && evaluationResult.getValue() != null) {
					if (evaluationResult.getValue() instanceof Iterable<?>) {
						@SuppressWarnings("unchecked")
						Iterable<Object> viewSemanticCandidates = (Iterable<Object>) evaluationResult.getValue();
						for (Object viewSemanticCandidate : viewSemanticCandidates) {
							IVariableManager childVariableManager = this.variableManager.createChild();
							childVariableManager.put(EEFExpressionUtils.SELF, viewSemanticCandidate);
							EEFPageImpl ePage = new EEFPageImpl(EEFViewImpl.this, eefPageDescription, childVariableManager,
									EEFViewImpl.this.interpreter, EEFViewImpl.this.editingDomain);
							ePage.initialize();
							eefPages.add(ePage);
						}
					} else {
						IVariableManager childVariableManager = EEFViewImpl.this.variableManager.createChild();
						childVariableManager.put(EEFExpressionUtils.SELF, evaluationResult.getValue());
						EEFPageImpl ePage = new EEFPageImpl(EEFViewImpl.this, eefPageDescription, childVariableManager, EEFViewImpl.this.interpreter,
								EEFViewImpl.this.editingDomain);
						ePage.initialize();
						eefPages.add(ePage);
					}

				}
			} else {
				EEFPageImpl ePage = new EEFPageImpl(EEFViewImpl.this, eefPageDescription, EEFViewImpl.this.variableManager.createChild(),
						EEFViewImpl.this.interpreter, EEFViewImpl.this.editingDomain);
				ePage.initialize();
				eefPages.add(ePage);
			}

		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFView#setInput(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public void setInput(EObject eObject) {
		Object selfValue = this.variableManager.getVariables().get(EEFExpressionUtils.SELF);
		if (eObject != selfValue) {
			// Invalidate and update the content of the variable manager with the new input
			this.variableManager.clear();

			this.variableManager.put(EEFExpressionUtils.SELF, eObject);

			for (EEFPage eefPage : eefPages) {
				String pageSemanticCandidateExpression = eefPage.getDescription().getSemanticCandidateExpression();

				if (pageSemanticCandidateExpression != null && pageSemanticCandidateExpression.trim().length() > 0) {
					IEvaluationResult evaluationResult = EEFViewImpl.this.interpreter.evaluateExpression(
							EEFViewImpl.this.variableManager.getVariables(), pageSemanticCandidateExpression);
					if (Diagnostic.OK == evaluationResult.getDiagnostic().getSeverity() && evaluationResult.getValue() != null) {
						addSelfToPageVariableManager(eefPage, evaluationResult);
					} else {
						// Something is very wrong here...
					}
				}

				List<EEFGroup> groups = eefPage.getGroups();
				for (EEFGroup eefGroup : groups) {
					String groupSemanticCandidateExpression = eefGroup.getDescription().getSemanticCandidateExpression();
					if (groupSemanticCandidateExpression != null && groupSemanticCandidateExpression.trim().length() > 0) {

						IEvaluationResult evaluationResult = EEFViewImpl.this.interpreter.evaluateExpression(eefPage.getVariableManager()
								.getVariables(), groupSemanticCandidateExpression);
						if (Diagnostic.OK == evaluationResult.getDiagnostic().getSeverity() && evaluationResult.getValue() != null) {
							eefGroup.getVariableManager().put(EEFExpressionUtils.SELF, evaluationResult.getValue());
						} else {
							// Something is very wrong here...
						}
					}
				}
			}
		}
	}

	/**
	 * Register the 'self' variable to the page variable manager.
	 *
	 * @param eefPage
	 *            The page
	 * @param evaluationResult
	 *            The evaluation result
	 */
	private void addSelfToPageVariableManager(EEFPage eefPage, IEvaluationResult evaluationResult) {
		if (evaluationResult.getValue() instanceof Iterable<?>) {
			@SuppressWarnings("unchecked")
			Iterable<Object> pageSemanticCandidates = (Iterable<Object>) evaluationResult.getValue();
			for (Object pageSemanticCandidate : pageSemanticCandidates) {
				eefPage.getVariableManager().put(EEFExpressionUtils.SELF, pageSemanticCandidate);
			}
		} else {
			eefPage.getVariableManager().put(EEFExpressionUtils.SELF, evaluationResult.getValue());
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
