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

import java.util.Map;

/**
 * The variable manager is used to handle the state of the variables.
 *
 * @author sbegaudeau
 */
public interface IVariableManager {

	/**
	 * Returns the variables.
	 *
	 * @return The variables
	 */
	Map<String, Object> getVariables();

}
