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
package org.eclipse.eef.interpreter.aql.internal;

import org.eclipse.eef.interpreter.api.IInterpreter;
import org.eclipse.eef.interpreter.api.IInterpreterProvider;

/**
 * The AQL {@link IInterpreterProvider}.
 *
 * @author sbegaudeau
 */
public class AQLInterpreterProvider implements IInterpreterProvider {

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.interpreter.api.IInterpreterProvider#canHandle(java.lang.String)
	 */
	@Override
	public boolean canHandle(String expression) {
		return expression != null && expression.startsWith(IAQLConstants.AQL_PREFIX);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.interpreter.api.IInterpreterProvider#createInterpreter()
	 */
	@Override
	public IInterpreter createInterpreter() {
		return new AQLInterpreter();
	}

}
