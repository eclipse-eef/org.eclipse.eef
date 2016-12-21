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

import org.eclipse.eef.EEFFilePickerDescription;
import org.eclipse.eef.core.api.controllers.IEEFFilePickerController;
import org.eclipse.eef.core.internal.controllers.EEFFilePickerController;
import org.eclipse.eef.tests.internal.EEFDataTests;
import org.eclipse.emf.ecore.EClassifier;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.assertTrue;

/**
 * Unit tests for the {@link IEEFFilePickerController}.
 *
 * @author arichard
 */
@SuppressWarnings({ "checkstyle:javadocmethod" })
public class EEFFilePickerControllerTests extends AbstractEEFControllerTests {

	/**
	 * The name of the Project EClass.
	 */
	private static final String PROJECT_ECLASS_NAME = "Project"; //$NON-NLS-1$

	private IEEFFilePickerController filePickerController(String modelPath) {
		EClassifier eClassifier = this.ePackage(DART_ECORE, 0).getEClassifier(PROJECT_ECLASS_NAME);
		EEFFilePickerDescription description = widget(group(page(modelPath, 0), 0), EEFFilePickerDescription.class, 0);
		return new EEFFilePickerController(description, newVariableManager(eClassifier), this.interpreter, this.contextAdapter);
	}

	@Test
	public void testLabel() {
		testLabel(filePickerController(EEFDataTests.EEFFILEPICKERCONTROLLERTESTS_LABEL), "Project:"); //$NON-NLS-1$
	}

	@Test
	public void testHelp() {
		testHelp(filePickerController(EEFDataTests.EEFFILEPICKERCONTROLLERTESTS_HELP), "Project Help"); //$NON-NLS-1$
	}

	@Test
	public void testValue() {
		AtomicBoolean atomicBoolean = new AtomicBoolean(false);
		IEEFFilePickerController controller = this.filePickerController(EEFDataTests.EEFFILEPICKERCONTROLLERTESTS_PATH);
		controller.onNewPath(value -> {
			assertThat(value, is(PROJECT_ECLASS_NAME));
			atomicBoolean.set(true);
		});
		controller.refresh();
		assertTrue(atomicBoolean.get());
	}
}
