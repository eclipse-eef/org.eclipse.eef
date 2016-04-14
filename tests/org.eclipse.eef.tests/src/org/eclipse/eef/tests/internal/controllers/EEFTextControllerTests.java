/*******************************************************************************
 * Copyright (c) 2015, 2016 Obeo.
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

import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.core.api.controllers.IEEFTextController;
import org.eclipse.eef.core.internal.controllers.EEFTextController;
import org.eclipse.eef.tests.internal.EEFDataTests;
import org.eclipse.emf.ecore.EClassifier;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for the {@link IEEFTextController}.
 *
 * @author sbegaudeau
 */
@SuppressWarnings({ "checkstyle:javadocmethod" })
public class EEFTextControllerTests extends AbstractEEFControllerTests {

	/**
	 * The name of the Project EClass.
	 */
	private static final String PROJECT_ECLASS_NAME = "Project"; //$NON-NLS-1$

	private IEEFTextController textController(String modelPath) {
		EClassifier eClassifier = this.ePackage(AbstractEEFControllerTests.DART_ECORE, 0).getEClassifier(EEFTextControllerTests.PROJECT_ECLASS_NAME);
		EEFTextDescription description = widget(group(page(modelPath, 0), 0), EEFTextDescription.class, 0);
		return new EEFTextController(description, newVariableManager(eClassifier), this.interpreter, this.eca);
	}

	@Test
	public void testLabel() {
		testLabel(textController(EEFDataTests.EEFTEXTCONTROLLERTESTS_LABEL), "Project:"); //$NON-NLS-1$
	}

	@Test
	public void testHelp() {
		testHelp(textController(EEFDataTests.EEFTEXTCONTROLLERTESTS_HELP), "Project Help"); //$NON-NLS-1$
	}

	@Test
	public void testValue() {
		AtomicBoolean atomicBoolean = new AtomicBoolean(false);
		IEEFTextController controller = this.textController(EEFDataTests.EEFTEXTCONTROLLERTESTS_VALUE);
		controller.onNewValue(value -> {
			MatcherAssert.assertThat(value, Is.is(EEFTextControllerTests.PROJECT_ECLASS_NAME));
			atomicBoolean.set(true);
		});
		controller.refresh();
		Assert.assertTrue(atomicBoolean.get());
	}
}
