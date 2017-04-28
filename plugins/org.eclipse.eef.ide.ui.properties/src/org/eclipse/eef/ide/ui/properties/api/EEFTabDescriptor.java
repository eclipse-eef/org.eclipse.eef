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
package org.eclipse.eef.ide.ui.properties.api;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.EEFDynamicMappingFor;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.properties.ui.api.AbstractEEFTabDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * The implementation of the {@link AbstractEEFTabDescriptor} using the {@link EEFPage}.
 *
 * @author sbegaudeau
 */
public class EEFTabDescriptor extends AbstractEEFTabDescriptor {
	/**
	 * The label used by default.
	 */
	private static final String DEFAULT_PAGE_LABEL = "General"; //$NON-NLS-1$

	/**
	 * The {@link EEFPage}.
	 */
	private EEFPage eefPage;

	/**
	 * The constructor.
	 *
	 * @param eefPage
	 *            The EEFPage
	 */
	public EEFTabDescriptor(EEFPage eefPage) {
		super();
		this.eefPage = eefPage;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFTabDescriptor#getId()
	 */
	@Override
	public String getId() {
		// FIXME [SBE] I am commenting this code because while it's better it breaks the live edition in the workspace
		// if (this.eefPage.isUnique()) {
		// return this.eefPage.getDescription().getIdentifier();
		// }

		StringBuilder identifier = new StringBuilder();

		identifier.append(this.eefPage.getDescription().getIdentifier());
		List<EEFGroup> groups = this.eefPage.getGroups();
		for (EEFGroup eefGroup : groups) {
			identifier.append(eefGroup.getDescription().getIdentifier());

			Object groupSemanticElement = eefGroup.getVariableManager().getVariables().get(EEFExpressionUtils.SELF);
			if (groupSemanticElement instanceof EObject) {
				identifier.append(EcoreUtil.getURI((EObject) groupSemanticElement));
			}
			identifier.append(groupSemanticElement.hashCode());
		}

		// @formatter:off
		groups.stream().map(EEFGroup::getDescription)
			.flatMap(description -> description.getControls().stream())
			.filter(EEFDynamicMappingFor.class::isInstance)
			.findFirst()
			.ifPresent(control -> identifier.append(System.currentTimeMillis()));
		// @formatter:on

		Object pageSemanticElement = this.eefPage.getVariableManager().getVariables().get(EEFExpressionUtils.SELF);
		if (pageSemanticElement instanceof EObject) {
			identifier.append(EcoreUtil.getURI((EObject) pageSemanticElement));
		}
		identifier.append(System.identityHashCode(pageSemanticElement));
		return identifier.toString();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFTabDescriptor#getLabel()
	 */
	@Override
	public String getLabel() {
		String labelExpression = this.eefPage.getDescription().getLabelExpression();
		EAttribute eAttribute = EefPackage.Literals.EEF_PAGE_DESCRIPTION__LABEL_EXPRESSION;

		return EvalFactory.of(this.eefPage.getInterpreter(), this.eefPage.getVariableManager()).logIfBlank(eAttribute).logIfInvalidType(String.class)
				.defaultValue(DEFAULT_PAGE_LABEL).evaluate(labelExpression);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.AbstractEEFTabDescriptor#getSectionDescriptors()
	 */
	@Override
	public List<IEEFSectionDescriptor> getSectionDescriptors() {
		List<IEEFSectionDescriptor> sectionDescriptors = new ArrayList<IEEFSectionDescriptor>();
		sectionDescriptors.add(new EEFSectionDescriptor(this.eefPage));
		return sectionDescriptors;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.AbstractEEFTabDescriptor#getCategory()
	 */
	@Override
	public String getCategory() {
		return "EEF"; //$NON-NLS-1$
	}

}
