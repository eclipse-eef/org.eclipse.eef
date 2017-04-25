/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference;

import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Ext Reference Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Allows the edition of a reference. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getReferenceNameExpression
 * <em>Reference Name Expression</em>}</li>
 * <li>{@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getReferenceOwnerExpression
 * <em>Reference Owner Expression</em>}</li>
 * <li>{@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getOnClickExpression
 * <em>On Click Expression</em>}</li>
 * <li>{@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getStyle
 * <em>Style</em>}</li>
 * <li>{@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getConditionalStyles
 * <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EefExtWidgetsReferencePackage#getEEFExtReferenceDescription()
 * @model
 * @generated
 */
public interface EEFExtReferenceDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Reference Name Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> The name of the reference to edit. <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Reference Name Expression</em>' attribute.
	 * @see #setReferenceNameExpression(String)
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EefExtWidgetsReferencePackage#getEEFExtReferenceDescription_ReferenceNameExpression()
	 * @model required="true"
	 * @generated
	 */
	String getReferenceNameExpression();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getReferenceNameExpression
	 * <em>Reference Name Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Reference Name Expression</em>' attribute.
	 * @see #getReferenceNameExpression()
	 * @generated
	 */
	void setReferenceNameExpression(String value);

	/**
	 * Returns the value of the '<em><b>Reference Owner Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> The EObject to use to evaluate the value of the reference <!--
	 * end-model-doc -->
	 *
	 * @return the value of the '<em>Reference Owner Expression</em>' attribute.
	 * @see #setReferenceOwnerExpression(String)
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EefExtWidgetsReferencePackage#getEEFExtReferenceDescription_ReferenceOwnerExpression()
	 * @model
	 * @generated
	 */
	String getReferenceOwnerExpression();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getReferenceOwnerExpression
	 * <em>Reference Owner Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Reference Owner Expression</em>' attribute.
	 * @see #getReferenceOwnerExpression()
	 * @generated
	 */
	void setReferenceOwnerExpression(String value);

	/**
	 * Returns the value of the '<em><b>On Click Expression</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Click Expression</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>On Click Expression</em>' attribute.
	 * @see #setOnClickExpression(String)
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EefExtWidgetsReferencePackage#getEEFExtReferenceDescription_OnClickExpression()
	 * @model
	 * @generated
	 */
	String getOnClickExpression();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getOnClickExpression
	 * <em>On Click Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>On Click Expression</em>' attribute.
	 * @see #getOnClickExpression()
	 * @generated
	 */
	void setOnClickExpression(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> The style of the reference widget <!-- end-model-doc -->
	 *
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(EEFExtReferenceWidgetStyle)
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EefExtWidgetsReferencePackage#getEEFExtReferenceDescription_Style()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFExtReferenceWidgetStyle getStyle();

	/**
	 * Sets the value of the
	 * '{@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceDescription#getStyle
	 * <em>Style</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(EEFExtReferenceWidgetStyle value);

	/**
	 * Returns the value of the '<em><b>Conditional Styles</b></em>' containment reference list. The list contents are
	 * of type {@link org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EEFExtReferenceConditionalStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Styles</em>' containment reference list isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Conditional Styles</em>' containment reference list.
	 * @see org.eclipse.eef.ext.widgets.reference.eefextwidgetsreference.EefExtWidgetsReferencePackage#getEEFExtReferenceDescription_ConditionalStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFExtReferenceConditionalStyle> getConditionalStyles();

} // EEFExtReferenceDescription
