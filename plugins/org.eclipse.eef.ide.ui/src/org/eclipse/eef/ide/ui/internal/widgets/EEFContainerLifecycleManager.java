/*******************************************************************************
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.internal.widgets;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.EEFFillLayoutDescription;
import org.eclipse.eef.EEFGridLayoutDescription;
import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFLayoutDescription;
import org.eclipse.eef.EEF_FILL_LAYOUT_ORIENTATION;
import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

/**
 * This class will handle the lifecycle of the {@link EEFContainerDescription}.
 *
 * @author sbegaudeau
 */
public class EEFContainerLifecycleManager implements IEEFLifecycleManager {

	/**
	 * The description of the container.
	 */
	protected EEFContainerDescription description;

	/**
	 * The interpreter.
	 */
	protected IInterpreter interpreter;

	/**
	 * The variable manager.
	 */
	protected IVariableManager variableManager;

	/**
	 * The editing context adapter.
	 */
	private EditingContextAdapter contextAdapter;

	/**
	 * The lifecycle managers of the child of the container.
	 */
	private List<IEEFLifecycleManager> lifecycleManagers = new ArrayList<IEEFLifecycleManager>();

	/**
	 * The constructor.
	 *
	 * @param description
	 *            The description of the container
	 * @param variableManager
	 *            The variable manager
	 * @param interpreter
	 *            The interpreter
	 * @param editingContextAdapter
	 *            The editing context adapter
	 */
	public EEFContainerLifecycleManager(EEFContainerDescription description, IVariableManager variableManager, IInterpreter interpreter,
			EditingContextAdapter editingContextAdapter) {
		this.description = description;
		this.variableManager = variableManager;
		this.interpreter = interpreter;
		this.contextAdapter = editingContextAdapter;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#createControl(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.eef.common.ui.api.IEEFFormContainer)
	 */
	@Override
	public void createControl(Composite parent, IEEFFormContainer formContainer) {
		EEFWidgetFactory widgetFactory = formContainer.getWidgetFactory();

		Composite composite = null;
		GridData gridData = null;

		// If the container is directly under a group, we will create two empty labels for the first two columns of the
		// layout (label & help)
		if (this.description.eContainer() instanceof EEFGroupDescription) {
			widgetFactory.createLabel(parent, ""); //$NON-NLS-1$
			widgetFactory.createLabel(parent, ""); //$NON-NLS-1$
		}

		if (isBorderedContainer()) {
			String borderLabel = getBorderLabel();
			composite = widgetFactory.createGroup(parent, borderLabel);
			gridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		} else {
			composite = widgetFactory.createComposite(parent);
			gridData = new GridData(GridData.FILL_HORIZONTAL);
		}

		composite.setLayoutData(gridData);
		GridLayout compositeLayout = new GridLayout(1, true);
		compositeLayout.marginWidth = 1;

		EEFLayoutDescription layout = this.description.getLayout();
		if (layout instanceof EEFFillLayoutDescription) {
			// The vertical layout is the default one, we will thus only handle the horizontal one
			EEFFillLayoutDescription fillLayoutDescription = (EEFFillLayoutDescription) layout;
			if (fillLayoutDescription.getOrientation() == EEF_FILL_LAYOUT_ORIENTATION.HORIZONTAL) {
				compositeLayout = new GridLayout(this.description.getControls().size(), false);
				compositeLayout.marginWidth = 1;
			}
		} else if (layout instanceof EEFGridLayoutDescription) {
			EEFGridLayoutDescription gridLayoutDescription = (EEFGridLayoutDescription) layout;
			compositeLayout = new GridLayout(gridLayoutDescription.getNumberOfColumns(), gridLayoutDescription.isMakeColumnsWithEqualWidth());
			compositeLayout.marginWidth = 1;
		}
		composite.setLayout(compositeLayout);

		EEFControlSwitch eefControlSwitch = new EEFControlSwitch(this.interpreter, this.contextAdapter);
		List<EEFControlDescription> controls = this.description.getControls();
		for (EEFControlDescription eefControlDescription : controls) {
			this.lifecycleManagers.addAll(eefControlSwitch.doCreate(composite, formContainer, eefControlDescription, this.variableManager));
		}
	}

	/**
	 * Get label of the border if a border is drawn for the container.
	 *
	 * @return the label of the border if a border is drawn for the container.
	 */
	protected String getBorderLabel() {
		return ""; //$NON-NLS-1$
	}

	/**
	 * Check if a border around the container should be displayed.
	 *
	 * @return <code>true</code> if the container should have a border, <code>false</code> otherwise.
	 */
	protected boolean isBorderedContainer() {
		return false;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		this.lifecycleManagers.forEach(IEEFLifecycleManager::aboutToBeShown);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		this.lifecycleManagers.forEach(IEEFLifecycleManager::refresh);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		this.lifecycleManagers.forEach(IEEFLifecycleManager::aboutToBeHidden);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#dispose()
	 */
	@Override
	public void dispose() {
		this.lifecycleManagers.forEach(IEEFLifecycleManager::dispose);
	}

}
