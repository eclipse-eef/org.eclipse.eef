/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef;

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
 * @see org.eclipse.eef.eef.EefFactory
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
	EefPackage eINSTANCE = org.eclipse.eef.eef.impl.EefPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.ContextableElementImpl <em>Contextable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.ContextableElementImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getContextableElement()
	 * @generated
	 */
	int CONTEXTABLE_ELEMENT = 26;

	/**
	 * The feature id for the '<em><b>Required Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTABLE_ELEMENT__REQUIRED_CONTEXT_VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Excluded Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTABLE_ELEMENT__EXCLUDED_CONTEXT_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>Contextable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTABLE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFViewDescriptionImpl <em>EEF View Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFViewDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFViewDescription()
	 * @generated
	 */
	int EEF_VIEW_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Required Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES = CONTEXTABLE_ELEMENT__REQUIRED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Excluded Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES = CONTEXTABLE_ELEMENT__EXCLUDED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__IDENTIFIER = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EPackage Ns Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__EPACKAGE_NS_URIS = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__GROUPS = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__PAGES = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Java Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__JAVA_EXTENSIONS = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Imported Views</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__IMPORTED_VIEWS = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tree Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__TREE_STRUCTURES = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Table Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION__TABLE_STRUCTURES = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>EEF View Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_VIEW_DESCRIPTION_FEATURE_COUNT = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFPageDescriptionImpl <em>EEF Page Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFPageDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFPageDescription()
	 * @generated
	 */
	int EEF_PAGE_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Required Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES = CONTEXTABLE_ELEMENT__REQUIRED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Excluded Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES = CONTEXTABLE_ELEMENT__EXCLUDED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__IDENTIFIER = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__LABEL_EXPRESSION = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domain Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__DOMAIN_CLASS = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Semantic Candidate Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__GROUPS = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extended Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION__EXTENDED_PAGE = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EEF Page Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_PAGE_DESCRIPTION_FEATURE_COUNT = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFGroupDescriptionImpl <em>EEF Group Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFGroupDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFGroupDescription()
	 * @generated
	 */
	int EEF_GROUP_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Required Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES = CONTEXTABLE_ELEMENT__REQUIRED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Excluded Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES = CONTEXTABLE_ELEMENT__EXCLUDED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__IDENTIFIER = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__LABEL_EXPRESSION = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domain Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__DOMAIN_CLASS = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Semantic Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION__CONTAINER = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EEF Group Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_GROUP_DESCRIPTION_FEATURE_COUNT = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFContainerDescriptionImpl <em>EEF Container Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFContainerDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFContainerDescription()
	 * @generated
	 */
	int EEF_CONTAINER_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Required Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES = CONTEXTABLE_ELEMENT__REQUIRED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Excluded Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES = CONTEXTABLE_ELEMENT__EXCLUDED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__IDENTIFIER = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Semantic Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domain Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__DOMAIN_CLASS = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Layout Column Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__LAYOUT_COLUMN_COUNT = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__CONTAINERS = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION__WIDGETS = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EEF Container Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION_FEATURE_COUNT = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFWidgetDescriptionImpl <em>EEF Widget Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFWidgetDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFWidgetDescription()
	 * @generated
	 */
	int EEF_WIDGET_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Required Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES = CONTEXTABLE_ELEMENT__REQUIRED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Excluded Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES = CONTEXTABLE_ELEMENT__EXCLUDED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__IDENTIFIER = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EEF Widget Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_WIDGET_DESCRIPTION_FEATURE_COUNT = CONTEXTABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFJavaExtensionDescriptionImpl <em>EEF Java Extension Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFJavaExtensionDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFJavaExtensionDescription()
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
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFTreeStructureDescriptionImpl <em>EEF Tree Structure Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFTreeStructureDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFTreeStructureDescription()
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
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFTableStructureDescriptionImpl <em>EEF Table Structure Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFTableStructureDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFTableStructureDescription()
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
	 * The number of structural features of the '<em>EEF Table Structure Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_STRUCTURE_DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFInterpretedTableStructureDescriptionImpl <em>EEF Interpreted Table Structure Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFInterpretedTableStructureDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFInterpretedTableStructureDescription()
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
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFCellWidgetDescriptionImpl <em>EEF Cell Widget Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFCellWidgetDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFCellWidgetDescription()
	 * @generated
	 */
	int EEF_CELL_WIDGET_DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Required Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CELL_WIDGET_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES = EEF_WIDGET_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Excluded Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CELL_WIDGET_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES = EEF_WIDGET_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CELL_WIDGET_DESCRIPTION__IDENTIFIER = EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CELL_WIDGET_DESCRIPTION__LABEL_EXPRESSION = EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Feature Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CELL_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION = EEF_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION;

	/**
	 * The number of structural features of the '<em>EEF Cell Widget Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT = EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFAdapterFactoryTreeStructureDescriptionImpl <em>EEF Adapter Factory Tree Structure Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFAdapterFactoryTreeStructureDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFAdapterFactoryTreeStructureDescription()
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
	int EEF_ADAPTER_FACTORY_TREE_STRUCTURE_DESCRIPTION__ADAPTER_FACTORY_PROVIDER = EEF_TREE_STRUCTURE_DESCRIPTION_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>EEF Adapter Factory Tree Structure Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_ADAPTER_FACTORY_TREE_STRUCTURE_DESCRIPTION_FEATURE_COUNT = EEF_TREE_STRUCTURE_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFInterpretedTreeStructureDescriptionImpl <em>EEF Interpreted Tree Structure Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFInterpretedTreeStructureDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFInterpretedTreeStructureDescription()
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
	int EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CHILDREN_EXPRESSION = EEF_TREE_STRUCTURE_DESCRIPTION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Selectable Predicate Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__SELECTABLE_PREDICATE_EXPRESSION = EEF_TREE_STRUCTURE_DESCRIPTION_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Candidate Display Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION = EEF_TREE_STRUCTURE_DESCRIPTION_FEATURE_COUNT
			+ 3;

	/**
	 * The number of structural features of the '<em>EEF Interpreted Tree Structure Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION_FEATURE_COUNT = EEF_TREE_STRUCTURE_DESCRIPTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFTextDescriptionImpl <em>EEF Text Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFTextDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFTextDescription()
	 * @generated
	 */
	int EEF_TEXT_DESCRIPTION = 11;

	/**
	 * The feature id for the '<em><b>Required Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Excluded Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__IDENTIFIER = EEF_CELL_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__LABEL_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Feature Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION;

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
	 * The feature id for the '<em><b>Line Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION__LINE_COUNT = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EEF Text Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION_FEATURE_COUNT = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFCheckboxDescriptionImpl <em>EEF Checkbox Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFCheckboxDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFCheckboxDescription()
	 * @generated
	 */
	int EEF_CHECKBOX_DESCRIPTION = 12;

	/**
	 * The feature id for the '<em><b>Required Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Excluded Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__IDENTIFIER = EEF_CELL_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__LABEL_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Feature Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_CHECKBOX_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION;

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
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFSelectDescriptionImpl <em>EEF Select Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFSelectDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFSelectDescription()
	 * @generated
	 */
	int EEF_SELECT_DESCRIPTION = 13;

	/**
	 * The feature id for the '<em><b>Required Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Excluded Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__IDENTIFIER = EEF_CELL_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__LABEL_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Feature Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_SELECT_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION;

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
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFLabelDescriptionImpl <em>EEF Label Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFLabelDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFLabelDescription()
	 * @generated
	 */
	int EEF_LABEL_DESCRIPTION = 14;

	/**
	 * The feature id for the '<em><b>Required Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Excluded Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__IDENTIFIER = EEF_CELL_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__LABEL_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Feature Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LABEL_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION;

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
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFRadioDescriptionImpl <em>EEF Radio Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFRadioDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFRadioDescription()
	 * @generated
	 */
	int EEF_RADIO_DESCRIPTION = 15;

	/**
	 * The feature id for the '<em><b>Required Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES = EEF_WIDGET_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Excluded Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES = EEF_WIDGET_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__IDENTIFIER = EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__LABEL_EXPRESSION = EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Feature Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_RADIO_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION = EEF_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION;

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
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFTreeDialogSelectDescriptionImpl <em>EEF Tree Dialog Select Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFTreeDialogSelectDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFTreeDialogSelectDescription()
	 * @generated
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION = 16;

	/**
	 * The feature id for the '<em><b>Required Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Excluded Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION__IDENTIFIER = EEF_CELL_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION__LABEL_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Feature Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Semantic Candidate Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DIALOG_SELECT_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION_FEATURE_COUNT
			+ 0;

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
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFLinkDescriptionImpl <em>EEF Link Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFLinkDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFLinkDescription()
	 * @generated
	 */
	int EEF_LINK_DESCRIPTION = 17;

	/**
	 * The feature id for the '<em><b>Required Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Excluded Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_DESCRIPTION__IDENTIFIER = EEF_CELL_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_DESCRIPTION__LABEL_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Feature Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_LINK_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION;

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
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFImageDescriptionImpl <em>EEF Image Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFImageDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFImageDescription()
	 * @generated
	 */
	int EEF_IMAGE_DESCRIPTION = 18;

	/**
	 * The feature id for the '<em><b>Required Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Excluded Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_DESCRIPTION__IDENTIFIER = EEF_CELL_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_DESCRIPTION__LABEL_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Feature Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION;

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
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFTreeDescriptionImpl <em>EEF Tree Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFTreeDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFTreeDescription()
	 * @generated
	 */
	int EEF_TREE_DESCRIPTION = 19;

	/**
	 * The feature id for the '<em><b>Required Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Excluded Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES = EEF_CELL_WIDGET_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DESCRIPTION__IDENTIFIER = EEF_CELL_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DESCRIPTION__LABEL_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Feature Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TREE_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION = EEF_CELL_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION;

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
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFImagePickerDescriptionImpl <em>EEF Image Picker Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFImagePickerDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFImagePickerDescription()
	 * @generated
	 */
	int EEF_IMAGE_PICKER_DESCRIPTION = 20;

	/**
	 * The feature id for the '<em><b>Required Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_PICKER_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES = EEF_WIDGET_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Excluded Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_PICKER_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES = EEF_WIDGET_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_PICKER_DESCRIPTION__IDENTIFIER = EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_PICKER_DESCRIPTION__LABEL_EXPRESSION = EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Feature Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_IMAGE_PICKER_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION = EEF_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION;

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
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFTableDescriptionImpl <em>EEF Table Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFTableDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFTableDescription()
	 * @generated
	 */
	int EEF_TABLE_DESCRIPTION = 21;

	/**
	 * The feature id for the '<em><b>Required Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES = EEF_WIDGET_DESCRIPTION__REQUIRED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Excluded Context Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES = EEF_WIDGET_DESCRIPTION__EXCLUDED_CONTEXT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_DESCRIPTION__IDENTIFIER = EEF_WIDGET_DESCRIPTION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Label Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_DESCRIPTION__LABEL_EXPRESSION = EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Feature Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_TABLE_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION = EEF_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION;

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
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFColumnDescriptionImpl <em>EEF Column Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFColumnDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFColumnDescription()
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
	 * The feature id for the '<em><b>Context Candidates Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_COLUMN_DESCRIPTION__CONTEXT_CANDIDATES_EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>EEF Column Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_COLUMN_DESCRIPTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFLineDescriptionImpl <em>EEF Line Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFLineDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFLineDescription()
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
	 * The meta object id for the '{@link org.eclipse.eef.eef.impl.EEFAdapterFactoryTableStructureDescriptionImpl <em>EEF Adapter Factory Table Structure Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.eef.eef.impl.EEFAdapterFactoryTableStructureDescriptionImpl
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFAdapterFactoryTableStructureDescription()
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
	 * The feature id for the '<em><b>Adapter Factory Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION__ADAPTER_FACTORY_PROVIDER = EEF_TABLE_STRUCTURE_DESCRIPTION_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>EEF Adapter Factory Table Structure Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION_FEATURE_COUNT = EEF_TABLE_STRUCTURE_DESCRIPTION_FEATURE_COUNT
			+ 1;

	/**
	 * The meta object id for the '<em>Expression</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 27;

	/**
	 * The meta object id for the '<em>Type Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getTypeName()
	 * @generated
	 */
	int TYPE_NAME = 28;

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFViewDescription <em>EEF View Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF View Description</em>'.
	 * @see org.eclipse.eef.eef.EEFViewDescription
	 * @generated
	 */
	EClass getEEFViewDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFViewDescription#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.eef.EEFViewDescription#getIdentifier()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EAttribute getEEFViewDescription_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFViewDescription#getLabelExpression <em>Label Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFViewDescription#getLabelExpression()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EAttribute getEEFViewDescription_LabelExpression();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.eef.eef.EEFViewDescription#getEPackageNsUris <em>EPackage Ns Uris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EPackage Ns Uris</em>'.
	 * @see org.eclipse.eef.eef.EEFViewDescription#getEPackageNsUris()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EAttribute getEEFViewDescription_EPackageNsUris();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.eef.EEFViewDescription#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.eclipse.eef.eef.EEFViewDescription#getGroups()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EReference getEEFViewDescription_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.eef.EEFViewDescription#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see org.eclipse.eef.eef.EEFViewDescription#getPages()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EReference getEEFViewDescription_Pages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.eef.EEFViewDescription#getJavaExtensions <em>Java Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Java Extensions</em>'.
	 * @see org.eclipse.eef.eef.EEFViewDescription#getJavaExtensions()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EReference getEEFViewDescription_JavaExtensions();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.eef.eef.EEFViewDescription#getImportedViews <em>Imported Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imported Views</em>'.
	 * @see org.eclipse.eef.eef.EEFViewDescription#getImportedViews()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EReference getEEFViewDescription_ImportedViews();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.eef.EEFViewDescription#getTreeStructures <em>Tree Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tree Structures</em>'.
	 * @see org.eclipse.eef.eef.EEFViewDescription#getTreeStructures()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EReference getEEFViewDescription_TreeStructures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.eef.EEFViewDescription#getTableStructures <em>Table Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Structures</em>'.
	 * @see org.eclipse.eef.eef.EEFViewDescription#getTableStructures()
	 * @see #getEEFViewDescription()
	 * @generated
	 */
	EReference getEEFViewDescription_TableStructures();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFPageDescription <em>EEF Page Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Page Description</em>'.
	 * @see org.eclipse.eef.eef.EEFPageDescription
	 * @generated
	 */
	EClass getEEFPageDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFPageDescription#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.eef.EEFPageDescription#getIdentifier()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EAttribute getEEFPageDescription_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFPageDescription#getLabelExpression <em>Label Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFPageDescription#getLabelExpression()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EAttribute getEEFPageDescription_LabelExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFPageDescription#getDomainClass <em>Domain Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Class</em>'.
	 * @see org.eclipse.eef.eef.EEFPageDescription#getDomainClass()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EAttribute getEEFPageDescription_DomainClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFPageDescription#getSemanticCandidateExpression <em>Semantic Candidate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Candidate Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFPageDescription#getSemanticCandidateExpression()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EAttribute getEEFPageDescription_SemanticCandidateExpression();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.eef.eef.EEFPageDescription#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see org.eclipse.eef.eef.EEFPageDescription#getGroups()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EReference getEEFPageDescription_Groups();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eef.eef.EEFPageDescription#getExtendedPage <em>Extended Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extended Page</em>'.
	 * @see org.eclipse.eef.eef.EEFPageDescription#getExtendedPage()
	 * @see #getEEFPageDescription()
	 * @generated
	 */
	EReference getEEFPageDescription_ExtendedPage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFGroupDescription <em>EEF Group Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Group Description</em>'.
	 * @see org.eclipse.eef.eef.EEFGroupDescription
	 * @generated
	 */
	EClass getEEFGroupDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFGroupDescription#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.eef.EEFGroupDescription#getIdentifier()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EAttribute getEEFGroupDescription_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFGroupDescription#getLabelExpression <em>Label Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFGroupDescription#getLabelExpression()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EAttribute getEEFGroupDescription_LabelExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFGroupDescription#getDomainClass <em>Domain Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Class</em>'.
	 * @see org.eclipse.eef.eef.EEFGroupDescription#getDomainClass()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EAttribute getEEFGroupDescription_DomainClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFGroupDescription#getSemanticCandidatesExpression <em>Semantic Candidates Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Candidates Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFGroupDescription#getSemanticCandidatesExpression()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EAttribute getEEFGroupDescription_SemanticCandidatesExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.eef.EEFGroupDescription#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container</em>'.
	 * @see org.eclipse.eef.eef.EEFGroupDescription#getContainer()
	 * @see #getEEFGroupDescription()
	 * @generated
	 */
	EReference getEEFGroupDescription_Container();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFContainerDescription <em>EEF Container Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Container Description</em>'.
	 * @see org.eclipse.eef.eef.EEFContainerDescription
	 * @generated
	 */
	EClass getEEFContainerDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFContainerDescription#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.eef.EEFContainerDescription#getIdentifier()
	 * @see #getEEFContainerDescription()
	 * @generated
	 */
	EAttribute getEEFContainerDescription_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFContainerDescription#getSemanticCandidatesExpression <em>Semantic Candidates Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Candidates Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFContainerDescription#getSemanticCandidatesExpression()
	 * @see #getEEFContainerDescription()
	 * @generated
	 */
	EAttribute getEEFContainerDescription_SemanticCandidatesExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFContainerDescription#getDomainClass <em>Domain Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Class</em>'.
	 * @see org.eclipse.eef.eef.EEFContainerDescription#getDomainClass()
	 * @see #getEEFContainerDescription()
	 * @generated
	 */
	EAttribute getEEFContainerDescription_DomainClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFContainerDescription#getLayoutColumnCount <em>Layout Column Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout Column Count</em>'.
	 * @see org.eclipse.eef.eef.EEFContainerDescription#getLayoutColumnCount()
	 * @see #getEEFContainerDescription()
	 * @generated
	 */
	EAttribute getEEFContainerDescription_LayoutColumnCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.eef.EEFContainerDescription#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see org.eclipse.eef.eef.EEFContainerDescription#getContainers()
	 * @see #getEEFContainerDescription()
	 * @generated
	 */
	EReference getEEFContainerDescription_Containers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.eef.EEFContainerDescription#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see org.eclipse.eef.eef.EEFContainerDescription#getWidgets()
	 * @see #getEEFContainerDescription()
	 * @generated
	 */
	EReference getEEFContainerDescription_Widgets();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFWidgetDescription <em>EEF Widget Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Widget Description</em>'.
	 * @see org.eclipse.eef.eef.EEFWidgetDescription
	 * @generated
	 */
	EClass getEEFWidgetDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFWidgetDescription#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.eef.EEFWidgetDescription#getIdentifier()
	 * @see #getEEFWidgetDescription()
	 * @generated
	 */
	EAttribute getEEFWidgetDescription_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFWidgetDescription#getLabelExpression <em>Label Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFWidgetDescription#getLabelExpression()
	 * @see #getEEFWidgetDescription()
	 * @generated
	 */
	EAttribute getEEFWidgetDescription_LabelExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFWidgetDescription#getFeatureCandidatesExpression <em>Feature Candidates Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Candidates Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFWidgetDescription#getFeatureCandidatesExpression()
	 * @see #getEEFWidgetDescription()
	 * @generated
	 */
	EAttribute getEEFWidgetDescription_FeatureCandidatesExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFJavaExtensionDescription <em>EEF Java Extension Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Java Extension Description</em>'.
	 * @see org.eclipse.eef.eef.EEFJavaExtensionDescription
	 * @generated
	 */
	EClass getEEFJavaExtensionDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFJavaExtensionDescription#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see org.eclipse.eef.eef.EEFJavaExtensionDescription#getQualifiedName()
	 * @see #getEEFJavaExtensionDescription()
	 * @generated
	 */
	EAttribute getEEFJavaExtensionDescription_QualifiedName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFTreeStructureDescription <em>EEF Tree Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Tree Structure Description</em>'.
	 * @see org.eclipse.eef.eef.EEFTreeStructureDescription
	 * @generated
	 */
	EClass getEEFTreeStructureDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFTreeStructureDescription#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.eef.EEFTreeStructureDescription#getIdentifier()
	 * @see #getEEFTreeStructureDescription()
	 * @generated
	 */
	EAttribute getEEFTreeStructureDescription_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFTreeStructureDescription#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see org.eclipse.eef.eef.EEFTreeStructureDescription#isMultiple()
	 * @see #getEEFTreeStructureDescription()
	 * @generated
	 */
	EAttribute getEEFTreeStructureDescription_Multiple();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFInterpretedTableStructureDescription <em>EEF Interpreted Table Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Interpreted Table Structure Description</em>'.
	 * @see org.eclipse.eef.eef.EEFInterpretedTableStructureDescription
	 * @generated
	 */
	EClass getEEFInterpretedTableStructureDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.eef.EEFInterpretedTableStructureDescription#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.eclipse.eef.eef.EEFInterpretedTableStructureDescription#getColumns()
	 * @see #getEEFInterpretedTableStructureDescription()
	 * @generated
	 */
	EReference getEEFInterpretedTableStructureDescription_Columns();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.eef.eef.EEFInterpretedTableStructureDescription#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line</em>'.
	 * @see org.eclipse.eef.eef.EEFInterpretedTableStructureDescription#getLine()
	 * @see #getEEFInterpretedTableStructureDescription()
	 * @generated
	 */
	EReference getEEFInterpretedTableStructureDescription_Line();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFCellWidgetDescription <em>EEF Cell Widget Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Cell Widget Description</em>'.
	 * @see org.eclipse.eef.eef.EEFCellWidgetDescription
	 * @generated
	 */
	EClass getEEFCellWidgetDescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFAdapterFactoryTreeStructureDescription <em>EEF Adapter Factory Tree Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Adapter Factory Tree Structure Description</em>'.
	 * @see org.eclipse.eef.eef.EEFAdapterFactoryTreeStructureDescription
	 * @generated
	 */
	EClass getEEFAdapterFactoryTreeStructureDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFAdapterFactoryTreeStructureDescription#getAdapterFactoryProvider <em>Adapter Factory Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter Factory Provider</em>'.
	 * @see org.eclipse.eef.eef.EEFAdapterFactoryTreeStructureDescription#getAdapterFactoryProvider()
	 * @see #getEEFAdapterFactoryTreeStructureDescription()
	 * @generated
	 */
	EAttribute getEEFAdapterFactoryTreeStructureDescription_AdapterFactoryProvider();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription <em>EEF Interpreted Tree Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Interpreted Tree Structure Description</em>'.
	 * @see org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription
	 * @generated
	 */
	EClass getEEFInterpretedTreeStructureDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription#getRootsExpression <em>Roots Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roots Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription#getRootsExpression()
	 * @see #getEEFInterpretedTreeStructureDescription()
	 * @generated
	 */
	EAttribute getEEFInterpretedTreeStructureDescription_RootsExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription#getChildrenExpression <em>Children Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Children Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription#getChildrenExpression()
	 * @see #getEEFInterpretedTreeStructureDescription()
	 * @generated
	 */
	EAttribute getEEFInterpretedTreeStructureDescription_ChildrenExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription#getSelectablePredicateExpression <em>Selectable Predicate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selectable Predicate Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription#getSelectablePredicateExpression()
	 * @see #getEEFInterpretedTreeStructureDescription()
	 * @generated
	 */
	EAttribute getEEFInterpretedTreeStructureDescription_SelectablePredicateExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription#getCandidateDisplayExpression <em>Candidate Display Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Candidate Display Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription#getCandidateDisplayExpression()
	 * @see #getEEFInterpretedTreeStructureDescription()
	 * @generated
	 */
	EAttribute getEEFInterpretedTreeStructureDescription_CandidateDisplayExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFTextDescription <em>EEF Text Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Text Description</em>'.
	 * @see org.eclipse.eef.eef.EEFTextDescription
	 * @generated
	 */
	EClass getEEFTextDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFTextDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFTextDescription#getValueExpression()
	 * @see #getEEFTextDescription()
	 * @generated
	 */
	EAttribute getEEFTextDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFTextDescription#getEditExpression <em>Edit Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFTextDescription#getEditExpression()
	 * @see #getEEFTextDescription()
	 * @generated
	 */
	EAttribute getEEFTextDescription_EditExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFTextDescription#getLineCount <em>Line Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Count</em>'.
	 * @see org.eclipse.eef.eef.EEFTextDescription#getLineCount()
	 * @see #getEEFTextDescription()
	 * @generated
	 */
	EAttribute getEEFTextDescription_LineCount();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFCheckboxDescription <em>EEF Checkbox Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Checkbox Description</em>'.
	 * @see org.eclipse.eef.eef.EEFCheckboxDescription
	 * @generated
	 */
	EClass getEEFCheckboxDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFCheckboxDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFCheckboxDescription#getValueExpression()
	 * @see #getEEFCheckboxDescription()
	 * @generated
	 */
	EAttribute getEEFCheckboxDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFCheckboxDescription#getEditExpression <em>Edit Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFCheckboxDescription#getEditExpression()
	 * @see #getEEFCheckboxDescription()
	 * @generated
	 */
	EAttribute getEEFCheckboxDescription_EditExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFSelectDescription <em>EEF Select Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Select Description</em>'.
	 * @see org.eclipse.eef.eef.EEFSelectDescription
	 * @generated
	 */
	EClass getEEFSelectDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFSelectDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFSelectDescription#getValueExpression()
	 * @see #getEEFSelectDescription()
	 * @generated
	 */
	EAttribute getEEFSelectDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFSelectDescription#getEditExpression <em>Edit Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFSelectDescription#getEditExpression()
	 * @see #getEEFSelectDescription()
	 * @generated
	 */
	EAttribute getEEFSelectDescription_EditExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFSelectDescription#getCandidatesExpression <em>Candidates Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Candidates Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFSelectDescription#getCandidatesExpression()
	 * @see #getEEFSelectDescription()
	 * @generated
	 */
	EAttribute getEEFSelectDescription_CandidatesExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFSelectDescription#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see org.eclipse.eef.eef.EEFSelectDescription#isMultiple()
	 * @see #getEEFSelectDescription()
	 * @generated
	 */
	EAttribute getEEFSelectDescription_Multiple();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFSelectDescription#getCandidateDisplayExpression <em>Candidate Display Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Candidate Display Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFSelectDescription#getCandidateDisplayExpression()
	 * @see #getEEFSelectDescription()
	 * @generated
	 */
	EAttribute getEEFSelectDescription_CandidateDisplayExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFLabelDescription <em>EEF Label Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Label Description</em>'.
	 * @see org.eclipse.eef.eef.EEFLabelDescription
	 * @generated
	 */
	EClass getEEFLabelDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFLabelDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFLabelDescription#getValueExpression()
	 * @see #getEEFLabelDescription()
	 * @generated
	 */
	EAttribute getEEFLabelDescription_ValueExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFRadioDescription <em>EEF Radio Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Radio Description</em>'.
	 * @see org.eclipse.eef.eef.EEFRadioDescription
	 * @generated
	 */
	EClass getEEFRadioDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFRadioDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFRadioDescription#getValueExpression()
	 * @see #getEEFRadioDescription()
	 * @generated
	 */
	EAttribute getEEFRadioDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFRadioDescription#getEditExpression <em>Edit Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFRadioDescription#getEditExpression()
	 * @see #getEEFRadioDescription()
	 * @generated
	 */
	EAttribute getEEFRadioDescription_EditExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFRadioDescription#getCandidatesExpression <em>Candidates Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Candidates Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFRadioDescription#getCandidatesExpression()
	 * @see #getEEFRadioDescription()
	 * @generated
	 */
	EAttribute getEEFRadioDescription_CandidatesExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFRadioDescription#getCandidateDisplayExpression <em>Candidate Display Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Candidate Display Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFRadioDescription#getCandidateDisplayExpression()
	 * @see #getEEFRadioDescription()
	 * @generated
	 */
	EAttribute getEEFRadioDescription_CandidateDisplayExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFTreeDialogSelectDescription <em>EEF Tree Dialog Select Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Tree Dialog Select Description</em>'.
	 * @see org.eclipse.eef.eef.EEFTreeDialogSelectDescription
	 * @generated
	 */
	EClass getEEFTreeDialogSelectDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFTreeDialogSelectDescription#getSemanticCandidateExpression <em>Semantic Candidate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Candidate Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFTreeDialogSelectDescription#getSemanticCandidateExpression()
	 * @see #getEEFTreeDialogSelectDescription()
	 * @generated
	 */
	EAttribute getEEFTreeDialogSelectDescription_SemanticCandidateExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFTreeDialogSelectDescription#getDefaultFilter <em>Default Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Filter</em>'.
	 * @see org.eclipse.eef.eef.EEFTreeDialogSelectDescription#getDefaultFilter()
	 * @see #getEEFTreeDialogSelectDescription()
	 * @generated
	 */
	EAttribute getEEFTreeDialogSelectDescription_DefaultFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFTreeDialogSelectDescription#getDomainClass <em>Domain Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Class</em>'.
	 * @see org.eclipse.eef.eef.EEFTreeDialogSelectDescription#getDomainClass()
	 * @see #getEEFTreeDialogSelectDescription()
	 * @generated
	 */
	EAttribute getEEFTreeDialogSelectDescription_DomainClass();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eef.eef.EEFTreeDialogSelectDescription#getTree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tree</em>'.
	 * @see org.eclipse.eef.eef.EEFTreeDialogSelectDescription#getTree()
	 * @see #getEEFTreeDialogSelectDescription()
	 * @generated
	 */
	EReference getEEFTreeDialogSelectDescription_Tree();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFLinkDescription <em>EEF Link Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Link Description</em>'.
	 * @see org.eclipse.eef.eef.EEFLinkDescription
	 * @generated
	 */
	EClass getEEFLinkDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFLinkDescription#getOnClickExpression <em>On Click Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Click Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFLinkDescription#getOnClickExpression()
	 * @see #getEEFLinkDescription()
	 * @generated
	 */
	EAttribute getEEFLinkDescription_OnClickExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFImageDescription <em>EEF Image Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Image Description</em>'.
	 * @see org.eclipse.eef.eef.EEFImageDescription
	 * @generated
	 */
	EClass getEEFImageDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFImageDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFImageDescription#getValueExpression()
	 * @see #getEEFImageDescription()
	 * @generated
	 */
	EAttribute getEEFImageDescription_ValueExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFTreeDescription <em>EEF Tree Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Tree Description</em>'.
	 * @see org.eclipse.eef.eef.EEFTreeDescription
	 * @generated
	 */
	EClass getEEFTreeDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFTreeDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFTreeDescription#getValueExpression()
	 * @see #getEEFTreeDescription()
	 * @generated
	 */
	EAttribute getEEFTreeDescription_ValueExpression();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eef.eef.EEFTreeDescription#getTreeStructure <em>Tree Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tree Structure</em>'.
	 * @see org.eclipse.eef.eef.EEFTreeDescription#getTreeStructure()
	 * @see #getEEFTreeDescription()
	 * @generated
	 */
	EReference getEEFTreeDescription_TreeStructure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFTreeDescription#getEditExpression <em>Edit Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFTreeDescription#getEditExpression()
	 * @see #getEEFTreeDescription()
	 * @generated
	 */
	EAttribute getEEFTreeDescription_EditExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFImagePickerDescription <em>EEF Image Picker Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Image Picker Description</em>'.
	 * @see org.eclipse.eef.eef.EEFImagePickerDescription
	 * @generated
	 */
	EClass getEEFImagePickerDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFImagePickerDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFImagePickerDescription#getValueExpression()
	 * @see #getEEFImagePickerDescription()
	 * @generated
	 */
	EAttribute getEEFImagePickerDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFImagePickerDescription#getEditExpression <em>Edit Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFImagePickerDescription#getEditExpression()
	 * @see #getEEFImagePickerDescription()
	 * @generated
	 */
	EAttribute getEEFImagePickerDescription_EditExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFImagePickerDescription#getCandidatesExpression <em>Candidates Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Candidates Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFImagePickerDescription#getCandidatesExpression()
	 * @see #getEEFImagePickerDescription()
	 * @generated
	 */
	EAttribute getEEFImagePickerDescription_CandidatesExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFTableDescription <em>EEF Table Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Table Description</em>'.
	 * @see org.eclipse.eef.eef.EEFTableDescription
	 * @generated
	 */
	EClass getEEFTableDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFTableDescription#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFTableDescription#getValueExpression()
	 * @see #getEEFTableDescription()
	 * @generated
	 */
	EAttribute getEEFTableDescription_ValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFTableDescription#getEditExpression <em>Edit Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFTableDescription#getEditExpression()
	 * @see #getEEFTableDescription()
	 * @generated
	 */
	EAttribute getEEFTableDescription_EditExpression();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eef.eef.EEFTableDescription#getTableStructure <em>Table Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table Structure</em>'.
	 * @see org.eclipse.eef.eef.EEFTableDescription#getTableStructure()
	 * @see #getEEFTableDescription()
	 * @generated
	 */
	EReference getEEFTableDescription_TableStructure();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFColumnDescription <em>EEF Column Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Column Description</em>'.
	 * @see org.eclipse.eef.eef.EEFColumnDescription
	 * @generated
	 */
	EClass getEEFColumnDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFColumnDescription#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.eef.eef.EEFColumnDescription#getWidth()
	 * @see #getEEFColumnDescription()
	 * @generated
	 */
	EAttribute getEEFColumnDescription_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFColumnDescription#getHeaderExpression <em>Header Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFColumnDescription#getHeaderExpression()
	 * @see #getEEFColumnDescription()
	 * @generated
	 */
	EAttribute getEEFColumnDescription_HeaderExpression();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.eef.eef.EEFColumnDescription#getCellWidget <em>Cell Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cell Widget</em>'.
	 * @see org.eclipse.eef.eef.EEFColumnDescription#getCellWidget()
	 * @see #getEEFColumnDescription()
	 * @generated
	 */
	EReference getEEFColumnDescription_CellWidget();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFColumnDescription#getContextCandidatesExpression <em>Context Candidates Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Candidates Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFColumnDescription#getContextCandidatesExpression()
	 * @see #getEEFColumnDescription()
	 * @generated
	 */
	EAttribute getEEFColumnDescription_ContextCandidatesExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFLineDescription <em>EEF Line Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Line Description</em>'.
	 * @see org.eclipse.eef.eef.EEFLineDescription
	 * @generated
	 */
	EClass getEEFLineDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFLineDescription#getHeaderExpression <em>Header Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFLineDescription#getHeaderExpression()
	 * @see #getEEFLineDescription()
	 * @generated
	 */
	EAttribute getEEFLineDescription_HeaderExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFLineDescription#getSemanticCandidatesExpression <em>Semantic Candidates Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic Candidates Expression</em>'.
	 * @see org.eclipse.eef.eef.EEFLineDescription#getSemanticCandidatesExpression()
	 * @see #getEEFLineDescription()
	 * @generated
	 */
	EAttribute getEEFLineDescription_SemanticCandidatesExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFLineDescription#getDomainClass <em>Domain Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Class</em>'.
	 * @see org.eclipse.eef.eef.EEFLineDescription#getDomainClass()
	 * @see #getEEFLineDescription()
	 * @generated
	 */
	EAttribute getEEFLineDescription_DomainClass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.eef.EEFLineDescription#getSubLines <em>Sub Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Lines</em>'.
	 * @see org.eclipse.eef.eef.EEFLineDescription#getSubLines()
	 * @see #getEEFLineDescription()
	 * @generated
	 */
	EReference getEEFLineDescription_SubLines();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFTableStructureDescription <em>EEF Table Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Table Structure Description</em>'.
	 * @see org.eclipse.eef.eef.EEFTableStructureDescription
	 * @generated
	 */
	EClass getEEFTableStructureDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFTableStructureDescription#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see org.eclipse.eef.eef.EEFTableStructureDescription#isMultiple()
	 * @see #getEEFTableStructureDescription()
	 * @generated
	 */
	EAttribute getEEFTableStructureDescription_Multiple();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFTableStructureDescription#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.eef.eef.EEFTableStructureDescription#getIdentifier()
	 * @see #getEEFTableStructureDescription()
	 * @generated
	 */
	EAttribute getEEFTableStructureDescription_Identifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.EEFAdapterFactoryTableStructureDescription <em>EEF Adapter Factory Table Structure Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEF Adapter Factory Table Structure Description</em>'.
	 * @see org.eclipse.eef.eef.EEFAdapterFactoryTableStructureDescription
	 * @generated
	 */
	EClass getEEFAdapterFactoryTableStructureDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.eef.eef.EEFAdapterFactoryTableStructureDescription#getAdapterFactoryProvider <em>Adapter Factory Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter Factory Provider</em>'.
	 * @see org.eclipse.eef.eef.EEFAdapterFactoryTableStructureDescription#getAdapterFactoryProvider()
	 * @see #getEEFAdapterFactoryTableStructureDescription()
	 * @generated
	 */
	EAttribute getEEFAdapterFactoryTableStructureDescription_AdapterFactoryProvider();

	/**
	 * Returns the meta object for class '{@link org.eclipse.eef.eef.ContextableElement <em>Contextable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contextable Element</em>'.
	 * @see org.eclipse.eef.eef.ContextableElement
	 * @generated
	 */
	EClass getContextableElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.eef.ContextableElement#getRequiredContextVariables <em>Required Context Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Context Variables</em>'.
	 * @see org.eclipse.eef.eef.ContextableElement#getRequiredContextVariables()
	 * @see #getContextableElement()
	 * @generated
	 */
	EReference getContextableElement_RequiredContextVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.eef.eef.ContextableElement#getExcludedContextVariables <em>Excluded Context Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Excluded Context Variables</em>'.
	 * @see org.eclipse.eef.eef.ContextableElement#getExcludedContextVariables()
	 * @see #getContextableElement()
	 * @generated
	 */
	EReference getContextableElement_ExcludedContextVariables();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Expression</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getExpression();

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
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFViewDescriptionImpl <em>EEF View Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFViewDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFViewDescription()
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
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFPageDescriptionImpl <em>EEF Page Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFPageDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFPageDescription()
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
		EAttribute EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION = eINSTANCE
				.getEEFPageDescription_SemanticCandidateExpression();

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
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFGroupDescriptionImpl <em>EEF Group Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFGroupDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFGroupDescription()
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
		 * The meta object literal for the '<em><b>Semantic Candidates Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_GROUP_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION = eINSTANCE
				.getEEFGroupDescription_SemanticCandidatesExpression();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_GROUP_DESCRIPTION__CONTAINER = eINSTANCE.getEEFGroupDescription_Container();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFContainerDescriptionImpl <em>EEF Container Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFContainerDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFContainerDescription()
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
		 * The meta object literal for the '<em><b>Semantic Candidates Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_CONTAINER_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION = eINSTANCE
				.getEEFContainerDescription_SemanticCandidatesExpression();

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
		EAttribute EEF_CONTAINER_DESCRIPTION__LAYOUT_COLUMN_COUNT = eINSTANCE
				.getEEFContainerDescription_LayoutColumnCount();

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
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFWidgetDescriptionImpl <em>EEF Widget Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFWidgetDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFWidgetDescription()
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
		 * The meta object literal for the '<em><b>Label Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_WIDGET_DESCRIPTION__LABEL_EXPRESSION = eINSTANCE.getEEFWidgetDescription_LabelExpression();

		/**
		 * The meta object literal for the '<em><b>Feature Candidates Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_WIDGET_DESCRIPTION__FEATURE_CANDIDATES_EXPRESSION = eINSTANCE
				.getEEFWidgetDescription_FeatureCandidatesExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFJavaExtensionDescriptionImpl <em>EEF Java Extension Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFJavaExtensionDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFJavaExtensionDescription()
		 * @generated
		 */
		EClass EEF_JAVA_EXTENSION_DESCRIPTION = eINSTANCE.getEEFJavaExtensionDescription();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_JAVA_EXTENSION_DESCRIPTION__QUALIFIED_NAME = eINSTANCE
				.getEEFJavaExtensionDescription_QualifiedName();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFTreeStructureDescriptionImpl <em>EEF Tree Structure Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFTreeStructureDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFTreeStructureDescription()
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
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFInterpretedTableStructureDescriptionImpl <em>EEF Interpreted Table Structure Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFInterpretedTableStructureDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFInterpretedTableStructureDescription()
		 * @generated
		 */
		EClass EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION = eINSTANCE.getEEFInterpretedTableStructureDescription();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__COLUMNS = eINSTANCE
				.getEEFInterpretedTableStructureDescription_Columns();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__LINE = eINSTANCE
				.getEEFInterpretedTableStructureDescription_Line();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFCellWidgetDescriptionImpl <em>EEF Cell Widget Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFCellWidgetDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFCellWidgetDescription()
		 * @generated
		 */
		EClass EEF_CELL_WIDGET_DESCRIPTION = eINSTANCE.getEEFCellWidgetDescription();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFAdapterFactoryTreeStructureDescriptionImpl <em>EEF Adapter Factory Tree Structure Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFAdapterFactoryTreeStructureDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFAdapterFactoryTreeStructureDescription()
		 * @generated
		 */
		EClass EEF_ADAPTER_FACTORY_TREE_STRUCTURE_DESCRIPTION = eINSTANCE
				.getEEFAdapterFactoryTreeStructureDescription();

		/**
		 * The meta object literal for the '<em><b>Adapter Factory Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_ADAPTER_FACTORY_TREE_STRUCTURE_DESCRIPTION__ADAPTER_FACTORY_PROVIDER = eINSTANCE
				.getEEFAdapterFactoryTreeStructureDescription_AdapterFactoryProvider();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFInterpretedTreeStructureDescriptionImpl <em>EEF Interpreted Tree Structure Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFInterpretedTreeStructureDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFInterpretedTreeStructureDescription()
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
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFTextDescriptionImpl <em>EEF Text Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFTextDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFTextDescription()
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
		 * The meta object literal for the '<em><b>Line Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TEXT_DESCRIPTION__LINE_COUNT = eINSTANCE.getEEFTextDescription_LineCount();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFCheckboxDescriptionImpl <em>EEF Checkbox Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFCheckboxDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFCheckboxDescription()
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
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFSelectDescriptionImpl <em>EEF Select Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFSelectDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFSelectDescription()
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
		EAttribute EEF_SELECT_DESCRIPTION__CANDIDATES_EXPRESSION = eINSTANCE
				.getEEFSelectDescription_CandidatesExpression();

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
		EAttribute EEF_SELECT_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION = eINSTANCE
				.getEEFSelectDescription_CandidateDisplayExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFLabelDescriptionImpl <em>EEF Label Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFLabelDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFLabelDescription()
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
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFRadioDescriptionImpl <em>EEF Radio Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFRadioDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFRadioDescription()
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
		EAttribute EEF_RADIO_DESCRIPTION__CANDIDATES_EXPRESSION = eINSTANCE
				.getEEFRadioDescription_CandidatesExpression();

		/**
		 * The meta object literal for the '<em><b>Candidate Display Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_RADIO_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION = eINSTANCE
				.getEEFRadioDescription_CandidateDisplayExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFTreeDialogSelectDescriptionImpl <em>EEF Tree Dialog Select Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFTreeDialogSelectDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFTreeDialogSelectDescription()
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
		EAttribute EEF_TREE_DIALOG_SELECT_DESCRIPTION__DEFAULT_FILTER = eINSTANCE
				.getEEFTreeDialogSelectDescription_DefaultFilter();

		/**
		 * The meta object literal for the '<em><b>Domain Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_TREE_DIALOG_SELECT_DESCRIPTION__DOMAIN_CLASS = eINSTANCE
				.getEEFTreeDialogSelectDescription_DomainClass();

		/**
		 * The meta object literal for the '<em><b>Tree</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEF_TREE_DIALOG_SELECT_DESCRIPTION__TREE = eINSTANCE.getEEFTreeDialogSelectDescription_Tree();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFLinkDescriptionImpl <em>EEF Link Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFLinkDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFLinkDescription()
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
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFImageDescriptionImpl <em>EEF Image Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFImageDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFImageDescription()
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
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFTreeDescriptionImpl <em>EEF Tree Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFTreeDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFTreeDescription()
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
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFImagePickerDescriptionImpl <em>EEF Image Picker Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFImagePickerDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFImagePickerDescription()
		 * @generated
		 */
		EClass EEF_IMAGE_PICKER_DESCRIPTION = eINSTANCE.getEEFImagePickerDescription();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_IMAGE_PICKER_DESCRIPTION__VALUE_EXPRESSION = eINSTANCE
				.getEEFImagePickerDescription_ValueExpression();

		/**
		 * The meta object literal for the '<em><b>Edit Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_IMAGE_PICKER_DESCRIPTION__EDIT_EXPRESSION = eINSTANCE
				.getEEFImagePickerDescription_EditExpression();

		/**
		 * The meta object literal for the '<em><b>Candidates Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_IMAGE_PICKER_DESCRIPTION__CANDIDATES_EXPRESSION = eINSTANCE
				.getEEFImagePickerDescription_CandidatesExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFTableDescriptionImpl <em>EEF Table Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFTableDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFTableDescription()
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
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFColumnDescriptionImpl <em>EEF Column Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFColumnDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFColumnDescription()
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
		 * The meta object literal for the '<em><b>Context Candidates Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_COLUMN_DESCRIPTION__CONTEXT_CANDIDATES_EXPRESSION = eINSTANCE
				.getEEFColumnDescription_ContextCandidatesExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFLineDescriptionImpl <em>EEF Line Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFLineDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFLineDescription()
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
		EAttribute EEF_LINE_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION = eINSTANCE
				.getEEFLineDescription_SemanticCandidatesExpression();

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
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFTableStructureDescriptionImpl <em>EEF Table Structure Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFTableStructureDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFTableStructureDescription()
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
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.EEFAdapterFactoryTableStructureDescriptionImpl <em>EEF Adapter Factory Table Structure Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.EEFAdapterFactoryTableStructureDescriptionImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getEEFAdapterFactoryTableStructureDescription()
		 * @generated
		 */
		EClass EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION = eINSTANCE
				.getEEFAdapterFactoryTableStructureDescription();

		/**
		 * The meta object literal for the '<em><b>Adapter Factory Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEF_ADAPTER_FACTORY_TABLE_STRUCTURE_DESCRIPTION__ADAPTER_FACTORY_PROVIDER = eINSTANCE
				.getEEFAdapterFactoryTableStructureDescription_AdapterFactoryProvider();

		/**
		 * The meta object literal for the '{@link org.eclipse.eef.eef.impl.ContextableElementImpl <em>Contextable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.eef.eef.impl.ContextableElementImpl
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getContextableElement()
		 * @generated
		 */
		EClass CONTEXTABLE_ELEMENT = eINSTANCE.getContextableElement();

		/**
		 * The meta object literal for the '<em><b>Required Context Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXTABLE_ELEMENT__REQUIRED_CONTEXT_VARIABLES = eINSTANCE
				.getContextableElement_RequiredContextVariables();

		/**
		 * The meta object literal for the '<em><b>Excluded Context Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXTABLE_ELEMENT__EXCLUDED_CONTEXT_VARIABLES = eINSTANCE
				.getContextableElement_ExcludedContextVariables();

		/**
		 * The meta object literal for the '<em>Expression</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getExpression()
		 * @generated
		 */
		EDataType EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em>Type Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.eef.eef.impl.EefPackageImpl#getTypeName()
		 * @generated
		 */
		EDataType TYPE_NAME = eINSTANCE.getTypeName();

	}

} //EefPackage
