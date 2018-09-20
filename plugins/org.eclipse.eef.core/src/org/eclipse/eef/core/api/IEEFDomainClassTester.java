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
package org.eclipse.eef.core.api;

import org.eclipse.emf.ecore.EObject;

/**
 * This interface is used to test if a class matches a given domain class definition.
 *
 * @author sbegaudeau
 */
public interface IEEFDomainClassTester {
	/**
	 * Indicates if the given eObject matches the given domainClass.
	 *
	 * @param eObject
	 *            The EObject
	 * @param domainClass
	 *            The domain class
	 * @return <code>true</code> if the eObject matches the given domain, <code>false</code> otherwise
	 */
	boolean eInstanceOf(EObject eObject, String domainClass);
}
