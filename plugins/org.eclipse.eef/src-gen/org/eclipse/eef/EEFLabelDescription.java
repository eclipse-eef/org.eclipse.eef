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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Label Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Represents a label in the user interface. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.eef.EEFLabelDescription#getBodyExpression <em>Body Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFLabelDescription#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.eef.EEFLabelDescription#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eef.EefPackage#getEEFLabelDescription()
 * @model
 * @generated
 */
public interface EEFLabelDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Body Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> The body of the label containing the meaningful content <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Body Expression</em>' attribute.
	 * @see #setBodyExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFLabelDescription_BodyExpression()
	 * @model
	 * @generated
	 */
	String getBodyExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFLabelDescription#getBodyExpression <em>Body Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Body Expression</em>' attribute.
	 * @see #getBodyExpression()
	 * @generated
	 */
	void setBodyExpression(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Defines the label style <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(EEFLabelStyle)
	 * @see org.eclipse.eef.EefPackage#getEEFLabelDescription_Style()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFLabelStyle getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFLabelDescription#getStyle <em>Style</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(EEFLabelStyle value);

	/**
	 * Returns the value of the '<em><b>Conditional Styles</b></em>' containment reference list. The list contents are
	 * of type {@link org.eclipse.eef.EEFLabelConditionalStyle}. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Defines the label style associated to a precondition <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Conditional Styles</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFLabelDescription_ConditionalStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFLabelConditionalStyle> getConditionalStyles();

} // EEFLabelDescription
