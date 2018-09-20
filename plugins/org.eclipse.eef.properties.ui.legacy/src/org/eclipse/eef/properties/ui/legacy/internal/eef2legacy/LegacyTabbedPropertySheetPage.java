/*******************************************************************************
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.properties.ui.legacy.internal.eef2legacy;

import java.lang.reflect.Field;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.properties.ui.api.EEFTabContents;
import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetPage;
import org.eclipse.eef.properties.ui.api.IEEFSection;
import org.eclipse.eef.properties.ui.api.IEEFTabDescriptor;
import org.eclipse.eef.properties.ui.legacy.internal.EEFPropertiesUiLegacyPlugin;
import org.eclipse.eef.properties.ui.legacy.internal.Messages;
import org.eclipse.eef.properties.ui.legacy.internal.legacy2eef.EEFLegacyTabSelectionListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.eclipse.ui.views.properties.tabbed.ITabDescriptor;
import org.eclipse.ui.views.properties.tabbed.ITabSelectionListener;
import org.eclipse.ui.views.properties.tabbed.TabContents;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

/**
 * Wraps an {@link EEFTabbedPropertySheetPage} to a {@link TabbedPropertySheetPage}.
 *
 * @author mbats
 */
public class LegacyTabbedPropertySheetPage extends TabbedPropertySheetPage {

	/**
	 * ControlsCreated field of the TabContents class.
	 */
	private static final String CONTROLS_CREATED_FIELD = "controlsCreated"; //$NON-NLS-1$

	/**
	 * The EEF tabbed property sheet page.
	 */
	private EEFTabbedPropertySheetPage page;

	/**
	 * The constructor.
	 *
	 * @param eefTabbedPropertySheetPage
	 *            EEF tabbed property sheet page
	 */
	public LegacyTabbedPropertySheetPage(EEFTabbedPropertySheetPage eefTabbedPropertySheetPage) {
		super(new LegacyTabbedPropertySheetPageContributor(eefTabbedPropertySheetPage.getContributor()));

		this.page = eefTabbedPropertySheetPage;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#addTabSelectionListener(ITabSelectionListener)
	 */
	@Override
	public void addTabSelectionListener(ITabSelectionListener listener) {
		this.page.addTabSelectionListener(new EEFLegacyTabSelectionListener(listener));
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#createControl(Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		this.page.createControl(parent);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#dispose()
	 */
	@Override
	public void dispose() {
		this.page.dispose();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#getActiveTabs()
	 */
	@Override
	public ITabDescriptor[] getActiveTabs() {
		List<ITabDescriptor> descriptors = new ArrayList<ITabDescriptor>();

		List<IEEFTabDescriptor> activeTabs = this.page.getActiveTabs();
		for (IEEFTabDescriptor activeTab : activeTabs) {
			descriptors.add(new LegacyTabDescriptor(activeTab));
		}

		return descriptors.toArray(new ITabDescriptor[descriptors.size()]);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#getControl()
	 */
	@Override
	public Control getControl() {
		return this.page.getControl();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#getCurrentTab()
	 */
	@Override
	public TabContents getCurrentTab() {
		EEFTabContents currentTab = this.page.getCurrentTab();
		List<IEEFSection> eefSections = currentTab.getSections();

		List<ISection> sections = new ArrayList<ISection>();
		for (IEEFSection eefSection : eefSections) {
			sections.add(new LegacySection(eefSection));
		}

		TabContents tabContents = new TabContents();
		tabContents.setSections(sections.toArray(new ISection[sections.size()]));

		boolean controlsHaveBeenCreated = currentTab.controlsHaveBeenCreated();
		try {
			Field field = TabContents.class.getField(CONTROLS_CREATED_FIELD);
			field.setAccessible(true);
			field.set(tabContents, Boolean.valueOf(controlsHaveBeenCreated));
		} catch (NoSuchFieldException e) {
			String message = MessageFormat.format(Messages.Eef2LegacyWrapper_failedToAccessField, CONTROLS_CREATED_FIELD);
			EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, e);
		} catch (SecurityException e) {
			String message = MessageFormat.format(Messages.Eef2LegacyWrapper_failedToAccessField, CONTROLS_CREATED_FIELD);
			EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, e);
		} catch (IllegalArgumentException e) {
			String message = MessageFormat.format(Messages.Eef2LegacyWrapper_failedToAccessField, CONTROLS_CREATED_FIELD);
			EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, e);
		} catch (IllegalAccessException e) {
			String message = MessageFormat.format(Messages.Eef2LegacyWrapper_failedToAccessField, CONTROLS_CREATED_FIELD);
			EEFPropertiesUiLegacyPlugin.getImplementation().logError(message, e);
		}

		return tabContents;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#getSelectedTab()
	 */
	@Override
	public ITabDescriptor getSelectedTab() {
		return new LegacyTabDescriptor(this.page.getSelectedTab());
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#getTitleImage(ISelection)
	 */
	@Override
	public Image getTitleImage(ISelection selection) {
		// Do nothing for now
		// return this.page.getTitleImage(selection);
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#getTitleText(ISelection)
	 */
	@Override
	public String getTitleText(ISelection selection) {
		// Do nothing for now
		// return this.page.getTitleText(selection);
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#getWidgetFactory()
	 */
	@Override
	public TabbedPropertySheetWidgetFactory getWidgetFactory() {
		return new LegacyTabbedPropertySheetWidgetFactory(this.page.getWidgetFactory());
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#labelProviderChanged(LabelProviderChangedEvent)
	 */
	@Override
	public void labelProviderChanged(LabelProviderChangedEvent event) {
		// Do nothing for now
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#overrideTabs()
	 */
	@Override
	public void overrideTabs() {
		// Do nothing for now
		// this.page.overrideTabs();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#refresh()
	 */
	@Override
	public void refresh() {
		this.page.refresh();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#removeTabSelectionListener(ITabSelectionListener)
	 */
	@Override
	public void removeTabSelectionListener(ITabSelectionListener listener) {
		this.page.removeTabSelectionListener(new EEFLegacyTabSelectionListener(listener));
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#resizeScrolledComposite()
	 */
	@Override
	public void resizeScrolledComposite() {
		this.page.resizeScrolledComposite();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#selectionChanged(IWorkbenchPart, ISelection)
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		this.page.selectionChanged(part, selection);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#setActionBars(IActionBars)
	 */
	@Override
	public void setActionBars(IActionBars actionBars) {
		this.page.setActionBars(actionBars);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#setFocus()
	 */
	@Override
	public void setFocus() {
		this.page.setFocus();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#setSelectedTab(String)
	 */
	@Override
	public void setSelectedTab(String id) {
		this.page.setSelectedTab(id);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see TabbedPropertySheetPage#getSite()
	 */
	@Override
	public IPageSite getSite() {
		return this.page.getSite();
	}
}
