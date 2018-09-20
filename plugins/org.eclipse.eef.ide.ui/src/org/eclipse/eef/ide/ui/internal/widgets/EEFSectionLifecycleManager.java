/*******************************************************************************
 * Copyright (c) 2016, 2018 Obeo.
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
import java.util.Optional;

import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.EEFControllersFactory;
import org.eclipse.eef.core.api.controllers.IEEFController;
import org.eclipse.eef.core.api.controllers.IEEFSectionController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager;
import org.eclipse.eef.ide.ui.internal.widgets.quickfix.EEFMessageHyperlinkListener;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.forms.events.IHyperlinkListener;

/**
 * The lifecycle manager of the section.
 *
 * @author sbegaudeau
 */
public class EEFSectionLifecycleManager extends AbstractEEFLifecycleManager implements IEEFToolbarLifecycleManager {

	/**
	 * The page.
	 */
	private EEFPage eefPage;

	/**
	 * The controller of the section.
	 */
	private IEEFSectionController controller;

	/**
	 * The lifecycle managers of this section.
	 */
	private List<IEEFLifecycleManager> lifecycleManagers = new ArrayList<IEEFLifecycleManager>();

	/**
	 * The hyperlink listener.
	 */
	private IHyperlinkListener hyperlinkListener;

	/**
	 * The constructor.
	 *
	 * @param eefPage
	 *            The page
	 */
	public EEFSectionLifecycleManager(EEFPage eefPage) {
		this.eefPage = eefPage;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#createControl(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.eef.common.ui.api.IEEFFormContainer)
	 */
	@Override
	public void createControl(Composite parent, IEEFFormContainer formContainer) {
		super.createControl(parent, formContainer);

		this.hyperlinkListener = new EEFMessageHyperlinkListener(formContainer.getShell());

		this.controller = new EEFControllersFactory().createSectionController(this.eefPage.getDescription(), this.eefPage.getVariableManager(),
				this.eefPage.getInterpreter(), this.eefPage.getView().getContextAdapter());

		List<EEFGroup> eefGroups = this.eefPage.getGroups();
		for (EEFGroup eefGroup : eefGroups) {
			EditingContextAdapter contextAdapter = eefGroup.getPage().getView().getContextAdapter();
			EEFGroupLifecycleManager groupLifecycleManager = new EEFGroupLifecycleManager(eefGroup.getDescription(), eefGroup.getVariableManager(),
					eefGroup.getInterpreter(), contextAdapter);
			groupLifecycleManager.createControl(parent, formContainer);

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

		this.populateToolBar(this.container.getForm().getToolBarManager(), this.eefPage.getDescription().getActions(), this.controller,
				this.eefPage.getView().getContextAdapter(), this.eefPage.getInterpreter(), this.eefPage.getVariableManager());
		this.container.getForm().addMessageHyperlinkListener(this.hyperlinkListener);

		this.lifecycleManagers.forEach(IEEFLifecycleManager::aboutToBeShown);
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

		this.lifecycleManagers.forEach(IEEFLifecycleManager::refresh);

		this.container.getForm().getMessageManager().update();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#aboutToBeHidden()
	 */
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();

		if (!this.container.getForm().isDisposed()) {
			this.container.getForm().removeMessageHyperlinkListener(this.hyperlinkListener);
			this.container.getForm().getMessageManager().removeAllMessages();
			this.clearToolBar(this.container.getForm().getToolBarManager());
		}

		this.lifecycleManagers.forEach(IEEFLifecycleManager::aboutToBeHidden);
	}

	/**
	 * Clear the toolbar.
	 *
	 * @param toolBarManager
	 *            The tool bar manager
	 */
	private void clearToolBar(IToolBarManager toolBarManager) {
		if (toolBarManager instanceof ToolBarManager) {
			// For an unknown reason, the existing tool bar of the formContainer doesn't have a transparent background.
			ToolBar toolBar = ((ToolBarManager) toolBarManager).getControl();
			toolBar.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_TRANSPARENT));
		}

		Optional.ofNullable(toolBarManager).ifPresent(manager -> {
			manager.removeAll();
			manager.update(true);
		});
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
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#dispose()
	 */
	@Override
	public void dispose() {
		this.lifecycleManagers.forEach(IEEFLifecycleManager::dispose);
	}
}
