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
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.eclipse.eef.EefFactory
 * @model kind="package"
 * @generated
 */
public interface EefPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eef"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/eef"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eef"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EefPackage eINSTANCE = org.eclipse.eef.impl.EefPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFViewDescriptionImpl <em>EEF View Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFViewDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFViewDescription()
	 * @generated
	 */
	int EEF_VIEW_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__PRECONDITION_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>User Defined Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__USER_DEFINED_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>EPackage Ns Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__EPACKAGE_NS_URIS = 4;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__GROUPS = 5;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__PAGES = 6;

	/**
	 * The feature id for the '<em><b>Java Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__JAVA_EXTENSIONS = 7;

	/**
	 * The feature id for the '<em><b>Imported Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__IMPORTED_VIEWS = 8;

	/**
	 * The feature id for the '<em><b>Tree Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__TREE_STRUCTURES = 9;

	/**
	 * The feature id for the '<em><b>Table Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__TABLE_STRUCTURES = 10;

	/**
	 * The feature id for the '<em><b>Style Customizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__STYLE_CUSTOMIZATIONS = 11;

	/**
	 * The number of structural features of the '<em>EEF View Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFPageDescriptionImpl <em>EEF Page Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFPageDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFPageDescription()
	 * @generated
	 */
	int EEF_PAGE_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__PRECONDITION_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>User Defined Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__USER_DEFINED_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__LABEL_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Domain Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__DOMAIN_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Semantic Candidate Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__GROUPS = 6;

	/**
	 * The feature id for the '<em><b>Extended Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__EXTENDED_PAGE = 7;

	/**
	 * The number of structural features of the '<em>EEF Page Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFGroupDescriptionImpl <em>EEF Group Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFGroupDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFGroupDescription()
	 * @generated
	 */
	int EEF_GROUP_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__PRECONDITION_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>User Defined Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__USER_DEFINED_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__LABEL_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Domain Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__DOMAIN_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Semantic Candidate Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__CONTAINER = 6;

	/**
	 * The feature id for the '<em><b>Collapsible Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__COLLAPSIBLE_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Collapsed By Default Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__COLLAPSED_BY_DEFAULT_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__VALIDATION = 9;

	/**
	 * The number of structural features of the '<em>EEF Group Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFContainerDescriptionImpl <em>EEF Container Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFContainerDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFContainerDescription()
	 * @generated
	 */
	int EEF_CONTAINER_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__PRECONDITION_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>User Defined Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__USER_DEFINED_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Semantic Candidate Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Domain Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__DOMAIN_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Layout Column Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__LAYOUT_COLUMN_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__CONTAINERS = 6;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__WIDGETS = 7;

	/**
	 * The number of structural features of the '<em>EEF Container Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFWidgetDescriptionImpl <em>EEF Widget Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFWidgetDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFWidgetDescription()
	 * @generated
	 */
	int EEF_WIDGET_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>User Defined Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__LABEL_STYLE = 4;

	/**
	 * The feature id for the '<em><b>Tooltip Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__VALIDATION = 7;

	/**
	 * The number of structural features of the '<em>EEF Widget Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFJavaExtensionDescriptionImpl <em>EEF Java Extension Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFJavaExtensionDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFJavaExtensionDescription()
	 * @generated
	 */
	int EEF_JAVA_EXTENSION_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_JAVA_EXTENSION_DESCRIPTION__QUALIFIED_NAME = 0;

	/**
	 * The number of structural features of the '<em>EEF Java Extension Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_JAVA_EXTENSION_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTreeStructureDescriptionImpl <em>EEF Tree Structure Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFTreeStructureDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTreeStructureDescription()
	 * @generated
	 */
	int EEF_TREE_STRUCTURE_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_STRUCTURE_DESCRIPTION__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_STRUCTURE_DESCRIPTION__MULTIPLE = 1;

	/**
	 * The number of structural features of the '<em>EEF Tree Structure Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_STRUCTURE_DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTableStructureDescriptionImpl <em>EEF Table Structure Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFTableStructureDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTableStructureDescription()
	 * @generated
	 */
	int EEF_TABLE_STRUCTURE_DESCRIPTION = 24;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_STRUCTURE_DESCRIPTION__MULTIPLE = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_STRUCTURE_DESCRIPTION__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Add Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_STRUCTURE_DESCRIPTION__ADD_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Remove Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_STRUCTURE_DESCRIPTION__REMOVE_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Up Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_STRUCTURE_DESCRIPTION__UP_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Down Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_STRUCTURE_DESCRIPTION__DOWN_EXPRESSION = 5;

	/**
	 * The number of structural features of the '<em>EEF Table Structure Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_STRUCTURE_DESCRIPTION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFInterpretedTableStructureDescriptionImpl <em>EEF Interpreted Table Structure Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFInterpretedTableStructureDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFInterpretedTableStructureDescription()
	 * @generated
	 */
	int EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__MULTIPLE = EEF_TABLE_STRUCTURE_DESCRIPTION__MULTIPLE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__IDENTIFIER = EEF_TABLE_STRUCTURE_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Add Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__ADD_EXPRESSION = EEF_TABLE_STRUCTURE_DESCRIPTION__ADD_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Remove Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__REMOVE_EXPRESSION = EEF_TABLE_STRUCTURE_DESCRIPTION__REMOVE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Up Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__UP_EXPRESSION = EEF_TABLE_STRUCTURE_DESCRIPTION__UP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Down Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__DOWN_EXPRESSION = EEF_TABLE_STRUCTURE_DESCRIPTION__DOWN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__COLUMNS = EEF_TABLE_STRUCTURE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__LINE = EEF_TABLE_STRUCTURE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEF Interpreted Table Structure Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION_FEATURE_COUNT = EEF_TABLE_STRUCTURE_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFCellWidgetDescriptionImpl <em>EEF Cell Widget Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFCellWidgetDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCellWidgetDescription()
	 * @generated
	 */
	int EEF_CELL_WIDGET_DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CELL_WIDGET_DESCRIPTION__IDENTIFIER = EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CELL_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION = EEF_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>User Defined Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CELL_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES = EEF_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CELL_WIDGET_DESCRIPTION__LABEL_EXPRESSION = EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CELL_WIDGET_DESCRIPTION__LABEL_STYLE = EEF_WIDGET_DESCRIPTION__LABEL_STYLE;

	/**
	 * The feature id for the '<em><b>Tooltip Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CELL_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION = EEF_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CELL_WIDGET_DESCRIPTION__HELP_EXPRESSION = EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CELL_WIDGET_DESCRIPTION__VALIDATION = EEF_WIDGET_DESCRIPTION__VALIDATION;

	/**
	 * The number of structural features of the '<em>EEF Cell Widget Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT = EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFAdapterFactoryTreeStructureDescriptionImpl <em>EEF Adapter Factory Tree Structure Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFAdapterFactoryTreeStructureDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFAdapterFactoryTreeStructureDescription()
	 * @generated
	 */
	int EEF_ADAPTER_FACTORY_TREE_STRUCTURE_DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_ADAPTER_FACTORY_TREE_STRUCTURE_DESCRIPTION__IDENTIFIER = EEF_TREE_STRUCTURE_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_ADAPTER_FACTORY_TREE_STRUCTURE_DESCRIPTION__MULTIPLE = EEF_TREE_STRUCTURE_DESCRIPTION__MULTIPLE;

	/**
	 * The feature id for the '<em><b>Adapter Factory Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_ADAPTER_FACTORY_TREE_STRUCTURE_DESCRIPTION__ADAPTER_FACTORY_PROVIDER = EEF_TREE_STRUCTURE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Adapter Factory Tree Structure Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_ADAPTER_FACTORY_TREE_STRUCTURE_DESCRIPTION_FEATURE_COUNT = EEF_TREE_STRUCTURE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFInterpretedTreeStructureDescriptionImpl <em>EEF Interpreted Tree Structure Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFInterpretedTreeStructureDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFInterpretedTreeStructureDescription()
	 * @generated
	 */
	int EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION = 10;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__IDENTIFIER = EEF_TREE_STRUCTURE_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__MULTIPLE = EEF_TREE_STRUCTURE_DESCRIPTION__MULTIPLE;

	/**
	 * The feature id for the '<em><b>Roots Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__ROOTS_EXPRESSION = EEF_TREE_STRUCTURE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CHILDREN_EXPRESSION = EEF_TREE_STRUCTURE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selectable Predicate Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__SELECTABLE_PREDICATE_EXPRESSION = EEF_TREE_STRUCTURE_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Candidate Display Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION = EEF_TREE_STRUCTURE_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EEF Interpreted Tree Structure Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION_FEATURE_COUNT = EEF_TREE_STRUCTURE_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTextDescriptionImpl <em>EEF Text Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFTextDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTextDescription()
	 * @generated
	 */
	int EEF_TEXT_DESCRIPTION = 11;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__IDENTIFIER = EEF_CELL_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__PRECONDITION_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>User Defined Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__USER_DEFINED_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__LABEL_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__LABEL_STYLE = EEF_CELL_WIDGET_DESCRIPTION__LABEL_STYLE;

	/**
	 * The feature id for the '<em><b>Tooltip Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__TOOLTIP_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__HELP_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__VALIDATION = EEF_CELL_WIDGET_DESCRIPTION__VALIDATION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__VALUE_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edit Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Read Only Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__READ_ONLY_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Content Assist Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__CONTENT_ASSIST_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Placeholder Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__PLACEHOLDER_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Line Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__LINE_COUNT = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__STYLE = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Conditional Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__CONDITIONAL_STYLES = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>EEF Text Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION_FEATURE_COUNT = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFCheckboxDescriptionImpl <em>EEF Checkbox Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFCheckboxDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCheckboxDescription()
	 * @generated
	 */
	int EEF_CHECKBOX_DESCRIPTION = 12;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__IDENTIFIER = EEF_CELL_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__PRECONDITION_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>User Defined Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__USER_DEFINED_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__LABEL_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__LABEL_STYLE = EEF_CELL_WIDGET_DESCRIPTION__LABEL_STYLE;

	/**
	 * The feature id for the '<em><b>Tooltip Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__TOOLTIP_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__HELP_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__VALIDATION = EEF_CELL_WIDGET_DESCRIPTION__VALIDATION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__VALUE_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edit Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__EDIT_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEF Checkbox Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION_FEATURE_COUNT = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFSelectDescriptionImpl <em>EEF Select Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFSelectDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFSelectDescription()
	 * @generated
	 */
	int EEF_SELECT_DESCRIPTION = 13;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__IDENTIFIER = EEF_CELL_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__PRECONDITION_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>User Defined Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__USER_DEFINED_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__LABEL_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__LABEL_STYLE = EEF_CELL_WIDGET_DESCRIPTION__LABEL_STYLE;

	/**
	 * The feature id for the '<em><b>Tooltip Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__TOOLTIP_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__HELP_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__VALIDATION = EEF_CELL_WIDGET_DESCRIPTION__VALIDATION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__VALUE_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edit Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__EDIT_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__CANDIDATES_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__MULTIPLE = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Candidate Display Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EEF Select Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION_FEATURE_COUNT = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFLabelDescriptionImpl <em>EEF Label Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFLabelDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLabelDescription()
	 * @generated
	 */
	int EEF_LABEL_DESCRIPTION = 14;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__IDENTIFIER = EEF_CELL_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__PRECONDITION_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>User Defined Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__USER_DEFINED_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__LABEL_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__LABEL_STYLE = EEF_CELL_WIDGET_DESCRIPTION__LABEL_STYLE;

	/**
	 * The feature id for the '<em><b>Tooltip Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__TOOLTIP_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__HELP_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__VALIDATION = EEF_CELL_WIDGET_DESCRIPTION__VALIDATION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__VALUE_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Label Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION_FEATURE_COUNT = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFRadioDescriptionImpl <em>EEF Radio Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFRadioDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFRadioDescription()
	 * @generated
	 */
	int EEF_RADIO_DESCRIPTION = 15;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__IDENTIFIER = EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__PRECONDITION_EXPRESSION = EEF_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>User Defined Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__USER_DEFINED_VARIABLES = EEF_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__LABEL_EXPRESSION = EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__LABEL_STYLE = EEF_WIDGET_DESCRIPTION__LABEL_STYLE;

	/**
	 * The feature id for the '<em><b>Tooltip Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__TOOLTIP_EXPRESSION = EEF_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__HELP_EXPRESSION = EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__VALIDATION = EEF_WIDGET_DESCRIPTION__VALIDATION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__VALUE_EXPRESSION = EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edit Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__EDIT_EXPRESSION = EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__CANDIDATES_EXPRESSION = EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Candidate Display Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION = EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EEF Radio Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION_FEATURE_COUNT = EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTreeDialogSelectDescriptionImpl <em>EEF Tree Dialog Select Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFTreeDialogSelectDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTreeDialogSelectDescription()
	 * @generated
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION = 16;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION__IDENTIFIER = EEF_CELL_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION__PRECONDITION_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>User Defined Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION__USER_DEFINED_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION__LABEL_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION__LABEL_STYLE = EEF_CELL_WIDGET_DESCRIPTION__LABEL_STYLE;

	/**
	 * The feature id for the '<em><b>Tooltip Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION__TOOLTIP_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION__HELP_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION__VALIDATION = EEF_CELL_WIDGET_DESCRIPTION__VALIDATION;

	/**
	 * The feature id for the '<em><b>Semantic Candidate Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION__DEFAULT_FILTER = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domain Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION__DOMAIN_CLASS = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tree</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION__TREE = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EEF Tree Dialog Select Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION_FEATURE_COUNT = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFLinkDescriptionImpl <em>EEF Link Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFLinkDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLinkDescription()
	 * @generated
	 */
	int EEF_LINK_DESCRIPTION = 17;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_DESCRIPTION__IDENTIFIER = EEF_CELL_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_DESCRIPTION__PRECONDITION_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>User Defined Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_DESCRIPTION__USER_DEFINED_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_DESCRIPTION__LABEL_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_DESCRIPTION__LABEL_STYLE = EEF_CELL_WIDGET_DESCRIPTION__LABEL_STYLE;

	/**
	 * The feature id for the '<em><b>Tooltip Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_DESCRIPTION__TOOLTIP_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_DESCRIPTION__HELP_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_DESCRIPTION__VALIDATION = EEF_CELL_WIDGET_DESCRIPTION__VALIDATION;

	/**
	 * The feature id for the '<em><b>On Click Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_DESCRIPTION__ON_CLICK_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Link Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_DESCRIPTION_FEATURE_COUNT = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFImageDescriptionImpl <em>EEF Image Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFImageDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFImageDescription()
	 * @generated
	 */
	int EEF_IMAGE_DESCRIPTION = 18;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_DESCRIPTION__IDENTIFIER = EEF_CELL_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_DESCRIPTION__PRECONDITION_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>User Defined Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_DESCRIPTION__USER_DEFINED_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_DESCRIPTION__LABEL_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_DESCRIPTION__LABEL_STYLE = EEF_CELL_WIDGET_DESCRIPTION__LABEL_STYLE;

	/**
	 * The feature id for the '<em><b>Tooltip Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_DESCRIPTION__TOOLTIP_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_DESCRIPTION__HELP_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_DESCRIPTION__VALIDATION = EEF_CELL_WIDGET_DESCRIPTION__VALIDATION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_DESCRIPTION__VALUE_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Image Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_DESCRIPTION_FEATURE_COUNT = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTreeDescriptionImpl <em>EEF Tree Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFTreeDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTreeDescription()
	 * @generated
	 */
	int EEF_TREE_DESCRIPTION = 19;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DESCRIPTION__IDENTIFIER = EEF_CELL_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DESCRIPTION__PRECONDITION_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>User Defined Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DESCRIPTION__USER_DEFINED_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DESCRIPTION__LABEL_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DESCRIPTION__LABEL_STYLE = EEF_CELL_WIDGET_DESCRIPTION__LABEL_STYLE;

	/**
	 * The feature id for the '<em><b>Tooltip Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DESCRIPTION__TOOLTIP_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DESCRIPTION__HELP_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DESCRIPTION__VALIDATION = EEF_CELL_WIDGET_DESCRIPTION__VALIDATION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DESCRIPTION__VALUE_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tree Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DESCRIPTION__TREE_STRUCTURE = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Edit Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DESCRIPTION__EDIT_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EEF Tree Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DESCRIPTION_FEATURE_COUNT = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFImagePickerDescriptionImpl <em>EEF Image Picker Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFImagePickerDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFImagePickerDescription()
	 * @generated
	 */
	int EEF_IMAGE_PICKER_DESCRIPTION = 20;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_PICKER_DESCRIPTION__IDENTIFIER = EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_PICKER_DESCRIPTION__PRECONDITION_EXPRESSION = EEF_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>User Defined Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_PICKER_DESCRIPTION__USER_DEFINED_VARIABLES = EEF_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_PICKER_DESCRIPTION__LABEL_EXPRESSION = EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_PICKER_DESCRIPTION__LABEL_STYLE = EEF_WIDGET_DESCRIPTION__LABEL_STYLE;

	/**
	 * The feature id for the '<em><b>Tooltip Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_PICKER_DESCRIPTION__TOOLTIP_EXPRESSION = EEF_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_PICKER_DESCRIPTION__HELP_EXPRESSION = EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_PICKER_DESCRIPTION__VALIDATION = EEF_WIDGET_DESCRIPTION__VALIDATION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_PICKER_DESCRIPTION__VALUE_EXPRESSION = EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edit Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_PICKER_DESCRIPTION__EDIT_EXPRESSION = EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_PICKER_DESCRIPTION__CANDIDATES_EXPRESSION = EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EEF Image Picker Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_PICKER_DESCRIPTION_FEATURE_COUNT = EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTableDescriptionImpl <em>EEF Table Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFTableDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTableDescription()
	 * @generated
	 */
	int EEF_TABLE_DESCRIPTION = 21;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_DESCRIPTION__IDENTIFIER = EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Precondition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_DESCRIPTION__PRECONDITION_EXPRESSION = EEF_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION;

	/**
	 * The feature id for the '<em><b>User Defined Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_DESCRIPTION__USER_DEFINED_VARIABLES = EEF_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_DESCRIPTION__LABEL_EXPRESSION = EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_DESCRIPTION__LABEL_STYLE = EEF_WIDGET_DESCRIPTION__LABEL_STYLE;

	/**
	 * The feature id for the '<em><b>Tooltip Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_DESCRIPTION__TOOLTIP_EXPRESSION = EEF_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Help Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_DESCRIPTION__HELP_EXPRESSION = EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_DESCRIPTION__VALIDATION = EEF_WIDGET_DESCRIPTION__VALIDATION;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_DESCRIPTION__VALUE_EXPRESSION = EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edit Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_DESCRIPTION__EDIT_EXPRESSION = EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_DESCRIPTION__TABLE_STRUCTURE = EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EEF Table Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_DESCRIPTION_FEATURE_COUNT = EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFColumnDescriptionImpl <em>EEF Column Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFColumnDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFColumnDescription()
	 * @generated
	 */
	int EEF_COLUMN_DESCRIPTION = 22;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_COLUMN_DESCRIPTION__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Header Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_COLUMN_DESCRIPTION__HEADER_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Cell Widget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_COLUMN_DESCRIPTION__CELL_WIDGET = 2;

	/**
	 * The number of structural features of the '<em>EEF Column Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_COLUMN_DESCRIPTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFLineDescriptionImpl <em>EEF Line Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFLineDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLineDescription()
	 * @generated
	 */
	int EEF_LINE_DESCRIPTION = 23;

	/**
	 * The feature id for the '<em><b>Header Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINE_DESCRIPTION__HEADER_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Semantic Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINE_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Domain Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINE_DESCRIPTION__DOMAIN_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Sub Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINE_DESCRIPTION__SUB_LINES = 3;

	/**
	 * The number of structural features of the '<em>EEF Line Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINE_DESCRIPTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFAdapterFactoryTableStructureDescriptionImpl <em>EEF Adapter Factory Table Structure Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFAdapterFactoryTableStructureDescriptionImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFAdapterFactoryTableStructureDescription()
	 * @generated
	 */
	int EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION = 25;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION__MULTIPLE = EEF_TABLE_STRUCTURE_DESCRIPTION__MULTIPLE;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION__IDENTIFIER = EEF_TABLE_STRUCTURE_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Add Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION__ADD_EXPRESSION = EEF_TABLE_STRUCTURE_DESCRIPTION__ADD_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Remove Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION__REMOVE_EXPRESSION = EEF_TABLE_STRUCTURE_DESCRIPTION__REMOVE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Up Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION__UP_EXPRESSION = EEF_TABLE_STRUCTURE_DESCRIPTION__UP_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Down Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION__DOWN_EXPRESSION = EEF_TABLE_STRUCTURE_DESCRIPTION__DOWN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Adapter Factory Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION__ADAPTER_FACTORY_PROVIDER = EEF_TABLE_STRUCTURE_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Adapter Factory Table Structure Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION_FEATURE_COUNT = EEF_TABLE_STRUCTURE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFStyleImpl <em>EEF Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFStyle()
	 * @generated
	 */
	int EEF_STYLE = 26;

	/**
	 * The feature id for the '<em><b>Font Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_STYLE__FONT_EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>EEF Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_STYLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFConditionalStyleImpl <em>EEF Conditional Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFConditionalStyle()
	 * @generated
	 */
	int EEF_CONDITIONAL_STYLE = 27;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>EEF Conditional Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONDITIONAL_STYLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFStyleCustomizationImpl <em>EEF Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFStyleCustomizationImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFStyleCustomization()
	 * @generated
	 */
	int EEF_STYLE_CUSTOMIZATION = 28;

	/**
	 * The number of structural features of the '<em>EEF Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFGroupStyleImpl <em>EEF Group Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFGroupStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFGroupStyle()
	 * @generated
	 */
	int EEF_GROUP_STYLE = 29;

	/**
	 * The feature id for the '<em><b>Font Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_STYLE__FONT_EXPRESSION = EEF_STYLE__FONT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Foreground Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_STYLE__FOREGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Group Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_STYLE_FEATURE_COUNT = EEF_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFGroupConditionalStyleImpl <em>EEF Group Conditional Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFGroupConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFGroupConditionalStyle()
	 * @generated
	 */
	int EEF_GROUP_CONDITIONAL_STYLE = 30;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION = EEF_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_CONDITIONAL_STYLE__STYLE = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Group Conditional Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_CONDITIONAL_STYLE_FEATURE_COUNT = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFGroupStyleCustomizationImpl <em>EEF Group Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFGroupStyleCustomizationImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFGroupStyleCustomization()
	 * @generated
	 */
	int EEF_GROUP_STYLE_CUSTOMIZATION = 31;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_STYLE_CUSTOMIZATION__STYLE = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Group Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_STYLE_CUSTOMIZATION_FEATURE_COUNT = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTextStyleImpl <em>EEF Text Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFTextStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTextStyle()
	 * @generated
	 */
	int EEF_TEXT_STYLE = 32;

	/**
	 * The feature id for the '<em><b>Font Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_STYLE__FONT_EXPRESSION = EEF_STYLE__FONT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Background Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_STYLE__BACKGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Foreground Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_STYLE__FOREGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEF Text Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_STYLE_FEATURE_COUNT = EEF_STYLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTextConditionalStyleImpl <em>EEF Text Conditional Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFTextConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTextConditionalStyle()
	 * @generated
	 */
	int EEF_TEXT_CONDITIONAL_STYLE = 33;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION = EEF_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_CONDITIONAL_STYLE__STYLE = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Text Conditional Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_CONDITIONAL_STYLE_FEATURE_COUNT = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTextStyleCustomizationImpl <em>EEF Text Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFTextStyleCustomizationImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTextStyleCustomization()
	 * @generated
	 */
	int EEF_TEXT_STYLE_CUSTOMIZATION = 34;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_STYLE_CUSTOMIZATION__STYLE = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Text Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_STYLE_CUSTOMIZATION_FEATURE_COUNT = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFCheckboxStyleImpl <em>EEF Checkbox Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFCheckboxStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCheckboxStyle()
	 * @generated
	 */
	int EEF_CHECKBOX_STYLE = 35;

	/**
	 * The feature id for the '<em><b>Font Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_STYLE__FONT_EXPRESSION = EEF_STYLE__FONT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Background Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_STYLE__BACKGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Foreground Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_STYLE__FOREGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEF Checkbox Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_STYLE_FEATURE_COUNT = EEF_STYLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFCheckboxConditionalStyleImpl <em>EEF Checkbox Conditional Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFCheckboxConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCheckboxConditionalStyle()
	 * @generated
	 */
	int EEF_CHECKBOX_CONDITIONAL_STYLE = 36;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_CONDITIONAL_STYLE__STYLE = 0;

	/**
	 * The number of structural features of the '<em>EEF Checkbox Conditional Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_CONDITIONAL_STYLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFCheckboxStyleCustomizationImpl <em>EEF Checkbox Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFCheckboxStyleCustomizationImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCheckboxStyleCustomization()
	 * @generated
	 */
	int EEF_CHECKBOX_STYLE_CUSTOMIZATION = 37;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_STYLE_CUSTOMIZATION__STYLE = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Checkbox Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_STYLE_CUSTOMIZATION_FEATURE_COUNT = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFLabelStyleImpl <em>EEF Label Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFLabelStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLabelStyle()
	 * @generated
	 */
	int EEF_LABEL_STYLE = 38;

	/**
	 * The feature id for the '<em><b>Font Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_STYLE__FONT_EXPRESSION = EEF_STYLE__FONT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Background Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_STYLE__BACKGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Foreground Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_STYLE__FOREGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEF Label Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_STYLE_FEATURE_COUNT = EEF_STYLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFLabelConditionalStyleImpl <em>EEF Label Conditional Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFLabelConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLabelConditionalStyle()
	 * @generated
	 */
	int EEF_LABEL_CONDITIONAL_STYLE = 39;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION = EEF_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_CONDITIONAL_STYLE__STYLE = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Label Conditional Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_CONDITIONAL_STYLE_FEATURE_COUNT = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFLabelStyleCustomizationImpl <em>EEF Label Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFLabelStyleCustomizationImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLabelStyleCustomization()
	 * @generated
	 */
	int EEF_LABEL_STYLE_CUSTOMIZATION = 40;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_STYLE_CUSTOMIZATION__STYLE = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Label Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_STYLE_CUSTOMIZATION_FEATURE_COUNT = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFRadioStyleImpl <em>EEF Radio Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFRadioStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFRadioStyle()
	 * @generated
	 */
	int EEF_RADIO_STYLE = 41;

	/**
	 * The feature id for the '<em><b>Font Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_STYLE__FONT_EXPRESSION = EEF_STYLE__FONT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Background Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_STYLE__BACKGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Foreground Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_STYLE__FOREGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEF Radio Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_STYLE_FEATURE_COUNT = EEF_STYLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFRadioConditionalStyleImpl <em>EEF Radio Conditional Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFRadioConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFRadioConditionalStyle()
	 * @generated
	 */
	int EEF_RADIO_CONDITIONAL_STYLE = 42;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION = EEF_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_CONDITIONAL_STYLE__STYLE = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Radio Conditional Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_CONDITIONAL_STYLE_FEATURE_COUNT = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFRadioStyleCustomizationImpl <em>EEF Radio Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFRadioStyleCustomizationImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFRadioStyleCustomization()
	 * @generated
	 */
	int EEF_RADIO_STYLE_CUSTOMIZATION = 43;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_STYLE_CUSTOMIZATION__STYLE = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Radio Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_STYLE_CUSTOMIZATION_FEATURE_COUNT = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFLinkStyleImpl <em>EEF Link Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFLinkStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLinkStyle()
	 * @generated
	 */
	int EEF_LINK_STYLE = 44;

	/**
	 * The feature id for the '<em><b>Font Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_STYLE__FONT_EXPRESSION = EEF_STYLE__FONT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Background Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_STYLE__BACKGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Foreground Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_STYLE__FOREGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Background Image Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_STYLE__BACKGROUND_IMAGE_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EEF Link Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_STYLE_FEATURE_COUNT = EEF_STYLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFLinkConditionalStyleImpl <em>EEF Link Conditional Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFLinkConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLinkConditionalStyle()
	 * @generated
	 */
	int EEF_LINK_CONDITIONAL_STYLE = 45;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION = EEF_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_CONDITIONAL_STYLE__STYLE = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Link Conditional Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_CONDITIONAL_STYLE_FEATURE_COUNT = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFLinkStyleCustomizationImpl <em>EEF Link Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFLinkStyleCustomizationImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLinkStyleCustomization()
	 * @generated
	 */
	int EEF_LINK_STYLE_CUSTOMIZATION = 46;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_STYLE_CUSTOMIZATION__STYLE = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Link Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_STYLE_CUSTOMIZATION_FEATURE_COUNT = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFSelectStyleImpl <em>EEF Select Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFSelectStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFSelectStyle()
	 * @generated
	 */
	int EEF_SELECT_STYLE = 47;

	/**
	 * The feature id for the '<em><b>Font Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_STYLE__FONT_EXPRESSION = EEF_STYLE__FONT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Background Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_STYLE__BACKGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Foreground Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_STYLE__FOREGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EEF Select Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_STYLE_FEATURE_COUNT = EEF_STYLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFSelectConditionalStyleImpl <em>EEF Select Conditional Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFSelectConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFSelectConditionalStyle()
	 * @generated
	 */
	int EEF_SELECT_CONDITIONAL_STYLE = 48;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION = EEF_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_CONDITIONAL_STYLE__STYLE = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Select Conditional Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_CONDITIONAL_STYLE_FEATURE_COUNT = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFSelectStyleCustomizationImpl <em>EEF Select Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFSelectStyleCustomizationImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFSelectStyleCustomization()
	 * @generated
	 */
	int EEF_SELECT_STYLE_CUSTOMIZATION = 49;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_STYLE_CUSTOMIZATION__STYLE = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Select Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_STYLE_CUSTOMIZATION_FEATURE_COUNT = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTreeStyleImpl <em>EEF Tree Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFTreeStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTreeStyle()
	 * @generated
	 */
	int EEF_TREE_STYLE = 50;

	/**
	 * The feature id for the '<em><b>Font Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_STYLE__FONT_EXPRESSION = EEF_STYLE__FONT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>EEF Tree Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_STYLE_FEATURE_COUNT = EEF_STYLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTreeConditionalStyleImpl <em>EEF Tree Conditional Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFTreeConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTreeConditionalStyle()
	 * @generated
	 */
	int EEF_TREE_CONDITIONAL_STYLE = 51;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION = EEF_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_CONDITIONAL_STYLE__STYLE = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Tree Conditional Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_CONDITIONAL_STYLE_FEATURE_COUNT = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTreeStyleCustomizationImpl <em>EEF Tree Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFTreeStyleCustomizationImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTreeStyleCustomization()
	 * @generated
	 */
	int EEF_TREE_STYLE_CUSTOMIZATION = 52;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_STYLE_CUSTOMIZATION__STYLE = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Tree Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_STYLE_CUSTOMIZATION_FEATURE_COUNT = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTableStyleImpl <em>EEF Table Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFTableStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTableStyle()
	 * @generated
	 */
	int EEF_TABLE_STYLE = 53;

	/**
	 * The feature id for the '<em><b>Font Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_STYLE__FONT_EXPRESSION = EEF_STYLE__FONT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>EEF Table Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_STYLE_FEATURE_COUNT = EEF_STYLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTableConditionalStyleImpl <em>EEF Table Conditional Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFTableConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTableConditionalStyle()
	 * @generated
	 */
	int EEF_TABLE_CONDITIONAL_STYLE = 54;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION = EEF_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_CONDITIONAL_STYLE__STYLE = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Table Conditional Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_CONDITIONAL_STYLE_FEATURE_COUNT = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFTableStyleCustomizationImpl <em>EEF Table Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFTableStyleCustomizationImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTableStyleCustomization()
	 * @generated
	 */
	int EEF_TABLE_STYLE_CUSTOMIZATION = 55;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_STYLE_CUSTOMIZATION__STYLE = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Table Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_STYLE_CUSTOMIZATION_FEATURE_COUNT = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFLineStyleImpl <em>EEF Line Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFLineStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLineStyle()
	 * @generated
	 */
	int EEF_LINE_STYLE = 56;

	/**
	 * The feature id for the '<em><b>Font Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINE_STYLE__FONT_EXPRESSION = EEF_STYLE__FONT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Background Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINE_STYLE__BACKGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Foreground Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINE_STYLE__FOREGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Header Background Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINE_STYLE__HEADER_BACKGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Header Foreground Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINE_STYLE__HEADER_FOREGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EEF Line Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINE_STYLE_FEATURE_COUNT = EEF_STYLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFLineConditionalStyleImpl <em>EEF Line Conditional Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFLineConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLineConditionalStyle()
	 * @generated
	 */
	int EEF_LINE_CONDITIONAL_STYLE = 57;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINE_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION = EEF_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINE_CONDITIONAL_STYLE__STYLE = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Line Conditional Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINE_CONDITIONAL_STYLE_FEATURE_COUNT = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFLineStyleCustomizationImpl <em>EEF Line Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFLineStyleCustomizationImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLineStyleCustomization()
	 * @generated
	 */
	int EEF_LINE_STYLE_CUSTOMIZATION = 58;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINE_STYLE_CUSTOMIZATION__STYLE = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Line Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINE_STYLE_CUSTOMIZATION_FEATURE_COUNT = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFColumnStyleImpl <em>EEF Column Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFColumnStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFColumnStyle()
	 * @generated
	 */
	int EEF_COLUMN_STYLE = 59;

	/**
	 * The feature id for the '<em><b>Font Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_COLUMN_STYLE__FONT_EXPRESSION = EEF_STYLE__FONT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Background Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_COLUMN_STYLE__BACKGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Foreground Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_COLUMN_STYLE__FOREGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Header Background Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_COLUMN_STYLE__HEADER_BACKGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Header Foreground Color Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_COLUMN_STYLE__HEADER_FOREGROUND_COLOR_EXPRESSION = EEF_STYLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EEF Column Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_COLUMN_STYLE_FEATURE_COUNT = EEF_STYLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFColumnConditionalStyleImpl <em>EEF Column Conditional Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFColumnConditionalStyleImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFColumnConditionalStyle()
	 * @generated
	 */
	int EEF_COLUMN_CONDITIONAL_STYLE = 60;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_COLUMN_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION = EEF_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_COLUMN_CONDITIONAL_STYLE__STYLE = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Column Conditional Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_COLUMN_CONDITIONAL_STYLE_FEATURE_COUNT = EEF_CONDITIONAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFColumnStyleCustomizationImpl <em>EEF Column Style Customization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFColumnStyleCustomizationImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFColumnStyleCustomization()
	 * @generated
	 */
	int EEF_COLUMN_STYLE_CUSTOMIZATION = 61;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_COLUMN_STYLE_CUSTOMIZATION__STYLE = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEF Column Style Customization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_COLUMN_STYLE_CUSTOMIZATION_FEATURE_COUNT = EEF_STYLE_CUSTOMIZATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFQuickFixImpl <em>EEF Quick Fix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFQuickFixImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFQuickFix()
	 * @generated
	 */
	int EEF_QUICK_FIX = 62;

	/**
	 * The feature id for the '<em><b>Title Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_QUICK_FIX__TITLE_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Message Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_QUICK_FIX__MESSAGE_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Can Handle Status Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_QUICK_FIX__CAN_HANDLE_STATUS_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Fix Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_QUICK_FIX__FIX_EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>EEF Quick Fix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_QUICK_FIX_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.impl.EEFValidationImpl <em>EEF Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.impl.EEFValidationImpl
	 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFValidation()
	 * @generated
	 */
	int EEF_VALIDATION = 63;

	/**
	 * The feature id for the '<em><b>Validation Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VALIDATION__VALIDATION_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Quickfixes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VALIDATION__QUICKFIXES = 1;

	/**
	 * The number of structural features of the '<em>EEF Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VALIDATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '<em>Type Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.eef.impl.EefPackageImpl#getTypeName()
	 * @generated
	 */
	int TYPE_NAME = 64;

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFViewDescription <em>EEF View Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF View Description</em>'.
	 * @see org.eclipse.eef.EEFViewDescription
	 * @generated
	 */
	EClass getEEFViewDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFViewDescription#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.EEFViewDescription#getIdentifier()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EAttribute getEEFViewDescription_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFViewDescription#getPreconditionExpression <em>Precondition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition Expression</em>'.
	 * @see org.eclipse.eef.EEFViewDescription#getPreconditionExpression()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EAttribute getEEFViewDescription_PreconditionExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFViewDescription#getUserDefinedVariables <em>User Defined Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Defined Variables</em>'.
	 * @see org.eclipse.eef.EEFViewDescription#getUserDefinedVariables()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EReference getEEFViewDescription_UserDefinedVariables();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFViewDescription#getLabelExpression <em>Label Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Expression</em>'.
	 * @see org.eclipse.eef.EEFViewDescription#getLabelExpression()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EAttribute getEEFViewDescription_LabelExpression();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.eef.EEFViewDescription#getEPackageNsUris <em>EPackage Ns Uris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EPackage Ns Uris</em>'.
	 * @see org.eclipse.eef.EEFViewDescription#getEPackageNsUris()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EAttribute getEEFViewDescription_EPackageNsUris();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFViewDescription#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.eclipse.eef.EEFViewDescription#getGroups()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EReference getEEFViewDescription_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFViewDescription#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see org.eclipse.eef.EEFViewDescription#getPages()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EReference getEEFViewDescription_Pages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFViewDescription#getJavaExtensions <em>Java Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Java Extensions</em>'.
	 * @see org.eclipse.eef.EEFViewDescription#getJavaExtensions()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EReference getEEFViewDescription_JavaExtensions();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.eef.EEFViewDescription#getImportedViews <em>Imported Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imported Views</em>'.
	 * @see org.eclipse.eef.EEFViewDescription#getImportedViews()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EReference getEEFViewDescription_ImportedViews();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFViewDescription#getTreeStructures <em>Tree Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tree Structures</em>'.
	 * @see org.eclipse.eef.EEFViewDescription#getTreeStructures()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EReference getEEFViewDescription_TreeStructures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFViewDescription#getTableStructures <em>Table Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Structures</em>'.
	 * @see org.eclipse.eef.EEFViewDescription#getTableStructures()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EReference getEEFViewDescription_TableStructures();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.eef.EEFViewDescription#getStyleCustomizations <em>Style Customizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Style Customizations</em>'.
	 * @see org.eclipse.eef.EEFViewDescription#getStyleCustomizations()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EReference getEEFViewDescription_StyleCustomizations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFPageDescription <em>EEF Page Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Page Description</em>'.
	 * @see org.eclipse.eef.EEFPageDescription
	 * @generated
	 */
	EClass getEEFPageDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFPageDescription#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.EEFPageDescription#getIdentifier()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EAttribute getEEFPageDescription_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFPageDescription#getPreconditionExpression <em>Precondition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition Expression</em>'.
	 * @see org.eclipse.eef.EEFPageDescription#getPreconditionExpression()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EAttribute getEEFPageDescription_PreconditionExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFPageDescription#getUserDefinedVariables <em>User Defined Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Defined Variables</em>'.
	 * @see org.eclipse.eef.EEFPageDescription#getUserDefinedVariables()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EReference getEEFPageDescription_UserDefinedVariables();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFPageDescription#getLabelExpression <em>Label Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Expression</em>'.
	 * @see org.eclipse.eef.EEFPageDescription#getLabelExpression()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EAttribute getEEFPageDescription_LabelExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFPageDescription#getDomainClass <em>Domain Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Class</em>'.
	 * @see org.eclipse.eef.EEFPageDescription#getDomainClass()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EAttribute getEEFPageDescription_DomainClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFPageDescription#getSemanticCandidateExpression <em>Semantic Candidate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Candidate Expression</em>'.
	 * @see org.eclipse.eef.EEFPageDescription#getSemanticCandidateExpression()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EAttribute getEEFPageDescription_SemanticCandidateExpression();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.eef.EEFPageDescription#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see org.eclipse.eef.EEFPageDescription#getGroups()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EReference getEEFPageDescription_Groups();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eef.EEFPageDescription#getExtendedPage <em>Extended Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extended Page</em>'.
	 * @see org.eclipse.eef.EEFPageDescription#getExtendedPage()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EReference getEEFPageDescription_ExtendedPage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFGroupDescription <em>EEF Group Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Group Description</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription
	 * @generated
	 */
	EClass getEEFGroupDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGroupDescription#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getIdentifier()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EAttribute getEEFGroupDescription_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGroupDescription#getPreconditionExpression <em>Precondition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition Expression</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getPreconditionExpression()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EAttribute getEEFGroupDescription_PreconditionExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFGroupDescription#getUserDefinedVariables <em>User Defined Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Defined Variables</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getUserDefinedVariables()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EReference getEEFGroupDescription_UserDefinedVariables();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGroupDescription#getLabelExpression <em>Label Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Expression</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getLabelExpression()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EAttribute getEEFGroupDescription_LabelExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGroupDescription#getDomainClass <em>Domain Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Class</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getDomainClass()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EAttribute getEEFGroupDescription_DomainClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGroupDescription#getSemanticCandidateExpression <em>Semantic Candidate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Candidate Expression</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getSemanticCandidateExpression()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EAttribute getEEFGroupDescription_SemanticCandidateExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFGroupDescription#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getContainer()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EReference getEEFGroupDescription_Container();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGroupDescription#getCollapsibleExpression <em>Collapsible Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsible Expression</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getCollapsibleExpression()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EAttribute getEEFGroupDescription_CollapsibleExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGroupDescription#getCollapsedByDefaultExpression <em>Collapsed By Default Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsed By Default Expression</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getCollapsedByDefaultExpression()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EAttribute getEEFGroupDescription_CollapsedByDefaultExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFGroupDescription#getValidation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validation</em>'.
	 * @see org.eclipse.eef.EEFGroupDescription#getValidation()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EReference getEEFGroupDescription_Validation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFContainerDescription <em>EEF Container Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Container Description</em>'.
	 * @see org.eclipse.eef.EEFContainerDescription
	 * @generated
	 */
	EClass getEEFContainerDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFContainerDescription#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.EEFContainerDescription#getIdentifier()
	 * @see #getEEFContainerDescription()
	 * @generated
	 */
	EAttribute getEEFContainerDescription_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFContainerDescription#getPreconditionExpression <em>Precondition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition Expression</em>'.
	 * @see org.eclipse.eef.EEFContainerDescription#getPreconditionExpression()
	 * @see #getEEFContainerDescription()
	 * @generated
	 */
	EAttribute getEEFContainerDescription_PreconditionExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFContainerDescription#getUserDefinedVariables <em>User Defined Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Defined Variables</em>'.
	 * @see org.eclipse.eef.EEFContainerDescription#getUserDefinedVariables()
	 * @see #getEEFContainerDescription()
	 * @generated
	 */
	EReference getEEFContainerDescription_UserDefinedVariables();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFContainerDescription#getSemanticCandidateExpression <em>Semantic Candidate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Candidate Expression</em>'.
	 * @see org.eclipse.eef.EEFContainerDescription#getSemanticCandidateExpression()
	 * @see #getEEFContainerDescription()
	 * @generated
	 */
	EAttribute getEEFContainerDescription_SemanticCandidateExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFContainerDescription#getDomainClass <em>Domain Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Class</em>'.
	 * @see org.eclipse.eef.EEFContainerDescription#getDomainClass()
	 * @see #getEEFContainerDescription()
	 * @generated
	 */
	EAttribute getEEFContainerDescription_DomainClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFContainerDescription#getLayoutColumnCount <em>Layout Column Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Column Count</em>'.
	 * @see org.eclipse.eef.EEFContainerDescription#getLayoutColumnCount()
	 * @see #getEEFContainerDescription()
	 * @generated
	 */
	EAttribute getEEFContainerDescription_LayoutColumnCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFContainerDescription#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see org.eclipse.eef.EEFContainerDescription#getContainers()
	 * @see #getEEFContainerDescription()
	 * @generated
	 */
	EReference getEEFContainerDescription_Containers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFContainerDescription#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see org.eclipse.eef.EEFContainerDescription#getWidgets()
	 * @see #getEEFContainerDescription()
	 * @generated
	 */
	EReference getEEFContainerDescription_Widgets();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFWidgetDescription <em>EEF Widget Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Widget Description</em>'.
	 * @see org.eclipse.eef.EEFWidgetDescription
	 * @generated
	 */
	EClass getEEFWidgetDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFWidgetDescription#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.EEFWidgetDescription#getIdentifier()
	 * @see #getEEFWidgetDescription()
	 * @generated
	 */
	EAttribute getEEFWidgetDescription_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFWidgetDescription#getPreconditionExpression <em>Precondition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition Expression</em>'.
	 * @see org.eclipse.eef.EEFWidgetDescription#getPreconditionExpression()
	 * @see #getEEFWidgetDescription()
	 * @generated
	 */
	EAttribute getEEFWidgetDescription_PreconditionExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFWidgetDescription#getUserDefinedVariables <em>User Defined Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Defined Variables</em>'.
	 * @see org.eclipse.eef.EEFWidgetDescription#getUserDefinedVariables()
	 * @see #getEEFWidgetDescription()
	 * @generated
	 */
	EReference getEEFWidgetDescription_UserDefinedVariables();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFWidgetDescription#getLabelExpression <em>Label Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Expression</em>'.
	 * @see org.eclipse.eef.EEFWidgetDescription#getLabelExpression()
	 * @see #getEEFWidgetDescription()
	 * @generated
	 */
	EAttribute getEEFWidgetDescription_LabelExpression();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eef.EEFWidgetDescription#getLabelStyle <em>Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label Style</em>'.
	 * @see org.eclipse.eef.EEFWidgetDescription#getLabelStyle()
	 * @see #getEEFWidgetDescription()
	 * @generated
	 */
	EReference getEEFWidgetDescription_LabelStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFWidgetDescription#getTooltipExpression <em>Tooltip Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip Expression</em>'.
	 * @see org.eclipse.eef.EEFWidgetDescription#getTooltipExpression()
	 * @see #getEEFWidgetDescription()
	 * @generated
	 */
	EAttribute getEEFWidgetDescription_TooltipExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFWidgetDescription#getHelpExpression <em>Help Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help Expression</em>'.
	 * @see org.eclipse.eef.EEFWidgetDescription#getHelpExpression()
	 * @see #getEEFWidgetDescription()
	 * @generated
	 */
	EAttribute getEEFWidgetDescription_HelpExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFWidgetDescription#getValidation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validation</em>'.
	 * @see org.eclipse.eef.EEFWidgetDescription#getValidation()
	 * @see #getEEFWidgetDescription()
	 * @generated
	 */
	EReference getEEFWidgetDescription_Validation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFJavaExtensionDescription <em>EEF Java Extension Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Java Extension Description</em>'.
	 * @see org.eclipse.eef.EEFJavaExtensionDescription
	 * @generated
	 */
	EClass getEEFJavaExtensionDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFJavaExtensionDescription#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see org.eclipse.eef.EEFJavaExtensionDescription#getQualifiedName()
	 * @see #getEEFJavaExtensionDescription()
	 * @generated
	 */
	EAttribute getEEFJavaExtensionDescription_QualifiedName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFTreeStructureDescription <em>EEF Tree Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Tree Structure Description</em>'.
	 * @see org.eclipse.eef.EEFTreeStructureDescription
	 * @generated
	 */
	EClass getEEFTreeStructureDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTreeStructureDescription#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.EEFTreeStructureDescription#getIdentifier()
	 * @see #getEEFTreeStructureDescription()
	 * @generated
	 */
	EAttribute getEEFTreeStructureDescription_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTreeStructureDescription#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see org.eclipse.eef.EEFTreeStructureDescription#isMultiple()
	 * @see #getEEFTreeStructureDescription()
	 * @generated
	 */
	EAttribute getEEFTreeStructureDescription_Multiple();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFInterpretedTableStructureDescription <em>EEF Interpreted Table Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Interpreted Table Structure Description</em>'.
	 * @see org.eclipse.eef.EEFInterpretedTableStructureDescription
	 * @generated
	 */
	EClass getEEFInterpretedTableStructureDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFInterpretedTableStructureDescription#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.eclipse.eef.EEFInterpretedTableStructureDescription#getColumns()
	 * @see #getEEFInterpretedTableStructureDescription()
	 * @generated
	 */
	EReference getEEFInterpretedTableStructureDescription_Columns();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFInterpretedTableStructureDescription#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see org.eclipse.eef.EEFInterpretedTableStructureDescription#getLine()
	 * @see #getEEFInterpretedTableStructureDescription()
	 * @generated
	 */
	EReference getEEFInterpretedTableStructureDescription_Line();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFCellWidgetDescription <em>EEF Cell Widget Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Cell Widget Description</em>'.
	 * @see org.eclipse.eef.EEFCellWidgetDescription
	 * @generated
	 */
	EClass getEEFCellWidgetDescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFAdapterFactoryTreeStructureDescription <em>EEF Adapter Factory Tree Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Adapter Factory Tree Structure Description</em>'.
	 * @see org.eclipse.eef.EEFAdapterFactoryTreeStructureDescription
	 * @generated
	 */
	EClass getEEFAdapterFactoryTreeStructureDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFAdapterFactoryTreeStructureDescription#getAdapterFactoryProvider <em>Adapter Factory Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter Factory Provider</em>'.
	 * @see org.eclipse.eef.EEFAdapterFactoryTreeStructureDescription#getAdapterFactoryProvider()
	 * @see #getEEFAdapterFactoryTreeStructureDescription()
	 * @generated
	 */
	EAttribute getEEFAdapterFactoryTreeStructureDescription_AdapterFactoryProvider();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFInterpretedTreeStructureDescription <em>EEF Interpreted Tree Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Interpreted Tree Structure Description</em>'.
	 * @see org.eclipse.eef.EEFInterpretedTreeStructureDescription
	 * @generated
	 */
	EClass getEEFInterpretedTreeStructureDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFInterpretedTreeStructureDescription#getRootsExpression <em>Roots Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roots Expression</em>'.
	 * @see org.eclipse.eef.EEFInterpretedTreeStructureDescription#getRootsExpression()
	 * @see #getEEFInterpretedTreeStructureDescription()
	 * @generated
	 */
	EAttribute getEEFInterpretedTreeStructureDescription_RootsExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFInterpretedTreeStructureDescription#getChildrenExpression <em>Children Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Children Expression</em>'.
	 * @see org.eclipse.eef.EEFInterpretedTreeStructureDescription#getChildrenExpression()
	 * @see #getEEFInterpretedTreeStructureDescription()
	 * @generated
	 */
	EAttribute getEEFInterpretedTreeStructureDescription_ChildrenExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFInterpretedTreeStructureDescription#getSelectablePredicateExpression <em>Selectable Predicate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selectable Predicate Expression</em>'.
	 * @see org.eclipse.eef.EEFInterpretedTreeStructureDescription#getSelectablePredicateExpression()
	 * @see #getEEFInterpretedTreeStructureDescription()
	 * @generated
	 */
	EAttribute getEEFInterpretedTreeStructureDescription_SelectablePredicateExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFInterpretedTreeStructureDescription#getCandidateDisplayExpression <em>Candidate Display Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Candidate Display Expression</em>'.
	 * @see org.eclipse.eef.EEFInterpretedTreeStructureDescription#getCandidateDisplayExpression()
	 * @see #getEEFInterpretedTreeStructureDescription()
	 * @generated
	 */
	EAttribute getEEFInterpretedTreeStructureDescription_CandidateDisplayExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFTextDescription <em>EEF Text Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Text Description</em>'.
	 * @see org.eclipse.eef.EEFTextDescription
	 * @generated
	 */
	EClass getEEFTextDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTextDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.EEFTextDescription#getValueExpression()
	 * @see #getEEFTextDescription()
	 * @generated
	 */
	EAttribute getEEFTextDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTextDescription#getEditExpression <em>Edit Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.EEFTextDescription#getEditExpression()
	 * @see #getEEFTextDescription()
	 * @generated
	 */
	EAttribute getEEFTextDescription_EditExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTextDescription#getReadOnlyExpression <em>Read Only Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only Expression</em>'.
	 * @see org.eclipse.eef.EEFTextDescription#getReadOnlyExpression()
	 * @see #getEEFTextDescription()
	 * @generated
	 */
	EAttribute getEEFTextDescription_ReadOnlyExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTextDescription#getContentAssistExpression <em>Content Assist Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Assist Expression</em>'.
	 * @see org.eclipse.eef.EEFTextDescription#getContentAssistExpression()
	 * @see #getEEFTextDescription()
	 * @generated
	 */
	EAttribute getEEFTextDescription_ContentAssistExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTextDescription#getPlaceholderExpression <em>Placeholder Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder Expression</em>'.
	 * @see org.eclipse.eef.EEFTextDescription#getPlaceholderExpression()
	 * @see #getEEFTextDescription()
	 * @generated
	 */
	EAttribute getEEFTextDescription_PlaceholderExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTextDescription#getLineCount <em>Line Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Count</em>'.
	 * @see org.eclipse.eef.EEFTextDescription#getLineCount()
	 * @see #getEEFTextDescription()
	 * @generated
	 */
	EAttribute getEEFTextDescription_LineCount();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFTextDescription#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFTextDescription#getStyle()
	 * @see #getEEFTextDescription()
	 * @generated
	 */
	EReference getEEFTextDescription_Style();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFTextDescription#getConditionalStyles <em>Conditional Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditional Styles</em>'.
	 * @see org.eclipse.eef.EEFTextDescription#getConditionalStyles()
	 * @see #getEEFTextDescription()
	 * @generated
	 */
	EReference getEEFTextDescription_ConditionalStyles();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFCheckboxDescription <em>EEF Checkbox Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Checkbox Description</em>'.
	 * @see org.eclipse.eef.EEFCheckboxDescription
	 * @generated
	 */
	EClass getEEFCheckboxDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFCheckboxDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.EEFCheckboxDescription#getValueExpression()
	 * @see #getEEFCheckboxDescription()
	 * @generated
	 */
	EAttribute getEEFCheckboxDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFCheckboxDescription#getEditExpression <em>Edit Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.EEFCheckboxDescription#getEditExpression()
	 * @see #getEEFCheckboxDescription()
	 * @generated
	 */
	EAttribute getEEFCheckboxDescription_EditExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFSelectDescription <em>EEF Select Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Select Description</em>'.
	 * @see org.eclipse.eef.EEFSelectDescription
	 * @generated
	 */
	EClass getEEFSelectDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFSelectDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.EEFSelectDescription#getValueExpression()
	 * @see #getEEFSelectDescription()
	 * @generated
	 */
	EAttribute getEEFSelectDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFSelectDescription#getEditExpression <em>Edit Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.EEFSelectDescription#getEditExpression()
	 * @see #getEEFSelectDescription()
	 * @generated
	 */
	EAttribute getEEFSelectDescription_EditExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFSelectDescription#getCandidatesExpression <em>Candidates Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Candidates Expression</em>'.
	 * @see org.eclipse.eef.EEFSelectDescription#getCandidatesExpression()
	 * @see #getEEFSelectDescription()
	 * @generated
	 */
	EAttribute getEEFSelectDescription_CandidatesExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFSelectDescription#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see org.eclipse.eef.EEFSelectDescription#isMultiple()
	 * @see #getEEFSelectDescription()
	 * @generated
	 */
	EAttribute getEEFSelectDescription_Multiple();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFSelectDescription#getCandidateDisplayExpression <em>Candidate Display Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Candidate Display Expression</em>'.
	 * @see org.eclipse.eef.EEFSelectDescription#getCandidateDisplayExpression()
	 * @see #getEEFSelectDescription()
	 * @generated
	 */
	EAttribute getEEFSelectDescription_CandidateDisplayExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFLabelDescription <em>EEF Label Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Label Description</em>'.
	 * @see org.eclipse.eef.EEFLabelDescription
	 * @generated
	 */
	EClass getEEFLabelDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLabelDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.EEFLabelDescription#getValueExpression()
	 * @see #getEEFLabelDescription()
	 * @generated
	 */
	EAttribute getEEFLabelDescription_ValueExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFRadioDescription <em>EEF Radio Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Radio Description</em>'.
	 * @see org.eclipse.eef.EEFRadioDescription
	 * @generated
	 */
	EClass getEEFRadioDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFRadioDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.EEFRadioDescription#getValueExpression()
	 * @see #getEEFRadioDescription()
	 * @generated
	 */
	EAttribute getEEFRadioDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFRadioDescription#getEditExpression <em>Edit Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.EEFRadioDescription#getEditExpression()
	 * @see #getEEFRadioDescription()
	 * @generated
	 */
	EAttribute getEEFRadioDescription_EditExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFRadioDescription#getCandidatesExpression <em>Candidates Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Candidates Expression</em>'.
	 * @see org.eclipse.eef.EEFRadioDescription#getCandidatesExpression()
	 * @see #getEEFRadioDescription()
	 * @generated
	 */
	EAttribute getEEFRadioDescription_CandidatesExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFRadioDescription#getCandidateDisplayExpression <em>Candidate Display Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Candidate Display Expression</em>'.
	 * @see org.eclipse.eef.EEFRadioDescription#getCandidateDisplayExpression()
	 * @see #getEEFRadioDescription()
	 * @generated
	 */
	EAttribute getEEFRadioDescription_CandidateDisplayExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFTreeDialogSelectDescription <em>EEF Tree Dialog Select Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Tree Dialog Select Description</em>'.
	 * @see org.eclipse.eef.EEFTreeDialogSelectDescription
	 * @generated
	 */
	EClass getEEFTreeDialogSelectDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTreeDialogSelectDescription#getSemanticCandidateExpression <em>Semantic Candidate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Candidate Expression</em>'.
	 * @see org.eclipse.eef.EEFTreeDialogSelectDescription#getSemanticCandidateExpression()
	 * @see #getEEFTreeDialogSelectDescription()
	 * @generated
	 */
	EAttribute getEEFTreeDialogSelectDescription_SemanticCandidateExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTreeDialogSelectDescription#getDefaultFilter <em>Default Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Filter</em>'.
	 * @see org.eclipse.eef.EEFTreeDialogSelectDescription#getDefaultFilter()
	 * @see #getEEFTreeDialogSelectDescription()
	 * @generated
	 */
	EAttribute getEEFTreeDialogSelectDescription_DefaultFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTreeDialogSelectDescription#getDomainClass <em>Domain Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Class</em>'.
	 * @see org.eclipse.eef.EEFTreeDialogSelectDescription#getDomainClass()
	 * @see #getEEFTreeDialogSelectDescription()
	 * @generated
	 */
	EAttribute getEEFTreeDialogSelectDescription_DomainClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eef.EEFTreeDialogSelectDescription#getTree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tree</em>'.
	 * @see org.eclipse.eef.EEFTreeDialogSelectDescription#getTree()
	 * @see #getEEFTreeDialogSelectDescription()
	 * @generated
	 */
	EReference getEEFTreeDialogSelectDescription_Tree();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFLinkDescription <em>EEF Link Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Link Description</em>'.
	 * @see org.eclipse.eef.EEFLinkDescription
	 * @generated
	 */
	EClass getEEFLinkDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLinkDescription#getOnClickExpression <em>On Click Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Click Expression</em>'.
	 * @see org.eclipse.eef.EEFLinkDescription#getOnClickExpression()
	 * @see #getEEFLinkDescription()
	 * @generated
	 */
	EAttribute getEEFLinkDescription_OnClickExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFImageDescription <em>EEF Image Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Image Description</em>'.
	 * @see org.eclipse.eef.EEFImageDescription
	 * @generated
	 */
	EClass getEEFImageDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFImageDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.EEFImageDescription#getValueExpression()
	 * @see #getEEFImageDescription()
	 * @generated
	 */
	EAttribute getEEFImageDescription_ValueExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFTreeDescription <em>EEF Tree Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Tree Description</em>'.
	 * @see org.eclipse.eef.EEFTreeDescription
	 * @generated
	 */
	EClass getEEFTreeDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTreeDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.EEFTreeDescription#getValueExpression()
	 * @see #getEEFTreeDescription()
	 * @generated
	 */
	EAttribute getEEFTreeDescription_ValueExpression();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eef.EEFTreeDescription#getTreeStructure <em>Tree Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tree Structure</em>'.
	 * @see org.eclipse.eef.EEFTreeDescription#getTreeStructure()
	 * @see #getEEFTreeDescription()
	 * @generated
	 */
	EReference getEEFTreeDescription_TreeStructure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTreeDescription#getEditExpression <em>Edit Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.EEFTreeDescription#getEditExpression()
	 * @see #getEEFTreeDescription()
	 * @generated
	 */
	EAttribute getEEFTreeDescription_EditExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFImagePickerDescription <em>EEF Image Picker Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Image Picker Description</em>'.
	 * @see org.eclipse.eef.EEFImagePickerDescription
	 * @generated
	 */
	EClass getEEFImagePickerDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFImagePickerDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.EEFImagePickerDescription#getValueExpression()
	 * @see #getEEFImagePickerDescription()
	 * @generated
	 */
	EAttribute getEEFImagePickerDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFImagePickerDescription#getEditExpression <em>Edit Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.EEFImagePickerDescription#getEditExpression()
	 * @see #getEEFImagePickerDescription()
	 * @generated
	 */
	EAttribute getEEFImagePickerDescription_EditExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFImagePickerDescription#getCandidatesExpression <em>Candidates Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Candidates Expression</em>'.
	 * @see org.eclipse.eef.EEFImagePickerDescription#getCandidatesExpression()
	 * @see #getEEFImagePickerDescription()
	 * @generated
	 */
	EAttribute getEEFImagePickerDescription_CandidatesExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFTableDescription <em>EEF Table Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Table Description</em>'.
	 * @see org.eclipse.eef.EEFTableDescription
	 * @generated
	 */
	EClass getEEFTableDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTableDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.EEFTableDescription#getValueExpression()
	 * @see #getEEFTableDescription()
	 * @generated
	 */
	EAttribute getEEFTableDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTableDescription#getEditExpression <em>Edit Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.EEFTableDescription#getEditExpression()
	 * @see #getEEFTableDescription()
	 * @generated
	 */
	EAttribute getEEFTableDescription_EditExpression();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eef.EEFTableDescription#getTableStructure <em>Table Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Structure</em>'.
	 * @see org.eclipse.eef.EEFTableDescription#getTableStructure()
	 * @see #getEEFTableDescription()
	 * @generated
	 */
	EReference getEEFTableDescription_TableStructure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFColumnDescription <em>EEF Column Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Column Description</em>'.
	 * @see org.eclipse.eef.EEFColumnDescription
	 * @generated
	 */
	EClass getEEFColumnDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFColumnDescription#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.eef.EEFColumnDescription#getWidth()
	 * @see #getEEFColumnDescription()
	 * @generated
	 */
	EAttribute getEEFColumnDescription_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFColumnDescription#getHeaderExpression <em>Header Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Expression</em>'.
	 * @see org.eclipse.eef.EEFColumnDescription#getHeaderExpression()
	 * @see #getEEFColumnDescription()
	 * @generated
	 */
	EAttribute getEEFColumnDescription_HeaderExpression();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eef.EEFColumnDescription#getCellWidget <em>Cell Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cell Widget</em>'.
	 * @see org.eclipse.eef.EEFColumnDescription#getCellWidget()
	 * @see #getEEFColumnDescription()
	 * @generated
	 */
	EReference getEEFColumnDescription_CellWidget();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFLineDescription <em>EEF Line Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Line Description</em>'.
	 * @see org.eclipse.eef.EEFLineDescription
	 * @generated
	 */
	EClass getEEFLineDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLineDescription#getHeaderExpression <em>Header Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Expression</em>'.
	 * @see org.eclipse.eef.EEFLineDescription#getHeaderExpression()
	 * @see #getEEFLineDescription()
	 * @generated
	 */
	EAttribute getEEFLineDescription_HeaderExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLineDescription#getSemanticCandidatesExpression <em>Semantic Candidates Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Candidates Expression</em>'.
	 * @see org.eclipse.eef.EEFLineDescription#getSemanticCandidatesExpression()
	 * @see #getEEFLineDescription()
	 * @generated
	 */
	EAttribute getEEFLineDescription_SemanticCandidatesExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLineDescription#getDomainClass <em>Domain Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Class</em>'.
	 * @see org.eclipse.eef.EEFLineDescription#getDomainClass()
	 * @see #getEEFLineDescription()
	 * @generated
	 */
	EAttribute getEEFLineDescription_DomainClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFLineDescription#getSubLines <em>Sub Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Lines</em>'.
	 * @see org.eclipse.eef.EEFLineDescription#getSubLines()
	 * @see #getEEFLineDescription()
	 * @generated
	 */
	EReference getEEFLineDescription_SubLines();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFTableStructureDescription <em>EEF Table Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Table Structure Description</em>'.
	 * @see org.eclipse.eef.EEFTableStructureDescription
	 * @generated
	 */
	EClass getEEFTableStructureDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTableStructureDescription#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see org.eclipse.eef.EEFTableStructureDescription#isMultiple()
	 * @see #getEEFTableStructureDescription()
	 * @generated
	 */
	EAttribute getEEFTableStructureDescription_Multiple();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTableStructureDescription#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.EEFTableStructureDescription#getIdentifier()
	 * @see #getEEFTableStructureDescription()
	 * @generated
	 */
	EAttribute getEEFTableStructureDescription_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTableStructureDescription#getAddExpression <em>Add Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add Expression</em>'.
	 * @see org.eclipse.eef.EEFTableStructureDescription#getAddExpression()
	 * @see #getEEFTableStructureDescription()
	 * @generated
	 */
	EAttribute getEEFTableStructureDescription_AddExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTableStructureDescription#getRemoveExpression <em>Remove Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Expression</em>'.
	 * @see org.eclipse.eef.EEFTableStructureDescription#getRemoveExpression()
	 * @see #getEEFTableStructureDescription()
	 * @generated
	 */
	EAttribute getEEFTableStructureDescription_RemoveExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTableStructureDescription#getUpExpression <em>Up Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Up Expression</em>'.
	 * @see org.eclipse.eef.EEFTableStructureDescription#getUpExpression()
	 * @see #getEEFTableStructureDescription()
	 * @generated
	 */
	EAttribute getEEFTableStructureDescription_UpExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTableStructureDescription#getDownExpression <em>Down Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Down Expression</em>'.
	 * @see org.eclipse.eef.EEFTableStructureDescription#getDownExpression()
	 * @see #getEEFTableStructureDescription()
	 * @generated
	 */
	EAttribute getEEFTableStructureDescription_DownExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFAdapterFactoryTableStructureDescription <em>EEF Adapter Factory Table Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Adapter Factory Table Structure Description</em>'.
	 * @see org.eclipse.eef.EEFAdapterFactoryTableStructureDescription
	 * @generated
	 */
	EClass getEEFAdapterFactoryTableStructureDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFAdapterFactoryTableStructureDescription#getAdapterFactoryProvider <em>Adapter Factory Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter Factory Provider</em>'.
	 * @see org.eclipse.eef.EEFAdapterFactoryTableStructureDescription#getAdapterFactoryProvider()
	 * @see #getEEFAdapterFactoryTableStructureDescription()
	 * @generated
	 */
	EAttribute getEEFAdapterFactoryTableStructureDescription_AdapterFactoryProvider();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFStyle <em>EEF Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Style</em>'.
	 * @see org.eclipse.eef.EEFStyle
	 * @generated
	 */
	EClass getEEFStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFStyle#getFontExpression <em>Font Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Expression</em>'.
	 * @see org.eclipse.eef.EEFStyle#getFontExpression()
	 * @see #getEEFStyle()
	 * @generated
	 */
	EAttribute getEEFStyle_FontExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFConditionalStyle <em>EEF Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFConditionalStyle
	 * @generated
	 */
	EClass getEEFConditionalStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFConditionalStyle#getConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conditional Expression</em>'.
	 * @see org.eclipse.eef.EEFConditionalStyle#getConditionalExpression()
	 * @see #getEEFConditionalStyle()
	 * @generated
	 */
	EAttribute getEEFConditionalStyle_ConditionalExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFStyleCustomization <em>EEF Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Style Customization</em>'.
	 * @see org.eclipse.eef.EEFStyleCustomization
	 * @generated
	 */
	EClass getEEFStyleCustomization();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFGroupStyle <em>EEF Group Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Group Style</em>'.
	 * @see org.eclipse.eef.EEFGroupStyle
	 * @generated
	 */
	EClass getEEFGroupStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFGroupStyle#getForegroundColorExpression <em>Foreground Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground Color Expression</em>'.
	 * @see org.eclipse.eef.EEFGroupStyle#getForegroundColorExpression()
	 * @see #getEEFGroupStyle()
	 * @generated
	 */
	EAttribute getEEFGroupStyle_ForegroundColorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFGroupConditionalStyle <em>EEF Group Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Group Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFGroupConditionalStyle
	 * @generated
	 */
	EClass getEEFGroupConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFGroupConditionalStyle#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFGroupConditionalStyle#getStyle()
	 * @see #getEEFGroupConditionalStyle()
	 * @generated
	 */
	EReference getEEFGroupConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFGroupStyleCustomization <em>EEF Group Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Group Style Customization</em>'.
	 * @see org.eclipse.eef.EEFGroupStyleCustomization
	 * @generated
	 */
	EClass getEEFGroupStyleCustomization();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFGroupStyleCustomization#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFGroupStyleCustomization#getStyle()
	 * @see #getEEFGroupStyleCustomization()
	 * @generated
	 */
	EReference getEEFGroupStyleCustomization_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFTextStyle <em>EEF Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Text Style</em>'.
	 * @see org.eclipse.eef.EEFTextStyle
	 * @generated
	 */
	EClass getEEFTextStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTextStyle#getBackgroundColorExpression <em>Background Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color Expression</em>'.
	 * @see org.eclipse.eef.EEFTextStyle#getBackgroundColorExpression()
	 * @see #getEEFTextStyle()
	 * @generated
	 */
	EAttribute getEEFTextStyle_BackgroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFTextStyle#getForegroundColorExpression <em>Foreground Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground Color Expression</em>'.
	 * @see org.eclipse.eef.EEFTextStyle#getForegroundColorExpression()
	 * @see #getEEFTextStyle()
	 * @generated
	 */
	EAttribute getEEFTextStyle_ForegroundColorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFTextConditionalStyle <em>EEF Text Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Text Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFTextConditionalStyle
	 * @generated
	 */
	EClass getEEFTextConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFTextConditionalStyle#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFTextConditionalStyle#getStyle()
	 * @see #getEEFTextConditionalStyle()
	 * @generated
	 */
	EReference getEEFTextConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFTextStyleCustomization <em>EEF Text Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Text Style Customization</em>'.
	 * @see org.eclipse.eef.EEFTextStyleCustomization
	 * @generated
	 */
	EClass getEEFTextStyleCustomization();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFTextStyleCustomization#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFTextStyleCustomization#getStyle()
	 * @see #getEEFTextStyleCustomization()
	 * @generated
	 */
	EReference getEEFTextStyleCustomization_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFCheckboxStyle <em>EEF Checkbox Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Checkbox Style</em>'.
	 * @see org.eclipse.eef.EEFCheckboxStyle
	 * @generated
	 */
	EClass getEEFCheckboxStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFCheckboxStyle#getBackgroundColorExpression <em>Background Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color Expression</em>'.
	 * @see org.eclipse.eef.EEFCheckboxStyle#getBackgroundColorExpression()
	 * @see #getEEFCheckboxStyle()
	 * @generated
	 */
	EAttribute getEEFCheckboxStyle_BackgroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFCheckboxStyle#getForegroundColorExpression <em>Foreground Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground Color Expression</em>'.
	 * @see org.eclipse.eef.EEFCheckboxStyle#getForegroundColorExpression()
	 * @see #getEEFCheckboxStyle()
	 * @generated
	 */
	EAttribute getEEFCheckboxStyle_ForegroundColorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFCheckboxConditionalStyle <em>EEF Checkbox Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Checkbox Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFCheckboxConditionalStyle
	 * @generated
	 */
	EClass getEEFCheckboxConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFCheckboxConditionalStyle#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFCheckboxConditionalStyle#getStyle()
	 * @see #getEEFCheckboxConditionalStyle()
	 * @generated
	 */
	EReference getEEFCheckboxConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFCheckboxStyleCustomization <em>EEF Checkbox Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Checkbox Style Customization</em>'.
	 * @see org.eclipse.eef.EEFCheckboxStyleCustomization
	 * @generated
	 */
	EClass getEEFCheckboxStyleCustomization();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFCheckboxStyleCustomization#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFCheckboxStyleCustomization#getStyle()
	 * @see #getEEFCheckboxStyleCustomization()
	 * @generated
	 */
	EReference getEEFCheckboxStyleCustomization_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFLabelStyle <em>EEF Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Label Style</em>'.
	 * @see org.eclipse.eef.EEFLabelStyle
	 * @generated
	 */
	EClass getEEFLabelStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLabelStyle#getBackgroundColorExpression <em>Background Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color Expression</em>'.
	 * @see org.eclipse.eef.EEFLabelStyle#getBackgroundColorExpression()
	 * @see #getEEFLabelStyle()
	 * @generated
	 */
	EAttribute getEEFLabelStyle_BackgroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLabelStyle#getForegroundColorExpression <em>Foreground Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground Color Expression</em>'.
	 * @see org.eclipse.eef.EEFLabelStyle#getForegroundColorExpression()
	 * @see #getEEFLabelStyle()
	 * @generated
	 */
	EAttribute getEEFLabelStyle_ForegroundColorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFLabelConditionalStyle <em>EEF Label Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Label Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFLabelConditionalStyle
	 * @generated
	 */
	EClass getEEFLabelConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFLabelConditionalStyle#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFLabelConditionalStyle#getStyle()
	 * @see #getEEFLabelConditionalStyle()
	 * @generated
	 */
	EReference getEEFLabelConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFLabelStyleCustomization <em>EEF Label Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Label Style Customization</em>'.
	 * @see org.eclipse.eef.EEFLabelStyleCustomization
	 * @generated
	 */
	EClass getEEFLabelStyleCustomization();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFLabelStyleCustomization#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFLabelStyleCustomization#getStyle()
	 * @see #getEEFLabelStyleCustomization()
	 * @generated
	 */
	EReference getEEFLabelStyleCustomization_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFRadioStyle <em>EEF Radio Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Radio Style</em>'.
	 * @see org.eclipse.eef.EEFRadioStyle
	 * @generated
	 */
	EClass getEEFRadioStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFRadioStyle#getBackgroundColorExpression <em>Background Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color Expression</em>'.
	 * @see org.eclipse.eef.EEFRadioStyle#getBackgroundColorExpression()
	 * @see #getEEFRadioStyle()
	 * @generated
	 */
	EAttribute getEEFRadioStyle_BackgroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFRadioStyle#getForegroundColorExpression <em>Foreground Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground Color Expression</em>'.
	 * @see org.eclipse.eef.EEFRadioStyle#getForegroundColorExpression()
	 * @see #getEEFRadioStyle()
	 * @generated
	 */
	EAttribute getEEFRadioStyle_ForegroundColorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFRadioConditionalStyle <em>EEF Radio Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Radio Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFRadioConditionalStyle
	 * @generated
	 */
	EClass getEEFRadioConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFRadioConditionalStyle#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFRadioConditionalStyle#getStyle()
	 * @see #getEEFRadioConditionalStyle()
	 * @generated
	 */
	EReference getEEFRadioConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFRadioStyleCustomization <em>EEF Radio Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Radio Style Customization</em>'.
	 * @see org.eclipse.eef.EEFRadioStyleCustomization
	 * @generated
	 */
	EClass getEEFRadioStyleCustomization();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFRadioStyleCustomization#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFRadioStyleCustomization#getStyle()
	 * @see #getEEFRadioStyleCustomization()
	 * @generated
	 */
	EReference getEEFRadioStyleCustomization_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFLinkStyle <em>EEF Link Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Link Style</em>'.
	 * @see org.eclipse.eef.EEFLinkStyle
	 * @generated
	 */
	EClass getEEFLinkStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLinkStyle#getBackgroundColorExpression <em>Background Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color Expression</em>'.
	 * @see org.eclipse.eef.EEFLinkStyle#getBackgroundColorExpression()
	 * @see #getEEFLinkStyle()
	 * @generated
	 */
	EAttribute getEEFLinkStyle_BackgroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLinkStyle#getForegroundColorExpression <em>Foreground Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground Color Expression</em>'.
	 * @see org.eclipse.eef.EEFLinkStyle#getForegroundColorExpression()
	 * @see #getEEFLinkStyle()
	 * @generated
	 */
	EAttribute getEEFLinkStyle_ForegroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLinkStyle#getBackgroundImageExpression <em>Background Image Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Image Expression</em>'.
	 * @see org.eclipse.eef.EEFLinkStyle#getBackgroundImageExpression()
	 * @see #getEEFLinkStyle()
	 * @generated
	 */
	EAttribute getEEFLinkStyle_BackgroundImageExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFLinkConditionalStyle <em>EEF Link Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Link Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFLinkConditionalStyle
	 * @generated
	 */
	EClass getEEFLinkConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFLinkConditionalStyle#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFLinkConditionalStyle#getStyle()
	 * @see #getEEFLinkConditionalStyle()
	 * @generated
	 */
	EReference getEEFLinkConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFLinkStyleCustomization <em>EEF Link Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Link Style Customization</em>'.
	 * @see org.eclipse.eef.EEFLinkStyleCustomization
	 * @generated
	 */
	EClass getEEFLinkStyleCustomization();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFLinkStyleCustomization#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFLinkStyleCustomization#getStyle()
	 * @see #getEEFLinkStyleCustomization()
	 * @generated
	 */
	EReference getEEFLinkStyleCustomization_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFSelectStyle <em>EEF Select Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Select Style</em>'.
	 * @see org.eclipse.eef.EEFSelectStyle
	 * @generated
	 */
	EClass getEEFSelectStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFSelectStyle#getBackgroundColorExpression <em>Background Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color Expression</em>'.
	 * @see org.eclipse.eef.EEFSelectStyle#getBackgroundColorExpression()
	 * @see #getEEFSelectStyle()
	 * @generated
	 */
	EAttribute getEEFSelectStyle_BackgroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFSelectStyle#getForegroundColorExpression <em>Foreground Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground Color Expression</em>'.
	 * @see org.eclipse.eef.EEFSelectStyle#getForegroundColorExpression()
	 * @see #getEEFSelectStyle()
	 * @generated
	 */
	EAttribute getEEFSelectStyle_ForegroundColorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFSelectConditionalStyle <em>EEF Select Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Select Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFSelectConditionalStyle
	 * @generated
	 */
	EClass getEEFSelectConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFSelectConditionalStyle#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFSelectConditionalStyle#getStyle()
	 * @see #getEEFSelectConditionalStyle()
	 * @generated
	 */
	EReference getEEFSelectConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFSelectStyleCustomization <em>EEF Select Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Select Style Customization</em>'.
	 * @see org.eclipse.eef.EEFSelectStyleCustomization
	 * @generated
	 */
	EClass getEEFSelectStyleCustomization();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFSelectStyleCustomization#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFSelectStyleCustomization#getStyle()
	 * @see #getEEFSelectStyleCustomization()
	 * @generated
	 */
	EReference getEEFSelectStyleCustomization_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFTreeStyle <em>EEF Tree Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Tree Style</em>'.
	 * @see org.eclipse.eef.EEFTreeStyle
	 * @generated
	 */
	EClass getEEFTreeStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFTreeConditionalStyle <em>EEF Tree Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Tree Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFTreeConditionalStyle
	 * @generated
	 */
	EClass getEEFTreeConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFTreeConditionalStyle#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFTreeConditionalStyle#getStyle()
	 * @see #getEEFTreeConditionalStyle()
	 * @generated
	 */
	EReference getEEFTreeConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFTreeStyleCustomization <em>EEF Tree Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Tree Style Customization</em>'.
	 * @see org.eclipse.eef.EEFTreeStyleCustomization
	 * @generated
	 */
	EClass getEEFTreeStyleCustomization();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFTreeStyleCustomization#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFTreeStyleCustomization#getStyle()
	 * @see #getEEFTreeStyleCustomization()
	 * @generated
	 */
	EReference getEEFTreeStyleCustomization_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFTableStyle <em>EEF Table Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Table Style</em>'.
	 * @see org.eclipse.eef.EEFTableStyle
	 * @generated
	 */
	EClass getEEFTableStyle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFTableConditionalStyle <em>EEF Table Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Table Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFTableConditionalStyle
	 * @generated
	 */
	EClass getEEFTableConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFTableConditionalStyle#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFTableConditionalStyle#getStyle()
	 * @see #getEEFTableConditionalStyle()
	 * @generated
	 */
	EReference getEEFTableConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFTableStyleCustomization <em>EEF Table Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Table Style Customization</em>'.
	 * @see org.eclipse.eef.EEFTableStyleCustomization
	 * @generated
	 */
	EClass getEEFTableStyleCustomization();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFTableStyleCustomization#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFTableStyleCustomization#getStyle()
	 * @see #getEEFTableStyleCustomization()
	 * @generated
	 */
	EReference getEEFTableStyleCustomization_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFLineStyle <em>EEF Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Line Style</em>'.
	 * @see org.eclipse.eef.EEFLineStyle
	 * @generated
	 */
	EClass getEEFLineStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLineStyle#getBackgroundColorExpression <em>Background Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color Expression</em>'.
	 * @see org.eclipse.eef.EEFLineStyle#getBackgroundColorExpression()
	 * @see #getEEFLineStyle()
	 * @generated
	 */
	EAttribute getEEFLineStyle_BackgroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLineStyle#getForegroundColorExpression <em>Foreground Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground Color Expression</em>'.
	 * @see org.eclipse.eef.EEFLineStyle#getForegroundColorExpression()
	 * @see #getEEFLineStyle()
	 * @generated
	 */
	EAttribute getEEFLineStyle_ForegroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLineStyle#getHeaderBackgroundColorExpression <em>Header Background Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Background Color Expression</em>'.
	 * @see org.eclipse.eef.EEFLineStyle#getHeaderBackgroundColorExpression()
	 * @see #getEEFLineStyle()
	 * @generated
	 */
	EAttribute getEEFLineStyle_HeaderBackgroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFLineStyle#getHeaderForegroundColorExpression <em>Header Foreground Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Foreground Color Expression</em>'.
	 * @see org.eclipse.eef.EEFLineStyle#getHeaderForegroundColorExpression()
	 * @see #getEEFLineStyle()
	 * @generated
	 */
	EAttribute getEEFLineStyle_HeaderForegroundColorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFLineConditionalStyle <em>EEF Line Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Line Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFLineConditionalStyle
	 * @generated
	 */
	EClass getEEFLineConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFLineConditionalStyle#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFLineConditionalStyle#getStyle()
	 * @see #getEEFLineConditionalStyle()
	 * @generated
	 */
	EReference getEEFLineConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFLineStyleCustomization <em>EEF Line Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Line Style Customization</em>'.
	 * @see org.eclipse.eef.EEFLineStyleCustomization
	 * @generated
	 */
	EClass getEEFLineStyleCustomization();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFLineStyleCustomization#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFLineStyleCustomization#getStyle()
	 * @see #getEEFLineStyleCustomization()
	 * @generated
	 */
	EReference getEEFLineStyleCustomization_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFColumnStyle <em>EEF Column Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Column Style</em>'.
	 * @see org.eclipse.eef.EEFColumnStyle
	 * @generated
	 */
	EClass getEEFColumnStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFColumnStyle#getBackgroundColorExpression <em>Background Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color Expression</em>'.
	 * @see org.eclipse.eef.EEFColumnStyle#getBackgroundColorExpression()
	 * @see #getEEFColumnStyle()
	 * @generated
	 */
	EAttribute getEEFColumnStyle_BackgroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFColumnStyle#getForegroundColorExpression <em>Foreground Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground Color Expression</em>'.
	 * @see org.eclipse.eef.EEFColumnStyle#getForegroundColorExpression()
	 * @see #getEEFColumnStyle()
	 * @generated
	 */
	EAttribute getEEFColumnStyle_ForegroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFColumnStyle#getHeaderBackgroundColorExpression <em>Header Background Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Background Color Expression</em>'.
	 * @see org.eclipse.eef.EEFColumnStyle#getHeaderBackgroundColorExpression()
	 * @see #getEEFColumnStyle()
	 * @generated
	 */
	EAttribute getEEFColumnStyle_HeaderBackgroundColorExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFColumnStyle#getHeaderForegroundColorExpression <em>Header Foreground Color Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Foreground Color Expression</em>'.
	 * @see org.eclipse.eef.EEFColumnStyle#getHeaderForegroundColorExpression()
	 * @see #getEEFColumnStyle()
	 * @generated
	 */
	EAttribute getEEFColumnStyle_HeaderForegroundColorExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFColumnConditionalStyle <em>EEF Column Conditional Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Column Conditional Style</em>'.
	 * @see org.eclipse.eef.EEFColumnConditionalStyle
	 * @generated
	 */
	EClass getEEFColumnConditionalStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFColumnConditionalStyle#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFColumnConditionalStyle#getStyle()
	 * @see #getEEFColumnConditionalStyle()
	 * @generated
	 */
	EReference getEEFColumnConditionalStyle_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFColumnStyleCustomization <em>EEF Column Style Customization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Column Style Customization</em>'.
	 * @see org.eclipse.eef.EEFColumnStyleCustomization
	 * @generated
	 */
	EClass getEEFColumnStyleCustomization();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.EEFColumnStyleCustomization#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see org.eclipse.eef.EEFColumnStyleCustomization#getStyle()
	 * @see #getEEFColumnStyleCustomization()
	 * @generated
	 */
	EReference getEEFColumnStyleCustomization_Style();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFQuickFix <em>EEF Quick Fix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Quick Fix</em>'.
	 * @see org.eclipse.eef.EEFQuickFix
	 * @generated
	 */
	EClass getEEFQuickFix();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFQuickFix#getTitleExpression <em>Title Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Expression</em>'.
	 * @see org.eclipse.eef.EEFQuickFix#getTitleExpression()
	 * @see #getEEFQuickFix()
	 * @generated
	 */
	EAttribute getEEFQuickFix_TitleExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFQuickFix#getMessageExpression <em>Message Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Expression</em>'.
	 * @see org.eclipse.eef.EEFQuickFix#getMessageExpression()
	 * @see #getEEFQuickFix()
	 * @generated
	 */
	EAttribute getEEFQuickFix_MessageExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFQuickFix#getCanHandleStatusExpression <em>Can Handle Status Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Handle Status Expression</em>'.
	 * @see org.eclipse.eef.EEFQuickFix#getCanHandleStatusExpression()
	 * @see #getEEFQuickFix()
	 * @generated
	 */
	EAttribute getEEFQuickFix_CanHandleStatusExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFQuickFix#getFixExpression <em>Fix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fix Expression</em>'.
	 * @see org.eclipse.eef.EEFQuickFix#getFixExpression()
	 * @see #getEEFQuickFix()
	 * @generated
	 */
	EAttribute getEEFQuickFix_FixExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.EEFValidation <em>EEF Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Validation</em>'.
	 * @see org.eclipse.eef.EEFValidation
	 * @generated
	 */
	EClass getEEFValidation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.EEFValidation#getValidationExpression <em>Validation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Expression</em>'.
	 * @see org.eclipse.eef.EEFValidation#getValidationExpression()
	 * @see #getEEFValidation()
	 * @generated
	 */
	EAttribute getEEFValidation_ValidationExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.EEFValidation#getQuickfixes <em>Quickfixes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quickfixes</em>'.
	 * @see org.eclipse.eef.EEFValidation#getQuickfixes()
	 * @see #getEEFValidation()
	 * @generated
	 */
	EReference getEEFValidation_Quickfixes();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getTypeName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EefFactory getEefFactory();

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
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFViewDescriptionImpl <em>EEF View Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFViewDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFViewDescription()
		 * @generated
		 */
		EClass EEF_VIEW_DESCRIPTION = eINSTANCE.getEEFViewDescription();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_VIEW_DESCRIPTION__IDENTIFIER = eINSTANCE.getEEFViewDescription_Identifier();

		/**
		 * The meta object literal for the '<em><b>Precondition Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_VIEW_DESCRIPTION__PRECONDITION_EXPRESSION = eINSTANCE.getEEFViewDescription_PreconditionExpression();

		/**
		 * The meta object literal for the '<em><b>User Defined Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_VIEW_DESCRIPTION__USER_DEFINED_VARIABLES = eINSTANCE.getEEFViewDescription_UserDefinedVariables();

		/**
		 * The meta object literal for the '<em><b>Label Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION = eINSTANCE.getEEFViewDescription_LabelExpression();

		/**
		 * The meta object literal for the '<em><b>EPackage Ns Uris</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_VIEW_DESCRIPTION__EPACKAGE_NS_URIS = eINSTANCE.getEEFViewDescription_EPackageNsUris();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_VIEW_DESCRIPTION__GROUPS = eINSTANCE.getEEFViewDescription_Groups();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_VIEW_DESCRIPTION__PAGES = eINSTANCE.getEEFViewDescription_Pages();

		/**
		 * The meta object literal for the '<em><b>Java Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_VIEW_DESCRIPTION__JAVA_EXTENSIONS = eINSTANCE.getEEFViewDescription_JavaExtensions();

		/**
		 * The meta object literal for the '<em><b>Imported Views</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_VIEW_DESCRIPTION__IMPORTED_VIEWS = eINSTANCE.getEEFViewDescription_ImportedViews();

		/**
		 * The meta object literal for the '<em><b>Tree Structures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_VIEW_DESCRIPTION__TREE_STRUCTURES = eINSTANCE.getEEFViewDescription_TreeStructures();

		/**
		 * The meta object literal for the '<em><b>Table Structures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_VIEW_DESCRIPTION__TABLE_STRUCTURES = eINSTANCE.getEEFViewDescription_TableStructures();

		/**
		 * The meta object literal for the '<em><b>Style Customizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_VIEW_DESCRIPTION__STYLE_CUSTOMIZATIONS = eINSTANCE.getEEFViewDescription_StyleCustomizations();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFPageDescriptionImpl <em>EEF Page Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFPageDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFPageDescription()
		 * @generated
		 */
		EClass EEF_PAGE_DESCRIPTION = eINSTANCE.getEEFPageDescription();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_PAGE_DESCRIPTION__IDENTIFIER = eINSTANCE.getEEFPageDescription_Identifier();

		/**
		 * The meta object literal for the '<em><b>Precondition Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_PAGE_DESCRIPTION__PRECONDITION_EXPRESSION = eINSTANCE.getEEFPageDescription_PreconditionExpression();

		/**
		 * The meta object literal for the '<em><b>User Defined Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_PAGE_DESCRIPTION__USER_DEFINED_VARIABLES = eINSTANCE.getEEFPageDescription_UserDefinedVariables();

		/**
		 * The meta object literal for the '<em><b>Label Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_PAGE_DESCRIPTION__LABEL_EXPRESSION = eINSTANCE.getEEFPageDescription_LabelExpression();

		/**
		 * The meta object literal for the '<em><b>Domain Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_PAGE_DESCRIPTION__DOMAIN_CLASS = eINSTANCE.getEEFPageDescription_DomainClass();

		/**
		 * The meta object literal for the '<em><b>Semantic Candidate Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION = eINSTANCE.getEEFPageDescription_SemanticCandidateExpression();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_PAGE_DESCRIPTION__GROUPS = eINSTANCE.getEEFPageDescription_Groups();

		/**
		 * The meta object literal for the '<em><b>Extended Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_PAGE_DESCRIPTION__EXTENDED_PAGE = eINSTANCE.getEEFPageDescription_ExtendedPage();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFGroupDescriptionImpl <em>EEF Group Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFGroupDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFGroupDescription()
		 * @generated
		 */
		EClass EEF_GROUP_DESCRIPTION = eINSTANCE.getEEFGroupDescription();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_GROUP_DESCRIPTION__IDENTIFIER = eINSTANCE.getEEFGroupDescription_Identifier();

		/**
		 * The meta object literal for the '<em><b>Precondition Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_GROUP_DESCRIPTION__PRECONDITION_EXPRESSION = eINSTANCE.getEEFGroupDescription_PreconditionExpression();

		/**
		 * The meta object literal for the '<em><b>User Defined Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_GROUP_DESCRIPTION__USER_DEFINED_VARIABLES = eINSTANCE.getEEFGroupDescription_UserDefinedVariables();

		/**
		 * The meta object literal for the '<em><b>Label Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_GROUP_DESCRIPTION__LABEL_EXPRESSION = eINSTANCE.getEEFGroupDescription_LabelExpression();

		/**
		 * The meta object literal for the '<em><b>Domain Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_GROUP_DESCRIPTION__DOMAIN_CLASS = eINSTANCE.getEEFGroupDescription_DomainClass();

		/**
		 * The meta object literal for the '<em><b>Semantic Candidate Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_GROUP_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION = eINSTANCE.getEEFGroupDescription_SemanticCandidateExpression();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_GROUP_DESCRIPTION__CONTAINER = eINSTANCE.getEEFGroupDescription_Container();

		/**
		 * The meta object literal for the '<em><b>Collapsible Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_GROUP_DESCRIPTION__COLLAPSIBLE_EXPRESSION = eINSTANCE.getEEFGroupDescription_CollapsibleExpression();

		/**
		 * The meta object literal for the '<em><b>Collapsed By Default Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_GROUP_DESCRIPTION__COLLAPSED_BY_DEFAULT_EXPRESSION = eINSTANCE.getEEFGroupDescription_CollapsedByDefaultExpression();

		/**
		 * The meta object literal for the '<em><b>Validation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_GROUP_DESCRIPTION__VALIDATION = eINSTANCE.getEEFGroupDescription_Validation();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFContainerDescriptionImpl <em>EEF Container Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFContainerDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFContainerDescription()
		 * @generated
		 */
		EClass EEF_CONTAINER_DESCRIPTION = eINSTANCE.getEEFContainerDescription();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_CONTAINER_DESCRIPTION__IDENTIFIER = eINSTANCE.getEEFContainerDescription_Identifier();

		/**
		 * The meta object literal for the '<em><b>Precondition Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_CONTAINER_DESCRIPTION__PRECONDITION_EXPRESSION = eINSTANCE.getEEFContainerDescription_PreconditionExpression();

		/**
		 * The meta object literal for the '<em><b>User Defined Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_CONTAINER_DESCRIPTION__USER_DEFINED_VARIABLES = eINSTANCE.getEEFContainerDescription_UserDefinedVariables();

		/**
		 * The meta object literal for the '<em><b>Semantic Candidate Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_CONTAINER_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION = eINSTANCE.getEEFContainerDescription_SemanticCandidateExpression();

		/**
		 * The meta object literal for the '<em><b>Domain Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_CONTAINER_DESCRIPTION__DOMAIN_CLASS = eINSTANCE.getEEFContainerDescription_DomainClass();

		/**
		 * The meta object literal for the '<em><b>Layout Column Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_CONTAINER_DESCRIPTION__LAYOUT_COLUMN_COUNT = eINSTANCE.getEEFContainerDescription_LayoutColumnCount();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_CONTAINER_DESCRIPTION__CONTAINERS = eINSTANCE.getEEFContainerDescription_Containers();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_CONTAINER_DESCRIPTION__WIDGETS = eINSTANCE.getEEFContainerDescription_Widgets();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFWidgetDescriptionImpl <em>EEF Widget Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFWidgetDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFWidgetDescription()
		 * @generated
		 */
		EClass EEF_WIDGET_DESCRIPTION = eINSTANCE.getEEFWidgetDescription();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_WIDGET_DESCRIPTION__IDENTIFIER = eINSTANCE.getEEFWidgetDescription_Identifier();

		/**
		 * The meta object literal for the '<em><b>Precondition Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_WIDGET_DESCRIPTION__PRECONDITION_EXPRESSION = eINSTANCE.getEEFWidgetDescription_PreconditionExpression();

		/**
		 * The meta object literal for the '<em><b>User Defined Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_WIDGET_DESCRIPTION__USER_DEFINED_VARIABLES = eINSTANCE.getEEFWidgetDescription_UserDefinedVariables();

		/**
		 * The meta object literal for the '<em><b>Label Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION = eINSTANCE.getEEFWidgetDescription_LabelExpression();

		/**
		 * The meta object literal for the '<em><b>Label Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_WIDGET_DESCRIPTION__LABEL_STYLE = eINSTANCE.getEEFWidgetDescription_LabelStyle();

		/**
		 * The meta object literal for the '<em><b>Tooltip Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_WIDGET_DESCRIPTION__TOOLTIP_EXPRESSION = eINSTANCE.getEEFWidgetDescription_TooltipExpression();

		/**
		 * The meta object literal for the '<em><b>Help Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_WIDGET_DESCRIPTION__HELP_EXPRESSION = eINSTANCE.getEEFWidgetDescription_HelpExpression();

		/**
		 * The meta object literal for the '<em><b>Validation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_WIDGET_DESCRIPTION__VALIDATION = eINSTANCE.getEEFWidgetDescription_Validation();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFJavaExtensionDescriptionImpl <em>EEF Java Extension Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFJavaExtensionDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFJavaExtensionDescription()
		 * @generated
		 */
		EClass EEF_JAVA_EXTENSION_DESCRIPTION = eINSTANCE.getEEFJavaExtensionDescription();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_JAVA_EXTENSION_DESCRIPTION__QUALIFIED_NAME = eINSTANCE.getEEFJavaExtensionDescription_QualifiedName();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFTreeStructureDescriptionImpl <em>EEF Tree Structure Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFTreeStructureDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTreeStructureDescription()
		 * @generated
		 */
		EClass EEF_TREE_STRUCTURE_DESCRIPTION = eINSTANCE.getEEFTreeStructureDescription();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TREE_STRUCTURE_DESCRIPTION__IDENTIFIER = eINSTANCE.getEEFTreeStructureDescription_Identifier();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TREE_STRUCTURE_DESCRIPTION__MULTIPLE = eINSTANCE.getEEFTreeStructureDescription_Multiple();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFInterpretedTableStructureDescriptionImpl <em>EEF Interpreted Table Structure Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFInterpretedTableStructureDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFInterpretedTableStructureDescription()
		 * @generated
		 */
		EClass EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION = eINSTANCE.getEEFInterpretedTableStructureDescription();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__COLUMNS = eINSTANCE.getEEFInterpretedTableStructureDescription_Columns();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__LINE = eINSTANCE.getEEFInterpretedTableStructureDescription_Line();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFCellWidgetDescriptionImpl <em>EEF Cell Widget Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFCellWidgetDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCellWidgetDescription()
		 * @generated
		 */
		EClass EEF_CELL_WIDGET_DESCRIPTION = eINSTANCE.getEEFCellWidgetDescription();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFAdapterFactoryTreeStructureDescriptionImpl <em>EEF Adapter Factory Tree Structure Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFAdapterFactoryTreeStructureDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFAdapterFactoryTreeStructureDescription()
		 * @generated
		 */
		EClass EEF_ADAPTER_FACTORY_TREE_STRUCTURE_DESCRIPTION = eINSTANCE.getEEFAdapterFactoryTreeStructureDescription();

		/**
		 * The meta object literal for the '<em><b>Adapter Factory Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_ADAPTER_FACTORY_TREE_STRUCTURE_DESCRIPTION__ADAPTER_FACTORY_PROVIDER = eINSTANCE
				.getEEFAdapterFactoryTreeStructureDescription_AdapterFactoryProvider();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFInterpretedTreeStructureDescriptionImpl <em>EEF Interpreted Tree Structure Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFInterpretedTreeStructureDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFInterpretedTreeStructureDescription()
		 * @generated
		 */
		EClass EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION = eINSTANCE.getEEFInterpretedTreeStructureDescription();

		/**
		 * The meta object literal for the '<em><b>Roots Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__ROOTS_EXPRESSION = eINSTANCE
				.getEEFInterpretedTreeStructureDescription_RootsExpression();

		/**
		 * The meta object literal for the '<em><b>Children Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CHILDREN_EXPRESSION = eINSTANCE
				.getEEFInterpretedTreeStructureDescription_ChildrenExpression();

		/**
		 * The meta object literal for the '<em><b>Selectable Predicate Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__SELECTABLE_PREDICATE_EXPRESSION = eINSTANCE
				.getEEFInterpretedTreeStructureDescription_SelectablePredicateExpression();

		/**
		 * The meta object literal for the '<em><b>Candidate Display Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION = eINSTANCE
				.getEEFInterpretedTreeStructureDescription_CandidateDisplayExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFTextDescriptionImpl <em>EEF Text Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFTextDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTextDescription()
		 * @generated
		 */
		EClass EEF_TEXT_DESCRIPTION = eINSTANCE.getEEFTextDescription();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TEXT_DESCRIPTION__VALUE_EXPRESSION = eINSTANCE.getEEFTextDescription_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Edit Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION = eINSTANCE.getEEFTextDescription_EditExpression();

		/**
		 * The meta object literal for the '<em><b>Read Only Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TEXT_DESCRIPTION__READ_ONLY_EXPRESSION = eINSTANCE.getEEFTextDescription_ReadOnlyExpression();

		/**
		 * The meta object literal for the '<em><b>Content Assist Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TEXT_DESCRIPTION__CONTENT_ASSIST_EXPRESSION = eINSTANCE.getEEFTextDescription_ContentAssistExpression();

		/**
		 * The meta object literal for the '<em><b>Placeholder Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TEXT_DESCRIPTION__PLACEHOLDER_EXPRESSION = eINSTANCE.getEEFTextDescription_PlaceholderExpression();

		/**
		 * The meta object literal for the '<em><b>Line Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TEXT_DESCRIPTION__LINE_COUNT = eINSTANCE.getEEFTextDescription_LineCount();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_TEXT_DESCRIPTION__STYLE = eINSTANCE.getEEFTextDescription_Style();

		/**
		 * The meta object literal for the '<em><b>Conditional Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_TEXT_DESCRIPTION__CONDITIONAL_STYLES = eINSTANCE.getEEFTextDescription_ConditionalStyles();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFCheckboxDescriptionImpl <em>EEF Checkbox Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFCheckboxDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCheckboxDescription()
		 * @generated
		 */
		EClass EEF_CHECKBOX_DESCRIPTION = eINSTANCE.getEEFCheckboxDescription();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_CHECKBOX_DESCRIPTION__VALUE_EXPRESSION = eINSTANCE.getEEFCheckboxDescription_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Edit Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_CHECKBOX_DESCRIPTION__EDIT_EXPRESSION = eINSTANCE.getEEFCheckboxDescription_EditExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFSelectDescriptionImpl <em>EEF Select Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFSelectDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFSelectDescription()
		 * @generated
		 */
		EClass EEF_SELECT_DESCRIPTION = eINSTANCE.getEEFSelectDescription();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_SELECT_DESCRIPTION__VALUE_EXPRESSION = eINSTANCE.getEEFSelectDescription_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Edit Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_SELECT_DESCRIPTION__EDIT_EXPRESSION = eINSTANCE.getEEFSelectDescription_EditExpression();

		/**
		 * The meta object literal for the '<em><b>Candidates Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_SELECT_DESCRIPTION__CANDIDATES_EXPRESSION = eINSTANCE.getEEFSelectDescription_CandidatesExpression();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_SELECT_DESCRIPTION__MULTIPLE = eINSTANCE.getEEFSelectDescription_Multiple();

		/**
		 * The meta object literal for the '<em><b>Candidate Display Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_SELECT_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION = eINSTANCE.getEEFSelectDescription_CandidateDisplayExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFLabelDescriptionImpl <em>EEF Label Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFLabelDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLabelDescription()
		 * @generated
		 */
		EClass EEF_LABEL_DESCRIPTION = eINSTANCE.getEEFLabelDescription();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_LABEL_DESCRIPTION__VALUE_EXPRESSION = eINSTANCE.getEEFLabelDescription_ValueExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFRadioDescriptionImpl <em>EEF Radio Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFRadioDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFRadioDescription()
		 * @generated
		 */
		EClass EEF_RADIO_DESCRIPTION = eINSTANCE.getEEFRadioDescription();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_RADIO_DESCRIPTION__VALUE_EXPRESSION = eINSTANCE.getEEFRadioDescription_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Edit Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_RADIO_DESCRIPTION__EDIT_EXPRESSION = eINSTANCE.getEEFRadioDescription_EditExpression();

		/**
		 * The meta object literal for the '<em><b>Candidates Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_RADIO_DESCRIPTION__CANDIDATES_EXPRESSION = eINSTANCE.getEEFRadioDescription_CandidatesExpression();

		/**
		 * The meta object literal for the '<em><b>Candidate Display Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_RADIO_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION = eINSTANCE.getEEFRadioDescription_CandidateDisplayExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFTreeDialogSelectDescriptionImpl <em>EEF Tree Dialog Select Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFTreeDialogSelectDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTreeDialogSelectDescription()
		 * @generated
		 */
		EClass EEF_TREE_DIALOG_SELECT_DESCRIPTION = eINSTANCE.getEEFTreeDialogSelectDescription();

		/**
		 * The meta object literal for the '<em><b>Semantic Candidate Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TREE_DIALOG_SELECT_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION = eINSTANCE
				.getEEFTreeDialogSelectDescription_SemanticCandidateExpression();

		/**
		 * The meta object literal for the '<em><b>Default Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TREE_DIALOG_SELECT_DESCRIPTION__DEFAULT_FILTER = eINSTANCE.getEEFTreeDialogSelectDescription_DefaultFilter();

		/**
		 * The meta object literal for the '<em><b>Domain Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TREE_DIALOG_SELECT_DESCRIPTION__DOMAIN_CLASS = eINSTANCE.getEEFTreeDialogSelectDescription_DomainClass();

		/**
		 * The meta object literal for the '<em><b>Tree</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_TREE_DIALOG_SELECT_DESCRIPTION__TREE = eINSTANCE.getEEFTreeDialogSelectDescription_Tree();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFLinkDescriptionImpl <em>EEF Link Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFLinkDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLinkDescription()
		 * @generated
		 */
		EClass EEF_LINK_DESCRIPTION = eINSTANCE.getEEFLinkDescription();

		/**
		 * The meta object literal for the '<em><b>On Click Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_LINK_DESCRIPTION__ON_CLICK_EXPRESSION = eINSTANCE.getEEFLinkDescription_OnClickExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFImageDescriptionImpl <em>EEF Image Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFImageDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFImageDescription()
		 * @generated
		 */
		EClass EEF_IMAGE_DESCRIPTION = eINSTANCE.getEEFImageDescription();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_IMAGE_DESCRIPTION__VALUE_EXPRESSION = eINSTANCE.getEEFImageDescription_ValueExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFTreeDescriptionImpl <em>EEF Tree Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFTreeDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTreeDescription()
		 * @generated
		 */
		EClass EEF_TREE_DESCRIPTION = eINSTANCE.getEEFTreeDescription();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TREE_DESCRIPTION__VALUE_EXPRESSION = eINSTANCE.getEEFTreeDescription_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Tree Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_TREE_DESCRIPTION__TREE_STRUCTURE = eINSTANCE.getEEFTreeDescription_TreeStructure();

		/**
		 * The meta object literal for the '<em><b>Edit Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TREE_DESCRIPTION__EDIT_EXPRESSION = eINSTANCE.getEEFTreeDescription_EditExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFImagePickerDescriptionImpl <em>EEF Image Picker Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFImagePickerDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFImagePickerDescription()
		 * @generated
		 */
		EClass EEF_IMAGE_PICKER_DESCRIPTION = eINSTANCE.getEEFImagePickerDescription();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_IMAGE_PICKER_DESCRIPTION__VALUE_EXPRESSION = eINSTANCE.getEEFImagePickerDescription_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Edit Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_IMAGE_PICKER_DESCRIPTION__EDIT_EXPRESSION = eINSTANCE.getEEFImagePickerDescription_EditExpression();

		/**
		 * The meta object literal for the '<em><b>Candidates Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_IMAGE_PICKER_DESCRIPTION__CANDIDATES_EXPRESSION = eINSTANCE.getEEFImagePickerDescription_CandidatesExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFTableDescriptionImpl <em>EEF Table Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFTableDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTableDescription()
		 * @generated
		 */
		EClass EEF_TABLE_DESCRIPTION = eINSTANCE.getEEFTableDescription();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TABLE_DESCRIPTION__VALUE_EXPRESSION = eINSTANCE.getEEFTableDescription_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Edit Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TABLE_DESCRIPTION__EDIT_EXPRESSION = eINSTANCE.getEEFTableDescription_EditExpression();

		/**
		 * The meta object literal for the '<em><b>Table Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_TABLE_DESCRIPTION__TABLE_STRUCTURE = eINSTANCE.getEEFTableDescription_TableStructure();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFColumnDescriptionImpl <em>EEF Column Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFColumnDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFColumnDescription()
		 * @generated
		 */
		EClass EEF_COLUMN_DESCRIPTION = eINSTANCE.getEEFColumnDescription();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_COLUMN_DESCRIPTION__WIDTH = eINSTANCE.getEEFColumnDescription_Width();

		/**
		 * The meta object literal for the '<em><b>Header Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_COLUMN_DESCRIPTION__HEADER_EXPRESSION = eINSTANCE.getEEFColumnDescription_HeaderExpression();

		/**
		 * The meta object literal for the '<em><b>Cell Widget</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_COLUMN_DESCRIPTION__CELL_WIDGET = eINSTANCE.getEEFColumnDescription_CellWidget();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFLineDescriptionImpl <em>EEF Line Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFLineDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLineDescription()
		 * @generated
		 */
		EClass EEF_LINE_DESCRIPTION = eINSTANCE.getEEFLineDescription();

		/**
		 * The meta object literal for the '<em><b>Header Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_LINE_DESCRIPTION__HEADER_EXPRESSION = eINSTANCE.getEEFLineDescription_HeaderExpression();

		/**
		 * The meta object literal for the '<em><b>Semantic Candidates Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_LINE_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION = eINSTANCE.getEEFLineDescription_SemanticCandidatesExpression();

		/**
		 * The meta object literal for the '<em><b>Domain Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_LINE_DESCRIPTION__DOMAIN_CLASS = eINSTANCE.getEEFLineDescription_DomainClass();

		/**
		 * The meta object literal for the '<em><b>Sub Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_LINE_DESCRIPTION__SUB_LINES = eINSTANCE.getEEFLineDescription_SubLines();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFTableStructureDescriptionImpl <em>EEF Table Structure Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFTableStructureDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTableStructureDescription()
		 * @generated
		 */
		EClass EEF_TABLE_STRUCTURE_DESCRIPTION = eINSTANCE.getEEFTableStructureDescription();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TABLE_STRUCTURE_DESCRIPTION__MULTIPLE = eINSTANCE.getEEFTableStructureDescription_Multiple();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TABLE_STRUCTURE_DESCRIPTION__IDENTIFIER = eINSTANCE.getEEFTableStructureDescription_Identifier();

		/**
		 * The meta object literal for the '<em><b>Add Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TABLE_STRUCTURE_DESCRIPTION__ADD_EXPRESSION = eINSTANCE.getEEFTableStructureDescription_AddExpression();

		/**
		 * The meta object literal for the '<em><b>Remove Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TABLE_STRUCTURE_DESCRIPTION__REMOVE_EXPRESSION = eINSTANCE.getEEFTableStructureDescription_RemoveExpression();

		/**
		 * The meta object literal for the '<em><b>Up Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TABLE_STRUCTURE_DESCRIPTION__UP_EXPRESSION = eINSTANCE.getEEFTableStructureDescription_UpExpression();

		/**
		 * The meta object literal for the '<em><b>Down Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TABLE_STRUCTURE_DESCRIPTION__DOWN_EXPRESSION = eINSTANCE.getEEFTableStructureDescription_DownExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFAdapterFactoryTableStructureDescriptionImpl <em>EEF Adapter Factory Table Structure Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFAdapterFactoryTableStructureDescriptionImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFAdapterFactoryTableStructureDescription()
		 * @generated
		 */
		EClass EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION = eINSTANCE.getEEFAdapterFactoryTableStructureDescription();

		/**
		 * The meta object literal for the '<em><b>Adapter Factory Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION__ADAPTER_FACTORY_PROVIDER = eINSTANCE
				.getEEFAdapterFactoryTableStructureDescription_AdapterFactoryProvider();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFStyleImpl <em>EEF Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFStyle()
		 * @generated
		 */
		EClass EEF_STYLE = eINSTANCE.getEEFStyle();

		/**
		 * The meta object literal for the '<em><b>Font Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_STYLE__FONT_EXPRESSION = eINSTANCE.getEEFStyle_FontExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFConditionalStyleImpl <em>EEF Conditional Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFConditionalStyle()
		 * @generated
		 */
		EClass EEF_CONDITIONAL_STYLE = eINSTANCE.getEEFConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Conditional Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_CONDITIONAL_STYLE__CONDITIONAL_EXPRESSION = eINSTANCE.getEEFConditionalStyle_ConditionalExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFStyleCustomizationImpl <em>EEF Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFStyleCustomizationImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFStyleCustomization()
		 * @generated
		 */
		EClass EEF_STYLE_CUSTOMIZATION = eINSTANCE.getEEFStyleCustomization();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFGroupStyleImpl <em>EEF Group Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFGroupStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFGroupStyle()
		 * @generated
		 */
		EClass EEF_GROUP_STYLE = eINSTANCE.getEEFGroupStyle();

		/**
		 * The meta object literal for the '<em><b>Foreground Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_GROUP_STYLE__FOREGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFGroupStyle_ForegroundColorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFGroupConditionalStyleImpl <em>EEF Group Conditional Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFGroupConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFGroupConditionalStyle()
		 * @generated
		 */
		EClass EEF_GROUP_CONDITIONAL_STYLE = eINSTANCE.getEEFGroupConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_GROUP_CONDITIONAL_STYLE__STYLE = eINSTANCE.getEEFGroupConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFGroupStyleCustomizationImpl <em>EEF Group Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFGroupStyleCustomizationImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFGroupStyleCustomization()
		 * @generated
		 */
		EClass EEF_GROUP_STYLE_CUSTOMIZATION = eINSTANCE.getEEFGroupStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_GROUP_STYLE_CUSTOMIZATION__STYLE = eINSTANCE.getEEFGroupStyleCustomization_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFTextStyleImpl <em>EEF Text Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFTextStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTextStyle()
		 * @generated
		 */
		EClass EEF_TEXT_STYLE = eINSTANCE.getEEFTextStyle();

		/**
		 * The meta object literal for the '<em><b>Background Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TEXT_STYLE__BACKGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFTextStyle_BackgroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Foreground Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TEXT_STYLE__FOREGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFTextStyle_ForegroundColorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFTextConditionalStyleImpl <em>EEF Text Conditional Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFTextConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTextConditionalStyle()
		 * @generated
		 */
		EClass EEF_TEXT_CONDITIONAL_STYLE = eINSTANCE.getEEFTextConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_TEXT_CONDITIONAL_STYLE__STYLE = eINSTANCE.getEEFTextConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFTextStyleCustomizationImpl <em>EEF Text Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFTextStyleCustomizationImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTextStyleCustomization()
		 * @generated
		 */
		EClass EEF_TEXT_STYLE_CUSTOMIZATION = eINSTANCE.getEEFTextStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_TEXT_STYLE_CUSTOMIZATION__STYLE = eINSTANCE.getEEFTextStyleCustomization_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFCheckboxStyleImpl <em>EEF Checkbox Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFCheckboxStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCheckboxStyle()
		 * @generated
		 */
		EClass EEF_CHECKBOX_STYLE = eINSTANCE.getEEFCheckboxStyle();

		/**
		 * The meta object literal for the '<em><b>Background Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_CHECKBOX_STYLE__BACKGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFCheckboxStyle_BackgroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Foreground Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_CHECKBOX_STYLE__FOREGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFCheckboxStyle_ForegroundColorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFCheckboxConditionalStyleImpl <em>EEF Checkbox Conditional Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFCheckboxConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCheckboxConditionalStyle()
		 * @generated
		 */
		EClass EEF_CHECKBOX_CONDITIONAL_STYLE = eINSTANCE.getEEFCheckboxConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_CHECKBOX_CONDITIONAL_STYLE__STYLE = eINSTANCE.getEEFCheckboxConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFCheckboxStyleCustomizationImpl <em>EEF Checkbox Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFCheckboxStyleCustomizationImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFCheckboxStyleCustomization()
		 * @generated
		 */
		EClass EEF_CHECKBOX_STYLE_CUSTOMIZATION = eINSTANCE.getEEFCheckboxStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_CHECKBOX_STYLE_CUSTOMIZATION__STYLE = eINSTANCE.getEEFCheckboxStyleCustomization_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFLabelStyleImpl <em>EEF Label Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFLabelStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLabelStyle()
		 * @generated
		 */
		EClass EEF_LABEL_STYLE = eINSTANCE.getEEFLabelStyle();

		/**
		 * The meta object literal for the '<em><b>Background Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_LABEL_STYLE__BACKGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFLabelStyle_BackgroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Foreground Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_LABEL_STYLE__FOREGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFLabelStyle_ForegroundColorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFLabelConditionalStyleImpl <em>EEF Label Conditional Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFLabelConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLabelConditionalStyle()
		 * @generated
		 */
		EClass EEF_LABEL_CONDITIONAL_STYLE = eINSTANCE.getEEFLabelConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_LABEL_CONDITIONAL_STYLE__STYLE = eINSTANCE.getEEFLabelConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFLabelStyleCustomizationImpl <em>EEF Label Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFLabelStyleCustomizationImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLabelStyleCustomization()
		 * @generated
		 */
		EClass EEF_LABEL_STYLE_CUSTOMIZATION = eINSTANCE.getEEFLabelStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_LABEL_STYLE_CUSTOMIZATION__STYLE = eINSTANCE.getEEFLabelStyleCustomization_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFRadioStyleImpl <em>EEF Radio Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFRadioStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFRadioStyle()
		 * @generated
		 */
		EClass EEF_RADIO_STYLE = eINSTANCE.getEEFRadioStyle();

		/**
		 * The meta object literal for the '<em><b>Background Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_RADIO_STYLE__BACKGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFRadioStyle_BackgroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Foreground Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_RADIO_STYLE__FOREGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFRadioStyle_ForegroundColorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFRadioConditionalStyleImpl <em>EEF Radio Conditional Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFRadioConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFRadioConditionalStyle()
		 * @generated
		 */
		EClass EEF_RADIO_CONDITIONAL_STYLE = eINSTANCE.getEEFRadioConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_RADIO_CONDITIONAL_STYLE__STYLE = eINSTANCE.getEEFRadioConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFRadioStyleCustomizationImpl <em>EEF Radio Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFRadioStyleCustomizationImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFRadioStyleCustomization()
		 * @generated
		 */
		EClass EEF_RADIO_STYLE_CUSTOMIZATION = eINSTANCE.getEEFRadioStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_RADIO_STYLE_CUSTOMIZATION__STYLE = eINSTANCE.getEEFRadioStyleCustomization_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFLinkStyleImpl <em>EEF Link Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFLinkStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLinkStyle()
		 * @generated
		 */
		EClass EEF_LINK_STYLE = eINSTANCE.getEEFLinkStyle();

		/**
		 * The meta object literal for the '<em><b>Background Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_LINK_STYLE__BACKGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFLinkStyle_BackgroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Foreground Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_LINK_STYLE__FOREGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFLinkStyle_ForegroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Background Image Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_LINK_STYLE__BACKGROUND_IMAGE_EXPRESSION = eINSTANCE.getEEFLinkStyle_BackgroundImageExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFLinkConditionalStyleImpl <em>EEF Link Conditional Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFLinkConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLinkConditionalStyle()
		 * @generated
		 */
		EClass EEF_LINK_CONDITIONAL_STYLE = eINSTANCE.getEEFLinkConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_LINK_CONDITIONAL_STYLE__STYLE = eINSTANCE.getEEFLinkConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFLinkStyleCustomizationImpl <em>EEF Link Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFLinkStyleCustomizationImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLinkStyleCustomization()
		 * @generated
		 */
		EClass EEF_LINK_STYLE_CUSTOMIZATION = eINSTANCE.getEEFLinkStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_LINK_STYLE_CUSTOMIZATION__STYLE = eINSTANCE.getEEFLinkStyleCustomization_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFSelectStyleImpl <em>EEF Select Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFSelectStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFSelectStyle()
		 * @generated
		 */
		EClass EEF_SELECT_STYLE = eINSTANCE.getEEFSelectStyle();

		/**
		 * The meta object literal for the '<em><b>Background Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_SELECT_STYLE__BACKGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFSelectStyle_BackgroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Foreground Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_SELECT_STYLE__FOREGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFSelectStyle_ForegroundColorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFSelectConditionalStyleImpl <em>EEF Select Conditional Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFSelectConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFSelectConditionalStyle()
		 * @generated
		 */
		EClass EEF_SELECT_CONDITIONAL_STYLE = eINSTANCE.getEEFSelectConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_SELECT_CONDITIONAL_STYLE__STYLE = eINSTANCE.getEEFSelectConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFSelectStyleCustomizationImpl <em>EEF Select Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFSelectStyleCustomizationImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFSelectStyleCustomization()
		 * @generated
		 */
		EClass EEF_SELECT_STYLE_CUSTOMIZATION = eINSTANCE.getEEFSelectStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_SELECT_STYLE_CUSTOMIZATION__STYLE = eINSTANCE.getEEFSelectStyleCustomization_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFTreeStyleImpl <em>EEF Tree Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFTreeStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTreeStyle()
		 * @generated
		 */
		EClass EEF_TREE_STYLE = eINSTANCE.getEEFTreeStyle();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFTreeConditionalStyleImpl <em>EEF Tree Conditional Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFTreeConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTreeConditionalStyle()
		 * @generated
		 */
		EClass EEF_TREE_CONDITIONAL_STYLE = eINSTANCE.getEEFTreeConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_TREE_CONDITIONAL_STYLE__STYLE = eINSTANCE.getEEFTreeConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFTreeStyleCustomizationImpl <em>EEF Tree Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFTreeStyleCustomizationImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTreeStyleCustomization()
		 * @generated
		 */
		EClass EEF_TREE_STYLE_CUSTOMIZATION = eINSTANCE.getEEFTreeStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_TREE_STYLE_CUSTOMIZATION__STYLE = eINSTANCE.getEEFTreeStyleCustomization_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFTableStyleImpl <em>EEF Table Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFTableStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTableStyle()
		 * @generated
		 */
		EClass EEF_TABLE_STYLE = eINSTANCE.getEEFTableStyle();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFTableConditionalStyleImpl <em>EEF Table Conditional Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFTableConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTableConditionalStyle()
		 * @generated
		 */
		EClass EEF_TABLE_CONDITIONAL_STYLE = eINSTANCE.getEEFTableConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_TABLE_CONDITIONAL_STYLE__STYLE = eINSTANCE.getEEFTableConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFTableStyleCustomizationImpl <em>EEF Table Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFTableStyleCustomizationImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFTableStyleCustomization()
		 * @generated
		 */
		EClass EEF_TABLE_STYLE_CUSTOMIZATION = eINSTANCE.getEEFTableStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_TABLE_STYLE_CUSTOMIZATION__STYLE = eINSTANCE.getEEFTableStyleCustomization_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFLineStyleImpl <em>EEF Line Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFLineStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLineStyle()
		 * @generated
		 */
		EClass EEF_LINE_STYLE = eINSTANCE.getEEFLineStyle();

		/**
		 * The meta object literal for the '<em><b>Background Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_LINE_STYLE__BACKGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFLineStyle_BackgroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Foreground Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_LINE_STYLE__FOREGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFLineStyle_ForegroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Header Background Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_LINE_STYLE__HEADER_BACKGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFLineStyle_HeaderBackgroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Header Foreground Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_LINE_STYLE__HEADER_FOREGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFLineStyle_HeaderForegroundColorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFLineConditionalStyleImpl <em>EEF Line Conditional Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFLineConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLineConditionalStyle()
		 * @generated
		 */
		EClass EEF_LINE_CONDITIONAL_STYLE = eINSTANCE.getEEFLineConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_LINE_CONDITIONAL_STYLE__STYLE = eINSTANCE.getEEFLineConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFLineStyleCustomizationImpl <em>EEF Line Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFLineStyleCustomizationImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFLineStyleCustomization()
		 * @generated
		 */
		EClass EEF_LINE_STYLE_CUSTOMIZATION = eINSTANCE.getEEFLineStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_LINE_STYLE_CUSTOMIZATION__STYLE = eINSTANCE.getEEFLineStyleCustomization_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFColumnStyleImpl <em>EEF Column Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFColumnStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFColumnStyle()
		 * @generated
		 */
		EClass EEF_COLUMN_STYLE = eINSTANCE.getEEFColumnStyle();

		/**
		 * The meta object literal for the '<em><b>Background Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_COLUMN_STYLE__BACKGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFColumnStyle_BackgroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Foreground Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_COLUMN_STYLE__FOREGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFColumnStyle_ForegroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Header Background Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_COLUMN_STYLE__HEADER_BACKGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFColumnStyle_HeaderBackgroundColorExpression();

		/**
		 * The meta object literal for the '<em><b>Header Foreground Color Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_COLUMN_STYLE__HEADER_FOREGROUND_COLOR_EXPRESSION = eINSTANCE.getEEFColumnStyle_HeaderForegroundColorExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFColumnConditionalStyleImpl <em>EEF Column Conditional Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFColumnConditionalStyleImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFColumnConditionalStyle()
		 * @generated
		 */
		EClass EEF_COLUMN_CONDITIONAL_STYLE = eINSTANCE.getEEFColumnConditionalStyle();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_COLUMN_CONDITIONAL_STYLE__STYLE = eINSTANCE.getEEFColumnConditionalStyle_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFColumnStyleCustomizationImpl <em>EEF Column Style Customization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFColumnStyleCustomizationImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFColumnStyleCustomization()
		 * @generated
		 */
		EClass EEF_COLUMN_STYLE_CUSTOMIZATION = eINSTANCE.getEEFColumnStyleCustomization();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_COLUMN_STYLE_CUSTOMIZATION__STYLE = eINSTANCE.getEEFColumnStyleCustomization_Style();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFQuickFixImpl <em>EEF Quick Fix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFQuickFixImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFQuickFix()
		 * @generated
		 */
		EClass EEF_QUICK_FIX = eINSTANCE.getEEFQuickFix();

		/**
		 * The meta object literal for the '<em><b>Title Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_QUICK_FIX__TITLE_EXPRESSION = eINSTANCE.getEEFQuickFix_TitleExpression();

		/**
		 * The meta object literal for the '<em><b>Message Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_QUICK_FIX__MESSAGE_EXPRESSION = eINSTANCE.getEEFQuickFix_MessageExpression();

		/**
		 * The meta object literal for the '<em><b>Can Handle Status Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_QUICK_FIX__CAN_HANDLE_STATUS_EXPRESSION = eINSTANCE.getEEFQuickFix_CanHandleStatusExpression();

		/**
		 * The meta object literal for the '<em><b>Fix Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_QUICK_FIX__FIX_EXPRESSION = eINSTANCE.getEEFQuickFix_FixExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.impl.EEFValidationImpl <em>EEF Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.impl.EEFValidationImpl
		 * @see org.eclipse.eef.impl.EefPackageImpl#getEEFValidation()
		 * @generated
		 */
		EClass EEF_VALIDATION = eINSTANCE.getEEFValidation();

		/**
		 * The meta object literal for the '<em><b>Validation Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_VALIDATION__VALIDATION_EXPRESSION = eINSTANCE.getEEFValidation_ValidationExpression();

		/**
		 * The meta object literal for the '<em><b>Quickfixes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_VALIDATION__QUICKFIXES = eINSTANCE.getEEFValidation_Quickfixes();

		/**
		 * The meta object literal for the '<em>Type Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.eef.impl.EefPackageImpl#getTypeName()
		 * @generated
		 */
		EDataType TYPE_NAME = eINSTANCE.getTypeName();

	}

} //EefPackage
