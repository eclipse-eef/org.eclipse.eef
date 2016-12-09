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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF Multi Text Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a multi text field in the user interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.EEFMultiTextDescription#getEditExpression <em>Edit Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFMultiTextDescription#getAttributeOwnerExpression <em>Attribute Owner Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFMultiTextDescription#getAttributeNameExpression <em>Attribute Name Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFMultiTextDescription#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.eef.EEFMultiTextDescription#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFMultiTextDescription()
 * @model
 * @generated
 */
public interface EEFMultiTextDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Edit Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the behavior executed when the end-user updates the value of a field of the multi text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edit Expression</em>' attribute.
	 * @see #setEditExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFMultiTextDescription_EditExpression()
	 * @model
	 * @generated
	 */
	String getEditExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFMultiTextDescription#getEditExpression <em>Edit Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Expression</em>' attribute.
	 * @see #getEditExpression()
	 * @generated
	 */
	void setEditExpression(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Owner Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EObject to use to evaluate the value of the attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Owner Expression</em>' attribute.
	 * @see #setAttributeOwnerExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFMultiTextDescription_AttributeOwnerExpression()
	 * @model
	 * @generated
	 */
	String getAttributeOwnerExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFMultiTextDescription#getAttributeOwnerExpression <em>Attribute Owner Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Owner Expression</em>' attribute.
	 * @see #getAttributeOwnerExpression()
	 * @generated
	 */
	void setAttributeOwnerExpression(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Name Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the reference to edit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Name Expression</em>' attribute.
	 * @see #setAttributeNameExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFMultiTextDescription_AttributeNameExpression()
	 * @model
	 * @generated
	 */
	String getAttributeNameExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFMultiTextDescription#getAttributeNameExpression <em>Attribute Name Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name Expression</em>' attribute.
	 * @see #getAttributeNameExpression()
	 * @generated
	 */
	void setAttributeNameExpression(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the text style
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(EEFMultiTextStyle)
	 * @see org.eclipse.eef.EefPackage#getEEFMultiTextDescription_Style()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFMultiTextStyle getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFMultiTextDescription#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(EEFMultiTextStyle value);

	/**
	 * Returns the value of the '<em><b>Conditional Styles</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eef.EEFMultiTextConditionalStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the text style associated to a precondition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditional Styles</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFMultiTextDescription_ConditionalStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFMultiTextConditionalStyle> getConditionalStyles();

} // EEFMultiTextDescription
