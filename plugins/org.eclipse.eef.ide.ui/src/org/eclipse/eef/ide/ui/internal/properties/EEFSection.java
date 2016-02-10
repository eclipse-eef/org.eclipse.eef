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
package org.eclipse.eef.ide.ui.internal.properties;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.eef.common.api.preferences.EEFCommonPreferences;
import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.core.api.InputDescriptor;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.widgets.EEFGroupLifecycleManager;
import org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.api.IEEFSection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;

/**
 * The implementation of {@link IEEFSection} using the {@link EEFSectionDescriptor}.
 *
 * @author sbegaudeau
 */
public class EEFSection implements IEEFSection {

	/**
	 * The section descriptor.
	 */
	private EEFSectionDescriptor eefSectionDescriptor;

	/**
	 * The lifecycle managers of this section.
	 */
	private List<ILifecycleManager> lifecycleManagers = new ArrayList<ILifecycleManager>();

	/**
	 * The constructor.
	 *
	 * @param eefSectionDescriptor
	 *            The section descriptor
	 */
	public EEFSection(EEFSectionDescriptor eefSectionDescriptor) {
		this.eefSectionDescriptor = eefSectionDescriptor;
	}

	@Override
	public void createControls(Composite parent, EEFTabbedPropertySheetPage tabbedPropertySheetPage) {
		if (EEFCommonPreferences.isDebugEnabled()) {
			EEFIdeUiPlugin.getPlugin().info("EEFSection#createControls(...)"); //$NON-NLS-1$
		}

		EEFPage eefPage = this.eefSectionDescriptor.getEEFPage();
		List<EEFGroup> eefGroups = eefPage.getGroups();
		for (EEFGroup eefGroup : eefGroups) {
			EEFGroupLifecycleManager groupLifecycleManager = new EEFGroupLifecycleManager(eefGroup.getDescription(), eefGroup.getVariableManager(),
					eefGroup.getInterpreter(), eefGroup.getEditingDomain());
			groupLifecycleManager.createControl(parent, tabbedPropertySheetPage);

			this.lifecycleManagers.add(groupLifecycleManager);
		}
	}

	@Override
	public void aboutToBeShown() {
		if (EEFCommonPreferences.isDebugEnabled()) {
			EEFIdeUiPlugin.getPlugin().info("EEFSection#aboutToBeShown(...)"); //$NON-NLS-1$
		}

		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.aboutToBeShown();
		}
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (EEFCommonPreferences.isDebugEnabled()) {
			EEFIdeUiPlugin.getPlugin().info("EEFSection#setInput(...)"); //$NON-NLS-1$
		}

		if (selection instanceof IStructuredSelection) {
			IStructuredSelection iStructuredSelection = (IStructuredSelection) selection;
			Object object = iStructuredSelection.getFirstElement();

			InputDescriptor input = Platform.getAdapterManager().getAdapter(object, InputDescriptor.class);

			// TODO we should create a whole context with the current selection etc for the context
			this.eefSectionDescriptor.getEEFPage().getView().setInput(input);
		}
	}

	@Override
	public void refresh() {
		if (EEFCommonPreferences.isDebugEnabled()) {
			EEFIdeUiPlugin.getPlugin().info("EEFSection#refresh(...)"); //$NON-NLS-1$
		}

		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.refresh();
		}
	}

	@Override
	public void aboutToBeHidden() {
		if (EEFCommonPreferences.isDebugEnabled()) {
			EEFIdeUiPlugin.getPlugin().info("EEFSection#aboutToBeHidden(...)"); //$NON-NLS-1$
		}

		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.aboutToBeHidden();
		}
	}

	@Override
	public void dispose() {
		if (EEFCommonPreferences.isDebugEnabled()) {
			EEFIdeUiPlugin.getPlugin().info("EEFSection#dispose(...)"); //$NON-NLS-1$
		}

		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.dispose();
		}
	}

	@Override
	public int getMinimumHeight() {
		return SWT.DEFAULT;
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

}
