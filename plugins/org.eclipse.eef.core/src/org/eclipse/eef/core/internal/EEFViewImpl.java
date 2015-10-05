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

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.eef.EEFPageDescription;
import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.EEFView;
import org.eclipse.eef.core.api.IEEFContext;
import org.eclipse.eef.interpreter.api.IEvaluationResult;
import org.eclipse.eef.interpreter.api.IInterpreter;
import org.eclipse.eef.interpreter.api.IInterpreterContext;
import org.eclipse.eef.interpreter.api.IInterpreterProvider;
import org.eclipse.emf.common.util.Diagnostic;

/**
 * The implementation of the {@link EEFView}.
 *
 * @author sbegaudeau
 */
public class EEFViewImpl implements EEFView {

	/**
	 * The description.
	 */
	private EEFViewDescription eefViewDescription;

	/**
	 * The context.
	 */
	private IEEFContext eefContext;

	/**
	 * The contrsuctor.
	 *
	 * @param eefViewDescription
	 *            The description
	 * @param eefContext
	 *            The context
	 */
	public EEFViewImpl(EEFViewDescription eefViewDescription, IEEFContext eefContext) {
		this.eefViewDescription = eefViewDescription;
		this.eefContext = eefContext;
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

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFView#getPages()
	 */
	@Override
	public List<EEFPage> getPages() {
		List<EEFPage> ePages = new ArrayList<EEFPage>();

		List<EEFPageDescription> eefPageDescriptions = this.eefViewDescription.getPages();
		for (EEFPageDescription eefPageDescription : eefPageDescriptions) {
			final String semanticCandidateExpression = eefPageDescription.getSemanticCandidateExpression();

			Predicate<IInterpreterProvider> canHandleExpressionPredicate = new Predicate<IInterpreterProvider>() {
				@Override
				public boolean apply(IInterpreterProvider interpreterProvider) {
					return interpreterProvider.canHandle(semanticCandidateExpression);
				}
			};
			Optional<IInterpreterProvider> optionalInterpreterProvider = Iterables.tryFind(this.eefContext.getInterpreterProviders(),
					canHandleExpressionPredicate);
			if (optionalInterpreterProvider.isPresent()) {
				IInterpreterProvider interpreterProvider = optionalInterpreterProvider.get();
				IInterpreter interpreter = interpreterProvider.createInterpreter();

				IInterpreterContext interpreterContext = new IInterpreterContext() {
					@Override
					public Map<String, Object> getParameters() {
						Map<String, Object> parameters = new HashMap<String, Object>();
						parameters.putAll(EEFViewImpl.this.eefContext.getVariableManager().getVariables());
						return parameters;
					}
				};

				IEvaluationResult evaluationResult = interpreter.evaluateExpression(interpreterContext, semanticCandidateExpression);
				if (Diagnostic.OK == evaluationResult.getDiagnostic().getSeverity()) {
					Object value = evaluationResult.getValue();

					// Use value as the semantic candidate variable of the EEFPage created

					EEFPage ePage = new EEFPageImpl(this, eefPageDescription);
					ePages.add(ePage);
				}
			}
		}

		return ePages;
	}

}
