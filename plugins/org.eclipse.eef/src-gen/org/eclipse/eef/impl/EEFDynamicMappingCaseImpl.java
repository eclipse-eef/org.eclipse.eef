/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import org.eclipse.eef.EEFDynamicMappingCase;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Dynamic Mapping Case</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFDynamicMappingCaseImpl#getCaseExpression <em>Case Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFDynamicMappingCaseImpl#getWidget <em>Widget</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEFDynamicMappingCaseImpl extends MinimalEObjectImpl.Container implements EEFDynamicMappingCase {
	/**
	 * The default value of the '{@link #getCaseExpression() <em>Case Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #getCaseExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String CASE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaseExpression() <em>Case Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #getCaseExpression()
	 * @generated
	 * @ordered
	 */
	protected String caseExpression = EEFDynamicMappingCaseImpl.CASE_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWidget() <em>Widget</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getWidget()
	 * @generated
	 * @ordered
	 */
	protected EEFWidgetDescription widget;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFDynamicMappingCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_DYNAMIC_MAPPING_CASE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getCaseExpression() {
		return caseExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setCaseExpression(String newCaseExpression) {
		String oldCaseExpression = caseExpression;
		caseExpression = newCaseExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_DYNAMIC_MAPPING_CASE__CASE_EXPRESSION, oldCaseExpression,
					caseExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EEFWidgetDescription getWidget() {
		if (widget != null && widget.eIsProxy()) {
			InternalEObject oldWidget = (InternalEObject) widget;
			widget = (EEFWidgetDescription) eResolveProxy(oldWidget);
			if (widget != oldWidget) {
				InternalEObject newWidget = (InternalEObject) widget;
				NotificationChain msgs = oldWidget.eInverseRemove(this, InternalEObject.EOPPOSITE_FEATURE_BASE
						- EefPackage.EEF_DYNAMIC_MAPPING_CASE__WIDGET, null, null);
				if (newWidget.eInternalContainer() == null) {
					msgs = newWidget.eInverseAdd(this, InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_DYNAMIC_MAPPING_CASE__WIDGET, null,
							msgs);
				}
				if (msgs != null) {
					msgs.dispatch();
				}
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefPackage.EEF_DYNAMIC_MAPPING_CASE__WIDGET, oldWidget, widget));
				}
			}
		}
		return widget;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EEFWidgetDescription basicGetWidget() {
		return widget;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetWidget(EEFWidgetDescription newWidget, NotificationChain msgs) {
		EEFWidgetDescription oldWidget = widget;
		widget = newWidget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EefPackage.EEF_DYNAMIC_MAPPING_CASE__WIDGET, oldWidget,
					newWidget);
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
	public void setWidget(EEFWidgetDescription newWidget) {
		if (newWidget != widget) {
			NotificationChain msgs = null;
			if (widget != null) {
				msgs = ((InternalEObject) widget).eInverseRemove(this, InternalEObject.EOPPOSITE_FEATURE_BASE
						- EefPackage.EEF_DYNAMIC_MAPPING_CASE__WIDGET, null, msgs);
			}
			if (newWidget != null) {
				msgs = ((InternalEObject) newWidget).eInverseAdd(this, InternalEObject.EOPPOSITE_FEATURE_BASE
						- EefPackage.EEF_DYNAMIC_MAPPING_CASE__WIDGET, null, msgs);
			}
			msgs = basicSetWidget(newWidget, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_DYNAMIC_MAPPING_CASE__WIDGET, newWidget, newWidget));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_DYNAMIC_MAPPING_CASE__WIDGET:
			return basicSetWidget(null, msgs);
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
		case EefPackage.EEF_DYNAMIC_MAPPING_CASE__CASE_EXPRESSION:
			return getCaseExpression();
		case EefPackage.EEF_DYNAMIC_MAPPING_CASE__WIDGET:
			if (resolve) {
				return getWidget();
			}
			return basicGetWidget();
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
		case EefPackage.EEF_DYNAMIC_MAPPING_CASE__CASE_EXPRESSION:
			setCaseExpression((String) newValue);
			return;
		case EefPackage.EEF_DYNAMIC_MAPPING_CASE__WIDGET:
			setWidget((EEFWidgetDescription) newValue);
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
		case EefPackage.EEF_DYNAMIC_MAPPING_CASE__CASE_EXPRESSION:
			setCaseExpression(EEFDynamicMappingCaseImpl.CASE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_DYNAMIC_MAPPING_CASE__WIDGET:
			setWidget((EEFWidgetDescription) null);
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
		case EefPackage.EEF_DYNAMIC_MAPPING_CASE__CASE_EXPRESSION:
			return EEFDynamicMappingCaseImpl.CASE_EXPRESSION_EDEFAULT == null ? caseExpression != null
			: !EEFDynamicMappingCaseImpl.CASE_EXPRESSION_EDEFAULT.equals(caseExpression);
		case EefPackage.EEF_DYNAMIC_MAPPING_CASE__WIDGET:
			return widget != null;
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
		result.append(" (caseExpression: "); //$NON-NLS-1$
		result.append(caseExpression);
		result.append(')');
		return result.toString();
	}

} // EEFDynamicMappingCaseImpl
