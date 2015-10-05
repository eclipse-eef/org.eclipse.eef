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
package org.eclipse.eef.interpreter.aql.internal;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * This class contains all the default services for EEF.
 *
 * @author sbegaudeau
 */
public class DefaultEEFServices {
	/**
	 * Sets the value of the given feature of the object to the new value.
	 *
	 * @param eObject
	 *            The current EObject
	 * @param eStructuralFeatureName
	 *            The name of the {@link EStructuralFeature}
	 * @param value
	 *            The new value
	 * @return The current EObject
	 */
	public EObject eSet(EObject eObject, String eStructuralFeatureName, Object value) {
		EStructuralFeature eStructuralFeature = eObject.eClass().getEStructuralFeature(eStructuralFeatureName);
		if (eStructuralFeature.getUpperBound() == -1 || eStructuralFeature.getUpperBound() > 1) {
			Object currentValue = eObject.eGet(eStructuralFeature);
			if (currentValue instanceof Collection<?>) {
				@SuppressWarnings("unchecked")
				Collection<Object> collection = (Collection<Object>) currentValue;
				collection.add(value);
			}
		} else {
			eObject.eSetDeliver(true);
			eObject.eSet(eStructuralFeature, value);
		}
		return eObject;
	}
}
