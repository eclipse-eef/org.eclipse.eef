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
 * {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceDescriptionImpl#getReferenceName
 * <em>Reference Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEFExtReferenceDescriptionImpl extends EEFWidgetDescriptionImpl implements EEFExtReferenceDescription {
	/**
	 * The default value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected String referenceName = EEFExtReferenceDescriptionImpl.REFERENCE_NAME_EDEFAULT;

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
	public String getReferenceName() {
		return referenceName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setReferenceName(String newReferenceName) {
		String oldReferenceName = referenceName;
		referenceName = newReferenceName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_NAME,
					oldReferenceName, referenceName));
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
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_NAME:
			return getReferenceName();
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
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_NAME:
			setReferenceName((String) newValue);
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
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_NAME:
			setReferenceName(EEFExtReferenceDescriptionImpl.REFERENCE_NAME_EDEFAULT);
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
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_NAME:
			return EEFExtReferenceDescriptionImpl.REFERENCE_NAME_EDEFAULT == null ? referenceName != null
					: !EEFExtReferenceDescriptionImpl.REFERENCE_NAME_EDEFAULT.equals(referenceName);
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
		result.append(" (referenceName: "); //$NON-NLS-1$
		result.append(referenceName);
		result.append(')');
		return result.toString();
	}

} // EEFExtReferenceDescriptionImpl
