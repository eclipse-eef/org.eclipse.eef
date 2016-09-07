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
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Image Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__IMAGE_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__GROUPS = 3;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__PAGES = 4;

	/**
	 * The feature id for the '<em><b>EPackages</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__EPACKAGES = 5;

	/**
	 * The number of structural features of the '<em>EEF View Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION_FEATURE_COUNT = 6;

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
	 * The feature id for the '<em><b>Domain Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__DOMAIN_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Semantic Candidate Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__PRECONDITION_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__GROUPS = 5;

	/**
	 * The feature id for the '<em><b>Semantic Validation Rules</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__SEMANTIC_VALIDATION_RULES = 6;

	/**
	 * The number of structural features of the '<em>EEF Page Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFValidationRuleDescriptionImpl
	 * <em>EEF Validation Rule Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFValidationRuleDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFValidationRuleDescription()
	 * @generated
	 */
	int EEF_VALIDATION_RULE_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_VALIDATION_RULE_DESCRIPTION__SEVERITY = 0;

	/**
	 * The feature id for the '<em><b>Message Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_VALIDATION_RULE_DESCRIPTION__MESSAGE_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Audits</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_VALIDATION_RULE_DESCRIPTION__AUDITS = 2;

	/**
	 * The feature id for the '<em><b>Fixes</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_VALIDATION_RULE_DESCRIPTION__FIXES = 3;

	/**
	 * The number of structural features of the '<em>EEF Validation Rule Description</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_VALIDATION_RULE_DESCRIPTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFRuleAuditDescriptionImpl
	 * <em>EEF Rule Audit Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFRuleAuditDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFRuleAuditDescription()
	 * @generated
	 */
	int EEF_RULE_AUDIT_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Audit Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RULE_AUDIT_DESCRIPTION__AUDIT_EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>EEF Rule Audit Description</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RULE_AUDIT_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFValidationFixDescriptionImpl
	 * <em>EEF Validation Fix Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFValidationFixDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFValidationFixDescription()
	 * @generated
	 */
	int EEF_VALIDATION_FIX_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_VALIDATION_FIX_DESCRIPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fix Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_VALIDATION_FIX_DESCRIPTION__FIX_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>EEF Validation Fix Description</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_VALIDATION_FIX_DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFPropertyValidationRuleDescriptionImpl
	 * <em>EEF Property Validation Rule Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFPropertyValidationRuleDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFPropertyValidationRuleDescription()
	 * @generated
	 */
	int EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION__SEVERITY = EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Message Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION__MESSAGE_EXPRESSION = EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__MESSAGE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Audits</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION__AUDITS = EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__AUDITS;

	/**
	 * The feature id for the '<em><b>Fixes</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION__FIXES = EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__FIXES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION__TARGETS = EefPackage.EEF_VALIDATION_RULE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Property Validation Rule Description</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_VALIDATION_RULE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFSemanticValidationRuleDescriptionImpl
	 * <em>EEF Semantic Validation Rule Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFSemanticValidationRuleDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFSemanticValidationRuleDescription()
	 * @generated
	 */
	int EEF_SEMANTIC_VALIDATION_RULE_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SEMANTIC_VALIDATION_RULE_DESCRIPTION__SEVERITY = EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__SEVERITY;

	/**
	 * The feature id for the '<em><b>Message Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SEMANTIC_VALIDATION_RULE_DESCRIPTION__MESSAGE_EXPRESSION = EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__MESSAGE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Audits</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SEMANTIC_VALIDATION_RULE_DESCRIPTION__AUDITS = EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__AUDITS;

	/**
	 * The feature id for the '<em><b>Fixes</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SEMANTIC_VALIDATION_RULE_DESCRIPTION__FIXES = EefPackage.EEF_VALIDATION_RULE_DESCRIPTION__FIXES;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SEMANTIC_VALIDATION_RULE_DESCRIPTION__TARGET_CLASS = EefPackage.EEF_VALIDATION_RULE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Semantic Validation Rule Description</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SEMANTIC_VALIDATION_RULE_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_VALIDATION_RULE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFGroupDescriptionImpl <em>EEF Group Description</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFGroupDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFGroupDescription()
	 * @generated
	 */
	int EEF_GROUP_DESCRIPTION = 7;

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
	 * The feature id for the '<em><b>Domain Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__DOMAIN_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Semantic Candidate Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__PRECONDITION_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__CONTROLS = 5;

	/**
	 * The feature id for the '<em><b>Semantic Validation Rules</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__SEMANTIC_VALIDATION_RULES = 6;

	/**
	 * The feature id for the '<em><b>Property Validation Rules</b></em>' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__PROPERTY_VALIDATION_RULES = 7;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__STYLE = 8;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__CONDITIONAL_STYLES = 9;

	/**
	 * The number of structural features of the '<em>EEF Group Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFControlDescriptionImpl
	 * <em>EEF Control Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFControlDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFControlDescription()
	 * @generated
	 */
	int EEF_CONTROL_DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CONTROL_DESCRIPTION__IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>EEF Control Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CONTROL_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFContainerDescriptionImpl
	 * <em>EEF Container Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFContainerDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFContainerDescription()
	 * @generated
	 */
	int EEF_CONTAINER_DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__IDENTIFIER = EefPackage.EEF_CONTROL_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__CONTROLS = EefPackage.EEF_CONTROL_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__LAYOUT = EefPackage.EEF_CONTROL_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEF Container Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_CONTROL_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFLayoutDescriptionImpl <em>EEF Layout Description</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFLayoutDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLayoutDescription()
	 * @generated
	 */
	int EEF_LAYOUT_DESCRIPTION = 10;

	/**
	 * The number of structural features of the '<em>EEF Layout Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LAYOUT_DESCRIPTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFFillLayoutDescriptionImpl
	 * <em>EEF Fill Layout Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFFillLayoutDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFFillLayoutDescription()
	 * @generated
	 */
	int EEF_FILL_LAYOUT_DESCRIPTION = 11;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_FILL_LAYOUT_DESCRIPTION__ORIENTATION = EefPackage.EEF_LAYOUT_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Fill Layout Description</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_FILL_LAYOUT_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_LAYOUT_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFGridLayoutDescriptionImpl
	 * <em>EEF Grid Layout Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFGridLayoutDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFGridLayoutDescription()
	 * @generated
	 */
	int EEF_GRID_LAYOUT_DESCRIPTION = 12;

	/**
	 * The feature id for the '<em><b>Number Of Columns</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GRID_LAYOUT_DESCRIPTION__NUMBER_OF_COLUMNS = EefPackage.EEF_LAYOUT_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Make Columns With Equal Width</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GRID_LAYOUT_DESCRIPTION__MAKE_COLUMNS_WITH_EQUAL_WIDTH = EefPackage.EEF_LAYOUT_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEF Grid Layout Description</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GRID_LAYOUT_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_LAYOUT_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFWidgetDescriptionImpl <em>EEF Widget Description</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFWidgetDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFWidgetDescription()
	 * @generated
	 */
	int EEF_WIDGET_DESCRIPTION = 13;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__IDENTIFIER = EefPackage.EEF_CONTROL_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION = EefPackage.EEF_CONTROL_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION = EefPackage.EEF_CONTROL_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION = EefPackage.EEF_CONTROL_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property Validation Rules</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES = EefPackage.EEF_CONTROL_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EEF Widget Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_CONTROL_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTextDescriptionImpl <em>EEF Text Description</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFTextDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTextDescription()
	 * @generated
	 */
	int EEF_TEXT_DESCRIPTION = 14;

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
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__HELP_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__IS_ENABLED_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Property Validation Rules</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__PROPERTY_VALIDATION_RULES = EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES;

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
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__STYLE = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EEF Text Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFLabelDescriptionImpl <em>EEF Label Description</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFLabelDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLabelDescription()
	 * @generated
	 */
	int EEF_LABEL_DESCRIPTION = 15;

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
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__HELP_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__IS_ENABLED_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Property Validation Rules</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__PROPERTY_VALIDATION_RULES = EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__VALUE_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__DISPLAY_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__STYLE = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__ACTIONS = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EEF Label Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFButtonDescriptionImpl <em>EEF Button Description</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFButtonDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFButtonDescription()
	 * @generated
	 */
	int EEF_BUTTON_DESCRIPTION = 16;

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
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_DESCRIPTION__HELP_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_DESCRIPTION__IS_ENABLED_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Property Validation Rules</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_DESCRIPTION__PROPERTY_VALIDATION_RULES = EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES;

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
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_DESCRIPTION__STYLE = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EEF Button Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFCheckboxDescriptionImpl
	 * <em>EEF Checkbox Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFCheckboxDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCheckboxDescription()
	 * @generated
	 */
	int EEF_CHECKBOX_DESCRIPTION = 17;

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
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__HELP_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__IS_ENABLED_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Property Validation Rules</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__PROPERTY_VALIDATION_RULES = EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES;

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
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__STYLE = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EEF Checkbox Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFSelectDescriptionImpl <em>EEF Select Description</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFSelectDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFSelectDescription()
	 * @generated
	 */
	int EEF_SELECT_DESCRIPTION = 18;

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
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__HELP_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__IS_ENABLED_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Property Validation Rules</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__PROPERTY_VALIDATION_RULES = EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES;

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
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__STYLE = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EEF Select Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFRadioDescriptionImpl <em>EEF Radio Description</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFRadioDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFRadioDescription()
	 * @generated
	 */
	int EEF_RADIO_DESCRIPTION = 19;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__IDENTIFIER = EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__LABEL_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__HELP_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__IS_ENABLED_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Property Validation Rules</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__PROPERTY_VALIDATION_RULES = EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__VALUE_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edit Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__EDIT_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Candidates Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__CANDIDATES_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Candidate Display Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__STYLE = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Number Of Columns</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__NUMBER_OF_COLUMNS = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>EEF Radio Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFHyperlinkDescriptionImpl
	 * <em>EEF Hyperlink Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFHyperlinkDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFHyperlinkDescription()
	 * @generated
	 */
	int EEF_HYPERLINK_DESCRIPTION = 20;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_DESCRIPTION__IDENTIFIER = EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_DESCRIPTION__LABEL_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_DESCRIPTION__HELP_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_DESCRIPTION__IS_ENABLED_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Property Validation Rules</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_DESCRIPTION__PROPERTY_VALIDATION_RULES = EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_DESCRIPTION__VALUE_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_DESCRIPTION__DISPLAY_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Click Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_DESCRIPTION__ON_CLICK_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_DESCRIPTION__STYLE = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_DESCRIPTION__ACTIONS = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EEF Hyperlink Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFDynamicMappingForImpl
	 * <em>EEF Dynamic Mapping For</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFDynamicMappingForImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFDynamicMappingFor()
	 * @generated
	 */
	int EEF_DYNAMIC_MAPPING_FOR = 21;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_FOR__IDENTIFIER = EefPackage.EEF_CONTROL_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_FOR__ITERATOR = EefPackage.EEF_CONTROL_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iterable Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_FOR__ITERABLE_EXPRESSION = EefPackage.EEF_CONTROL_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ifs</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_FOR__IFS = EefPackage.EEF_CONTROL_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EEF Dynamic Mapping For</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_FOR_FEATURE_COUNT = EefPackage.EEF_CONTROL_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFDynamicMappingIfImpl <em>EEF Dynamic Mapping If</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFDynamicMappingIfImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFDynamicMappingIf()
	 * @generated
	 */
	int EEF_DYNAMIC_MAPPING_IF = 22;

	/**
	 * The feature id for the '<em><b>Predicate Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_IF__PREDICATE_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Widget</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_IF__WIDGET = 1;

	/**
	 * The number of structural features of the '<em>EEF Dynamic Mapping If</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_IF_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFCustomWidgetDescriptionImpl
	 * <em>EEF Custom Widget Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFCustomWidgetDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCustomWidgetDescription()
	 * @generated
	 */
	int EEF_CUSTOM_WIDGET_DESCRIPTION = 23;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_WIDGET_DESCRIPTION__IDENTIFIER = EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_WIDGET_DESCRIPTION__LABEL_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_WIDGET_DESCRIPTION__HELP_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Property Validation Rules</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES = EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES;

	/**
	 * The feature id for the '<em><b>Custom Expressions</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_WIDGET_DESCRIPTION__CUSTOM_EXPRESSIONS = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_WIDGET_DESCRIPTION__STYLE = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_WIDGET_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EEF Custom Widget Description</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_WIDGET_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFCustomExpressionImpl <em>EEF Custom Expression</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFCustomExpressionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCustomExpression()
	 * @generated
	 */
	int EEF_CUSTOM_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_EXPRESSION__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Custom Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_EXPRESSION__CUSTOM_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>EEF Custom Expression</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFListDescriptionImpl <em>EEF List Description</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFListDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFListDescription()
	 * @generated
	 */
	int EEF_LIST_DESCRIPTION = 25;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_DESCRIPTION__IDENTIFIER = EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_DESCRIPTION__LABEL_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_DESCRIPTION__HELP_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Is Enabled Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_DESCRIPTION__IS_ENABLED_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Property Validation Rules</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_DESCRIPTION__PROPERTY_VALIDATION_RULES = EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_DESCRIPTION__VALUE_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_DESCRIPTION__DISPLAY_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Click Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_DESCRIPTION__ON_CLICK_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_DESCRIPTION__ACTIONS = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_DESCRIPTION__STYLE = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EEF List Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFWidgetStyleImpl <em>EEF Widget Style</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFWidgetStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFWidgetStyle()
	 * @generated
	 */
	int EEF_WIDGET_STYLE = 26;

	/**
	 * The feature id for the '<em><b>Label Background Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Label Foreground Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Label Font Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Label Font Size Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Label Font Style Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION = 4;

	/**
	 * The number of structural features of the '<em>EEF Widget Style</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_STYLE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTextStyleImpl <em>EEF Text Style</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFTextStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTextStyle()
	 * @generated
	 */
	int EEF_TEXT_STYLE = 27;

	/**
	 * The feature id for the '<em><b>Label Background Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Foreground Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_STYLE__LABEL_FONT_NAME_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Size Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_STYLE__LABEL_FONT_SIZE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Style Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_STYLE__LABEL_FONT_STYLE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Background Color Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_STYLE__BACKGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Foreground Color Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_STYLE__FOREGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_STYLE__FONT_NAME_EXPRESSION = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Font Size Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_STYLE__FONT_SIZE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Font Style Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_STYLE__FONT_STYLE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EEF Text Style</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_STYLE_FEATURE_COUNT = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFLabelStyleImpl <em>EEF Label Style</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFLabelStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLabelStyle()
	 * @generated
	 */
	int EEF_LABEL_STYLE = 28;

	/**
	 * The feature id for the '<em><b>Label Background Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Foreground Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_STYLE__LABEL_FONT_NAME_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Size Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_STYLE__LABEL_FONT_SIZE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Style Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_STYLE__LABEL_FONT_STYLE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Background Color Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_STYLE__BACKGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Foreground Color Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_STYLE__FOREGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_STYLE__FONT_NAME_EXPRESSION = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Font Size Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_STYLE__FONT_SIZE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Font Style Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_STYLE__FONT_STYLE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EEF Label Style</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_STYLE_FEATURE_COUNT = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFButtonStyleImpl <em>EEF Button Style</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFButtonStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFButtonStyle()
	 * @generated
	 */
	int EEF_BUTTON_STYLE = 29;

	/**
	 * The feature id for the '<em><b>Label Background Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Foreground Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_STYLE__LABEL_FONT_NAME_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Size Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_STYLE__LABEL_FONT_SIZE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Style Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_STYLE__LABEL_FONT_STYLE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION;

	/**
	 * The number of structural features of the '<em>EEF Button Style</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_STYLE_FEATURE_COUNT = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFCheckboxStyleImpl <em>EEF Checkbox Style</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFCheckboxStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCheckboxStyle()
	 * @generated
	 */
	int EEF_CHECKBOX_STYLE = 30;

	/**
	 * The feature id for the '<em><b>Label Background Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Foreground Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_STYLE__LABEL_FONT_NAME_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Size Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_STYLE__LABEL_FONT_SIZE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Style Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_STYLE__LABEL_FONT_STYLE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION;

	/**
	 * The number of structural features of the '<em>EEF Checkbox Style</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_STYLE_FEATURE_COUNT = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFSelectStyleImpl <em>EEF Select Style</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFSelectStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFSelectStyle()
	 * @generated
	 */
	int EEF_SELECT_STYLE = 31;

	/**
	 * The feature id for the '<em><b>Label Background Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Foreground Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_STYLE__LABEL_FONT_NAME_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Size Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_STYLE__LABEL_FONT_SIZE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Style Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_STYLE__LABEL_FONT_STYLE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION;

	/**
	 * The number of structural features of the '<em>EEF Select Style</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_STYLE_FEATURE_COUNT = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFRadioStyleImpl <em>EEF Radio Style</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFRadioStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFRadioStyle()
	 * @generated
	 */
	int EEF_RADIO_STYLE = 32;

	/**
	 * The feature id for the '<em><b>Label Background Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Foreground Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_STYLE__LABEL_FONT_NAME_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Size Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_STYLE__LABEL_FONT_SIZE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Style Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_STYLE__LABEL_FONT_STYLE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION;

	/**
	 * The number of structural features of the '<em>EEF Radio Style</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_STYLE_FEATURE_COUNT = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFHyperlinkStyleImpl <em>EEF Hyperlink Style</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFHyperlinkStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFHyperlinkStyle()
	 * @generated
	 */
	int EEF_HYPERLINK_STYLE = 33;

	/**
	 * The feature id for the '<em><b>Label Background Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Foreground Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_STYLE__LABEL_FONT_NAME_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Size Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_STYLE__LABEL_FONT_SIZE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Style Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_STYLE__LABEL_FONT_STYLE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Background Color Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_STYLE__BACKGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_STYLE__FONT_NAME_EXPRESSION = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font Size Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_STYLE__FONT_SIZE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Font Style Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_STYLE__FONT_STYLE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EEF Hyperlink Style</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_STYLE_FEATURE_COUNT = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFCustomWidgetStyleImpl
	 * <em>EEF Custom Widget Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFCustomWidgetStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCustomWidgetStyle()
	 * @generated
	 */
	int EEF_CUSTOM_WIDGET_STYLE = 34;

	/**
	 * The feature id for the '<em><b>Label Background Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Foreground Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Size Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Style Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION;

	/**
	 * The number of structural features of the '<em>EEF Custom Widget Style</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_WIDGET_STYLE_FEATURE_COUNT = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFListStyleImpl <em>EEF List Style</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFListStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFListStyle()
	 * @generated
	 */
	int EEF_LIST_STYLE = 35;

	/**
	 * The feature id for the '<em><b>Label Background Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Foreground Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_STYLE__LABEL_FONT_NAME_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Size Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_STYLE__LABEL_FONT_SIZE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Style Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_STYLE__LABEL_FONT_STYLE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION;

	/**
	 * The number of structural features of the '<em>EEF List Style</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_STYLE_FEATURE_COUNT = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFGroupStyleImpl <em>EEF Group Style</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFGroupStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFGroupStyle()
	 * @generated
	 */
	int EEF_GROUP_STYLE = 36;

	/**
	 * The feature id for the '<em><b>Background Color Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_STYLE__BACKGROUND_COLOR_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Foreground Color Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_STYLE__FOREGROUND_COLOR_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Font Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_STYLE__FONT_NAME_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Font Size Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_STYLE__FONT_SIZE_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Bar Style</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_STYLE__BAR_STYLE = 4;

	/**
	 * The feature id for the '<em><b>Toggle Style</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_STYLE__TOGGLE_STYLE = 5;

	/**
	 * The feature id for the '<em><b>Expanded By Default</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_STYLE__EXPANDED_BY_DEFAULT = 6;

	/**
	 * The number of structural features of the '<em>EEF Group Style</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_STYLE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFConditionalStyleImpl <em>EEF Conditional Style</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFConditionalStyle()
	 * @generated
	 */
	int EEF_CONDITIONAL_STYLE = 37;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>EEF Conditional Style</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CONDITIONAL_STYLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTextConditionalStyleImpl
	 * <em>EEF Text Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFTextConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTextConditionalStyle()
	 * @generated
	 */
	int EEF_TEXT_CONDITIONAL_STYLE = 38;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION = EefPackage.EEF_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_CONDITIONAL_STYLE__STYLE = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Text Conditional Style</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_CONDITIONAL_STYLE_FEATURE_COUNT = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFButtonConditionalStyleImpl
	 * <em>EEF Button Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFButtonConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFButtonConditionalStyle()
	 * @generated
	 */
	int EEF_BUTTON_CONDITIONAL_STYLE = 39;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION = EefPackage.EEF_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_CONDITIONAL_STYLE__STYLE = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Button Conditional Style</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_CONDITIONAL_STYLE_FEATURE_COUNT = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFLabelConditionalStyleImpl
	 * <em>EEF Label Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFLabelConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLabelConditionalStyle()
	 * @generated
	 */
	int EEF_LABEL_CONDITIONAL_STYLE = 40;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION = EefPackage.EEF_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_CONDITIONAL_STYLE__STYLE = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Label Conditional Style</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_CONDITIONAL_STYLE_FEATURE_COUNT = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFCheckboxConditionalStyleImpl
	 * <em>EEF Checkbox Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFCheckboxConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCheckboxConditionalStyle()
	 * @generated
	 */
	int EEF_CHECKBOX_CONDITIONAL_STYLE = 41;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION = EefPackage.EEF_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_CONDITIONAL_STYLE__STYLE = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Checkbox Conditional Style</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_CONDITIONAL_STYLE_FEATURE_COUNT = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFSelectConditionalStyleImpl
	 * <em>EEF Select Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFSelectConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFSelectConditionalStyle()
	 * @generated
	 */
	int EEF_SELECT_CONDITIONAL_STYLE = 42;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION = EefPackage.EEF_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_CONDITIONAL_STYLE__STYLE = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Select Conditional Style</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_CONDITIONAL_STYLE_FEATURE_COUNT = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFRadioConditionalStyleImpl
	 * <em>EEF Radio Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFRadioConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFRadioConditionalStyle()
	 * @generated
	 */
	int EEF_RADIO_CONDITIONAL_STYLE = 43;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION = EefPackage.EEF_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_CONDITIONAL_STYLE__STYLE = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Radio Conditional Style</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_CONDITIONAL_STYLE_FEATURE_COUNT = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFHyperlinkConditionalStyleImpl
	 * <em>EEF Hyperlink Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFHyperlinkConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFHyperlinkConditionalStyle()
	 * @generated
	 */
	int EEF_HYPERLINK_CONDITIONAL_STYLE = 44;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION = EefPackage.EEF_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_CONDITIONAL_STYLE__STYLE = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Hyperlink Conditional Style</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_HYPERLINK_CONDITIONAL_STYLE_FEATURE_COUNT = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFCustomWidgetConditionalStyleImpl
	 * <em>EEF Custom Widget Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFCustomWidgetConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCustomWidgetConditionalStyle()
	 * @generated
	 */
	int EEF_CUSTOM_WIDGET_CONDITIONAL_STYLE = 45;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_WIDGET_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION = EefPackage.EEF_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_WIDGET_CONDITIONAL_STYLE__STYLE = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Custom Widget Conditional Style</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_WIDGET_CONDITIONAL_STYLE_FEATURE_COUNT = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFWidgetActionImpl <em>EEF Widget Action</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFWidgetActionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFWidgetAction()
	 * @generated
	 */
	int EEF_WIDGET_ACTION = 46;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_ACTION__LABEL_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Action Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_ACTION__ACTION_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>EEF Widget Action</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFListConditionalStyleImpl
	 * <em>EEF List Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFListConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFListConditionalStyle()
	 * @generated
	 */
	int EEF_LIST_CONDITIONAL_STYLE = 47;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION = EefPackage.EEF_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_CONDITIONAL_STYLE__STYLE = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF List Conditional Style</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LIST_CONDITIONAL_STYLE_FEATURE_COUNT = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFGroupConditionalStyleImpl
	 * <em>EEF Group Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFGroupConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFGroupConditionalStyle()
	 * @generated
	 */
	int EEF_GROUP_CONDITIONAL_STYLE = 48;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION = EefPackage.EEF_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_CONDITIONAL_STYLE__STYLE = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Group Conditional Style</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_CONDITIONAL_STYLE_FEATURE_COUNT = EefPackage.EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION
	 * <em>EEF VALIDATION SEVERITY DESCRIPTION</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEF_VALIDATION_SEVERITY_DESCRIPTION()
	 * @generated
	 */
	int EEF_VALIDATION_SEVERITY_DESCRIPTION = 49;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.EEF_FILL_LAYOUT_ORIENTATION
	 * <em>EEF FILL LAYOUT ORIENTATION</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.EEF_FILL_LAYOUT_ORIENTATION
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEF_FILL_LAYOUT_ORIENTATION()
	 * @generated
	 */
	int EEF_FILL_LAYOUT_ORIENTATION = 50;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.EEF_TOGGLE_STYLE <em>EEF TOGGLE STYLE</em>}' enum. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.EEF_TOGGLE_STYLE
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEF_TOGGLE_STYLE()
	 * @generated
	 */
	int EEF_TOGGLE_STYLE = 51;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.EEF_TITLE_BAR_STYLE <em>EEF TITLE BAR STYLE</em>}' enum. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.EEF_TITLE_BAR_STYLE
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEF_TITLE_BAR_STYLE()
	 * @generated
	 */
	int EEF_TITLE_BAR_STYLE = 52;

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
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFViewDescription#getImageExpression
	 * <em>Image Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Image Expression</em>'.
	 * @see org.eclipse.eef.EEFViewDescription#getImageExpression()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EAttribute getEEFViewDescription_ImageExpression();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFPageDescription#getDomainClass
	 * <em>Domain Class</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Domain Class</em>'.
	 * @see org.eclipse.eef.EEFPageDescription#getDomainClass()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EAttribute getEEFPageDescription_DomainClass();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFPageDescription#getPreconditionExpression
	 * <em>Precondition Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Precondition Expression</em>'.
	 * @see org.eclipse.eef.EEFPageDescription#getPreconditionExpression()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EAttribute getEEFPageDescription_PreconditionExpression();

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
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFPageDescription#getSemanticValidationRules <em>Semantic Validation Rules</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Semantic Validation Rules</em>'.
	 * @see org.eclipse.eef.EEFPageDescription#getSemanticValidationRules()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EReference getEEFPageDescription_SemanticValidationRules();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFValidationRuleDescription
	 * <em>EEF Validation Rule Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Validation Rule Description</em>'.
	 * @see org.eclipse.eef.EEFValidationRuleDescription
	 * @generated
	 */
	EClass getEEFValidationRuleDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFValidationRuleDescription#getSeverity
	 * <em>Severity</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.eclipse.eef.EEFValidationRuleDescription#getSeverity()
	 * @see #getEEFValidationRuleDescription()
	 * @generated
	 */
	EAttribute getEEFValidationRuleDescription_Severity();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.eef.EEFValidationRuleDescription#getMessageExpression <em>Message Expression</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Message Expression</em>'.
	 * @see org.eclipse.eef.EEFValidationRuleDescription#getMessageExpression()
	 * @see #getEEFValidationRuleDescription()
	 * @generated
	 */
	EAttribute getEEFValidationRuleDescription_MessageExpression();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFValidationRuleDescription#getAudits <em>Audits</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Audits</em>'.
	 * @see org.eclipse.eef.EEFValidationRuleDescription#getAudits()
	 * @see #getEEFValidationRuleDescription()
	 * @generated
	 */
	EReference getEEFValidationRuleDescription_Audits();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFValidationRuleDescription#getFixes <em>Fixes</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Fixes</em>'.
	 * @see org.eclipse.eef.EEFValidationRuleDescription#getFixes()
	 * @see #getEEFValidationRuleDescription()
	 * @generated
	 */
	EReference getEEFValidationRuleDescription_Fixes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFRuleAuditDescription
	 * <em>EEF Rule Audit Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Rule Audit Description</em>'.
	 * @see org.eclipse.eef.EEFRuleAuditDescription
	 * @generated
	 */
	EClass getEEFRuleAuditDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFRuleAuditDescription#getAuditExpression
	 * <em>Audit Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Audit Expression</em>'.
	 * @see org.eclipse.eef.EEFRuleAuditDescription#getAuditExpression()
	 * @see #getEEFRuleAuditDescription()
	 * @generated
	 */
	EAttribute getEEFRuleAuditDescription_AuditExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFValidationFixDescription
	 * <em>EEF Validation Fix Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Validation Fix Description</em>'.
	 * @see org.eclipse.eef.EEFValidationFixDescription
	 * @generated
	 */
	EClass getEEFValidationFixDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFValidationFixDescription#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.eef.EEFValidationFixDescription#getName()
	 * @see #getEEFValidationFixDescription()
	 * @generated
	 */
	EAttribute getEEFValidationFixDescription_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFValidationFixDescription#getFixExpression
	 * <em>Fix Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Fix Expression</em>'.
	 * @see org.eclipse.eef.EEFValidationFixDescription#getFixExpression()
	 * @see #getEEFValidationFixDescription()
	 * @generated
	 */
	EAttribute getEEFValidationFixDescription_FixExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFPropertyValidationRuleDescription
	 * <em>EEF Property Validation Rule Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Property Validation Rule Description</em>'.
	 * @see org.eclipse.eef.EEFPropertyValidationRuleDescription
	 * @generated
	 */
	EClass getEEFPropertyValidationRuleDescription();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.eef.EEFPropertyValidationRuleDescription#getTargets <em>Targets</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see org.eclipse.eef.EEFPropertyValidationRuleDescription#getTargets()
	 * @see #getEEFPropertyValidationRuleDescription()
	 * @generated
	 */
	EReference getEEFPropertyValidationRuleDescription_Targets();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFSemanticValidationRuleDescription
	 * <em>EEF Semantic Validation Rule Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Semantic Validation Rule Description</em>'.
	 * @see org.eclipse.eef.EEFSemanticValidationRuleDescription
	 * @generated
	 */
	EClass getEEFSemanticValidationRuleDescription();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.eef.EEFSemanticValidationRuleDescription#getTargetClass <em>Target Class</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Target Class</em>'.
	 * @see org.eclipse.eef.EEFSemanticValidationRuleDescription#getTargetClass()
	 * @see #getEEFSemanticValidationRuleDescription()
	 * @generated
	 */
	EAttribute getEEFSemanticValidationRuleDescription_TargetClass();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGroupDescription#getDomainClass
	 * <em>Domain Class</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Domain Class</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getDomainClass()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EAttribute getEEFGroupDescription_DomainClass();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGroupDescription#getPreconditionExpression
	 * <em>Precondition Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Precondition Expression</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getPreconditionExpression()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EAttribute getEEFGroupDescription_PreconditionExpression();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFGroupDescription#getControls <em>Controls</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getControls()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EReference getEEFGroupDescription_Controls();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFGroupDescription#getSemanticValidationRules <em>Semantic Validation Rules</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Semantic Validation Rules</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getSemanticValidationRules()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EReference getEEFGroupDescription_SemanticValidationRules();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFGroupDescription#getPropertyValidationRules <em>Property Validation Rules</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Property Validation Rules</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getPropertyValidationRules()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EReference getEEFGroupDescription_PropertyValidationRules();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFGroupDescription#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getStyle()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EReference getEEFGroupDescription_Style();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFGroupDescription#getConditionalStyles <em>Conditional Styles</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Conditional Styles</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getConditionalStyles()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EReference getEEFGroupDescription_ConditionalStyles();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFControlDescription <em>EEF Control Description</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Control Description</em>'.
	 * @see org.eclipse.eef.EEFControlDescription
	 * @generated
	 */
	EClass getEEFControlDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFControlDescription#getIdentifier
	 * <em>Identifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.EEFControlDescription#getIdentifier()
	 * @see #getEEFControlDescription()
	 * @generated
	 */
	EAttribute getEEFControlDescription_Identifier();

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
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFContainerDescription#getControls <em>Controls</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see org.eclipse.eef.EEFContainerDescription#getControls()
	 * @see #getEEFContainerDescription()
	 * @generated
	 */
	EReference getEEFContainerDescription_Controls();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFContainerDescription#getLayout
	 * <em>Layout</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see org.eclipse.eef.EEFContainerDescription#getLayout()
	 * @see #getEEFContainerDescription()
	 * @generated
	 */
	EReference getEEFContainerDescription_Layout();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFLayoutDescription <em>EEF Layout Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Layout Description</em>'.
	 * @see org.eclipse.eef.EEFLayoutDescription
	 * @generated
	 */
	EClass getEEFLayoutDescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFFillLayoutDescription
	 * <em>EEF Fill Layout Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Fill Layout Description</em>'.
	 * @see org.eclipse.eef.EEFFillLayoutDescription
	 * @generated
	 */
	EClass getEEFFillLayoutDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFFillLayoutDescription#getOrientation
	 * <em>Orientation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see org.eclipse.eef.EEFFillLayoutDescription#getOrientation()
	 * @see #getEEFFillLayoutDescription()
	 * @generated
	 */
	EAttribute getEEFFillLayoutDescription_Orientation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFGridLayoutDescription
	 * <em>EEF Grid Layout Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Grid Layout Description</em>'.
	 * @see org.eclipse.eef.EEFGridLayoutDescription
	 * @generated
	 */
	EClass getEEFGridLayoutDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGridLayoutDescription#getNumberOfColumns
	 * <em>Number Of Columns</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Number Of Columns</em>'.
	 * @see org.eclipse.eef.EEFGridLayoutDescription#getNumberOfColumns()
	 * @see #getEEFGridLayoutDescription()
	 * @generated
	 */
	EAttribute getEEFGridLayoutDescription_NumberOfColumns();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.eef.EEFGridLayoutDescription#isMakeColumnsWithEqualWidth
	 * <em>Make Columns With Equal Width</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Make Columns With Equal Width</em>'.
	 * @see org.eclipse.eef.EEFGridLayoutDescription#isMakeColumnsWithEqualWidth()
	 * @see #getEEFGridLayoutDescription()
	 * @generated
	 */
	EAttribute getEEFGridLayoutDescription_MakeColumnsWithEqualWidth();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFWidgetDescription#getHelpExpression
	 * <em>Help Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Help Expression</em>'.
	 * @see org.eclipse.eef.EEFWidgetDescription#getHelpExpression()
	 * @see #getEEFWidgetDescription()
	 * @generated
	 */
	EAttribute getEEFWidgetDescription_HelpExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFWidgetDescription#getIsEnabledExpression
	 * <em>Is Enabled Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Is Enabled Expression</em>'.
	 * @see org.eclipse.eef.EEFWidgetDescription#getIsEnabledExpression()
	 * @see #getEEFWidgetDescription()
	 * @generated
	 */
	EAttribute getEEFWidgetDescription_IsEnabledExpression();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.eclipse.eef.EEFWidgetDescription#getPropertyValidationRules <em>Property Validation Rules</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Property Validation Rules</em>'.
	 * @see org.eclipse.eef.EEFWidgetDescription#getPropertyValidationRules()
	 * @see #getEEFWidgetDescription()
	 * @generated
	 */
	EReference getEEFWidgetDescription_PropertyValidationRules();

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
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFTextDescription#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFTextDescription#getStyle()
	 * @see #getEEFTextDescription()
	 * @generated
	 */
	EReference getEEFTextDescription_Style();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFTextDescription#getConditionalStyles <em>Conditional Styles</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Conditional Styles</em>'.
	 * @see org.eclipse.eef.EEFTextDescription#getConditionalStyles()
	 * @see #getEEFTextDescription()
	 * @generated
	 */
	EReference getEEFTextDescription_ConditionalStyles();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLabelDescription#getValueExpression
	 * <em>Value Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.EEFLabelDescription#getValueExpression()
	 * @see #getEEFLabelDescription()
	 * @generated
	 */
	EAttribute getEEFLabelDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLabelDescription#getDisplayExpression
	 * <em>Display Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Display Expression</em>'.
	 * @see org.eclipse.eef.EEFLabelDescription#getDisplayExpression()
	 * @see #getEEFLabelDescription()
	 * @generated
	 */
	EAttribute getEEFLabelDescription_DisplayExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFLabelDescription#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFLabelDescription#getStyle()
	 * @see #getEEFLabelDescription()
	 * @generated
	 */
	EReference getEEFLabelDescription_Style();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFLabelDescription#getConditionalStyles <em>Conditional Styles</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Conditional Styles</em>'.
	 * @see org.eclipse.eef.EEFLabelDescription#getConditionalStyles()
	 * @see #getEEFLabelDescription()
	 * @generated
	 */
	EReference getEEFLabelDescription_ConditionalStyles();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFLabelDescription#getActions <em>Actions</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.eclipse.eef.EEFLabelDescription#getActions()
	 * @see #getEEFLabelDescription()
	 * @generated
	 */
	EReference getEEFLabelDescription_Actions();

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
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFButtonDescription#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFButtonDescription#getStyle()
	 * @see #getEEFButtonDescription()
	 * @generated
	 */
	EReference getEEFButtonDescription_Style();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFButtonDescription#getConditionalStyles <em>Conditional Styles</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Conditional Styles</em>'.
	 * @see org.eclipse.eef.EEFButtonDescription#getConditionalStyles()
	 * @see #getEEFButtonDescription()
	 * @generated
	 */
	EReference getEEFButtonDescription_ConditionalStyles();

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
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFCheckboxDescription#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFCheckboxDescription#getStyle()
	 * @see #getEEFCheckboxDescription()
	 * @generated
	 */
	EReference getEEFCheckboxDescription_Style();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFCheckboxDescription#getConditionalStyles <em>Conditional Styles</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Conditional Styles</em>'.
	 * @see org.eclipse.eef.EEFCheckboxDescription#getConditionalStyles()
	 * @see #getEEFCheckboxDescription()
	 * @generated
	 */
	EReference getEEFCheckboxDescription_ConditionalStyles();

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
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFSelectDescription#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFSelectDescription#getStyle()
	 * @see #getEEFSelectDescription()
	 * @generated
	 */
	EReference getEEFSelectDescription_Style();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFSelectDescription#getConditionalStyles <em>Conditional Styles</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Conditional Styles</em>'.
	 * @see org.eclipse.eef.EEFSelectDescription#getConditionalStyles()
	 * @see #getEEFSelectDescription()
	 * @generated
	 */
	EReference getEEFSelectDescription_ConditionalStyles();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFRadioDescription <em>EEF Radio Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Radio Description</em>'.
	 * @see org.eclipse.eef.EEFRadioDescription
	 * @generated
	 */
	EClass getEEFRadioDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFRadioDescription#getValueExpression
	 * <em>Value Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.EEFRadioDescription#getValueExpression()
	 * @see #getEEFRadioDescription()
	 * @generated
	 */
	EAttribute getEEFRadioDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFRadioDescription#getEditExpression
	 * <em>Edit Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.EEFRadioDescription#getEditExpression()
	 * @see #getEEFRadioDescription()
	 * @generated
	 */
	EAttribute getEEFRadioDescription_EditExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFRadioDescription#getCandidatesExpression
	 * <em>Candidates Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Candidates Expression</em>'.
	 * @see org.eclipse.eef.EEFRadioDescription#getCandidatesExpression()
	 * @see #getEEFRadioDescription()
	 * @generated
	 */
	EAttribute getEEFRadioDescription_CandidatesExpression();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.eef.EEFRadioDescription#getCandidateDisplayExpression <em>Candidate Display Expression</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Candidate Display Expression</em>'.
	 * @see org.eclipse.eef.EEFRadioDescription#getCandidateDisplayExpression()
	 * @see #getEEFRadioDescription()
	 * @generated
	 */
	EAttribute getEEFRadioDescription_CandidateDisplayExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFRadioDescription#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFRadioDescription#getStyle()
	 * @see #getEEFRadioDescription()
	 * @generated
	 */
	EReference getEEFRadioDescription_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFRadioDescription#getNumberOfColumns
	 * <em>Number Of Columns</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Number Of Columns</em>'.
	 * @see org.eclipse.eef.EEFRadioDescription#getNumberOfColumns()
	 * @see #getEEFRadioDescription()
	 * @generated
	 */
	EAttribute getEEFRadioDescription_NumberOfColumns();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFRadioDescription#getConditionalStyles <em>Conditional Styles</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Conditional Styles</em>'.
	 * @see org.eclipse.eef.EEFRadioDescription#getConditionalStyles()
	 * @see #getEEFRadioDescription()
	 * @generated
	 */
	EReference getEEFRadioDescription_ConditionalStyles();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFHyperlinkDescription
	 * <em>EEF Hyperlink Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Hyperlink Description</em>'.
	 * @see org.eclipse.eef.EEFHyperlinkDescription
	 * @generated
	 */
	EClass getEEFHyperlinkDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFHyperlinkDescription#getValueExpression
	 * <em>Value Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.EEFHyperlinkDescription#getValueExpression()
	 * @see #getEEFHyperlinkDescription()
	 * @generated
	 */
	EAttribute getEEFHyperlinkDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFHyperlinkDescription#getDisplayExpression
	 * <em>Display Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Display Expression</em>'.
	 * @see org.eclipse.eef.EEFHyperlinkDescription#getDisplayExpression()
	 * @see #getEEFHyperlinkDescription()
	 * @generated
	 */
	EAttribute getEEFHyperlinkDescription_DisplayExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFHyperlinkDescription#getOnClickExpression
	 * <em>On Click Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>On Click Expression</em>'.
	 * @see org.eclipse.eef.EEFHyperlinkDescription#getOnClickExpression()
	 * @see #getEEFHyperlinkDescription()
	 * @generated
	 */
	EAttribute getEEFHyperlinkDescription_OnClickExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFHyperlinkDescription#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFHyperlinkDescription#getStyle()
	 * @see #getEEFHyperlinkDescription()
	 * @generated
	 */
	EReference getEEFHyperlinkDescription_Style();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFHyperlinkDescription#getConditionalStyles <em>Conditional Styles</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Conditional Styles</em>'.
	 * @see org.eclipse.eef.EEFHyperlinkDescription#getConditionalStyles()
	 * @see #getEEFHyperlinkDescription()
	 * @generated
	 */
	EReference getEEFHyperlinkDescription_ConditionalStyles();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFHyperlinkDescription#getActions <em>Actions</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.eclipse.eef.EEFHyperlinkDescription#getActions()
	 * @see #getEEFHyperlinkDescription()
	 * @generated
	 */
	EReference getEEFHyperlinkDescription_Actions();

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
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFDynamicMappingFor#getIterableExpression
	 * <em>Iterable Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Iterable Expression</em>'.
	 * @see org.eclipse.eef.EEFDynamicMappingFor#getIterableExpression()
	 * @see #getEEFDynamicMappingFor()
	 * @generated
	 */
	EAttribute getEEFDynamicMappingFor_IterableExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFDynamicMappingFor#getIfs
	 * <em>Ifs</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Ifs</em>'.
	 * @see org.eclipse.eef.EEFDynamicMappingFor#getIfs()
	 * @see #getEEFDynamicMappingFor()
	 * @generated
	 */
	EReference getEEFDynamicMappingFor_Ifs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFDynamicMappingIf <em>EEF Dynamic Mapping If</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Dynamic Mapping If</em>'.
	 * @see org.eclipse.eef.EEFDynamicMappingIf
	 * @generated
	 */
	EClass getEEFDynamicMappingIf();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFDynamicMappingIf#getPredicateExpression
	 * <em>Predicate Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Predicate Expression</em>'.
	 * @see org.eclipse.eef.EEFDynamicMappingIf#getPredicateExpression()
	 * @see #getEEFDynamicMappingIf()
	 * @generated
	 */
	EAttribute getEEFDynamicMappingIf_PredicateExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFDynamicMappingIf#getWidget
	 * <em>Widget</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Widget</em>'.
	 * @see org.eclipse.eef.EEFDynamicMappingIf#getWidget()
	 * @see #getEEFDynamicMappingIf()
	 * @generated
	 */
	EReference getEEFDynamicMappingIf_Widget();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFCustomWidgetDescription
	 * <em>EEF Custom Widget Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Custom Widget Description</em>'.
	 * @see org.eclipse.eef.EEFCustomWidgetDescription
	 * @generated
	 */
	EClass getEEFCustomWidgetDescription();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFCustomWidgetDescription#getCustomExpressions <em>Custom Expressions</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Custom Expressions</em>'.
	 * @see org.eclipse.eef.EEFCustomWidgetDescription#getCustomExpressions()
	 * @see #getEEFCustomWidgetDescription()
	 * @generated
	 */
	EReference getEEFCustomWidgetDescription_CustomExpressions();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.eef.EEFCustomWidgetDescription#getStyle <em>Style</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFCustomWidgetDescription#getStyle()
	 * @see #getEEFCustomWidgetDescription()
	 * @generated
	 */
	EReference getEEFCustomWidgetDescription_Style();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFCustomWidgetDescription#getConditionalStyles <em>Conditional Styles</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Conditional Styles</em>'.
	 * @see org.eclipse.eef.EEFCustomWidgetDescription#getConditionalStyles()
	 * @see #getEEFCustomWidgetDescription()
	 * @generated
	 */
	EReference getEEFCustomWidgetDescription_ConditionalStyles();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFCustomExpression <em>EEF Custom Expression</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Custom Expression</em>'.
	 * @see org.eclipse.eef.EEFCustomExpression
	 * @generated
	 */
	EClass getEEFCustomExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFCustomExpression#getIdentifier
	 * <em>Identifier</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.EEFCustomExpression#getIdentifier()
	 * @see #getEEFCustomExpression()
	 * @generated
	 */
	EAttribute getEEFCustomExpression_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFCustomExpression#getCustomExpression
	 * <em>Custom Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Custom Expression</em>'.
	 * @see org.eclipse.eef.EEFCustomExpression#getCustomExpression()
	 * @see #getEEFCustomExpression()
	 * @generated
	 */
	EAttribute getEEFCustomExpression_CustomExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFListDescription <em>EEF List Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF List Description</em>'.
	 * @see org.eclipse.eef.EEFListDescription
	 * @generated
	 */
	EClass getEEFListDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFListDescription#getValueExpression
	 * <em>Value Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.EEFListDescription#getValueExpression()
	 * @see #getEEFListDescription()
	 * @generated
	 */
	EAttribute getEEFListDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFListDescription#getDisplayExpression
	 * <em>Display Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Display Expression</em>'.
	 * @see org.eclipse.eef.EEFListDescription#getDisplayExpression()
	 * @see #getEEFListDescription()
	 * @generated
	 */
	EAttribute getEEFListDescription_DisplayExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFListDescription#getOnClickExpression
	 * <em>On Click Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>On Click Expression</em>'.
	 * @see org.eclipse.eef.EEFListDescription#getOnClickExpression()
	 * @see #getEEFListDescription()
	 * @generated
	 */
	EAttribute getEEFListDescription_OnClickExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFListDescription#getActions
	 * <em>Actions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.eclipse.eef.EEFListDescription#getActions()
	 * @see #getEEFListDescription()
	 * @generated
	 */
	EReference getEEFListDescription_Actions();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFListDescription#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFListDescription#getStyle()
	 * @see #getEEFListDescription()
	 * @generated
	 */
	EReference getEEFListDescription_Style();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFListDescription#getConditionalStyles <em>Conditional Styles</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Conditional Styles</em>'.
	 * @see org.eclipse.eef.EEFListDescription#getConditionalStyles()
	 * @see #getEEFListDescription()
	 * @generated
	 */
	EReference getEEFListDescription_ConditionalStyles();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFWidgetStyle <em>EEF Widget Style</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Widget Style</em>'.
	 * @see org.eclipse.eef.EEFWidgetStyle
	 * @generated
	 */
	EClass getEEFWidgetStyle();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.eef.EEFWidgetStyle#getLabelBackgroundColorExpression
	 * <em>Label Background Color Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Label Background Color Expression</em>'.
	 * @see org.eclipse.eef.EEFWidgetStyle#getLabelBackgroundColorExpression()
	 * @see #getEEFWidgetStyle()
	 * @generated
	 */
	EAttribute getEEFWidgetStyle_LabelBackgroundColorExpression();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.eef.EEFWidgetStyle#getLabelForegroundColorExpression
	 * <em>Label Foreground Color Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Label Foreground Color Expression</em>'.
	 * @see org.eclipse.eef.EEFWidgetStyle#getLabelForegroundColorExpression()
	 * @see #getEEFWidgetStyle()
	 * @generated
	 */
	EAttribute getEEFWidgetStyle_LabelForegroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFWidgetStyle#getLabelFontNameExpression
	 * <em>Label Font Name Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Label Font Name Expression</em>'.
	 * @see org.eclipse.eef.EEFWidgetStyle#getLabelFontNameExpression()
	 * @see #getEEFWidgetStyle()
	 * @generated
	 */
	EAttribute getEEFWidgetStyle_LabelFontNameExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFWidgetStyle#getLabelFontSizeExpression
	 * <em>Label Font Size Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Label Font Size Expression</em>'.
	 * @see org.eclipse.eef.EEFWidgetStyle#getLabelFontSizeExpression()
	 * @see #getEEFWidgetStyle()
	 * @generated
	 */
	EAttribute getEEFWidgetStyle_LabelFontSizeExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFWidgetStyle#getLabelFontStyleExpression
	 * <em>Label Font Style Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Label Font Style Expression</em>'.
	 * @see org.eclipse.eef.EEFWidgetStyle#getLabelFontStyleExpression()
	 * @see #getEEFWidgetStyle()
	 * @generated
	 */
	EAttribute getEEFWidgetStyle_LabelFontStyleExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFTextStyle <em>EEF Text Style</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Text Style</em>'.
	 * @see org.eclipse.eef.EEFTextStyle
	 * @generated
	 */
	EClass getEEFTextStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTextStyle#getBackgroundColorExpression
	 * <em>Background Color Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Background Color Expression</em>'.
	 * @see org.eclipse.eef.EEFTextStyle#getBackgroundColorExpression()
	 * @see #getEEFTextStyle()
	 * @generated
	 */
	EAttribute getEEFTextStyle_BackgroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTextStyle#getForegroundColorExpression
	 * <em>Foreground Color Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Foreground Color Expression</em>'.
	 * @see org.eclipse.eef.EEFTextStyle#getForegroundColorExpression()
	 * @see #getEEFTextStyle()
	 * @generated
	 */
	EAttribute getEEFTextStyle_ForegroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTextStyle#getFontNameExpression
	 * <em>Font Name Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Font Name Expression</em>'.
	 * @see org.eclipse.eef.EEFTextStyle#getFontNameExpression()
	 * @see #getEEFTextStyle()
	 * @generated
	 */
	EAttribute getEEFTextStyle_FontNameExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTextStyle#getFontSizeExpression
	 * <em>Font Size Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Font Size Expression</em>'.
	 * @see org.eclipse.eef.EEFTextStyle#getFontSizeExpression()
	 * @see #getEEFTextStyle()
	 * @generated
	 */
	EAttribute getEEFTextStyle_FontSizeExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTextStyle#getFontStyleExpression
	 * <em>Font Style Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Font Style Expression</em>'.
	 * @see org.eclipse.eef.EEFTextStyle#getFontStyleExpression()
	 * @see #getEEFTextStyle()
	 * @generated
	 */
	EAttribute getEEFTextStyle_FontStyleExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFLabelStyle <em>EEF Label Style</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Label Style</em>'.
	 * @see org.eclipse.eef.EEFLabelStyle
	 * @generated
	 */
	EClass getEEFLabelStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLabelStyle#getBackgroundColorExpression
	 * <em>Background Color Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Background Color Expression</em>'.
	 * @see org.eclipse.eef.EEFLabelStyle#getBackgroundColorExpression()
	 * @see #getEEFLabelStyle()
	 * @generated
	 */
	EAttribute getEEFLabelStyle_BackgroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLabelStyle#getForegroundColorExpression
	 * <em>Foreground Color Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Foreground Color Expression</em>'.
	 * @see org.eclipse.eef.EEFLabelStyle#getForegroundColorExpression()
	 * @see #getEEFLabelStyle()
	 * @generated
	 */
	EAttribute getEEFLabelStyle_ForegroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLabelStyle#getFontNameExpression
	 * <em>Font Name Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Font Name Expression</em>'.
	 * @see org.eclipse.eef.EEFLabelStyle#getFontNameExpression()
	 * @see #getEEFLabelStyle()
	 * @generated
	 */
	EAttribute getEEFLabelStyle_FontNameExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLabelStyle#getFontSizeExpression
	 * <em>Font Size Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Font Size Expression</em>'.
	 * @see org.eclipse.eef.EEFLabelStyle#getFontSizeExpression()
	 * @see #getEEFLabelStyle()
	 * @generated
	 */
	EAttribute getEEFLabelStyle_FontSizeExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLabelStyle#getFontStyleExpression
	 * <em>Font Style Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Font Style Expression</em>'.
	 * @see org.eclipse.eef.EEFLabelStyle#getFontStyleExpression()
	 * @see #getEEFLabelStyle()
	 * @generated
	 */
	EAttribute getEEFLabelStyle_FontStyleExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFButtonStyle <em>EEF Button Style</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Button Style</em>'.
	 * @see org.eclipse.eef.EEFButtonStyle
	 * @generated
	 */
	EClass getEEFButtonStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFCheckboxStyle <em>EEF Checkbox Style</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Checkbox Style</em>'.
	 * @see org.eclipse.eef.EEFCheckboxStyle
	 * @generated
	 */
	EClass getEEFCheckboxStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFSelectStyle <em>EEF Select Style</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Select Style</em>'.
	 * @see org.eclipse.eef.EEFSelectStyle
	 * @generated
	 */
	EClass getEEFSelectStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFRadioStyle <em>EEF Radio Style</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Radio Style</em>'.
	 * @see org.eclipse.eef.EEFRadioStyle
	 * @generated
	 */
	EClass getEEFRadioStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFHyperlinkStyle <em>EEF Hyperlink Style</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Hyperlink Style</em>'.
	 * @see org.eclipse.eef.EEFHyperlinkStyle
	 * @generated
	 */
	EClass getEEFHyperlinkStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFHyperlinkStyle#getBackgroundColorExpression
	 * <em>Background Color Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Background Color Expression</em>'.
	 * @see org.eclipse.eef.EEFHyperlinkStyle#getBackgroundColorExpression()
	 * @see #getEEFHyperlinkStyle()
	 * @generated
	 */
	EAttribute getEEFHyperlinkStyle_BackgroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFHyperlinkStyle#getFontNameExpression
	 * <em>Font Name Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Font Name Expression</em>'.
	 * @see org.eclipse.eef.EEFHyperlinkStyle#getFontNameExpression()
	 * @see #getEEFHyperlinkStyle()
	 * @generated
	 */
	EAttribute getEEFHyperlinkStyle_FontNameExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFHyperlinkStyle#getFontSizeExpression
	 * <em>Font Size Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Font Size Expression</em>'.
	 * @see org.eclipse.eef.EEFHyperlinkStyle#getFontSizeExpression()
	 * @see #getEEFHyperlinkStyle()
	 * @generated
	 */
	EAttribute getEEFHyperlinkStyle_FontSizeExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFHyperlinkStyle#getFontStyleExpression
	 * <em>Font Style Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Font Style Expression</em>'.
	 * @see org.eclipse.eef.EEFHyperlinkStyle#getFontStyleExpression()
	 * @see #getEEFHyperlinkStyle()
	 * @generated
	 */
	EAttribute getEEFHyperlinkStyle_FontStyleExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFCustomWidgetStyle <em>EEF Custom Widget Style</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Custom Widget Style</em>'.
	 * @see org.eclipse.eef.EEFCustomWidgetStyle
	 * @generated
	 */
	EClass getEEFCustomWidgetStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFListStyle <em>EEF List Style</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF List Style</em>'.
	 * @see org.eclipse.eef.EEFListStyle
	 * @generated
	 */
	EClass getEEFListStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFGroupStyle <em>EEF Group Style</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Group Style</em>'.
	 * @see org.eclipse.eef.EEFGroupStyle
	 * @generated
	 */
	EClass getEEFGroupStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGroupStyle#getBackgroundColorExpression
	 * <em>Background Color Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Background Color Expression</em>'.
	 * @see org.eclipse.eef.EEFGroupStyle#getBackgroundColorExpression()
	 * @see #getEEFGroupStyle()
	 * @generated
	 */
	EAttribute getEEFGroupStyle_BackgroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGroupStyle#getForegroundColorExpression
	 * <em>Foreground Color Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Foreground Color Expression</em>'.
	 * @see org.eclipse.eef.EEFGroupStyle#getForegroundColorExpression()
	 * @see #getEEFGroupStyle()
	 * @generated
	 */
	EAttribute getEEFGroupStyle_ForegroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGroupStyle#getFontNameExpression
	 * <em>Font Name Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Font Name Expression</em>'.
	 * @see org.eclipse.eef.EEFGroupStyle#getFontNameExpression()
	 * @see #getEEFGroupStyle()
	 * @generated
	 */
	EAttribute getEEFGroupStyle_FontNameExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGroupStyle#getFontSizeExpression
	 * <em>Font Size Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Font Size Expression</em>'.
	 * @see org.eclipse.eef.EEFGroupStyle#getFontSizeExpression()
	 * @see #getEEFGroupStyle()
	 * @generated
	 */
	EAttribute getEEFGroupStyle_FontSizeExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGroupStyle#getBarStyle <em>Bar Style</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Bar Style</em>'.
	 * @see org.eclipse.eef.EEFGroupStyle#getBarStyle()
	 * @see #getEEFGroupStyle()
	 * @generated
	 */
	EAttribute getEEFGroupStyle_BarStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGroupStyle#getToggleStyle
	 * <em>Toggle Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Toggle Style</em>'.
	 * @see org.eclipse.eef.EEFGroupStyle#getToggleStyle()
	 * @see #getEEFGroupStyle()
	 * @generated
	 */
	EAttribute getEEFGroupStyle_ToggleStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGroupStyle#isExpandedByDefault
	 * <em>Expanded By Default</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Expanded By Default</em>'.
	 * @see org.eclipse.eef.EEFGroupStyle#isExpandedByDefault()
	 * @see #getEEFGroupStyle()
	 * @generated
	 */
	EAttribute getEEFGroupStyle_ExpandedByDefault();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFConditionalStyle <em>EEF Conditional Style</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFConditionalStyle
	 * @generated
	 */
	EClass getEEFConditionalStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFConditionalStyle#getPreconditionExpression
	 * <em>Precondition Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Precondition Expression</em>'.
	 * @see org.eclipse.eef.EEFConditionalStyle#getPreconditionExpression()
	 * @see #getEEFConditionalStyle()
	 * @generated
	 */
	EAttribute getEEFConditionalStyle_PreconditionExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFTextConditionalStyle
	 * <em>EEF Text Conditional Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Text Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFTextConditionalStyle
	 * @generated
	 */
	EClass getEEFTextConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFTextConditionalStyle#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFTextConditionalStyle#getStyle()
	 * @see #getEEFTextConditionalStyle()
	 * @generated
	 */
	EReference getEEFTextConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFButtonConditionalStyle
	 * <em>EEF Button Conditional Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Button Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFButtonConditionalStyle
	 * @generated
	 */
	EClass getEEFButtonConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFButtonConditionalStyle#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFButtonConditionalStyle#getStyle()
	 * @see #getEEFButtonConditionalStyle()
	 * @generated
	 */
	EReference getEEFButtonConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFLabelConditionalStyle
	 * <em>EEF Label Conditional Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Label Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFLabelConditionalStyle
	 * @generated
	 */
	EClass getEEFLabelConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFLabelConditionalStyle#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFLabelConditionalStyle#getStyle()
	 * @see #getEEFLabelConditionalStyle()
	 * @generated
	 */
	EReference getEEFLabelConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFCheckboxConditionalStyle
	 * <em>EEF Checkbox Conditional Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Checkbox Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFCheckboxConditionalStyle
	 * @generated
	 */
	EClass getEEFCheckboxConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.eef.EEFCheckboxConditionalStyle#getStyle <em>Style</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFCheckboxConditionalStyle#getStyle()
	 * @see #getEEFCheckboxConditionalStyle()
	 * @generated
	 */
	EReference getEEFCheckboxConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFSelectConditionalStyle
	 * <em>EEF Select Conditional Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Select Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFSelectConditionalStyle
	 * @generated
	 */
	EClass getEEFSelectConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFSelectConditionalStyle#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFSelectConditionalStyle#getStyle()
	 * @see #getEEFSelectConditionalStyle()
	 * @generated
	 */
	EReference getEEFSelectConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFRadioConditionalStyle
	 * <em>EEF Radio Conditional Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Radio Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFRadioConditionalStyle
	 * @generated
	 */
	EClass getEEFRadioConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFRadioConditionalStyle#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFRadioConditionalStyle#getStyle()
	 * @see #getEEFRadioConditionalStyle()
	 * @generated
	 */
	EReference getEEFRadioConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFHyperlinkConditionalStyle
	 * <em>EEF Hyperlink Conditional Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Hyperlink Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFHyperlinkConditionalStyle
	 * @generated
	 */
	EClass getEEFHyperlinkConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.eef.EEFHyperlinkConditionalStyle#getStyle <em>Style</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFHyperlinkConditionalStyle#getStyle()
	 * @see #getEEFHyperlinkConditionalStyle()
	 * @generated
	 */
	EReference getEEFHyperlinkConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFCustomWidgetConditionalStyle
	 * <em>EEF Custom Widget Conditional Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Custom Widget Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFCustomWidgetConditionalStyle
	 * @generated
	 */
	EClass getEEFCustomWidgetConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.eclipse.eef.EEFCustomWidgetConditionalStyle#getStyle <em>Style</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFCustomWidgetConditionalStyle#getStyle()
	 * @see #getEEFCustomWidgetConditionalStyle()
	 * @generated
	 */
	EReference getEEFCustomWidgetConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFWidgetAction <em>EEF Widget Action</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Widget Action</em>'.
	 * @see org.eclipse.eef.EEFWidgetAction
	 * @generated
	 */
	EClass getEEFWidgetAction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFWidgetAction#getLabelExpression
	 * <em>Label Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Label Expression</em>'.
	 * @see org.eclipse.eef.EEFWidgetAction#getLabelExpression()
	 * @see #getEEFWidgetAction()
	 * @generated
	 */
	EAttribute getEEFWidgetAction_LabelExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFWidgetAction#getActionExpression
	 * <em>Action Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Action Expression</em>'.
	 * @see org.eclipse.eef.EEFWidgetAction#getActionExpression()
	 * @see #getEEFWidgetAction()
	 * @generated
	 */
	EAttribute getEEFWidgetAction_ActionExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFListConditionalStyle
	 * <em>EEF List Conditional Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF List Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFListConditionalStyle
	 * @generated
	 */
	EClass getEEFListConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFListConditionalStyle#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFListConditionalStyle#getStyle()
	 * @see #getEEFListConditionalStyle()
	 * @generated
	 */
	EReference getEEFListConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFGroupConditionalStyle
	 * <em>EEF Group Conditional Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Group Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFGroupConditionalStyle
	 * @generated
	 */
	EClass getEEFGroupConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFGroupConditionalStyle#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFGroupConditionalStyle#getStyle()
	 * @see #getEEFGroupConditionalStyle()
	 * @generated
	 */
	EReference getEEFGroupConditionalStyle_Style();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION
	 * <em>EEF VALIDATION SEVERITY DESCRIPTION</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>EEF VALIDATION SEVERITY DESCRIPTION</em>'.
	 * @see org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION
	 * @generated
	 */
	EEnum getEEF_VALIDATION_SEVERITY_DESCRIPTION();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.eef.EEF_FILL_LAYOUT_ORIENTATION
	 * <em>EEF FILL LAYOUT ORIENTATION</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>EEF FILL LAYOUT ORIENTATION</em>'.
	 * @see org.eclipse.eef.EEF_FILL_LAYOUT_ORIENTATION
	 * @generated
	 */
	EEnum getEEF_FILL_LAYOUT_ORIENTATION();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.eef.EEF_TOGGLE_STYLE <em>EEF TOGGLE STYLE</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>EEF TOGGLE STYLE</em>'.
	 * @see org.eclipse.eef.EEF_TOGGLE_STYLE
	 * @generated
	 */
	EEnum getEEF_TOGGLE_STYLE();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.eef.EEF_TITLE_BAR_STYLE <em>EEF TITLE BAR STYLE</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>EEF TITLE BAR STYLE</em>'.
	 * @see org.eclipse.eef.EEF_TITLE_BAR_STYLE
	 * @generated
	 */
	EEnum getEEF_TITLE_BAR_STYLE();

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
		 * The meta object literal for the '<em><b>Image Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_VIEW_DESCRIPTION__IMAGE_EXPRESSION = EefPackage.eINSTANCE.getEEFViewDescription_ImageExpression();

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
		 * The meta object literal for the '<em><b>Domain Class</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_PAGE_DESCRIPTION__DOMAIN_CLASS = EefPackage.eINSTANCE.getEEFPageDescription_DomainClass();

		/**
		 * The meta object literal for the '<em><b>Semantic Candidate Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION = EefPackage.eINSTANCE.getEEFPageDescription_SemanticCandidateExpression();

		/**
		 * The meta object literal for the '<em><b>Precondition Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_PAGE_DESCRIPTION__PRECONDITION_EXPRESSION = EefPackage.eINSTANCE.getEEFPageDescription_PreconditionExpression();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_PAGE_DESCRIPTION__GROUPS = EefPackage.eINSTANCE.getEEFPageDescription_Groups();

		/**
		 * The meta object literal for the '<em><b>Semantic Validation Rules</b></em>' containment reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_PAGE_DESCRIPTION__SEMANTIC_VALIDATION_RULES = EefPackage.eINSTANCE.getEEFPageDescription_SemanticValidationRules();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFValidationRuleDescriptionImpl
		 * <em>EEF Validation Rule Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFValidationRuleDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFValidationRuleDescription()
		 * @generated
		 */
		EClass EEF_VALIDATION_RULE_DESCRIPTION = EefPackage.eINSTANCE.getEEFValidationRuleDescription();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_VALIDATION_RULE_DESCRIPTION__SEVERITY = EefPackage.eINSTANCE.getEEFValidationRuleDescription_Severity();

		/**
		 * The meta object literal for the '<em><b>Message Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_VALIDATION_RULE_DESCRIPTION__MESSAGE_EXPRESSION = EefPackage.eINSTANCE.getEEFValidationRuleDescription_MessageExpression();

		/**
		 * The meta object literal for the '<em><b>Audits</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_VALIDATION_RULE_DESCRIPTION__AUDITS = EefPackage.eINSTANCE.getEEFValidationRuleDescription_Audits();

		/**
		 * The meta object literal for the '<em><b>Fixes</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_VALIDATION_RULE_DESCRIPTION__FIXES = EefPackage.eINSTANCE.getEEFValidationRuleDescription_Fixes();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFRuleAuditDescriptionImpl
		 * <em>EEF Rule Audit Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFRuleAuditDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFRuleAuditDescription()
		 * @generated
		 */
		EClass EEF_RULE_AUDIT_DESCRIPTION = EefPackage.eINSTANCE.getEEFRuleAuditDescription();

		/**
		 * The meta object literal for the '<em><b>Audit Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_RULE_AUDIT_DESCRIPTION__AUDIT_EXPRESSION = EefPackage.eINSTANCE.getEEFRuleAuditDescription_AuditExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFValidationFixDescriptionImpl
		 * <em>EEF Validation Fix Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFValidationFixDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFValidationFixDescription()
		 * @generated
		 */
		EClass EEF_VALIDATION_FIX_DESCRIPTION = EefPackage.eINSTANCE.getEEFValidationFixDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_VALIDATION_FIX_DESCRIPTION__NAME = EefPackage.eINSTANCE.getEEFValidationFixDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Fix Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_VALIDATION_FIX_DESCRIPTION__FIX_EXPRESSION = EefPackage.eINSTANCE.getEEFValidationFixDescription_FixExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFPropertyValidationRuleDescriptionImpl
		 * <em>EEF Property Validation Rule Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFPropertyValidationRuleDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFPropertyValidationRuleDescription()
		 * @generated
		 */
		EClass EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION = EefPackage.eINSTANCE.getEEFPropertyValidationRuleDescription();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_PROPERTY_VALIDATION_RULE_DESCRIPTION__TARGETS = EefPackage.eINSTANCE.getEEFPropertyValidationRuleDescription_Targets();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFSemanticValidationRuleDescriptionImpl
		 * <em>EEF Semantic Validation Rule Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFSemanticValidationRuleDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFSemanticValidationRuleDescription()
		 * @generated
		 */
		EClass EEF_SEMANTIC_VALIDATION_RULE_DESCRIPTION = EefPackage.eINSTANCE.getEEFSemanticValidationRuleDescription();

		/**
		 * The meta object literal for the '<em><b>Target Class</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_SEMANTIC_VALIDATION_RULE_DESCRIPTION__TARGET_CLASS = EefPackage.eINSTANCE
				.getEEFSemanticValidationRuleDescription_TargetClass();

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
		 * The meta object literal for the '<em><b>Domain Class</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_GROUP_DESCRIPTION__DOMAIN_CLASS = EefPackage.eINSTANCE.getEEFGroupDescription_DomainClass();

		/**
		 * The meta object literal for the '<em><b>Semantic Candidate Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_GROUP_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION = EefPackage.eINSTANCE.getEEFGroupDescription_SemanticCandidateExpression();

		/**
		 * The meta object literal for the '<em><b>Precondition Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_GROUP_DESCRIPTION__PRECONDITION_EXPRESSION = EefPackage.eINSTANCE.getEEFGroupDescription_PreconditionExpression();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_GROUP_DESCRIPTION__CONTROLS = EefPackage.eINSTANCE.getEEFGroupDescription_Controls();

		/**
		 * The meta object literal for the '<em><b>Semantic Validation Rules</b></em>' containment reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_GROUP_DESCRIPTION__SEMANTIC_VALIDATION_RULES = EefPackage.eINSTANCE.getEEFGroupDescription_SemanticValidationRules();

		/**
		 * The meta object literal for the '<em><b>Property Validation Rules</b></em>' containment reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_GROUP_DESCRIPTION__PROPERTY_VALIDATION_RULES = EefPackage.eINSTANCE.getEEFGroupDescription_PropertyValidationRules();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_GROUP_DESCRIPTION__STYLE = EefPackage.eINSTANCE.getEEFGroupDescription_Style();

		/**
		 * The meta object literal for the '<em><b>Conditional Styles</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_GROUP_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.eINSTANCE.getEEFGroupDescription_ConditionalStyles();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFControlDescriptionImpl
		 * <em>EEF Control Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFControlDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFControlDescription()
		 * @generated
		 */
		EClass EEF_CONTROL_DESCRIPTION = EefPackage.eINSTANCE.getEEFControlDescription();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_CONTROL_DESCRIPTION__IDENTIFIER = EefPackage.eINSTANCE.getEEFControlDescription_Identifier();

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
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_CONTAINER_DESCRIPTION__CONTROLS = EefPackage.eINSTANCE.getEEFContainerDescription_Controls();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_CONTAINER_DESCRIPTION__LAYOUT = EefPackage.eINSTANCE.getEEFContainerDescription_Layout();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFLayoutDescriptionImpl
		 * <em>EEF Layout Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFLayoutDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLayoutDescription()
		 * @generated
		 */
		EClass EEF_LAYOUT_DESCRIPTION = EefPackage.eINSTANCE.getEEFLayoutDescription();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFFillLayoutDescriptionImpl
		 * <em>EEF Fill Layout Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFFillLayoutDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFFillLayoutDescription()
		 * @generated
		 */
		EClass EEF_FILL_LAYOUT_DESCRIPTION = EefPackage.eINSTANCE.getEEFFillLayoutDescription();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_FILL_LAYOUT_DESCRIPTION__ORIENTATION = EefPackage.eINSTANCE.getEEFFillLayoutDescription_Orientation();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFGridLayoutDescriptionImpl
		 * <em>EEF Grid Layout Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFGridLayoutDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFGridLayoutDescription()
		 * @generated
		 */
		EClass EEF_GRID_LAYOUT_DESCRIPTION = EefPackage.eINSTANCE.getEEFGridLayoutDescription();

		/**
		 * The meta object literal for the '<em><b>Number Of Columns</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_GRID_LAYOUT_DESCRIPTION__NUMBER_OF_COLUMNS = EefPackage.eINSTANCE.getEEFGridLayoutDescription_NumberOfColumns();

		/**
		 * The meta object literal for the '<em><b>Make Columns With Equal Width</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_GRID_LAYOUT_DESCRIPTION__MAKE_COLUMNS_WITH_EQUAL_WIDTH = EefPackage.eINSTANCE
				.getEEFGridLayoutDescription_MakeColumnsWithEqualWidth();

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
		 * The meta object literal for the '<em><b>Label Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION = EefPackage.eINSTANCE.getEEFWidgetDescription_LabelExpression();

		/**
		 * The meta object literal for the '<em><b>Help Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION = EefPackage.eINSTANCE.getEEFWidgetDescription_HelpExpression();

		/**
		 * The meta object literal for the '<em><b>Is Enabled Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_WIDGET_DESCRIPTION__IS_ENABLED_EXPRESSION = EefPackage.eINSTANCE.getEEFWidgetDescription_IsEnabledExpression();

		/**
		 * The meta object literal for the '<em><b>Property Validation Rules</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES = EefPackage.eINSTANCE.getEEFWidgetDescription_PropertyValidationRules();

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
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_TEXT_DESCRIPTION__STYLE = EefPackage.eINSTANCE.getEEFTextDescription_Style();

		/**
		 * The meta object literal for the '<em><b>Conditional Styles</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_TEXT_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.eINSTANCE.getEEFTextDescription_ConditionalStyles();

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
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_LABEL_DESCRIPTION__VALUE_EXPRESSION = EefPackage.eINSTANCE.getEEFLabelDescription_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Display Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_LABEL_DESCRIPTION__DISPLAY_EXPRESSION = EefPackage.eINSTANCE.getEEFLabelDescription_DisplayExpression();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_LABEL_DESCRIPTION__STYLE = EefPackage.eINSTANCE.getEEFLabelDescription_Style();

		/**
		 * The meta object literal for the '<em><b>Conditional Styles</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_LABEL_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.eINSTANCE.getEEFLabelDescription_ConditionalStyles();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_LABEL_DESCRIPTION__ACTIONS = EefPackage.eINSTANCE.getEEFLabelDescription_Actions();

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
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_BUTTON_DESCRIPTION__STYLE = EefPackage.eINSTANCE.getEEFButtonDescription_Style();

		/**
		 * The meta object literal for the '<em><b>Conditional Styles</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_BUTTON_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.eINSTANCE.getEEFButtonDescription_ConditionalStyles();

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
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_CHECKBOX_DESCRIPTION__STYLE = EefPackage.eINSTANCE.getEEFCheckboxDescription_Style();

		/**
		 * The meta object literal for the '<em><b>Conditional Styles</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_CHECKBOX_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.eINSTANCE.getEEFCheckboxDescription_ConditionalStyles();

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
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_SELECT_DESCRIPTION__STYLE = EefPackage.eINSTANCE.getEEFSelectDescription_Style();

		/**
		 * The meta object literal for the '<em><b>Conditional Styles</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_SELECT_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.eINSTANCE.getEEFSelectDescription_ConditionalStyles();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFRadioDescriptionImpl
		 * <em>EEF Radio Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFRadioDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFRadioDescription()
		 * @generated
		 */
		EClass EEF_RADIO_DESCRIPTION = EefPackage.eINSTANCE.getEEFRadioDescription();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_RADIO_DESCRIPTION__VALUE_EXPRESSION = EefPackage.eINSTANCE.getEEFRadioDescription_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Edit Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_RADIO_DESCRIPTION__EDIT_EXPRESSION = EefPackage.eINSTANCE.getEEFRadioDescription_EditExpression();

		/**
		 * The meta object literal for the '<em><b>Candidates Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_RADIO_DESCRIPTION__CANDIDATES_EXPRESSION = EefPackage.eINSTANCE.getEEFRadioDescription_CandidatesExpression();

		/**
		 * The meta object literal for the '<em><b>Candidate Display Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_RADIO_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION = EefPackage.eINSTANCE.getEEFRadioDescription_CandidateDisplayExpression();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_RADIO_DESCRIPTION__STYLE = EefPackage.eINSTANCE.getEEFRadioDescription_Style();

		/**
		 * The meta object literal for the '<em><b>Number Of Columns</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_RADIO_DESCRIPTION__NUMBER_OF_COLUMNS = EefPackage.eINSTANCE.getEEFRadioDescription_NumberOfColumns();

		/**
		 * The meta object literal for the '<em><b>Conditional Styles</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_RADIO_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.eINSTANCE.getEEFRadioDescription_ConditionalStyles();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFHyperlinkDescriptionImpl
		 * <em>EEF Hyperlink Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFHyperlinkDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFHyperlinkDescription()
		 * @generated
		 */
		EClass EEF_HYPERLINK_DESCRIPTION = EefPackage.eINSTANCE.getEEFHyperlinkDescription();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_HYPERLINK_DESCRIPTION__VALUE_EXPRESSION = EefPackage.eINSTANCE.getEEFHyperlinkDescription_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Display Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_HYPERLINK_DESCRIPTION__DISPLAY_EXPRESSION = EefPackage.eINSTANCE.getEEFHyperlinkDescription_DisplayExpression();

		/**
		 * The meta object literal for the '<em><b>On Click Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_HYPERLINK_DESCRIPTION__ON_CLICK_EXPRESSION = EefPackage.eINSTANCE.getEEFHyperlinkDescription_OnClickExpression();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_HYPERLINK_DESCRIPTION__STYLE = EefPackage.eINSTANCE.getEEFHyperlinkDescription_Style();

		/**
		 * The meta object literal for the '<em><b>Conditional Styles</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_HYPERLINK_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.eINSTANCE.getEEFHyperlinkDescription_ConditionalStyles();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_HYPERLINK_DESCRIPTION__ACTIONS = EefPackage.eINSTANCE.getEEFHyperlinkDescription_Actions();

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
		 * The meta object literal for the '<em><b>Iterable Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_DYNAMIC_MAPPING_FOR__ITERABLE_EXPRESSION = EefPackage.eINSTANCE.getEEFDynamicMappingFor_IterableExpression();

		/**
		 * The meta object literal for the '<em><b>Ifs</b></em>' containment reference list feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_DYNAMIC_MAPPING_FOR__IFS = EefPackage.eINSTANCE.getEEFDynamicMappingFor_Ifs();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFDynamicMappingIfImpl
		 * <em>EEF Dynamic Mapping If</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFDynamicMappingIfImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFDynamicMappingIf()
		 * @generated
		 */
		EClass EEF_DYNAMIC_MAPPING_IF = EefPackage.eINSTANCE.getEEFDynamicMappingIf();

		/**
		 * The meta object literal for the '<em><b>Predicate Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_DYNAMIC_MAPPING_IF__PREDICATE_EXPRESSION = EefPackage.eINSTANCE.getEEFDynamicMappingIf_PredicateExpression();

		/**
		 * The meta object literal for the '<em><b>Widget</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_DYNAMIC_MAPPING_IF__WIDGET = EefPackage.eINSTANCE.getEEFDynamicMappingIf_Widget();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFCustomWidgetDescriptionImpl
		 * <em>EEF Custom Widget Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFCustomWidgetDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCustomWidgetDescription()
		 * @generated
		 */
		EClass EEF_CUSTOM_WIDGET_DESCRIPTION = EefPackage.eINSTANCE.getEEFCustomWidgetDescription();

		/**
		 * The meta object literal for the '<em><b>Custom Expressions</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_CUSTOM_WIDGET_DESCRIPTION__CUSTOM_EXPRESSIONS = EefPackage.eINSTANCE.getEEFCustomWidgetDescription_CustomExpressions();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_CUSTOM_WIDGET_DESCRIPTION__STYLE = EefPackage.eINSTANCE.getEEFCustomWidgetDescription_Style();

		/**
		 * The meta object literal for the '<em><b>Conditional Styles</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_CUSTOM_WIDGET_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.eINSTANCE.getEEFCustomWidgetDescription_ConditionalStyles();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFCustomExpressionImpl
		 * <em>EEF Custom Expression</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFCustomExpressionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCustomExpression()
		 * @generated
		 */
		EClass EEF_CUSTOM_EXPRESSION = EefPackage.eINSTANCE.getEEFCustomExpression();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_CUSTOM_EXPRESSION__IDENTIFIER = EefPackage.eINSTANCE.getEEFCustomExpression_Identifier();

		/**
		 * The meta object literal for the '<em><b>Custom Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_CUSTOM_EXPRESSION__CUSTOM_EXPRESSION = EefPackage.eINSTANCE.getEEFCustomExpression_CustomExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFListDescriptionImpl
		 * <em>EEF List Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFListDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFListDescription()
		 * @generated
		 */
		EClass EEF_LIST_DESCRIPTION = EefPackage.eINSTANCE.getEEFListDescription();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_LIST_DESCRIPTION__VALUE_EXPRESSION = EefPackage.eINSTANCE.getEEFListDescription_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Display Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_LIST_DESCRIPTION__DISPLAY_EXPRESSION = EefPackage.eINSTANCE.getEEFListDescription_DisplayExpression();

		/**
		 * The meta object literal for the '<em><b>On Click Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_LIST_DESCRIPTION__ON_CLICK_EXPRESSION = EefPackage.eINSTANCE.getEEFListDescription_OnClickExpression();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_LIST_DESCRIPTION__ACTIONS = EefPackage.eINSTANCE.getEEFListDescription_Actions();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_LIST_DESCRIPTION__STYLE = EefPackage.eINSTANCE.getEEFListDescription_Style();

		/**
		 * The meta object literal for the '<em><b>Conditional Styles</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_LIST_DESCRIPTION__CONDITIONAL_STYLES = EefPackage.eINSTANCE.getEEFListDescription_ConditionalStyles();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFWidgetStyleImpl <em>EEF Widget Style</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFWidgetStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFWidgetStyle()
		 * @generated
		 */
		EClass EEF_WIDGET_STYLE = EefPackage.eINSTANCE.getEEFWidgetStyle();

		/**
		 * The meta object literal for the '<em><b>Label Background Color Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION = EefPackage.eINSTANCE.getEEFWidgetStyle_LabelBackgroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Label Foreground Color Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION = EefPackage.eINSTANCE.getEEFWidgetStyle_LabelForegroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Label Font Name Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION = EefPackage.eINSTANCE.getEEFWidgetStyle_LabelFontNameExpression();

		/**
		 * The meta object literal for the '<em><b>Label Font Size Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION = EefPackage.eINSTANCE.getEEFWidgetStyle_LabelFontSizeExpression();

		/**
		 * The meta object literal for the '<em><b>Label Font Style Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION = EefPackage.eINSTANCE.getEEFWidgetStyle_LabelFontStyleExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFTextStyleImpl <em>EEF Text Style</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFTextStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTextStyle()
		 * @generated
		 */
		EClass EEF_TEXT_STYLE = EefPackage.eINSTANCE.getEEFTextStyle();

		/**
		 * The meta object literal for the '<em><b>Background Color Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_TEXT_STYLE__BACKGROUND_COLOR_EXPRESSION = EefPackage.eINSTANCE.getEEFTextStyle_BackgroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Foreground Color Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_TEXT_STYLE__FOREGROUND_COLOR_EXPRESSION = EefPackage.eINSTANCE.getEEFTextStyle_ForegroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Font Name Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_TEXT_STYLE__FONT_NAME_EXPRESSION = EefPackage.eINSTANCE.getEEFTextStyle_FontNameExpression();

		/**
		 * The meta object literal for the '<em><b>Font Size Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_TEXT_STYLE__FONT_SIZE_EXPRESSION = EefPackage.eINSTANCE.getEEFTextStyle_FontSizeExpression();

		/**
		 * The meta object literal for the '<em><b>Font Style Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_TEXT_STYLE__FONT_STYLE_EXPRESSION = EefPackage.eINSTANCE.getEEFTextStyle_FontStyleExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFLabelStyleImpl <em>EEF Label Style</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFLabelStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLabelStyle()
		 * @generated
		 */
		EClass EEF_LABEL_STYLE = EefPackage.eINSTANCE.getEEFLabelStyle();

		/**
		 * The meta object literal for the '<em><b>Background Color Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_LABEL_STYLE__BACKGROUND_COLOR_EXPRESSION = EefPackage.eINSTANCE.getEEFLabelStyle_BackgroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Foreground Color Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_LABEL_STYLE__FOREGROUND_COLOR_EXPRESSION = EefPackage.eINSTANCE.getEEFLabelStyle_ForegroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Font Name Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_LABEL_STYLE__FONT_NAME_EXPRESSION = EefPackage.eINSTANCE.getEEFLabelStyle_FontNameExpression();

		/**
		 * The meta object literal for the '<em><b>Font Size Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_LABEL_STYLE__FONT_SIZE_EXPRESSION = EefPackage.eINSTANCE.getEEFLabelStyle_FontSizeExpression();

		/**
		 * The meta object literal for the '<em><b>Font Style Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_LABEL_STYLE__FONT_STYLE_EXPRESSION = EefPackage.eINSTANCE.getEEFLabelStyle_FontStyleExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFButtonStyleImpl <em>EEF Button Style</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFButtonStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFButtonStyle()
		 * @generated
		 */
		EClass EEF_BUTTON_STYLE = EefPackage.eINSTANCE.getEEFButtonStyle();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFCheckboxStyleImpl
		 * <em>EEF Checkbox Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFCheckboxStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCheckboxStyle()
		 * @generated
		 */
		EClass EEF_CHECKBOX_STYLE = EefPackage.eINSTANCE.getEEFCheckboxStyle();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFSelectStyleImpl <em>EEF Select Style</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFSelectStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFSelectStyle()
		 * @generated
		 */
		EClass EEF_SELECT_STYLE = EefPackage.eINSTANCE.getEEFSelectStyle();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFRadioStyleImpl <em>EEF Radio Style</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFRadioStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFRadioStyle()
		 * @generated
		 */
		EClass EEF_RADIO_STYLE = EefPackage.eINSTANCE.getEEFRadioStyle();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFHyperlinkStyleImpl
		 * <em>EEF Hyperlink Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFHyperlinkStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFHyperlinkStyle()
		 * @generated
		 */
		EClass EEF_HYPERLINK_STYLE = EefPackage.eINSTANCE.getEEFHyperlinkStyle();

		/**
		 * The meta object literal for the '<em><b>Background Color Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_HYPERLINK_STYLE__BACKGROUND_COLOR_EXPRESSION = EefPackage.eINSTANCE.getEEFHyperlinkStyle_BackgroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Font Name Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_HYPERLINK_STYLE__FONT_NAME_EXPRESSION = EefPackage.eINSTANCE.getEEFHyperlinkStyle_FontNameExpression();

		/**
		 * The meta object literal for the '<em><b>Font Size Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_HYPERLINK_STYLE__FONT_SIZE_EXPRESSION = EefPackage.eINSTANCE.getEEFHyperlinkStyle_FontSizeExpression();

		/**
		 * The meta object literal for the '<em><b>Font Style Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_HYPERLINK_STYLE__FONT_STYLE_EXPRESSION = EefPackage.eINSTANCE.getEEFHyperlinkStyle_FontStyleExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFCustomWidgetStyleImpl
		 * <em>EEF Custom Widget Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFCustomWidgetStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCustomWidgetStyle()
		 * @generated
		 */
		EClass EEF_CUSTOM_WIDGET_STYLE = EefPackage.eINSTANCE.getEEFCustomWidgetStyle();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFListStyleImpl <em>EEF List Style</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFListStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFListStyle()
		 * @generated
		 */
		EClass EEF_LIST_STYLE = EefPackage.eINSTANCE.getEEFListStyle();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFGroupStyleImpl <em>EEF Group Style</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFGroupStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFGroupStyle()
		 * @generated
		 */
		EClass EEF_GROUP_STYLE = EefPackage.eINSTANCE.getEEFGroupStyle();

		/**
		 * The meta object literal for the '<em><b>Background Color Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_GROUP_STYLE__BACKGROUND_COLOR_EXPRESSION = EefPackage.eINSTANCE.getEEFGroupStyle_BackgroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Foreground Color Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_GROUP_STYLE__FOREGROUND_COLOR_EXPRESSION = EefPackage.eINSTANCE.getEEFGroupStyle_ForegroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Font Name Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_GROUP_STYLE__FONT_NAME_EXPRESSION = EefPackage.eINSTANCE.getEEFGroupStyle_FontNameExpression();

		/**
		 * The meta object literal for the '<em><b>Font Size Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_GROUP_STYLE__FONT_SIZE_EXPRESSION = EefPackage.eINSTANCE.getEEFGroupStyle_FontSizeExpression();

		/**
		 * The meta object literal for the '<em><b>Bar Style</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_GROUP_STYLE__BAR_STYLE = EefPackage.eINSTANCE.getEEFGroupStyle_BarStyle();

		/**
		 * The meta object literal for the '<em><b>Toggle Style</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_GROUP_STYLE__TOGGLE_STYLE = EefPackage.eINSTANCE.getEEFGroupStyle_ToggleStyle();

		/**
		 * The meta object literal for the '<em><b>Expanded By Default</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_GROUP_STYLE__EXPANDED_BY_DEFAULT = EefPackage.eINSTANCE.getEEFGroupStyle_ExpandedByDefault();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFConditionalStyleImpl
		 * <em>EEF Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFConditionalStyle()
		 * @generated
		 */
		EClass EEF_CONDITIONAL_STYLE = EefPackage.eINSTANCE.getEEFConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Precondition Expression</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_CONDITIONAL_STYLE__PRECONDITION_EXPRESSION = EefPackage.eINSTANCE.getEEFConditionalStyle_PreconditionExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFTextConditionalStyleImpl
		 * <em>EEF Text Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFTextConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTextConditionalStyle()
		 * @generated
		 */
		EClass EEF_TEXT_CONDITIONAL_STYLE = EefPackage.eINSTANCE.getEEFTextConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_TEXT_CONDITIONAL_STYLE__STYLE = EefPackage.eINSTANCE.getEEFTextConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFButtonConditionalStyleImpl
		 * <em>EEF Button Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFButtonConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFButtonConditionalStyle()
		 * @generated
		 */
		EClass EEF_BUTTON_CONDITIONAL_STYLE = EefPackage.eINSTANCE.getEEFButtonConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_BUTTON_CONDITIONAL_STYLE__STYLE = EefPackage.eINSTANCE.getEEFButtonConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFLabelConditionalStyleImpl
		 * <em>EEF Label Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFLabelConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLabelConditionalStyle()
		 * @generated
		 */
		EClass EEF_LABEL_CONDITIONAL_STYLE = EefPackage.eINSTANCE.getEEFLabelConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_LABEL_CONDITIONAL_STYLE__STYLE = EefPackage.eINSTANCE.getEEFLabelConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFCheckboxConditionalStyleImpl
		 * <em>EEF Checkbox Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFCheckboxConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCheckboxConditionalStyle()
		 * @generated
		 */
		EClass EEF_CHECKBOX_CONDITIONAL_STYLE = EefPackage.eINSTANCE.getEEFCheckboxConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_CHECKBOX_CONDITIONAL_STYLE__STYLE = EefPackage.eINSTANCE.getEEFCheckboxConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFSelectConditionalStyleImpl
		 * <em>EEF Select Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFSelectConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFSelectConditionalStyle()
		 * @generated
		 */
		EClass EEF_SELECT_CONDITIONAL_STYLE = EefPackage.eINSTANCE.getEEFSelectConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_SELECT_CONDITIONAL_STYLE__STYLE = EefPackage.eINSTANCE.getEEFSelectConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFRadioConditionalStyleImpl
		 * <em>EEF Radio Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFRadioConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFRadioConditionalStyle()
		 * @generated
		 */
		EClass EEF_RADIO_CONDITIONAL_STYLE = EefPackage.eINSTANCE.getEEFRadioConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_RADIO_CONDITIONAL_STYLE__STYLE = EefPackage.eINSTANCE.getEEFRadioConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFHyperlinkConditionalStyleImpl
		 * <em>EEF Hyperlink Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFHyperlinkConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFHyperlinkConditionalStyle()
		 * @generated
		 */
		EClass EEF_HYPERLINK_CONDITIONAL_STYLE = EefPackage.eINSTANCE.getEEFHyperlinkConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_HYPERLINK_CONDITIONAL_STYLE__STYLE = EefPackage.eINSTANCE.getEEFHyperlinkConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFCustomWidgetConditionalStyleImpl
		 * <em>EEF Custom Widget Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFCustomWidgetConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCustomWidgetConditionalStyle()
		 * @generated
		 */
		EClass EEF_CUSTOM_WIDGET_CONDITIONAL_STYLE = EefPackage.eINSTANCE.getEEFCustomWidgetConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_CUSTOM_WIDGET_CONDITIONAL_STYLE__STYLE = EefPackage.eINSTANCE.getEEFCustomWidgetConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFWidgetActionImpl <em>EEF Widget Action</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFWidgetActionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFWidgetAction()
		 * @generated
		 */
		EClass EEF_WIDGET_ACTION = EefPackage.eINSTANCE.getEEFWidgetAction();

		/**
		 * The meta object literal for the '<em><b>Label Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_WIDGET_ACTION__LABEL_EXPRESSION = EefPackage.eINSTANCE.getEEFWidgetAction_LabelExpression();

		/**
		 * The meta object literal for the '<em><b>Action Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_WIDGET_ACTION__ACTION_EXPRESSION = EefPackage.eINSTANCE.getEEFWidgetAction_ActionExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFListConditionalStyleImpl
		 * <em>EEF List Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFListConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFListConditionalStyle()
		 * @generated
		 */
		EClass EEF_LIST_CONDITIONAL_STYLE = EefPackage.eINSTANCE.getEEFListConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_LIST_CONDITIONAL_STYLE__STYLE = EefPackage.eINSTANCE.getEEFListConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFGroupConditionalStyleImpl
		 * <em>EEF Group Conditional Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFGroupConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFGroupConditionalStyle()
		 * @generated
		 */
		EClass EEF_GROUP_CONDITIONAL_STYLE = EefPackage.eINSTANCE.getEEFGroupConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_GROUP_CONDITIONAL_STYLE__STYLE = EefPackage.eINSTANCE.getEEFGroupConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION
		 * <em>EEF VALIDATION SEVERITY DESCRIPTION</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEF_VALIDATION_SEVERITY_DESCRIPTION()
		 * @generated
		 */
		EEnum EEF_VALIDATION_SEVERITY_DESCRIPTION = EefPackage.eINSTANCE.getEEF_VALIDATION_SEVERITY_DESCRIPTION();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.EEF_FILL_LAYOUT_ORIENTATION
		 * <em>EEF FILL LAYOUT ORIENTATION</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.EEF_FILL_LAYOUT_ORIENTATION
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEF_FILL_LAYOUT_ORIENTATION()
		 * @generated
		 */
		EEnum EEF_FILL_LAYOUT_ORIENTATION = EefPackage.eINSTANCE.getEEF_FILL_LAYOUT_ORIENTATION();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.EEF_TOGGLE_STYLE <em>EEF TOGGLE STYLE</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.EEF_TOGGLE_STYLE
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEF_TOGGLE_STYLE()
		 * @generated
		 */
		EEnum EEF_TOGGLE_STYLE = EefPackage.eINSTANCE.getEEF_TOGGLE_STYLE();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.EEF_TITLE_BAR_STYLE <em>EEF TITLE BAR STYLE</em>}'
		 * enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.EEF_TITLE_BAR_STYLE
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEF_TITLE_BAR_STYLE()
		 * @generated
		 */
		EEnum EEF_TITLE_BAR_STYLE = EefPackage.eINSTANCE.getEEF_TITLE_BAR_STYLE();

	}

} // EefPackage
