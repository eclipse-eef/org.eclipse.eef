/*******************************************************************************
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.tests.internal;

import org.eclipse.eef.tests.internal.controllers.EEFTextControllerTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * This class will be used to launch all the tests at once.
 *
 * @author sbegaudeau
 */
@RunWith(Suite.class)
@SuiteClasses({ EEFTextControllerTests.class })
public final class AllTests {
	/**
	 * The constructor.
	 */
	private AllTests() {
		// prevent instantiation
	}
}
