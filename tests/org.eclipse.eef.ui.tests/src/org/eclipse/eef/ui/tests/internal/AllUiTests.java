/*******************************************************************************
 * Copyright (c) 2018, 2019 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ui.tests.internal;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * This class will be used to launch all the tests at once.
 *
 * @author sbegaudeau
 */
@RunWith(Suite.class)
@SuiteClasses({ LegacyPropertySectionSorterTests.class, LegacyPropertyTabSorterTests.class })
public final class AllUiTests {
	/**
	 * The constructor.
	 */
	private AllUiTests() {
		// prevent instantiation
	}
}
