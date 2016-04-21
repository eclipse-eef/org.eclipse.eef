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
