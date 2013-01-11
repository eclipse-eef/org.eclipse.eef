/**
 * <copyright>
 * </copyright>
 *
 * $Id: EMFComboViewerSampleItemProvider.java,v 1.3 2011/11/14 14:06:28 sbouchet Exp $
 */
package org.eclipse.emf.eef.eefnr.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.emf.eef.eefnr.EMFComboViewerSample;
import org.eclipse.emf.eef.eefnr.EefnrPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.eef.eefnr.EMFComboViewerSample} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFComboViewerSampleItemProvider
	extends AbstractSampleItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFComboViewerSampleItemProvider(AdapterFactory adapterFactory) {
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

			addEmfcomboviewerRequiredPropertyPropertyDescriptor(object);
			addEmfcomboviewerOptionalPropertyPropertyDescriptor(object);
			addEmfcomboviewerROPropertyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Emfcomboviewer Required Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmfcomboviewerRequiredPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMFComboViewerSample_emfcomboviewerRequiredProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMFComboViewerSample_emfcomboviewerRequiredProperty_feature", "_UI_EMFComboViewerSample_type"),
				 EefnrPackage.Literals.EMF_COMBO_VIEWER_SAMPLE__EMFCOMBOVIEWER_REQUIRED_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Emfcomboviewer Optional Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmfcomboviewerOptionalPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMFComboViewerSample_emfcomboviewerOptionalProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMFComboViewerSample_emfcomboviewerOptionalProperty_feature", "_UI_EMFComboViewerSample_type"),
				 EefnrPackage.Literals.EMF_COMBO_VIEWER_SAMPLE__EMFCOMBOVIEWER_OPTIONAL_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Emfcomboviewer RO Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmfcomboviewerROPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EMFComboViewerSample_emfcomboviewerROProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EMFComboViewerSample_emfcomboviewerROProperty_feature", "_UI_EMFComboViewerSample_type"),
				 EefnrPackage.Literals.EMF_COMBO_VIEWER_SAMPLE__EMFCOMBOVIEWER_RO_PROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns EMFComboViewerSample.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EMFComboViewerSample"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EMFComboViewerSample)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EMFComboViewerSample_type") :
			getString("_UI_EMFComboViewerSample_type") + " " + label;
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

		switch (notification.getFeatureID(EMFComboViewerSample.class)) {
			case EefnrPackage.EMF_COMBO_VIEWER_SAMPLE__EMFCOMBOVIEWER_REQUIRED_PROPERTY:
			case EefnrPackage.EMF_COMBO_VIEWER_SAMPLE__EMFCOMBOVIEWER_OPTIONAL_PROPERTY:
			case EefnrPackage.EMF_COMBO_VIEWER_SAMPLE__EMFCOMBOVIEWER_RO_PROPERTY:
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
