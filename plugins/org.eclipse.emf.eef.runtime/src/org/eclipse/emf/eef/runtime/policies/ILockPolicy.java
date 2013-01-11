/*******************************************************************************
 * Copyright (c) 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.policies;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

/**
 * Lock Policy.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */

public interface ILockPolicy {
	 /**
     * Lock.
     * 
     * @param propertiesEditingComponent IPropertiesEditionComponent.
     */
	void lock(IPropertiesEditionComponent propertiesEditingComponent);

	/**
	 * Unlock.
	 * 
	 * @param propertiesEditingComponent IPropertiesEditionComponent.
	 */
	void release(IPropertiesEditionComponent propertiesEditingComponent);

}
