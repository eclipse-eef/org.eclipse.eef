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
package org.eclipse.eef.tests.internal;

import org.eclipse.eef.tests.internal.controllers.EEFButtonControllerTests;
import org.eclipse.eef.tests.internal.controllers.EEFLabelControllerTests;
import org.eclipse.eef.tests.internal.controllers.EEFTextControllerTests;
import org.eclipse.eef.tests.internal.core.EEFDomainClassTesterTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * This class will be used to launch all the tests at once.
 *
 * @author sbegaudeau
 */
@RunWith(Suite.class)
@SuiteClasses({ EEFDataTests.class, EEFTextControllerTests.class, EEFLabelControllerTests.class, EEFButtonControllerTests.class,
		EEFDomainClassTesterTests.class })
public final class AllTests {
	/**
	 * The constructor.
	 */
	private AllTests() {
		// prevent instantiation
	}
}
