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
package org.eclipse.eef.ide.ui.internal.properties;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFPage;
import org.eclipse.eef.ide.ui.internal.widgets.EEFContainerLifecycleManager;
import org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * The implementation of {@link ISection} using the {@link EEFSectionDescriptor}.
 *
 * @author sbegaudeau
 */
public class EEFSection implements ISection {

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
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		EEFGroup eefGroup = this.eefSectionDescriptor.getEEFGroup();
		EEFContainerDescription eefContainerDescription = eefGroup.getDescription().getContainer();

		if (eefContainerDescription != null) {
			EEFContainerLifecycleManager containerLifecycleManager = new EEFContainerLifecycleManager(eefContainerDescription, eefGroup
					.getVariableManager().createChild(), eefGroup.getInterpreter(), eefGroup.getEditingDomain());
			containerLifecycleManager.createControl(parent, tabbedPropertySheetPage);

			this.lifecycleManagers.add(containerLifecycleManager);
		}
	}

	@Override
	public void aboutToBeShown() {
		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.aboutToBeShown();
		}
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection iStructuredSelection = (IStructuredSelection) selection;
			Object object = iStructuredSelection.getFirstElement();

			EObject eObject = Platform.getAdapterManager().getAdapter(object, EObject.class);

			// Update the input of the view only
			EEFGroup eefGroup = this.eefSectionDescriptor.getEEFGroup();
			EEFPage eefPage = eefGroup.getPage();

			// TODO we should create a whole context with the current selection etc for the context
			eefPage.getView().setInput(eObject);
		}
	}

	@Override
	public void refresh() {
		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.refresh();
		}
	}

	@Override
	public void aboutToBeHidden() {
		for (ILifecycleManager lifecycleManager : lifecycleManagers) {
			lifecycleManager.aboutToBeHidden();
		}
	}

	@Override
	public void dispose() {
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
