/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Semantic Validation Rule
 * Description</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFSemanticValidationRuleDescription#getTargetClass <em>Target Class</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFSemanticValidationRuleDescription()
 * @model
 * @generated
 */
public interface EEFSemanticValidationRuleDescription extends EEFValidationRuleDescription {
	/**
	 * Returns the value of the '<em><b>Target Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc --> The target class involved in this validation rule. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Target Class</em>' attribute.
	 * @see #setTargetClass(String)
	 * @see org.eclipse.eef.EefPackage#getEEFSemanticValidationRuleDescription_TargetClass()
	 * @model required="true"
	 * @generated
	 */
	String getTargetClass();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFSemanticValidationRuleDescription#getTargetClass <em>Target
	 * Class</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Target Class</em>' attribute.
	 * @see #getTargetClass()
	 * @generated
	 */
	void setTargetClass(String value);

} // EEFSemanticValidationRuleDescription
