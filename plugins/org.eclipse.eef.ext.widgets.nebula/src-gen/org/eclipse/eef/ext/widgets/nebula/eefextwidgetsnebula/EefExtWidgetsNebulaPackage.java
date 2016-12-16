/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula;

import org.eclipse.eef.EefPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EefExtWidgetsNebulaFactory
 * @model kind="package"
 * @generated
 */
public interface EefExtWidgetsNebulaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eefextwidgetsnebula"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/eef/ext/widgets/nebula"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eef-ext-widgets-nebula"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EefExtWidgetsNebulaPackage eINSTANCE = org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EefExtWidgetsNebulaPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EEFExtNebulaRichTextDescriptionImpl <em>EEF Ext Nebula Rich Text Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EEFExtNebulaRichTextDescriptionImpl
	 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EefExtWidgetsNebulaPackageImpl#getEEFExtNebulaRichTextDescription()
	 * @generated
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__IDENTIFIER = EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__LABEL_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__HELP_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__IS_ENABLED_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Property Validation Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__PROPERTY_VALIDATION_RULES = EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__VALUE_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edit Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__EDIT_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__STYLE = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EEF Ext Nebula Rich Text Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EEFExtNebulaRichTextWidgetStyleImpl <em>EEF Ext Nebula Rich Text Widget Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EEFExtNebulaRichTextWidgetStyleImpl
	 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EefExtWidgetsNebulaPackageImpl#getEEFExtNebulaRichTextWidgetStyle()
	 * @generated
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_WIDGET_STYLE = 1;

	/**
	 * The feature id for the '<em><b>Label Background Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Foreground Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Name Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Size Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Style Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION;

	/**
	 * The number of structural features of the '<em>EEF Ext Nebula Rich Text Widget Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_WIDGET_STYLE_FEATURE_COUNT = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EEFExtNebulaRichTextConditionalStyleImpl <em>EEF Ext Nebula Rich Text Conditional Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EEFExtNebulaRichTextConditionalStyleImpl
	 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EefExtWidgetsNebulaPackageImpl#getEEFExtNebulaRichTextConditionalStyle()
	 * @generated
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE = 2;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION = EefPackage.EEF_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE__STYLE = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Ext Nebula Rich Text Conditional Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE_FEATURE_COUNT = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextDescription <em>EEF Ext Nebula Rich Text Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Ext Nebula Rich Text Description</em>'.
	 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextDescription
	 * @generated
	 */
	EClass getEEFExtNebulaRichTextDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextDescription#getValueExpression()
	 * @see #getEEFExtNebulaRichTextDescription()
	 * @generated
	 */
	EAttribute getEEFExtNebulaRichTextDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextDescription#getEditExpression <em>Edit Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextDescription#getEditExpression()
	 * @see #getEEFExtNebulaRichTextDescription()
	 * @generated
	 */
	EAttribute getEEFExtNebulaRichTextDescription_EditExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextDescription#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextDescription#getStyle()
	 * @see #getEEFExtNebulaRichTextDescription()
	 * @generated
	 */
	EReference getEEFExtNebulaRichTextDescription_Style();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextDescription#getConditionalStyles <em>Conditional Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditional Styles</em>'.
	 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextDescription#getConditionalStyles()
	 * @see #getEEFExtNebulaRichTextDescription()
	 * @generated
	 */
	EReference getEEFExtNebulaRichTextDescription_ConditionalStyles();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextWidgetStyle <em>EEF Ext Nebula Rich Text Widget Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Ext Nebula Rich Text Widget Style</em>'.
	 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextWidgetStyle
	 * @generated
	 */
	EClass getEEFExtNebulaRichTextWidgetStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextConditionalStyle <em>EEF Ext Nebula Rich Text Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Ext Nebula Rich Text Conditional Style</em>'.
	 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextConditionalStyle
	 * @generated
	 */
	EClass getEEFExtNebulaRichTextConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextConditionalStyle#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextConditionalStyle#getStyle()
	 * @see #getEEFExtNebulaRichTextConditionalStyle()
	 * @generated
	 */
	EReference getEEFExtNebulaRichTextConditionalStyle_Style();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EefExtWidgetsNebulaFactory getEefExtWidgetsNebulaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EEFExtNebulaRichTextDescriptionImpl <em>EEF Ext Nebula Rich Text Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EEFExtNebulaRichTextDescriptionImpl
		 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EefExtWidgetsNebulaPackageImpl#getEEFExtNebulaRichTextDescription()
		 * @generated
		 */
		EClass EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION = eINSTANCE.getEEFExtNebulaRichTextDescription();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__VALUE_EXPRESSION = eINSTANCE
				.getEEFExtNebulaRichTextDescription_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Edit Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__EDIT_EXPRESSION = eINSTANCE
				.getEEFExtNebulaRichTextDescription_EditExpression();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__STYLE = eINSTANCE.getEEFExtNebulaRichTextDescription_Style();

		/**
		 * The meta object literal for the '<em><b>Conditional Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__CONDITIONAL_STYLES = eINSTANCE
				.getEEFExtNebulaRichTextDescription_ConditionalStyles();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EEFExtNebulaRichTextWidgetStyleImpl <em>EEF Ext Nebula Rich Text Widget Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EEFExtNebulaRichTextWidgetStyleImpl
		 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EefExtWidgetsNebulaPackageImpl#getEEFExtNebulaRichTextWidgetStyle()
		 * @generated
		 */
		EClass EEF_EXT_NEBULA_RICH_TEXT_WIDGET_STYLE = eINSTANCE.getEEFExtNebulaRichTextWidgetStyle();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EEFExtNebulaRichTextConditionalStyleImpl <em>EEF Ext Nebula Rich Text Conditional Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EEFExtNebulaRichTextConditionalStyleImpl
		 * @see org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EefExtWidgetsNebulaPackageImpl#getEEFExtNebulaRichTextConditionalStyle()
		 * @generated
		 */
		EClass EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE = eINSTANCE.getEEFExtNebulaRichTextConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_EXT_NEBULA_RICH_TEXT_CONDITIONAL_STYLE__STYLE = eINSTANCE
				.getEEFExtNebulaRichTextConditionalStyle_Style();

	}

} //EefExtWidgetsNebulaPackage
