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
import org.eclipse.emf.ecore.EReference;

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
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_DESCRIPTION__STYLE = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EEF Ext Reference Description</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceWidgetStyleImpl
	 * <em>EEF Ext Reference Widget Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceWidgetStyleImpl
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EefExtWidgetsReferencePackageImpl#getEEFExtReferenceWidgetStyle()
	 * @generated
	 */
	int EEF_EXT_REFERENCE_WIDGET_STYLE = 1;

	/**
	 * The feature id for the '<em><b>Label Background Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Foreground Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Size Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Style Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION;

	/**
	 * The number of structural features of the '<em>EEF Ext Reference Widget Style</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_WIDGET_STYLE_FEATURE_COUNT = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceConditionalStyleImpl
	 * <em>EEF Ext Reference Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceConditionalStyleImpl
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EefExtWidgetsReferencePackageImpl#getEEFExtReferenceConditionalStyle()
	 * @generated
	 */
	int EEF_EXT_REFERENCE_CONDITIONAL_STYLE = 2;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION = EefPackage.EEF_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_CONDITIONAL_STYLE__STYLE = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Ext Reference Conditional Style</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_REFERENCE_CONDITIONAL_STYLE_FEATURE_COUNT = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

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
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getStyle()
	 * @see #getEEFExtReferenceDescription()
	 * @generated
	 */
	EReference getEEFExtReferenceDescription_Style();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getConditionalStyles
	 * <em>Conditional Styles</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Conditional Styles</em>'.
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getConditionalStyles()
	 * @see #getEEFExtReferenceDescription()
	 * @generated
	 */
	EReference getEEFExtReferenceDescription_ConditionalStyles();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceWidgetStyle
	 * <em>EEF Ext Reference Widget Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Ext Reference Widget Style</em>'.
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceWidgetStyle
	 * @generated
	 */
	EClass getEEFExtReferenceWidgetStyle();

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceConditionalStyle
	 * <em>EEF Ext Reference Conditional Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Ext Reference Conditional Style</em>'.
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceConditionalStyle
	 * @generated
	 */
	EClass getEEFExtReferenceConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceConditionalStyle#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceConditionalStyle#getStyle()
	 * @see #getEEFExtReferenceConditionalStyle()
	 * @generated
	 */
	EReference getEEFExtReferenceConditionalStyle_Style();

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

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_EXT_REFERENCE_DESCRIPTION__STYLE = EefExtWidgetsReferencePackage.eINSTANCE.getEEFExtReferenceDescription_Style();

		/**
		 * The meta object literal for the '<em><b>Conditional Styles</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_EXT_REFERENCE_DESCRIPTION__CONDITIONAL_STYLES = EefExtWidgetsReferencePackage.eINSTANCE
				.getEEFExtReferenceDescription_ConditionalStyles();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceWidgetStyleImpl
		 * <em>EEF Ext Reference Widget Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceWidgetStyleImpl
		 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EefExtWidgetsReferencePackageImpl#getEEFExtReferenceWidgetStyle()
		 * @generated
		 */
		EClass EEF_EXT_REFERENCE_WIDGET_STYLE = EefExtWidgetsReferencePackage.eINSTANCE.getEEFExtReferenceWidgetStyle();

		/**
		 * The meta object literal for the '
		 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceConditionalStyleImpl
		 * <em>EEF Ext Reference Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceConditionalStyleImpl
		 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EefExtWidgetsReferencePackageImpl#getEEFExtReferenceConditionalStyle()
		 * @generated
		 */
		EClass EEF_EXT_REFERENCE_CONDITIONAL_STYLE = EefExtWidgetsReferencePackage.eINSTANCE.getEEFExtReferenceConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_EXT_REFERENCE_CONDITIONAL_STYLE__STYLE = EefExtWidgetsReferencePackage.eINSTANCE.getEEFExtReferenceConditionalStyle_Style();

	}

} // EefExtWidgetsReferencePackage
