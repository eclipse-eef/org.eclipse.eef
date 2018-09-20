/*******************************************************************************
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.properties.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.EEFDynamicMappingFor;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ide.ui.properties.internal.RefreshIdsHolder;
import org.eclipse.eef.properties.ui.api.AbstractEEFTabDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

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
		StringBuilder identifier = new StringBuilder();

		identifier.append(this.eefPage.getDescription().getIdentifier());
		List<EEFGroup> groups = this.eefPage.getGroups();
		for (EEFGroup eefGroup : groups) {
			identifier.append(eefGroup.getDescription().getIdentifier());

			Object groupSemanticElement = eefGroup.getVariableManager().getVariables().get(EEFExpressionUtils.SELF);
			if (groupSemanticElement instanceof EObject) {
				identifier.append(this.getIdForEObject((EObject) groupSemanticElement));
			}
			identifier.append(groupSemanticElement.hashCode());
		}

		// @formatter:off
		groups.stream().map(EEFGroup::getDescription)
			.flatMap(description -> description.getControls().stream().flatMap(this::getDynamicMappingFors))
			.filter(EEFDynamicMappingFor::isForceRefresh)
			.findFirst()
			.ifPresent(control -> identifier.append(System.currentTimeMillis()));
		// @formatter:on

		Object pageSemanticElement = this.eefPage.getVariableManager().getVariables().get(EEFExpressionUtils.SELF);
		if (pageSemanticElement instanceof EObject) {
			identifier.append(this.getIdForEObject((EObject) pageSemanticElement));
		}
		identifier.append(System.identityHashCode(pageSemanticElement));
		return identifier.toString();
	}

	/**
	 * Returns recursively a stream of the dynamic mappings for the given control.
	 *
	 * @param eefControlDescription
	 *            The description of the control
	 * @return The stream of the dynamic mapping
	 */
	private Stream<EEFDynamicMappingFor> getDynamicMappingFors(EEFControlDescription eefControlDescription) {
		Stream<EEFDynamicMappingFor> stream = Stream.empty();

		if (eefControlDescription instanceof EEFDynamicMappingFor) {
			stream = Stream.of((EEFDynamicMappingFor) eefControlDescription);
		} else if (eefControlDescription instanceof EEFContainerDescription) {
			EEFContainerDescription eefContainerDescription = (EEFContainerDescription) eefControlDescription;
			stream = eefContainerDescription.getControls().stream().flatMap(this::getDynamicMappingFors);
		}

		return stream;
	}

	/**
	 * Returns an unique identifier for the given EObject which will stay the same even after changes which would impact
	 * its URI (for example, changing the name of an EClass).
	 *
	 * @param eObject
	 *            The EObject
	 * @return The unique identifier of the given EObject
	 */
	private Integer getIdForEObject(EObject eObject) {
		return RefreshIdsHolder.getOrCreateID(eObject);
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

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.AbstractEEFTabDescriptor#isIndented()
	 */
	@Override
	public boolean isIndented() {
		return this.eefPage.getDescription().isIndented();
	}
}
