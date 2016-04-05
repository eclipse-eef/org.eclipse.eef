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

import org.eclipse.eef.EEFButtonDescription;
import org.eclipse.eef.core.api.controllers.IEEFButtonController;
import org.eclipse.eef.core.internal.controllers.EEFButtonController;
import org.eclipse.eef.tests.internal.EEFDataTests;
import org.eclipse.emf.ecore.EClassifier;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

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
		EClassifier eClassifier = this.ePackage(AbstractEEFControllerTests.DART_ECORE, 0)
				.getEClassifier(EEFButtonControllerTests.PROJECT_ECLASS_NAME);
		EEFButtonDescription description = widget(group(page(modelPath, 0), 0), EEFButtonDescription.class, 0);
		return new EEFButtonController(description, newVariableManager(eClassifier), this.interpreter, this.mce);
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
			MatcherAssert.assertThat(label, Is.is("OK")); //$NON-NLS-1$
			atomicBoolean.set(true);
		});
		controller.refresh();
		Assert.assertTrue(atomicBoolean.get());
	}

}
