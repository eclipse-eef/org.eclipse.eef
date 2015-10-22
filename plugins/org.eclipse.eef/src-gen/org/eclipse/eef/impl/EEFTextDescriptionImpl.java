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
import org.eclipse.eef.EEFTextConditionalStyle;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFTextStyle;
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
 * An implementation of the model object '<em><b>EEF Text Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.impl.EEFTextDescriptionImpl#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFTextDescriptionImpl#getEditExpression <em>Edit Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFTextDescriptionImpl#getReadOnlyExpression <em>Read Only Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFTextDescriptionImpl#getContentAssistExpression <em>Content Assist Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFTextDescriptionImpl#getPlaceholderExpression <em>Placeholder Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFTextDescriptionImpl#getLineCount <em>Line Count</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFTextDescriptionImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.eef.impl.EEFTextDescriptionImpl#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFTextDescriptionImpl extends EEFCellWidgetDescriptionImpl implements EEFTextDescription {
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
	 * The default value of the '{@link #getReadOnlyExpression() <em>Read Only Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnlyExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String READ_ONLY_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadOnlyExpression() <em>Read Only Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnlyExpression()
	 * @generated
	 * @ordered
	 */
	protected String readOnlyExpression = READ_ONLY_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentAssistExpression() <em>Content Assist Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentAssistExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_ASSIST_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentAssistExpression() <em>Content Assist Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentAssistExpression()
	 * @generated
	 * @ordered
	 */
	protected String contentAssistExpression = CONTENT_ASSIST_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaceholderExpression() <em>Placeholder Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholderExpression() <em>Placeholder Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderExpression()
	 * @generated
	 * @ordered
	 */
	protected String placeholderExpression = PLACEHOLDER_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineCount() <em>Line Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineCount()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_COUNT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLineCount() <em>Line Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineCount()
	 * @generated
	 * @ordered
	 */
	protected int lineCount = LINE_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected EEFTextStyle style;

	/**
	 * The cached value of the '{@link #getConditionalStyles() <em>Conditional Styles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFTextConditionalStyle> conditionalStyles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFTextDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_TEXT_DESCRIPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TEXT_DESCRIPTION__VALUE_EXPRESSION, oldValueExpression,
					valueExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION, oldEditExpression,
					editExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReadOnlyExpression() {
		return readOnlyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadOnlyExpression(String newReadOnlyExpression) {
		String oldReadOnlyExpression = readOnlyExpression;
		readOnlyExpression = newReadOnlyExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TEXT_DESCRIPTION__READ_ONLY_EXPRESSION, oldReadOnlyExpression,
					readOnlyExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentAssistExpression() {
		return contentAssistExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentAssistExpression(String newContentAssistExpression) {
		String oldContentAssistExpression = contentAssistExpression;
		contentAssistExpression = newContentAssistExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TEXT_DESCRIPTION__CONTENT_ASSIST_EXPRESSION,
					oldContentAssistExpression, contentAssistExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlaceholderExpression() {
		return placeholderExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlaceholderExpression(String newPlaceholderExpression) {
		String oldPlaceholderExpression = placeholderExpression;
		placeholderExpression = newPlaceholderExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TEXT_DESCRIPTION__PLACEHOLDER_EXPRESSION, oldPlaceholderExpression,
					placeholderExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLineCount() {
		return lineCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineCount(int newLineCount) {
		int oldLineCount = lineCount;
		lineCount = newLineCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TEXT_DESCRIPTION__LINE_COUNT, oldLineCount, lineCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFTextStyle getStyle() {
		if (style != null && style.eIsProxy()) {
			InternalEObject oldStyle = (InternalEObject) style;
			style = (EEFTextStyle) eResolveProxy(oldStyle);
			if (style != oldStyle) {
				InternalEObject newStyle = (InternalEObject) style;
				NotificationChain msgs = oldStyle.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EefPackage.EEF_TEXT_DESCRIPTION__STYLE, null, null);
				if (newStyle.eInternalContainer() == null) {
					msgs = newStyle.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EefPackage.EEF_TEXT_DESCRIPTION__STYLE, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefPackage.EEF_TEXT_DESCRIPTION__STYLE, oldStyle, style));
			}
		}
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFTextStyle basicGetStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(EEFTextStyle newStyle, NotificationChain msgs) {
		EEFTextStyle oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TEXT_DESCRIPTION__STYLE, oldStyle,
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
	public void setStyle(EEFTextStyle newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null)
				msgs = ((InternalEObject) style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EefPackage.EEF_TEXT_DESCRIPTION__STYLE, null, msgs);
			if (newStyle != null)
				msgs = ((InternalEObject) newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EefPackage.EEF_TEXT_DESCRIPTION__STYLE, null, msgs);
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TEXT_DESCRIPTION__STYLE, newStyle, newStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEFTextConditionalStyle> getConditionalStyles() {
		if (conditionalStyles == null) {
			conditionalStyles = new EObjectContainmentEList.Resolving<EEFTextConditionalStyle>(EEFTextConditionalStyle.class, this,
					EefPackage.EEF_TEXT_DESCRIPTION__CONDITIONAL_STYLES);
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
		case EefPackage.EEF_TEXT_DESCRIPTION__STYLE:
			return basicSetStyle(null, msgs);
		case EefPackage.EEF_TEXT_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefPackage.EEF_TEXT_DESCRIPTION__VALUE_EXPRESSION:
			return getValueExpression();
		case EefPackage.EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION:
			return getEditExpression();
		case EefPackage.EEF_TEXT_DESCRIPTION__READ_ONLY_EXPRESSION:
			return getReadOnlyExpression();
		case EefPackage.EEF_TEXT_DESCRIPTION__CONTENT_ASSIST_EXPRESSION:
			return getContentAssistExpression();
		case EefPackage.EEF_TEXT_DESCRIPTION__PLACEHOLDER_EXPRESSION:
			return getPlaceholderExpression();
		case EefPackage.EEF_TEXT_DESCRIPTION__LINE_COUNT:
			return getLineCount();
		case EefPackage.EEF_TEXT_DESCRIPTION__STYLE:
			if (resolve)
				return getStyle();
			return basicGetStyle();
		case EefPackage.EEF_TEXT_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefPackage.EEF_TEXT_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression((String) newValue);
			return;
		case EefPackage.EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression((String) newValue);
			return;
		case EefPackage.EEF_TEXT_DESCRIPTION__READ_ONLY_EXPRESSION:
			setReadOnlyExpression((String) newValue);
			return;
		case EefPackage.EEF_TEXT_DESCRIPTION__CONTENT_ASSIST_EXPRESSION:
			setContentAssistExpression((String) newValue);
			return;
		case EefPackage.EEF_TEXT_DESCRIPTION__PLACEHOLDER_EXPRESSION:
			setPlaceholderExpression((String) newValue);
			return;
		case EefPackage.EEF_TEXT_DESCRIPTION__LINE_COUNT:
			setLineCount((Integer) newValue);
			return;
		case EefPackage.EEF_TEXT_DESCRIPTION__STYLE:
			setStyle((EEFTextStyle) newValue);
			return;
		case EefPackage.EEF_TEXT_DESCRIPTION__CONDITIONAL_STYLES:
			getConditionalStyles().clear();
			getConditionalStyles().addAll((Collection<? extends EEFTextConditionalStyle>) newValue);
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
		case EefPackage.EEF_TEXT_DESCRIPTION__VALUE_EXPRESSION:
			setValueExpression(VALUE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION:
			setEditExpression(EDIT_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_TEXT_DESCRIPTION__READ_ONLY_EXPRESSION:
			setReadOnlyExpression(READ_ONLY_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_TEXT_DESCRIPTION__CONTENT_ASSIST_EXPRESSION:
			setContentAssistExpression(CONTENT_ASSIST_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_TEXT_DESCRIPTION__PLACEHOLDER_EXPRESSION:
			setPlaceholderExpression(PLACEHOLDER_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_TEXT_DESCRIPTION__LINE_COUNT:
			setLineCount(LINE_COUNT_EDEFAULT);
			return;
		case EefPackage.EEF_TEXT_DESCRIPTION__STYLE:
			setStyle((EEFTextStyle) null);
			return;
		case EefPackage.EEF_TEXT_DESCRIPTION__CONDITIONAL_STYLES:
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
		case EefPackage.EEF_TEXT_DESCRIPTION__VALUE_EXPRESSION:
			return VALUE_EXPRESSION_EDEFAULT == null ? valueExpression != null : !VALUE_EXPRESSION_EDEFAULT.equals(valueExpression);
		case EefPackage.EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION:
			return EDIT_EXPRESSION_EDEFAULT == null ? editExpression != null : !EDIT_EXPRESSION_EDEFAULT.equals(editExpression);
		case EefPackage.EEF_TEXT_DESCRIPTION__READ_ONLY_EXPRESSION:
			return READ_ONLY_EXPRESSION_EDEFAULT == null ? readOnlyExpression != null : !READ_ONLY_EXPRESSION_EDEFAULT.equals(readOnlyExpression);
		case EefPackage.EEF_TEXT_DESCRIPTION__CONTENT_ASSIST_EXPRESSION:
			return CONTENT_ASSIST_EXPRESSION_EDEFAULT == null ? contentAssistExpression != null
					: !CONTENT_ASSIST_EXPRESSION_EDEFAULT.equals(contentAssistExpression);
		case EefPackage.EEF_TEXT_DESCRIPTION__PLACEHOLDER_EXPRESSION:
			return PLACEHOLDER_EXPRESSION_EDEFAULT == null ? placeholderExpression != null
					: !PLACEHOLDER_EXPRESSION_EDEFAULT.equals(placeholderExpression);
		case EefPackage.EEF_TEXT_DESCRIPTION__LINE_COUNT:
			return lineCount != LINE_COUNT_EDEFAULT;
		case EefPackage.EEF_TEXT_DESCRIPTION__STYLE:
			return style != null;
		case EefPackage.EEF_TEXT_DESCRIPTION__CONDITIONAL_STYLES:
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
		result.append(", readOnlyExpression: "); //$NON-NLS-1$
		result.append(readOnlyExpression);
		result.append(", contentAssistExpression: "); //$NON-NLS-1$
		result.append(contentAssistExpression);
		result.append(", placeholderExpression: "); //$NON-NLS-1$
		result.append(placeholderExpression);
		result.append(", lineCount: "); //$NON-NLS-1$
		result.append(lineCount);
		result.append(')');
		return result.toString();
	}

} //EEFTextDescriptionImpl
