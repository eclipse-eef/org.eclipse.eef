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

import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.eef.EEFSelectDescription;
import org.eclipse.eef.core.api.controllers.IEEFSelectController;
import org.eclipse.eef.core.internal.controllers.EEFSelectController;
import org.eclipse.eef.tests.internal.EEFDataTests;
import org.eclipse.emf.ecore.EClassifier;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.assertTrue;

/**
 * Unit tests for {@link IEEFSelectController}.
 *
 * @author sbegaudeau
 */
@SuppressWarnings({ "checkstyle:javadocmethod" })
public class EEFSelectControllerTests extends AbstractEEFControllerTests {
	/**
	 * The name of the Project EClass.
	 */
	private static final String PROJECT_ECLASS_NAME = "Project"; //$NON-NLS-1$

	private IEEFSelectController selectController(String modelPath) {
		EClassifier eClassifier = this.ePackage(DART_ECORE, 0).getEClassifier(PROJECT_ECLASS_NAME);
		EEFSelectDescription description = widget(group(page(modelPath, 0), 0), EEFSelectDescription.class, 0);
		return new EEFSelectController(description, newVariableManager(eClassifier), this.interpreter, this.contextAdapter);
	}

	@Test
	public void testLabel() {
		testLabel(selectController(EEFDataTests.EEFSELECTCONTROLLERTESTS_LABEL), "Visibility:"); //$NON-NLS-1$
	}

	@Test
	public void testHelp() {
		testHelp(selectController(EEFDataTests.EEFSELECTCONTROLLERTESTS_HELP), "Visibility Help"); //$NON-NLS-1$
	}

	@Test
	public void testValue() {
		AtomicBoolean atomicBoolean = new AtomicBoolean(false);
		IEEFSelectController controller = this.selectController(EEFDataTests.EEFSELECTCONTROLLERTESTS_VALUE);
		controller.onNewCandidates(candidates -> {
			// do nothing
		});
		controller.onNewValue(value -> {
			assertThat(value, is("public")); //$NON-NLS-1$
			atomicBoolean.set(true);
		});
		controller.refresh();
		assertTrue(atomicBoolean.get());
	}
}
