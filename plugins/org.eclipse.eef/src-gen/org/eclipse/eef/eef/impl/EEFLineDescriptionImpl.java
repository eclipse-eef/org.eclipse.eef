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

import org.eclipse.eef.eef.EEFLineDescription;
import org.eclipse.eef.eef.EefPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Line Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFLineDescriptionImpl#getHeaderExpression <em>Header Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFLineDescriptionImpl#getSemanticCandidatesExpression <em>Semantic Candidates Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFLineDescriptionImpl#getDomainClass <em>Domain Class</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFLineDescriptionImpl#getSubLines <em>Sub Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFLineDescriptionImpl extends MinimalEObjectImpl.Container implements EEFLineDescription {
	/**
	 * The default value of the '{@link #getHeaderExpression() <em>Header Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaderExpression() <em>Header Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderExpression()
	 * @generated
	 * @ordered
	 */
	protected String headerExpression = HEADER_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemanticCandidatesExpression() <em>Semantic Candidates Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticCandidatesExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_CANDIDATES_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticCandidatesExpression() <em>Semantic Candidates Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticCandidatesExpression()
	 * @generated
	 * @ordered
	 */
	protected String semanticCandidatesExpression = SEMANTIC_CANDIDATES_EXPRESSION_EDEFAULT;

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
	 * The cached value of the '{@link #getSubLines() <em>Sub Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubLines()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFLineDescription> subLines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFLineDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_LINE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeaderExpression() {
		return headerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderExpression(String newHeaderExpression) {
		String oldHeaderExpression = headerExpression;
		headerExpression = newHeaderExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_LINE_DESCRIPTION__HEADER_EXPRESSION,
					oldHeaderExpression, headerExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSemanticCandidatesExpression() {
		return semanticCandidatesExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemanticCandidatesExpression(String newSemanticCandidatesExpression) {
		String oldSemanticCandidatesExpression = semanticCandidatesExpression;
		semanticCandidatesExpression = newSemanticCandidatesExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefPackage.EEF_LINE_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION, oldSemanticCandidatesExpression,
					semanticCandidatesExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_LINE_DESCRIPTION__DOMAIN_CLASS,
					oldDomainClass, domainClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEFLineDescription> getSubLines() {
		if (subLines == null) {
			subLines = new EObjectContainmentEList.Resolving<EEFLineDescription>(EEFLineDescription.class, this,
					EefPackage.EEF_LINE_DESCRIPTION__SUB_LINES);
		}
		return subLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_LINE_DESCRIPTION__SUB_LINES:
			return ((InternalEList<?>) getSubLines()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.EEF_LINE_DESCRIPTION__HEADER_EXPRESSION:
			return getHeaderExpression();
		case EefPackage.EEF_LINE_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION:
			return getSemanticCandidatesExpression();
		case EefPackage.EEF_LINE_DESCRIPTION__DOMAIN_CLASS:
			return getDomainClass();
		case EefPackage.EEF_LINE_DESCRIPTION__SUB_LINES:
			return getSubLines();
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
		case EefPackage.EEF_LINE_DESCRIPTION__HEADER_EXPRESSION:
			setHeaderExpression((String) newValue);
			return;
		case EefPackage.EEF_LINE_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION:
			setSemanticCandidatesExpression((String) newValue);
			return;
		case EefPackage.EEF_LINE_DESCRIPTION__DOMAIN_CLASS:
			setDomainClass((String) newValue);
			return;
		case EefPackage.EEF_LINE_DESCRIPTION__SUB_LINES:
			getSubLines().clear();
			getSubLines().addAll((Collection<? extends EEFLineDescription>) newValue);
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
		case EefPackage.EEF_LINE_DESCRIPTION__HEADER_EXPRESSION:
			setHeaderExpression(HEADER_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_LINE_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION:
			setSemanticCandidatesExpression(SEMANTIC_CANDIDATES_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_LINE_DESCRIPTION__DOMAIN_CLASS:
			setDomainClass(DOMAIN_CLASS_EDEFAULT);
			return;
		case EefPackage.EEF_LINE_DESCRIPTION__SUB_LINES:
			getSubLines().clear();
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
		case EefPackage.EEF_LINE_DESCRIPTION__HEADER_EXPRESSION:
			return HEADER_EXPRESSION_EDEFAULT == null ? headerExpression != null
					: !HEADER_EXPRESSION_EDEFAULT.equals(headerExpression);
		case EefPackage.EEF_LINE_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION:
			return SEMANTIC_CANDIDATES_EXPRESSION_EDEFAULT == null ? semanticCandidatesExpression != null
					: !SEMANTIC_CANDIDATES_EXPRESSION_EDEFAULT.equals(semanticCandidatesExpression);
		case EefPackage.EEF_LINE_DESCRIPTION__DOMAIN_CLASS:
			return DOMAIN_CLASS_EDEFAULT == null ? domainClass != null : !DOMAIN_CLASS_EDEFAULT.equals(domainClass);
		case EefPackage.EEF_LINE_DESCRIPTION__SUB_LINES:
			return subLines != null && !subLines.isEmpty();
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
		result.append(" (headerExpression: "); //$NON-NLS-1$
		result.append(headerExpression);
		result.append(", semanticCandidatesExpression: "); //$NON-NLS-1$
		result.append(semanticCandidatesExpression);
		result.append(", domainClass: "); //$NON-NLS-1$
		result.append(domainClass);
		result.append(')');
		return result.toString();
	}

} //EEFLineDescriptionImpl
