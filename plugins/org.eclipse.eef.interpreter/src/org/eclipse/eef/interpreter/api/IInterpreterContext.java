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
package org.eclipse.eef.interpreter.api;

import java.util.Map;

/**
 * The context to be used by the interpreter to validate and execute expressions.
 *
 * @author sbegaudeau
 */
public interface IInterpreterContext {
	/**
	 * Returns the parameters.
	 * 
	 * @return The parameters
	 */
	Map<String, Object> getParameters();
}
