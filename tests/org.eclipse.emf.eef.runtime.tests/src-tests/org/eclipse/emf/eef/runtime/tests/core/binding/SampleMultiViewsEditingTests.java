/*******************************************************************************
 * Copyright (c) 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.tests.core.binding;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.eef.runtime.editingModel.EditingModelBuilder;
import org.eclipse.emf.eef.runtime.editingModel.PropertiesEditingModel;
import org.eclipse.emf.eef.runtime.tests.ui.cases.UIEditingTestCase;
import org.eclipse.emf.eef.runtime.tests.util.EEFTestEnvironment;
import org.eclipse.emf.eef.runtime.tests.util.EEFTestEnvironment.Builder;
import org.eclipse.emf.eef.runtime.tests.views.SampleAbstractView;
import org.eclipse.emf.eef.runtime.tests.views.SampleNameView;
import org.junit.Test;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class SampleMultiViewsEditingTests extends UIEditingTestCase {

	private static final String NEW_NAME = "New Name";
	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.tests.cases.NonUIEditingTestCase#initEnvironmentBuilder()
	 */
	@Override
	protected Builder initEnvironmentBuilder() {
		return super.initEnvironmentBuilder().setEditingModel(createEditingModel());
	}

	protected PropertiesEditingModel createEditingModel() {
		return new EditingModelBuilder(EEFTestEnvironment.TESTS_EDITING_MODEL_ID)
					.bindClass(EcorePackage.Literals.ECLASS)
						.withView(SampleNameView.class)
						.withView(SampleAbstractView.class)
					.build();
	}

	@Test
	public void testMultiViewsEditing() {
		((EClass) editedObject).setName(NEW_NAME);
		assertTrue("The view isn't properly updated", NEW_NAME.equals(((SampleNameView)views.get(0)).getName()));
		((EClass) editedObject).setAbstract(true);
		assertTrue("The view isn't properly updated", ((SampleAbstractView)views.get(1)).isAbstract());
		
	}
	
}
