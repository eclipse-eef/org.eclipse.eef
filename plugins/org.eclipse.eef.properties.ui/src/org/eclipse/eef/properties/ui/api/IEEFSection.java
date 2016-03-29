/*******************************************************************************
 * Copyright (c) 2001, 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Obeo - Integration in the project EEF
 *******************************************************************************/
package org.eclipse.eef.properties.ui.api;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Represents a section of properties for a given input.
 * <p>
 * The lifecycle of an IEEFSection is as follows:
 * <ul>
 * <li><code>IEEFSection.createControls()</code></li>
 * <li><code>IEEFSection.setInput()</code></li>
 * <li><code>IEEFSection.aboutToBeShown()</code></li>
 * <li><code>IEEFSection.refresh()</code></li>
 * <li><code>IEEFSection.aboutToBeHidden()</code></li>
 * <li><code>IEEFSection.dispose()</code></li>
 * </ul>
 * </p>
 * <p>
 * Implementors of this class should be aware that a section instance might be reused for different input objects (as
 * long as they are valid section inputs). It means that <code>IEEFSection.setInput</code> can be called at any time
 * between <code>IEEFSection.createControls</code> and <code>IEEFSection.dispose</code>.
 * </p>
 * <p>
 * When an input change event occurs, such as a tab selection or a workbench selection change, an IEEFSection is sent:
 * <ul>
 * <li><code>IEEFSection.setInput()</code></li>
 * <li><code>IEEFSection.refresh()</code></li>
 * </ul>
 * </p>
 * <p>
 * When an part activation event occurs, such as the contributor part activation event, an IEEFSection is sent:
 * <ul>
 * <li><code>IEEFSection.setInput()</code></li>
 * <li><code>IEEFSection.aboutToBeShown()</code></li>
 * <li><code>IEEFSection.refresh()</code></li>
 * <li><code>IEEFSection.setInput()</code></li>
 * <li><code>IEEFSection.refresh()</code></li>
 * </ul>
 * This is because both a tab selection event and an input selection event have occurred.
 * </p>
 * <p>
 * This interface should not be extended or implemented. New section instances should be created using
 * <code>AbstractEEFPropertySection</code>.
 * </p>
 *
 * @see org.eclipse.ui.views.properties.tabbed.ISection
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 * @since 1.6.0
 */
public interface IEEFSection {

	/**
	 * Creates the controls for the section.
	 * <p>
	 * Clients should take advantage of the widget factory provided by the framework to achieve a common look between
	 * property sections.
	 * </p>
	 *
	 * @see org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage#getWidgetFactory()
	 *
	 * @param parent
	 *            the parent composite for the section.
	 * @param tabbedPropertySheetPage
	 *            the tabbed property sheet page.
	 */
	void createControls(Composite parent, EEFTabbedPropertySheetPage tabbedPropertySheetPage);

	/**
	 * Notifies the section that the workbench selection has changed.
	 *
	 * @param part
	 *            The active workbench part.
	 * @param selection
	 *            The active selection in the workbench part.
	 */
	void setInput(IWorkbenchPart part, ISelection selection);

	/**
	 * Notifies the section that its controls are about to be shown. It is expected that sections enable domain related
	 * functions in this method, most commonly add listeners.
	 * <p>
	 * Since the controls are not visible, the section should wait for the refresh() before updating the section
	 * controls.
	 * </p>
	 */
	void aboutToBeShown();

	/**
	 * Notifies the section that its controls are about to be hidden. It is expected that sections disable domain
	 * related functions in this method, most commonly remove listeners.
	 */
	void aboutToBeHidden();

	/**
	 * Dispose this section.
	 */
	void dispose();

	/**
	 * Returns the minimum height needed by this section. A return value of <code>SWT.DEFAULT</code> indicates that no
	 * minimum height is defined.
	 *
	 * @return the minimum height needed by this section.
	 */
	int getMinimumHeight();

	/**
	 * Determine whether this section would like extra height space in case there is some left. Normally this is true
	 * when the section is the last to be displayed on a tab or is the only section on a tab.
	 *
	 * @return <code>true</code> if this section would like extra height space.
	 */
	boolean shouldUseExtraSpace();

	/**
	 * Refresh the contents of the controls displayed in this section.
	 */
	void refresh();
}
