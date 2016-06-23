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

import java.util.List;

import org.eclipse.eef.properties.ui.legacy.internal.extension.IItemDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.views.properties.tabbed.IActionProvider;
import org.eclipse.ui.views.properties.tabbed.ISectionDescriptorProvider;
import org.eclipse.ui.views.properties.tabbed.ITabDescriptorProvider;
import org.eclipse.ui.views.properties.tabbed.ITypeMapper;

/**
 * The property contributor descriptor.
 *
 * @author mbats
 */
public class LegacyPropertyContributorItemDescriptor implements IItemDescriptor {

	/**
	 * The contributor.
	 */
	private String contributorId;

	/**
	 * The label provider.
	 */
	private ILabelProvider labelProvider;

	/**
	 * The action provider.
	 */
	private IActionProvider actionProvider;

	/**
	 * The type mapper.
	 */
	private ITypeMapper typeMapper;

	/**
	 * The section descriptor provider.
	 */
	private ISectionDescriptorProvider sectionDescriptorProvider;

	/**
	 * The tab descriptor provider.
	 */
	private ITabDescriptorProvider tabDescriptorProvider;

	/**
	 * The overridable tab list content provider.
	 */
	private boolean overridableTabListContentProvider;

	/**
	 * The categories.
	 */
	private List<String> categories;

	/**
	 * The constructor.
	 *
	 * @param contributorId
	 *            The contributor
	 * @param labelProvider
	 *            The label provider
	 * @param actionProvider
	 *            The action provider
	 * @param typeMapper
	 *            the type mapper
	 * @param sectionDescriptorProvider
	 *            The section descriptor provider
	 * @param tabDescriptorProvider
	 *            The tab descriptor provider
	 * @param overridableTabListContentProvider
	 *            the overridable tab list content provider
	 * @param categories
	 *            The categories
	 */
	public LegacyPropertyContributorItemDescriptor(String contributorId, ILabelProvider labelProvider, IActionProvider actionProvider,
			ITypeMapper typeMapper, ISectionDescriptorProvider sectionDescriptorProvider, ITabDescriptorProvider tabDescriptorProvider,
			boolean overridableTabListContentProvider, List<String> categories) {
		this.contributorId = contributorId;
		this.labelProvider = labelProvider;
		this.actionProvider = actionProvider;
		this.typeMapper = typeMapper;
		this.sectionDescriptorProvider = sectionDescriptorProvider;
		this.tabDescriptorProvider = tabDescriptorProvider;
		this.categories = categories;
		this.overridableTabListContentProvider = overridableTabListContentProvider;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see IItemDescriptor#getId()
	 */
	@Override
	public String getId() {
		return this.contributorId;
	}

	/**
	 * Return the labelProvider.
	 *
	 * @return the labelProvider
	 */
	public ILabelProvider getLabelProvider() {
		return this.labelProvider;
	}

	/**
	 * Return the actionProvider.
	 *
	 * @return the actionProvider
	 */
	public IActionProvider getActionProvider() {
		return this.actionProvider;
	}

	/**
	 * Return the typeMapper.
	 *
	 * @return the typeMapper
	 */
	public ITypeMapper getTypeMapper() {
		return this.typeMapper;
	}

	/**
	 * Return the sectionDescriptorProvider.
	 *
	 * @return the sectionDescriptorProvider
	 */
	public ISectionDescriptorProvider getSectionDescriptorProvider() {
		return this.sectionDescriptorProvider;
	}

	/**
	 * Return the tabDescriptorProvider.
	 *
	 * @return the tabDescriptorProvider
	 */
	public ITabDescriptorProvider getTabDescriptorProvider() {
		return this.tabDescriptorProvider;
	}

	/**
	 * Return the overridableTabListContentProvider.
	 *
	 * @return the overridableTabListContentProvider
	 */
	public boolean isOverridableTabListContentProvider() {
		return this.overridableTabListContentProvider;
	}

	/**
	 * Get categories.
	 *
	 * @return The categories
	 */
	public List<String> getCategories() {
		return this.categories;
	}

}
