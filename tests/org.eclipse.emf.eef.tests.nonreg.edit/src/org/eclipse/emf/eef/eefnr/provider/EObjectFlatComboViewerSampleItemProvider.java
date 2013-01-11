/**
 * <copyright>
 * </copyright>
 *
 * $Id: EObjectFlatComboViewerSampleItemProvider.java,v 1.2 2010/02/02 10:03:56 nlepine Exp $
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

import org.eclipse.emf.eef.eefnr.EObjectFlatComboViewerSample;
import org.eclipse.emf.eef.eefnr.EefnrPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.eef.eefnr.EObjectFlatComboViewerSample} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EObjectFlatComboViewerSampleItemProvider
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
	public EObjectFlatComboViewerSampleItemProvider(AdapterFactory adapterFactory) {
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

			addEobjectflatcomboviewerRequiredProperyPropertyDescriptor(object);
			addEobjectflatcomboviewerOptionalProperyPropertyDescriptor(object);
			addEobjectflatcomboviewerROPropertyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Eobjectflatcomboviewer Required Propery feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEobjectflatcomboviewerRequiredProperyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EObjectFlatComboViewerSample_eobjectflatcomboviewerRequiredPropery_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EObjectFlatComboViewerSample_eobjectflatcomboviewerRequiredPropery_feature", "_UI_EObjectFlatComboViewerSample_type"),
				 EefnrPackage.Literals.EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__EOBJECTFLATCOMBOVIEWER_REQUIRED_PROPERY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Eobjectflatcomboviewer Optional Propery feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEobjectflatcomboviewerOptionalProperyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EObjectFlatComboViewerSample_eobjectflatcomboviewerOptionalPropery_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EObjectFlatComboViewerSample_eobjectflatcomboviewerOptionalPropery_feature", "_UI_EObjectFlatComboViewerSample_type"),
				 EefnrPackage.Literals.EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__EOBJECTFLATCOMBOVIEWER_OPTIONAL_PROPERY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Eobjectflatcomboviewer RO Property feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEobjectflatcomboviewerROPropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EObjectFlatComboViewerSample_eobjectflatcomboviewerROProperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EObjectFlatComboViewerSample_eobjectflatcomboviewerROProperty_feature", "_UI_EObjectFlatComboViewerSample_type"),
				 EefnrPackage.Literals.EOBJECT_FLAT_COMBO_VIEWER_SAMPLE__EOBJECTFLATCOMBOVIEWER_RO_PROPERTY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns EObjectFlatComboViewerSample.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EObjectFlatComboViewerSample"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EObjectFlatComboViewerSample)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EObjectFlatComboViewerSample_type") :
			getString("_UI_EObjectFlatComboViewerSample_type") + " " + label;
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
