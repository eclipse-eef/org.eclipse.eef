/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEF View Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A View is the root concept of the EEF metamodel. A View defines groups of widgets, semantic mappings and related metamodels.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.EEFViewDescription#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFViewDescription#getLabelExpression <em>Label Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFViewDescription#getEPackageNsUris <em>EPackage Ns Uris</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFViewDescription#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFViewDescription#getPages <em>Pages</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFViewDescription#getJavaExtensions <em>Java Extensions</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFViewDescription#getImportedViews <em>Imported Views</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFViewDescription#getTreeStructures <em>Tree Structures</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.EEFViewDescription#getTableStructures <em>Table Structures</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.eef.EefPackage#getEEFViewDescription()
 * @model
 * @generated
 */
public interface EEFViewDescription extends ContextableElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to identify a specific View instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFViewDescription_Identifier()
	 * @model required="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFViewDescription#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The label of the View visible by the end-users. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label Expression</em>' attribute.
	 * @see #setLabelExpression(String)
	 * @see org.eclipse.eef.eef.EefPackage#getEEFViewDescription_LabelExpression()
	 * @model dataType="org.eclipse.eef.eef.Expression"
	 * @generated
	 */
	String getLabelExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.eef.EEFViewDescription#getLabelExpression <em>Label Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Expression</em>' attribute.
	 * @see #getLabelExpression()
	 * @generated
	 */
	void setLabelExpression(String value);

	/**
	 * Returns the value of the '<em><b>EPackage Ns Uris</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the metamodels to use thanks to their NsURIs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EPackage Ns Uris</em>' attribute list.
	 * @see org.eclipse.eef.eef.EefPackage#getEEFViewDescription_EPackageNsUris()
	 * @model
	 * @generated
	 */
	EList<String> getEPackageNsUris();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eef.eef.EEFGroupDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains all the defined Groups. It is defined under the View for reuasability reason and to be referenced easily from any Page.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see org.eclipse.eef.eef.EefPackage#getEEFViewDescription_Groups()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFGroupDescription> getGroups();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eef.eef.EEFPageDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the tabs that are represented in the View.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see org.eclipse.eef.eef.EefPackage#getEEFViewDescription_Pages()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<EEFPageDescription> getPages();

	/**
	 * Returns the value of the '<em><b>Java Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eef.eef.EEFJavaExtensionDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References Java classes to contribute them as services for EEF runtime interpreters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Java Extensions</em>' containment reference list.
	 * @see org.eclipse.eef.eef.EefPackage#getEEFViewDescription_JavaExtensions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFJavaExtensionDescription> getJavaExtensions();

	/**
	 * Returns the value of the '<em><b>Imported Views</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.eef.eef.EEFViewDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Imports other existing views to reuse groups and widgets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Views</em>' reference list.
	 * @see org.eclipse.eef.eef.EefPackage#getEEFViewDescription_ImportedViews()
	 * @model
	 * @generated
	 */
	EList<EEFViewDescription> getImportedViews();

	/**
	 * Returns the value of the '<em><b>Tree Structures</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eef.eef.EEFTreeStructureDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains all the defined TreeDescription. It is defined under the View for reusability reason and to be referenced easily  from any Tree widget.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tree Structures</em>' containment reference list.
	 * @see org.eclipse.eef.eef.EefPackage#getEEFViewDescription_TreeStructures()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFTreeStructureDescription> getTreeStructures();

	/**
	 * Returns the value of the '<em><b>Table Structures</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.eef.eef.EEFTableStructureDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains all the defined TableDescription. It is defined under the View for reusability reason and to be referenced easily  from any Tree widget.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Table Structures</em>' containment reference list.
	 * @see org.eclipse.eef.eef.EefPackage#getEEFViewDescription_TableStructures()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFTableStructureDescription> getTableStructures();

} // EEFViewDescription
