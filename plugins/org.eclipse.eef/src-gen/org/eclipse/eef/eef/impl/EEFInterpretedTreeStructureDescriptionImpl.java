/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef.impl;

import org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription;
import org.eclipse.eef.eef.EefPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF Interpreted Tree Structure Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFInterpretedTreeStructureDescriptionImpl#getRootsExpression <em>Roots Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFInterpretedTreeStructureDescriptionImpl#getChildrenExpression <em>Children Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFInterpretedTreeStructureDescriptionImpl#getSelectablePredicateExpression <em>Selectable Predicate Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFInterpretedTreeStructureDescriptionImpl#getCandidateDisplayExpression <em>Candidate Display Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFInterpretedTreeStructureDescriptionImpl extends EEFTreeStructureDescriptionImpl
		implements EEFInterpretedTreeStructureDescription {
	/**
	 * The default value of the '{@link #getRootsExpression() <em>Roots Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootsExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOTS_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootsExpression() <em>Roots Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootsExpression()
	 * @generated
	 * @ordered
	 */
	protected String rootsExpression = ROOTS_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getChildrenExpression() <em>Children Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrenExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String CHILDREN_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChildrenExpression() <em>Children Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrenExpression()
	 * @generated
	 * @ordered
	 */
	protected String childrenExpression = CHILDREN_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelectablePredicateExpression() <em>Selectable Predicate Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectablePredicateExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTABLE_PREDICATE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectablePredicateExpression() <em>Selectable Predicate Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectablePredicateExpression()
	 * @generated
	 * @ordered
	 */
	protected String selectablePredicateExpression = SELECTABLE_PREDICATE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCandidateDisplayExpression() <em>Candidate Display Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateDisplayExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String CANDIDATE_DISPLAY_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCandidateDisplayExpression() <em>Candidate Display Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateDisplayExpression()
	 * @generated
	 * @ordered
	 */
	protected String candidateDisplayExpression = CANDIDATE_DISPLAY_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFInterpretedTreeStructureDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRootsExpression() {
		return rootsExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootsExpression(String newRootsExpression) {
		String oldRootsExpression = rootsExpression;
		rootsExpression = newRootsExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__ROOTS_EXPRESSION, oldRootsExpression,
					rootsExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChildrenExpression() {
		return childrenExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChildrenExpression(String newChildrenExpression) {
		String oldChildrenExpression = childrenExpression;
		childrenExpression = newChildrenExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CHILDREN_EXPRESSION, oldChildrenExpression,
					childrenExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelectablePredicateExpression() {
		return selectablePredicateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectablePredicateExpression(String newSelectablePredicateExpression) {
		String oldSelectablePredicateExpression = selectablePredicateExpression;
		selectablePredicateExpression = newSelectablePredicateExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__SELECTABLE_PREDICATE_EXPRESSION,
					oldSelectablePredicateExpression, selectablePredicateExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCandidateDisplayExpression() {
		return candidateDisplayExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCandidateDisplayExpression(String newCandidateDisplayExpression) {
		String oldCandidateDisplayExpression = candidateDisplayExpression;
		candidateDisplayExpression = newCandidateDisplayExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION,
					oldCandidateDisplayExpression, candidateDisplayExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__ROOTS_EXPRESSION:
			return getRootsExpression();
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CHILDREN_EXPRESSION:
			return getChildrenExpression();
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__SELECTABLE_PREDICATE_EXPRESSION:
			return getSelectablePredicateExpression();
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION:
			return getCandidateDisplayExpression();
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
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__ROOTS_EXPRESSION:
			setRootsExpression((String) newValue);
			return;
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CHILDREN_EXPRESSION:
			setChildrenExpression((String) newValue);
			return;
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__SELECTABLE_PREDICATE_EXPRESSION:
			setSelectablePredicateExpression((String) newValue);
			return;
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION:
			setCandidateDisplayExpression((String) newValue);
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
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__ROOTS_EXPRESSION:
			setRootsExpression(ROOTS_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CHILDREN_EXPRESSION:
			setChildrenExpression(CHILDREN_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__SELECTABLE_PREDICATE_EXPRESSION:
			setSelectablePredicateExpression(SELECTABLE_PREDICATE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION:
			setCandidateDisplayExpression(CANDIDATE_DISPLAY_EXPRESSION_EDEFAULT);
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
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__ROOTS_EXPRESSION:
			return ROOTS_EXPRESSION_EDEFAULT == null ? rootsExpression != null
					: !ROOTS_EXPRESSION_EDEFAULT.equals(rootsExpression);
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CHILDREN_EXPRESSION:
			return CHILDREN_EXPRESSION_EDEFAULT == null ? childrenExpression != null
					: !CHILDREN_EXPRESSION_EDEFAULT.equals(childrenExpression);
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__SELECTABLE_PREDICATE_EXPRESSION:
			return SELECTABLE_PREDICATE_EXPRESSION_EDEFAULT == null ? selectablePredicateExpression != null
					: !SELECTABLE_PREDICATE_EXPRESSION_EDEFAULT.equals(selectablePredicateExpression);
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION:
			return CANDIDATE_DISPLAY_EXPRESSION_EDEFAULT == null ? candidateDisplayExpression != null
					: !CANDIDATE_DISPLAY_EXPRESSION_EDEFAULT.equals(candidateDisplayExpression);
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
		result.append(" (rootsExpression: "); //$NON-NLS-1$
		result.append(rootsExpression);
		result.append(", childrenExpression: "); //$NON-NLS-1$
		result.append(childrenExpression);
		result.append(", selectablePredicateExpression: "); //$NON-NLS-1$
		result.append(selectablePredicateExpression);
		result.append(", candidateDisplayExpression: "); //$NON-NLS-1$
		result.append(candidateDisplayExpression);
		result.append(')');
		return result.toString();
	}

} //EEFInterpretedTreeStructureDescriptionImpl
