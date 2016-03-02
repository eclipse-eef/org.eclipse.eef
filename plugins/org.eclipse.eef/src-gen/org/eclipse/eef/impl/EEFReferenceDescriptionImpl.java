/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import org.eclipse.eef.EEFReferenceDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Reference Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFReferenceDescriptionImpl#getSemanticElementExpression <em>Semantic Element
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFReferenceDescriptionImpl#getEReferenceNameExpression <em>EReference Name
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFReferenceDescriptionImpl#getDisplayExpression <em>Display Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFReferenceDescriptionImpl#getCreateExpression <em>Create Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFReferenceDescriptionImpl#getOnClickExpression <em>On Click Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EEFReferenceDescriptionImpl extends EEFWidgetDescriptionImpl implements EEFReferenceDescription {
	/**
	 * The default value of the '{@link #getSemanticElementExpression() <em>Semantic Element Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getSemanticElementExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_ELEMENT_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticElementExpression() <em>Semantic Element Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getSemanticElementExpression()
	 * @generated
	 * @ordered
	 */
	protected String semanticElementExpression = EEFReferenceDescriptionImpl.SEMANTIC_ELEMENT_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEReferenceNameExpression() <em>EReference Name Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getEReferenceNameExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EREFERENCE_NAME_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEReferenceNameExpression() <em>EReference Name Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getEReferenceNameExpression()
	 * @generated
	 * @ordered
	 */
	protected String eReferenceNameExpression = EEFReferenceDescriptionImpl.EREFERENCE_NAME_EXPRESSION_EDEFAULT;

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
	protected String displayExpression = EEFReferenceDescriptionImpl.DISPLAY_EXPRESSION_EDEFAULT;

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
	protected String createExpression = EEFReferenceDescriptionImpl.CREATE_EXPRESSION_EDEFAULT;

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
	protected String onClickExpression = EEFReferenceDescriptionImpl.ON_CLICK_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFReferenceDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_REFERENCE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getSemanticElementExpression() {
		return semanticElementExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setSemanticElementExpression(String newSemanticElementExpression) {
		String oldSemanticElementExpression = semanticElementExpression;
		semanticElementExpression = newSemanticElementExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_REFERENCE_DESCRIPTION__SEMANTIC_ELEMENT_EXPRESSION,
					oldSemanticElementExpression, semanticElementExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getEReferenceNameExpression() {
		return eReferenceNameExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setEReferenceNameExpression(String newEReferenceNameExpression) {
		String oldEReferenceNameExpression = eReferenceNameExpression;
		eReferenceNameExpression = newEReferenceNameExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_REFERENCE_DESCRIPTION__EREFERENCE_NAME_EXPRESSION,
					oldEReferenceNameExpression, eReferenceNameExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_REFERENCE_DESCRIPTION__DISPLAY_EXPRESSION, oldDisplayExpression,
					displayExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_REFERENCE_DESCRIPTION__CREATE_EXPRESSION, oldCreateExpression,
					createExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION, oldOnClickExpression,
					onClickExpression));
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
		case EefPackage.EEF_REFERENCE_DESCRIPTION__SEMANTIC_ELEMENT_EXPRESSION:
			return getSemanticElementExpression();
		case EefPackage.EEF_REFERENCE_DESCRIPTION__EREFERENCE_NAME_EXPRESSION:
			return getEReferenceNameExpression();
		case EefPackage.EEF_REFERENCE_DESCRIPTION__DISPLAY_EXPRESSION:
			return getDisplayExpression();
		case EefPackage.EEF_REFERENCE_DESCRIPTION__CREATE_EXPRESSION:
			return getCreateExpression();
		case EefPackage.EEF_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION:
			return getOnClickExpression();
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
		case EefPackage.EEF_REFERENCE_DESCRIPTION__SEMANTIC_ELEMENT_EXPRESSION:
			setSemanticElementExpression((String) newValue);
			return;
		case EefPackage.EEF_REFERENCE_DESCRIPTION__EREFERENCE_NAME_EXPRESSION:
			setEReferenceNameExpression((String) newValue);
			return;
		case EefPackage.EEF_REFERENCE_DESCRIPTION__DISPLAY_EXPRESSION:
			setDisplayExpression((String) newValue);
			return;
		case EefPackage.EEF_REFERENCE_DESCRIPTION__CREATE_EXPRESSION:
			setCreateExpression((String) newValue);
			return;
		case EefPackage.EEF_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION:
			setOnClickExpression((String) newValue);
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
		case EefPackage.EEF_REFERENCE_DESCRIPTION__SEMANTIC_ELEMENT_EXPRESSION:
			setSemanticElementExpression(EEFReferenceDescriptionImpl.SEMANTIC_ELEMENT_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_REFERENCE_DESCRIPTION__EREFERENCE_NAME_EXPRESSION:
			setEReferenceNameExpression(EEFReferenceDescriptionImpl.EREFERENCE_NAME_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_REFERENCE_DESCRIPTION__DISPLAY_EXPRESSION:
			setDisplayExpression(EEFReferenceDescriptionImpl.DISPLAY_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_REFERENCE_DESCRIPTION__CREATE_EXPRESSION:
			setCreateExpression(EEFReferenceDescriptionImpl.CREATE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION:
			setOnClickExpression(EEFReferenceDescriptionImpl.ON_CLICK_EXPRESSION_EDEFAULT);
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
		case EefPackage.EEF_REFERENCE_DESCRIPTION__SEMANTIC_ELEMENT_EXPRESSION:
			return EEFReferenceDescriptionImpl.SEMANTIC_ELEMENT_EXPRESSION_EDEFAULT == null ? semanticElementExpression != null
			: !EEFReferenceDescriptionImpl.SEMANTIC_ELEMENT_EXPRESSION_EDEFAULT.equals(semanticElementExpression);
		case EefPackage.EEF_REFERENCE_DESCRIPTION__EREFERENCE_NAME_EXPRESSION:
			return EEFReferenceDescriptionImpl.EREFERENCE_NAME_EXPRESSION_EDEFAULT == null ? eReferenceNameExpression != null
			: !EEFReferenceDescriptionImpl.EREFERENCE_NAME_EXPRESSION_EDEFAULT.equals(eReferenceNameExpression);
		case EefPackage.EEF_REFERENCE_DESCRIPTION__DISPLAY_EXPRESSION:
			return EEFReferenceDescriptionImpl.DISPLAY_EXPRESSION_EDEFAULT == null ? displayExpression != null
			: !EEFReferenceDescriptionImpl.DISPLAY_EXPRESSION_EDEFAULT.equals(displayExpression);
		case EefPackage.EEF_REFERENCE_DESCRIPTION__CREATE_EXPRESSION:
			return EEFReferenceDescriptionImpl.CREATE_EXPRESSION_EDEFAULT == null ? createExpression != null
			: !EEFReferenceDescriptionImpl.CREATE_EXPRESSION_EDEFAULT.equals(createExpression);
		case EefPackage.EEF_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION:
			return EEFReferenceDescriptionImpl.ON_CLICK_EXPRESSION_EDEFAULT == null ? onClickExpression != null
			: !EEFReferenceDescriptionImpl.ON_CLICK_EXPRESSION_EDEFAULT.equals(onClickExpression);
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
		result.append(" (semanticElementExpression: "); //$NON-NLS-1$
		result.append(semanticElementExpression);
		result.append(", eReferenceNameExpression: "); //$NON-NLS-1$
		result.append(eReferenceNameExpression);
		result.append(", displayExpression: "); //$NON-NLS-1$
		result.append(displayExpression);
		result.append(", createExpression: "); //$NON-NLS-1$
		result.append(createExpression);
		result.append(", onClickExpression: "); //$NON-NLS-1$
		result.append(onClickExpression);
		result.append(')');
		return result.toString();
	}

} // EEFReferenceDescriptionImpl
