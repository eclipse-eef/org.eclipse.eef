/*******************************************************************************
 * Copyright (c) 2001, 2015 IBM Corporation and others.
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

import java.util.Collections;
import java.util.List;

import org.eclipse.eef.properties.ui.api.IEEFTabDescriptor;
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

	// TODO VERY BASIC IMPLEMENTATION, TO REWRITE FROM SCRATCH

	/**
	 * The sole instance of the registry.
	 */
	private static EEFTabbedPropertyRegistry instance = new EEFTabbedPropertyRegistry();

	/**
	 * The tab descriptors.
	 */
	private List<IEEFTabDescriptor> descriptors = Collections.singletonList((IEEFTabDescriptor) new TestTabDescriptor());

	/**
	 * Returns the sole instance of the registry.
	 *
	 * @return The sole instance of the registry
	 */
	public static EEFTabbedPropertyRegistry getDefault() {
		return instance;
	}

	/**
	 * Returns the descriptors.
	 *
	 * @return The descriptors
	 */
	public List<IEEFTabDescriptor> getTabDescriptors() {
		return this.descriptors;
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
		return this.descriptors;
	}
}
