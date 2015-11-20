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

import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.EefFactory;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * This class will be used to test the initialization of the controllers.
 *
 * @author sbegaudeau
 */
@SuppressWarnings({ "checkstyle:javadocmethod" })
public class InitializationTests {
	@Test
	public void testEmptyView() {
		EEFViewDescription eefViewDescription = EefFactory.eINSTANCE.createEEFViewDescription();
		// TODO Create a meaningful test :)
		assertNotNull(eefViewDescription);
	}
}
