/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

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
 * @see org.eclipse.eef.EefFactory
 * @model kind="package"
 * @generated
 */
public interface EefPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "eef"; //$NON-NLS-1$

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/eef"; //$NON-NLS-1$

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "eef"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	EefPackage eINSTANCE = org.eclipse.eef.impl.EefPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFViewDescriptionImpl <em>EEF View Description</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFViewDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFViewDescription()
	 * @generated
	 */
	int EEF_VIEW_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__GROUPS = 2;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__PAGES = 3;

	/**
	 * The feature id for the '<em><b>EPackages</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__EPACKAGES = 4;

	/**
	 * The number of structural features of the '<em>EEF View Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFPageDescriptionImpl <em>EEF Page Description</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFPageDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFPageDescription()
	 * @generated
	 */
	int EEF_PAGE_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__LABEL_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Semantic Candidate Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__GROUPS = 3;

	/**
	 * The number of structural features of the '<em>EEF Page Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFGroupDescriptionImpl <em>EEF Group Description</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFGroupDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFGroupDescription()
	 * @generated
	 */
	int EEF_GROUP_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__LABEL_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Semantic Candidate Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__CONTAINER = 3;

	/**
	 * The number of structural features of the '<em>EEF Group Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFContainerDescriptionImpl
	 * <em>EEF Container Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFContainerDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFContainerDescription()
	 * @generated
	 */
	int EEF_CONTAINER_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__WIDGETS = 1;

	/**
	 * The feature id for the '<em><b>Dynamic Mappings</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__DYNAMIC_MAPPINGS = 2;

	/**
	 * The number of structural features of the '<em>EEF Container Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFWidgetDescriptionImpl <em>EEF Widget Description</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFWidgetDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFWidgetDescription()
	 * @generated
	 */
	int EEF_WIDGET_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>EEF Widget Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTextDescriptionImpl <em>EEF Text Description</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFTextDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTextDescription()
	 * @generated
	 */
	int EEF_TEXT_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__IDENTIFIER = EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__LABEL_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__VALUE_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edit Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line Count</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__LINE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EEF Text Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFLabelDescriptionImpl <em>EEF Label Description</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFLabelDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLabelDescription()
	 * @generated
	 */
	int EEF_LABEL_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__IDENTIFIER = EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__LABEL_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The number of structural features of the '<em>EEF Label Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFButtonDescriptionImpl <em>EEF Button Description</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFButtonDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFButtonDescription()
	 * @generated
	 */
	int EEF_BUTTON_DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_DESCRIPTION__IDENTIFIER = EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_DESCRIPTION__LABEL_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Button Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_DESCRIPTION__BUTTON_LABEL_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Push Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_DESCRIPTION__PUSH_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEF Button Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFCheckboxDescriptionImpl
	 * <em>EEF Checkbox Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFCheckboxDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCheckboxDescription()
	 * @generated
	 */
	int EEF_CHECKBOX_DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__IDENTIFIER = EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__LABEL_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__VALUE_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edit Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__EDIT_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEF Checkbox Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFSelectDescriptionImpl <em>EEF Select Description</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFSelectDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFSelectDescription()
	 * @generated
	 */
	int EEF_SELECT_DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__IDENTIFIER = EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__LABEL_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__VALUE_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edit Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__EDIT_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Candidates Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__CANDIDATES_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Candidate Display Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EEF Select Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFDynamicMappingForImpl
	 * <em>EEF Dynamic Mapping For</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFDynamicMappingForImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFDynamicMappingFor()
	 * @generated
	 */
	int EEF_DYNAMIC_MAPPING_FOR = 10;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_FOR__ITERATOR = 0;

	/**
	 * The feature id for the '<em><b>Domain Class Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_FOR__DOMAIN_CLASS_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Switch</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_FOR__SWITCH = 2;

	/**
	 * The number of structural features of the '<em>EEF Dynamic Mapping For</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_FOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFDynamicMappingSwitchImpl
	 * <em>EEF Dynamic Mapping Switch</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFDynamicMappingSwitchImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFDynamicMappingSwitch()
	 * @generated
	 */
	int EEF_DYNAMIC_MAPPING_SWITCH = 11;

	/**
	 * The feature id for the '<em><b>Switch Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_SWITCH__SWITCH_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_SWITCH__CASES = 1;

	/**
	 * The number of structural features of the '<em>EEF Dynamic Mapping Switch</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_SWITCH_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFDynamicMappingCaseImpl
	 * <em>EEF Dynamic Mapping Case</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFDynamicMappingCaseImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFDynamicMappingCase()
	 * @generated
	 */
	int EEF_DYNAMIC_MAPPING_CASE = 12;

	/**
	 * The feature id for the '<em><b>Case Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_CASE__CASE_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_CASE__WIDGET = 1;

	/**
	 * The number of structural features of the '<em>EEF Dynamic Mapping Case</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_CASE_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFViewDescription <em>EEF View Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF View Description</em>'.
	 * @see org.eclipse.eef.EEFViewDescription
	 * @generated
	 */
	EClass getEEFViewDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFViewDescription#getIdentifier
	 * <em>Identifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.EEFViewDescription#getIdentifier()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EAttribute getEEFViewDescription_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFViewDescription#getLabelExpression
	 * <em>Label Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Label Expression</em>'.
	 * @see org.eclipse.eef.EEFViewDescription#getLabelExpression()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EAttribute getEEFViewDescription_LabelExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFViewDescription#getGroups
	 * <em>Groups</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.eclipse.eef.EEFViewDescription#getGroups()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EReference getEEFViewDescription_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFViewDescription#getPages
	 * <em>Pages</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see org.eclipse.eef.EEFViewDescription#getPages()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EReference getEEFViewDescription_Pages();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.eef.EEFViewDescription#getEPackages
	 * <em>EPackages</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>EPackages</em>'.
	 * @see org.eclipse.eef.EEFViewDescription#getEPackages()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EReference getEEFViewDescription_EPackages();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFPageDescription <em>EEF Page Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Page Description</em>'.
	 * @see org.eclipse.eef.EEFPageDescription
	 * @generated
	 */
	EClass getEEFPageDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFPageDescription#getIdentifier
	 * <em>Identifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.EEFPageDescription#getIdentifier()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EAttribute getEEFPageDescription_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFPageDescription#getLabelExpression
	 * <em>Label Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Label Expression</em>'.
	 * @see org.eclipse.eef.EEFPageDescription#getLabelExpression()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EAttribute getEEFPageDescription_LabelExpression();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.eef.EEFPageDescription#getSemanticCandidateExpression <em>Semantic Candidate Expression</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Semantic Candidate Expression</em>'.
	 * @see org.eclipse.eef.EEFPageDescription#getSemanticCandidateExpression()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EAttribute getEEFPageDescription_SemanticCandidateExpression();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.eef.EEFPageDescription#getGroups
	 * <em>Groups</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see org.eclipse.eef.EEFPageDescription#getGroups()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EReference getEEFPageDescription_Groups();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFGroupDescription <em>EEF Group Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Group Description</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription
	 * @generated
	 */
	EClass getEEFGroupDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGroupDescription#getIdentifier
	 * <em>Identifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getIdentifier()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EAttribute getEEFGroupDescription_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGroupDescription#getLabelExpression
	 * <em>Label Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Label Expression</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getLabelExpression()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EAttribute getEEFGroupDescription_LabelExpression();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.eef.EEFGroupDescription#getSemanticCandidateExpression <em>Semantic Candidate Expression</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Semantic Candidate Expression</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getSemanticCandidateExpression()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EAttribute getEEFGroupDescription_SemanticCandidateExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFGroupDescription#getContainer
	 * <em>Container</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Container</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getContainer()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EReference getEEFGroupDescription_Container();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFContainerDescription
	 * <em>EEF Container Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Container Description</em>'.
	 * @see org.eclipse.eef.EEFContainerDescription
	 * @generated
	 */
	EClass getEEFContainerDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFContainerDescription#getIdentifier
	 * <em>Identifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.EEFContainerDescription#getIdentifier()
	 * @see #getEEFContainerDescription()
	 * @generated
	 */
	EAttribute getEEFContainerDescription_Identifier();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFContainerDescription#getWidgets <em>Widgets</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see org.eclipse.eef.EEFContainerDescription#getWidgets()
	 * @see #getEEFContainerDescription()
	 * @generated
	 */
	EReference getEEFContainerDescription_Widgets();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFContainerDescription#getDynamicMappings <em>Dynamic Mappings</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Dynamic Mappings</em>'.
	 * @see org.eclipse.eef.EEFContainerDescription#getDynamicMappings()
	 * @see #getEEFContainerDescription()
	 * @generated
	 */
	EReference getEEFContainerDescription_DynamicMappings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFWidgetDescription <em>EEF Widget Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Widget Description</em>'.
	 * @see org.eclipse.eef.EEFWidgetDescription
	 * @generated
	 */
	EClass getEEFWidgetDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFWidgetDescription#getIdentifier
	 * <em>Identifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.EEFWidgetDescription#getIdentifier()
	 * @see #getEEFWidgetDescription()
	 * @generated
	 */
	EAttribute getEEFWidgetDescription_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFWidgetDescription#getLabelExpression
	 * <em>Label Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Label Expression</em>'.
	 * @see org.eclipse.eef.EEFWidgetDescription#getLabelExpression()
	 * @see #getEEFWidgetDescription()
	 * @generated
	 */
	EAttribute getEEFWidgetDescription_LabelExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFTextDescription <em>EEF Text Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Text Description</em>'.
	 * @see org.eclipse.eef.EEFTextDescription
	 * @generated
	 */
	EClass getEEFTextDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTextDescription#getValueExpression
	 * <em>Value Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.EEFTextDescription#getValueExpression()
	 * @see #getEEFTextDescription()
	 * @generated
	 */
	EAttribute getEEFTextDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTextDescription#getEditExpression
	 * <em>Edit Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.EEFTextDescription#getEditExpression()
	 * @see #getEEFTextDescription()
	 * @generated
	 */
	EAttribute getEEFTextDescription_EditExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTextDescription#getLineCount
	 * <em>Line Count</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Line Count</em>'.
	 * @see org.eclipse.eef.EEFTextDescription#getLineCount()
	 * @see #getEEFTextDescription()
	 * @generated
	 */
	EAttribute getEEFTextDescription_LineCount();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFLabelDescription <em>EEF Label Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Label Description</em>'.
	 * @see org.eclipse.eef.EEFLabelDescription
	 * @generated
	 */
	EClass getEEFLabelDescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFButtonDescription <em>EEF Button Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Button Description</em>'.
	 * @see org.eclipse.eef.EEFButtonDescription
	 * @generated
	 */
	EClass getEEFButtonDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFButtonDescription#getButtonLabelExpression
	 * <em>Button Label Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Button Label Expression</em>'.
	 * @see org.eclipse.eef.EEFButtonDescription#getButtonLabelExpression()
	 * @see #getEEFButtonDescription()
	 * @generated
	 */
	EAttribute getEEFButtonDescription_ButtonLabelExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFButtonDescription#getPushExpression
	 * <em>Push Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Push Expression</em>'.
	 * @see org.eclipse.eef.EEFButtonDescription#getPushExpression()
	 * @see #getEEFButtonDescription()
	 * @generated
	 */
	EAttribute getEEFButtonDescription_PushExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFCheckboxDescription
	 * <em>EEF Checkbox Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Checkbox Description</em>'.
	 * @see org.eclipse.eef.EEFCheckboxDescription
	 * @generated
	 */
	EClass getEEFCheckboxDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFCheckboxDescription#getValueExpression
	 * <em>Value Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.EEFCheckboxDescription#getValueExpression()
	 * @see #getEEFCheckboxDescription()
	 * @generated
	 */
	EAttribute getEEFCheckboxDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFCheckboxDescription#getEditExpression
	 * <em>Edit Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.EEFCheckboxDescription#getEditExpression()
	 * @see #getEEFCheckboxDescription()
	 * @generated
	 */
	EAttribute getEEFCheckboxDescription_EditExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFSelectDescription <em>EEF Select Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Select Description</em>'.
	 * @see org.eclipse.eef.EEFSelectDescription
	 * @generated
	 */
	EClass getEEFSelectDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFSelectDescription#getValueExpression
	 * <em>Value Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.EEFSelectDescription#getValueExpression()
	 * @see #getEEFSelectDescription()
	 * @generated
	 */
	EAttribute getEEFSelectDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFSelectDescription#getEditExpression
	 * <em>Edit Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.EEFSelectDescription#getEditExpression()
	 * @see #getEEFSelectDescription()
	 * @generated
	 */
	EAttribute getEEFSelectDescription_EditExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFSelectDescription#getCandidatesExpression
	 * <em>Candidates Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Candidates Expression</em>'.
	 * @see org.eclipse.eef.EEFSelectDescription#getCandidatesExpression()
	 * @see #getEEFSelectDescription()
	 * @generated
	 */
	EAttribute getEEFSelectDescription_CandidatesExpression();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.eef.EEFSelectDescription#getCandidateDisplayExpression <em>Candidate Display Expression</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Candidate Display Expression</em>'.
	 * @see org.eclipse.eef.EEFSelectDescription#getCandidateDisplayExpression()
	 * @see #getEEFSelectDescription()
	 * @generated
	 */
	EAttribute getEEFSelectDescription_CandidateDisplayExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFDynamicMappingFor <em>EEF Dynamic Mapping For</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Dynamic Mapping For</em>'.
	 * @see org.eclipse.eef.EEFDynamicMappingFor
	 * @generated
	 */
	EClass getEEFDynamicMappingFor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFDynamicMappingFor#getIterator
	 * <em>Iterator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Iterator</em>'.
	 * @see org.eclipse.eef.EEFDynamicMappingFor#getIterator()
	 * @see #getEEFDynamicMappingFor()
	 * @generated
	 */
	EAttribute getEEFDynamicMappingFor_Iterator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFDynamicMappingFor#getDomainClassExpression
	 * <em>Domain Class Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Domain Class Expression</em>'.
	 * @see org.eclipse.eef.EEFDynamicMappingFor#getDomainClassExpression()
	 * @see #getEEFDynamicMappingFor()
	 * @generated
	 */
	EAttribute getEEFDynamicMappingFor_DomainClassExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFDynamicMappingFor#getSwitch
	 * <em>Switch</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Switch</em>'.
	 * @see org.eclipse.eef.EEFDynamicMappingFor#getSwitch()
	 * @see #getEEFDynamicMappingFor()
	 * @generated
	 */
	EReference getEEFDynamicMappingFor_Switch();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFDynamicMappingSwitch
	 * <em>EEF Dynamic Mapping Switch</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Dynamic Mapping Switch</em>'.
	 * @see org.eclipse.eef.EEFDynamicMappingSwitch
	 * @generated
	 */
	EClass getEEFDynamicMappingSwitch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFDynamicMappingSwitch#getSwitchExpression
	 * <em>Switch Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Switch Expression</em>'.
	 * @see org.eclipse.eef.EEFDynamicMappingSwitch#getSwitchExpression()
	 * @see #getEEFDynamicMappingSwitch()
	 * @generated
	 */
	EAttribute getEEFDynamicMappingSwitch_SwitchExpression();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFDynamicMappingSwitch#getCases <em>Cases</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.eclipse.eef.EEFDynamicMappingSwitch#getCases()
	 * @see #getEEFDynamicMappingSwitch()
	 * @generated
	 */
	EReference getEEFDynamicMappingSwitch_Cases();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFDynamicMappingCase
	 * <em>EEF Dynamic Mapping Case</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Dynamic Mapping Case</em>'.
	 * @see org.eclipse.eef.EEFDynamicMappingCase
	 * @generated
	 */
	EClass getEEFDynamicMappingCase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFDynamicMappingCase#getCaseExpression
	 * <em>Case Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Case Expression</em>'.
	 * @see org.eclipse.eef.EEFDynamicMappingCase#getCaseExpression()
	 * @see #getEEFDynamicMappingCase()
	 * @generated
	 */
	EAttribute getEEFDynamicMappingCase_CaseExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFDynamicMappingCase#getWidget
	 * <em>Widget</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Widget</em>'.
	 * @see org.eclipse.eef.EEFDynamicMappingCase#getWidget()
	 * @see #getEEFDynamicMappingCase()
	 * @generated
	 */
	EReference getEEFDynamicMappingCase_Widget();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EefFactory getEefFactory();

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
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFViewDescriptionImpl
		 * <em>EEF View Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFViewDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFViewDescription()
		 * @generated
		 */
		EClass EEF_VIEW_DESCRIPTION = EefPackage.eINSTANCE.getEEFViewDescription();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_VIEW_DESCRIPTION__IDENTIFIER = EefPackage.eINSTANCE.getEEFViewDescription_Identifier();

		/**
		 * The meta object literal for the '<em><b>Label Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION = EefPackage.eINSTANCE.getEEFViewDescription_LabelExpression();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_VIEW_DESCRIPTION__GROUPS = EefPackage.eINSTANCE.getEEFViewDescription_Groups();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_VIEW_DESCRIPTION__PAGES = EefPackage.eINSTANCE.getEEFViewDescription_Pages();

		/**
		 * The meta object literal for the '<em><b>EPackages</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_VIEW_DESCRIPTION__EPACKAGES = EefPackage.eINSTANCE.getEEFViewDescription_EPackages();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFPageDescriptionImpl
		 * <em>EEF Page Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFPageDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFPageDescription()
		 * @generated
		 */
		EClass EEF_PAGE_DESCRIPTION = EefPackage.eINSTANCE.getEEFPageDescription();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_PAGE_DESCRIPTION__IDENTIFIER = EefPackage.eINSTANCE.getEEFPageDescription_Identifier();

		/**
		 * The meta object literal for the '<em><b>Label Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_PAGE_DESCRIPTION__LABEL_EXPRESSION = EefPackage.eINSTANCE.getEEFPageDescription_LabelExpression();

		/**
		 * The meta object literal for the '<em><b>Semantic Candidate Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION = EefPackage.eINSTANCE.getEEFPageDescription_SemanticCandidateExpression();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_PAGE_DESCRIPTION__GROUPS = EefPackage.eINSTANCE.getEEFPageDescription_Groups();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFGroupDescriptionImpl
		 * <em>EEF Group Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFGroupDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFGroupDescription()
		 * @generated
		 */
		EClass EEF_GROUP_DESCRIPTION = EefPackage.eINSTANCE.getEEFGroupDescription();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_GROUP_DESCRIPTION__IDENTIFIER = EefPackage.eINSTANCE.getEEFGroupDescription_Identifier();

		/**
		 * The meta object literal for the '<em><b>Label Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_GROUP_DESCRIPTION__LABEL_EXPRESSION = EefPackage.eINSTANCE.getEEFGroupDescription_LabelExpression();

		/**
		 * The meta object literal for the '<em><b>Semantic Candidate Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_GROUP_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION = EefPackage.eINSTANCE.getEEFGroupDescription_SemanticCandidateExpression();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_GROUP_DESCRIPTION__CONTAINER = EefPackage.eINSTANCE.getEEFGroupDescription_Container();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFContainerDescriptionImpl
		 * <em>EEF Container Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFContainerDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFContainerDescription()
		 * @generated
		 */
		EClass EEF_CONTAINER_DESCRIPTION = EefPackage.eINSTANCE.getEEFContainerDescription();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_CONTAINER_DESCRIPTION__IDENTIFIER = EefPackage.eINSTANCE.getEEFContainerDescription_Identifier();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_CONTAINER_DESCRIPTION__WIDGETS = EefPackage.eINSTANCE.getEEFContainerDescription_Widgets();

		/**
		 * The meta object literal for the '<em><b>Dynamic Mappings</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_CONTAINER_DESCRIPTION__DYNAMIC_MAPPINGS = EefPackage.eINSTANCE.getEEFContainerDescription_DynamicMappings();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFWidgetDescriptionImpl
		 * <em>EEF Widget Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFWidgetDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFWidgetDescription()
		 * @generated
		 */
		EClass EEF_WIDGET_DESCRIPTION = EefPackage.eINSTANCE.getEEFWidgetDescription();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_WIDGET_DESCRIPTION__IDENTIFIER = EefPackage.eINSTANCE.getEEFWidgetDescription_Identifier();

		/**
		 * The meta object literal for the '<em><b>Label Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION = EefPackage.eINSTANCE.getEEFWidgetDescription_LabelExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFTextDescriptionImpl
		 * <em>EEF Text Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFTextDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTextDescription()
		 * @generated
		 */
		EClass EEF_TEXT_DESCRIPTION = EefPackage.eINSTANCE.getEEFTextDescription();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_TEXT_DESCRIPTION__VALUE_EXPRESSION = EefPackage.eINSTANCE.getEEFTextDescription_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Edit Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION = EefPackage.eINSTANCE.getEEFTextDescription_EditExpression();

		/**
		 * The meta object literal for the '<em><b>Line Count</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_TEXT_DESCRIPTION__LINE_COUNT = EefPackage.eINSTANCE.getEEFTextDescription_LineCount();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFLabelDescriptionImpl
		 * <em>EEF Label Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFLabelDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLabelDescription()
		 * @generated
		 */
		EClass EEF_LABEL_DESCRIPTION = EefPackage.eINSTANCE.getEEFLabelDescription();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFButtonDescriptionImpl
		 * <em>EEF Button Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFButtonDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFButtonDescription()
		 * @generated
		 */
		EClass EEF_BUTTON_DESCRIPTION = EefPackage.eINSTANCE.getEEFButtonDescription();

		/**
		 * The meta object literal for the '<em><b>Button Label Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_BUTTON_DESCRIPTION__BUTTON_LABEL_EXPRESSION = EefPackage.eINSTANCE.getEEFButtonDescription_ButtonLabelExpression();

		/**
		 * The meta object literal for the '<em><b>Push Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_BUTTON_DESCRIPTION__PUSH_EXPRESSION = EefPackage.eINSTANCE.getEEFButtonDescription_PushExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFCheckboxDescriptionImpl
		 * <em>EEF Checkbox Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFCheckboxDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCheckboxDescription()
		 * @generated
		 */
		EClass EEF_CHECKBOX_DESCRIPTION = EefPackage.eINSTANCE.getEEFCheckboxDescription();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_CHECKBOX_DESCRIPTION__VALUE_EXPRESSION = EefPackage.eINSTANCE.getEEFCheckboxDescription_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Edit Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_CHECKBOX_DESCRIPTION__EDIT_EXPRESSION = EefPackage.eINSTANCE.getEEFCheckboxDescription_EditExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFSelectDescriptionImpl
		 * <em>EEF Select Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFSelectDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFSelectDescription()
		 * @generated
		 */
		EClass EEF_SELECT_DESCRIPTION = EefPackage.eINSTANCE.getEEFSelectDescription();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_SELECT_DESCRIPTION__VALUE_EXPRESSION = EefPackage.eINSTANCE.getEEFSelectDescription_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Edit Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_SELECT_DESCRIPTION__EDIT_EXPRESSION = EefPackage.eINSTANCE.getEEFSelectDescription_EditExpression();

		/**
		 * The meta object literal for the '<em><b>Candidates Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_SELECT_DESCRIPTION__CANDIDATES_EXPRESSION = EefPackage.eINSTANCE.getEEFSelectDescription_CandidatesExpression();

		/**
		 * The meta object literal for the '<em><b>Candidate Display Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_SELECT_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION = EefPackage.eINSTANCE.getEEFSelectDescription_CandidateDisplayExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFDynamicMappingForImpl
		 * <em>EEF Dynamic Mapping For</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFDynamicMappingForImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFDynamicMappingFor()
		 * @generated
		 */
		EClass EEF_DYNAMIC_MAPPING_FOR = EefPackage.eINSTANCE.getEEFDynamicMappingFor();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_DYNAMIC_MAPPING_FOR__ITERATOR = EefPackage.eINSTANCE.getEEFDynamicMappingFor_Iterator();

		/**
		 * The meta object literal for the '<em><b>Domain Class Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_DYNAMIC_MAPPING_FOR__DOMAIN_CLASS_EXPRESSION = EefPackage.eINSTANCE.getEEFDynamicMappingFor_DomainClassExpression();

		/**
		 * The meta object literal for the '<em><b>Switch</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_DYNAMIC_MAPPING_FOR__SWITCH = EefPackage.eINSTANCE.getEEFDynamicMappingFor_Switch();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFDynamicMappingSwitchImpl
		 * <em>EEF Dynamic Mapping Switch</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFDynamicMappingSwitchImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFDynamicMappingSwitch()
		 * @generated
		 */
		EClass EEF_DYNAMIC_MAPPING_SWITCH = EefPackage.eINSTANCE.getEEFDynamicMappingSwitch();

		/**
		 * The meta object literal for the '<em><b>Switch Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_DYNAMIC_MAPPING_SWITCH__SWITCH_EXPRESSION = EefPackage.eINSTANCE.getEEFDynamicMappingSwitch_SwitchExpression();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_DYNAMIC_MAPPING_SWITCH__CASES = EefPackage.eINSTANCE.getEEFDynamicMappingSwitch_Cases();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFDynamicMappingCaseImpl
		 * <em>EEF Dynamic Mapping Case</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFDynamicMappingCaseImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFDynamicMappingCase()
		 * @generated
		 */
		EClass EEF_DYNAMIC_MAPPING_CASE = EefPackage.eINSTANCE.getEEFDynamicMappingCase();

		/**
		 * The meta object literal for the '<em><b>Case Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_DYNAMIC_MAPPING_CASE__CASE_EXPRESSION = EefPackage.eINSTANCE.getEEFDynamicMappingCase_CaseExpression();

		/**
		 * The meta object literal for the '<em><b>Widget</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_DYNAMIC_MAPPING_CASE__WIDGET = EefPackage.eINSTANCE.getEEFDynamicMappingCase_Widget();

	}

} // EefPackage
