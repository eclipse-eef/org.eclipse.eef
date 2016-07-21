/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl;

import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EefExtWidgetsReferencePackage;
import org.eclipse.eef.impl.EEFWidgetDescriptionImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Ext Reference Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceDescriptionImpl#getReferenceNameExpression
 * <em>Reference Name Expression</em>}</li>
 * <li>
 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceDescriptionImpl#getSemanticCandidateExpression
 * <em>Semantic Candidate Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEFExtReferenceDescriptionImpl extends EEFWidgetDescriptionImpl implements EEFExtReferenceDescription {
	/**
	 * The default value of the '{@link #getReferenceNameExpression() <em>Reference Name Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReferenceNameExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NAME_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceNameExpression() <em>Reference Name Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getReferenceNameExpression()
	 * @generated
	 * @ordered
	 */
	protected String referenceNameExpression = EEFExtReferenceDescriptionImpl.REFERENCE_NAME_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemanticCandidateExpression() <em>Semantic Candidate Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSemanticCandidateExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticCandidateExpression() <em>Semantic Candidate Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSemanticCandidateExpression()
	 * @generated
	 * @ordered
	 */
	protected String semanticCandidateExpression = EEFExtReferenceDescriptionImpl.SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFExtReferenceDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefExtWidgetsReferencePackage.Literals.EEF_EXT_REFERENCE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getReferenceNameExpression() {
		return referenceNameExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setReferenceNameExpression(String newReferenceNameExpression) {
		String oldReferenceNameExpression = referenceNameExpression;
		referenceNameExpression = newReferenceNameExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_NAME_EXPRESSION, oldReferenceNameExpression,
					referenceNameExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getSemanticCandidateExpression() {
		return semanticCandidateExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSemanticCandidateExpression(String newSemanticCandidateExpression) {
		String oldSemanticCandidateExpression = semanticCandidateExpression;
		semanticCandidateExpression = newSemanticCandidateExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION, oldSemanticCandidateExpression,
					semanticCandidateExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_NAME_EXPRESSION:
			return getReferenceNameExpression();
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION:
			return getSemanticCandidateExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_NAME_EXPRESSION:
			setReferenceNameExpression((String) newValue);
			return;
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION:
			setSemanticCandidateExpression((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_NAME_EXPRESSION:
			setReferenceNameExpression(EEFExtReferenceDescriptionImpl.REFERENCE_NAME_EXPRESSION_EDEFAULT);
			return;
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION:
			setSemanticCandidateExpression(EEFExtReferenceDescriptionImpl.SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_NAME_EXPRESSION:
			return EEFExtReferenceDescriptionImpl.REFERENCE_NAME_EXPRESSION_EDEFAULT == null ? referenceNameExpression != null
					: !EEFExtReferenceDescriptionImpl.REFERENCE_NAME_EXPRESSION_EDEFAULT.equals(referenceNameExpression);
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION:
			return EEFExtReferenceDescriptionImpl.SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT == null ? semanticCandidateExpression != null
					: !EEFExtReferenceDescriptionImpl.SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT.equals(semanticCandidateExpression);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (referenceNameExpression: "); //$NON-NLS-1$
		result.append(referenceNameExpression);
		result.append(", semanticCandidateExpression: "); //$NON-NLS-1$
		result.append(semanticCandidateExpression);
		result.append(')');
		return result.toString();
	}

} // EEFExtReferenceDescriptionImpl
