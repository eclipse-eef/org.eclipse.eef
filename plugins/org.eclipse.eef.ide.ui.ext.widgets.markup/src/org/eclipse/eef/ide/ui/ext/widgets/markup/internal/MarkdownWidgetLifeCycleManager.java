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

import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ext.widgets.markup.MarkupWidgets.EEFExtMarkdownWidget;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.eef.ide.ui.ext.widgets.markup.internal.markdown.MarkdownWidget;
import org.eclipse.eef.ide.ui.ext.widgets.markup.internal.markdown.MarkdownWidgetController;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class MarkdownWidgetLifeCycleManager extends AbstractEEFWidgetLifecycleManager {

	private static final String EMPTY = ""; //$NON-NLS-1$
	private EEFExtMarkdownWidget controlDescription;
	private MarkdownWidgetController controller;
	private EEFWidgetFactory widgetFactory;
	private Composite composite;
	private MarkdownWidget mdWidget;

	public MarkdownWidgetLifeCycleManager(EEFExtMarkdownWidget controlDescription, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter editingContextAdapter) {
		super(variableManager, interpreter, editingContextAdapter);
		this.controlDescription = controlDescription;
	}

	@Override
	protected IEEFWidgetController getController() {
		return controller;
	}

	@Override
	protected EEFWidgetDescription getWidgetDescription() {
		return controlDescription;
	}

	@Override
	protected void setEnabled(boolean isEnabled) {
		mdWidget.setEnable(isEnabled);
	}

	@Override
	protected void createMainControl(Composite parent, IEEFFormContainer formContainer) {
		widgetFactory = formContainer.getWidgetFactory();
		composite = widgetFactory.createComposite(parent, SWT.NONE);

		GridLayout layout = new GridLayout(1, false);
		composite.setLayout(layout);

		GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		composite.setLayoutData(layoutData);

		this.controller = new MarkdownWidgetController(variableManager, interpreter, editingContextAdapter, controlDescription);

		int numberOfLine = controlDescription.getNumberOfLine();
		boolean isMultiLine = numberOfLine > 1;
		mdWidget = new MarkdownWidget(parent.getDisplay(), EMPTY, isMultiLine, true, v -> {
			controller.updateValue(v);
		});
		mdWidget.buildWidget(composite);
		GridData browserLayoutData = new GridData(GridData.FILL_BOTH);

		mdWidget.getControl().setLayoutData(browserLayoutData);

		mdWidget.getControl().setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);

		if (isMultiLine) {
			browserLayoutData.minimumHeight = mdWidget.getControl().getLineHeight() * numberOfLine;
		}

	}

	@Override
	public void aboutToBeHidden() {

		mdWidget.aboutToBeHidden();
		super.aboutToBeHidden();
	}

	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		mdWidget.aboutToBeShown();

		this.controller.onNewValue((value) -> {
			if (!mdWidget.getControl().isDisposed()) {
				final String sValue;
				if (value instanceof String) {
					sValue = (String) value;
				} else {
					sValue = EMPTY;
				}
				mdWidget.setText(sValue);
			}

		});

	}

	@Override
	protected Control getValidationControl() {
		return mdWidget.getControl();
	}

}
