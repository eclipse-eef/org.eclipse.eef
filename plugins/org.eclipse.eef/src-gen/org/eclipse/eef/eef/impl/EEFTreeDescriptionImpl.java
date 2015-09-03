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
import org.eclipse.eef.eef.EEFTreeStructureDescription;
import org.eclipse.eef.eef.EefPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Tree Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFTreeDescriptionImpl#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFTreeDescriptionImpl#getTreeStructure <em>Tree Structure</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFTreeDescriptionImpl#getEditExpression <em>Edit Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFTreeDescriptionImpl extends EEFCellWidgetDescriptionImpl implements EEFTreeDescription {
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
	 * The cached value of the '{@link #getTreeStructure() <em>Tree Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeStructure()
	 * @generated
	 * @ordered
	 */
	protected EEFTreeStructureDescription treeStructure;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFTreeDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_TREE_DESCRIPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TREE_DESCRIPTION__VALUE_EXPRESSION,
					oldValueExpression, valueExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFTreeStructureDescription getTreeStructure() {
		if (treeStructure != null && treeStructure.eIsProxy()) {
			InternalEObject oldTreeStructure = (InternalEObject) treeStructure;
			treeStructure = (EEFTreeStructureDescription) eResolveProxy(oldTreeStructure);
			if (treeStructure != oldTreeStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EefPackage.EEF_TREE_DESCRIPTION__TREE_STRUCTURE, oldTreeStructure, treeStructure));
			}
		}
		return treeStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFTreeStructureDescription basicGetTreeStructure() {
		return treeStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTreeStructure(EEFTreeStructureDescription newTreeStructure) {
		EEFTreeStructureDescription oldTreeStructure = treeStructure;
		treeStructure = newTreeStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TREE_DESCRIPTION__TREE_STRUCTURE,
					oldTreeStructure, treeStructure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TREE_DESCRIPTION__EDIT_EXPRESSION,
					oldEditExpression, editExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.EEF_TREE_DESCRIPTION__VALUE_EXPRESSION:
			return getValueExpression();
		case EefPackage.EEF_TREE_DESCRIPTION__TREE_STRUCTURE:
			if (resolve)
				return getTreeStructure();
			return basicGetTreeStructure();
		case EefPackage.EEF_TREE_DESCRIPTION__EDIT_EXPRESSION:
			return getEditExpression();
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
		case EefPackage.EEF_TREE_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression((String) newValue);
			return;
		case EefPackage.EEF_TREE_DESCRIPTION__TREE_STRUCTURE:
			setTreeStructure((EEFTreeStructureDescription) newValue);
			return;
		case EefPackage.EEF_TREE_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression((String) newValue);
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
		case EefPackage.EEF_TREE_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression(VALUE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_TREE_DESCRIPTION__TREE_STRUCTURE:
			setTreeStructure((EEFTreeStructureDescription) null);
			return;
		case EefPackage.EEF_TREE_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression(EDIT_EXPRESSION_EDEFAULT);
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
		case EefPackage.EEF_TREE_DESCRIPTION__VALUE_EXPRESSION:
			return VALUE_EXPRESSION_EDEFAULT == null ? valueExpression != null
					: !VALUE_EXPRESSION_EDEFAULT.equals(valueExpression);
		case EefPackage.EEF_TREE_DESCRIPTION__TREE_STRUCTURE:
			return treeStructure != null;
		case EefPackage.EEF_TREE_DESCRIPTION__EDIT_EXPRESSION:
			return EDIT_EXPRESSION_EDEFAULT == null ? editExpression != null
					: !EDIT_EXPRESSION_EDEFAULT.equals(editExpression);
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

} //EEFTreeDescriptionImpl
