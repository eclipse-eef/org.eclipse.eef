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

import org.eclipse.eef.EEFButtonDescription;
import org.eclipse.eef.core.api.controllers.IEEFButtonController;
import org.eclipse.eef.core.internal.controllers.EEFButtonController;
import org.eclipse.eef.tests.internal.EEFDataTests;
import org.eclipse.emf.ecore.EClassifier;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.assertTrue;

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
		return new EEFButtonController(description, newVariableManager(eClassifier), this.interpreter, this.contextAdapter);
	}

	@Test
	public void testLabel() {
		testLabel(buttonController(EEFDataTests.EEFBUTTONCONTROLLERTESTS_LABEL), "Click:"); //$NON-NLS-1$
	}

	@Test
	public void testHelp() {
		testHelp(buttonController(EEFDataTests.EEFBUTTONCONTROLLERTESTS_HELP), "Click on the button"); //$NON-NLS-1$
	}

	@Test
	public void testButtonLabel() {
		AtomicBoolean atomicBoolean = new AtomicBoolean(false);
		IEEFButtonController controller = this.buttonController(EEFDataTests.EEFBUTTONCONTROLLERTESTS_BUTTONLABEL);
		controller.onNewButtonLabel(label -> {
			assertThat(label, is("OK")); //$NON-NLS-1$
			atomicBoolean.set(true);
		});
		controller.refresh();
		assertTrue(atomicBoolean.get());
	}

}
