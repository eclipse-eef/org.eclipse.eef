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
package org.eclipse.eef.documentation.export.internal;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * This class is used to prepare the HTML pages of the documentation for the export on the EEF website. We are using a
 * JUnit test case since it is easier to run during the build.
 *
 * @author sbegaudeau
 */
@RunWith(Suite.class)
@SuiteClasses({ ExporterTests.class, Exporter.class })
public class EEFDocumentationExport {
	// do nothing
}
