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
package org.eclipse.eef.api;

import org.eclipse.eef.EEFViewDescription;

/**
 * This interface is used to provide an {@link EEFViewDescription}.
 *
 * @author sbegaudeau
 */
public interface IEEFViewDescriptionProvider {
	/**
	 * Returns an {@link EEFViewDescription}.
	 * 
	 * @return An {@link EEFViewDescription}
	 */
	EEFViewDescription get();
}
