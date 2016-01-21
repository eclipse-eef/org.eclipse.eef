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
			EEFPageImpl ePage = createPage(eefPageDescription);
			if (ePage != null) {
				ePage.initialize();
				this.eefPages.add(ePage);
			}
		}
	}

	/**
	 * Create an {@link EEFPage} from its {@link EEFPageDescription description}.
	 *
	 * @param description
	 *            a page description.
	 * @return an actual {@link EEFPage} setup according to the description.
	 */
	private EEFPageImpl createPage(EEFPageDescription description) {
		Object candidate = Util.computeCandidate(this.interpreter, this.variableManager, description.getSemanticCandidateExpression());
		IVariableManager childVariableManager = this.variableManager.createChild();
		if (candidate != null) {
			childVariableManager.put(EEFExpressionUtils.SELF, candidate);
		}
		return new EEFPageImpl(this, description, childVariableManager, this.interpreter, this.editingDomain);
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

			for (EEFPage eefPage : this.eefPages) {
				String pageSemanticCandidateExpression = eefPage.getDescription().getSemanticCandidateExpression();
				if (!Util.isBlank(pageSemanticCandidateExpression)) {
					IEvaluationResult evaluationResult = this.interpreter.evaluateExpression(this.variableManager.getVariables(),
							pageSemanticCandidateExpression);
					if (evaluationResult.success()) {
						eefPage.getVariableManager().put(EEFExpressionUtils.SELF, evaluationResult.getValue());
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
