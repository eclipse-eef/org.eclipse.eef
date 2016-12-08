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

import org.eclipse.eef.EEFDateDescription;
import org.eclipse.eef.core.api.controllers.IEEFDateController;
import org.eclipse.eef.core.internal.controllers.EEFDateController;
import org.eclipse.eef.tests.internal.EEFDataTests;
import org.eclipse.emf.ecore.EClassifier;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit tests for the {@link IEEFDateController}.
 *
 * @author arichard
 */
@SuppressWarnings({ "checkstyle:javadocmethod" })
public class EEFDateControllerTests extends AbstractEEFControllerTests {
	/**
	 * The name of the Project EClass.
	 */
	private static final String PROJECT_ECLASS_NAME = "Project"; //$NON-NLS-1$

	private IEEFDateController dateController(String modelPath) {
		EClassifier eClassifier = this.ePackage(DART_ECORE, 0).getEClassifier(PROJECT_ECLASS_NAME);
		EEFDateDescription description = widget(group(page(modelPath, 0), 0), EEFDateDescription.class, 0);
		return new EEFDateController(description, newVariableManager(eClassifier), this.interpreter, this.contextAdapter);
	}

	@Test
	public void testLabel() {
		testLabel(dateController(EEFDataTests.EEFDATECONTROLLERTESTS_LABEL), "Date:"); //$NON-NLS-1$
	}

	@Test
	public void testHelp() {
		testHelp(dateController(EEFDataTests.EEFDATECONTROLLERTESTS_HELP), "Choose a date"); //$NON-NLS-1$
	}

	@Test
	public void testDateValue() {
		AtomicBoolean atomicBoolean = new AtomicBoolean(false);
		IEEFDateController controller = this.dateController(EEFDataTests.EEFDATECONTROLLERTESTS_VALUE);
		controller.onNewValue(label -> {
			assertThat(label, is("1900-01-01")); //$NON-NLS-1$
			atomicBoolean.set(true);
		});
		controller.refresh();
		assertTrue(atomicBoolean.get());
	}

}
