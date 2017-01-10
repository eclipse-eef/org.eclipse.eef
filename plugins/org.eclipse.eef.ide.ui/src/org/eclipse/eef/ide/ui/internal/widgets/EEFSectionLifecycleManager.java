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
import java.util.Collection;
import java.util.List;

import org.eclipse.eef.EEFToolbarAction;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.events.IHyperlinkListener;

/**
 * The lifecycle manager of the section.
 *
 * @author sbegaudeau
 */
public class EEFSectionLifecycleManager extends AbstractEEFLifecycleManager {

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

		populatePageToolbar(formContainer, this.eefPage.getDescription().getActions());
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.ide.ui.api.widgets.AbstractEEFLifecycleManager#aboutToBeShown()
	 */
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.container.getForm().addMessageHyperlinkListener(this.hyperlinkListener);

		for (IEEFLifecycleManager lifecycleManager : this.lifecycleManagers) {
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

		for (IEEFLifecycleManager lifecycleManager : this.lifecycleManagers) {
			lifecycleManager.refresh();
		}

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
		}

		for (IEEFLifecycleManager lifecycleManager : this.lifecycleManagers) {
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
	 * @see org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager#dispose()
	 */
	@Override
	public void dispose() {
		for (IEEFLifecycleManager lifecycleManager : this.lifecycleManagers) {
			lifecycleManager.dispose();
		}
	}

	/**
	 * Populates the toolbar.
	 *
	 * @param formContainer
	 *            The form container.
	 * @param actions
	 *            the list of actions of the toolbar.
	 */
	private void populatePageToolbar(IEEFFormContainer formContainer, Collection<EEFToolbarAction> actions) {
		IToolBarManager toolBarManager = formContainer.getForm().getToolBarManager();
		if (toolBarManager != null) {
			toolBarManager.removeAll();
			for (EEFToolbarAction eefToolbarAction : actions) {
				toolBarManager
						.add(new ToolbarAction(eefToolbarAction, this.controller, this.eefPage.getInterpreter(), this.eefPage.getVariableManager()));
			}
			toolBarManager.update(true);
		}
	}
}
