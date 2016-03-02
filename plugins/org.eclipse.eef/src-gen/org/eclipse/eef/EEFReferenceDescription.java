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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Reference Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Represents a reference in the user interface. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.eef.EEFReferenceDescription#getSemanticElementExpression <em>Semantic Element Expression</em>}
 * </li>
 * <li>{@link org.eclipse.eef.EEFReferenceDescription#getEReferenceNameExpression <em>EReference Name Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFReferenceDescription#getDisplayExpression <em>Display Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFReferenceDescription#getCreateExpression <em>Create Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFReferenceDescription#getOnClickExpression <em>On Click Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eef.EefPackage#getEEFReferenceDescription()
 * @model abstract="true"
 * @generated
 */
public interface EEFReferenceDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Semantic Element Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Provides the input value. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Semantic Element Expression</em>' attribute.
	 * @see #setSemanticElementExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFReferenceDescription_SemanticElementExpression()
	 * @model
	 * @generated
	 */
	String getSemanticElementExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFReferenceDescription#getSemanticElementExpression
	 * <em>Semantic Element Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Semantic Element Expression</em>' attribute.
	 * @see #getSemanticElementExpression()
	 * @generated
	 */
	void setSemanticElementExpression(String value);

	/**
	 * Returns the value of the '<em><b>EReference Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Provides the name of the reference. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>EReference Name Expression</em>' attribute.
	 * @see #setEReferenceNameExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFReferenceDescription_EReferenceNameExpression()
	 * @model
	 * @generated
	 */
	String getEReferenceNameExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFReferenceDescription#getEReferenceNameExpression
	 * <em>EReference Name Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>EReference Name Expression</em>' attribute.
	 * @see #getEReferenceNameExpression()
	 * @generated
	 */
	void setEReferenceNameExpression(String value);

	/**
	 * Returns the value of the '<em><b>Display Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Indicates how to display the input value. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Display Expression</em>' attribute.
	 * @see #setDisplayExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFReferenceDescription_DisplayExpression()
	 * @model
	 * @generated
	 */
	String getDisplayExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFReferenceDescription#getDisplayExpression
	 * <em>Display Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Display Expression</em>' attribute.
	 * @see #getDisplayExpression()
	 * @generated
	 */
	void setDisplayExpression(String value);

	/**
	 * Returns the value of the '<em><b>Create Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Defines the behavior executed when the end-user clicks on the create button. <!--
	 * end-model-doc -->
	 *
	 * @return the value of the '<em>Create Expression</em>' attribute.
	 * @see #setCreateExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFReferenceDescription_CreateExpression()
	 * @model
	 * @generated
	 */
	String getCreateExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFReferenceDescription#getCreateExpression
	 * <em>Create Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Create Expression</em>' attribute.
	 * @see #getCreateExpression()
	 * @generated
	 */
	void setCreateExpression(String value);

	/**
	 * Returns the value of the '<em><b>On Click Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Defines the behavior executed when the end-user clicks on the
	 * hyperlink. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>On Click Expression</em>' attribute.
	 * @see #setOnClickExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFReferenceDescription_OnClickExpression()
	 * @model
	 * @generated
	 */
	String getOnClickExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFReferenceDescription#getOnClickExpression
	 * <em>On Click Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>On Click Expression</em>' attribute.
	 * @see #getOnClickExpression()
	 * @generated
	 */
	void setOnClickExpression(String value);

} // EEFReferenceDescription
