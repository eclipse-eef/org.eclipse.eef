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
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

/**
 * This class will handle the lifecycle of the {@link EEFContainerDescription}.
 *
 * @author sbegaudeau
 */
public class EEFContainerLifecycleManager implements IEEFLifecycleManager {

	/**
	 * The variable manager.
	 */
	private IVariableManager variableManager;

	/**
	 * The interpreter.
	 */
	private IInterpreter interpreter;

	/**
	 * The editing context adapter.
	 */
	private EditingContextAdapter contextAdapter;

	/**
	 * The description of the container.
	 */
	private EEFContainerDescription description;

	/**
	 * The lifecycle managers of the child of the container.
	 */
	private List<IEEFLifecycleManager> lifecycleManagers = new ArrayList<IEEFLifecycleManager>();

	private Composite widgetContainer = null;

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

		// If the container is directly under a group, we will create two empty labels for the first two columns of the
		// layout (label & help)
		widgetContainer = widgetFactory.createComposite(parent);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		if (this.description.eContainer() instanceof EEFGroupDescription) {
			// No need to evaluate 'For' containment,
			// 'For' cannot contain 'Container' only 'Group' can.
			gridData.horizontalSpan = 3; // Use label+help space to improve alignment.
		}
		widgetContainer.setLayoutData(gridData);

		GridLayoutFactory layout = GridLayoutFactory.swtDefaults().margins(0, 0).equalWidth(true);

		EEFLayoutDescription layoutDescr = this.description.getLayout();
		if (layoutDescr instanceof EEFFillLayoutDescription) {
			// The vertical layout is the default one, we will thus only handle the horizontal one
			EEFFillLayoutDescription fillLayoutDescription = (EEFFillLayoutDescription) layoutDescr;
			if (fillLayoutDescription.getOrientation() == EEF_FILL_LAYOUT_ORIENTATION.HORIZONTAL) {
				layout.numColumns(this.description.getControls().size());
				layout.equalWidth(false);
			}
		} else if (layoutDescr instanceof EEFGridLayoutDescription) {
			EEFGridLayoutDescription gridLayoutDescription = (EEFGridLayoutDescription) layoutDescr;
			layout.numColumns(gridLayoutDescription.getNumberOfColumns());
			layout.equalWidth(gridLayoutDescription.isMakeColumnsWithEqualWidth());
		}
		// layout.margins(1, 0); // ?.
		widgetContainer.setLayout(layout.create());

		EEFControlSwitch eefControlSwitch = new EEFControlSwitch(this.interpreter, this.contextAdapter);
		List<EEFControlDescription> controls = this.description.getControls();
		for (EEFControlDescription eefControlDescription : controls) {
			this.lifecycleManagers.addAll(eefControlSwitch.doCreate(widgetContainer, formContainer, eefControlDescription, this.variableManager));
		}
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
		widgetContainer.requestLayout();
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
