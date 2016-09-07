/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.EefFactory;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.eef.EEFContainerDescription} object. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EEFContainerDescriptionItemProvider extends EEFControlDescriptionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEFContainerDescriptionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__CONTROLS);
			childrenFeatures.add(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__LAYOUT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EEFContainerDescription.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EEFContainerDescription")); //$NON-NLS-1$
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EEFContainerDescription) object).getIdentifier();
		return label == null || label.length() == 0 ? getString("_UI_EEFContainerDescription_type") : //$NON-NLS-1$
			getString("_UI_EEFContainerDescription_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
	 * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EEFContainerDescription.class)) {
		case EefPackage.EEF_CONTAINER_DESCRIPTION__CONTROLS:
		case EefPackage.EEF_CONTAINER_DESCRIPTION__LAYOUT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that can be created
	 * under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFContainerDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFTextDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFLabelDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFButtonDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFCheckboxDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFSelectDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFRadioDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFHyperlinkDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFDynamicMappingFor()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFCustomWidgetDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__CONTROLS,
				EefFactory.eINSTANCE.createEEFListDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__LAYOUT,
				EefFactory.eINSTANCE.createEEFFillLayoutDescription()));

		newChildDescriptors.add(createChildParameter(EefPackage.Literals.EEF_CONTAINER_DESCRIPTION__LAYOUT,
				EefFactory.eINSTANCE.createEEFGridLayoutDescription()));
	}

}
