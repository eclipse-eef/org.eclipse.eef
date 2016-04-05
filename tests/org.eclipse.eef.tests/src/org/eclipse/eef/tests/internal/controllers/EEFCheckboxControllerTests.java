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

import org.eclipse.eef.EEFCheckboxDescription;
import org.eclipse.eef.core.api.controllers.IEEFCheckboxController;
import org.eclipse.eef.core.internal.controllers.EEFCheckboxController;
import org.eclipse.eef.tests.internal.EEFDataTests;
import org.eclipse.emf.ecore.EClassifier;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

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
		EClassifier eClassifier = this.ePackage(AbstractEEFControllerTests.DART_ECORE, 0)
				.getEClassifier(EEFCheckboxControllerTests.PROJECT_ECLASS_NAME);
		EEFCheckboxDescription description = widget(group(page(modelPath, 0), 0), EEFCheckboxDescription.class, 0);
		return new EEFCheckboxController(description, newVariableManager(eClassifier), this.interpreter, this.eca);
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
			MatcherAssert.assertThat(value, Is.is(true));
			atomicBoolean.set(true);
		});
		controller.refresh();
		Assert.assertTrue(atomicBoolean.get());
	}
}
