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

import com.google.common.collect.Iterables;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFPageDescription;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.core.api.EEFDomainClassTester;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.EEFView;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * The implementation of the {@link EEFPage}.
 *
 * @author sbegaudeau
 */
public class EEFPageImpl implements EEFPage {
	/**
	 * The variable manager.
	 */
	private IVariableManager variableManager;

	/**
	 * The interpreter.
	 */
	private IInterpreter interpreter;

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
	 * The editing domain.
	 */
	private TransactionalEditingDomain editingDomain;

	/**
	 * The domain class tester.
	 */
	private EEFDomainClassTester domainClassTester;

	/**
	 * Indicates if the description of this page has been instantiated multiple times.
	 */
	private boolean isUnique;

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
	 * @param editingDomain
	 *            The editing domain
	 * @param domainClassTester
	 *            The domain class tester
	 * @param isUnique
	 *            Indicates if the description from this page has been instantiated multiple times
	 */
	public EEFPageImpl(EEFView eefView, EEFPageDescription eefPageDescription, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain, EEFDomainClassTester domainClassTester, boolean isUnique) {
		this.variableManager = variableManager;
		this.interpreter = interpreter;
		this.eefView = eefView;
		this.eefPageDescription = eefPageDescription;
		this.editingDomain = editingDomain;
		this.domainClassTester = domainClassTester;
		this.isUnique = isUnique;
	}

	/**
	 * Initialize the variables of the EEFPage.
	 */
	public void initialize() {
		EEFCorePlugin.getPlugin().debug("EEFPageImpl#initialize()"); //$NON-NLS-1$
		for (final EEFGroupDescription eefGroupDescription : eefPageDescription.getGroups()) {
			String semanticCandidatesExpression = Util.firstNonBlank(eefGroupDescription.getSemanticCandidateExpression(),
					org.eclipse.eef.core.api.EEFExpressionUtils.VAR_SELF);

			new Eval(this.interpreter, this.variableManager).call(semanticCandidatesExpression, new IConsumer<Object>() {
				@Override
				public void apply(Object value) {
					DomainClassPredicate domainClassPredicate = new DomainClassPredicate(eefGroupDescription.getDomainClass(), eefView
							.getDescription().getEPackages(), domainClassTester);
					Iterable<EObject> iterable = Util.asIterable(value, EObject.class);
					Iterable<EObject> eObjects = Iterables.filter(iterable, domainClassPredicate);
					for (EObject eObject : eObjects) {
						IVariableManager childVariableManager = EEFPageImpl.this.getVariableManager().createChild();
						childVariableManager.put(EEFExpressionUtils.SELF, eObject);
						EEFGroupImpl eefGroupImpl = new EEFGroupImpl(EEFPageImpl.this, eefGroupDescription, childVariableManager, interpreter,
								editingDomain);
						eefGroups.add(eefGroupImpl);
					}
				}
			});
		}
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
	 * @see org.eclipse.eef.core.api.EEFPage#getView()
	 */
	@Override
	public EEFView getView() {
		return this.eefView;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFPage#getVariableManager()
	 */
	@Override
	public IVariableManager getVariableManager() {
		return this.variableManager;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFPage#getInterpreter()
	 */
	@Override
	public IInterpreter getInterpreter() {
		return this.interpreter;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFPage#isUnique()
	 */
	@Override
	public boolean isUnique() {
		return this.isUnique;
	}

}
