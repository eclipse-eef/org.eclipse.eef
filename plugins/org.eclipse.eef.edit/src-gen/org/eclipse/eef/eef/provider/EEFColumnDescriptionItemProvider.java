/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.eef.eef.EEFColumnDescription;
import org.eclipse.eef.eef.EefPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.eef.eef.EEFColumnDescription} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EEFColumnDescriptionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFColumnDescriptionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addWidthPropertyDescriptor(object);
			addHeaderExpressionPropertyDescriptor(object);
			addCellWidgetPropertyDescriptor(object);
			addContextCandidatesExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EEFColumnDescription_width_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_EEFColumnDescription_width_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_EEFColumnDescription_type"), //$NON-NLS-1$
						EefPackage.Literals.EEF_COLUMN_DESCRIPTION__WIDTH, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Header Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeaderExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EEFColumnDescription_headerExpression_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
								"_UI_EEFColumnDescription_headerExpression_feature", "_UI_EEFColumnDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$
						EefPackage.Literals.EEF_COLUMN_DESCRIPTION__HEADER_EXPRESSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cell Widget feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCellWidgetPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EEFColumnDescription_cellWidget_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_EEFColumnDescription_cellWidget_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_EEFColumnDescription_type"), //$NON-NLS-1$
						EefPackage.Literals.EEF_COLUMN_DESCRIPTION__CELL_WIDGET, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Context Candidates Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextCandidatesExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EEFColumnDescription_contextCandidatesExpression_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
								"_UI_EEFColumnDescription_contextCandidatesExpression_feature", //$NON-NLS-1$
								"_UI_EEFColumnDescription_type"), //$NON-NLS-1$
						EefPackage.Literals.EEF_COLUMN_DESCRIPTION__CONTEXT_CANDIDATES_EXPRESSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns EEFColumnDescription.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EEFColumnDescription")); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		EEFColumnDescription eefColumnDescription = (EEFColumnDescription) object;
		return getString("_UI_EEFColumnDescription_type") + " " + eefColumnDescription.getWidth(); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EEFColumnDescription.class)) {
		case EefPackage.EEF_COLUMN_DESCRIPTION__WIDTH:
		case EefPackage.EEF_COLUMN_DESCRIPTION__HEADER_EXPRESSION:
		case EefPackage.EEF_COLUMN_DESCRIPTION__CONTEXT_CANDIDATES_EXPRESSION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EefEditPlugin.INSTANCE;
	}

}
