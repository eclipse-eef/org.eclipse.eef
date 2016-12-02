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
package org.eclipse.eef.properties.ui.internal.registry;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.eef.properties.ui.api.AbstractEEFTabDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFSectionDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFTabDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFTabDescriptorFilter;
import org.eclipse.eef.properties.ui.api.IEEFTabDescriptorProvider;
import org.eclipse.eef.properties.ui.api.IEEFTabbedPropertySheetPageContributor;
import org.eclipse.eef.properties.ui.internal.EEFTabbedPropertyViewPlugin;
import org.eclipse.eef.properties.ui.internal.Messages;
import org.eclipse.eef.properties.ui.internal.extension.IItemDescriptor;
import org.eclipse.eef.properties.ui.internal.extension.IItemRegistry;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Provides information about the tabbed property extension points. Each tabbed property registry is associated with a
 * unique contributor ID.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 */
public class EEFTabbedPropertyRegistry {

	/**
	 * The sole instance of the registry.
	 */
	private static EEFTabbedPropertyRegistry instance = new EEFTabbedPropertyRegistry();

	/**
	 * The contributor.
	 */
	private static IEEFTabbedPropertySheetPageContributor contributor;

	/**
	 * Returns the sole instance of the registry.
	 *
	 * @param eefContributor
	 *            The contributor
	 *
	 * @return The sole instance of the registry
	 */
	public static EEFTabbedPropertyRegistry getDefault(IEEFTabbedPropertySheetPageContributor eefContributor) {
		contributor = eefContributor;
		return instance;
	}

	/**
	 * Returns all the descriptors defined by the tab descriptor providers.
	 *
	 * @param part
	 *            The current part
	 * @param input
	 *            The current selection
	 *
	 * @return The descriptors
	 */
	private List<IEEFTabDescriptor> getAllTabDescriptors(IWorkbenchPart part, ISelection input) {
		// Get the tab descriptors from the extension point
		Map<String, IEEFTabDescriptor> eefTabDescriptors = new LinkedHashMap<String, IEEFTabDescriptor>();
		IItemRegistry<IEEFTabDescriptorProvider> eefTabDescriptorProviderRegistry = EEFTabbedPropertyViewPlugin.getPlugin()
				.getEEFTabDescriptorProviderRegistry();
		for (IItemDescriptor<IEEFTabDescriptorProvider> itemDescriptor : eefTabDescriptorProviderRegistry.getItemDescriptors()) {
			IEEFTabDescriptorProvider eefTabDescriptorProvider = itemDescriptor.getItem();
			for (IEEFTabDescriptor eefTabDescriptor : eefTabDescriptorProvider.get(part, input, contributor)) {
				String eefTabDescriptorId = eefTabDescriptor.getId();
				if (!eefTabDescriptors.containsKey(eefTabDescriptorId) && filter(eefTabDescriptor)) {
					eefTabDescriptors.put(eefTabDescriptorId, eefTabDescriptor);
				}
			}
		}
		return new ArrayList<IEEFTabDescriptor>(eefTabDescriptors.values());
	}

	/**
	 * Returns if a tab descriptor must be filtered or not.
	 *
	 * @param eefTabDescriptor
	 *            The tab descriptor
	 * @return <code>true</code> if the tab descriptor should be used, <code>false</code> otherwise
	 */
	private boolean filter(IEEFTabDescriptor eefTabDescriptor) {
		IItemRegistry<IEEFTabDescriptorFilter> eefTabDescriptorFilterRegistry = EEFTabbedPropertyViewPlugin.getPlugin()
				.getEEFTabDescriptorFilterRegistry();
		for (IItemDescriptor<IEEFTabDescriptorFilter> itemDescriptor : eefTabDescriptorFilterRegistry.getItemDescriptors()) {
			IEEFTabDescriptorFilter eefTabDescriptorFilter = itemDescriptor.getItem();
			if (!eefTabDescriptorFilter.filter(eefTabDescriptor)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns the descriptors.
	 *
	 * @param part
	 *            The current part
	 * @param input
	 *            The current selection
	 * @return The descriptors for the given part and selection
	 */
	public List<IEEFTabDescriptor> getTabDescriptors(IWorkbenchPart part, ISelection input) {
		if (input == null || input.isEmpty()) {
			return new ArrayList<IEEFTabDescriptor>();
		}
		List<IEEFTabDescriptor> descriptors = getAllTabDescriptors(part, input);
		List<IEEFTabDescriptor> result = filterTabDescriptors(descriptors, part, input);
		return result;
	}

	/**
	 * Filters out the tab descriptors that do not have any sections for the given input.
	 *
	 * @param eefTabDescriptors
	 *            EEF tab descriptors
	 * @param part
	 *            The current part
	 * @param input
	 *            The current selection
	 * @return List of EEF tab descriptors
	 */
	private List<IEEFTabDescriptor> filterTabDescriptors(List<IEEFTabDescriptor> eefTabDescriptors, IWorkbenchPart part, ISelection input) {
		Map<String, IEEFTabDescriptor> filteredEefTabDescriptors = new LinkedHashMap<String, IEEFTabDescriptor>();
		for (IEEFTabDescriptor eefTabDescriptor : eefTabDescriptors) {
			IEEFTabDescriptor filteredEefTabDescriptor = adaptDescriptorFor(eefTabDescriptor, part, input);
			if (!filteredEefTabDescriptor.getSectionDescriptors().isEmpty()) {
				filteredEefTabDescriptors.put(filteredEefTabDescriptor.getId(), filteredEefTabDescriptor);
			}
		}
		return new ArrayList<IEEFTabDescriptor>(filteredEefTabDescriptors.values());
	}

	/**
	 * Given a property tab descriptor remove all its section descriptors that do not apply to the given input object.
	 *
	 * @param target
	 *            EEF tab descriptor
	 * @param part
	 *            The current part
	 * @param selection
	 *            The current selection
	 * @return EEF tab descriptor filtered according to the given selection
	 */
	private IEEFTabDescriptor adaptDescriptorFor(IEEFTabDescriptor target, IWorkbenchPart part, ISelection selection) {
		List<IEEFSectionDescriptor> filteredEefSectionDescriptors = new ArrayList<IEEFSectionDescriptor>();
		// Get all the available section for this tab
		List<IEEFSectionDescriptor> eefSectionDescriptors = target.getSectionDescriptors();
		for (IEEFSectionDescriptor eefSectionDescriptor : eefSectionDescriptors) {
			// Check if section is valid for the current part and selection
			if (eefSectionDescriptor.appliesTo(part, selection)) {
				if (eefSectionDescriptor.getId() != null) {
					filteredEefSectionDescriptors.add(eefSectionDescriptor);
				} else {
					EEFTabbedPropertyViewPlugin.getPlugin().error(Messages.EEFTabbedPropertyRegistry_MissingSectionDescriptorId);
				}
			}
		}

		AbstractEEFTabDescriptor filteredEefTabDescriptor = (AbstractEEFTabDescriptor) ((AbstractEEFTabDescriptor) target).clone();
		filteredEefTabDescriptor.setSectionDescriptors(filteredEefSectionDescriptors);
		return filteredEefTabDescriptor;
	}
}
