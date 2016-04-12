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
	 * The feature id for the '<em><b>Container</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__CONTAINER = 5;

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
	 * The number of structural features of the '<em>EEF Group Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFContainerDescriptionImpl
	 * <em>EEF Container Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFContainerDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFContainerDescription()
	 * @generated
	 */
	int EEF_CONTAINER_DESCRIPTION = 8;

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
	int EEF_WIDGET_DESCRIPTION = 9;

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
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Property Validation Rules</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES = 3;

	/**
	 * The number of structural features of the '<em>EEF Widget Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTextDescriptionImpl <em>EEF Text Description</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFTextDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTextDescription()
	 * @generated
	 */
	int EEF_TEXT_DESCRIPTION = 10;

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
	 * The number of structural features of the '<em>EEF Text Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFLabelDescriptionImpl <em>EEF Label Description</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFLabelDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLabelDescription()
	 * @generated
	 */
	int EEF_LABEL_DESCRIPTION = 11;

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
	 * The feature id for the '<em><b>Property Validation Rules</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__PROPERTY_VALIDATION_RULES = EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES;

	/**
	 * The feature id for the '<em><b>Body Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__BODY_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__STYLE = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEF Label Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFButtonDescriptionImpl <em>EEF Button Description</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFButtonDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFButtonDescription()
	 * @generated
	 */
	int EEF_BUTTON_DESCRIPTION = 12;

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
	 * The number of structural features of the '<em>EEF Button Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_BUTTON_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFCheckboxDescriptionImpl
	 * <em>EEF Checkbox Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFCheckboxDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCheckboxDescription()
	 * @generated
	 */
	int EEF_CHECKBOX_DESCRIPTION = 13;

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
	 * The number of structural features of the '<em>EEF Checkbox Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFSelectDescriptionImpl <em>EEF Select Description</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFSelectDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFSelectDescription()
	 * @generated
	 */
	int EEF_SELECT_DESCRIPTION = 14;

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
	 * The number of structural features of the '<em>EEF Select Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFRadioDescriptionImpl <em>EEF Radio Description</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFRadioDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFRadioDescription()
	 * @generated
	 */
	int EEF_RADIO_DESCRIPTION = 15;

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
	 * The number of structural features of the '<em>EEF Radio Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFDynamicMappingForImpl
	 * <em>EEF Dynamic Mapping For</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFDynamicMappingForImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFDynamicMappingFor()
	 * @generated
	 */
	int EEF_DYNAMIC_MAPPING_FOR = 16;

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
	 * The feature id for the '<em><b>Ifs</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_FOR__IFS = 2;

	/**
	 * The number of structural features of the '<em>EEF Dynamic Mapping For</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_DYNAMIC_MAPPING_FOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFDynamicMappingIfImpl <em>EEF Dynamic Mapping If</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFDynamicMappingIfImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFDynamicMappingIf()
	 * @generated
	 */
	int EEF_DYNAMIC_MAPPING_IF = 17;

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
	int EEF_CUSTOM_WIDGET_DESCRIPTION = 18;

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
	 * The number of structural features of the '<em>EEF Custom Widget Description</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CUSTOM_WIDGET_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFCustomExpressionImpl <em>EEF Custom Expression</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFCustomExpressionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCustomExpression()
	 * @generated
	 */
	int EEF_CUSTOM_EXPRESSION = 19;

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
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFReferenceDescriptionImpl
	 * <em>EEF Reference Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFReferenceDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFReferenceDescription()
	 * @generated
	 */
	int EEF_REFERENCE_DESCRIPTION = 20;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_REFERENCE_DESCRIPTION__IDENTIFIER = EefPackage.EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_REFERENCE_DESCRIPTION__LABEL_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_REFERENCE_DESCRIPTION__HELP_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Property Validation Rules</b></em>' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_REFERENCE_DESCRIPTION__PROPERTY_VALIDATION_RULES = EefPackage.EEF_WIDGET_DESCRIPTION__PROPERTY_VALIDATION_RULES;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_REFERENCE_DESCRIPTION__MULTIPLE = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_REFERENCE_DESCRIPTION__VALUE_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_REFERENCE_DESCRIPTION__DISPLAY_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Click Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_REFERENCE_DESCRIPTION__ACTIONS = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_REFERENCE_DESCRIPTION__STYLE = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EEF Reference Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_REFERENCE_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFWidgetStyleImpl <em>EEF Widget Style</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFWidgetStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFWidgetStyle()
	 * @generated
	 */
	int EEF_WIDGET_STYLE = 21;

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
	int EEF_TEXT_STYLE = 22;

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
	int EEF_LABEL_STYLE = 23;

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
	int EEF_BUTTON_STYLE = 24;

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
	int EEF_CHECKBOX_STYLE = 25;

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
	int EEF_SELECT_STYLE = 26;

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
	int EEF_RADIO_STYLE = 27;

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
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFWidgetActionImpl <em>EEF Widget Action</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFWidgetActionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFWidgetAction()
	 * @generated
	 */
	int EEF_WIDGET_ACTION = 28;

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
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFReferenceStyleImpl <em>EEF Reference Style</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.impl.EEFReferenceStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFReferenceStyle()
	 * @generated
	 */
	int EEF_REFERENCE_STYLE = 29;

	/**
	 * The feature id for the '<em><b>Label Background Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_REFERENCE_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_BACKGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Foreground Color Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_REFERENCE_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FOREGROUND_COLOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_REFERENCE_STYLE__LABEL_FONT_NAME_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Size Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_REFERENCE_STYLE__LABEL_FONT_SIZE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_SIZE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Font Style Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_REFERENCE_STYLE__LABEL_FONT_STYLE_EXPRESSION = EefPackage.EEF_WIDGET_STYLE__LABEL_FONT_STYLE_EXPRESSION;

	/**
	 * The number of structural features of the '<em>EEF Reference Style</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_REFERENCE_STYLE_FEATURE_COUNT = EefPackage.EEF_WIDGET_STYLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION
	 * <em>EEF VALIDATION SEVERITY DESCRIPTION</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEF_VALIDATION_SEVERITY_DESCRIPTION()
	 * @generated
	 */
	int EEF_VALIDATION_SEVERITY_DESCRIPTION = 30;

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
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFLabelDescription <em>EEF Label Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Label Description</em>'.
	 * @see org.eclipse.eef.EEFLabelDescription
	 * @generated
	 */
	EClass getEEFLabelDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLabelDescription#getBodyExpression
	 * <em>Body Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Body Expression</em>'.
	 * @see org.eclipse.eef.EEFLabelDescription#getBodyExpression()
	 * @see #getEEFLabelDescription()
	 * @generated
	 */
	EAttribute getEEFLabelDescription_BodyExpression();

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
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFReferenceDescription
	 * <em>EEF Reference Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Reference Description</em>'.
	 * @see org.eclipse.eef.EEFReferenceDescription
	 * @generated
	 */
	EClass getEEFReferenceDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFReferenceDescription#isMultiple
	 * <em>Multiple</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see org.eclipse.eef.EEFReferenceDescription#isMultiple()
	 * @see #getEEFReferenceDescription()
	 * @generated
	 */
	EAttribute getEEFReferenceDescription_Multiple();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFReferenceDescription#getValueExpression
	 * <em>Value Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.EEFReferenceDescription#getValueExpression()
	 * @see #getEEFReferenceDescription()
	 * @generated
	 */
	EAttribute getEEFReferenceDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFReferenceDescription#getDisplayExpression
	 * <em>Display Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Display Expression</em>'.
	 * @see org.eclipse.eef.EEFReferenceDescription#getDisplayExpression()
	 * @see #getEEFReferenceDescription()
	 * @generated
	 */
	EAttribute getEEFReferenceDescription_DisplayExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFReferenceDescription#getOnClickExpression
	 * <em>On Click Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>On Click Expression</em>'.
	 * @see org.eclipse.eef.EEFReferenceDescription#getOnClickExpression()
	 * @see #getEEFReferenceDescription()
	 * @generated
	 */
	EAttribute getEEFReferenceDescription_OnClickExpression();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.eclipse.eef.EEFReferenceDescription#getActions <em>Actions</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.eclipse.eef.EEFReferenceDescription#getActions()
	 * @see #getEEFReferenceDescription()
	 * @generated
	 */
	EReference getEEFReferenceDescription_Actions();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFReferenceDescription#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFReferenceDescription#getStyle()
	 * @see #getEEFReferenceDescription()
	 * @generated
	 */
	EReference getEEFReferenceDescription_Style();

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
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFReferenceStyle <em>EEF Reference Style</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>EEF Reference Style</em>'.
	 * @see org.eclipse.eef.EEFReferenceStyle
	 * @generated
	 */
	EClass getEEFReferenceStyle();

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
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_GROUP_DESCRIPTION__CONTAINER = EefPackage.eINSTANCE.getEEFGroupDescription_Container();

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
		 * The meta object literal for the '<em><b>Help Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION = EefPackage.eINSTANCE.getEEFWidgetDescription_HelpExpression();

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
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFLabelDescriptionImpl
		 * <em>EEF Label Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFLabelDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLabelDescription()
		 * @generated
		 */
		EClass EEF_LABEL_DESCRIPTION = EefPackage.eINSTANCE.getEEFLabelDescription();

		/**
		 * The meta object literal for the '<em><b>Body Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_LABEL_DESCRIPTION__BODY_EXPRESSION = EefPackage.eINSTANCE.getEEFLabelDescription_BodyExpression();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_LABEL_DESCRIPTION__STYLE = EefPackage.eINSTANCE.getEEFLabelDescription_Style();

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
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFReferenceDescriptionImpl
		 * <em>EEF Reference Description</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFReferenceDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFReferenceDescription()
		 * @generated
		 */
		EClass EEF_REFERENCE_DESCRIPTION = EefPackage.eINSTANCE.getEEFReferenceDescription();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_REFERENCE_DESCRIPTION__MULTIPLE = EefPackage.eINSTANCE.getEEFReferenceDescription_Multiple();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_REFERENCE_DESCRIPTION__VALUE_EXPRESSION = EefPackage.eINSTANCE.getEEFReferenceDescription_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Display Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_REFERENCE_DESCRIPTION__DISPLAY_EXPRESSION = EefPackage.eINSTANCE.getEEFReferenceDescription_DisplayExpression();

		/**
		 * The meta object literal for the '<em><b>On Click Expression</b></em>' attribute feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute EEF_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION = EefPackage.eINSTANCE.getEEFReferenceDescription_OnClickExpression();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_REFERENCE_DESCRIPTION__ACTIONS = EefPackage.eINSTANCE.getEEFReferenceDescription_Actions();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference EEF_REFERENCE_DESCRIPTION__STYLE = EefPackage.eINSTANCE.getEEFReferenceDescription_Style();

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
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFReferenceStyleImpl
		 * <em>EEF Reference Style</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.impl.EEFReferenceStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFReferenceStyle()
		 * @generated
		 */
		EClass EEF_REFERENCE_STYLE = EefPackage.eINSTANCE.getEEFReferenceStyle();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION
		 * <em>EEF VALIDATION SEVERITY DESCRIPTION</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see org.eclipse.eef.EEF_VALIDATION_SEVERITY_DESCRIPTION
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEF_VALIDATION_SEVERITY_DESCRIPTION()
		 * @generated
		 */
		EEnum EEF_VALIDATION_SEVERITY_DESCRIPTION = EefPackage.eINSTANCE.getEEF_VALIDATION_SEVERITY_DESCRIPTION();

	}

} // EefPackage
