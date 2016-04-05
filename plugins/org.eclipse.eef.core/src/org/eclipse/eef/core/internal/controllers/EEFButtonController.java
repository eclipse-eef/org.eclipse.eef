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

import org.eclipse.eef.EEFButtonDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EditionContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFButtonController;
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
	private EditionContextAdapter eca;

	/**
	 * The consumer of a new value of the button's label.
	 */
	private IConsumer<String> newButtonLabelConsumer;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param eca
	 *            The editing context adapter
	 */
	public EEFButtonController(EEFButtonDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditionContextAdapter eca) {
		super(variableManager, interpreter);
		this.description = description;
		this.eca = eca;
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
	protected EEFWidgetDescription getDescription() {
		return this.description;
	}

	@Override
	public void refresh() {
		super.refresh();
		String buttonLabelExpression = this.description.getButtonLabelExpression();
		EAttribute eAttribute = EefPackage.Literals.EEF_BUTTON_DESCRIPTION__BUTTON_LABEL_EXPRESSION;

		this.newEval().call(eAttribute, buttonLabelExpression, String.class, EEFButtonController.this.newButtonLabelConsumer);
	}

	@Override
	public void pushed() {
		eca.performModelChange(new Runnable() {
			@Override
			public void run() {
				String pushExpression = EEFButtonController.this.description.getPushExpression();
				EAttribute attr = EefPackage.Literals.EEF_BUTTON_DESCRIPTION__PUSH_EXPRESSION;
				EEFButtonController.this.newEval().call(attr, pushExpression);
			}
		});
	}
}
