/*******************************************************************************
 * Copyright (c) 2015, 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.core.internal.controllers;

import org.eclipse.eef.EEFLabelDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFLabelController;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

/**
 * This class will be used in order to manage the behavior of the label.
 *
 * @author mbats
 */
public class EEFLabelController extends AbstractEEFWidgetController implements IEEFLabelController {
	/**
	 * The description.
	 */
	private EEFLabelDescription description;

	/**
	 * The consumer of the new body.
	 */
	private IConsumer<String> newBodyConsumer;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 */
	public EEFLabelController(EEFLabelDescription description, IVariableManager variableManager, IInterpreter interpreter) {
		super(variableManager, interpreter);
		this.description = description;
	}

	/**
	 *
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();

		String bodyExpression = this.description.getValueExpression();
		this.newEval().logIfInvalidType(String.class).call(bodyExpression, this.newBodyConsumer);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController#getDescription()
	 */
	@Override
	protected EEFWidgetDescription getDescription() {
		return this.description;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFLabelController#onNewBody(org.eclipse.eef.core.api.controllers.IConsumer)
	 */
	@Override
	public void onNewBody(IConsumer<String> consumer) {
		this.newBodyConsumer = consumer;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.controllers.IEEFLabelController#removeNewBodyConsumer()
	 */
	@Override
	public void removeNewBodyConsumer() {
		this.newBodyConsumer = null;
	}

}
