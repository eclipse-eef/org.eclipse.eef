/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import org.eclipse.eef.EEFToolbarAction;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Toolbar Action</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFToolbarActionImpl#getTooltipExpression <em>Tooltip Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFToolbarActionImpl#getImageExpression <em>Image Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFToolbarActionImpl#getActionExpression <em>Action Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFToolbarActionImpl extends MinimalEObjectImpl.Container implements EEFToolbarAction {
	/**
	 * The default value of the '{@link #getTooltipExpression() <em>Tooltip Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getTooltipExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOLTIP_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTooltipExpression() <em>Tooltip Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getTooltipExpression()
	 * @generated
	 * @ordered
	 */
	protected String tooltipExpression = EEFToolbarActionImpl.TOOLTIP_EXPRESSION_EDEFAULT;

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
	protected String imageExpression = EEFToolbarActionImpl.IMAGE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionExpression() <em>Action Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getActionExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionExpression() <em>Action Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getActionExpression()
	 * @generated
	 * @ordered
	 */
	protected String actionExpression = EEFToolbarActionImpl.ACTION_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFToolbarActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_TOOLBAR_ACTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getTooltipExpression() {
		return tooltipExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setTooltipExpression(String newTooltipExpression) {
		String oldTooltipExpression = tooltipExpression;
		tooltipExpression = newTooltipExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TOOLBAR_ACTION__TOOLTIP_EXPRESSION, oldTooltipExpression,
					tooltipExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TOOLBAR_ACTION__IMAGE_EXPRESSION, oldImageExpression,
					imageExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getActionExpression() {
		return actionExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setActionExpression(String newActionExpression) {
		String oldActionExpression = actionExpression;
		actionExpression = newActionExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_TOOLBAR_ACTION__ACTION_EXPRESSION, oldActionExpression,
					actionExpression));
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
		case EefPackage.EEF_TOOLBAR_ACTION__TOOLTIP_EXPRESSION:
			return getTooltipExpression();
		case EefPackage.EEF_TOOLBAR_ACTION__IMAGE_EXPRESSION:
			return getImageExpression();
		case EefPackage.EEF_TOOLBAR_ACTION__ACTION_EXPRESSION:
			return getActionExpression();
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
		case EefPackage.EEF_TOOLBAR_ACTION__TOOLTIP_EXPRESSION:
			setTooltipExpression((String) newValue);
			return;
		case EefPackage.EEF_TOOLBAR_ACTION__IMAGE_EXPRESSION:
			setImageExpression((String) newValue);
			return;
		case EefPackage.EEF_TOOLBAR_ACTION__ACTION_EXPRESSION:
			setActionExpression((String) newValue);
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
		case EefPackage.EEF_TOOLBAR_ACTION__TOOLTIP_EXPRESSION:
			setTooltipExpression(EEFToolbarActionImpl.TOOLTIP_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_TOOLBAR_ACTION__IMAGE_EXPRESSION:
			setImageExpression(EEFToolbarActionImpl.IMAGE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_TOOLBAR_ACTION__ACTION_EXPRESSION:
			setActionExpression(EEFToolbarActionImpl.ACTION_EXPRESSION_EDEFAULT);
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
		case EefPackage.EEF_TOOLBAR_ACTION__TOOLTIP_EXPRESSION:
			return EEFToolbarActionImpl.TOOLTIP_EXPRESSION_EDEFAULT == null ? tooltipExpression != null
					: !EEFToolbarActionImpl.TOOLTIP_EXPRESSION_EDEFAULT.equals(tooltipExpression);
		case EefPackage.EEF_TOOLBAR_ACTION__IMAGE_EXPRESSION:
			return EEFToolbarActionImpl.IMAGE_EXPRESSION_EDEFAULT == null ? imageExpression != null
					: !EEFToolbarActionImpl.IMAGE_EXPRESSION_EDEFAULT.equals(imageExpression);
		case EefPackage.EEF_TOOLBAR_ACTION__ACTION_EXPRESSION:
			return EEFToolbarActionImpl.ACTION_EXPRESSION_EDEFAULT == null ? actionExpression != null
					: !EEFToolbarActionImpl.ACTION_EXPRESSION_EDEFAULT.equals(actionExpression);
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
		result.append(" (tooltipExpression: "); //$NON-NLS-1$
		result.append(tooltipExpression);
		result.append(", imageExpression: "); //$NON-NLS-1$
		result.append(imageExpression);
		result.append(", actionExpression: "); //$NON-NLS-1$
		result.append(actionExpression);
		result.append(')');
		return result.toString();
	}

} // EEFToolbarActionImpl
