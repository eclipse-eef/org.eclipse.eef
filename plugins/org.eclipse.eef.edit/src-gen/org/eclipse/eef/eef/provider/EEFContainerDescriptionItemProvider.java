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

import org.eclipse.eef.eef.EEFContainerDescription;
import org.eclipse.eef.eef.EefFactory;
import org.eclipse.eef.eef.EefPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.eef.eef.EEFContainerDescription} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EEFContainerDescriptionItemProvider extends ContextableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEFContainerDescriptionItemProvider(AdapterFactory adapterFactory) {
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

			addIdentifierPropertyDescriptor(object);
			addSemanticCandidatesExpressionPropertyDescriptor(object);
			addDomainClassPropertyDescriptor(object);
			addLayoutColumnCountPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EEFContainerDescription_identifier_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
								"_UI_EEFContainerDescription_identifier_feature", "_UI_EEFContainerDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$
						EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__IDENTIFIER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Semantic Candidates Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSemanticCandidatesExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EEFContainerDescription_semanticCandidatesExpression_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
						"_UI_EEFContainerDescription_semanticCandidatesExpression_feature", //$NON-NLS-1$
						"_UI_EEFContainerDescription_type"), //$NON-NLS-1$
				EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Domain Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EEFContainerDescription_domainClass_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
								"_UI_EEFContainerDescription_domainClass_feature", "_UI_EEFContainerDescription_type"), //$NON-NLS-1$ //$NON-NLS-2$
						EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__DOMAIN_CLASS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Layout Column Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayoutColumnCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EEFContainerDescription_layoutColumnCount_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_EEFContainerDescription_layoutColumnCount_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_EEFContainerDescription_type"), //$NON-NLS-1$
				EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__LAYOUT_COLUMN_COUNT, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__CONTAINERS);
			childrenFeatures.add(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__WIDGETS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EEFContainerDescription.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EEFContainerDescription")); //$NON-NLS-1$
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
		String label = ((EEFContainerDescription) object).getIdentifier();
		return label == null || label.length() == 0 ? getString("_UI_EEFContainerDescription_type") //$NON-NLS-1$
				:
				getString("_UI_EEFContainerDescription_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(EEFContainerDescription.class)) {
		case EefPackage.EEF_CONTAINER_DESCRIPTION__IDENTIFIER:
		case EefPackage.EEF_CONTAINER_DESCRIPTION__SEMANTIC_CANDIDATES_EXPRESSION:
		case EefPackage.EEF_CONTAINER_DESCRIPTION__DOMAIN_CLASS:
		case EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT_COLUMN_COUNT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case EefPackage.EEF_CONTAINER_DESCRIPTION__CONTAINERS:
		case EefPackage.EEF_CONTAINER_DESCRIPTION__WIDGETS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__CONTAINERS,
				EefFactory.eINSTANCE.createEEFContainerDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__WIDGETS,
				EefFactory.eINSTANCE.createEEFTextDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__WIDGETS,
				EefFactory.eINSTANCE.createEEFCheckboxDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__WIDGETS,
				EefFactory.eINSTANCE.createEEFSelectDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__WIDGETS,
				EefFactory.eINSTANCE.createEEFLabelDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__WIDGETS,
				EefFactory.eINSTANCE.createEEFRadioDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__WIDGETS,
				EefFactory.eINSTANCE.createEEFTreeDialogSelectDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__WIDGETS,
				EefFactory.eINSTANCE.createEEFLinkDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__WIDGETS,
				EefFactory.eINSTANCE.createEEFImageDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__WIDGETS,
				EefFactory.eINSTANCE.createEEFTreeDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__WIDGETS,
				EefFactory.eINSTANCE.createEEFImagePickerDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__WIDGETS,
				EefFactory.eINSTANCE.createEEFTableDescription()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == EefPackage.Literals.CONTEXTABLE_ELEMENT__REQUIRED_CONTEXT_VARIABLES
				|| childFeature == EefPackage.Literals.CONTEXTABLE_ELEMENT__EXCLUDED_CONTEXT_VARIABLES;

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
