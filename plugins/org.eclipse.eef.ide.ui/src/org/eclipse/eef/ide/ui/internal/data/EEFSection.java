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
package org.eclipse.eef.ide.ui.internal.data;

import java.util.List;

import org.eclipse.eef.core.api.EEFContainer;
import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFText;
import org.eclipse.eef.core.api.EEFWidget;
import org.eclipse.eef.core.api.IConsumer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

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
		TabbedPropertySheetWidgetFactory widgetFactory = tabbedPropertySheetPage.getWidgetFactory();

		EEFGroup eefGroup = this.eefSectionDescriptor.getEEFGroup();
		EEFContainer eefContainer = eefGroup.getContainer();

		if (eefContainer != null) {
			Composite sectionComposite = widgetFactory.createFlatFormComposite(parent);

			List<EEFWidget> eefWidgets = eefContainer.getWidgets();
			for (EEFWidget eefWidget : eefWidgets) {
				if (eefWidget instanceof EEFText) {
					EEFText eText = (EEFText) eefWidget;

					// Read only, non editable initialization
					final Text text = widgetFactory.createText(sectionComposite, ""); //$NON-NLS-1$
					text.setEditable(false);
					text.setData(eText);

					// Asynchronous (ok not really for now) init of the value
					eText.getValue(new IConsumer<String>() {
						@Override
						public void apply(String value) {
							text.setText(value);
							text.setEditable(true);
						}
					});
				}
			}
		}
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		System.out.println();
	}

	@Override
	public void aboutToBeShown() {
		System.out.println();
	}

	@Override
	public void aboutToBeHidden() {
		System.out.println();
	}

	@Override
	public void dispose() {
		System.out.println();
	}

	@Override
	public int getMinimumHeight() {
		return SWT.DEFAULT;
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	public void refresh() {
		System.out.println();
	}

}
