/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 */
package org.eclipse.sirius.expression.expression.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.sirius.expression.expression.ExpressionDescription;
import org.eclipse.sirius.expression.expression.ExpressionPackage;
import org.eclipse.sirius.expression.expression.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.expression.expression.impl.ExpressionDescriptionImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.sirius.expression.expression.impl.ExpressionDescriptionImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.sirius.expression.expression.impl.ExpressionDescriptionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.sirius.expression.expression.impl.ExpressionDescriptionImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.eclipse.sirius.expression.expression.impl.ExpressionDescriptionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.sirius.expression.expression.impl.ExpressionDescriptionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.sirius.expression.expression.impl.ExpressionDescriptionImpl#getContextableElements <em>Contextable Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionDescriptionImpl extends MinimalEObjectImpl.Container implements ExpressionDescription {
	/**
	 * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBound()
	 * @generated
	 * @ordered
	 */
	protected int lowerBound = LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_BOUND_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected int upperBound = UPPER_BOUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature expression;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected EClassifier returnType;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContextableElements() <em>Contextable Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextableElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> contextableElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.EXPRESSION_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerBound() {
		return lowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerBound(int newLowerBound) {
		int oldLowerBound = lowerBound;
		lowerBound = newLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.EXPRESSION_DESCRIPTION__LOWER_BOUND, oldLowerBound, lowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(int newUpperBound) {
		int oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.EXPRESSION_DESCRIPTION__UPPER_BOUND, oldUpperBound, upperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getExpression() {
		if (expression != null && expression.eIsProxy()) {
			InternalEObject oldExpression = (InternalEObject)expression;
			expression = (EStructuralFeature)eResolveProxy(oldExpression);
			if (expression != oldExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionPackage.EXPRESSION_DESCRIPTION__EXPRESSION, oldExpression, expression));
			}
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(EStructuralFeature newExpression) {
		EStructuralFeature oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.EXPRESSION_DESCRIPTION__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectResolvingEList<Variable>(Variable.class, this, ExpressionPackage.EXPRESSION_DESCRIPTION__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (EClassifier)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExpressionPackage.EXPRESSION_DESCRIPTION__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(EClassifier newReturnType) {
		EClassifier oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.EXPRESSION_DESCRIPTION__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.EXPRESSION_DESCRIPTION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getContextableElements() {
		if (contextableElements == null) {
			contextableElements = new EObjectResolvingEList<EClass>(EClass.class, this, ExpressionPackage.EXPRESSION_DESCRIPTION__CONTEXTABLE_ELEMENTS);
		}
		return contextableElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExpressionPackage.EXPRESSION_DESCRIPTION__LOWER_BOUND:
				return getLowerBound();
			case ExpressionPackage.EXPRESSION_DESCRIPTION__UPPER_BOUND:
				return getUpperBound();
			case ExpressionPackage.EXPRESSION_DESCRIPTION__EXPRESSION:
				if (resolve) return getExpression();
				return basicGetExpression();
			case ExpressionPackage.EXPRESSION_DESCRIPTION__VARIABLES:
				return getVariables();
			case ExpressionPackage.EXPRESSION_DESCRIPTION__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
			case ExpressionPackage.EXPRESSION_DESCRIPTION__LABEL:
				return getLabel();
			case ExpressionPackage.EXPRESSION_DESCRIPTION__CONTEXTABLE_ELEMENTS:
				return getContextableElements();
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
			case ExpressionPackage.EXPRESSION_DESCRIPTION__LOWER_BOUND:
				setLowerBound((Integer)newValue);
				return;
			case ExpressionPackage.EXPRESSION_DESCRIPTION__UPPER_BOUND:
				setUpperBound((Integer)newValue);
				return;
			case ExpressionPackage.EXPRESSION_DESCRIPTION__EXPRESSION:
				setExpression((EStructuralFeature)newValue);
				return;
			case ExpressionPackage.EXPRESSION_DESCRIPTION__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case ExpressionPackage.EXPRESSION_DESCRIPTION__RETURN_TYPE:
				setReturnType((EClassifier)newValue);
				return;
			case ExpressionPackage.EXPRESSION_DESCRIPTION__LABEL:
				setLabel((String)newValue);
				return;
			case ExpressionPackage.EXPRESSION_DESCRIPTION__CONTEXTABLE_ELEMENTS:
				getContextableElements().clear();
				getContextableElements().addAll((Collection<? extends EClass>)newValue);
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
			case ExpressionPackage.EXPRESSION_DESCRIPTION__LOWER_BOUND:
				setLowerBound(LOWER_BOUND_EDEFAULT);
				return;
			case ExpressionPackage.EXPRESSION_DESCRIPTION__UPPER_BOUND:
				setUpperBound(UPPER_BOUND_EDEFAULT);
				return;
			case ExpressionPackage.EXPRESSION_DESCRIPTION__EXPRESSION:
				setExpression((EStructuralFeature)null);
				return;
			case ExpressionPackage.EXPRESSION_DESCRIPTION__VARIABLES:
				getVariables().clear();
				return;
			case ExpressionPackage.EXPRESSION_DESCRIPTION__RETURN_TYPE:
				setReturnType((EClassifier)null);
				return;
			case ExpressionPackage.EXPRESSION_DESCRIPTION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ExpressionPackage.EXPRESSION_DESCRIPTION__CONTEXTABLE_ELEMENTS:
				getContextableElements().clear();
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
			case ExpressionPackage.EXPRESSION_DESCRIPTION__LOWER_BOUND:
				return lowerBound != LOWER_BOUND_EDEFAULT;
			case ExpressionPackage.EXPRESSION_DESCRIPTION__UPPER_BOUND:
				return upperBound != UPPER_BOUND_EDEFAULT;
			case ExpressionPackage.EXPRESSION_DESCRIPTION__EXPRESSION:
				return expression != null;
			case ExpressionPackage.EXPRESSION_DESCRIPTION__VARIABLES:
				return variables != null && !variables.isEmpty();
			case ExpressionPackage.EXPRESSION_DESCRIPTION__RETURN_TYPE:
				return returnType != null;
			case ExpressionPackage.EXPRESSION_DESCRIPTION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ExpressionPackage.EXPRESSION_DESCRIPTION__CONTEXTABLE_ELEMENTS:
				return contextableElements != null && !contextableElements.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lowerBound: "); //$NON-NLS-1$
		result.append(lowerBound);
		result.append(", upperBound: "); //$NON-NLS-1$
		result.append(upperBound);
		result.append(", label: "); //$NON-NLS-1$
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ExpressionDescriptionImpl
