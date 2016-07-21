/*******************************************************************************
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.ext.widgets.reference.api;

import java.util.List;

import org.eclipse.jface.viewers.ViewerFilter;

/**
 * This interface is used to provide {@link ViewerFilter} which will be used to filter the content of the tree viewers
 * used to let the end user select or create an EObject.
 *
 * @author sbegaudeau
 */
public interface IEEFExtReferenceViewerFilterProvider {
	/**
	 * The context in which the tree viewer is created.
	 *
	 * @author sbegaudeau
	 */
	public enum ContextKind {
		/**
		 * The tree viewer is created to select an EObject.
		 */
		EOBJECT_SELECTION,

		/**
		 * The tree viewer is created to select the EObject which will contain the EObject to create.
		 */
		CONTAINER_SELECTION
	}

	/**
	 * Returns a list of {@link ViewerFilter} to filter the content of the tree viewers of the reference widget dialogs.
	 *
	 * @param contextKind
	 *            The kind of context in which the viewer is visible
	 * @return The list of {@link ViewerFilter}
	 */
	List<ViewerFilter> getViewerFilters(ContextKind contextKind);
}
