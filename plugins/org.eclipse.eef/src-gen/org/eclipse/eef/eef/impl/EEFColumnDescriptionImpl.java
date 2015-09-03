/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef.impl;

import org.eclipse.eef.eef.EEFCellWidgetDescription;
import org.eclipse.eef.eef.EEFColumnDescription;
import org.eclipse.eef.eef.EefPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Column Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFColumnDescriptionImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFColumnDescriptionImpl#getHeaderExpression <em>Header Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFColumnDescriptionImpl#getCellWidget <em>Cell Widget</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFColumnDescriptionImpl#getContextCandidatesExpression <em>Context Candidates Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFColumnDescriptionImpl extends MinimalEObjectImpl.Container implements EEFColumnDescription {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeaderExpression() <em>Header Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaderExpression() <em>Header Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderExpression()
	 * @generated
	 * @ordered
	 */
	protected String headerExpression = HEADER_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCellWidget() <em>Cell Widget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellWidget()
	 * @generated
	 * @ordered
	 */
	protected EEFCellWidgetDescription cellWidget;

	/**
	 * The default value of the '{@link #getContextCandidatesExpression() <em>Context Candidates Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextCandidatesExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_CANDIDATES_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextCandidatesExpression() <em>Context Candidates Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextCandidatesExpression()
	 * @generated
	 * @ordered
	 */
	protected String contextCandidatesExpression = CONTEXT_CANDIDATES_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFColumnDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_COLUMN_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_COLUMN_DESCRIPTION__WIDTH, oldWidth,
					width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeaderExpression() {
		return headerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderExpression(String newHeaderExpression) {
		String oldHeaderExpression = headerExpression;
		headerExpression = newHeaderExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_COLUMN_DESCRIPTION__HEADER_EXPRESSION,
					oldHeaderExpression, headerExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFCellWidgetDescription getCellWidget() {
		if (cellWidget != null && cellWidget.eIsProxy()) {
			InternalEObject oldCellWidget = (InternalEObject) cellWidget;
			cellWidget = (EEFCellWidgetDescription) eResolveProxy(oldCellWidget);
			if (cellWidget != oldCellWidget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EefPackage.EEF_COLUMN_DESCRIPTION__CELL_WIDGET, oldCellWidget, cellWidget));
			}
		}
		return cellWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFCellWidgetDescription basicGetCellWidget() {
		return cellWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCellWidget(EEFCellWidgetDescription newCellWidget) {
		EEFCellWidgetDescription oldCellWidget = cellWidget;
		cellWidget = newCellWidget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_COLUMN_DESCRIPTION__CELL_WIDGET,
					oldCellWidget, cellWidget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContextCandidatesExpression() {
		return contextCandidatesExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextCandidatesExpression(String newContextCandidatesExpression) {
		String oldContextCandidatesExpression = contextCandidatesExpression;
		contextCandidatesExpression = newContextCandidatesExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefPackage.EEF_COLUMN_DESCRIPTION__CONTEXT_CANDIDATES_EXPRESSION, oldContextCandidatesExpression,
					contextCandidatesExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.EEF_COLUMN_DESCRIPTION__WIDTH:
			return getWidth();
		case EefPackage.EEF_COLUMN_DESCRIPTION__HEADER_EXPRESSION:
			return getHeaderExpression();
		case EefPackage.EEF_COLUMN_DESCRIPTION__CELL_WIDGET:
			if (resolve)
				return getCellWidget();
			return basicGetCellWidget();
		case EefPackage.EEF_COLUMN_DESCRIPTION__CONTEXT_CANDIDATES_EXPRESSION:
			return getContextCandidatesExpression();
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
		case EefPackage.EEF_COLUMN_DESCRIPTION__WIDTH:
			setWidth((Integer) newValue);
			return;
		case EefPackage.EEF_COLUMN_DESCRIPTION__HEADER_EXPRESSION:
			setHeaderExpression((String) newValue);
			return;
		case EefPackage.EEF_COLUMN_DESCRIPTION__CELL_WIDGET:
			setCellWidget((EEFCellWidgetDescription) newValue);
			return;
		case EefPackage.EEF_COLUMN_DESCRIPTION__CONTEXT_CANDIDATES_EXPRESSION:
			setContextCandidatesExpression((String) newValue);
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
		case EefPackage.EEF_COLUMN_DESCRIPTION__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case EefPackage.EEF_COLUMN_DESCRIPTION__HEADER_EXPRESSION:
			setHeaderExpression(HEADER_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_COLUMN_DESCRIPTION__CELL_WIDGET:
			setCellWidget((EEFCellWidgetDescription) null);
			return;
		case EefPackage.EEF_COLUMN_DESCRIPTION__CONTEXT_CANDIDATES_EXPRESSION:
			setContextCandidatesExpression(CONTEXT_CANDIDATES_EXPRESSION_EDEFAULT);
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
		case EefPackage.EEF_COLUMN_DESCRIPTION__WIDTH:
			return width != WIDTH_EDEFAULT;
		case EefPackage.EEF_COLUMN_DESCRIPTION__HEADER_EXPRESSION:
			return HEADER_EXPRESSION_EDEFAULT == null ? headerExpression != null
					: !HEADER_EXPRESSION_EDEFAULT.equals(headerExpression);
		case EefPackage.EEF_COLUMN_DESCRIPTION__CELL_WIDGET:
			return cellWidget != null;
		case EefPackage.EEF_COLUMN_DESCRIPTION__CONTEXT_CANDIDATES_EXPRESSION:
			return CONTEXT_CANDIDATES_EXPRESSION_EDEFAULT == null ? contextCandidatesExpression != null
					: !CONTEXT_CANDIDATES_EXPRESSION_EDEFAULT.equals(contextCandidatesExpression);
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
		result.append(" (width: "); //$NON-NLS-1$
		result.append(width);
		result.append(", headerExpression: "); //$NON-NLS-1$
		result.append(headerExpression);
		result.append(", contextCandidatesExpression: "); //$NON-NLS-1$
		result.append(contextCandidatesExpression);
		result.append(')');
		return result.toString();
	}

} //EEFColumnDescriptionImpl
