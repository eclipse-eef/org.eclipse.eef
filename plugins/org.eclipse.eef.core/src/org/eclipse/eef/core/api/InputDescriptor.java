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
package org.eclipse.eef.core.api;

import org.eclipse.emf.ecore.EObject;

/**
 * .
 *
 * @author pcdavid
 */
public interface InputDescriptor {
	/**
	 * The original selection before any interpretation or adaptation.
	 *
	 * @return the original selection.
	 */
	Object getOriginalSelection();

	/**
	 * The semantic model element of whom properties should be displayed, as determined from the original selection.
	 *
	 * @return the model element whose properties to display.
	 */
	EObject getSemanticElement();
}
