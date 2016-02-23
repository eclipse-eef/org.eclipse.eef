/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import org.eclipse.eef.EEFSingleReferenceDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Single Reference Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFSingleReferenceDescriptionImpl#getValueExpression <em>Value Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFSingleReferenceDescriptionImpl#getDisplayExpression <em>Display Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFSingleReferenceDescriptionImpl#getOnClickExpression <em>On Click Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFSingleReferenceDescriptionImpl#getCreateExpression <em>Create Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFSingleReferenceDescriptionImpl#getSearchExpression <em>Search Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFSingleReferenceDescriptionImpl#getUnsetExpression <em>Unset Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEFSingleReferenceDescriptionImpl extends EEFWidgetDescriptionImpl implements EEFSingleReferenceDescription {
	/**
	 * The default value of the '{@link #getValueExpression() <em>Value Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #getValueExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueExpression() <em>Value Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #getValueExpression()
	 * @generated
	 * @ordered
	 */
	protected String valueExpression = EEFSingleReferenceDescriptionImpl.VALUE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayExpression() <em>Display Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getDisplayExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayExpression() <em>Display Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getDisplayExpression()
	 * @generated
	 * @ordered
	 */
	protected String displayExpression = EEFSingleReferenceDescriptionImpl.DISPLAY_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnClickExpression() <em>On Click Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getOnClickExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_CLICK_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnClickExpression() <em>On Click Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getOnClickExpression()
	 * @generated
	 * @ordered
	 */
	protected String onClickExpression = EEFSingleReferenceDescriptionImpl.ON_CLICK_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreateExpression() <em>Create Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getCreateExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreateExpression() <em>Create Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getCreateExpression()
	 * @generated
	 * @ordered
	 */
	protected String createExpression = EEFSingleReferenceDescriptionImpl.CREATE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSearchExpression() <em>Search Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getSearchExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SEARCH_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSearchExpression() <em>Search Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getSearchExpression()
	 * @generated
	 * @ordered
	 */
	protected String searchExpression = EEFSingleReferenceDescriptionImpl.SEARCH_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnsetExpression() <em>Unset Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #getUnsetExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String UNSET_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnsetExpression() <em>Unset Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #getUnsetExpression()
	 * @generated
	 * @ordered
	 */
	protected String unsetExpression = EEFSingleReferenceDescriptionImpl.UNSET_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFSingleReferenceDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_SINGLE_REFERENCE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getValueExpression() {
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setValueExpression(String newValueExpression) {
		String oldValueExpression = valueExpression;
		valueExpression = newValueExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__VALUE_EXPRESSION, oldValueExpression,
					valueExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getDisplayExpression() {
		return displayExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setDisplayExpression(String newDisplayExpression) {
		String oldDisplayExpression = displayExpression;
		displayExpression = newDisplayExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__DISPLAY_EXPRESSION,
					oldDisplayExpression, displayExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getOnClickExpression() {
		return onClickExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setOnClickExpression(String newOnClickExpression) {
		String oldOnClickExpression = onClickExpression;
		onClickExpression = newOnClickExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION,
					oldOnClickExpression, onClickExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getCreateExpression() {
		return createExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setCreateExpression(String newCreateExpression) {
		String oldCreateExpression = createExpression;
		createExpression = newCreateExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__CREATE_EXPRESSION,
					oldCreateExpression, createExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getSearchExpression() {
		return searchExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setSearchExpression(String newSearchExpression) {
		String oldSearchExpression = searchExpression;
		searchExpression = newSearchExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__SEARCH_EXPRESSION,
					oldSearchExpression, searchExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getUnsetExpression() {
		return unsetExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setUnsetExpression(String newUnsetExpression) {
		String oldUnsetExpression = unsetExpression;
		unsetExpression = newUnsetExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__UNSET_EXPRESSION, oldUnsetExpression,
					unsetExpression));
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
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__VALUE_EXPRESSION:
			return getValueExpression();
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__DISPLAY_EXPRESSION:
			return getDisplayExpression();
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION:
			return getOnClickExpression();
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__CREATE_EXPRESSION:
			return getCreateExpression();
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__SEARCH_EXPRESSION:
			return getSearchExpression();
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__UNSET_EXPRESSION:
			return getUnsetExpression();
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
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression((String) newValue);
			return;
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__DISPLAY_EXPRESSION:
			setDisplayExpression((String) newValue);
			return;
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION:
			setOnClickExpression((String) newValue);
			return;
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__CREATE_EXPRESSION:
			setCreateExpression((String) newValue);
			return;
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__SEARCH_EXPRESSION:
			setSearchExpression((String) newValue);
			return;
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__UNSET_EXPRESSION:
			setUnsetExpression((String) newValue);
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
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression(EEFSingleReferenceDescriptionImpl.VALUE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__DISPLAY_EXPRESSION:
			setDisplayExpression(EEFSingleReferenceDescriptionImpl.DISPLAY_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION:
			setOnClickExpression(EEFSingleReferenceDescriptionImpl.ON_CLICK_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__CREATE_EXPRESSION:
			setCreateExpression(EEFSingleReferenceDescriptionImpl.CREATE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__SEARCH_EXPRESSION:
			setSearchExpression(EEFSingleReferenceDescriptionImpl.SEARCH_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__UNSET_EXPRESSION:
			setUnsetExpression(EEFSingleReferenceDescriptionImpl.UNSET_EXPRESSION_EDEFAULT);
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
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__VALUE_EXPRESSION:
			return EEFSingleReferenceDescriptionImpl.VALUE_EXPRESSION_EDEFAULT == null ? valueExpression != null
			: !EEFSingleReferenceDescriptionImpl.VALUE_EXPRESSION_EDEFAULT.equals(valueExpression);
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__DISPLAY_EXPRESSION:
			return EEFSingleReferenceDescriptionImpl.DISPLAY_EXPRESSION_EDEFAULT == null ? displayExpression != null
			: !EEFSingleReferenceDescriptionImpl.DISPLAY_EXPRESSION_EDEFAULT.equals(displayExpression);
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION:
			return EEFSingleReferenceDescriptionImpl.ON_CLICK_EXPRESSION_EDEFAULT == null ? onClickExpression != null
			: !EEFSingleReferenceDescriptionImpl.ON_CLICK_EXPRESSION_EDEFAULT.equals(onClickExpression);
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__CREATE_EXPRESSION:
			return EEFSingleReferenceDescriptionImpl.CREATE_EXPRESSION_EDEFAULT == null ? createExpression != null
			: !EEFSingleReferenceDescriptionImpl.CREATE_EXPRESSION_EDEFAULT.equals(createExpression);
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__SEARCH_EXPRESSION:
			return EEFSingleReferenceDescriptionImpl.SEARCH_EXPRESSION_EDEFAULT == null ? searchExpression != null
			: !EEFSingleReferenceDescriptionImpl.SEARCH_EXPRESSION_EDEFAULT.equals(searchExpression);
		case EefPackage.EEF_SINGLE_REFERENCE_DESCRIPTION__UNSET_EXPRESSION:
			return EEFSingleReferenceDescriptionImpl.UNSET_EXPRESSION_EDEFAULT == null ? unsetExpression != null
			: !EEFSingleReferenceDescriptionImpl.UNSET_EXPRESSION_EDEFAULT.equals(unsetExpression);
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
		result.append(" (valueExpression: "); //$NON-NLS-1$
		result.append(valueExpression);
		result.append(", displayExpression: "); //$NON-NLS-1$
		result.append(displayExpression);
		result.append(", onClickExpression: "); //$NON-NLS-1$
		result.append(onClickExpression);
		result.append(", createExpression: "); //$NON-NLS-1$
		result.append(createExpression);
		result.append(", searchExpression: "); //$NON-NLS-1$
		result.append(searchExpression);
		result.append(", unsetExpression: "); //$NON-NLS-1$
		result.append(unsetExpression);
		result.append(')');
		return result.toString();
	}

} // EEFSingleReferenceDescriptionImpl
