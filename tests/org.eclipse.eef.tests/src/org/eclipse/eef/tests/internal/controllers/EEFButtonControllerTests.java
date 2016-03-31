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
package org.eclipse.eef.tests.internal.controllers;

import org.eclipse.eef.EEFButtonDescription;
import org.eclipse.eef.core.api.controllers.IEEFButtonController;
import org.eclipse.eef.core.internal.controllers.EEFButtonController;
import org.eclipse.eef.tests.internal.EEFDataTests;
import org.eclipse.emf.ecore.EClassifier;
import org.junit.Test;

/**
 * Unit tests for the {@link IEEFButtonController}.
 *
 * @author sbegaudeau
 */
@SuppressWarnings({ "checkstyle:javadocmethod" })
public class EEFButtonControllerTests extends AbstractEEFControllerTests {
	/**
	 * The name of the Project EClass.
	 */
	private static final String PROJECT_ECLASS_NAME = "Project"; //$NON-NLS-1$

	private IEEFButtonController buttonController(String modelPath) {
		EClassifier eClassifier = this.ePackage(DART_ECORE, 0).getEClassifier(PROJECT_ECLASS_NAME);
		EEFButtonDescription description = widget(group(page(modelPath, 0), 0), EEFButtonDescription.class, 0);
		return new EEFButtonController(description, newVariableManager(eClassifier), this.interpreter, this.editingDomain);
	}

	@Test
	public void testLabel() {
		testLabel(buttonController(EEFDataTests.EEFBUTTONCONTROLLERTESTS_LABEL), "Click:"); //$NON-NLS-1$
	}

}
