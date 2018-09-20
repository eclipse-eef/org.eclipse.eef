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

import org.eclipse.eef.EEFCheckboxDescription;
import org.eclipse.eef.core.api.controllers.IEEFCheckboxController;
import org.eclipse.eef.core.internal.controllers.EEFCheckboxController;
import org.eclipse.eef.tests.internal.EEFDataTests;
import org.eclipse.emf.ecore.EClassifier;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.assertTrue;

/**
 * Unit tests for {@link IEEFCheckboxController}.
 *
 * @author sbegaudeau
 */
@SuppressWarnings({ "checkstyle:javadocmethod" })
public class EEFCheckboxControllerTests extends AbstractEEFControllerTests {
	/**
	 * The name of the Project EClass.
	 */
	private static final String PROJECT_ECLASS_NAME = "Project"; //$NON-NLS-1$

	private IEEFCheckboxController checkboxController(String modelPath) {
		EClassifier eClassifier = this.ePackage(DART_ECORE, 0).getEClassifier(PROJECT_ECLASS_NAME);
		EEFCheckboxDescription description = widget(group(page(modelPath, 0), 0), EEFCheckboxDescription.class, 0);
		return new EEFCheckboxController(description, newVariableManager(eClassifier), this.interpreter, this.contextAdapter);
	}

	@Test
	public void testLabel() {
		testLabel(checkboxController(EEFDataTests.EEFCHECKBOXCONTROLLERTESTS_LABEL), "Abstract:"); //$NON-NLS-1$
	}

	@Test
	public void testHelp() {
		testHelp(checkboxController(EEFDataTests.EEFCHECKBOXCONTROLLERTESTS_HELP), "Abstract Help"); //$NON-NLS-1$
	}

	@Test
	public void testValue() {
		AtomicBoolean atomicBoolean = new AtomicBoolean(false);
		IEEFCheckboxController controller = this.checkboxController(EEFDataTests.EEFCHECKBOXCONTROLLERTESTS_VALUE);
		controller.onNewValue(value -> {
			assertThat(value, is(true));
			atomicBoolean.set(true);
		});
		controller.refresh();
		assertTrue(atomicBoolean.get());
	}
}
