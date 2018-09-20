/*******************************************************************************
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.properties.ui.api;

import java.util.Collection;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

/**
 * This interface is used to provide a list of {@link IEEFTabDescriptor}.
 *
 * @author mbats
 */
public interface IEEFTabDescriptorProvider {
	/**
	 * Returns an {@link IEEFTabDescriptor}.
	 *
	 * @param part
	 *            The current part
	 * @param selection
	 *            The current selection
	 * @param contributor
	 *            The contributor
	 *
	 * @return An {@link IEEFTabDescriptor}
	 */
	Collection<IEEFTabDescriptor> get(IWorkbenchPart part, ISelection selection, IEEFTabbedPropertySheetPageContributor contributor);
}
