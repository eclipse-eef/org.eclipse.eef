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
package org.eclipse.eef.core.internal.controllers;

import com.google.common.base.Strings;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFButtonDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFButtonController;
import org.eclipse.eef.core.api.utils.EvalFactory.Eval;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class will be used in order to manage the behavior of the button.
 *
 * @author pcdavid
 */
public class EEFButtonController extends AbstractEEFWidgetController implements IEEFButtonController {
	/**
	 * The description.
	 */
	private EEFButtonDescription description;

	/**
	 * The editing context adapter.
	 */
	private EditingContextAdapter contextAdapter;

	/**
	 * The consumer of a new value of the button's label.
	 */
	private IConsumer<String> newButtonLabelConsumer;

	/**
	 * The consumer of a new value of the button's image.
	 */
	private IConsumer<Object> newButtonImageConsumer;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param contextAdapter
	 *            The editing context adapter
	 */
	public EEFButtonController(EEFButtonDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter);
		this.description = description;
		this.contextAdapter = contextAdapter;
	}

	@Override
	public void onNewButtonLabel(IConsumer<String> consumer) {
		this.newButtonLabelConsumer = consumer;
	}

	@Override
	public void removeNewButtonLabelConsumer() {
		this.newButtonLabelConsumer = null;
	}

	@Override
	public void onNewButtonImage(IConsumer<Object> consumer) {
		this.newButtonImageConsumer = consumer;
	}

	@Override
	public void removeNewButtonImageConsumer() {
		this.newButtonImageConsumer = null;
	}

	@Override
	protected EEFWidgetDescription getDescription() {
		return this.description;
	}

	@Override
	public void refresh() {
		super.refresh();

		String buttonImageExpression = this.description.getButtonImageExpression();
		this.newEval().logIfInvalidType(Object.class).call(buttonImageExpression, this.newButtonImageConsumer);

		// If the button has an image, do not put label default value
		boolean labelDefaultValue = true;
		if (!Strings.isNullOrEmpty(buttonImageExpression)) {
			labelDefaultValue = false;
		}

		String buttonLabelExpression = this.description.getButtonLabelExpression();
		Eval<String> evaluation = this.newEval().logIfInvalidType(String.class);
		if (labelDefaultValue) {
			evaluation = evaluation.defaultValue("..."); //$NON-NLS-1$
		}
		evaluation.call(buttonLabelExpression, this.newButtonLabelConsumer);

	}

	@Override
	public IStatus pushed() {
		return contextAdapter.performModelChange(new Runnable() {
			@Override
			public void run() {
				String pushExpression = EEFButtonController.this.description.getPushExpression();
				EAttribute attr = EefPackage.Literals.EEF_BUTTON_DESCRIPTION__PUSH_EXPRESSION;
				EEFButtonController.this.newEval().logIfBlank(attr).call(pushExpression);
			}
		});
	}
}
