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

import org.eclipse.eef.EEFRadioDescription;
import org.eclipse.eef.core.api.controllers.IEEFRadioController;
import org.eclipse.eef.core.internal.controllers.EEFRadioController;
import org.eclipse.eef.tests.internal.EEFDataTests;
import org.eclipse.emf.ecore.EClassifier;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.assertTrue;

/**
 * Unit tests for {@link IEEFRadioController}.
 *
 * @author sbegaudeau
 */
@SuppressWarnings({ "checkstyle:javadocmethod" })
public class EEFRadioControllerTests extends AbstractEEFControllerTests {
	/**
	 * The name of the Project EClass.
	 */
	private static final String PROJECT_ECLASS_NAME = "Project"; //$NON-NLS-1$

	private IEEFRadioController radioController(String modelPath) {
		EClassifier eClassifier = this.ePackage(DART_ECORE, 0).getEClassifier(PROJECT_ECLASS_NAME);
		EEFRadioDescription description = widget(group(page(modelPath, 0), 0), EEFRadioDescription.class, 0);
		return new EEFRadioController(description, newVariableManager(eClassifier), this.interpreter, this.contextAdapter);
	}

	@Test
	public void testLabel() {
		testLabel(radioController(EEFDataTests.EEFRADIOCONTROLLERTESTS_LABEL), "Visibility:"); //$NON-NLS-1$
	}

	@Test
	public void testHelp() {
		testHelp(radioController(EEFDataTests.EEFRADIOCONTROLLERTESTS_HELP), "Visibility Help"); //$NON-NLS-1$
	}

	@Test
	public void testValue() {
		AtomicBoolean atomicBoolean = new AtomicBoolean(false);
		IEEFRadioController controller = this.radioController(EEFDataTests.EEFRADIOCONTROLLERTESTS_VALUE);
		controller.onNewValue(value -> {
			assertThat(value, is("public")); //$NON-NLS-1$
			atomicBoolean.set(true);
		});
		controller.refresh();
		assertTrue(atomicBoolean.get());
	}
}
