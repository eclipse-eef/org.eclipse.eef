/*******************************************************************************
 * Copyright (c) 2017, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.core.api.controllers;

/**
 * The IEEFOnClickController is responsible of supporting all the interactions with the clickable widgets.
 *
 * @author mbats
 */
public interface IEEFOnClickController extends IEEFWidgetController {

	/**
	 * Invoked when the user clicks on an object.
	 *
	 * @param element
	 *            Semantic element
	 * @param onClickEventKind
	 *            The kind of event (single click or double click)
	 */
	void onClick(Object element, String onClickEventKind);
}
