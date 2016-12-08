/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import java.util.Collection;

import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFPageDescription;
import org.eclipse.eef.EEFSemanticValidationRuleDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Page Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.impl.EEFPageDescriptionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFPageDescriptionImpl#getLabelExpression <em>Label Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFPageDescriptionImpl#getDomainClass <em>Domain Class</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFPageDescriptionImpl#getSemanticCandidateExpression <em>Semantic Candidate Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFPageDescriptionImpl#getPreconditionExpression <em>Precondition Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFPageDescriptionImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFPageDescriptionImpl#getSemanticValidationRules <em>Semantic Validation Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFPageDescriptionImpl extends MinimalEObjectImpl.Container implements EEFPageDescription {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDomainClass()
	 * @generated
	 * @ordered
	 */
	protected String domainClass = DOMAIN_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemanticCandidateExpression() <em>Semantic Candidate Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSemanticCandidateExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getSemanticCandidateExpression() <em>Semantic Candidate Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSemanticCandidateExpression()
	 * @generated
	 * @ordered
	 */
	protected String semanticCandidateExpression = SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreconditionExpression() <em>Precondition Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getPreconditionExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDITION_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreconditionExpression() <em>Precondition Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getPreconditionExpression()
	 * @generated
	 * @ordered
	 */
	protected String preconditionExpression = PRECONDITION_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFGroupDescription> groups;

	/**
	 * The cached value of the '{@link #getSemanticValidationRules() <em>Semantic Validation Rules</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSemanticValidationRules()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFSemanticValidationRuleDescription> semanticValidationRules;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFPageDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_PAGE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_PAGE_DESCRIPTION__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabelExpression() {
		return labelExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelExpression(String newLabelExpression) {
		String oldLabelExpression = labelExpression;
		labelExpression = newLabelExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_PAGE_DESCRIPTION__LABEL_EXPRESSION, oldLabelExpression,
					labelExpression));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomainClass() {
		return domainClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainClass(String newDomainClass) {
		String oldDomainClass = domainClass;
		domainClass = newDomainClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_PAGE_DESCRIPTION__DOMAIN_CLASS, oldDomainClass, domainClass));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSemanticCandidateExpression() {
		return semanticCandidateExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemanticCandidateExpression(String newSemanticCandidateExpression) {
		String oldSemanticCandidateExpression = semanticCandidateExpression;
		semanticCandidateExpression = newSemanticCandidateExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION,
					oldSemanticCandidateExpression, semanticCandidateExpression));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreconditionExpression() {
		return preconditionExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreconditionExpression(String newPreconditionExpression) {
		String oldPreconditionExpression = preconditionExpression;
		preconditionExpression = newPreconditionExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_PAGE_DESCRIPTION__PRECONDITION_EXPRESSION, oldPreconditionExpression,
					preconditionExpression));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEFGroupDescription> getGroups() {
		if (groups == null) {
			groups = new EObjectResolvingEList<EEFGroupDescription>(EEFGroupDescription.class, this, EefPackage.EEF_PAGE_DESCRIPTION__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEFSemanticValidationRuleDescription> getSemanticValidationRules() {
		if (semanticValidationRules == null) {
			semanticValidationRules = new EObjectContainmentEList.Resolving<EEFSemanticValidationRuleDescription>(
					EEFSemanticValidationRuleDescription.class, this, EefPackage.EEF_PAGE_DESCRIPTION__SEMANTIC_VALIDATION_RULES);
		}
		return semanticValidationRules;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_PAGE_DESCRIPTION__SEMANTIC_VALIDATION_RULES:
			return ((InternalEList<?>) getSemanticValidationRules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		case EefPackage.EEF_PAGE_DESCRIPTION__PRECONDITION_EXPRESSION:
			return getPreconditionExpression();
		case EefPackage.EEF_PAGE_DESCRIPTION__GROUPS:
			return getGroups();
		case EefPackage.EEF_PAGE_DESCRIPTION__SEMANTIC_VALIDATION_RULES:
			return getSemanticValidationRules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		case EefPackage.EEF_PAGE_DESCRIPTION__PRECONDITION_EXPRESSION:
			setPreconditionExpression((String) newValue);
			return;
		case EefPackage.EEF_PAGE_DESCRIPTION__GROUPS:
			getGroups().clear();
			getGroups().addAll((Collection<? extends EEFGroupDescription>) newValue);
			return;
		case EefPackage.EEF_PAGE_DESCRIPTION__SEMANTIC_VALIDATION_RULES:
			getSemanticValidationRules().clear();
			getSemanticValidationRules().addAll((Collection<? extends EEFSemanticValidationRuleDescription>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		case EefPackage.EEF_PAGE_DESCRIPTION__PRECONDITION_EXPRESSION:
			setPreconditionExpression(PRECONDITION_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_PAGE_DESCRIPTION__GROUPS:
			getGroups().clear();
			return;
		case EefPackage.EEF_PAGE_DESCRIPTION__SEMANTIC_VALIDATION_RULES:
			getSemanticValidationRules().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EefPackage.EEF_PAGE_DESCRIPTION__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case EefPackage.EEF_PAGE_DESCRIPTION__LABEL_EXPRESSION:
			return LABEL_EXPRESSION_EDEFAULT == null ? labelExpression != null : !LABEL_EXPRESSION_EDEFAULT.equals(labelExpression);
		case EefPackage.EEF_PAGE_DESCRIPTION__DOMAIN_CLASS:
			return DOMAIN_CLASS_EDEFAULT == null ? domainClass != null : !DOMAIN_CLASS_EDEFAULT.equals(domainClass);
		case EefPackage.EEF_PAGE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION:
			return SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT == null ? semanticCandidateExpression != null
					: !SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT.equals(semanticCandidateExpression);
		case EefPackage.EEF_PAGE_DESCRIPTION__PRECONDITION_EXPRESSION:
			return PRECONDITION_EXPRESSION_EDEFAULT == null ? preconditionExpression != null
					: !PRECONDITION_EXPRESSION_EDEFAULT.equals(preconditionExpression);
		case EefPackage.EEF_PAGE_DESCRIPTION__GROUPS:
			return groups != null && !groups.isEmpty();
		case EefPackage.EEF_PAGE_DESCRIPTION__SEMANTIC_VALIDATION_RULES:
			return semanticValidationRules != null && !semanticValidationRules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		result.append(", preconditionExpression: "); //$NON-NLS-1$
		result.append(preconditionExpression);
		result.append(')');
		return result.toString();
	}

} // EEFPageDescriptionImpl