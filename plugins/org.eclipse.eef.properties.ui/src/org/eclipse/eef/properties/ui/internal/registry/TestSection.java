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
package org.eclipse.eef.properties.ui.internal.registry;

import org.eclipse.eef.properties.ui.api.AbstractEEFPropertySection;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetWidgetFactory;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

/**
 * Test section.
 *
 * @author sbegaudeau
 */
public class TestSection extends AbstractEEFPropertySection {
	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.AbstractEEFPropertySection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage)
	 */
	@Override
	public void createControls(Composite parent, EEFTabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		EEFTabbedPropertySheetWidgetFactory widgetFactory = aTabbedPropertySheetPage.getWidgetFactory();

		Composite container = widgetFactory.createComposite(parent);
		container.setLayout(new GridLayout(3, false));

		Section section = widgetFactory.createSection(container, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		section.setText("Properties"); //$NON-NLS-1$

		GridData sectionLayoutData = new GridData(GridData.FILL_HORIZONTAL);
		sectionLayoutData.horizontalSpan = 3;
		section.setLayoutData(sectionLayoutData);
		Composite group = widgetFactory.createComposite(section);
		GridLayout groupLayout = new GridLayout();
		groupLayout.numColumns = 3;
		group.setLayout(groupLayout);
		section.setClient(group);

		Label label = widgetFactory.createLabel(group, ""); //$NON-NLS-1$
		label.setText("name:"); //$NON-NLS-1$

		Text text = widgetFactory.createText(group, "", SWT.NONE); //$NON-NLS-1$
		text.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(group);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		text.setLayoutData(nameData);

		Label help = widgetFactory.createLabel(group, ""); //$NON-NLS-1$
		Image image = JFaceResources.getImage("dialog_help_image"); //$NON-NLS-1$
		help.setImage(image);
		help.setToolTipText("There should be some help in this tooltip..."); //$NON-NLS-1$
	}
}
