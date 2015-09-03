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

import org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription;
import org.eclipse.eef.eef.EefPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EEFInterpretedTreeStructureDescriptionItemProvider extends EEFTreeStructureDescriptionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFInterpretedTreeStructureDescriptionItemProvider(AdapterFactory adapterFactory) {
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

			addRootsExpressionPropertyDescriptor(object);
			addChildrenExpressionPropertyDescriptor(object);
			addSelectablePredicateExpressionPropertyDescriptor(object);
			addCandidateDisplayExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Roots Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootsExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EEFInterpretedTreeStructureDescription_rootsExpression_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
						"_UI_EEFInterpretedTreeStructureDescription_rootsExpression_feature", //$NON-NLS-1$
						"_UI_EEFInterpretedTreeStructureDescription_type"), //$NON-NLS-1$
				EefPackage.Literals.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__ROOTS_EXPRESSION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Children Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChildrenExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EEFInterpretedTreeStructureDescription_childrenExpression_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
						"_UI_EEFInterpretedTreeStructureDescription_childrenExpression_feature", //$NON-NLS-1$
						"_UI_EEFInterpretedTreeStructureDescription_type"), //$NON-NLS-1$
				EefPackage.Literals.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CHILDREN_EXPRESSION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Selectable Predicate Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectablePredicateExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EEFInterpretedTreeStructureDescription_selectablePredicateExpression_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
						"_UI_EEFInterpretedTreeStructureDescription_selectablePredicateExpression_feature", //$NON-NLS-1$
						"_UI_EEFInterpretedTreeStructureDescription_type"), //$NON-NLS-1$
				EefPackage.Literals.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__SELECTABLE_PREDICATE_EXPRESSION, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Candidate Display Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCandidateDisplayExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EEFInterpretedTreeStructureDescription_candidateDisplayExpression_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
						"_UI_EEFInterpretedTreeStructureDescription_candidateDisplayExpression_feature", //$NON-NLS-1$
						"_UI_EEFInterpretedTreeStructureDescription_type"), //$NON-NLS-1$
				EefPackage.Literals.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION, true,
				false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns EEFInterpretedTreeStructureDescription.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EEFInterpretedTreeStructureDescription")); //$NON-NLS-1$
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
		String label = ((EEFInterpretedTreeStructureDescription) object).getIdentifier();
		return label == null || label.length() == 0 ? getString("_UI_EEFInterpretedTreeStructureDescription_type") //$NON-NLS-1$
				:
				getString("_UI_EEFInterpretedTreeStructureDescription_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(EEFInterpretedTreeStructureDescription.class)) {
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__ROOTS_EXPRESSION:
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CHILDREN_EXPRESSION:
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__SELECTABLE_PREDICATE_EXPRESSION:
		case EefPackage.EEF_INTERPRETED_TREE_STRUCTURE_DESCRIPTION__CANDIDATE_DISPLAY_EXPRESSION:
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

}
