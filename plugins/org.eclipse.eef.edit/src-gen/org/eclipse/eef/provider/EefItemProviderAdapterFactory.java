/**
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.htm
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.eef.util.EefAdapterFactory;
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
 * This is the factory that is used to provide the interfaces needed to support Viewers. The adapters generated by this
 * factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The adapters
 * also support Eclipse property sheets. Note that most of the adapters are shared among multiple instances. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class EefItemProviderAdapterFactory extends EefAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFViewDescription} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFViewDescriptionItemProvider eefViewDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFViewDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
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
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFPageDescription} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFPageDescriptionItemProvider eefPageDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFPageDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
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
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFGroupDescription} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFGroupDescriptionItemProvider eefGroupDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFGroupDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
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
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFContainerDescription} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFContainerDescriptionItemProvider eefContainerDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFContainerDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
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
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFTextDescription} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFTextDescriptionItemProvider eefTextDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFTextDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
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
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFLabelDescription} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFLabelDescriptionItemProvider eefLabelDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFLabelDescription}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
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
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFDynamicMappingFor} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFDynamicMappingForItemProvider eefDynamicMappingForItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFDynamicMappingFor}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFDynamicMappingForAdapter() {
		if (eefDynamicMappingForItemProvider == null) {
			eefDynamicMappingForItemProvider = new EEFDynamicMappingForItemProvider(this);
		}

		return eefDynamicMappingForItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFDynamicMappingSwitch} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFDynamicMappingSwitchItemProvider eefDynamicMappingSwitchItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFDynamicMappingSwitch}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFDynamicMappingSwitchAdapter() {
		if (eefDynamicMappingSwitchItemProvider == null) {
			eefDynamicMappingSwitchItemProvider = new EEFDynamicMappingSwitchItemProvider(this);
		}

		return eefDynamicMappingSwitchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFDynamicMappingCase} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected EEFDynamicMappingCaseItemProvider eefDynamicMappingCaseItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.eef.EEFSelectDescription} instances. <!--
	 * begin-user-doc --> <!-- ======= This keeps track of the one adapter used for all
	 * {@link org.eclipse.eef.EEFSelectDescription} instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFSelectDescriptionItemProvider eefSelectDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.eef.EEFDynamicMappingCase}. <!-- begin-user-doc --> <!-- >>>>>>>
	 * Contribute the select widget. end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter createEEFDynamicMappingCaseAdapter() {
		if (eefDynamicMappingCaseItemProvider == null) {
			eefDynamicMappingCaseItemProvider = new EEFDynamicMappingCaseItemProvider(this);
		}

		return eefDynamicMappingCaseItemProvider;
	}

	@Override
	public Adapter createEEFSelectDescriptionAdapter() {
		if (eefSelectDescriptionItemProvider == null) {
			eefSelectDescriptionItemProvider = new EEFSelectDescriptionItemProvider(this);
		}

		return eefSelectDescriptionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
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
	 * This disposes all of the item providers created by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void dispose() {
		if (eefViewDescriptionItemProvider != null) {
			eefViewDescriptionItemProvider.dispose();
		}
		if (eefPageDescriptionItemProvider != null) {
			eefPageDescriptionItemProvider.dispose();
		}
		if (eefGroupDescriptionItemProvider != null) {
			eefGroupDescriptionItemProvider.dispose();
		}
		if (eefContainerDescriptionItemProvider != null) {
			eefContainerDescriptionItemProvider.dispose();
		}
		if (eefTextDescriptionItemProvider != null) {
			eefTextDescriptionItemProvider.dispose();
		}
		if (eefLabelDescriptionItemProvider != null) {
			eefLabelDescriptionItemProvider.dispose();
		}
		if (eefSelectDescriptionItemProvider != null) {
			eefSelectDescriptionItemProvider.dispose();
		}
		if (eefDynamicMappingForItemProvider != null) {
			eefDynamicMappingForItemProvider.dispose();
		}
		if (eefDynamicMappingSwitchItemProvider != null) {
			eefDynamicMappingSwitchItemProvider.dispose();
		}
		if (eefDynamicMappingCaseItemProvider != null) {
			eefDynamicMappingCaseItemProvider.dispose();
		}
	}
}
