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

import org.eclipse.eef.eef.EEFColumnDescription;
import org.eclipse.eef.eef.EEFInterpretedTableStructureDescription;
import org.eclipse.eef.eef.EEFLineDescription;
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
 * An implementation of the model object '<em><b>EEF Interpreted Table Structure Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFInterpretedTableStructureDescriptionImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFInterpretedTableStructureDescriptionImpl#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFInterpretedTableStructureDescriptionImpl extends EEFTableStructureDescriptionImpl
		implements EEFInterpretedTableStructureDescription {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFColumnDescription> columns;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected EEFLineDescription line;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFInterpretedTableStructureDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEFColumnDescription> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList.Resolving<EEFColumnDescription>(EEFColumnDescription.class, this,
					EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEFLineDescription getLine() {
		if (line != null && line.eIsProxy()) {
			InternalEObject oldLine = (InternalEObject) line;
			line = (EEFLineDescription) eResolveProxy(oldLine);
			if (line != oldLine) {
				InternalEObject newLine = (InternalEObject) line;
				NotificationChain msgs = oldLine.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__LINE, null,
						null);
				if (newLine.eInternalContainer() == null) {
					msgs = newLine.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE - EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__LINE, null,
							msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__LINE, oldLine, line));
			}
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFLineDescription basicGetLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine(EEFLineDescription newLine, NotificationChain msgs) {
		EEFLineDescription oldLine = line;
		line = newLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__LINE, oldLine, newLine);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine(EEFLineDescription newLine) {
		if (newLine != line) {
			NotificationChain msgs = null;
			if (line != null)
				msgs = ((InternalEObject) line).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__LINE, null,
						msgs);
			if (newLine != null)
				msgs = ((InternalEObject) newLine).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__LINE, null,
						msgs);
			msgs = basicSetLine(newLine, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__LINE, newLine, newLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__COLUMNS:
			return ((InternalEList<?>) getColumns()).basicRemove(otherEnd, msgs);
		case EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__LINE:
			return basicSetLine(null, msgs);
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
		case EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__COLUMNS:
			return getColumns();
		case EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__LINE:
			if (resolve)
				return getLine();
			return basicGetLine();
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
		case EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__COLUMNS:
			getColumns().clear();
			getColumns().addAll((Collection<? extends EEFColumnDescription>) newValue);
			return;
		case EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__LINE:
			setLine((EEFLineDescription) newValue);
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
		case EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__COLUMNS:
			getColumns().clear();
			return;
		case EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__LINE:
			setLine((EEFLineDescription) null);
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
		case EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__COLUMNS:
			return columns != null && !columns.isEmpty();
		case EefPackage.EEF_INTERPRETED_TABLE_STRUCTURE_DESCRIPTION__LINE:
			return line != null;
		}
		return super.eIsSet(featureID);
	}

} //EEFInterpretedTableStructureDescriptionImpl
