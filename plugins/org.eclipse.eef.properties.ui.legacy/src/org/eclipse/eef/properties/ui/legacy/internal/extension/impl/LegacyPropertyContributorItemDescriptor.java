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
	 */
	public LegacyPropertyContributorItemDescriptor() {
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

	/**
	 * Sets the contributorId.
	 *
	 * @param contributorId
	 *            the contributorId to set
	 */
	public void setContributorId(String contributorId) {
		this.contributorId = contributorId;
	}

	/**
	 * Sets the labelProvider.
	 *
	 * @param labelProvider
	 *            the labelProvider to set
	 */
	public void setLabelProvider(ILabelProvider labelProvider) {
		this.labelProvider = labelProvider;
	}

	/**
	 * Sets the actionProvider.
	 *
	 * @param actionProvider
	 *            the actionProvider to set
	 */
	public void setActionProvider(IActionProvider actionProvider) {
		this.actionProvider = actionProvider;
	}

	/**
	 * Sets the typeMapper.
	 *
	 * @param typeMapper
	 *            the typeMapper to set
	 */
	public void setTypeMapper(ITypeMapper typeMapper) {
		this.typeMapper = typeMapper;
	}

	/**
	 * Sets the sectionDescriptorProvider.
	 *
	 * @param sectionDescriptorProvider
	 *            the sectionDescriptorProvider to set
	 */
	public void setSectionDescriptorProvider(ISectionDescriptorProvider sectionDescriptorProvider) {
		this.sectionDescriptorProvider = sectionDescriptorProvider;
	}

	/**
	 * Sets the tabDescriptorProvider.
	 *
	 * @param tabDescriptorProvider
	 *            the tabDescriptorProvider to set
	 */
	public void setTabDescriptorProvider(ITabDescriptorProvider tabDescriptorProvider) {
		this.tabDescriptorProvider = tabDescriptorProvider;
	}

	/**
	 * Sets the overridableTabListContentProvider.
	 *
	 * @param overridableTabListContentProvider
	 *            the overridableTabListContentProvider to set
	 */
	public void setOverridableTabListContentProvider(boolean overridableTabListContentProvider) {
		this.overridableTabListContentProvider = overridableTabListContentProvider;
	}

	/**
	 * Sets the categories.
	 *
	 * @param categories
	 *            the categories to set
	 */
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

}
