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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Multiple References Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> Represents a single reference in the user interface. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.eef.EEFMultipleReferencesDescription#getValueExpression <em>Value Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFMultipleReferencesDescription#getCandidatesExpression <em>Candidates Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFMultipleReferencesDescription#getCandidateDisplayExpression <em>Candidate Display
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFMultipleReferencesDescription#getOnClickExpression <em>On Click Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFMultipleReferencesDescription#getCreateExpression <em>Create Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFMultipleReferencesDescription#getSearchExpression <em>Search Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFMultipleReferencesDescription#getUnsetExpression <em>Unset Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFMultipleReferencesDescription#getUpExpression <em>Up Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFMultipleReferencesDescription#getDownExpression <em>Down Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.eef.EefPackage#getEEFMultipleReferencesDescription()
 * @model
 * @generated
 */
public interface EEFMultipleReferencesDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Indicates how to display the input value. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Value Expression</em>' attribute.
	 * @see #setValueExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFMultipleReferencesDescription_ValueExpression()
	 * @model
	 * @generated
	 */
	String getValueExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFMultipleReferencesDescription#getValueExpression
	 * <em>Value Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Value Expression</em>' attribute.
	 * @see #getValueExpression()
	 * @generated
	 */
	void setValueExpression(String value);

	/**
	 * Returns the value of the '<em><b>Candidates Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Defines the various proposals available. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Candidates Expression</em>' attribute.
	 * @see #setCandidatesExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFMultipleReferencesDescription_CandidatesExpression()
	 * @model
	 * @generated
	 */
	String getCandidatesExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFMultipleReferencesDescription#getCandidatesExpression
	 * <em>Candidates Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Candidates Expression</em>' attribute.
	 * @see #getCandidatesExpression()
	 * @generated
	 */
	void setCandidatesExpression(String value);

	/**
	 * Returns the value of the '<em><b>Candidate Display Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Indicates how to display the input value. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Candidate Display Expression</em>' attribute.
	 * @see #setCandidateDisplayExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFMultipleReferencesDescription_CandidateDisplayExpression()
	 * @model
	 * @generated
	 */
	String getCandidateDisplayExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFMultipleReferencesDescription#getCandidateDisplayExpression
	 * <em>Candidate Display Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Candidate Display Expression</em>' attribute.
	 * @see #getCandidateDisplayExpression()
	 * @generated
	 */
	void setCandidateDisplayExpression(String value);

	/**
	 * Returns the value of the '<em><b>On Click Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Defines the behavior executed when the end-user clicks on the
	 * hyperlink. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>On Click Expression</em>' attribute.
	 * @see #setOnClickExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFMultipleReferencesDescription_OnClickExpression()
	 * @model
	 * @generated
	 */
	String getOnClickExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFMultipleReferencesDescription#getOnClickExpression
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
	 * @see org.eclipse.eef.EefPackage#getEEFMultipleReferencesDescription_CreateExpression()
	 * @model
	 * @generated
	 */
	String getCreateExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFMultipleReferencesDescription#getCreateExpression
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
	 * @see org.eclipse.eef.EefPackage#getEEFMultipleReferencesDescription_SearchExpression()
	 * @model
	 * @generated
	 */
	String getSearchExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFMultipleReferencesDescription#getSearchExpression
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
	 * @see org.eclipse.eef.EefPackage#getEEFMultipleReferencesDescription_UnsetExpression()
	 * @model
	 * @generated
	 */
	String getUnsetExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFMultipleReferencesDescription#getUnsetExpression
	 * <em>Unset Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Unset Expression</em>' attribute.
	 * @see #getUnsetExpression()
	 * @generated
	 */
	void setUnsetExpression(String value);

	/**
	 * Returns the value of the '<em><b>Up Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc --> Defines the behavior executed when the end-user clicks on the up button. <!--
	 * end-model-doc -->
	 *
	 * @return the value of the '<em>Up Expression</em>' attribute.
	 * @see #setUpExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFMultipleReferencesDescription_UpExpression()
	 * @model
	 * @generated
	 */
	String getUpExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFMultipleReferencesDescription#getUpExpression
	 * <em>Up Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Up Expression</em>' attribute.
	 * @see #getUpExpression()
	 * @generated
	 */
	void setUpExpression(String value);

	/**
	 * Returns the value of the '<em><b>Down Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Defines the behavior executed when the end-user clicks on the down button. <!--
	 * end-model-doc -->
	 *
	 * @return the value of the '<em>Down Expression</em>' attribute.
	 * @see #setDownExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFMultipleReferencesDescription_DownExpression()
	 * @model
	 * @generated
	 */
	String getDownExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFMultipleReferencesDescription#getDownExpression
	 * <em>Down Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Down Expression</em>' attribute.
	 * @see #getDownExpression()
	 * @generated
	 */
	void setDownExpression(String value);

} // EEFMultipleReferencesDescription
