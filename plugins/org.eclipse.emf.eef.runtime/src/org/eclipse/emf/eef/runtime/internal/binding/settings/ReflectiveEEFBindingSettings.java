/*******************************************************************************
 * Copyright (c) 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.internal.binding.settings;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.eef.runtime.EEFRuntime;
import org.eclipse.emf.eef.runtime.binding.PropertyBindingCustomizer;
import org.eclipse.emf.eef.runtime.binding.settings.EEFBindingSettings;
import org.eclipse.emf.eef.runtime.editingModel.EditingModelEnvironment;
import org.eclipse.emf.eef.runtime.editingModel.EditingModelPackage;
import org.eclipse.emf.eef.runtime.editingModel.PropertiesEditingModel;
import org.eclipse.emf.eef.runtime.internal.editingModel.EditingModelEnvironmentImpl;
import org.eclipse.emf.eef.runtime.view.lock.policies.EEFLockPolicy;
import org.osgi.service.event.EventAdmin;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 * 
 */
public class ReflectiveEEFBindingSettings<T extends EObject> implements EEFBindingSettings<T> {

	private T eefDescription;
	private EditingModelEnvironment editingModelEnvironment;
	private EventAdmin eventAdmin;

	/**
	 * @param eefDescription
	 */
	public ReflectiveEEFBindingSettings(T eefDescription) {
		this.eefDescription = eefDescription;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.services.EEFService#serviceFor(java.lang.Object)
	 */
	public boolean serviceFor(EPackage element) {
		return element == EditingModelPackage.eINSTANCE;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.binding.settings.EEFBindingSettings#getEditingModelEnvironment()
	 */
	public EditingModelEnvironment getEditingModelEnvironment() {
		if (editingModelEnvironment == null) {
			editingModelEnvironment = new EditingModelEnvironmentImpl(eventAdmin);
		}
		return editingModelEnvironment;
	}

	/**
	 * @param eventAdmin
	 *            the event admin to set
	 */
	public void setEventAdmin(EventAdmin eventAdmin) {
		this.eventAdmin = eventAdmin;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.binding.settings.EEFBindingSettings#getEEFDescription(org.eclipse.emf.ecore.EObject)
	 */
	public T getEEFDescription(EObject eObject) {
		return eefDescription;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.binding.settings.EEFBindingSettings#getEEFDescription(org.eclipse.emf.ecore.EObject)
	 */
	public T getEEFDescription(EClass eClass) {
		return eefDescription;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.binding.settings.EEFBindingSettings#enableLockPolicy(org.eclipse.emf.eef.runtime.view.lock.policies.EEFLockPolicy)
	 */
	public boolean enableLockPolicy(EEFLockPolicy lockPolicy) {
		return true;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.eef.runtime.binding.settings.EEFBindingSettings#getEditingModel(org.eclipse.emf.ecore.EPackage)
	 */
	public PropertiesEditingModel getEditingModel(EPackage ePackage) {
		return (PropertiesEditingModel) eefDescription;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.eef.runtime.binding.settings.EEFBindingSettings#loadClass(java.lang.String)
	 */
	@SuppressWarnings({ "unused", "unchecked" })
	public Class<PropertyBindingCustomizer> loadClass(String className) {
		Class<PropertyBindingCustomizer> result = null;
		try {
			return (Class<PropertyBindingCustomizer>) EEFRuntime.getPlugin().getBundle().loadClass(className);
		} catch (ClassNotFoundException e) {
			EEFRuntime.getPlugin().getLog().log(new Status(Status.ERROR, EEFRuntime.PLUGIN_ID, "Error when loading binding customizer class : " + className, e));
			return null;
		}
	}
}
