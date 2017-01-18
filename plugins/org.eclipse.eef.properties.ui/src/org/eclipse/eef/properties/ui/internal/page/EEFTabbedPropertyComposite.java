/*******************************************************************************
 * Copyright (c) 2001, 2016 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Obeo - Contribution to the EEF project
 *******************************************************************************/
package org.eclipse.eef.properties.ui.internal.page;

import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.properties.ui.internal.page.propertylist.EEFTabbedPropertyList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;

/**
 * Composite responsible for drawing the tabbed property sheet page.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 */
public class EEFTabbedPropertyComposite extends Composite {

	/**
	 * The widget factory.
	 */
	private EEFWidgetFactory widgetFactory;

	/**
	 * The main composite.
	 */
	private Composite mainComposite;

	/**
	 * The left composite.
	 */
	private Composite leftComposite;

	/**
	 * The scrolled composite.
	 */
	private ScrolledComposite scrolledComposite;

	/**
	 * The tab composite.
	 */
	private Composite tabComposite;

	/**
	 * The property list composite.
	 */
	private EEFTabbedPropertyList listComposite;

	/**
	 * Constructor for a {@link EEFTabbedPropertyComposite}.
	 *
	 * @param parent
	 *            The parent composite
	 * @param widgetFactory
	 *            The widget factory
	 */
	public EEFTabbedPropertyComposite(Composite parent, EEFWidgetFactory widgetFactory) {
		super(parent, SWT.NO_FOCUS);
		this.widgetFactory = widgetFactory;
		this.createMainComposite();
	}

	/**
	 * Create the main composite.
	 */
	private void createMainComposite() {
		this.mainComposite = this.widgetFactory.createComposite(this, SWT.NO_FOCUS);
		this.mainComposite.setLayout(new FormLayout());

		FormData formData = new FormData();
		formData.left = new FormAttachment(0, 0);
		formData.right = new FormAttachment(100, 0);
		formData.top = new FormAttachment(0, 0);
		formData.bottom = new FormAttachment(100, 0);
		this.mainComposite.setLayoutData(formData);

		this.createMainContents();
	}

	/**
	 * Create the contents in the main composite.
	 */
	private void createMainContents() {
		this.leftComposite = this.widgetFactory.createComposite(this.mainComposite, SWT.NO_FOCUS);
		this.leftComposite.setLayout(new FormLayout());

		this.scrolledComposite = this.widgetFactory.createScrolledComposite(this.mainComposite, SWT.H_SCROLL | SWT.V_SCROLL | SWT.NO_FOCUS);
		FormData formData = new FormData();
		formData.left = new FormAttachment(this.leftComposite, 0);
		formData.right = new FormAttachment(100, 0);
		formData.top = new FormAttachment(0, 0);
		formData.bottom = new FormAttachment(100, 0);
		this.scrolledComposite.setLayoutData(formData);

		formData = new FormData();
		formData.left = new FormAttachment(0, 0);
		formData.right = new FormAttachment(this.scrolledComposite, 0);
		formData.top = new FormAttachment(0, 0);
		formData.bottom = new FormAttachment(100, 0);
		this.leftComposite.setLayoutData(formData);

		this.tabComposite = this.widgetFactory.createComposite(this.scrolledComposite, SWT.NO_FOCUS);
		this.tabComposite.setLayout(new FormLayout());

		this.scrolledComposite.setContent(this.tabComposite);
		this.scrolledComposite.setAlwaysShowScrollBars(false);
		this.scrolledComposite.setExpandVertical(true);
		this.scrolledComposite.setExpandHorizontal(true);

		this.listComposite = new EEFTabbedPropertyList(this.leftComposite, this.widgetFactory);
		formData = new FormData();
		formData.left = new FormAttachment(0, 0);
		formData.right = new FormAttachment(100, 0);
		formData.top = new FormAttachment(0, 0);
		formData.bottom = new FormAttachment(100, 0);
		this.listComposite.setLayoutData(formData);
	}

	/**
	 * Get the tabbed property list, which is the list of tabs on the left hand side of this composite.
	 *
	 * @return the tabbed property list.
	 */
	public EEFTabbedPropertyList getTabbedPropertyList() {
		return this.listComposite;
	}

	/**
	 * Get the scrolled composite which surrounds the title bar and tab composite.
	 *
	 * @return the scrolled composite.
	 */
	public ScrolledComposite getScrolledComposite() {
		return scrolledComposite;
	}

	/**
	 * Get the tab composite where sections display their property contents.
	 *
	 * @return the tab composite.
	 */
	public Composite getTabComposite() {
		return this.tabComposite;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.swt.widgets.Widget#dispose()
	 */
	@Override
	public void dispose() {
		this.listComposite.dispose();
		super.dispose();
	}

}
