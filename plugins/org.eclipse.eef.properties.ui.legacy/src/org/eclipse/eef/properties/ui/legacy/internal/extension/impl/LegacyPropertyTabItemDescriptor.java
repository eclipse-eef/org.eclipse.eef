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
package org.eclipse.eef.properties.ui.legacy.internal.extension.impl;

import org.eclipse.eef.properties.ui.api.AbstractEEFTabDescriptor;
import org.eclipse.eef.properties.ui.legacy.internal.EEFPropertiesUiLegacyPlugin;
import org.eclipse.eef.properties.ui.legacy.internal.extension.IItemDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * The property tab descriptor.
 *
 * @author mbats
 */
public class LegacyPropertyTabItemDescriptor extends AbstractEEFTabDescriptor implements IItemDescriptor {
	/**
	 * The contributor id.
	 */
	private String contributorId;

	/**
	 * The category.
	 */
	private String category;

	/**
	 * The id.
	 */
	private String id;

	/**
	 * The label.
	 */
	private String label;

	/**
	 * The afterTab.
	 */
	private String afterTab;

	/**
	 * If true, then this tab is indented. This is meant to indicate sub tabs or categories of the parent tab.
	 */
	private boolean indented;

	/**
	 * If an image is provided, the icon image is displayed on the tab when the tab is active.
	 */
	private Image image;

	/**
	 * The constructor.
	 *
	 * @param contributorId
	 *            The contributor id
	 * @param category
	 *            The category
	 * @param id
	 *            The id
	 * @param label
	 *            The label
	 * @param afterTab
	 *            The afterTab
	 * @param indented
	 *            Is indented
	 * @param image
	 *            The image
	 */
	public LegacyPropertyTabItemDescriptor(String contributorId, String label, String category, String afterTab, String id, boolean indented,
			Image image) {
		setSectionDescriptors(EEFPropertiesUiLegacyPlugin.getImplementation().getTabbedPropertySectionsRegistry()
				.getPropertySections(contributorId, id));
		this.contributorId = contributorId;
		this.category = category;
		this.id = id;
		this.label = label;
		this.afterTab = afterTab;
		this.indented = indented;
		this.image = image;
	}

	/**
	 * Return the contributorId.
	 *
	 * @return the contributorId
	 */
	public String getContributorId() {
		return this.contributorId;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFTabDescriptor#getCategory()
	 */
	@Override
	public String getCategory() {
		return this.category;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFTabDescriptor#getId()
	 */
	@Override
	public String getId() {
		return this.id;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFTabDescriptor#getLabel()
	 */
	@Override
	public String getLabel() {
		return this.label;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFTabDescriptor#getAfterTab()
	 */
	@Override
	public String getAfterTab() {
		if (this.afterTab == null) {
			return ""; //$NON-NLS-1$
		}
		return this.afterTab;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFTabDescriptor#isIndented()
	 */
	@Override
	public boolean isIndented() {
		return this.indented;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFTabDescriptor#getImage()
	 */
	@Override
	public Image getImage() {
		return this.image;
	}
}
