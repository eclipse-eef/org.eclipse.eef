/*******************************************************************************
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.tests.internal;

import org.eclipse.eef.tests.internal.controllers.EEFButtonControllerTests;
import org.eclipse.eef.tests.internal.controllers.EEFCheckboxControllerTests;
import org.eclipse.eef.tests.internal.controllers.EEFLabelControllerTests;
import org.eclipse.eef.tests.internal.controllers.EEFRadioControllerTests;
import org.eclipse.eef.tests.internal.controllers.EEFSelectControllerTests;
import org.eclipse.eef.tests.internal.controllers.EEFTextControllerTests;
import org.eclipse.eef.tests.internal.core.EEFDomainClassTesterTests;
import org.eclipse.eef.tests.internal.core.EvalTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * This class will be used to launch all the tests at once.
 *
 * @author sbegaudeau
 */
@RunWith(Suite.class)
@SuiteClasses({ EvalTests.class, EEFDataTests.class, EEFTextControllerTests.class, EEFLabelControllerTests.class, EEFButtonControllerTests.class,
		EEFCheckboxControllerTests.class, EEFRadioControllerTests.class, EEFSelectControllerTests.class, EEFDomainClassTesterTests.class })
public final class AllTests {
	/**
	 * The constructor.
	 */
	private AllTests() {
		// prevent instantiation
	}
}
