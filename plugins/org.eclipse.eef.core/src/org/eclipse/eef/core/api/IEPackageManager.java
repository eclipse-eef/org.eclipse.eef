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

import org.eclipse.emf.ecore.EPackage;

/**
 * Utility class used to manage all the {@link EPackage} known by the application.
 *
 * @author sbegaudeau
 */
public interface IEPackageManager {
	/**
	 * Returns the {@link EPackage}.
	 * 
	 * @return the {@link EPackage}
	 */
	List<EPackage> getEPackages();
}
