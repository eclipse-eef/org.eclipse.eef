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

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * Utility class used to compute if an EObject matches a domain class.
 *
 * @author sbegaudeau
 */
public class EEFDomainClassTester {
	/**
	 * The pattern used to match the separator used by both Sirius and AQL.
	 */
	private static final Pattern SEPARATOR = Pattern.compile("(::?|\\.)"); //$NON-NLS-1$

	/**
	 * Indicates if the given eObject matches the given domainClass.
	 *
	 * @param ePackages
	 *            The EPackages used to find the EClasses represented by the given domainClass
	 * @param eObject
	 *            The EObject
	 * @param domainClass
	 *            The domain class
	 * @return <code>true</code> if the eObject matches the given domain, <code>false</code> otherwise
	 */
	public boolean eInstanceOf(List<EPackage> ePackages, EObject eObject, String domainClass) {
		List<EPackage> ePackagesToConsider = ePackages;
		if (!ePackagesToConsider.contains(EcorePackage.eINSTANCE)) {
			ePackagesToConsider.add(EcorePackage.eINSTANCE);
		}

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
				List<EClass> eClasses = this.getEClasses(ePackagesToConsider, packageName, className);
				for (EClass eClass : eClasses) {
					if (eClass.isSuperTypeOf(eObject.eClass())) {
						result = true;
						break;
					}
				}
				return result;
			}
		}

		return true;
	}

	/**
	 * Returns all the EClasses from the given EPackages matching the given packafeName with the given className.
	 *
	 * @param ePackages
	 *            The EPackages to consider
	 * @param packageName
	 *            The name of the package
	 * @param className
	 *            The name of the class.
	 * @return The list of EClass matching the given parameters
	 */
	private List<EClass> getEClasses(List<EPackage> ePackages, String packageName, String className) {
		List<EClass> eClasses = new ArrayList<EClass>();
		for (EPackage ePackage : ePackages) {
			if (!Util.isBlank(packageName) && !Util.isBlank(className) && ePackage.getName().equals(packageName)) {
				EClassifier eClassifier = ePackage.getEClassifier(className);
				if (eClassifier instanceof EClass) {
					eClasses.add((EClass) eClassifier);
				}
			} else if (Util.isBlank(packageName) && !Util.isBlank(className)) {
				EClassifier eClassifier = ePackage.getEClassifier(className);
				if (eClassifier instanceof EClass) {
					eClasses.add((EClass) eClassifier);
				}
			}
		}
		return eClasses;
	}
}
