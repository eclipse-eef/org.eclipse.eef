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
package org.eclipse.eef.ide.ui.internal.widgets;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.eclipse.eef.EEFListDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ide.ui.internal.EEFImageUtils;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * List widget label provider.
 *
 * @author mbats
 */
final class EEFListTableLabelProvider extends StyledCellLabelProvider {

	/**
	 * The description.
	 */
	private EEFListDescription description;

	/**
	 * The interpreter.
	 */
	private IInterpreter interpreter;

	/**
	 * The variable manager.
	 */
	private IVariableManager variableManager;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param interpreter
	 *            The interpreter
	 * @param variableManager
	 *            The variable manager
	 */
	EEFListTableLabelProvider(EEFListDescription description, IInterpreter interpreter, IVariableManager variableManager) {
		this.description = description;
		this.interpreter = interpreter;
		this.variableManager = variableManager;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.StyledCellLabelProvider#update(org.eclipse.jface.viewers.ViewerCell)
	 */
	@Override
	public void update(ViewerCell cell) {
		Object element = cell.getElement();
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.putAll(this.variableManager.getVariables());
		variables.put(EEFExpressionUtils.EEFList.VALUE, element);

		String displayExpression = this.description.getDisplayExpression();
		String value = EvalFactory.of(this.interpreter, variables).logIfInvalidType(String.class)
				.logIfBlank(EefPackage.Literals.EEF_LIST_DESCRIPTION__DISPLAY_EXPRESSION).evaluate(displayExpression);
		cell.setText(value);

		Optional<String> imageExpression = Optional.ofNullable(this.description.getImageExpression());
		imageExpression.filter(expr -> !Util.isBlank(expr)).ifPresent(expr -> {
			Object imagePath = EvalFactory.of(this.interpreter, variables).logIfInvalidType(Object.class).evaluate(expr);
			EEFImageUtils.getImage(imagePath).ifPresent(path -> cell.setImage(path));
		});

		super.update(cell);
	}
}