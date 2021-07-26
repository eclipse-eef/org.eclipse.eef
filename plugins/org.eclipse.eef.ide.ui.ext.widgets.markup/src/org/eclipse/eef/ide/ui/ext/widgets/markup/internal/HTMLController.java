/**
 * Copyright (c) Israel Aerospace Industries, Eclipse contributors and others 2021.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *
 */

package org.eclipse.eef.ide.ui.ext.widgets.markup.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtHTMLRendererDescription;
import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.MarkupWidgetsPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

public class HTMLController extends AbstractEEFWidgetController {

	private static final String NEW_VALUE_EXPRESSION_NAME = "newValue"; //$NON-NLS-1$

	private EEFExtHTMLRendererDescription description;

	private Consumer<Object> newValueConsumer;

	public HTMLController(IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter editingContextAdapter, EEFExtHTMLRendererDescription description) {
		super(variableManager, interpreter, editingContextAdapter);
		this.description = description;
	}

	@Override
	protected EEFWidgetDescription getDescription() {
		return description;
	}

	@Override
	public void refresh() {
		super.refresh();
		this.newEval().call(description.getValueExpression(), this.newValueConsumer);
	}

	public IStatus updateValue(final String text) {
		return this.editingContextAdapter.performModelChange(() -> {
			String editExpression = this.description.getEditExpression();
			EAttribute eAttribute = MarkupWidgetsPackage.Literals.EEF_EXT_HTML_RENDERER_DESCRIPTION__EDIT_EXPRESSION;

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.putAll(this.variableManager.getVariables());
			variables.put(EEFExpressionUtils.EEFText.NEW_VALUE, text);

			EvalFactory.of(this.interpreter, variables).logIfBlank(eAttribute).call(editExpression);
		});
	}

	public void handleEditEnd(Object object) {
		this.editingContextAdapter.performModelChange(() -> {
			String editExpression = description.getEditExpression();

			Map<String, Object> variables = new HashMap<String, Object>();
			variables.putAll(this.variableManager.getVariables());
			variables.put(NEW_VALUE_EXPRESSION_NAME, object);

			EvalFactory.of(this.interpreter, variables).call(editExpression);
		});
	}

	public void onNewValue(Consumer<Object> consumer) {
		this.newValueConsumer = consumer;
	}

	public void removeValueConsumer() {
		this.newValueConsumer = null;
	}

}
