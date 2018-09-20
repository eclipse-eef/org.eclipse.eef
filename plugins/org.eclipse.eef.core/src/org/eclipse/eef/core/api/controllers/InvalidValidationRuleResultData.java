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

import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.utils.EvalFactory.Eval;

/**
 * Utility class holding the data of the invalid validation rule result.
 *
 * @author sbegaudeau
 */
public class InvalidValidationRuleResultData {

	/**
	 * The evaluation environment.
	 */
	private Eval<Object> eval;

	/**
	 * The editing context adapter.
	 */
	private EditingContextAdapter editingContextAdapter;

	/**
	 * The constructor.
	 *
	 * @param eval
	 *            The evaluation environment
	 * @param editingContextAdapter
	 *            The editong context adapter
	 */
	public InvalidValidationRuleResultData(Eval<Object> eval, EditingContextAdapter editingContextAdapter) {
		this.eval = eval;
		this.editingContextAdapter = editingContextAdapter;
	}

	/**
	 * Return the eval.
	 *
	 * @return the eval
	 */
	public Eval<Object> getEval() {
		return this.eval;
	}

	/**
	 * Return the editingContextAdapter.
	 *
	 * @return the editingContextAdapter
	 */
	public EditingContextAdapter getEditingContextAdapter() {
		return this.editingContextAdapter;
	}

}