/*******************************************************************************
 * Copyright (c) 2001, 2016 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Obeo - Contribution to the EEF project
 *******************************************************************************/
package org.eclipse.eef.properties.ui.internal.page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFTypeMapper;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * Provides a section filtering mechanism where the selection is an IStructuredSelection and filtering is based on
 * class.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 */
public class EEFTabbedPropertyRegistryClassSectionFilter {

	/**
	 * The type mapper.
	 */
	private IEEFTypeMapper typeMapper;

	/**
	 * The constructor.
	 *
	 * @param typeMapper
	 *            The type mapper
	 */
	public EEFTabbedPropertyRegistryClassSectionFilter(IEEFTypeMapper typeMapper) {
		this.typeMapper = typeMapper;
	}

	/**
	 * Verifies if the property section extension represented by sectionElement applies to the given input.
	 *
	 * @param descriptor
	 *            the section descriptor.
	 * @param selection
	 *            the selection.
	 * @return <code>true</code> if this section applies to the current selection.
	 */
	@SuppressWarnings({ "checkstyle:returncount" })
	public boolean appliesToSelection(IEEFSectionDescriptor descriptor, ISelection selection) {
		if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;

			if (descriptor.getEnablesFor() != IEEFSectionDescriptor.ENABLES_FOR_ANY && structuredSelection.size() != descriptor.getEnablesFor()) {
				/**
				 * enablesFor does not match the size of the selection, do not display section.
				 */
				return false;
			}

			Object[] objects = structuredSelection.toArray();

			IFilter filter = descriptor.getFilter();
			if (filter != null) {
				for (Object object : objects) {
					if (!filter.select(object)) {
						/**
						 * filter fails so section does not apply to the selection, do not display section.
						 */
						return false;
					}
				}
				/**
				 * filter passes for all objects in the selection.
				 */
				return true;
			}

			Set<Class<?>> effectiveTypes = new HashSet<Class<?>>();
			for (Object object : objects) {
				Class<?> remapType = object.getClass();
				if (typeMapper != null) {
					remapType = typeMapper.mapType(object);
				}

				if (effectiveTypes.add(remapType)) {

					// the effective types of the selection
					if (!this.appliesToEffectiveType(descriptor, remapType)) {
						return false;
					}
				}
			}
		} else {
			/* Bug 245690 selection is not a IStructuredSelection */
			if (descriptor.getFilter() != null) {
				return descriptor.getFilter().select(selection);
			}
		}

		return true;
	}

	/**
	 * Indicates if the descriptor can be used with the given input class.
	 *
	 * @param descriptor
	 *            The descriptor
	 * @param inputClass
	 *            The input class
	 * @return <code>true</code> if it can be used, <code>false</code> otherwise
	 */
	private boolean appliesToEffectiveType(IEEFSectionDescriptor descriptor, Class<?> inputClass) {
		List<String> classTypes = this.getClassTypes(inputClass);
		List<String> sectionInputTypes = descriptor.getInputTypes();

		for (String type : sectionInputTypes) {
			if (classTypes.contains(type)) {
				// found a match
				return true;
			}
		}

		return false;
	}

	/**
	 * Returns the classes and interfaces the given target class extends/implements.
	 *
	 * @param target
	 *            The target
	 *
	 * @return The name of classes and interfaces implemented and extended by the given class.
	 */
	protected List<String> getClassTypes(Class<?> target) {
		List<String> result = new ArrayList<String>();

		// add classes
		List<Class<?>> classes = this.computeClassOrder(target);
		for (Class<?> aClass : classes) {
			result.add(aClass.getName());
		}

		// add interfaces
		result.addAll(this.computeInterfaceNameOrder(classes));
		return result;
	}

	/**
	 * Returns the list of all the classes extended by the given class.
	 *
	 * @param target
	 *            The class
	 * @return The list of all the classes extended by the given class
	 */
	private List<Class<?>> computeClassOrder(Class<?> target) {
		List<Class<?>> result = new ArrayList<Class<?>>();

		Class<?> clazz = target;
		while (clazz != null) {
			result.add(clazz);
			clazz = clazz.getSuperclass();
		}

		return result;
	}

	/**
	 * Returns the list of the name of all the interfaces implemented by the given classes.
	 *
	 * @param classes
	 *            The classes
	 * @return The list of the name of all the interfaces implemented by the given classes
	 */
	private List<String> computeInterfaceNameOrder(List<Class<?>> classes) {
		List<String> result = new ArrayList<String>();
		Map<Class<?>, Class<?>> seen = new HashMap<Class<?>, Class<?>>();

		for (Class<?> aClass : classes) {
			this.internalComputeInterfaceOrder(aClass.getInterfaces(), result, seen);
		}

		return result;
	}

	/**
	 * Computes the order of the interfaces seen.
	 *
	 * @param interfaces
	 *            The interfaces
	 * @param result
	 *            The name of the interfaces
	 * @param seen
	 *            The map of the interfaces already seen
	 */
	private void internalComputeInterfaceOrder(Class<?>[] interfaces, List<String> result, Map<Class<?>, Class<?>> seen) {
		List<Class<?>> newInterfaces = new ArrayList<Class<?>>(seen.size());

		for (int i = 0; i < interfaces.length; i++) {
			Class<?> interfac = interfaces[i];
			if (seen.get(interfac) == null) {
				result.add(interfac.getName());
				seen.put(interfac, interfac);
				newInterfaces.add(interfac);
			}
		}

		for (Class<?> newInterface : newInterfaces) {
			this.internalComputeInterfaceOrder(newInterface.getInterfaces(), result, seen);
		}
	}

}
