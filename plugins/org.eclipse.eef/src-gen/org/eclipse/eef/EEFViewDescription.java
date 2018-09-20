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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF View Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFViewDescription#getIdentifier <em>Identifier</em>}</li>
 * <li>{@link org.eclipse.eef.EEFViewDescription#getLabelExpression <em>Label Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFViewDescription#getImageExpression <em>Image Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFViewDescription#getGroups <em>Groups</em>}</li>
 * <li>{@link org.eclipse.eef.EEFViewDescription#getPages <em>Pages</em>}</li>
 * <li>{@link org.eclipse.eef.EEFViewDescription#getEPackages <em>EPackages</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFViewDescription()
 * @model
 * @generated
 */
public interface EEFViewDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc --> Used to identify a specific View instance. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.eclipse.eef.EefPackage#getEEFViewDescription_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFViewDescription#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> The label of the View visible by the end-users. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Label Expression</em>' attribute.
	 * @see #setLabelExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFViewDescription_LabelExpression()
	 * @model
	 * @generated
	 */
	String getLabelExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFViewDescription#getLabelExpression <em>Label Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Label Expression</em>' attribute.
	 * @see #getLabelExpression()
	 * @generated
	 */
	void setLabelExpression(String value);

	/**
	 * Returns the value of the '<em><b>Image Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> The expression used to compute the image of the View visible by the end-users. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Image Expression</em>' attribute.
	 * @see #setImageExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFViewDescription_ImageExpression()
	 * @model
	 * @generated
	 */
	String getImageExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFViewDescription#getImageExpression <em>Image Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Image Expression</em>' attribute.
	 * @see #getImageExpression()
	 * @generated
	 */
	void setImageExpression(String value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.eef.EEFGroupDescription}. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc
	 * --> Contains all the defined Groups. It is defined under the View for reuasability reason and to be referenced
	 * easily from any Page. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFViewDescription_Groups()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFGroupDescription> getGroups();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.eef.EEFPageDescription}. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc
	 * --> Defines the tabs that are represented in the View. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFViewDescription_Pages()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<EEFPageDescription> getPages();

	/**
	 * Returns the value of the '<em><b>EPackages</b></em>' reference list. The list contents are of type
	 * {@link org.eclipse.emf.ecore.EPackage}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EPackages</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>EPackages</em>' reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFViewDescription_EPackages()
	 * @model
	 * @generated
	 */
	EList<EPackage> getEPackages();

} // EEFViewDescription
