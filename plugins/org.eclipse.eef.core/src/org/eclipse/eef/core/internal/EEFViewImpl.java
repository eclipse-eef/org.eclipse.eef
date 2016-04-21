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
import java.util.Iterator;
import java.util.List;

import org.eclipse.eef.EEFPageDescription;
import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.EEFView;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.IEEFDomainClassTester;
import org.eclipse.eef.core.api.InputDescriptor;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.utils.Eval;
import org.eclipse.emf.ecore.EObject;
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
	 * The editing context adapter.
	 */
	private EditingContextAdapter contextAdapter;

	/**
	 * The {@link EEFPage} of the view.
	 */
	private List<EEFPage> eefPages = new ArrayList<EEFPage>();

	/**
	 * The domain class tester.
	 */
	private IEEFDomainClassTester domainClassTester;

	/**
	 * The constructor.
	 *
	 * @param eefViewDescription
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param contextAdapter
	 *            The editing context adapter.
	 * @param domainClassTester
	 *            The domain class tester
	 */
	public EEFViewImpl(EEFViewDescription eefViewDescription, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter contextAdapter, IEEFDomainClassTester domainClassTester) {
		this.variableManager = variableManager;
		this.interpreter = interpreter;
		this.eefViewDescription = eefViewDescription;
		this.contextAdapter = contextAdapter;
		this.domainClassTester = domainClassTester;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFView#initialize()
	 */
	@Override
	public void initialize() {
		EEFCorePlugin.getPlugin().debug("EEFViewImpl#initialize()"); //$NON-NLS-1$
		for (final EEFPageDescription eefPageDescription : this.getDescription().getPages()) {
			String preconditionExpression = eefPageDescription.getPreconditionExpression();
			Boolean preconditionValid = new Eval(this.interpreter, this.variableManager).get(preconditionExpression, Boolean.class);
			if (preconditionValid == null || preconditionValid.booleanValue()) {
				String semanticCandidatesExpression = Util.firstNonBlank(eefPageDescription.getSemanticCandidateExpression(),
						org.eclipse.eef.core.api.EEFExpressionUtils.VAR_SELF);

				new Eval(this.interpreter, this.variableManager).call(semanticCandidatesExpression, new IConsumer<Object>() {
					@Override
					public void apply(Object value) {
						DomainClassPredicate domainClassPredicate = new DomainClassPredicate(eefPageDescription.getDomainClass(), domainClassTester);
						Iterable<EObject> iterable = Util.asIterable(value, EObject.class);
						Iterable<EObject> eObjects = Iterables.filter(iterable, domainClassPredicate);

						boolean isUnique = true;
						Iterator<EObject> iterator = eObjects.iterator();
						while (iterator.hasNext()) {
							EObject eObject = iterator.next();

							if (isUnique && iterator.hasNext()) {
								isUnique = false;
							}
							EEFPageImpl ePage = createPage(eefPageDescription, eObject, isUnique);
							ePage.initialize();
							EEFViewImpl.this.eefPages.add(ePage);
						}
					}
				});
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
	 * @param isUnique
	 *            Indicates if the page description used to create this page is "instantiated" only once or if the page
	 *            to create is on the several pages created from this description
	 * @return an actual {@link EEFPage} setup according to the description.
	 */
	private EEFPageImpl createPage(EEFPageDescription description, Object semanticCandidate, boolean isUnique) {
		IVariableManager childVariableManager = this.variableManager.createChild();
		if (semanticCandidate != null) {
			childVariableManager.put(EEFExpressionUtils.SELF, semanticCandidate);
		}
		return new EEFPageImpl(this, description, childVariableManager, this.interpreter, this.domainClassTester, isUnique);
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

			for (final EEFPage eefPage : this.eefPages) {
				String pageSemanticCandidateExpression = Util.firstNonBlank(eefPage.getDescription().getSemanticCandidateExpression(),
						org.eclipse.eef.core.api.EEFExpressionUtils.VAR_SELF);
				new Eval(this.interpreter, this.variableManager).call(pageSemanticCandidateExpression, new IConsumer<Object>() {
					@Override
					public void apply(Object value) {
						for (Object pageSemanticCandidate : Util.asIterable(value, Object.class)) {
							eefPage.getVariableManager().put(EEFExpressionUtils.SELF, pageSemanticCandidate);
						}
					}
				});

				List<EEFGroup> groups = eefPage.getGroups();
				for (final EEFGroup eefGroup : groups) {
					String groupSemanticCandidateExpression = Util.firstNonBlank(eefGroup.getDescription().getSemanticCandidateExpression(),
							org.eclipse.eef.core.api.EEFExpressionUtils.VAR_SELF);
					new Eval(this.interpreter, this.variableManager).call(groupSemanticCandidateExpression, new IConsumer<Object>() {
						@Override
						public void apply(Object value) {
							eefGroup.getVariableManager().put(EEFExpressionUtils.SELF, value);
						}
					});
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

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFView#getInterpreter()
	 */
	@Override
	public IInterpreter getInterpreter() {
		return this.interpreter;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFView#getVariableManager()
	 */
	@Override
	public IVariableManager getVariableManager() {
		return this.variableManager;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFView#getContextAdapter()
	 */
	@Override
	public EditingContextAdapter getContextAdapter() {
		return this.contextAdapter;
	}

}
