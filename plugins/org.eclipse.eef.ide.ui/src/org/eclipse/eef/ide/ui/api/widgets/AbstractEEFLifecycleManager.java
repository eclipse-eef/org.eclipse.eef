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
package org.eclipse.eef.ide.ui.api.widgets;

import java.util.List;

import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFController;
import org.eclipse.eef.core.api.controllers.IInvalidValidationRuleResult;
import org.eclipse.eef.core.api.controllers.IValidationRuleResult;
import org.eclipse.eef.ide.ui.api.ILifecycleManager;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.IMessageManager;

/**
 * Common superclass of all the lifecycle managers.
 *
 * @author sbegaudeau
 */
public abstract class AbstractEEFLifecycleManager implements ILifecycleManager {

	/**
	 * The tabbed property sheet page.
	 */
	protected EEFTabbedPropertySheetPage page;

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.org.eclipse.eef.ide.ui.api.widgets.ILifecycleManager#createControl(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage)
	 */
	@Override
	public void createControl(Composite parent, EEFTabbedPropertySheetPage tabbedPropertySheetPage) {
		this.page = tabbedPropertySheetPage;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.org.eclipse.eef.ide.ui.api.widgets.ILifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		this.getController().onValidation(new IConsumer<List<IValidationRuleResult>>() {
			@Override
			public void apply(List<IValidationRuleResult> validationRuleResults) {
				IMessageManager messageManager = page.getForm().getMessageManager();

				for (IValidationRuleResult validationRuleResult : validationRuleResults) {
					if (validationRuleResult instanceof IInvalidValidationRuleResult) {
						IInvalidValidationRuleResult result = (IInvalidValidationRuleResult) validationRuleResult;
						if (getValidationControl() != null) {
							messageManager.addMessage(result.getValidationRule(), result.getMessage(), result.getData(), result.getSeverity(),
									getValidationControl());
						} else {
							messageManager.addMessage(result.getValidationRule(), result.getMessage(), result.getData(), result.getSeverity());
						}
					} else {
						if (getValidationControl() != null) {
							messageManager.removeMessage(validationRuleResult.getValidationRule(), getValidationControl());
						} else {
							messageManager.removeMessage(validationRuleResult.getValidationRule());
						}
					}
				}
			}
		});
	}

	/**
	 * Returns the controller.
	 *
	 * @return The controller
	 */
	protected abstract IEEFController getController();

	/**
	 * Returns the control on which the validation marker will appear.
	 *
	 * @return The control used to display the validation marker
	 */
	protected abstract Control getValidationControl();

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.org.eclipse.eef.ide.ui.api.widgets.ILifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		this.getController().refresh();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.org.eclipse.eef.ide.ui.api.widgets.ILifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		this.getController().removeValidationConsumer();
	}
}
