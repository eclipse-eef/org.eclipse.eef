/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl;

import java.util.Collection;

import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceConditionalStyle;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceWidgetStyle;
import org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EefExtWidgetsReferencePackage;
import org.eclipse.eef.impl.EEFWidgetDescriptionImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Ext Reference Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceDescriptionImpl#getReferenceNameExpression
 * <em>Reference Name Expression</em>}</li>
 * <li>{@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceDescriptionImpl#getReferenceOwnerExpression
 * <em>Reference Owner Expression</em>}</li>
 * <li>{@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceDescriptionImpl#getOnClickExpression
 * <em>On Click Expression</em>}</li>
 * <li>{@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceDescriptionImpl#getStyle
 * <em>Style</em>}</li>
 * <li>{@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.impl.EEFExtReferenceDescriptionImpl#getConditionalStyles
 * <em>Conditional Styles</em>}</li>
 * </ul>
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
	 * The default value of the '{@link #getReferenceOwnerExpression() <em>Reference Owner Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getReferenceOwnerExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_OWNER_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceOwnerExpression() <em>Reference Owner Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getReferenceOwnerExpression()
	 * @generated
	 * @ordered
	 */
	protected String referenceOwnerExpression = EEFExtReferenceDescriptionImpl.REFERENCE_OWNER_EXPRESSION_EDEFAULT;

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
	protected String onClickExpression = EEFExtReferenceDescriptionImpl.ON_CLICK_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected EEFExtReferenceWidgetStyle style;

	/**
	 * The cached value of the '{@link #getConditionalStyles() <em>Conditional Styles</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getConditionalStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFExtReferenceConditionalStyle> conditionalStyles;

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
	public String getReferenceOwnerExpression() {
		return referenceOwnerExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setReferenceOwnerExpression(String newReferenceOwnerExpression) {
		String oldReferenceOwnerExpression = referenceOwnerExpression;
		referenceOwnerExpression = newReferenceOwnerExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_OWNER_EXPRESSION, oldReferenceOwnerExpression,
					referenceOwnerExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION,
					oldOnClickExpression, onClickExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFExtReferenceWidgetStyle getStyle() {
		if (style != null && style.eIsProxy()) {
			InternalEObject oldStyle = (InternalEObject) style;
			style = (EEFExtReferenceWidgetStyle) eResolveProxy(oldStyle);
			if (style != oldStyle) {
				InternalEObject newStyle = (InternalEObject) style;
				NotificationChain msgs = oldStyle.eInverseRemove(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__STYLE, null, null);
				if (newStyle.eInternalContainer() == null) {
					msgs = newStyle.eInverseAdd(this,
							InternalEObject.EOPPOSITE_FEATURE_BASE - EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__STYLE, null, msgs);
				}
				if (msgs != null) {
					msgs.dispatch();
				}
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__STYLE,
							oldStyle, style));
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
	public EEFExtReferenceWidgetStyle basicGetStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetStyle(EEFExtReferenceWidgetStyle newStyle, NotificationChain msgs) {
		EEFExtReferenceWidgetStyle oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__STYLE, oldStyle, newStyle);
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
	public void setStyle(EEFExtReferenceWidgetStyle newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null) {
				msgs = ((InternalEObject) style).eInverseRemove(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__STYLE, null, msgs);
			}
			if (newStyle != null) {
				msgs = ((InternalEObject) newStyle).eInverseAdd(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__STYLE, null, msgs);
			}
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__STYLE, newStyle,
					newStyle));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<EEFExtReferenceConditionalStyle> getConditionalStyles() {
		if (conditionalStyles == null) {
			conditionalStyles = new EObjectContainmentEList.Resolving<>(EEFExtReferenceConditionalStyle.class, this,
					EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__CONDITIONAL_STYLES);
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
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__STYLE:
			return basicSetStyle(null, msgs);
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_NAME_EXPRESSION:
			return getReferenceNameExpression();
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_OWNER_EXPRESSION:
			return getReferenceOwnerExpression();
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION:
			return getOnClickExpression();
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__STYLE:
			if (resolve) {
				return getStyle();
			}
			return basicGetStyle();
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_NAME_EXPRESSION:
			setReferenceNameExpression((String) newValue);
			return;
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_OWNER_EXPRESSION:
			setReferenceOwnerExpression((String) newValue);
			return;
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION:
			setOnClickExpression((String) newValue);
			return;
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__STYLE:
			setStyle((EEFExtReferenceWidgetStyle) newValue);
			return;
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__CONDITIONAL_STYLES:
			getConditionalStyles().clear();
			getConditionalStyles().addAll((Collection<? extends EEFExtReferenceConditionalStyle>) newValue);
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
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_OWNER_EXPRESSION:
			setReferenceOwnerExpression(EEFExtReferenceDescriptionImpl.REFERENCE_OWNER_EXPRESSION_EDEFAULT);
			return;
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION:
			setOnClickExpression(EEFExtReferenceDescriptionImpl.ON_CLICK_EXPRESSION_EDEFAULT);
			return;
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__STYLE:
			setStyle((EEFExtReferenceWidgetStyle) null);
			return;
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_NAME_EXPRESSION:
			return EEFExtReferenceDescriptionImpl.REFERENCE_NAME_EXPRESSION_EDEFAULT == null ? referenceNameExpression != null
					: !EEFExtReferenceDescriptionImpl.REFERENCE_NAME_EXPRESSION_EDEFAULT.equals(referenceNameExpression);
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__REFERENCE_OWNER_EXPRESSION:
			return EEFExtReferenceDescriptionImpl.REFERENCE_OWNER_EXPRESSION_EDEFAULT == null ? referenceOwnerExpression != null
					: !EEFExtReferenceDescriptionImpl.REFERENCE_OWNER_EXPRESSION_EDEFAULT.equals(referenceOwnerExpression);
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__ON_CLICK_EXPRESSION:
			return EEFExtReferenceDescriptionImpl.ON_CLICK_EXPRESSION_EDEFAULT == null ? onClickExpression != null
					: !EEFExtReferenceDescriptionImpl.ON_CLICK_EXPRESSION_EDEFAULT.equals(onClickExpression);
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__STYLE:
			return style != null;
		case EefExtWidgetsReferencePackage.EEF_EXT_REFERENCE_DESCRIPTION__CONDITIONAL_STYLES:
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (referenceNameExpression: "); //$NON-NLS-1$
		result.append(referenceNameExpression);
		result.append(", referenceOwnerExpression: "); //$NON-NLS-1$
		result.append(referenceOwnerExpression);
		result.append(", onClickExpression: "); //$NON-NLS-1$
		result.append(onClickExpression);
		result.append(')');
		return result.toString();
	}

} // EEFExtReferenceDescriptionImpl
