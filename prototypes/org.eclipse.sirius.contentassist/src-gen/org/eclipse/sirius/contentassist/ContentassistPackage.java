/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.sirius.contentassist;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.contentassist.ContentassistFactory
 * @model kind="package"
 * @generated
 */
public interface ContentassistPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contentassist";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sirius/contentassist";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "contentassist";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContentassistPackage eINSTANCE = org.eclipse.sirius.contentassist.impl.ContentassistPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.contentassist.impl.CompletionProposalImpl <em>Completion Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.contentassist.impl.CompletionProposalImpl
	 * @see org.eclipse.sirius.contentassist.impl.ContentassistPackageImpl#getCompletionProposal()
	 * @generated
	 */
	int COMPLETION_PROPOSAL = 0;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_PROPOSAL__DISPLAY = 0;

	/**
	 * The feature id for the '<em><b>Proposal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_PROPOSAL__PROPOSAL = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_PROPOSAL__DOCUMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_PROPOSAL__IMAGE = 3;

	/**
	 * The feature id for the '<em><b>Cursor Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_PROPOSAL__CURSOR_POSITION = 4;

	/**
	 * The feature id for the '<em><b>Replacement Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_PROPOSAL__REPLACEMENT_OFFSET = 5;

	/**
	 * The feature id for the '<em><b>Replacement Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_PROPOSAL__REPLACEMENT_LENGTH = 6;

	/**
	 * The number of structural features of the '<em>Completion Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_PROPOSAL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Completion Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_PROPOSAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Styled String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.sirius.contentassist.impl.ContentassistPackageImpl#getStyledString()
	 * @generated
	 */
	int STYLED_STRING = 1;

	/**
	 * The meta object id for the '<em>Content Assist Image</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.sirius.contentassist.impl.ContentassistPackageImpl#getContentAssistImage()
	 * @generated
	 */
	int CONTENT_ASSIST_IMAGE = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.contentassist.CompletionProposal <em>Completion Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Completion Proposal</em>'.
	 * @see org.eclipse.sirius.contentassist.CompletionProposal
	 * @generated
	 */
	EClass getCompletionProposal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.contentassist.CompletionProposal#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.eclipse.sirius.contentassist.CompletionProposal#getDisplay()
	 * @see #getCompletionProposal()
	 * @generated
	 */
	EAttribute getCompletionProposal_Display();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.contentassist.CompletionProposal#getProposal <em>Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proposal</em>'.
	 * @see org.eclipse.sirius.contentassist.CompletionProposal#getProposal()
	 * @see #getCompletionProposal()
	 * @generated
	 */
	EAttribute getCompletionProposal_Proposal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.contentassist.CompletionProposal#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.eclipse.sirius.contentassist.CompletionProposal#getDocumentation()
	 * @see #getCompletionProposal()
	 * @generated
	 */
	EAttribute getCompletionProposal_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.contentassist.CompletionProposal#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.eclipse.sirius.contentassist.CompletionProposal#getImage()
	 * @see #getCompletionProposal()
	 * @generated
	 */
	EAttribute getCompletionProposal_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.contentassist.CompletionProposal#getCursorPosition <em>Cursor Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor Position</em>'.
	 * @see org.eclipse.sirius.contentassist.CompletionProposal#getCursorPosition()
	 * @see #getCompletionProposal()
	 * @generated
	 */
	EAttribute getCompletionProposal_CursorPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.contentassist.CompletionProposal#getReplacementOffset <em>Replacement Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replacement Offset</em>'.
	 * @see org.eclipse.sirius.contentassist.CompletionProposal#getReplacementOffset()
	 * @see #getCompletionProposal()
	 * @generated
	 */
	EAttribute getCompletionProposal_ReplacementOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.contentassist.CompletionProposal#getReplacementLength <em>Replacement Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replacement Length</em>'.
	 * @see org.eclipse.sirius.contentassist.CompletionProposal#getReplacementLength()
	 * @see #getCompletionProposal()
	 * @generated
	 */
	EAttribute getCompletionProposal_ReplacementLength();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Styled String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Styled String</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getStyledString();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Content Assist Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Content Assist Image</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getContentAssistImage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContentassistFactory getContentassistFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.contentassist.impl.CompletionProposalImpl <em>Completion Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.contentassist.impl.CompletionProposalImpl
		 * @see org.eclipse.sirius.contentassist.impl.ContentassistPackageImpl#getCompletionProposal()
		 * @generated
		 */
		EClass COMPLETION_PROPOSAL = eINSTANCE.getCompletionProposal();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETION_PROPOSAL__DISPLAY = eINSTANCE.getCompletionProposal_Display();

		/**
		 * The meta object literal for the '<em><b>Proposal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETION_PROPOSAL__PROPOSAL = eINSTANCE.getCompletionProposal_Proposal();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETION_PROPOSAL__DOCUMENTATION = eINSTANCE.getCompletionProposal_Documentation();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETION_PROPOSAL__IMAGE = eINSTANCE.getCompletionProposal_Image();

		/**
		 * The meta object literal for the '<em><b>Cursor Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETION_PROPOSAL__CURSOR_POSITION = eINSTANCE.getCompletionProposal_CursorPosition();

		/**
		 * The meta object literal for the '<em><b>Replacement Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETION_PROPOSAL__REPLACEMENT_OFFSET = eINSTANCE.getCompletionProposal_ReplacementOffset();

		/**
		 * The meta object literal for the '<em><b>Replacement Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETION_PROPOSAL__REPLACEMENT_LENGTH = eINSTANCE.getCompletionProposal_ReplacementLength();

		/**
		 * The meta object literal for the '<em>Styled String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.sirius.contentassist.impl.ContentassistPackageImpl#getStyledString()
		 * @generated
		 */
		EDataType STYLED_STRING = eINSTANCE.getStyledString();

		/**
		 * The meta object literal for the '<em>Content Assist Image</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.sirius.contentassist.impl.ContentassistPackageImpl#getContentAssistImage()
		 * @generated
		 */
		EDataType CONTENT_ASSIST_IMAGE = eINSTANCE.getContentAssistImage();

	}

} //ContentassistPackage
