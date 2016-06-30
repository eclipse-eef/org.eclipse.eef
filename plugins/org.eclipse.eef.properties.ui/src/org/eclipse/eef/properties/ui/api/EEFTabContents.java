/*******************************************************************************
 * Copyright (c) 2007, 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Obeo - Contribution to the EEF project
 *******************************************************************************/
package org.eclipse.eef.properties.ui.api;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;

/**
 * A property tab is composed by one or more property sections and is used to categorize sections.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 * @since 1.6.0
 */
public class EEFTabContents {

	/**
	 * The sections of the tab.
	 */
	private List<IEEFSection> sections = new ArrayList<IEEFSection>();

	/**
	 * Indicates if the controls have been created.
	 */
	private boolean controlsCreated;

	/**
	 * The constructor.
	 *
	 * @param sections
	 *            The section to use in the tab
	 */
	public EEFTabContents(List<IEEFSection> sections) {
		this.sections.addAll(sections);
	}

	/**
	 * Return the sections.
	 *
	 * @return the sections
	 */
	public List<IEEFSection> getSections() {
		return this.sections;
	}

	/**
	 * Retrieve a numbered index for the section.
	 *
	 * @param section
	 *            the section.
	 * @return the section index.
	 */
	public int getSectionIndex(IEEFSection section) {
		for (int i = 0; i < sections.size(); i++) {
			if (section == sections.get(i)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Retrieve the section at a numbered index.
	 *
	 * @param i
	 *            a numbered index.
	 * @return the section.
	 */
	public IEEFSection getSectionAtIndex(int i) {
		if (i >= 0 && i < sections.size()) {
			return sections.get(i);
		}
		return null;
	}

	/**
	 * Creates the page's sections controls.
	 *
	 * @param parent
	 *            The parent composite
	 * @param page
	 *            The page
	 */
	public void createControls(Composite parent, final EEFTabbedPropertySheetPage page) {
		Composite pageComposite = page.getWidgetFactory().createComposite(parent, SWT.NO_FOCUS);
		GridLayout layout = new GridLayout();
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		layout.verticalSpacing = 0;
		pageComposite.setLayout(layout);

		for (final IEEFSection section : sections) {
			final Composite sectionComposite = page.getWidgetFactory().createComposite(pageComposite, SWT.NO_FOCUS);
			sectionComposite.setLayout(new FillLayout());
			int style = GridData.FILL_HORIZONTAL;
			if (section.shouldUseExtraSpace()) {
				style = GridData.FILL_BOTH;
			}
			GridData data = new GridData(style);
			data.heightHint = section.getMinimumHeight();
			sectionComposite.setLayoutData(data);

			ISafeRunnable runnable = new SafeRunnable() {
				@Override
				public void run() throws Exception {
					section.createControls(sectionComposite, page);
				}
			};
			SafeRunnable.run(runnable);
		}

		controlsCreated = true;
	}

	/**
	 * Sets page's sections input objects.
	 *
	 * @param part
	 *            The workbench part
	 * @param selection
	 *            The current selection
	 */
	public void setInput(final IWorkbenchPart part, final ISelection selection) {
		for (final IEEFSection section : sections) {
			ISafeRunnable runnable = new SafeRunnable() {
				@Override
				public void run() throws Exception {
					section.setInput(part, selection);
				}
			};
			SafeRunnable.run(runnable);
		}
	}

	/**
	 * If controls have been created, refresh all sections on the page.
	 */
	public void refresh() {
		for (final IEEFSection section : sections) {
			ISafeRunnable runnable = new SafeRunnable() {
				@Override
				public void run() throws Exception {
					section.refresh();
				}
			};
			SafeRunnable.run(runnable);
		}
	}

	/**
	 * Sends the lifecycle event to the page's sections.
	 */
	public void aboutToBeShown() {
		for (final IEEFSection section : sections) {
			ISafeRunnable runnable = new SafeRunnable() {
				@Override
				public void run() throws Exception {
					section.aboutToBeShown();
				}
			};
			SafeRunnable.run(runnable);
		}
	}

	/**
	 * Sends the lifecycle event to the page's sections.
	 */
	public void aboutToBeHidden() {
		for (final IEEFSection section : sections) {
			ISafeRunnable runnable = new SafeRunnable() {
				@Override
				public void run() throws Exception {
					section.aboutToBeHidden();
				}
			};
			SafeRunnable.run(runnable);
		}
	}

	/**
	 * Dispose of page's sections controls.
	 */
	public void dispose() {
		for (final IEEFSection section : sections) {
			ISafeRunnable runnable = new SafeRunnable() {
				@Override
				public void run() throws Exception {
					section.dispose();
				}
			};
			SafeRunnable.run(runnable);
		}
	}

	/**
	 * Indicates if the controls of the tab have been created.
	 *
	 * @return <code>true</code> if the controls have been created, <code>false</code> otherwise
	 */
	public boolean controlsHaveBeenCreated() {
		return this.controlsCreated;
	}

}
