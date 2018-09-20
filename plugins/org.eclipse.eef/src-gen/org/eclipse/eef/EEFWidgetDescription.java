/**
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Widget Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Graphical element. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFWidgetDescription#getLabelExpression <em>Label Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFWidgetDescription#getHelpExpression <em>Help Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFWidgetDescription#getIsEnabledExpression <em>Is Enabled Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFWidgetDescription#getPropertyValidationRules <em>Property Validation Rules</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFWidgetDescription()
 * @model abstract="true"
 * @generated
 */
public interface EEFWidgetDescription extends EEFControlDescription {
	/**
	 * Returns the value of the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> The label of the Widget visible by the end-users. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Label Expression</em>' attribute.
	 * @see #setLabelExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetDescription_LabelExpression()
	 * @model
	 * @generated
	 */
	String getLabelExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetDescription#getLabelExpression <em>Label Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Label Expression</em>' attribute.
	 * @see #getLabelExpression()
	 * @generated
	 */
	void setLabelExpression(String value);

	/**
	 * Returns the value of the '<em><b>Help Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> The tooltip of the help icon visible by the end-users <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Help Expression</em>' attribute.
	 * @see #setHelpExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetDescription_HelpExpression()
	 * @model
	 * @generated
	 */
	String getHelpExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetDescription#getHelpExpression <em>Help Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Help Expression</em>' attribute.
	 * @see #getHelpExpression()
	 * @generated
	 */
	void setHelpExpression(String value);

	/**
	 * Returns the value of the '<em><b>Is Enabled Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> The enablement rules to use for the widget. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Is Enabled Expression</em>' attribute.
	 * @see #setIsEnabledExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetDescription_IsEnabledExpression()
	 * @model
	 * @generated
	 */
	String getIsEnabledExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFWidgetDescription#getIsEnabledExpression <em>Is Enabled
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Is Enabled Expression</em>' attribute.
	 * @see #getIsEnabledExpression()
	 * @generated
	 */
	void setIsEnabledExpression(String value);

	/**
	 * Returns the value of the '<em><b>Property Validation Rules</b></em>' reference list. The list contents are of
	 * type {@link org.eclipse.eef.EEFPropertyValidationRuleDescription}. It is bidirectional and its opposite is
	 * '{@link org.eclipse.eef.EEFPropertyValidationRuleDescription#getTargets <em>Targets</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc --> <!-- begin-model-doc --> The property validation rules to use for the widget. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Property Validation Rules</em>' reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFWidgetDescription_PropertyValidationRules()
	 * @see org.eclipse.eef.EEFPropertyValidationRuleDescription#getTargets
	 * @model opposite="targets"
	 * @generated
	 */
	EList<EEFPropertyValidationRuleDescription> getPropertyValidationRules();

} // EEFWidgetDescription
