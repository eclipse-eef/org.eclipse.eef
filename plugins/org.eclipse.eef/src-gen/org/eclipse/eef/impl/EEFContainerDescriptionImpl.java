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

import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.EEFDynamicMappingFor;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Container Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFContainerDescriptionImpl#getIdentifier <em>Identifier</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFContainerDescriptionImpl#getWidgets <em>Widgets</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFContainerDescriptionImpl#getDynamicMappings <em>Dynamic Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEFContainerDescriptionImpl extends MinimalEObjectImpl.Container implements EEFContainerDescription {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = EEFContainerDescriptionImpl.IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #getWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFWidgetDescription> widgets;

	/**
	 * The cached value of the '{@link #getDynamicMappings() <em>Dynamic Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getDynamicMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFDynamicMappingFor> dynamicMappings;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFContainerDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_CONTAINER_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_CONTAINER_DESCRIPTION__IDENTIFIER, oldIdentifier, identifier));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<EEFDynamicMappingFor> getDynamicMappings() {
		if (dynamicMappings == null) {
			dynamicMappings = new EObjectContainmentEList.Resolving<EEFDynamicMappingFor>(EEFDynamicMappingFor.class, this,
					EefPackage.EEF_CONTAINER_DESCRIPTION__DYNAMIC_MAPPINGS);
		}
		return dynamicMappings;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_CONTAINER_DESCRIPTION__WIDGETS:
			return ((InternalEList<?>) getWidgets()).basicRemove(otherEnd, msgs);
		case EefPackage.EEF_CONTAINER_DESCRIPTION__DYNAMIC_MAPPINGS:
			return ((InternalEList<?>) getDynamicMappings()).basicRemove(otherEnd, msgs);
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
		case EefPackage.EEF_CONTAINER_DESCRIPTION__IDENTIFIER:
			return getIdentifier();
		case EefPackage.EEF_CONTAINER_DESCRIPTION__WIDGETS:
			return getWidgets();
		case EefPackage.EEF_CONTAINER_DESCRIPTION__DYNAMIC_MAPPINGS:
			return getDynamicMappings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EefPackage.EEF_CONTAINER_DESCRIPTION__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case EefPackage.EEF_CONTAINER_DESCRIPTION__WIDGETS:
			getWidgets().clear();
			getWidgets().addAll((Collection<? extends EEFWidgetDescription>) newValue);
			return;
		case EefPackage.EEF_CONTAINER_DESCRIPTION__DYNAMIC_MAPPINGS:
			getDynamicMappings().clear();
			getDynamicMappings().addAll((Collection<? extends EEFDynamicMappingFor>) newValue);
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
		case EefPackage.EEF_CONTAINER_DESCRIPTION__IDENTIFIER:
			setIdentifier(EEFContainerDescriptionImpl.IDENTIFIER_EDEFAULT);
			return;
		case EefPackage.EEF_CONTAINER_DESCRIPTION__WIDGETS:
			getWidgets().clear();
			return;
		case EefPackage.EEF_CONTAINER_DESCRIPTION__DYNAMIC_MAPPINGS:
			getDynamicMappings().clear();
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
		case EefPackage.EEF_CONTAINER_DESCRIPTION__IDENTIFIER:
			return EEFContainerDescriptionImpl.IDENTIFIER_EDEFAULT == null ? identifier != null : !EEFContainerDescriptionImpl.IDENTIFIER_EDEFAULT
			.equals(identifier);
		case EefPackage.EEF_CONTAINER_DESCRIPTION__WIDGETS:
			return widgets != null && !widgets.isEmpty();
		case EefPackage.EEF_CONTAINER_DESCRIPTION__DYNAMIC_MAPPINGS:
			return dynamicMappings != null && !dynamicMappings.isEmpty();
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
		result.append(" (identifier: "); //$NON-NLS-1$
		result.append(identifier);
		result.append(')');
		return result.toString();
	}

} // EEFContainerDescriptionImpl
