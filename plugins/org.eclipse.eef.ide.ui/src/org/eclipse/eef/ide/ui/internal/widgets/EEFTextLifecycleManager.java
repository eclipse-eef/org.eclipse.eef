/*******************************************************************************
 * Copyright (c) 2015 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.internal.widgets;

import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.core.api.IVariableManager;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.EEFTextController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

/**
 * This class will be used in order to manager the lifecycle of a text.
 *
 * @author sbegaudeau
 */
public class EEFTextLifecycleManager implements ILifecycleManager {
	/**
	 * The description.
	 */
	private EEFTextDescription description;

	/**
	 * The variable manager.
	 */
	private IVariableManager variableManager;

	/**
	 * The interpreter.
	 */
	private IInterpreter interpreter;

	/**
	 * The editing domain.
	 */
	private TransactionalEditingDomain editingDomain;

	/**
	 * The text.
	 */
	private Text text;

	/**
	 * The label.
	 */
	private CLabel label;

	/**
	 * The controller.
	 */
	private EEFTextController controller;

	/**
	 * The listener on the text.
	 */
	private ModifyListener modifyListener;

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingDomain
	 *            The editing domain
	 */
	public EEFTextLifecycleManager(EEFTextDescription description, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain) {
		this.description = description;
		this.variableManager = variableManager;
		this.interpreter = interpreter;
		this.editingDomain = editingDomain;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#createControl(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	@Override
	public void createControl(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		TabbedPropertySheetWidgetFactory widgetFactory = tabbedPropertySheetPage.getWidgetFactory();

		this.text = this.createText(parent, widgetFactory);
		this.label = this.createLabel(parent, widgetFactory, this.text);

		this.controller = new EEFControllersFactory().createTextController(this.description, this.variableManager, this.interpreter,
				this.editingDomain);
	}

	/**
	 * Creates the text widget.
	 *
	 * @param parent
	 *            The composite parent
	 * @param widgetFactory
	 *            The widget factory
	 * @return The text widget created
	 */
	private Text createText(Composite parent, TabbedPropertySheetWidgetFactory widgetFactory) {
		Text textWidget = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		FormData data = new FormData();

		final int textOffset = 232;
		data.left = new FormAttachment(0, textOffset);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);

		textWidget.setLayoutData(data);
		textWidget.setEnabled(false);

		return textWidget;
	}

	/**
	 * Creates the label widget.
	 *
	 * @param parent
	 *            The composite parent
	 * @param widgetFactory
	 *            The widget factory
	 * @param textWidget
	 *            The text widget created
	 * @return The label widget created
	 */
	private CLabel createLabel(Composite parent, TabbedPropertySheetWidgetFactory widgetFactory, Text textWidget) {
		CLabel labelWidget = widgetFactory.createCLabel(parent, ""); //$NON-NLS-1$

		final int labelOffset = 20;
		FormData data = new FormData();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(textWidget, -ITabbedPropertyConstants.HSPACE - labelOffset);
		data.top = new FormAttachment(textWidget, 0, SWT.CENTER);
		labelWidget.setLayoutData(data);

		return labelWidget;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		this.modifyListener = new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent event) {
				controller.updateValue(text.getText());
			}
		};
		this.text.addModifyListener(this.modifyListener);

		this.controller.onNewValue(new IConsumer<String>() {
			@Override
			public void apply(String value) {
				if (!text.isDisposed() && !(text.getText() != null && text.getText().equals(value))) {
					text.setText(value);
					if (!text.isEnabled()) {
						text.setEnabled(true);
					}
				}
			}
		});

		this.controller.onNewLabel(new IConsumer<String>() {
			@Override
			public void apply(String value) {
				if (!label.isDisposed() && !(label.getText() != null && label.getText().equals(value))) {
					label.setText(value);
				}
			}
		});
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		this.controller.refresh();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		if (!text.isDisposed()) {
			this.text.removeModifyListener(this.modifyListener);
		}
		this.controller.removeNewValueConsumer();
		this.controller.removeNewLabelConsumer();
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
