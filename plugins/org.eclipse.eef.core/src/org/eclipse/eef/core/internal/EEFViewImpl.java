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
package org.eclipse.eef.core.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.EEFPageDescription;
import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.EEFView;
import org.eclipse.eef.core.api.InputDescriptor;
import org.eclipse.eef.core.api.utils.Util;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
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
		for (EEFPageDescription eefPageDescription : this.getDescription().getPages()) {
			String semanticCandidatesExpression = Util.firstNonBlank(eefPageDescription.getSemanticCandidateExpression(), "var:self"); //$NON-NLS-1$
			Object candidates = Util.computeCandidate(this.interpreter, this.variableManager, semanticCandidatesExpression);

			if (candidates instanceof Iterable<?>) {
				@SuppressWarnings("unchecked")
				Iterable<Object> candidatesIter = (Iterable<Object>) candidates;
				for (Object candidate : candidatesIter) {
					EEFPageImpl ePage = createPage(eefPageDescription, candidate);
					ePage.initialize();
					this.eefPages.add(ePage);
				}
			} else if (candidates != null) {
				EEFPageImpl ePage = createPage(eefPageDescription, candidates);
				ePage.initialize();
				this.eefPages.add(ePage);
			}
		}
	}

	/**
	 * Create an {@link EEFPage} from its {@link EEFPageDescription description}.
	 *
	 * @param description
	 *            a page description
	 * @param semanticCandidate
	 *            page semantic candidate
	 * @return an actual {@link EEFPage} setup according to the description.
	 */
	private EEFPageImpl createPage(EEFPageDescription description, Object semanticCandidate) {
		IVariableManager childVariableManager = this.variableManager.createChild();
		if (semanticCandidate != null) {
			childVariableManager.put(EEFExpressionUtils.SELF, semanticCandidate);
		}
		return new EEFPageImpl(this, description, childVariableManager, this.interpreter, this.editingDomain);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFView#setInput(org.eclipse.eef.core.api.InputDescriptor)
	 */
	@Override
	public void setInput(InputDescriptor input) {
		Object selfValue = this.variableManager.getVariables().get(EEFExpressionUtils.SELF);
		EObject eObject = input.getSemanticElement();
		if (eObject != selfValue) {
			// Invalidate and update the content of the variable manager with the new input
			this.variableManager.clear();
			this.variableManager.put(EEFExpressionUtils.SELF, eObject);
			this.variableManager.put(EEFExpressionUtils.INPUT, input);

			for (EEFPage eefPage : this.eefPages) {
				String pageSemanticCandidateExpression = eefPage.getDescription().getSemanticCandidateExpression();
				if (!Util.isBlank(pageSemanticCandidateExpression)) {
					IEvaluationResult evaluationResult = this.interpreter.evaluateExpression(this.variableManager.getVariables(),
							pageSemanticCandidateExpression);
					if (evaluationResult.success()) {
						addSelfToPageVariableManager(eefPage, evaluationResult);
					} else {
						// Something is very wrong here...
					}
				}

				List<EEFGroup> groups = eefPage.getGroups();
				for (EEFGroup eefGroup : groups) {
					String groupSemanticCandidateExpression = eefGroup.getDescription().getSemanticCandidateExpression();
					if (!Util.isBlank(groupSemanticCandidateExpression)) {
						IEvaluationResult evaluationResult = this.interpreter.evaluateExpression(eefPage.getVariableManager().getVariables(),
								groupSemanticCandidateExpression);
						if (evaluationResult.success()) {
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
			// FIXME When you have evaluated the semanticCandidateExpression of the page once again, you need to update
			// the semantic candidates. For example:
			// Page 1, 2 and 3 have been created from the same Page definition (think one page for each feature of the
			// selected EClass). Page 4 and Page 5 have been created with a 1 to 1 mapping.
			// You need to refresh "self" for those 5 pages. Here you are iterating on each page and then using their
			// description to update their self. It won't work, for example, for the first page, the semantic candidate
			// expression will return 3 structural features.
			// Here you are iterating on said structural features and for each feature you are doing:
			// eefPage.getVariableManager().put("self", candidate)
			// Thus all the first 3 pages will now use the last structural feature as "self". What you need to do is
			// identify all the pages coming from the same definition and then reevaluate said definition in order to
			// have a new collection and then use each element of the collection to update the pages. The issue being
			// that while re-evaluating this semanticCandidateExpression, you may now have only 2 or 4
			// pageSemanticCandidates to use to update your 3 pages. This issue should be processed earlier because it
			// would trigger the creation of completely different Tab & Section descriptors which would cause the whole
			// view to be recreated from scratch.
			// All your update process for EEFPages need to be updated. It's not simple in any way or shape, I know.
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
