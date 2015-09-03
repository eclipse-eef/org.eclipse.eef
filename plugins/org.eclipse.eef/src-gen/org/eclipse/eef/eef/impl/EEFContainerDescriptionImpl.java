/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef.impl;

import java.util.Collection;

import org.eclipse.eef.eef.EEFContainerDescription;
import org.eclipse.eef.eef.EEFWidgetDescription;
import org.eclipse.eef.eef.EefPackage;

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
 * An implementation of the model object '<em><b>EEF Container Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFContainerDescriptionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFContainerDescriptionImpl#getSemanticCandidatesExpression <em>Semantic Candidates Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFContainerDescriptionImpl#getDomainClass <em>Domain Class</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFContainerDescriptionImpl#getLayoutColumnCount <em>Layout Column Count</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFContainerDescriptionImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFContainerDescriptionImpl#getWidgets <em>Widgets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFContainerDescriptionImpl extends ContextableElementImpl implements EEFContainerDescription {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemanticCandidatesExpression() <em>Semantic Candidates Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticCandidatesExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_CANDIDATES_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticCandidatesExpression() <em>Semantic Candidates Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticCandidatesExpression()
	 * @generated
	 * @ordered
	 */
	protected String semanticCandidatesExpression = SEMANTIC_CANDIDATES_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainClass() <em>Domain Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainClass() <em>Domain Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainClass()
	 * @generated
	 * @ordered
	 */
	protected String domainClass = DOMAIN_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayoutColumnCount() <em>Layout Column Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutColumnCount()
	 * @generated
	 * @ordered
	 */
	protected static final int LAYOUT_COLUMN_COUNT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getLayoutColumnCount() <em>Layout Column Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutColumnCount()
	 * @generated
	 * @ordered
	 */
	protected int layoutColumnCount = LAYOUT_COLUMN_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFContainerDescription> containers;

	/**
	 * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFWidgetDescription> widgets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFContainerDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_CONTAINER_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_CONTAINER_DESCRIPTION__IDENTIFIER,
					oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSemanticCandidatesExpression() {
		return semanticCandidatesExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemanticCandidatesExpression(String newSemanticCandidatesExpression) {
		String oldSemanticCandidatesExpression = semanticCandidatesExpression;
		semanticCandidatesExpression = newSemanticCandidatesExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefPackage.EEF_CONTAINER_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION,
					oldSemanticCandidatesExpression, semanticCandidatesExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomainClass() {
		return domainClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainClass(String newDomainClass) {
		String oldDomainClass = domainClass;
		domainClass = newDomainClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_CONTAINER_DESCRIPTION__DOMAIN_CLASS,
					oldDomainClass, domainClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLayoutColumnCount() {
		return layoutColumnCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayoutColumnCount(int newLayoutColumnCount) {
		int oldLayoutColumnCount = layoutColumnCount;
		layoutColumnCount = newLayoutColumnCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT_COLUMN_COUNT, oldLayoutColumnCount,
					layoutColumnCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEFContainerDescription> getContainers() {
		if (containers == null) {
			containers = new EObjectContainmentEList.Resolving<EEFContainerDescription>(EEFContainerDescription.class,
					this, EefPackage.EEF_CONTAINER_DESCRIPTION__CONTAINERS);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEFWidgetDescription> getWidgets() {
		if (widgets == null) {
			widgets = new EObjectContainmentEList.Resolving<EEFWidgetDescription>(EEFWidgetDescription.class, this,
					EefPackage.EEF_CONTAINER_DESCRIPTION__WIDGETS);
		}
		return widgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_CONTAINER_DESCRIPTION__CONTAINERS:
			return ((InternalEList<?>) getContainers()).basicRemove(otherEnd, msgs);
		case EefPackage.EEF_CONTAINER_DESCRIPTION__WIDGETS:
			return ((InternalEList<?>) getWidgets()).basicRemove(otherEnd, msgs);
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
		case EefPackage.EEF_CONTAINER_DESCRIPTION__IDENTIFIER:
			return getIdentifier();
		case EefPackage.EEF_CONTAINER_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION:
			return getSemanticCandidatesExpression();
		case EefPackage.EEF_CONTAINER_DESCRIPTION__DOMAIN_CLASS:
			return getDomainClass();
		case EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT_COLUMN_COUNT:
			return getLayoutColumnCount();
		case EefPackage.EEF_CONTAINER_DESCRIPTION__CONTAINERS:
			return getContainers();
		case EefPackage.EEF_CONTAINER_DESCRIPTION__WIDGETS:
			return getWidgets();
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
		case EefPackage.EEF_CONTAINER_DESCRIPTION__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case EefPackage.EEF_CONTAINER_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION:
			setSemanticCandidatesExpression((String) newValue);
			return;
		case EefPackage.EEF_CONTAINER_DESCRIPTION__DOMAIN_CLASS:
			setDomainClass((String) newValue);
			return;
		case EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT_COLUMN_COUNT:
			setLayoutColumnCount((Integer) newValue);
			return;
		case EefPackage.EEF_CONTAINER_DESCRIPTION__CONTAINERS:
			getContainers().clear();
			getContainers().addAll((Collection<? extends EEFContainerDescription>) newValue);
			return;
		case EefPackage.EEF_CONTAINER_DESCRIPTION__WIDGETS:
			getWidgets().clear();
			getWidgets().addAll((Collection<? extends EEFWidgetDescription>) newValue);
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
		case EefPackage.EEF_CONTAINER_DESCRIPTION__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case EefPackage.EEF_CONTAINER_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION:
			setSemanticCandidatesExpression(SEMANTIC_CANDIDATES_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_CONTAINER_DESCRIPTION__DOMAIN_CLASS:
			setDomainClass(DOMAIN_CLASS_EDEFAULT);
			return;
		case EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT_COLUMN_COUNT:
			setLayoutColumnCount(LAYOUT_COLUMN_COUNT_EDEFAULT);
			return;
		case EefPackage.EEF_CONTAINER_DESCRIPTION__CONTAINERS:
			getContainers().clear();
			return;
		case EefPackage.EEF_CONTAINER_DESCRIPTION__WIDGETS:
			getWidgets().clear();
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
		case EefPackage.EEF_CONTAINER_DESCRIPTION__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case EefPackage.EEF_CONTAINER_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION:
			return SEMANTIC_CANDIDATES_EXPRESSION_EDEFAULT == null ? semanticCandidatesExpression != null
					: !SEMANTIC_CANDIDATES_EXPRESSION_EDEFAULT.equals(semanticCandidatesExpression);
		case EefPackage.EEF_CONTAINER_DESCRIPTION__DOMAIN_CLASS:
			return DOMAIN_CLASS_EDEFAULT == null ? domainClass != null : !DOMAIN_CLASS_EDEFAULT.equals(domainClass);
		case EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT_COLUMN_COUNT:
			return layoutColumnCount != LAYOUT_COLUMN_COUNT_EDEFAULT;
		case EefPackage.EEF_CONTAINER_DESCRIPTION__CONTAINERS:
			return containers != null && !containers.isEmpty();
		case EefPackage.EEF_CONTAINER_DESCRIPTION__WIDGETS:
			return widgets != null && !widgets.isEmpty();
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
		result.append(" (identifier: "); //$NON-NLS-1$
		result.append(identifier);
		result.append(", semanticCandidatesExpression: "); //$NON-NLS-1$
		result.append(semanticCandidatesExpression);
		result.append(", domainClass: "); //$NON-NLS-1$
		result.append(domainClass);
		result.append(", layoutColumnCount: "); //$NON-NLS-1$
		result.append(layoutColumnCount);
		result.append(')');
		return result.toString();
	}

} //EEFContainerDescriptionImpl
