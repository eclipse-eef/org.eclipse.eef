/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef.impl;

import org.eclipse.eef.eef.EEFTreeDescription;
import org.eclipse.eef.eef.EEFTreeDialogSelectDescription;
import org.eclipse.eef.eef.EefPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Tree Dialog Select Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFTreeDialogSelectDescriptionImpl#getSemanticCandidateExpression <em>Semantic Candidate Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFTreeDialogSelectDescriptionImpl#getDefaultFilter <em>Default Filter</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFTreeDialogSelectDescriptionImpl#getDomainClass <em>Domain Class</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFTreeDialogSelectDescriptionImpl#getTree <em>Tree</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFTreeDialogSelectDescriptionImpl extends EEFCellWidgetDescriptionImpl
		implements EEFTreeDialogSelectDescription {
	/**
	 * The default value of the '{@link #getSemanticCandidateExpression() <em>Semantic Candidate Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticCandidateExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticCandidateExpression() <em>Semantic Candidate Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticCandidateExpression()
	 * @generated
	 * @ordered
	 */
	protected String semanticCandidateExpression = SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultFilter() <em>Default Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_FILTER_EDEFAULT = "*"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getDefaultFilter() <em>Default Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFilter()
	 * @generated
	 * @ordered
	 */
	protected String defaultFilter = DEFAULT_FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainClass() <em>Domain Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainClass() <em>Domain Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainClass()
	 * @generated
	 * @ordered
	 */
	protected String domainClass = DOMAIN_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTree() <em>Tree</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTree()
	 * @generated
	 * @ordered
	 */
	protected EEFTreeDescription tree;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFTreeDialogSelectDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_TREE_DIALOG_SELECT_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSemanticCandidateExpression() {
		return semanticCandidateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemanticCandidateExpression(String newSemanticCandidateExpression) {
		String oldSemanticCandidateExpression = semanticCandidateExpression;
		semanticCandidateExpression = newSemanticCandidateExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION,
					oldSemanticCandidateExpression, semanticCandidateExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultFilter() {
		return defaultFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultFilter(String newDefaultFilter) {
		String oldDefaultFilter = defaultFilter;
		defaultFilter = newDefaultFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__DEFAULT_FILTER, oldDefaultFilter, defaultFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomainClass() {
		return domainClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainClass(String newDomainClass) {
		String oldDomainClass = domainClass;
		domainClass = newDomainClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__DOMAIN_CLASS, oldDomainClass, domainClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFTreeDescription getTree() {
		if (tree != null && tree.eIsProxy()) {
			InternalEObject oldTree = (InternalEObject) tree;
			tree = (EEFTreeDescription) eResolveProxy(oldTree);
			if (tree != oldTree) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__TREE, oldTree, tree));
			}
		}
		return tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFTreeDescription basicGetTree() {
		return tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTree(EEFTreeDescription newTree) {
		EEFTreeDescription oldTree = tree;
		tree = newTree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__TREE,
					oldTree, tree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION:
			return getSemanticCandidateExpression();
		case EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__DEFAULT_FILTER:
			return getDefaultFilter();
		case EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__DOMAIN_CLASS:
			return getDomainClass();
		case EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__TREE:
			if (resolve)
				return getTree();
			return basicGetTree();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION:
			setSemanticCandidateExpression((String) newValue);
			return;
		case EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__DEFAULT_FILTER:
			setDefaultFilter((String) newValue);
			return;
		case EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__DOMAIN_CLASS:
			setDomainClass((String) newValue);
			return;
		case EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__TREE:
			setTree((EEFTreeDescription) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION:
			setSemanticCandidateExpression(SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__DEFAULT_FILTER:
			setDefaultFilter(DEFAULT_FILTER_EDEFAULT);
			return;
		case EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__DOMAIN_CLASS:
			setDomainClass(DOMAIN_CLASS_EDEFAULT);
			return;
		case EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__TREE:
			setTree((EEFTreeDescription) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION:
			return SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT == null ? semanticCandidateExpression != null
					: !SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT.equals(semanticCandidateExpression);
		case EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__DEFAULT_FILTER:
			return DEFAULT_FILTER_EDEFAULT == null ? defaultFilter != null
					: !DEFAULT_FILTER_EDEFAULT.equals(defaultFilter);
		case EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__DOMAIN_CLASS:
			return DOMAIN_CLASS_EDEFAULT == null ? domainClass != null : !DOMAIN_CLASS_EDEFAULT.equals(domainClass);
		case EefPackage.EEF_TREE_DIALOG_SELECT_DESCRIPTION__TREE:
			return tree != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (semanticCandidateExpression: "); //$NON-NLS-1$
		result.append(semanticCandidateExpression);
		result.append(", defaultFilter: "); //$NON-NLS-1$
		result.append(defaultFilter);
		result.append(", domainClass: "); //$NON-NLS-1$
		result.append(domainClass);
		result.append(')');
		return result.toString();
	}

} //EEFTreeDialogSelectDescriptionImpl
