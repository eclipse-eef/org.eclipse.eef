/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.eef.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.eef.eef.util.EefAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EefItemProviderAdapterFactory extends EefAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFViewDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFViewDescriptionItemProvider eefViewDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFViewDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFViewDescriptionAdapter() {
		if (eefViewDescriptionItemProvider == null) {
			eefViewDescriptionItemProvider = new EEFViewDescriptionItemProvider(this);
		}

		return eefViewDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFPageDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFPageDescriptionItemProvider eefPageDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFPageDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFPageDescriptionAdapter() {
		if (eefPageDescriptionItemProvider == null) {
			eefPageDescriptionItemProvider = new EEFPageDescriptionItemProvider(this);
		}

		return eefPageDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFGroupDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFGroupDescriptionItemProvider eefGroupDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFGroupDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFGroupDescriptionAdapter() {
		if (eefGroupDescriptionItemProvider == null) {
			eefGroupDescriptionItemProvider = new EEFGroupDescriptionItemProvider(this);
		}

		return eefGroupDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFContainerDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFContainerDescriptionItemProvider eefContainerDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFContainerDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFContainerDescriptionAdapter() {
		if (eefContainerDescriptionItemProvider == null) {
			eefContainerDescriptionItemProvider = new EEFContainerDescriptionItemProvider(this);
		}

		return eefContainerDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFJavaExtensionDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFJavaExtensionDescriptionItemProvider eefJavaExtensionDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFJavaExtensionDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFJavaExtensionDescriptionAdapter() {
		if (eefJavaExtensionDescriptionItemProvider == null) {
			eefJavaExtensionDescriptionItemProvider = new EEFJavaExtensionDescriptionItemProvider(this);
		}

		return eefJavaExtensionDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFInterpretedTableStructureDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFInterpretedTableStructureDescriptionItemProvider eefInterpretedTableStructureDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFInterpretedTableStructureDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFInterpretedTableStructureDescriptionAdapter() {
		if (eefInterpretedTableStructureDescriptionItemProvider == null) {
			eefInterpretedTableStructureDescriptionItemProvider = new EEFInterpretedTableStructureDescriptionItemProvider(
					this);
		}

		return eefInterpretedTableStructureDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFAdapterFactoryTreeStructureDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFAdapterFactoryTreeStructureDescriptionItemProvider eefAdapterFactoryTreeStructureDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFAdapterFactoryTreeStructureDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFAdapterFactoryTreeStructureDescriptionAdapter() {
		if (eefAdapterFactoryTreeStructureDescriptionItemProvider == null) {
			eefAdapterFactoryTreeStructureDescriptionItemProvider = new EEFAdapterFactoryTreeStructureDescriptionItemProvider(
					this);
		}

		return eefAdapterFactoryTreeStructureDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFInterpretedTreeStructureDescriptionItemProvider eefInterpretedTreeStructureDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFInterpretedTreeStructureDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFInterpretedTreeStructureDescriptionAdapter() {
		if (eefInterpretedTreeStructureDescriptionItemProvider == null) {
			eefInterpretedTreeStructureDescriptionItemProvider = new EEFInterpretedTreeStructureDescriptionItemProvider(
					this);
		}

		return eefInterpretedTreeStructureDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFTextDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFTextDescriptionItemProvider eefTextDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFTextDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFTextDescriptionAdapter() {
		if (eefTextDescriptionItemProvider == null) {
			eefTextDescriptionItemProvider = new EEFTextDescriptionItemProvider(this);
		}

		return eefTextDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFCheckboxDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFCheckboxDescriptionItemProvider eefCheckboxDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFCheckboxDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFCheckboxDescriptionAdapter() {
		if (eefCheckboxDescriptionItemProvider == null) {
			eefCheckboxDescriptionItemProvider = new EEFCheckboxDescriptionItemProvider(this);
		}

		return eefCheckboxDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFSelectDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFSelectDescriptionItemProvider eefSelectDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFSelectDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFSelectDescriptionAdapter() {
		if (eefSelectDescriptionItemProvider == null) {
			eefSelectDescriptionItemProvider = new EEFSelectDescriptionItemProvider(this);
		}

		return eefSelectDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFLabelDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFLabelDescriptionItemProvider eefLabelDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFLabelDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFLabelDescriptionAdapter() {
		if (eefLabelDescriptionItemProvider == null) {
			eefLabelDescriptionItemProvider = new EEFLabelDescriptionItemProvider(this);
		}

		return eefLabelDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFRadioDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFRadioDescriptionItemProvider eefRadioDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFRadioDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFRadioDescriptionAdapter() {
		if (eefRadioDescriptionItemProvider == null) {
			eefRadioDescriptionItemProvider = new EEFRadioDescriptionItemProvider(this);
		}

		return eefRadioDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFTreeDialogSelectDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFTreeDialogSelectDescriptionItemProvider eefTreeDialogSelectDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFTreeDialogSelectDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFTreeDialogSelectDescriptionAdapter() {
		if (eefTreeDialogSelectDescriptionItemProvider == null) {
			eefTreeDialogSelectDescriptionItemProvider = new EEFTreeDialogSelectDescriptionItemProvider(this);
		}

		return eefTreeDialogSelectDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFLinkDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFLinkDescriptionItemProvider eefLinkDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFLinkDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFLinkDescriptionAdapter() {
		if (eefLinkDescriptionItemProvider == null) {
			eefLinkDescriptionItemProvider = new EEFLinkDescriptionItemProvider(this);
		}

		return eefLinkDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFImageDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFImageDescriptionItemProvider eefImageDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFImageDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFImageDescriptionAdapter() {
		if (eefImageDescriptionItemProvider == null) {
			eefImageDescriptionItemProvider = new EEFImageDescriptionItemProvider(this);
		}

		return eefImageDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFTreeDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFTreeDescriptionItemProvider eefTreeDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFTreeDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFTreeDescriptionAdapter() {
		if (eefTreeDescriptionItemProvider == null) {
			eefTreeDescriptionItemProvider = new EEFTreeDescriptionItemProvider(this);
		}

		return eefTreeDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFImagePickerDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFImagePickerDescriptionItemProvider eefImagePickerDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFImagePickerDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFImagePickerDescriptionAdapter() {
		if (eefImagePickerDescriptionItemProvider == null) {
			eefImagePickerDescriptionItemProvider = new EEFImagePickerDescriptionItemProvider(this);
		}

		return eefImagePickerDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFTableDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFTableDescriptionItemProvider eefTableDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFTableDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFTableDescriptionAdapter() {
		if (eefTableDescriptionItemProvider == null) {
			eefTableDescriptionItemProvider = new EEFTableDescriptionItemProvider(this);
		}

		return eefTableDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFColumnDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFColumnDescriptionItemProvider eefColumnDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFColumnDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFColumnDescriptionAdapter() {
		if (eefColumnDescriptionItemProvider == null) {
			eefColumnDescriptionItemProvider = new EEFColumnDescriptionItemProvider(this);
		}

		return eefColumnDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFLineDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFLineDescriptionItemProvider eefLineDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFLineDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFLineDescriptionAdapter() {
		if (eefLineDescriptionItemProvider == null) {
			eefLineDescriptionItemProvider = new EEFLineDescriptionItemProvider(this);
		}

		return eefLineDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.eef.EEFAdapterFactoryTableStructureDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEFAdapterFactoryTableStructureDescriptionItemProvider eefAdapterFactoryTableStructureDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.eef.EEFAdapterFactoryTableStructureDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEEFAdapterFactoryTableStructureDescriptionAdapter() {
		if (eefAdapterFactoryTableStructureDescriptionItemProvider == null) {
			eefAdapterFactoryTableStructureDescriptionItemProvider = new EEFAdapterFactoryTableStructureDescriptionItemProvider(
					this);
		}

		return eefAdapterFactoryTableStructureDescriptionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (eefViewDescriptionItemProvider != null)
			eefViewDescriptionItemProvider.dispose();
		if (eefPageDescriptionItemProvider != null)
			eefPageDescriptionItemProvider.dispose();
		if (eefGroupDescriptionItemProvider != null)
			eefGroupDescriptionItemProvider.dispose();
		if (eefContainerDescriptionItemProvider != null)
			eefContainerDescriptionItemProvider.dispose();
		if (eefJavaExtensionDescriptionItemProvider != null)
			eefJavaExtensionDescriptionItemProvider.dispose();
		if (eefInterpretedTableStructureDescriptionItemProvider != null)
			eefInterpretedTableStructureDescriptionItemProvider.dispose();
		if (eefAdapterFactoryTreeStructureDescriptionItemProvider != null)
			eefAdapterFactoryTreeStructureDescriptionItemProvider.dispose();
		if (eefInterpretedTreeStructureDescriptionItemProvider != null)
			eefInterpretedTreeStructureDescriptionItemProvider.dispose();
		if (eefTextDescriptionItemProvider != null)
			eefTextDescriptionItemProvider.dispose();
		if (eefCheckboxDescriptionItemProvider != null)
			eefCheckboxDescriptionItemProvider.dispose();
		if (eefSelectDescriptionItemProvider != null)
			eefSelectDescriptionItemProvider.dispose();
		if (eefLabelDescriptionItemProvider != null)
			eefLabelDescriptionItemProvider.dispose();
		if (eefRadioDescriptionItemProvider != null)
			eefRadioDescriptionItemProvider.dispose();
		if (eefTreeDialogSelectDescriptionItemProvider != null)
			eefTreeDialogSelectDescriptionItemProvider.dispose();
		if (eefLinkDescriptionItemProvider != null)
			eefLinkDescriptionItemProvider.dispose();
		if (eefImageDescriptionItemProvider != null)
			eefImageDescriptionItemProvider.dispose();
		if (eefTreeDescriptionItemProvider != null)
			eefTreeDescriptionItemProvider.dispose();
		if (eefImagePickerDescriptionItemProvider != null)
			eefImagePickerDescriptionItemProvider.dispose();
		if (eefTableDescriptionItemProvider != null)
			eefTableDescriptionItemProvider.dispose();
		if (eefColumnDescriptionItemProvider != null)
			eefColumnDescriptionItemProvider.dispose();
		if (eefLineDescriptionItemProvider != null)
			eefLineDescriptionItemProvider.dispose();
		if (eefAdapterFactoryTableStructureDescriptionItemProvider != null)
			eefAdapterFactoryTableStructureDescriptionItemProvider.dispose();
	}

}
