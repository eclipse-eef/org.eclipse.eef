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
 * Implementations can execute code which may modify an EMF model in a safe/controlled way.
 *
 * @author pcdavid
 */
public interface ModelChangeExecutor {
	/**
	 * Executes the specified {@link Runnable} which may have side-effects on an EMF model.
	 *
	 * @param effect
	 *            the code to execute.
	 */
	void execute(Runnable effect);
}
