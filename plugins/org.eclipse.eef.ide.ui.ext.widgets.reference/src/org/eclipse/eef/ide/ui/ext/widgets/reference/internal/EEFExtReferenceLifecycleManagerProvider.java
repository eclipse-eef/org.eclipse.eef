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
package org.eclipse.eef.ide.ui.ext.widgets.reference.internal;

import java.util.Collection;

import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.common.interpreter.api.IEvaluationResult;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * The lifecycle manager provider is used to create a lifecycle manager for the simple reference widget.
 *
 * @author sbegaudeau
 */
public class EEFExtReferenceLifecycleManagerProvider implements IEEFLifecycleManagerProvider {

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider#canHandle(org.eclipse.eef.EEFControlDescription)
	 */
	@Override
	public boolean canHandle(EEFControlDescription controlDescription) {
		return controlDescription instanceof EEFExtReferenceDescription;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider#getLifecycleManager(org.eclipse.eef.EEFControlDescription,
	 *      org.eclipse.sirius.common.interpreter.api.IVariableManager,
	 *      org.eclipse.sirius.common.interpreter.api.IInterpreter, org.eclipse.eef.core.api.EditingContextAdapter)
	 */
	@Override
	public IEEFLifecycleManager getLifecycleManager(EEFControlDescription controlDescription, IVariableManager variableManager,
			IInterpreter interpreter, EditingContextAdapter contextAdapter) {
		if (!(controlDescription instanceof EEFExtReferenceDescription)
				|| Util.isBlank(((EEFExtReferenceDescription) controlDescription).getReferenceNameExpression())) {
			return null;
		}

		IEEFLifecycleManager lifecycleManager = null;
		EEFExtReferenceDescription description = (EEFExtReferenceDescription) controlDescription;

		EObject semanticCandidate = this.getSemanticCandidate(description, interpreter, variableManager);
		String referenceName = this.getReferenceName(description, interpreter, variableManager);
		if (semanticCandidate != null && !Util.isBlank(referenceName)) {
			EStructuralFeature eStructuralFeature = semanticCandidate.eClass().getEStructuralFeature(referenceName);
			if (eStructuralFeature instanceof EReference) {
				EReference eReference = (EReference) eStructuralFeature;
				if (eReference.isMany()) {
					lifecycleManager = new EEFExtMultipleReferenceLifecycleManager(description, semanticCandidate, eReference, variableManager,
							interpreter, contextAdapter);
				} else {
					lifecycleManager = new EEFExtSingleReferenceLifecycleManager(description, semanticCandidate, eReference, variableManager,
							interpreter, contextAdapter);
				}
			}
		}
		return lifecycleManager;
	}

	/**
	 * Returns the semantic candidate to use as the current object.
	 *
	 * @param description
	 *            The description
	 * @param interpreter
	 *            The interpreter
	 * @param variableManager
	 *            The variable manager
	 * @return The semantic candidate
	 */
	private EObject getSemanticCandidate(EEFExtReferenceDescription description, IInterpreter interpreter, IVariableManager variableManager) {
		EObject self = null;
		if (!Util.isBlank(description.getSemanticCandidateExpression())) {
			IEvaluationResult result = interpreter.evaluateExpression(variableManager.getVariables(), description.getSemanticCandidateExpression());
			if (result.success()) {
				Collection<EObject> eObjects = result.asEObjects();
				if (eObjects.size() > 0) {
					self = eObjects.iterator().next();
				}
			}
		} else {
			Object selfVariable = variableManager.getVariables().get(EEFExpressionUtils.SELF);
			if (selfVariable instanceof EObject) {
				self = (EObject) selfVariable;
			}
		}

		return self;
	}

	/**
	 * Returns the name of the reference to use.
	 *
	 * @param description
	 *            The description
	 * @param interpreter
	 *            The interpreter
	 * @param variableManager
	 *            The variable manager
	 * @return The name of the reference
	 */
	private String getReferenceName(EEFExtReferenceDescription description, IInterpreter interpreter, IVariableManager variableManager) {
		IEvaluationResult evaluationResult = interpreter.evaluateExpression(variableManager.getVariables(), description.getReferenceNameExpression());
		if (evaluationResult.success()) {
			return evaluationResult.asString();
		}
		return ""; //$NON-NLS-1$
	}

}
