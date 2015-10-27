/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import org.eclipse.eef.EEFTableStructureDescription;
import org.eclipse.eef.EefPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Table Structure Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.impl.EEFTableStructureDescriptionImpl#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFTableStructureDescriptionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFTableStructureDescriptionImpl#getAddExpression <em>Add Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFTableStructureDescriptionImpl#getRemoveExpression <em>Remove Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFTableStructureDescriptionImpl#getUpExpression <em>Up Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFTableStructureDescriptionImpl#getDownExpression <em>Down Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EEFTableStructureDescriptionImpl extends MinimalEObjectImpl.Container implements EEFTableStructureDescription {
	/**
	 * The default value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiple()
	 * @generated
	 * @ordered
	 */
	protected boolean multiple = MULTIPLE_EDEFAULT;

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
	 * The default value of the '{@link #getAddExpression() <em>Add Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String ADD_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddExpression() <em>Add Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddExpression()
	 * @generated
	 * @ordered
	 */
	protected String addExpression = ADD_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoveExpression() <em>Remove Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOVE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoveExpression() <em>Remove Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveExpression()
	 * @generated
	 * @ordered
	 */
	protected String removeExpression = REMOVE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpExpression() <em>Up Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String UP_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpExpression() <em>Up Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpExpression()
	 * @generated
	 * @ordered
	 */
	protected String upExpression = UP_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDownExpression() <em>Down Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String DOWN_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDownExpression() <em>Down Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownExpression()
	 * @generated
	 * @ordered
	 */
	protected String downExpression = DOWN_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFTableStructureDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_TABLE_STRUCTURE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMultiple() {
		return multiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiple(boolean newMultiple) {
		boolean oldMultiple = multiple;
		multiple = newMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__MULTIPLE, oldMultiple, multiple));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddExpression() {
		return addExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddExpression(String newAddExpression) {
		String oldAddExpression = addExpression;
		addExpression = newAddExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__ADD_EXPRESSION, oldAddExpression,
					addExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemoveExpression() {
		return removeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoveExpression(String newRemoveExpression) {
		String oldRemoveExpression = removeExpression;
		removeExpression = newRemoveExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__REMOVE_EXPRESSION, oldRemoveExpression,
					removeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUpExpression() {
		return upExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpExpression(String newUpExpression) {
		String oldUpExpression = upExpression;
		upExpression = newUpExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__UP_EXPRESSION, oldUpExpression,
					upExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDownExpression() {
		return downExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDownExpression(String newDownExpression) {
		String oldDownExpression = downExpression;
		downExpression = newDownExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__DOWN_EXPRESSION, oldDownExpression,
					downExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__MULTIPLE:
			return isMultiple();
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__IDENTIFIER:
			return getIdentifier();
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__ADD_EXPRESSION:
			return getAddExpression();
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__REMOVE_EXPRESSION:
			return getRemoveExpression();
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__UP_EXPRESSION:
			return getUpExpression();
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__DOWN_EXPRESSION:
			return getDownExpression();
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
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__MULTIPLE:
			setMultiple((Boolean) newValue);
			return;
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__ADD_EXPRESSION:
			setAddExpression((String) newValue);
			return;
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__REMOVE_EXPRESSION:
			setRemoveExpression((String) newValue);
			return;
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__UP_EXPRESSION:
			setUpExpression((String) newValue);
			return;
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__DOWN_EXPRESSION:
			setDownExpression((String) newValue);
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
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__MULTIPLE:
			setMultiple(MULTIPLE_EDEFAULT);
			return;
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__ADD_EXPRESSION:
			setAddExpression(ADD_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__REMOVE_EXPRESSION:
			setRemoveExpression(REMOVE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__UP_EXPRESSION:
			setUpExpression(UP_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__DOWN_EXPRESSION:
			setDownExpression(DOWN_EXPRESSION_EDEFAULT);
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
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__MULTIPLE:
			return multiple != MULTIPLE_EDEFAULT;
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__ADD_EXPRESSION:
			return ADD_EXPRESSION_EDEFAULT == null ? addExpression != null : !ADD_EXPRESSION_EDEFAULT.equals(addExpression);
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__REMOVE_EXPRESSION:
			return REMOVE_EXPRESSION_EDEFAULT == null ? removeExpression != null : !REMOVE_EXPRESSION_EDEFAULT.equals(removeExpression);
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__UP_EXPRESSION:
			return UP_EXPRESSION_EDEFAULT == null ? upExpression != null : !UP_EXPRESSION_EDEFAULT.equals(upExpression);
		case EefPackage.EEF_TABLE_STRUCTURE_DESCRIPTION__DOWN_EXPRESSION:
			return DOWN_EXPRESSION_EDEFAULT == null ? downExpression != null : !DOWN_EXPRESSION_EDEFAULT.equals(downExpression);
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
		result.append(" (multiple: "); //$NON-NLS-1$
		result.append(multiple);
		result.append(", identifier: "); //$NON-NLS-1$
		result.append(identifier);
		result.append(", addExpression: "); //$NON-NLS-1$
		result.append(addExpression);
		result.append(", removeExpression: "); //$NON-NLS-1$
		result.append(removeExpression);
		result.append(", upExpression: "); //$NON-NLS-1$
		result.append(upExpression);
		result.append(", downExpression: "); //$NON-NLS-1$
		result.append(downExpression);
		result.append(')');
		return result.toString();
	}

} //EEFTableStructureDescriptionImpl
