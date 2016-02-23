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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Single Reference Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Represents a single reference in the user interface. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.eef.EEFSingleReferenceDescription#getValueExpression <em>Value Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFSingleReferenceDescription#getDisplayExpression <em>Display Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFSingleReferenceDescription#getOnClickExpression <em>On Click Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFSingleReferenceDescription#getCreateExpression <em>Create Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFSingleReferenceDescription#getSearchExpression <em>Search Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFSingleReferenceDescription#getUnsetExpression <em>Unset Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eef.EefPackage#getEEFSingleReferenceDescription()
 * @model
 * @generated
 */
public interface EEFSingleReferenceDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Indicates how to display the input value. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Value Expression</em>' attribute.
	 * @see #setValueExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFSingleReferenceDescription_ValueExpression()
	 * @model
	 * @generated
	 */
	String getValueExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFSingleReferenceDescription#getValueExpression
	 * <em>Value Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Value Expression</em>' attribute.
	 * @see #getValueExpression()
	 * @generated
	 */
	void setValueExpression(String value);

	/**
	 * Returns the value of the '<em><b>Display Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Indicates how to display the input value. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Display Expression</em>' attribute.
	 * @see #setDisplayExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFSingleReferenceDescription_DisplayExpression()
	 * @model
	 * @generated
	 */
	String getDisplayExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFSingleReferenceDescription#getDisplayExpression
	 * <em>Display Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Display Expression</em>' attribute.
	 * @see #getDisplayExpression()
	 * @generated
	 */
	void setDisplayExpression(String value);

	/**
	 * Returns the value of the '<em><b>On Click Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Defines the behavior executed when the end-user clicks on the
	 * hyperlink. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>On Click Expression</em>' attribute.
	 * @see #setOnClickExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFSingleReferenceDescription_OnClickExpression()
	 * @model
	 * @generated
	 */
	String getOnClickExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFSingleReferenceDescription#getOnClickExpression
	 * <em>On Click Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>On Click Expression</em>' attribute.
	 * @see #getOnClickExpression()
	 * @generated
	 */
	void setOnClickExpression(String value);

	/**
	 * Returns the value of the '<em><b>Create Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Defines the behavior executed when the end-user clicks on the create button. <!--
	 * end-model-doc -->
	 *
	 * @return the value of the '<em>Create Expression</em>' attribute.
	 * @see #setCreateExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFSingleReferenceDescription_CreateExpression()
	 * @model
	 * @generated
	 */
	String getCreateExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFSingleReferenceDescription#getCreateExpression
	 * <em>Create Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Create Expression</em>' attribute.
	 * @see #getCreateExpression()
	 * @generated
	 */
	void setCreateExpression(String value);

	/**
	 * Returns the value of the '<em><b>Search Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Defines the behavior executed when the end-user clicks on the search button. <!--
	 * end-model-doc -->
	 *
	 * @return the value of the '<em>Search Expression</em>' attribute.
	 * @see #setSearchExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFSingleReferenceDescription_SearchExpression()
	 * @model
	 * @generated
	 */
	String getSearchExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFSingleReferenceDescription#getSearchExpression
	 * <em>Search Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Search Expression</em>' attribute.
	 * @see #getSearchExpression()
	 * @generated
	 */
	void setSearchExpression(String value);

	/**
	 * Returns the value of the '<em><b>Unset Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Defines the behavior executed when the end-user clicks on the unset button. <!--
	 * end-model-doc -->
	 *
	 * @return the value of the '<em>Unset Expression</em>' attribute.
	 * @see #setUnsetExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFSingleReferenceDescription_UnsetExpression()
	 * @model
	 * @generated
	 */
	String getUnsetExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFSingleReferenceDescription#getUnsetExpression
	 * <em>Unset Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Unset Expression</em>' attribute.
	 * @see #getUnsetExpression()
	 * @generated
	 */
	void setUnsetExpression(String value);

} // EEFSingleReferenceDescription
