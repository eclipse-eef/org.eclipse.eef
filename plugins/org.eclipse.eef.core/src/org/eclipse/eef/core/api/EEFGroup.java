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

import org.eclipse.eef.EEFGroupDescription;

/**
 * The {@link EEFGroup} is used as the main structure within a page.
 *
 * @author sbegaudeau
 */
public interface EEFGroup extends EEFContainerParent {
	/**
	 * Returns the description of the {@link EEFGroup}.
	 *
	 * @return The {@link EEFGroupDescription}
	 */
	EEFGroupDescription getDescription();

	/**
	 * Returns the {@link EEFContainer} used to layout this {@link EEFGroup}.
	 *
	 * @return The {@link EEFContainer}
	 */
	EEFContainer getContainer();
}
