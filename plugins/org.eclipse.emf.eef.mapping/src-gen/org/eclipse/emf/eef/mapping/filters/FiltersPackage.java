/*******************************************************************************
 * Copyright (c) 2008, 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.mapping.filters;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.mapping.MappingPackage;

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
 * @see org.eclipse.emf.eef.mapping.filters.FiltersFactory
 * @model kind="package"
 * @generated
 */
public interface FiltersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "filters";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/eef/mapping/filters/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eef-mapping-filters";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FiltersPackage eINSTANCE = org.eclipse.emf.eef.mapping.filters.impl.FiltersPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.filters.impl.BindingFilterImpl <em>Binding Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.filters.impl.BindingFilterImpl
	 * @see org.eclipse.emf.eef.mapping.filters.impl.FiltersPackageImpl#getBindingFilter()
	 * @generated
	 */
	int BINDING_FILTER = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FILTER__DOCUMENTATION = MappingPackage.DOCUMENTED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FILTER__NAME = MappingPackage.DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FILTER__MANDATORY = MappingPackage.DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FILTER_FEATURE_COUNT = MappingPackage.DOCUMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.filters.impl.OCLFilterImpl <em>OCL Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.filters.impl.OCLFilterImpl
	 * @see org.eclipse.emf.eef.mapping.filters.impl.FiltersPackageImpl#getOCLFilter()
	 * @generated
	 */
	int OCL_FILTER = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FILTER__DOCUMENTATION = BINDING_FILTER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FILTER__NAME = BINDING_FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FILTER__MANDATORY = BINDING_FILTER__MANDATORY;

	/**
	 * The feature id for the '<em><b>OCL Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FILTER__OCL_BODY = BINDING_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FILTER_FEATURE_COUNT = BINDING_FILTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.filters.impl.JavaFilterImpl <em>Java Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.filters.impl.JavaFilterImpl
	 * @see org.eclipse.emf.eef.mapping.filters.impl.FiltersPackageImpl#getJavaFilter()
	 * @generated
	 */
	int JAVA_FILTER = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__DOCUMENTATION = BINDING_FILTER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__NAME = BINDING_FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER__MANDATORY = BINDING_FILTER__MANDATORY;

	/**
	 * The number of structural features of the '<em>Java Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FILTER_FEATURE_COUNT = BINDING_FILTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.filters.impl.JavaDeclarationFilterImpl <em>Java Declaration Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.filters.impl.JavaDeclarationFilterImpl
	 * @see org.eclipse.emf.eef.mapping.filters.impl.FiltersPackageImpl#getJavaDeclarationFilter()
	 * @generated
	 */
	int JAVA_DECLARATION_FILTER = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DECLARATION_FILTER__DOCUMENTATION = JAVA_FILTER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DECLARATION_FILTER__NAME = JAVA_FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DECLARATION_FILTER__MANDATORY = JAVA_FILTER__MANDATORY;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DECLARATION_FILTER__METHOD_NAME = JAVA_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Declaration Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DECLARATION_FILTER_FEATURE_COUNT = JAVA_FILTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.filters.impl.JavaExpressionFilterImpl <em>Java Expression Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.filters.impl.JavaExpressionFilterImpl
	 * @see org.eclipse.emf.eef.mapping.filters.impl.FiltersPackageImpl#getJavaExpressionFilter()
	 * @generated
	 */
	int JAVA_EXPRESSION_FILTER = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXPRESSION_FILTER__DOCUMENTATION = JAVA_FILTER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXPRESSION_FILTER__NAME = JAVA_FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXPRESSION_FILTER__MANDATORY = JAVA_FILTER__MANDATORY;

	/**
	 * The feature id for the '<em><b>Java Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXPRESSION_FILTER__JAVA_BODY = JAVA_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Expression Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXPRESSION_FILTER_FEATURE_COUNT = JAVA_FILTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.filters.impl.BusinessFilterImpl <em>Business Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.filters.impl.BusinessFilterImpl
	 * @see org.eclipse.emf.eef.mapping.filters.impl.FiltersPackageImpl#getBusinessFilter()
	 * @generated
	 */
	int BUSINESS_FILTER = 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_FILTER__DOCUMENTATION = BINDING_FILTER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_FILTER__NAME = BINDING_FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_FILTER__MANDATORY = BINDING_FILTER__MANDATORY;

	/**
	 * The number of structural features of the '<em>Business Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_FILTER_FEATURE_COUNT = BINDING_FILTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.eef.mapping.filters.impl.OnlyReferenceTypeFilterImpl <em>Only Reference Type Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.eef.mapping.filters.impl.OnlyReferenceTypeFilterImpl
	 * @see org.eclipse.emf.eef.mapping.filters.impl.FiltersPackageImpl#getOnlyReferenceTypeFilter()
	 * @generated
	 */
	int ONLY_REFERENCE_TYPE_FILTER = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_REFERENCE_TYPE_FILTER__DOCUMENTATION = BUSINESS_FILTER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_REFERENCE_TYPE_FILTER__NAME = BUSINESS_FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_REFERENCE_TYPE_FILTER__MANDATORY = BUSINESS_FILTER__MANDATORY;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_REFERENCE_TYPE_FILTER__REFERENCE = BUSINESS_FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Only Reference Type Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLY_REFERENCE_TYPE_FILTER_FEATURE_COUNT = BUSINESS_FILTER_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.filters.BindingFilter <em>Binding Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Filter</em>'.
	 * @see org.eclipse.emf.eef.mapping.filters.BindingFilter
	 * @generated
	 */
	EClass getBindingFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.mapping.filters.BindingFilter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.eef.mapping.filters.BindingFilter#getName()
	 * @see #getBindingFilter()
	 * @generated
	 */
	EAttribute getBindingFilter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.mapping.filters.BindingFilter#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see org.eclipse.emf.eef.mapping.filters.BindingFilter#isMandatory()
	 * @see #getBindingFilter()
	 * @generated
	 */
	EAttribute getBindingFilter_Mandatory();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.filters.OCLFilter <em>OCL Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Filter</em>'.
	 * @see org.eclipse.emf.eef.mapping.filters.OCLFilter
	 * @generated
	 */
	EClass getOCLFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.mapping.filters.OCLFilter#getOCLBody <em>OCL Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OCL Body</em>'.
	 * @see org.eclipse.emf.eef.mapping.filters.OCLFilter#getOCLBody()
	 * @see #getOCLFilter()
	 * @generated
	 */
	EAttribute getOCLFilter_OCLBody();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.filters.JavaFilter <em>Java Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Filter</em>'.
	 * @see org.eclipse.emf.eef.mapping.filters.JavaFilter
	 * @generated
	 */
	EClass getJavaFilter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.filters.JavaDeclarationFilter <em>Java Declaration Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Declaration Filter</em>'.
	 * @see org.eclipse.emf.eef.mapping.filters.JavaDeclarationFilter
	 * @generated
	 */
	EClass getJavaDeclarationFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.mapping.filters.JavaDeclarationFilter#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.eclipse.emf.eef.mapping.filters.JavaDeclarationFilter#getMethodName()
	 * @see #getJavaDeclarationFilter()
	 * @generated
	 */
	EAttribute getJavaDeclarationFilter_MethodName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.filters.JavaExpressionFilter <em>Java Expression Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Expression Filter</em>'.
	 * @see org.eclipse.emf.eef.mapping.filters.JavaExpressionFilter
	 * @generated
	 */
	EClass getJavaExpressionFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.eef.mapping.filters.JavaExpressionFilter#getJavaBody <em>Java Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Body</em>'.
	 * @see org.eclipse.emf.eef.mapping.filters.JavaExpressionFilter#getJavaBody()
	 * @see #getJavaExpressionFilter()
	 * @generated
	 */
	EAttribute getJavaExpressionFilter_JavaBody();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.filters.BusinessFilter <em>Business Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Filter</em>'.
	 * @see org.eclipse.emf.eef.mapping.filters.BusinessFilter
	 * @generated
	 */
	EClass getBusinessFilter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.eef.mapping.filters.OnlyReferenceTypeFilter <em>Only Reference Type Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Only Reference Type Filter</em>'.
	 * @see org.eclipse.emf.eef.mapping.filters.OnlyReferenceTypeFilter
	 * @generated
	 */
	EClass getOnlyReferenceTypeFilter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.eef.mapping.filters.OnlyReferenceTypeFilter#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.eclipse.emf.eef.mapping.filters.OnlyReferenceTypeFilter#getReference()
	 * @see #getOnlyReferenceTypeFilter()
	 * @generated
	 */
	EReference getOnlyReferenceTypeFilter_Reference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FiltersFactory getFiltersFactory();

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
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.filters.impl.BindingFilterImpl <em>Binding Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.filters.impl.BindingFilterImpl
		 * @see org.eclipse.emf.eef.mapping.filters.impl.FiltersPackageImpl#getBindingFilter()
		 * @generated
		 */
		EClass BINDING_FILTER = eINSTANCE.getBindingFilter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_FILTER__NAME = eINSTANCE.getBindingFilter_Name();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_FILTER__MANDATORY = eINSTANCE.getBindingFilter_Mandatory();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.filters.impl.OCLFilterImpl <em>OCL Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.filters.impl.OCLFilterImpl
		 * @see org.eclipse.emf.eef.mapping.filters.impl.FiltersPackageImpl#getOCLFilter()
		 * @generated
		 */
		EClass OCL_FILTER = eINSTANCE.getOCLFilter();

		/**
		 * The meta object literal for the '<em><b>OCL Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_FILTER__OCL_BODY = eINSTANCE.getOCLFilter_OCLBody();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.filters.impl.JavaFilterImpl <em>Java Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.filters.impl.JavaFilterImpl
		 * @see org.eclipse.emf.eef.mapping.filters.impl.FiltersPackageImpl#getJavaFilter()
		 * @generated
		 */
		EClass JAVA_FILTER = eINSTANCE.getJavaFilter();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.filters.impl.JavaDeclarationFilterImpl <em>Java Declaration Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.filters.impl.JavaDeclarationFilterImpl
		 * @see org.eclipse.emf.eef.mapping.filters.impl.FiltersPackageImpl#getJavaDeclarationFilter()
		 * @generated
		 */
		EClass JAVA_DECLARATION_FILTER = eINSTANCE.getJavaDeclarationFilter();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_DECLARATION_FILTER__METHOD_NAME = eINSTANCE.getJavaDeclarationFilter_MethodName();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.filters.impl.JavaExpressionFilterImpl <em>Java Expression Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.filters.impl.JavaExpressionFilterImpl
		 * @see org.eclipse.emf.eef.mapping.filters.impl.FiltersPackageImpl#getJavaExpressionFilter()
		 * @generated
		 */
		EClass JAVA_EXPRESSION_FILTER = eINSTANCE.getJavaExpressionFilter();

		/**
		 * The meta object literal for the '<em><b>Java Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_EXPRESSION_FILTER__JAVA_BODY = eINSTANCE.getJavaExpressionFilter_JavaBody();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.filters.impl.BusinessFilterImpl <em>Business Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.filters.impl.BusinessFilterImpl
		 * @see org.eclipse.emf.eef.mapping.filters.impl.FiltersPackageImpl#getBusinessFilter()
		 * @generated
		 */
		EClass BUSINESS_FILTER = eINSTANCE.getBusinessFilter();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.eef.mapping.filters.impl.OnlyReferenceTypeFilterImpl <em>Only Reference Type Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.eef.mapping.filters.impl.OnlyReferenceTypeFilterImpl
		 * @see org.eclipse.emf.eef.mapping.filters.impl.FiltersPackageImpl#getOnlyReferenceTypeFilter()
		 * @generated
		 */
		EClass ONLY_REFERENCE_TYPE_FILTER = eINSTANCE.getOnlyReferenceTypeFilter();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONLY_REFERENCE_TYPE_FILTER__REFERENCE = eINSTANCE.getOnlyReferenceTypeFilter_Reference();

	}

} //FiltersPackage
