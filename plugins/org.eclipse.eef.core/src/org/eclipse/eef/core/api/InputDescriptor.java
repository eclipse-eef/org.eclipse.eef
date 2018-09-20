/*******************************************************************************
 * Copyright (c) 2016, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.core.api;

import org.eclipse.emf.ecore.EObject;

/**
 * This interface is used to describe the input of the EEF view. This input can be represented by two values (which can
 * be identical), the original selection which can be a piece of text, a GMF mapping, a SWT widget, etc and the EMF
 * semantic element which is represented by this selection. For example, we could consider a piece of text coming from a
 * Xtext-based editor as the original selection (it could even be the ISelection object directly) and the semantic
 * element could thus be the EMF object created by the Xtext parser for the selected piece of text.
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
