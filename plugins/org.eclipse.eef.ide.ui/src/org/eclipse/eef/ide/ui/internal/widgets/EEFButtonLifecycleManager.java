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
package org.eclipse.eef.ide.ui.internal.widgets;

import org.eclipse.eef.EEFButtonDescription;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFButtonController;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetWidgetFactory;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * This class will be used in order to manager the lifecycle of a button.
 *
 * @author pcdavid
 */
public class EEFButtonLifecycleManager implements ILifecycleManager {
	/**
	 * The key used for the help image.
	 */
	private static final String DLG_IMG_HELP = "dialog_help_image"; //$NON-NLS-1$

	/**
	 * The description.
	 */
	private EEFButtonDescription description;

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
	 * The button.
	 */
	private Button button;

	/**
	 * The label.
	 */
	private Label label;

	/**
	 * The help label.
	 */
	private Label help;

	/**
	 * The controller.
	 */
	private IEEFButtonController controller;

	/**
	 * The listener on the button.
	 */
	private SelectionListener selectionListener;

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
	public EEFButtonLifecycleManager(EEFButtonDescription description, IVariableManager variableManager, IInterpreter interpreter,
			TransactionalEditingDomain editingDomain) {
		this.description = description;
		this.variableManager = variableManager;
		this.interpreter = interpreter;
		this.editingDomain = editingDomain;
	}

	@Override
	public void createControl(Composite parent, EEFTabbedPropertySheetPage tabbedPropertySheetPage) {
		EEFTabbedPropertySheetWidgetFactory widgetFactory = tabbedPropertySheetPage.getWidgetFactory();

		this.label = widgetFactory.createLabel(parent, ""); //$NON-NLS-1$

		this.button = widgetFactory.createButton(parent, "DO IT", SWT.NONE); //$NON-NLS-1$
		// this.button.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.BEGINNING);
		this.button.setLayoutData(nameData);

		this.help = widgetFactory.createLabel(parent, ""); //$NON-NLS-1$
		Image image = JFaceResources.getImage(DLG_IMG_HELP);
		help.setImage(image);
		help.setToolTipText("There should be some help in this tooltip..."); //$NON-NLS-1$

		this.controller = new EEFControllersFactory().createButtonController(this.description, this.variableManager, this.interpreter,
				this.editingDomain);
	}

	@Override
	public void aboutToBeShown() {
		this.selectionListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				controller.pushed();
			}
		};
		this.button.addSelectionListener(this.selectionListener);

		this.controller.onNewLabel(new IConsumer<String>() {
			@Override
			public void apply(String value) {
				if (!label.isDisposed() && !(label.getText() != null && label.getText().equals(value))) {
					label.setText(value);
				}
			}
		});
		this.controller.onNewButtonLabel(new IConsumer<String>() {
			@Override
			public void apply(String value) {
				if (!button.isDisposed() && !(button.getText() != null && button.getText().equals(value))) {
					button.setText(value);
				}
			}
		});
	}

	@Override
	public void refresh() {
		this.controller.refresh();
	}

	@Override
	public void aboutToBeHidden() {
		if (!button.isDisposed()) {
			this.button.removeSelectionListener(this.selectionListener);
		}
		this.controller.removeNewLabelConsumer();
		this.controller.removeNewButtonLabelConsumer();
	}

	@Override
	public void dispose() {
		// do nothing
	}
}
