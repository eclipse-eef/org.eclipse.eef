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
package org.eclipse.eef.ide.ui.api;

import org.eclipse.core.runtime.Platform;
import org.eclipse.eef.common.api.utils.Util;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.InputDescriptor;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.Updater;
import org.eclipse.eef.ide.ui.internal.widgets.EEFSectionLifecycleManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;

/**
 * This class is used as the entry point to manage a tab with EEF.
 *
 * @author sbegaudeau
 */
public class EEFTab {

	/**
	 * The page.
	 */
	private EEFPage eefPage;

	/**
	 * The lifecycle manager.
	 */
	private EEFSectionLifecycleManager lifecycleManager;

	/**
	 * The updater which refreshes this section on external model changes.
	 */
	private Updater updater;

	/**
	 * The form container.
	 */
	private IEEFFormContainer formContainer;

	/**
	 * The constructor.
	 *
	 * @param eefPage
	 *            The page
	 */
	public EEFTab(EEFPage eefPage) {
		this.eefPage = eefPage;
		this.lifecycleManager = new EEFSectionLifecycleManager(eefPage);
	}

	/**
	 * Creates the controls of the tab.
	 *
	 * @param parent
	 *            The parent container
	 * @param container
	 *            The container of the whole form
	 */
	public void createControls(Composite parent, IEEFFormContainer container) {
		EEFIdeUiPlugin.getPlugin().debug("EEFSection#createControls(...)"); //$NON-NLS-1$

		this.formContainer = container;
		this.lifecycleManager.createControl(parent, container);

		this.updater = new Updater(this, container);
	}

	/**
	 * This method needs to be called before displaying the tab in the user interface.
	 */
	public void aboutToBeShown() {
		EEFIdeUiPlugin.getPlugin().debug("EEFSection#aboutToBeShown(...)"); //$NON-NLS-1$

		this.lifecycleManager.aboutToBeShown();

		updater.enable();
	}

	/**
	 * Sets the input of the tab.
	 *
	 * @param part
	 *            The workbench part
	 * @param selection
	 *            The selection
	 */
	public void setInput(IWorkbenchPart part, ISelection selection) {
		EEFIdeUiPlugin.getPlugin().debug("EEFSection#setInput(...)"); //$NON-NLS-1$

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection iStructuredSelection = (IStructuredSelection) selection;
			Object object = iStructuredSelection.getFirstElement();

			InputDescriptor input = Platform.getAdapterManager().getAdapter(object, InputDescriptor.class);

			if (input != null) {
				// TODO we should create a whole context with the current selection etc for the context
				this.eefPage.getView().setInput(input);
			}
		}
	}

	/**
	 * Refreshes the tab.
	 */
	public void refresh() {
		EEFIdeUiPlugin.getPlugin().debug("EEFSection#refresh(...)"); //$NON-NLS-1$

		String title = this.eefPage.getView().getLabel();
		if (!Util.isBlank(title)) {
			this.formContainer.getForm().setText(title);
		}
		this.lifecycleManager.refresh();
	}

	/**
	 * This method needs to be called before hidding the tab.
	 */
	public void aboutToBeHidden() {
		EEFIdeUiPlugin.getPlugin().debug("EEFSection#aboutToBeHidden(...)"); //$NON-NLS-1$

		updater.disable();

		this.lifecycleManager.aboutToBeHidden();
	}

	/**
	 * Disposes the tab.
	 */
	public void dispose() {
		EEFIdeUiPlugin.getPlugin().debug("EEFSection#dispose(...)"); //$NON-NLS-1$

		this.lifecycleManager.dispose();
		this.formContainer = null;
	}

	/**
	 * Return the eefPage.
	 *
	 * @return the eefPage
	 */
	public EEFPage getEEFPage() {
		return this.eefPage;
	}
}
