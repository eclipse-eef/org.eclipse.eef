/*******************************************************************************
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
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
