/*******************************************************************************
 * Copyright (c) 2016, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.tests.internal.core;

import org.eclipse.eef.EefFactory;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.internal.EEFDomainClassTester;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Tests of {@link EEFDomainClassTester}.
 *
 * @author sbegaudeau
 */
@SuppressWarnings({ "checkstyle:javadocmethod" })
public class EEFDomainClassTesterTests {

	private void test(EPackage ePackage, EObject eObject, String domainClass) {
		assertTrue(new EEFDomainClassTester().eInstanceOf(eObject, domainClass));
	}

	@Test
	public void testDomainClass() {
		this.test(EefPackage.eINSTANCE, EefFactory.eINSTANCE.createEEFButtonDescription(), "eef.EEFButtonDescription"); //$NON-NLS-1$
		this.test(EefPackage.eINSTANCE, EefFactory.eINSTANCE.createEEFButtonDescription(), "eef::EEFButtonDescription"); //$NON-NLS-1$
	}

	@Test
	public void testDomainClassWithoutPackageName() {
		this.test(EefPackage.eINSTANCE, EefFactory.eINSTANCE.createEEFButtonDescription(), "EEFButtonDescription"); //$NON-NLS-1$
	}

	@Test
	public void testEObjectDomainClass() {
		this.test(EefPackage.eINSTANCE, EefFactory.eINSTANCE.createEEFButtonDescription(), "ecore.EObject"); //$NON-NLS-1$
		this.test(EefPackage.eINSTANCE, EefFactory.eINSTANCE.createEEFButtonDescription(), "ecore::EObject"); //$NON-NLS-1$
	}

	@Test
	public void testEObjectDomainClassWithoutPackageName() {
		this.test(EefPackage.eINSTANCE, EefFactory.eINSTANCE.createEEFButtonDescription(), "EObject"); //$NON-NLS-1$
	}

	@Test
	public void testSuperclassDomainClass() {
		this.test(EefPackage.eINSTANCE, EefFactory.eINSTANCE.createEEFButtonDescription(), "eef.EEFWidgetDescription"); //$NON-NLS-1$
		this.test(EefPackage.eINSTANCE, EefFactory.eINSTANCE.createEEFButtonDescription(), "eef::EEFWidgetDescription"); //$NON-NLS-1$
	}

	@Test
	public void testSuperclassDomainClassWithoutPackageName() {
		this.test(EefPackage.eINSTANCE, EefFactory.eINSTANCE.createEEFButtonDescription(), "EEFWidgetDescription"); //$NON-NLS-1$
	}
}
