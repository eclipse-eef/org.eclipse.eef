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

import org.eclipse.eef.interpreter.api.IInterpreterProvider;
import org.eclipse.emf.ecore.EPackage;

/**
 * The EEF context will be used to store all the necessary pieces of information required to build the {@link EEFView}.
 *
 * @author sbegaudeau
 */
public interface IEEFContext {
	/**
	 * The {@link EPackage} that can be used.
	 *
	 * @return The {@link EPackage}
	 */
	Iterable<EPackage> getEPackages();

	/**
	 * Return the variable manager.
	 *
	 * @return The variable manager
	 */
	IVariableManager getVariableManager();

	/**
	 * The {@link IInterpreterProvider}.
	 * 
	 * @return The {@link IInterpreterProvider}.
	 */
	List<IInterpreterProvider> getInterpreterProviders();
}
