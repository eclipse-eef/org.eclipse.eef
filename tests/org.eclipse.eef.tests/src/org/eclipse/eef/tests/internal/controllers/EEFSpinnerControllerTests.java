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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.eef.EEFSpinnerDescription;
import org.eclipse.eef.core.api.controllers.IEEFSpinnerController;
import org.eclipse.eef.core.internal.controllers.EEFSpinnerController;
import org.eclipse.eef.tests.internal.EEFDataTests;
import org.eclipse.emf.ecore.EClassifier;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit tests for the {@link IEEFSpinnerController}.
 *
 * @author arichard
 */
@SuppressWarnings({ "checkstyle:javadocmethod" })
public class EEFSpinnerControllerTests extends AbstractEEFControllerTests {

	/**
	 * The name of the Project EClass.
	 */
	private static final String PROJECT_ECLASS_NAME = "Project"; //$NON-NLS-1$

	private IEEFSpinnerController spinnerController(String modelPath) {
		EClassifier eClassifier = this.ePackage(DART_ECORE, 0).getEClassifier(PROJECT_ECLASS_NAME);
		EEFSpinnerDescription description = widget(group(page(modelPath, 0), 0), EEFSpinnerDescription.class, 0);
		return new EEFSpinnerController(description, newVariableManager(eClassifier), this.interpreter, this.contextAdapter);
	}

	@Test
	public void testLabel() {
		testLabel(spinnerController(EEFDataTests.EEFSPINNERCONTROLLERTESTS_LABEL), "Project:"); //$NON-NLS-1$
	}

	@Test
	public void testHelp() {
		testHelp(spinnerController(EEFDataTests.EEFSPINNERCONTROLLERTESTS_HELP), "Project Help"); //$NON-NLS-1$
	}

	@Test
	public void testValue() {
		AtomicBoolean atomicBoolean = new AtomicBoolean(false);
		IEEFSpinnerController controller = this.spinnerController(EEFDataTests.EEFSPINNERCONTROLLERTESTS_VALUE);
		controller.onNewSpinnerValue(value -> {
			assertThat(value, is("100")); //$NON-NLS-1$
			atomicBoolean.set(true);
		});
		controller.refresh();
		assertTrue(atomicBoolean.get());
	}
}
