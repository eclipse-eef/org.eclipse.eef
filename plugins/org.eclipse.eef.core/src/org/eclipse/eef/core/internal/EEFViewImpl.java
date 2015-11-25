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
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IEvaluationResult;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;

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
	 * The editing domain.
	 */
	private TransactionalEditingDomain editingDomain;

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
		super(variableManager, interpreter);
		this.eefViewDescription = eefViewDescription;
		this.editingDomain = editingDomain;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFObject#createControl()
	 */
	@Override
	public void createControl() {
		Command command = new RecordingCommand(this.editingDomain) {
			@Override
			protected void doExecute() {
				List<EEFPageDescription> eefPageDescriptions = EEFViewImpl.this.getDescription().getPages();
				for (EEFPageDescription eefPageDescription : eefPageDescriptions) {
					IVariableManager childVariableManager = EEFViewImpl.this.getVariableManager().createChild();

					final String semanticCandidateExpression = eefPageDescription.getSemanticCandidateExpression();
					if (semanticCandidateExpression != null && semanticCandidateExpression.trim().length() > 0) {

						IEvaluationResult evaluationResult = EEFViewImpl.this.getInterpreter().evaluateExpression(
								EEFViewImpl.this.getVariableManager().getVariables(), semanticCandidateExpression);
						if (Diagnostic.OK == evaluationResult.getDiagnostic().getSeverity()) {
							childVariableManager.put(EEFExpressionUtils.EEFPage.PAGE_SEMANTIC_CANDIDATE, evaluationResult.getValue());
						}
					}

					EEFPageImpl ePage = new EEFPageImpl(EEFViewImpl.this, eefPageDescription, childVariableManager,
							EEFViewImpl.this.getInterpreter(), EEFViewImpl.this.editingDomain);
					ePage.createControl();
					eefPages.add(ePage);
				}
			}
		};

		this.editingDomain.addResourceSetListener(new ResourceSetListenerImpl(NotificationFilter.NOT_TOUCH) {
			@Override
			public void resourceSetChanged(ResourceSetChangeEvent event) {
				for (EEFPage eefPage : EEFViewImpl.this.eefPages) {
					if (eefPage instanceof EEFPageImpl) {
						EEFPageImpl eefPageImpl = (EEFPageImpl) eefPage;
						//System.out.println("Resource Set changed: " + event); //$NON-NLS-1$
						eefPageImpl.setInput(null);
					}
				}
			}

			@Override
			public boolean isPostcommitOnly() {
				return true;
			}
		});

		CommandStack commandStack = this.editingDomain.getCommandStack();
		commandStack.execute(command);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFObject#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object object) {
		this.getVariableManager().put(EEFExpressionUtils.EEFView.VIEW_SEMANTIC_CANDIDATE, object);
		for (EEFPage eefPage : this.eefPages) {
			if (eefPage instanceof EEFPageImpl) {
				EEFPageImpl eefPageImpl = (EEFPageImpl) eefPage;
				eefPageImpl.setInput(null);
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
