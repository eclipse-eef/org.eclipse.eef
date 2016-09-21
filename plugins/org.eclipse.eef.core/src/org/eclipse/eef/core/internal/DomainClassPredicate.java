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

import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.core.api.IEEFDomainClassTester;
import org.eclipse.emf.ecore.EObject;

/**
 * This class is used to filter EObjects using a domain class.
 *
 * @author pcdavid
 * @author sbegaudeau
 */
public class DomainClassPredicate implements Predicate<Object> {
	/**
	 * The domain class name.
	 */
	private final String domainClassName;

	/**
	 * The domain class tester.
	 */
	private IEEFDomainClassTester domainClassTester;

	/**
	 * The constructor.
	 *
	 * @param domainClassName
	 *            A domain class "packageName::className" or "packageName.className".
	 * @param domainClassTester
	 *            The class used to test the domain class
	 */
	public DomainClassPredicate(String domainClassName, IEEFDomainClassTester domainClassTester) {
		this.domainClassName = domainClassName;
		this.domainClassTester = domainClassTester;
	}

	@Override
	public boolean apply(Object input) {
		if (input instanceof EObject) {
			return this.domainClassTester.eInstanceOf((EObject) input, domainClassName);
		}
		return Util.isBlank(domainClassName);
	}

}
