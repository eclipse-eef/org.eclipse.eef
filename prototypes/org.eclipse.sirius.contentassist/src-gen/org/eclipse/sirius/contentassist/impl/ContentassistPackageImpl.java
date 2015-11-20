/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.sirius.contentassist.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.contentassist.CompletionProposal;
import org.eclipse.sirius.contentassist.ContentassistFactory;
import org.eclipse.sirius.contentassist.ContentassistPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentassistPackageImpl extends EPackageImpl implements ContentassistPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completionProposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styledStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contentAssistImageEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.sirius.contentassist.ContentassistPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContentassistPackageImpl() {
		super(eNS_URI, ContentassistFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ContentassistPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContentassistPackage init() {
		if (isInited) return (ContentassistPackage)EPackage.Registry.INSTANCE.getEPackage(ContentassistPackage.eNS_URI);

		// Obtain or create and register package
		ContentassistPackageImpl theContentassistPackage = (ContentassistPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContentassistPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContentassistPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theContentassistPackage.createPackageContents();

		// Initialize created meta-data
		theContentassistPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContentassistPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContentassistPackage.eNS_URI, theContentassistPackage);
		return theContentassistPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompletionProposal() {
		return completionProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompletionProposal_Display() {
		return (EAttribute)completionProposalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompletionProposal_Proposal() {
		return (EAttribute)completionProposalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompletionProposal_Documentation() {
		return (EAttribute)completionProposalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompletionProposal_Image() {
		return (EAttribute)completionProposalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompletionProposal_CursorPosition() {
		return (EAttribute)completionProposalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompletionProposal_ReplacementOffset() {
		return (EAttribute)completionProposalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompletionProposal_ReplacementLength() {
		return (EAttribute)completionProposalEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyledString() {
		return styledStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContentAssistImage() {
		return contentAssistImageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentassistFactory getContentassistFactory() {
		return (ContentassistFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		completionProposalEClass = createEClass(COMPLETION_PROPOSAL);
		createEAttribute(completionProposalEClass, COMPLETION_PROPOSAL__DISPLAY);
		createEAttribute(completionProposalEClass, COMPLETION_PROPOSAL__PROPOSAL);
		createEAttribute(completionProposalEClass, COMPLETION_PROPOSAL__DOCUMENTATION);
		createEAttribute(completionProposalEClass, COMPLETION_PROPOSAL__IMAGE);
		createEAttribute(completionProposalEClass, COMPLETION_PROPOSAL__CURSOR_POSITION);
		createEAttribute(completionProposalEClass, COMPLETION_PROPOSAL__REPLACEMENT_OFFSET);
		createEAttribute(completionProposalEClass, COMPLETION_PROPOSAL__REPLACEMENT_LENGTH);

		// Create data types
		styledStringEDataType = createEDataType(STYLED_STRING);
		contentAssistImageEDataType = createEDataType(CONTENT_ASSIST_IMAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(completionProposalEClass, CompletionProposal.class, "CompletionProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompletionProposal_Display(), this.getStyledString(), "display", null, 0, 1, CompletionProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompletionProposal_Proposal(), ecorePackage.getEString(), "proposal", null, 0, 1, CompletionProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompletionProposal_Documentation(), this.getStyledString(), "documentation", null, 0, 1, CompletionProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompletionProposal_Image(), this.getContentAssistImage(), "image", null, 0, 1, CompletionProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompletionProposal_CursorPosition(), ecorePackage.getEInt(), "cursorPosition", null, 0, 1, CompletionProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompletionProposal_ReplacementOffset(), ecorePackage.getEInt(), "replacementOffset", null, 0, 1, CompletionProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompletionProposal_ReplacementLength(), ecorePackage.getEInt(), "replacementLength", null, 0, 1, CompletionProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(styledStringEDataType, Object.class, "StyledString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(contentAssistImageEDataType, Object.class, "ContentAssistImage", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ContentassistPackageImpl
