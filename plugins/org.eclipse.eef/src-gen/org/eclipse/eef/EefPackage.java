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
	 * The number of structural features of the '<em>EEF Container Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_CONTAINER_DESCRIPTION_FEATURE_COUNT = 2;

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
	 * The number of structural features of the '<em>EEF Text Description</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int EEF_TEXT_DESCRIPTION_FEATURE_COUNT = EefPackage.EEF_WIDGET_DESCRIPTION_FEATURE_COUNT + 2;

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

	}

} // EefPackage
