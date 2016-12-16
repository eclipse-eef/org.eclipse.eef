/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl;

import java.util.Collection;

import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextConditionalStyle;
import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextDescription;
import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EEFExtNebulaRichTextWidgetStyle;
import org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.EefExtWidgetsNebulaPackage;

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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Ext Nebula Rich Text Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EEFExtNebulaRichTextDescriptionImpl#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EEFExtNebulaRichTextDescriptionImpl#getEditExpression <em>Edit Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EEFExtNebulaRichTextDescriptionImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.eef.ext.widgets.nebula.eefextwidgetsnebula.impl.EEFExtNebulaRichTextDescriptionImpl#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFExtNebulaRichTextDescriptionImpl extends EEFWidgetDescriptionImpl
		implements EEFExtNebulaRichTextDescription {
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
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected EEFExtNebulaRichTextWidgetStyle style;

	/**
	 * The cached value of the '{@link #getConditionalStyles() <em>Conditional Styles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFExtNebulaRichTextConditionalStyle> conditionalStyles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFExtNebulaRichTextDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefExtWidgetsNebulaPackage.Literals.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueExpression() {
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueExpression(String newValueExpression) {
		String oldValueExpression = valueExpression;
		valueExpression = newValueExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__VALUE_EXPRESSION,
					oldValueExpression, valueExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditExpression() {
		return editExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditExpression(String newEditExpression) {
		String oldEditExpression = editExpression;
		editExpression = newEditExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__EDIT_EXPRESSION, oldEditExpression,
					editExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFExtNebulaRichTextWidgetStyle getStyle() {
		if (style != null && style.eIsProxy()) {
			InternalEObject oldStyle = (InternalEObject) style;
			style = (EEFExtNebulaRichTextWidgetStyle) eResolveProxy(oldStyle);
			if (style != oldStyle) {
				InternalEObject newStyle = (InternalEObject) style;
				NotificationChain msgs = oldStyle.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__STYLE,
						null, null);
				if (newStyle.eInternalContainer() == null) {
					msgs = newStyle.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__STYLE,
							null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__STYLE, oldStyle, style));
			}
		}
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFExtNebulaRichTextWidgetStyle basicGetStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(EEFExtNebulaRichTextWidgetStyle newStyle, NotificationChain msgs) {
		EEFExtNebulaRichTextWidgetStyle oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__STYLE, oldStyle, newStyle);
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
	public void setStyle(EEFExtNebulaRichTextWidgetStyle newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null)
				msgs = ((InternalEObject) style).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__STYLE,
						null, msgs);
			if (newStyle != null)
				msgs = ((InternalEObject) newStyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__STYLE,
						null, msgs);
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__STYLE, newStyle, newStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EEFExtNebulaRichTextConditionalStyle> getConditionalStyles() {
		if (conditionalStyles == null) {
			conditionalStyles = new EObjectContainmentEList.Resolving<EEFExtNebulaRichTextConditionalStyle>(
					EEFExtNebulaRichTextConditionalStyle.class, this,
					EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__CONDITIONAL_STYLES);
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
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__STYLE:
			return basicSetStyle(null, msgs);
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__VALUE_EXPRESSION:
			return getValueExpression();
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__EDIT_EXPRESSION:
			return getEditExpression();
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__STYLE:
			if (resolve)
				return getStyle();
			return basicGetStyle();
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression((String) newValue);
			return;
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression((String) newValue);
			return;
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__STYLE:
			setStyle((EEFExtNebulaRichTextWidgetStyle) newValue);
			return;
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__CONDITIONAL_STYLES:
			getConditionalStyles().clear();
			getConditionalStyles().addAll((Collection<? extends EEFExtNebulaRichTextConditionalStyle>) newValue);
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
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression(VALUE_EXPRESSION_EDEFAULT);
			return;
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression(EDIT_EXPRESSION_EDEFAULT);
			return;
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__STYLE:
			setStyle((EEFExtNebulaRichTextWidgetStyle) null);
			return;
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__VALUE_EXPRESSION:
			return VALUE_EXPRESSION_EDEFAULT == null ? valueExpression != null
					: !VALUE_EXPRESSION_EDEFAULT.equals(valueExpression);
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__EDIT_EXPRESSION:
			return EDIT_EXPRESSION_EDEFAULT == null ? editExpression != null
					: !EDIT_EXPRESSION_EDEFAULT.equals(editExpression);
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__STYLE:
			return style != null;
		case EefExtWidgetsNebulaPackage.EEF_EXT_NEBULA_RICH_TEXT_DESCRIPTION__CONDITIONAL_STYLES:
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
		result.append(" (valueExpression: "); //$NON-NLS-1$
		result.append(valueExpression);
		result.append(", editExpression: "); //$NON-NLS-1$
		result.append(editExpression);
		result.append(')');
		return result.toString();
	}

} //EEFExtNebulaRichTextDescriptionImpl
