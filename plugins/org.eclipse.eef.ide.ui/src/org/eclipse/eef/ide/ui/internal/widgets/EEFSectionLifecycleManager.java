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
package org.eclipse.eef.ide.ui.internal.widgets;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IEEFController;
import org.eclipse.eef.core.api.controllers.IEEFSectionController;
import org.eclipse.eef.ide.ui.api.ILifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager;
import org.eclipse.eef.ide.ui.internal.properties.EEFSectionDescriptor;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * The lifecycle manager of the section.
 *
 * @author sbegaudeau
 */
public class EEFSectionLifecycleManager extends AbstractEEFLifecycleManager {

	/**
	 * The section descriptor.
	 */
	private EEFSectionDescriptor sectionDescriptor;

	/**
	 * The controller of the section.
	 */
	private IEEFSectionController controller;

	/**
	 * The lifecycle managers of this section.
	 */
	private List<ILifecycleManager> lifecycleManagers = new ArrayList<ILifecycleManager>();

	/**
	 * The constructor.
	 *
	 * @param sectionDescriptor
	 *            The section descriptor
	 */
	public EEFSectionLifecycleManager(EEFSectionDescriptor sectionDescriptor) {
		this.sectionDescriptor = sectionDescriptor;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#createControl(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage)
	 */
	@Override
	public void createControl(Composite parent, EEFTabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControl(parent, tabbedPropertySheetPage);
		EEFPage eefPage = this.sectionDescriptor.getEEFPage();
		this.controller = new EEFControllersFactory().createSectionController(eefPage.getDescription(), eefPage.getVariableManager(),
				eefPage.getInterpreter());

		List<EEFGroup> eefGroups = eefPage.getGroups();
		for (EEFGroup eefGroup : eefGroups) {
			EEFGroupLifecycleManager groupLifecycleManager = new EEFGroupLifecycleManager(eefGroup.getDescription(), eefGroup.getVariableManager(),
					eefGroup.getInterpreter(), eefGroup.getEditingDomain());
			groupLifecycleManager.createControl(parent, this.page);

			this.lifecycleManagers.add(groupLifecycleManager);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		for (ILifecycleManager lifecycleManager : this.lifecycleManagers) {
			lifecycleManager.aboutToBeShown();
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#refresh()
	 */
	@Override
	public void refresh() {
		super.refresh();

		this.controller.refresh();

		for (ILifecycleManager lifecycleManager : this.lifecycleManagers) {
			lifecycleManager.refresh();
		}

		this.page.getForm().getMessageManager().update();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();

		this.page.getForm().getMessageManager().removeAllMessages();

		for (ILifecycleManager lifecycleManager : this.lifecycleManagers) {
			lifecycleManager.aboutToBeHidden();
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#getController()
	 */
	@Override
	protected IEEFController getController() {
		return this.controller;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#getValidationControl()
	 */
	@Override
	protected Control getValidationControl() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.org.eclipse.eef.ide.ui.api.widgets.ILifecycleManager#dispose()
	 */
	@Override
	public void dispose() {
		for (ILifecycleManager lifecycleManager : this.lifecycleManagers) {
			lifecycleManager.dispose();
		}
	}

}
