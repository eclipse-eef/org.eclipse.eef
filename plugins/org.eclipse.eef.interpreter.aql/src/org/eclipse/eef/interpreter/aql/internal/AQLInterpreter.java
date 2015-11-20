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
package org.eclipse.eef.interpreter.aql.internal;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.text.MessageFormat;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.eclipse.acceleo.query.runtime.EvaluationResult;
import org.eclipse.acceleo.query.runtime.IQueryBuilderEngine;
import org.eclipse.acceleo.query.runtime.IQueryBuilderEngine.AstResult;
import org.eclipse.acceleo.query.runtime.IQueryEnvironment;
import org.eclipse.acceleo.query.runtime.IQueryEvaluationEngine;
import org.eclipse.acceleo.query.runtime.InvalidAcceleoPackageException;
import org.eclipse.acceleo.query.runtime.Query;
import org.eclipse.acceleo.query.runtime.QueryEvaluation;
import org.eclipse.acceleo.query.runtime.QueryParsing;
import org.eclipse.eef.interpreter.api.IEvaluationResult;
import org.eclipse.eef.interpreter.api.IInterpreter;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

/**
 * The AQL {@link IInterpreter}.
 *
 * @author sbegaudeau
 */
public class AQLInterpreter implements IInterpreter {

	/**
	 * The query environment.
	 */
	private IQueryEnvironment queryEnvironment;

	/**
	 * The cache of the expressions parsed.
	 */
	private LoadingCache<String, AstResult> parsedExpressions;

	/**
	 * The constructor.
	 */
	public AQLInterpreter() {
		this.queryEnvironment = Query.newEnvironmentWithDefaultServices(null);
		this.queryEnvironment.registerEPackage(EcorePackage.eINSTANCE);
		this.queryEnvironment.registerCustomClassMapping(EcorePackage.eINSTANCE.getEStringToStringMapEntry(), EStringToStringMapEntryImpl.class);
		try {
			this.queryEnvironment.registerServicePackage(DefaultEEFServices.class);
		} catch (InvalidAcceleoPackageException e) {
			String message = MessageFormat.format(Messages.AQLInterpreter_errorRegistrationService, DefaultEEFServices.class.getSimpleName());
			AQLInterpreterPlugin.getImplementation().logError(message, e);
		}
		this.initExpressionsCache();
	}

	/**
	 * Initialize the expression cache.
	 */
	private void initExpressionsCache() {
		final IQueryBuilderEngine builder = QueryParsing.newBuilder(queryEnvironment);
		final int cacheSize = 500;
		this.parsedExpressions = CacheBuilder.newBuilder().maximumSize(cacheSize).build(new CacheLoader<String, AstResult>() {

			@Override
			public AstResult load(String key) throws Exception {
				return builder.build(key);
			}

		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.interpreter.api.IInterpreter#evaluateExpression(java.util.Map, java.lang.String)
	 */
	@Override
	public IEvaluationResult evaluateExpression(Map<String, Object> variables, String expressionBody) {
		String body = expressionBody.substring(IAQLConstants.AQL_PREFIX.length());
		try {
			AstResult astResult = this.parsedExpressions.get(body);
			IQueryEvaluationEngine evaluationEngine = QueryEvaluation.newEngine(queryEnvironment);
			final EvaluationResult evalResult = evaluationEngine.eval(astResult, variables);
			return new AQLEvaluationResult(evalResult.getResult(), evalResult.getDiagnostic());
		} catch (ExecutionException e) {
			String message = MessageFormat.format(Messages.AQLInterpreter_errorCreateAST, body);
			AQLInterpreterPlugin.getImplementation().logError(message, e);
		}
		String message = MessageFormat.format(Messages.AQLInterpreter_errorEvaluation, body);
		Diagnostic error = new BasicDiagnostic(Diagnostic.ERROR, AQLInterpreterPlugin.PLUGIN_ID, 0, message, new Object[0]);
		return new AQLEvaluationResult(null, error);
	}

}
