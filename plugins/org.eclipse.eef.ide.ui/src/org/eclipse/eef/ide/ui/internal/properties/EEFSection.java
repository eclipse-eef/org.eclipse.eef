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
import org.eclipse.eef.core.api.utils.Util;
import org.eclipse.eef.ide.ui.internal.widgets.EEFContainerLifecycleManager;
import org.eclipse.eef.ide.ui.internal.widgets.ILifecycleManager;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetWidgetFactory;
import org.eclipse.eef.properties.ui.api.IEEFSection;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.common.interpreter.api.IEvaluationResult;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.widgets.Section;

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
		EEFGroup eefGroup = this.eefSectionDescriptor.getEEFGroup();
		EEFContainerDescription eefContainerDescription = eefGroup.getDescription().getContainer();

		if (eefContainerDescription != null) {
			EEFTabbedPropertySheetWidgetFactory widgetFactory = tabbedPropertySheetPage.getWidgetFactory();

			Composite container = widgetFactory.createComposite(parent);
			container.setLayout(new GridLayout(3, false));

			Section section = widgetFactory.createSection(container, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);

			String labelExpression = eefGroup.getDescription().getLabelExpression();
			if (!Util.isBlank(labelExpression)) {
				IEvaluationResult result = eefGroup.getInterpreter()
						.evaluateExpression(eefGroup.getVariableManager().getVariables(), labelExpression);
				if (result.success() && result.getValue() instanceof String) {
					section.setText((String) result.getValue());
				}
			} else {
				section.setText(""); //$NON-NLS-1$
			}

			GridData sectionLayoutData = new GridData(GridData.FILL_HORIZONTAL);
			sectionLayoutData.horizontalSpan = 3;
			section.setLayoutData(sectionLayoutData);
			Composite group = widgetFactory.createComposite(section);
			GridLayout groupLayout = new GridLayout();
			groupLayout.numColumns = 3;
			group.setLayout(groupLayout);
			section.setClient(group);

			EEFContainerLifecycleManager containerLifecycleManager = new EEFContainerLifecycleManager(eefContainerDescription, eefGroup
					.getVariableManager().createChild(), eefGroup.getInterpreter(), eefGroup.getEditingDomain());
			containerLifecycleManager.createControl(group, tabbedPropertySheetPage);

			parent.layout();

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
