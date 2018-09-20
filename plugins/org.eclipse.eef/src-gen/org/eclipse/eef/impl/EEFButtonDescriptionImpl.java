/**
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import java.util.Collection;

import org.eclipse.eef.EEFButtonConditionalStyle;
import org.eclipse.eef.EEFButtonDescription;
import org.eclipse.eef.EEFButtonStyle;
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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Button Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFButtonDescriptionImpl#getButtonLabelExpression <em>Button Label
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFButtonDescriptionImpl#getImageExpression <em>Image Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFButtonDescriptionImpl#getPushExpression <em>Push Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFButtonDescriptionImpl#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFButtonDescriptionImpl#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFButtonDescriptionImpl extends EEFWidgetDescriptionImpl implements EEFButtonDescription {
	/**
	 * The default value of the '{@link #getButtonLabelExpression() <em>Button Label Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getButtonLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String BUTTON_LABEL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getButtonLabelExpression() <em>Button Label Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getButtonLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected String buttonLabelExpression = EEFButtonDescriptionImpl.BUTTON_LABEL_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageExpression() <em>Image Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getImageExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageExpression() <em>Image Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getImageExpression()
	 * @generated
	 * @ordered
	 */
	protected String imageExpression = EEFButtonDescriptionImpl.IMAGE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPushExpression() <em>Push Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getPushExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String PUSH_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPushExpression() <em>Push Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getPushExpression()
	 * @generated
	 * @ordered
	 */
	protected String pushExpression = EEFButtonDescriptionImpl.PUSH_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected EEFButtonStyle style;

	/**
	 * The cached value of the '{@link #getConditionalStyles() <em>Conditional Styles</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConditionalStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFButtonConditionalStyle> conditionalStyles;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFButtonDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_BUTTON_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getButtonLabelExpression() {
		return buttonLabelExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setButtonLabelExpression(String newButtonLabelExpression) {
		String oldButtonLabelExpression = buttonLabelExpression;
		buttonLabelExpression = newButtonLabelExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_BUTTON_DESCRIPTION__BUTTON_LABEL_EXPRESSION,
					oldButtonLabelExpression, buttonLabelExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getImageExpression() {
		return imageExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setImageExpression(String newImageExpression) {
		String oldImageExpression = imageExpression;
		imageExpression = newImageExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_BUTTON_DESCRIPTION__IMAGE_EXPRESSION, oldImageExpression,
					imageExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getPushExpression() {
		return pushExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPushExpression(String newPushExpression) {
		String oldPushExpression = pushExpression;
		pushExpression = newPushExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_BUTTON_DESCRIPTION__PUSH_EXPRESSION, oldPushExpression,
					pushExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFButtonStyle getStyle() {
		if (style != null && style.eIsProxy()) {
			InternalEObject oldStyle = (InternalEObject) style;
			style = (EEFButtonStyle) eResolveProxy(oldStyle);
			if (style != oldStyle) {
				InternalEObject newStyle = (InternalEObject) style;
				NotificationChain msgs = oldStyle.eInverseRemove(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_BUTTON_DESCRIPTION__STYLE, null, null);
				if (newStyle.eInternalContainer() == null) {
					msgs = newStyle.eInverseAdd(this, InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_BUTTON_DESCRIPTION__STYLE, null, msgs);
				}
				if (msgs != null) {
					msgs.dispatch();
				}
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefPackage.EEF_BUTTON_DESCRIPTION__STYLE, oldStyle, style));
				}
			}
		}
		return style;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEFButtonStyle basicGetStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStyle(EEFButtonStyle newStyle, NotificationChain msgs) {
		EEFButtonStyle oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EefPackage.EEF_BUTTON_DESCRIPTION__STYLE, oldStyle,
					newStyle);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setStyle(EEFButtonStyle newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null) {
				msgs = ((InternalEObject) style).eInverseRemove(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_BUTTON_DESCRIPTION__STYLE, null, msgs);
			}
			if (newStyle != null) {
				msgs = ((InternalEObject) newStyle).eInverseAdd(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_BUTTON_DESCRIPTION__STYLE, null, msgs);
			}
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_BUTTON_DESCRIPTION__STYLE, newStyle, newStyle));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EEFButtonConditionalStyle> getConditionalStyles() {
		if (conditionalStyles == null) {
			conditionalStyles = new EObjectContainmentEList.Resolving<>(EEFButtonConditionalStyle.class, this,
					EefPackage.EEF_BUTTON_DESCRIPTION__CONDITIONAL_STYLES);
		}
		return conditionalStyles;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_BUTTON_DESCRIPTION__STYLE:
			return basicSetStyle(null, msgs);
		case EefPackage.EEF_BUTTON_DESCRIPTION__CONDITIONAL_STYLES:
			return ((InternalEList<?>) getConditionalStyles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.EEF_BUTTON_DESCRIPTION__BUTTON_LABEL_EXPRESSION:
			return getButtonLabelExpression();
		case EefPackage.EEF_BUTTON_DESCRIPTION__IMAGE_EXPRESSION:
			return getImageExpression();
		case EefPackage.EEF_BUTTON_DESCRIPTION__PUSH_EXPRESSION:
			return getPushExpression();
		case EefPackage.EEF_BUTTON_DESCRIPTION__STYLE:
			if (resolve) {
				return getStyle();
			}
			return basicGetStyle();
		case EefPackage.EEF_BUTTON_DESCRIPTION__CONDITIONAL_STYLES:
			return getConditionalStyles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EefPackage.EEF_BUTTON_DESCRIPTION__BUTTON_LABEL_EXPRESSION:
			setButtonLabelExpression((String) newValue);
			return;
		case EefPackage.EEF_BUTTON_DESCRIPTION__IMAGE_EXPRESSION:
			setImageExpression((String) newValue);
			return;
		case EefPackage.EEF_BUTTON_DESCRIPTION__PUSH_EXPRESSION:
			setPushExpression((String) newValue);
			return;
		case EefPackage.EEF_BUTTON_DESCRIPTION__STYLE:
			setStyle((EEFButtonStyle) newValue);
			return;
		case EefPackage.EEF_BUTTON_DESCRIPTION__CONDITIONAL_STYLES:
			getConditionalStyles().clear();
			getConditionalStyles().addAll((Collection<? extends EEFButtonConditionalStyle>) newValue);
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
		case EefPackage.EEF_BUTTON_DESCRIPTION__BUTTON_LABEL_EXPRESSION:
			setButtonLabelExpression(EEFButtonDescriptionImpl.BUTTON_LABEL_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_BUTTON_DESCRIPTION__IMAGE_EXPRESSION:
			setImageExpression(EEFButtonDescriptionImpl.IMAGE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_BUTTON_DESCRIPTION__PUSH_EXPRESSION:
			setPushExpression(EEFButtonDescriptionImpl.PUSH_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_BUTTON_DESCRIPTION__STYLE:
			setStyle((EEFButtonStyle) null);
			return;
		case EefPackage.EEF_BUTTON_DESCRIPTION__CONDITIONAL_STYLES:
			getConditionalStyles().clear();
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
		case EefPackage.EEF_BUTTON_DESCRIPTION__BUTTON_LABEL_EXPRESSION:
			return EEFButtonDescriptionImpl.BUTTON_LABEL_EXPRESSION_EDEFAULT == null ? buttonLabelExpression != null
					: !EEFButtonDescriptionImpl.BUTTON_LABEL_EXPRESSION_EDEFAULT.equals(buttonLabelExpression);
		case EefPackage.EEF_BUTTON_DESCRIPTION__IMAGE_EXPRESSION:
			return EEFButtonDescriptionImpl.IMAGE_EXPRESSION_EDEFAULT == null ? imageExpression != null
					: !EEFButtonDescriptionImpl.IMAGE_EXPRESSION_EDEFAULT.equals(imageExpression);
		case EefPackage.EEF_BUTTON_DESCRIPTION__PUSH_EXPRESSION:
			return EEFButtonDescriptionImpl.PUSH_EXPRESSION_EDEFAULT == null ? pushExpression != null
					: !EEFButtonDescriptionImpl.PUSH_EXPRESSION_EDEFAULT.equals(pushExpression);
		case EefPackage.EEF_BUTTON_DESCRIPTION__STYLE:
			return style != null;
		case EefPackage.EEF_BUTTON_DESCRIPTION__CONDITIONAL_STYLES:
			return conditionalStyles != null && !conditionalStyles.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (buttonLabelExpression: "); //$NON-NLS-1$
		result.append(buttonLabelExpression);
		result.append(", imageExpression: "); //$NON-NLS-1$
		result.append(imageExpression);
		result.append(", pushExpression: "); //$NON-NLS-1$
		result.append(pushExpression);
		result.append(')');
		return result.toString();
	}

} // EEFButtonDescriptionImpl
