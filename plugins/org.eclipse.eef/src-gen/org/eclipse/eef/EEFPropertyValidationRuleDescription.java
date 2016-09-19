/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>EEF Property Validation Rule Description</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.eef.EEFPropertyValidationRuleDescription#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eef.EefPackage#getEEFPropertyValidationRuleDescription()
 * @model
 * @generated
 */
public interface EEFPropertyValidationRuleDescription extends EEFValidationRuleDescription {
	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.eef.EEFWidgetDescription}. It is bidirectional and its opposite is '
	 * {@link org.eclipse.eef.EEFWidgetDescription#getPropertyValidationRules <em>Property Validation Rules</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The widgets involved in this validation rule.
	 * <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFPropertyValidationRuleDescription_Targets()
	 * @see org.eclipse.eef.EEFWidgetDescription#getPropertyValidationRules
	 * @model opposite="propertyValidationRules"
	 * @generated
	 */
	EList<EEFWidgetDescription> getTargets();

} // EEFPropertyValidationRuleDescription