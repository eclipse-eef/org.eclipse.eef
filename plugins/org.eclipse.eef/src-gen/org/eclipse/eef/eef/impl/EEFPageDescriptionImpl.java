/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef.impl;

import java.util.Collection;

import org.eclipse.eef.eef.EEFGroupDescription;
import org.eclipse.eef.eef.EEFPageDescription;
import org.eclipse.eef.eef.EefPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Page Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFPageDescriptionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFPageDescriptionImpl#getLabelExpression <em>Label Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFPageDescriptionImpl#getDomainClass <em>Domain Class</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFPageDescriptionImpl#getSemanticCandidateExpression <em>Semantic Candidate Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFPageDescriptionImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFPageDescriptionImpl#getExtendedPage <em>Extended Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFPageDescriptionImpl extends ContextableElementImpl implements EEFPageDescription {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected String labelExpression = LABEL_EXPRESSION_EDEFAULT;

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
	 * The default value of the '{@link #getSemanticCandidateExpression() <em>Semantic Candidate Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticCandidateExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT = ""; //$NON-NLS-1$

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
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFGroupDescription> groups;

	/**
	 * The cached value of the '{@link #getExtendedPage() <em>Extended Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedPage()
	 * @generated
	 * @ordered
	 */
	protected EEFPageDescription extendedPage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFPageDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_PAGE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_PAGE_DESCRIPTION__IDENTIFIER,
					oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabelExpression() {
		return labelExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelExpression(String newLabelExpression) {
		String oldLabelExpression = labelExpression;
		labelExpression = newLabelExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_PAGE_DESCRIPTION__LABEL_EXPRESSION,
					oldLabelExpression, labelExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_PAGE_DESCRIPTION__DOMAIN_CLASS,
					oldDomainClass, domainClass));
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
					EefPackage.EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION, oldSemanticCandidateExpression,
					semanticCandidateExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEFGroupDescription> getGroups() {
		if (groups == null) {
			groups = new EObjectResolvingEList<EEFGroupDescription>(EEFGroupDescription.class, this,
					EefPackage.EEF_PAGE_DESCRIPTION__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFPageDescription getExtendedPage() {
		if (extendedPage != null && extendedPage.eIsProxy()) {
			InternalEObject oldExtendedPage = (InternalEObject) extendedPage;
			extendedPage = (EEFPageDescription) eResolveProxy(oldExtendedPage);
			if (extendedPage != oldExtendedPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EefPackage.EEF_PAGE_DESCRIPTION__EXTENDED_PAGE, oldExtendedPage, extendedPage));
			}
		}
		return extendedPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFPageDescription basicGetExtendedPage() {
		return extendedPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtendedPage(EEFPageDescription newExtendedPage) {
		EEFPageDescription oldExtendedPage = extendedPage;
		extendedPage = newExtendedPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_PAGE_DESCRIPTION__EXTENDED_PAGE,
					oldExtendedPage, extendedPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.EEF_PAGE_DESCRIPTION__IDENTIFIER:
			return getIdentifier();
		case EefPackage.EEF_PAGE_DESCRIPTION__LABEL_EXPRESSION:
			return getLabelExpression();
		case EefPackage.EEF_PAGE_DESCRIPTION__DOMAIN_CLASS:
			return getDomainClass();
		case EefPackage.EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION:
			return getSemanticCandidateExpression();
		case EefPackage.EEF_PAGE_DESCRIPTION__GROUPS:
			return getGroups();
		case EefPackage.EEF_PAGE_DESCRIPTION__EXTENDED_PAGE:
			if (resolve)
				return getExtendedPage();
			return basicGetExtendedPage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EefPackage.EEF_PAGE_DESCRIPTION__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case EefPackage.EEF_PAGE_DESCRIPTION__LABEL_EXPRESSION:
			setLabelExpression((String) newValue);
			return;
		case EefPackage.EEF_PAGE_DESCRIPTION__DOMAIN_CLASS:
			setDomainClass((String) newValue);
			return;
		case EefPackage.EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION:
			setSemanticCandidateExpression((String) newValue);
			return;
		case EefPackage.EEF_PAGE_DESCRIPTION__GROUPS:
			getGroups().clear();
			getGroups().addAll((Collection<? extends EEFGroupDescription>) newValue);
			return;
		case EefPackage.EEF_PAGE_DESCRIPTION__EXTENDED_PAGE:
			setExtendedPage((EEFPageDescription) newValue);
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
		case EefPackage.EEF_PAGE_DESCRIPTION__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case EefPackage.EEF_PAGE_DESCRIPTION__LABEL_EXPRESSION:
			setLabelExpression(LABEL_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_PAGE_DESCRIPTION__DOMAIN_CLASS:
			setDomainClass(DOMAIN_CLASS_EDEFAULT);
			return;
		case EefPackage.EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION:
			setSemanticCandidateExpression(SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_PAGE_DESCRIPTION__GROUPS:
			getGroups().clear();
			return;
		case EefPackage.EEF_PAGE_DESCRIPTION__EXTENDED_PAGE:
			setExtendedPage((EEFPageDescription) null);
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
		case EefPackage.EEF_PAGE_DESCRIPTION__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case EefPackage.EEF_PAGE_DESCRIPTION__LABEL_EXPRESSION:
			return LABEL_EXPRESSION_EDEFAULT == null ? labelExpression != null
					: !LABEL_EXPRESSION_EDEFAULT.equals(labelExpression);
		case EefPackage.EEF_PAGE_DESCRIPTION__DOMAIN_CLASS:
			return DOMAIN_CLASS_EDEFAULT == null ? domainClass != null : !DOMAIN_CLASS_EDEFAULT.equals(domainClass);
		case EefPackage.EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION:
			return SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT == null ? semanticCandidateExpression != null
					: !SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT.equals(semanticCandidateExpression);
		case EefPackage.EEF_PAGE_DESCRIPTION__GROUPS:
			return groups != null && !groups.isEmpty();
		case EefPackage.EEF_PAGE_DESCRIPTION__EXTENDED_PAGE:
			return extendedPage != null;
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
		result.append(" (identifier: "); //$NON-NLS-1$
		result.append(identifier);
		result.append(", labelExpression: "); //$NON-NLS-1$
		result.append(labelExpression);
		result.append(", domainClass: "); //$NON-NLS-1$
		result.append(domainClass);
		result.append(", semanticCandidateExpression: "); //$NON-NLS-1$
		result.append(semanticCandidateExpression);
		result.append(')');
		return result.toString();
	}

} //EEFPageDescriptionImpl
