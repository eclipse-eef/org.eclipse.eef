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

import org.eclipse.eef.EEFMultiTextConditionalStyle;
import org.eclipse.eef.EEFMultiTextDescription;
import org.eclipse.eef.EEFMultiTextStyle;
import org.eclipse.eef.EefPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Multi Text Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.impl.EEFMultiTextDescriptionImpl#getEditExpression <em>Edit Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFMultiTextDescriptionImpl#getAttributeOwnerExpression <em>Attribute Owner Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFMultiTextDescriptionImpl#getAttributeNameExpression <em>Attribute Name Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFMultiTextDescriptionImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFMultiTextDescriptionImpl#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFMultiTextDescriptionImpl extends EEFWidgetDescriptionImpl implements EEFMultiTextDescription {
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
	 * The default value of the '{@link #getAttributeOwnerExpression() <em>Attribute Owner Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeOwnerExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_OWNER_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeOwnerExpression() <em>Attribute Owner Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeOwnerExpression()
	 * @generated
	 * @ordered
	 */
	protected String attributeOwnerExpression = ATTRIBUTE_OWNER_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeNameExpression() <em>Attribute Name Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeNameExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_NAME_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeNameExpression() <em>Attribute Name Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeNameExpression()
	 * @generated
	 * @ordered
	 */
	protected String attributeNameExpression = ATTRIBUTE_NAME_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected EEFMultiTextStyle style;

	/**
	 * The cached value of the '{@link #getConditionalStyles() <em>Conditional Styles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFMultiTextConditionalStyle> conditionalStyles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFMultiTextDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_MULTI_TEXT_DESCRIPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_MULTI_TEXT_DESCRIPTION__EDIT_EXPRESSION, oldEditExpression,
					editExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttributeOwnerExpression() {
		return attributeOwnerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeOwnerExpression(String newAttributeOwnerExpression) {
		String oldAttributeOwnerExpression = attributeOwnerExpression;
		attributeOwnerExpression = newAttributeOwnerExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_MULTI_TEXT_DESCRIPTION__ATTRIBUTE_OWNER_EXPRESSION,
					oldAttributeOwnerExpression, attributeOwnerExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttributeNameExpression() {
		return attributeNameExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeNameExpression(String newAttributeNameExpression) {
		String oldAttributeNameExpression = attributeNameExpression;
		attributeNameExpression = newAttributeNameExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_MULTI_TEXT_DESCRIPTION__ATTRIBUTE_NAME_EXPRESSION,
					oldAttributeNameExpression, attributeNameExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFMultiTextStyle getStyle() {
		if (style != null && style.eIsProxy()) {
			InternalEObject oldStyle = (InternalEObject) style;
			style = (EEFMultiTextStyle) eResolveProxy(oldStyle);
			if (style != oldStyle) {
				InternalEObject newStyle = (InternalEObject) style;
				NotificationChain msgs = oldStyle.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EefPackage.EEF_MULTI_TEXT_DESCRIPTION__STYLE, null,
						null);
				if (newStyle.eInternalContainer() == null) {
					msgs = newStyle.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EefPackage.EEF_MULTI_TEXT_DESCRIPTION__STYLE, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefPackage.EEF_MULTI_TEXT_DESCRIPTION__STYLE, oldStyle, style));
			}
		}
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFMultiTextStyle basicGetStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(EEFMultiTextStyle newStyle, NotificationChain msgs) {
		EEFMultiTextStyle oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EefPackage.EEF_MULTI_TEXT_DESCRIPTION__STYLE, oldStyle,
					newStyle);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(EEFMultiTextStyle newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null)
				msgs = ((InternalEObject) style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EefPackage.EEF_MULTI_TEXT_DESCRIPTION__STYLE, null,
						msgs);
			if (newStyle != null)
				msgs = ((InternalEObject) newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EefPackage.EEF_MULTI_TEXT_DESCRIPTION__STYLE, null,
						msgs);
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_MULTI_TEXT_DESCRIPTION__STYLE, newStyle, newStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEFMultiTextConditionalStyle> getConditionalStyles() {
		if (conditionalStyles == null) {
			conditionalStyles = new EObjectContainmentEList.Resolving<EEFMultiTextConditionalStyle>(EEFMultiTextConditionalStyle.class, this,
					EefPackage.EEF_MULTI_TEXT_DESCRIPTION__CONDITIONAL_STYLES);
		}
		return conditionalStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__STYLE:
			return basicSetStyle(null, msgs);
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__CONDITIONAL_STYLES:
			return ((InternalEList<?>) getConditionalStyles()).basicRemove(otherEnd, msgs);
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
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__EDIT_EXPRESSION:
			return getEditExpression();
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__ATTRIBUTE_OWNER_EXPRESSION:
			return getAttributeOwnerExpression();
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__ATTRIBUTE_NAME_EXPRESSION:
			return getAttributeNameExpression();
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__STYLE:
			if (resolve)
				return getStyle();
			return basicGetStyle();
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__CONDITIONAL_STYLES:
			return getConditionalStyles();
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
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression((String) newValue);
			return;
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__ATTRIBUTE_OWNER_EXPRESSION:
			setAttributeOwnerExpression((String) newValue);
			return;
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__ATTRIBUTE_NAME_EXPRESSION:
			setAttributeNameExpression((String) newValue);
			return;
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__STYLE:
			setStyle((EEFMultiTextStyle) newValue);
			return;
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__CONDITIONAL_STYLES:
			getConditionalStyles().clear();
			getConditionalStyles().addAll((Collection<? extends EEFMultiTextConditionalStyle>) newValue);
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
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression(EDIT_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__ATTRIBUTE_OWNER_EXPRESSION:
			setAttributeOwnerExpression(ATTRIBUTE_OWNER_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__ATTRIBUTE_NAME_EXPRESSION:
			setAttributeNameExpression(ATTRIBUTE_NAME_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__STYLE:
			setStyle((EEFMultiTextStyle) null);
			return;
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__CONDITIONAL_STYLES:
			getConditionalStyles().clear();
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
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__EDIT_EXPRESSION:
			return EDIT_EXPRESSION_EDEFAULT == null ? editExpression != null : !EDIT_EXPRESSION_EDEFAULT.equals(editExpression);
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__ATTRIBUTE_OWNER_EXPRESSION:
			return ATTRIBUTE_OWNER_EXPRESSION_EDEFAULT == null ? attributeOwnerExpression != null
					: !ATTRIBUTE_OWNER_EXPRESSION_EDEFAULT.equals(attributeOwnerExpression);
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__ATTRIBUTE_NAME_EXPRESSION:
			return ATTRIBUTE_NAME_EXPRESSION_EDEFAULT == null ? attributeNameExpression != null
					: !ATTRIBUTE_NAME_EXPRESSION_EDEFAULT.equals(attributeNameExpression);
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__STYLE:
			return style != null;
		case EefPackage.EEF_MULTI_TEXT_DESCRIPTION__CONDITIONAL_STYLES:
			return conditionalStyles != null && !conditionalStyles.isEmpty();
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
		result.append(" (editExpression: "); //$NON-NLS-1$
		result.append(editExpression);
		result.append(", attributeOwnerExpression: "); //$NON-NLS-1$
		result.append(attributeOwnerExpression);
		result.append(", attributeNameExpression: "); //$NON-NLS-1$
		result.append(attributeNameExpression);
		result.append(')');
		return result.toString();
	}

} //EEFMultiTextDescriptionImpl
