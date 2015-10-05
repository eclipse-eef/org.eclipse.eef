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

/**
 * This interface is used to represent objects that have a parent.
 *
 * @author sbegaudeau
 */
public interface EEFChildObject extends EEFObject {
	/**
	 * Returns the parent of the {@link EEFObject}.
	 *
	 * @return The parent of the {@link EEFObject}
	 */
	EEFObject getParent();
}
