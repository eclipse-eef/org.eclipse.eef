/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef.impl;

import org.eclipse.eef.eef.EEFTableDescription;
import org.eclipse.eef.eef.EEFTableStructureDescription;
import org.eclipse.eef.eef.EefPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Table Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFTableDescriptionImpl#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFTableDescriptionImpl#getEditExpression <em>Edit Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFTableDescriptionImpl#getTableStructure <em>Table Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFTableDescriptionImpl extends EEFWidgetDescriptionImpl implements EEFTableDescription {
	/**
	 * The default value of the '{@link #getValueExpression() <em>Value Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueExpression() <em>Value Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueExpression()
	 * @generated
	 * @ordered
	 */
	protected String valueExpression = VALUE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditExpression() <em>Edit Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditExpression() <em>Edit Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditExpression()
	 * @generated
	 * @ordered
	 */
	protected String editExpression = EDIT_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTableStructure() <em>Table Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableStructure()
	 * @generated
	 * @ordered
	 */
	protected EEFTableStructureDescription tableStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFTableDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_TABLE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValueExpression() {
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueExpression(String newValueExpression) {
		String oldValueExpression = valueExpression;
		valueExpression = newValueExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TABLE_DESCRIPTION__VALUE_EXPRESSION,
					oldValueExpression, valueExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEditExpression() {
		return editExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEditExpression(String newEditExpression) {
		String oldEditExpression = editExpression;
		editExpression = newEditExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TABLE_DESCRIPTION__EDIT_EXPRESSION,
					oldEditExpression, editExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFTableStructureDescription getTableStructure() {
		if (tableStructure != null && tableStructure.eIsProxy()) {
			InternalEObject oldTableStructure = (InternalEObject) tableStructure;
			tableStructure = (EEFTableStructureDescription) eResolveProxy(oldTableStructure);
			if (tableStructure != oldTableStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EefPackage.EEF_TABLE_DESCRIPTION__TABLE_STRUCTURE, oldTableStructure, tableStructure));
			}
		}
		return tableStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFTableStructureDescription basicGetTableStructure() {
		return tableStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableStructure(EEFTableStructureDescription newTableStructure) {
		EEFTableStructureDescription oldTableStructure = tableStructure;
		tableStructure = newTableStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TABLE_DESCRIPTION__TABLE_STRUCTURE,
					oldTableStructure, tableStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.EEF_TABLE_DESCRIPTION__VALUE_EXPRESSION:
			return getValueExpression();
		case EefPackage.EEF_TABLE_DESCRIPTION__EDIT_EXPRESSION:
			return getEditExpression();
		case EefPackage.EEF_TABLE_DESCRIPTION__TABLE_STRUCTURE:
			if (resolve)
				return getTableStructure();
			return basicGetTableStructure();
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
		case EefPackage.EEF_TABLE_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression((String) newValue);
			return;
		case EefPackage.EEF_TABLE_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression((String) newValue);
			return;
		case EefPackage.EEF_TABLE_DESCRIPTION__TABLE_STRUCTURE:
			setTableStructure((EEFTableStructureDescription) newValue);
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
		case EefPackage.EEF_TABLE_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression(VALUE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_TABLE_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression(EDIT_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_TABLE_DESCRIPTION__TABLE_STRUCTURE:
			setTableStructure((EEFTableStructureDescription) null);
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
		case EefPackage.EEF_TABLE_DESCRIPTION__VALUE_EXPRESSION:
			return VALUE_EXPRESSION_EDEFAULT == null ? valueExpression != null
					: !VALUE_EXPRESSION_EDEFAULT.equals(valueExpression);
		case EefPackage.EEF_TABLE_DESCRIPTION__EDIT_EXPRESSION:
			return EDIT_EXPRESSION_EDEFAULT == null ? editExpression != null
					: !EDIT_EXPRESSION_EDEFAULT.equals(editExpression);
		case EefPackage.EEF_TABLE_DESCRIPTION__TABLE_STRUCTURE:
			return tableStructure != null;
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
		result.append(" (valueExpression: "); //$NON-NLS-1$
		result.append(valueExpression);
		result.append(", editExpression: "); //$NON-NLS-1$
		result.append(editExpression);
		result.append(')');
		return result.toString();
	}

} //EEFTableDescriptionImpl
