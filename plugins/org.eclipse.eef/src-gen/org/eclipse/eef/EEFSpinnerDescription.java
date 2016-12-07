/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>EEF Spinner Description</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> Represents a spinner in the user interface. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.EEFSpinnerDescription#getValueExpression <em>Value Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFSpinnerDescription#getEditExpression <em>Edit Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFSpinnerDescription#getDigitsExpression <em>Digits Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFSpinnerDescription#getIncrementExpression <em>Increment Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFSpinnerDescription#getMinExpression <em>Min Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFSpinnerDescription#getMaxExpression <em>Max Expression</em>}</li>
 * <li>{@link org.eclipse.eef.EEFSpinnerDescription#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.eef.EEFSpinnerDescription#getConditionalStyles <em>Conditional Styles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eef.EefPackage#getEEFSpinnerDescription()
 * @model
 * @generated
 */
public interface EEFSpinnerDescription extends EEFWidgetDescription {
	/**
	 * Returns the value of the '<em><b>Value Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Label of the spinner visible in the user interface. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Value Expression</em>' attribute.
	 * @see #setValueExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFSpinnerDescription_ValueExpression()
	 * @model
	 * @generated
	 */
	String getValueExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFSpinnerDescription#getValueExpression <em>Value
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Expression</em>' attribute.
	 * @see #getValueExpression()
	 * @generated
	 */
	void setValueExpression(String value);

	/**
	 * Returns the value of the '<em><b>Edit Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Defines the behavior executed when the end-user updates the value of the spinner.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Edit Expression</em>' attribute.
	 * @see #setEditExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFSpinnerDescription_EditExpression()
	 * @model
	 * @generated
	 */
	String getEditExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFSpinnerDescription#getEditExpression <em>Edit Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Edit Expression</em>' attribute.
	 * @see #getEditExpression()
	 * @generated
	 */
	void setEditExpression(String value);

	/**
	 * Returns the value of the '<em><b>Digits Expression</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Sets the number of decimal places used by the receiver. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Digits Expression</em>' attribute.
	 * @see #setDigitsExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFSpinnerDescription_DigitsExpression()
	 * @model
	 * @generated
	 */
	String getDigitsExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFSpinnerDescription#getDigitsExpression <em>Digits
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Digits Expression</em>' attribute.
	 * @see #getDigitsExpression()
	 * @generated
	 */
	void setDigitsExpression(String value);

	/**
	 * Returns the value of the '<em><b>Increment Expression</b></em>' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc --> <!-- begin-model-doc --> Sets the amount that the receiver's value will be modified by when the
	 * up/down arrows are pressed to the argument, which must be at least one. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Increment Expression</em>' attribute.
	 * @see #setIncrementExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFSpinnerDescription_IncrementExpression()
	 * @model
	 * @generated
	 */
	String getIncrementExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFSpinnerDescription#getIncrementExpression <em>Increment
	 * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Increment Expression</em>' attribute.
	 * @see #getIncrementExpression()
	 * @generated
	 */
	void setIncrementExpression(String value);

	/**
	 * Returns the value of the '<em><b>Min Expression</b></em>' attribute. The default value is <code>""</code>. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Sets the minimum value that the receiver will
	 * allow. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Min Expression</em>' attribute.
	 * @see #setMinExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFSpinnerDescription_MinExpression()
	 * @model default=""
	 * @generated
	 */
	String getMinExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFSpinnerDescription#getMinExpression <em>Min Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Min Expression</em>' attribute.
	 * @see #getMinExpression()
	 * @generated
	 */
	void setMinExpression(String value);

	/**
	 * Returns the value of the '<em><b>Max Expression</b></em>' attribute. The default value is <code>""</code>. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Sets the maximum value that the receiver will
	 * allow. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Max Expression</em>' attribute.
	 * @see #setMaxExpression(String)
	 * @see org.eclipse.eef.EefPackage#getEEFSpinnerDescription_MaxExpression()
	 * @model default=""
	 * @generated
	 */
	String getMaxExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFSpinnerDescription#getMaxExpression <em>Max Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Max Expression</em>' attribute.
	 * @see #getMaxExpression()
	 * @generated
	 */
	void setMaxExpression(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * --> <!-- begin-model-doc --> Defines the spinner style <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(EEFSpinnerStyle)
	 * @see org.eclipse.eef.EefPackage#getEEFSpinnerDescription_Style()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EEFSpinnerStyle getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.eef.EEFSpinnerDescription#getStyle <em>Style</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(EEFSpinnerStyle value);

	/**
	 * Returns the value of the '<em><b>Conditional Styles</b></em>' containment reference list. The list contents are
	 * of type {@link org.eclipse.eef.EEFSpinnerConditionalStyle}. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Defines the spinner style associated to a precondition <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Conditional Styles</em>' containment reference list.
	 * @see org.eclipse.eef.EefPackage#getEEFSpinnerDescription_ConditionalStyles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEFSpinnerConditionalStyle> getConditionalStyles();

} // EEFSpinnerDescription
