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

import org.eclipse.eef.EEFMultiTextDescription;
import org.eclipse.eef.core.api.controllers.IEEFMultiTextController;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.internal.controllers.EEFMultiTextController;
import org.eclipse.eef.tests.internal.EEFDataTests;
import org.eclipse.emf.ecore.EClassifier;
import org.junit.Test;

/**
 * Unit tests for the {@link IEEFMultiTextController}.
 *
 * @author arichard
 */
@SuppressWarnings({ "checkstyle:javadocmethod" })
public class EEFMultiTextControllerTests extends AbstractEEFControllerTests {

	/**
	 * The name of the Project EClass.
	 */
	private static final String PROJECT_ECLASS_NAME = "Project"; //$NON-NLS-1$

	private IEEFWidgetController textController(String modelPath) {
		EClassifier eClassifier = this.ePackage(DART_ECORE, 0).getEClassifier(PROJECT_ECLASS_NAME);
		EEFMultiTextDescription description = widget(group(page(modelPath, 0), 0), EEFMultiTextDescription.class, 0);
		return new EEFMultiTextController(description, newVariableManager(eClassifier), this.interpreter, this.contextAdapter);
	}

	@Test
	public void testLabel() {
		testLabel(textController(EEFDataTests.EEFMULTITEXTCONTROLLERTESTS_LABEL), "Project:"); //$NON-NLS-1$
	}

	@Test
	public void testHelp() {
		testHelp(textController(EEFDataTests.EEFMULTITEXTCONTROLLERTESTS_HELP), "Project Help"); //$NON-NLS-1$
	}
}
