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
package org.eclipse.emf.eef.runtime.api.providers;

import org.eclipse.emf.ecore.EObject;

/**
 * Policy for read only widgets.
 * 
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public interface IReadOnlyPolicy {

	/**
	 * @param context
	 *            Semantic EObject
	 * @param eStructuralFeature
	 *            EStructuralFeature
	 * @return if the widget is read only
	 */
	boolean isReadOnly(EObject context, Object eStructuralFeature);

}
