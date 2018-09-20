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
package org.eclipse.eef.core.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.core.api.IEEFDomainClassTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * Utility class used to compute if an EObject matches a domain class.
 *
 * @author sbegaudeau
 */
public class EEFDomainClassTester implements IEEFDomainClassTester {
	/**
	 * The pattern used to match the separator used by both Sirius and AQL.
	 */
	private static final Pattern SEPARATOR = Pattern.compile("(::?|\\.)"); //$NON-NLS-1$

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.IEEFDomainClassTester#eInstanceOf(org.eclipse.emf.ecore.EObject, java.lang.String)
	 */
	@Override
	public boolean eInstanceOf(EObject eObject, String domainClass) {
		String packageName = null;
		String className = null;

		if (!Util.isBlank(domainClass)) {
			Matcher m = SEPARATOR.matcher(domainClass);
			if (m.find()) {
				packageName = domainClass.substring(0, m.start());
				className = domainClass.substring(m.end());
			} else {
				className = domainClass;
			}

			if (!("EObject".equals(className) && packageName == null) && !("EObject".equals(className) && "ecore".equals(packageName))) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				boolean result = false;

				List<EClass> eAllTypes = new ArrayList<EClass>();
				eAllTypes.add(eObject.eClass());
				eAllTypes.addAll(eObject.eClass().getEAllSuperTypes());

				Iterator<EClass> iterator = eAllTypes.iterator();
				while (iterator.hasNext() && !result) {
					EClass eClass = iterator.next();
					if (packageName == null && className != null) {
						// Only consider the class name
						result = className.equals(eClass.getName());
					} else if (packageName != null && className != null) {
						result = packageName.equals(eClass.getEPackage().getName()) && className.equals(eClass.getName());
					}
				}
				return result;
			}
		}

		return true;
	}
}
