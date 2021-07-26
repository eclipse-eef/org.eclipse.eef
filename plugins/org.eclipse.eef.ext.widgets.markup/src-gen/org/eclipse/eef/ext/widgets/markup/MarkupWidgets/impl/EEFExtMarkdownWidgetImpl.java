/**
 * Copyright (c) Israel Aerospace Industries, Eclipse contributors and others 2021.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Israel Aerospace Industries - initial API and implementation
 */
package org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl;

import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtMarkdownWidget;
import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.MarkupWidgetsPackage;

import org.eclipse.eef.impl.EEFWidgetDescriptionImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Ext Markdown Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.EEFExtMarkdownWidgetImpl#getValueExpression <em>Value Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.EEFExtMarkdownWidgetImpl#getNumberOfLine <em>Number Of Line</em>}</li>
 *   <li>{@link org.eclipse.eef.ext.widgets.markup.MarkupWidgets.impl.EEFExtMarkdownWidgetImpl#getEditExpression <em>Edit Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFExtMarkdownWidgetImpl extends EEFWidgetDescriptionImpl implements EEFExtMarkdownWidget {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) Israel Aerospace Industries, Eclipse contributors and others 2021.\nThis program and the accompanying materials\nare made available under the terms of the Eclipse Public License 2.0\nwhich accompanies this distribution, and is available at\nhttps://www.eclipse.org/legal/epl-2.0/\n\nSPDX-License-Identifier: EPL-2.0\n\nContributors:\n   Israel Aerospace Industries - initial API and implementation";

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
	 * The default value of the '{@link #getNumberOfLine() <em>Number Of Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfLine()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_LINE_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getNumberOfLine() <em>Number Of Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfLine()
	 * @generated
	 * @ordered
	 */
	protected int numberOfLine = NUMBER_OF_LINE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFExtMarkdownWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MarkupWidgetsPackage.Literals.EEF_EXT_MARKDOWN_WIDGET;
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
					MarkupWidgetsPackage.EEF_EXT_MARKDOWN_WIDGET__VALUE_EXPRESSION, oldValueExpression,
					valueExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfLine() {
		return numberOfLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfLine(int newNumberOfLine) {
		int oldNumberOfLine = numberOfLine;
		numberOfLine = newNumberOfLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MarkupWidgetsPackage.EEF_EXT_MARKDOWN_WIDGET__NUMBER_OF_LINE, oldNumberOfLine, numberOfLine));
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
					MarkupWidgetsPackage.EEF_EXT_MARKDOWN_WIDGET__EDIT_EXPRESSION, oldEditExpression, editExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MarkupWidgetsPackage.EEF_EXT_MARKDOWN_WIDGET__VALUE_EXPRESSION:
			return getValueExpression();
		case MarkupWidgetsPackage.EEF_EXT_MARKDOWN_WIDGET__NUMBER_OF_LINE:
			return getNumberOfLine();
		case MarkupWidgetsPackage.EEF_EXT_MARKDOWN_WIDGET__EDIT_EXPRESSION:
			return getEditExpression();
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
		case MarkupWidgetsPackage.EEF_EXT_MARKDOWN_WIDGET__VALUE_EXPRESSION:
			setValueExpression((String) newValue);
			return;
		case MarkupWidgetsPackage.EEF_EXT_MARKDOWN_WIDGET__NUMBER_OF_LINE:
			setNumberOfLine((Integer) newValue);
			return;
		case MarkupWidgetsPackage.EEF_EXT_MARKDOWN_WIDGET__EDIT_EXPRESSION:
			setEditExpression((String) newValue);
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
		case MarkupWidgetsPackage.EEF_EXT_MARKDOWN_WIDGET__VALUE_EXPRESSION:
			setValueExpression(VALUE_EXPRESSION_EDEFAULT);
			return;
		case MarkupWidgetsPackage.EEF_EXT_MARKDOWN_WIDGET__NUMBER_OF_LINE:
			setNumberOfLine(NUMBER_OF_LINE_EDEFAULT);
			return;
		case MarkupWidgetsPackage.EEF_EXT_MARKDOWN_WIDGET__EDIT_EXPRESSION:
			setEditExpression(EDIT_EXPRESSION_EDEFAULT);
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
		case MarkupWidgetsPackage.EEF_EXT_MARKDOWN_WIDGET__VALUE_EXPRESSION:
			return VALUE_EXPRESSION_EDEFAULT == null ? valueExpression != null
					: !VALUE_EXPRESSION_EDEFAULT.equals(valueExpression);
		case MarkupWidgetsPackage.EEF_EXT_MARKDOWN_WIDGET__NUMBER_OF_LINE:
			return numberOfLine != NUMBER_OF_LINE_EDEFAULT;
		case MarkupWidgetsPackage.EEF_EXT_MARKDOWN_WIDGET__EDIT_EXPRESSION:
			return EDIT_EXPRESSION_EDEFAULT == null ? editExpression != null
					: !EDIT_EXPRESSION_EDEFAULT.equals(editExpression);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (valueExpression: ");
		result.append(valueExpression);
		result.append(", numberOfLine: ");
		result.append(numberOfLine);
		result.append(", editExpression: ");
		result.append(editExpression);
		result.append(')');
		return result.toString();
	}

} //EEFExtMarkdownWidgetImpl
