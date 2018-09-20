/*******************************************************************************
 * Copyright (c) 2016, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.tests.internal.controllers;

import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.eef.EEFLabelDescription;
import org.eclipse.eef.core.api.controllers.IEEFLabelController;
import org.eclipse.eef.core.internal.controllers.EEFLabelController;
import org.eclipse.eef.tests.internal.EEFDataTests;
import org.eclipse.emf.ecore.EClassifier;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.assertTrue;

/**
 * Unit tests for the {@link IEEFLabelController}.
 *
 * @author sbegaudeau
 */
@SuppressWarnings({ "checkstyle:javadocmethod" })
public class EEFLabelControllerTests extends AbstractEEFControllerTests {
	/**
	 * The name of the Project EClass.
	 */
	private static final String PROJECT_ECLASS_NAME = "Project"; //$NON-NLS-1$

	private IEEFLabelController labelController(String modelPath) {
		EClassifier eClassifier = this.ePackage(DART_ECORE, 0).getEClassifier(PROJECT_ECLASS_NAME);
		EEFLabelDescription description = widget(group(page(modelPath, 0), 0), EEFLabelDescription.class, 0);
		return new EEFLabelController(description, newVariableManager(eClassifier), this.interpreter, this.contextAdapter);
	}

	@Test
	public void testLabel() {
		testLabel(labelController(EEFDataTests.EEFLABELCONTROLLERTESTS_LABEL), "Documentation:"); //$NON-NLS-1$
	}

	@Test
	public void testHelp() {
		testHelp(labelController(EEFDataTests.EEFLABELCONTROLLERTESTS_HELP), "Documentation Help"); //$NON-NLS-1$
	}

	@Test
	public void testBody() {
		AtomicBoolean atomicBoolean = new AtomicBoolean(false);
		IEEFLabelController controller = this.labelController(EEFDataTests.EEFLABELCONTROLLERTESTS_BODY);
		controller.onNewValue(label -> {
			assertThat(label, is("This is the documentation of the project")); //$NON-NLS-1$
			atomicBoolean.set(true);
		});
		controller.refresh();
		assertTrue(atomicBoolean.get());
	}
}
