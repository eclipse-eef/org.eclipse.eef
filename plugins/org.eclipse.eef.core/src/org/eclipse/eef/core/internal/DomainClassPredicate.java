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
package org.eclipse.eef.core.internal;

import com.google.common.base.Predicate;

import java.util.List;

import org.eclipse.eef.core.api.EEFDomainClassTester;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * This class is used to filter EObjects using a domain class.
 *
 * @author pcdavid
 * @author sbegaudeau
 */
public class DomainClassPredicate implements Predicate<EObject> {
	/**
	 * The domain class name.
	 */
	private final String domainClassName;

	/**
	 * The EPackages available.
	 */
	private final List<EPackage> ePackages;

	/**
	 * The domain class tester.
	 */
	private EEFDomainClassTester domainClassTester;

	/**
	 * The constructor.
	 *
	 * @param domainClassName
	 *            A domain class "packageName::className" or "packageName.className".
	 * @param ePackages
	 *            The EPackages used to look for the EClasses
	 * @param domainClassTester
	 *            The class used to test the domain class
	 */
	public DomainClassPredicate(String domainClassName, List<EPackage> ePackages, EEFDomainClassTester domainClassTester) {
		this.domainClassName = domainClassName;
		this.ePackages = ePackages;
		this.domainClassTester = domainClassTester;
	}

	@Override
	public boolean apply(EObject input) {
		return this.domainClassTester.eInstanceOf(this.ePackages, input, domainClassName);
	}

}
