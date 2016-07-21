/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference;

import org.eclipse.eef.EefPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EefExtWidgetsReferenceFactory
 * @model kind="package"
 * @generated
 */
public interface EefExtWidgetsReferencePackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "eefextwidgetsreference"; //$NON-NLS-1$

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/eef/ext/widgets/reference"; //$NON-NLS-1$

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "eef-ext-widgets-reference"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	EefExtWidgetsReferencePackage eINSTANCE = org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EefExtWidgetsReferencePackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceDescriptionImpl
	 * <em>EEF Ext Reference Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceDescriptionImpl
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EefExtWidgetsReferencePackageImpl#getEEFExtReferenceDescription()
	 * @generated
	 */
	int EEF_EXT_REFERENCE_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_DESCRIPTION__IDENTIFIER = EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_DESCRIPTION__LABEL_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_DESCRIPTION__HELP_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_DESCRIPTION__IS_ENABLED_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Property Validation Rules</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_DESCRIPTION__PROPERTY_VALIDATION_RULES = EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES;

	/**
	 * The feature id for the '<em><b>Reference Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_NAME_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Owner Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_OWNER_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEF Ext Reference Description</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription
	 * <em>EEF Ext Reference Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>EEF Ext Reference Description</em>'.
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription
	 * @generated
	 */
	EClass getEEFExtReferenceDescription();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getReferenceNameExpression
	 * <em>Reference Name Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Reference Name Expression</em>'.
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getReferenceNameExpression()
	 * @see #getEEFExtReferenceDescription()
	 * @generated
	 */
	EAttribute getEEFExtReferenceDescription_ReferenceNameExpression();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getReferenceOwnerExpression
	 * <em>Reference Owner Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Reference Owner Expression</em>'.
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getReferenceOwnerExpression()
	 * @see #getEEFExtReferenceDescription()
	 * @generated
	 */
	EAttribute getEEFExtReferenceDescription_ReferenceOwnerExpression();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EefExtWidgetsReferenceFactory getEefExtWidgetsReferenceFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceDescriptionImpl
		 * <em>EEF Ext Reference Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceDescriptionImpl
		 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EefExtWidgetsReferencePackageImpl#getEEFExtReferenceDescription()
		 * @generated
		 */
		EClass EEF_EXT_REFERENCE_DESCRIPTION = EefExtWidgetsReferencePackage.eINSTANCE.getEEFExtReferenceDescription();

		/**
		 * The meta object literal for the '<em><b>Reference Name Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_NAME_EXPRESSION = EefExtWidgetsReferencePackage.eINSTANCE
				.getEEFExtReferenceDescription_ReferenceNameExpression();

		/**
		 * The meta object literal for the '<em><b>Reference Owner Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_OWNER_EXPRESSION = EefExtWidgetsReferencePackage.eINSTANCE
				.getEEFExtReferenceDescription_ReferenceOwnerExpression();

	}

} // EefExtWidgetsReferencePackage
