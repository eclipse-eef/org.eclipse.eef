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
package org.eclipse.eef.core.api;

import java.util.List;

import org.eclipse.eef.EEFPageDescription;

/**
 * The {@link EEFPage} will control the content of a tab.
 *
 * @author sbegaudeau
 */
public interface EEFPage {
	/**
	 * Returns the description of the {@link EEFPage}.
	 *
	 * @return The {@link EEFPageDescription}
	 */
	EEFPageDescription getDescription();

	/**
	 * Returns the {@link EEFView} containing this {@link EEFPage}.
	 *
	 * @return The containing {@link EEFView}
	 */
	EEFView getView();

	/**
	 * Returns the label.
	 *
	 * @return The label
	 */
	String getLabel();

	/**
	 * Returns the {@link EEFGroup} composing this {@link EEFPage}.
	 * 
	 * @return The {@link EEFGroup}
	 */
	List<EEFGroup> getGroups();
}
