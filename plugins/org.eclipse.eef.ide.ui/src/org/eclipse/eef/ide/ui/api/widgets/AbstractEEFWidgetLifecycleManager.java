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
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IValidationMessage;
import org.eclipse.eef.ide.ui.api.ILifecycleManager;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetWidgetFactory;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.IMessageManager;

/**
 * Parent of all the lifecycle managers.
 *
 * @author sbegaudeau
 */
public abstract class AbstractEEFWidgetLifecycleManager implements ILifecycleManager {
	/**
	 * The key used for the help image.
	 */
	private static final String DLG_IMG_HELP = "dialog_help_image"; //$NON-NLS-1$

	/**
	 * The variable manager.
	 */
	protected IVariableManager variableManager;

	/**
	 * The interpreter.
	 */
	protected IInterpreter interpreter;

	/**
	 * The editing domain.
	 */
	protected TransactionalEditingDomain editingDomain;

	/**
	 * The label.
	 */
	protected Label label;

	/**
	 * The help label.
	 */
	protected Label help;

	/**
	 * The tabbed property sheet page.
	 */
	private EEFTabbedPropertySheetPage page;

	/**
	 * The constructor.
	 *
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingDomain
	 *            The editing domain
	 */
	public AbstractEEFWidgetLifecycleManager(IVariableManager variableManager, IInterpreter interpreter, TransactionalEditingDomain editingDomain) {
		this.variableManager = variableManager;
		this.interpreter = interpreter;
		this.editingDomain = editingDomain;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#createControl(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage)
	 */
	@Override
	public void createControl(Composite parent, EEFTabbedPropertySheetPage tabbedPropertySheetPage) {
		this.page = tabbedPropertySheetPage;
		EEFTabbedPropertySheetWidgetFactory widgetFactory = tabbedPropertySheetPage.getWidgetFactory();

		this.label = widgetFactory.createLabel(parent, ""); //$NON-NLS-1$

		this.createMainControl(parent, tabbedPropertySheetPage);

		this.help = widgetFactory.createLabel(parent, ""); //$NON-NLS-1$
		Image image = JFaceResources.getImage(DLG_IMG_HELP);
		help.setImage(image);
		help.setToolTipText("There should be some help in this tooltip..."); //$NON-NLS-1$
	}

	/**
	 * Create the main control.
	 *
	 * @param parent
	 *            The composite parent
	 * @param tabbedPropertySheetPage
	 *            The tabbed property sheet page
	 */
	protected abstract void createMainControl(Composite parent, EEFTabbedPropertySheetPage tabbedPropertySheetPage);

	/**
	 * Returns the controller.
	 *
	 * @return The controller
	 */
	protected abstract IEEFWidgetController getController();

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		this.getController().onNewLabel(new IConsumer<String>() {
			@Override
			public void apply(String value) {
				if (!label.isDisposed() && !(label.getText() != null && label.getText().equals(value))) {
					label.setText(value);
				}
			}
		});

		this.getController().onValidation(new IConsumer<List<IValidationMessage>>() {
			@Override
			public void apply(List<IValidationMessage> messages) {
				IMessageManager messageManager = page.getForm().getMessageManager();
				messageManager.removeMessages(getValidationControl());

				for (IValidationMessage message : messages) {
					messageManager.addMessage(message.getKey(), message.getMessage(), message.getData(), message.getType(), getValidationControl());
				}
			}
		});
	}

	/**
	 * Returns the control on which the validation marker will appear.
	 *
	 * @return The control used to display the validation marker
	 */
	protected abstract Control getValidationControl();

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		this.getController().refresh();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		this.getController().removeNewLabelConsumer();
		this.getController().removeValidationConsumer();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#dispose()
	 */
	@Override
	public void dispose() {
		// do nothing
	}
}
