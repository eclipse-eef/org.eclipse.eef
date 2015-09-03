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

import org.eclipse.eef.eef.EEFGroupDescription;
import org.eclipse.eef.eef.EEFJavaExtensionDescription;
import org.eclipse.eef.eef.EEFPageDescription;
import org.eclipse.eef.eef.EEFTableStructureDescription;
import org.eclipse.eef.eef.EEFTreeStructureDescription;
import org.eclipse.eef.eef.EEFViewDescription;
import org.eclipse.eef.eef.EefPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEF View Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFViewDescriptionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFViewDescriptionImpl#getLabelExpression <em>Label Expression</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFViewDescriptionImpl#getEPackageNsUris <em>EPackage Ns Uris</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFViewDescriptionImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFViewDescriptionImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFViewDescriptionImpl#getJavaExtensions <em>Java Extensions</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFViewDescriptionImpl#getImportedViews <em>Imported Views</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFViewDescriptionImpl#getTreeStructures <em>Tree Structures</em>}</li>
 *   <li>{@link org.eclipse.eef.eef.impl.EEFViewDescriptionImpl#getTableStructures <em>Table Structures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFViewDescriptionImpl extends ContextableElementImpl implements EEFViewDescription {
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
	 * The default value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected String labelExpression = LABEL_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEPackageNsUris() <em>EPackage Ns Uris</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPackageNsUris()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ePackageNsUris;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFGroupDescription> groups;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFPageDescription> pages;

	/**
	 * The cached value of the '{@link #getJavaExtensions() <em>Java Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFJavaExtensionDescription> javaExtensions;

	/**
	 * The cached value of the '{@link #getImportedViews() <em>Imported Views</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedViews()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFViewDescription> importedViews;

	/**
	 * The cached value of the '{@link #getTreeStructures() <em>Tree Structures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFTreeStructureDescription> treeStructures;

	/**
	 * The cached value of the '{@link #getTableStructures() <em>Table Structures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFTableStructureDescription> tableStructures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFViewDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_VIEW_DESCRIPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_VIEW_DESCRIPTION__IDENTIFIER,
					oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabelExpression() {
		return labelExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelExpression(String newLabelExpression) {
		String oldLabelExpression = labelExpression;
		labelExpression = newLabelExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION,
					oldLabelExpression, labelExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEPackageNsUris() {
		if (ePackageNsUris == null) {
			ePackageNsUris = new EDataTypeUniqueEList<String>(String.class, this,
					EefPackage.EEF_VIEW_DESCRIPTION__EPACKAGE_NS_URIS);
		}
		return ePackageNsUris;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEFGroupDescription> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList.Resolving<EEFGroupDescription>(EEFGroupDescription.class, this,
					EefPackage.EEF_VIEW_DESCRIPTION__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEFPageDescription> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList.Resolving<EEFPageDescription>(EEFPageDescription.class, this,
					EefPackage.EEF_VIEW_DESCRIPTION__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEFJavaExtensionDescription> getJavaExtensions() {
		if (javaExtensions == null) {
			javaExtensions = new EObjectContainmentEList.Resolving<EEFJavaExtensionDescription>(
					EEFJavaExtensionDescription.class, this, EefPackage.EEF_VIEW_DESCRIPTION__JAVA_EXTENSIONS);
		}
		return javaExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEFViewDescription> getImportedViews() {
		if (importedViews == null) {
			importedViews = new EObjectResolvingEList<EEFViewDescription>(EEFViewDescription.class, this,
					EefPackage.EEF_VIEW_DESCRIPTION__IMPORTED_VIEWS);
		}
		return importedViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEFTreeStructureDescription> getTreeStructures() {
		if (treeStructures == null) {
			treeStructures = new EObjectContainmentEList.Resolving<EEFTreeStructureDescription>(
					EEFTreeStructureDescription.class, this, EefPackage.EEF_VIEW_DESCRIPTION__TREE_STRUCTURES);
		}
		return treeStructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EEFTableStructureDescription> getTableStructures() {
		if (tableStructures == null) {
			tableStructures = new EObjectContainmentEList.Resolving<EEFTableStructureDescription>(
					EEFTableStructureDescription.class, this, EefPackage.EEF_VIEW_DESCRIPTION__TABLE_STRUCTURES);
		}
		return tableStructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_VIEW_DESCRIPTION__GROUPS:
			return ((InternalEList<?>) getGroups()).basicRemove(otherEnd, msgs);
		case EefPackage.EEF_VIEW_DESCRIPTION__PAGES:
			return ((InternalEList<?>) getPages()).basicRemove(otherEnd, msgs);
		case EefPackage.EEF_VIEW_DESCRIPTION__JAVA_EXTENSIONS:
			return ((InternalEList<?>) getJavaExtensions()).basicRemove(otherEnd, msgs);
		case EefPackage.EEF_VIEW_DESCRIPTION__TREE_STRUCTURES:
			return ((InternalEList<?>) getTreeStructures()).basicRemove(otherEnd, msgs);
		case EefPackage.EEF_VIEW_DESCRIPTION__TABLE_STRUCTURES:
			return ((InternalEList<?>) getTableStructures()).basicRemove(otherEnd, msgs);
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
		case EefPackage.EEF_VIEW_DESCRIPTION__IDENTIFIER:
			return getIdentifier();
		case EefPackage.EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION:
			return getLabelExpression();
		case EefPackage.EEF_VIEW_DESCRIPTION__EPACKAGE_NS_URIS:
			return getEPackageNsUris();
		case EefPackage.EEF_VIEW_DESCRIPTION__GROUPS:
			return getGroups();
		case EefPackage.EEF_VIEW_DESCRIPTION__PAGES:
			return getPages();
		case EefPackage.EEF_VIEW_DESCRIPTION__JAVA_EXTENSIONS:
			return getJavaExtensions();
		case EefPackage.EEF_VIEW_DESCRIPTION__IMPORTED_VIEWS:
			return getImportedViews();
		case EefPackage.EEF_VIEW_DESCRIPTION__TREE_STRUCTURES:
			return getTreeStructures();
		case EefPackage.EEF_VIEW_DESCRIPTION__TABLE_STRUCTURES:
			return getTableStructures();
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
		case EefPackage.EEF_VIEW_DESCRIPTION__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION:
			setLabelExpression((String) newValue);
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__EPACKAGE_NS_URIS:
			getEPackageNsUris().clear();
			getEPackageNsUris().addAll((Collection<? extends String>) newValue);
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__GROUPS:
			getGroups().clear();
			getGroups().addAll((Collection<? extends EEFGroupDescription>) newValue);
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__PAGES:
			getPages().clear();
			getPages().addAll((Collection<? extends EEFPageDescription>) newValue);
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__JAVA_EXTENSIONS:
			getJavaExtensions().clear();
			getJavaExtensions().addAll((Collection<? extends EEFJavaExtensionDescription>) newValue);
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__IMPORTED_VIEWS:
			getImportedViews().clear();
			getImportedViews().addAll((Collection<? extends EEFViewDescription>) newValue);
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__TREE_STRUCTURES:
			getTreeStructures().clear();
			getTreeStructures().addAll((Collection<? extends EEFTreeStructureDescription>) newValue);
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__TABLE_STRUCTURES:
			getTableStructures().clear();
			getTableStructures().addAll((Collection<? extends EEFTableStructureDescription>) newValue);
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
		case EefPackage.EEF_VIEW_DESCRIPTION__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION:
			setLabelExpression(LABEL_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__EPACKAGE_NS_URIS:
			getEPackageNsUris().clear();
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__GROUPS:
			getGroups().clear();
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__PAGES:
			getPages().clear();
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__JAVA_EXTENSIONS:
			getJavaExtensions().clear();
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__IMPORTED_VIEWS:
			getImportedViews().clear();
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__TREE_STRUCTURES:
			getTreeStructures().clear();
			return;
		case EefPackage.EEF_VIEW_DESCRIPTION__TABLE_STRUCTURES:
			getTableStructures().clear();
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
		case EefPackage.EEF_VIEW_DESCRIPTION__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case EefPackage.EEF_VIEW_DESCRIPTION__LABEL_EXPRESSION:
			return LABEL_EXPRESSION_EDEFAULT == null ? labelExpression != null
					: !LABEL_EXPRESSION_EDEFAULT.equals(labelExpression);
		case EefPackage.EEF_VIEW_DESCRIPTION__EPACKAGE_NS_URIS:
			return ePackageNsUris != null && !ePackageNsUris.isEmpty();
		case EefPackage.EEF_VIEW_DESCRIPTION__GROUPS:
			return groups != null && !groups.isEmpty();
		case EefPackage.EEF_VIEW_DESCRIPTION__PAGES:
			return pages != null && !pages.isEmpty();
		case EefPackage.EEF_VIEW_DESCRIPTION__JAVA_EXTENSIONS:
			return javaExtensions != null && !javaExtensions.isEmpty();
		case EefPackage.EEF_VIEW_DESCRIPTION__IMPORTED_VIEWS:
			return importedViews != null && !importedViews.isEmpty();
		case EefPackage.EEF_VIEW_DESCRIPTION__TREE_STRUCTURES:
			return treeStructures != null && !treeStructures.isEmpty();
		case EefPackage.EEF_VIEW_DESCRIPTION__TABLE_STRUCTURES:
			return tableStructures != null && !tableStructures.isEmpty();
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
		result.append(", labelExpression: "); //$NON-NLS-1$
		result.append(labelExpression);
		result.append(", ePackageNsUris: "); //$NON-NLS-1$
		result.append(ePackageNsUris);
		result.append(')');
		return result.toString();
	}

} //EEFViewDescriptionImpl
