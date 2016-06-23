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
 ******************************************************************************/
package org.eclipse.eef.properties.ui.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.eef.properties.ui.internal.EEFTabbedPropertyViewPlugin;
import org.eclipse.swt.graphics.Image;

/**
 * An abstract implementation of a tab descriptor for the tabbed property view.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 * @since 1.6.0
 */
public abstract class AbstractEEFTabDescriptor implements IEEFTabDescriptor, Cloneable {
	/**
	 * The {@link IEEFSectionDescriptor}.
	 */
	private List<IEEFSectionDescriptor> sectionDescriptors = new ArrayList<IEEFSectionDescriptor>();

	// CHECKSTYLE:OFF

	/**
	 * {@inheritDoc}
	 *
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException exception) {
			EEFTabbedPropertyViewPlugin.getPlugin().error(exception.getMessage(), exception);
		}
		return null;
	}

	// CHECKSTYLE:ON

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFTabDescriptor#createTab()
	 */
	@Override
	public EEFTabContents createTab() {
		List<IEEFSection> sections = new ArrayList<IEEFSection>(getSectionDescriptors().size());
		for (IEEFSectionDescriptor sectionDescriptor : this.sectionDescriptors) {
			IEEFSection section = sectionDescriptor.getSectionClass();
			if (section != null) {
				sections.add(section);
			}
		}
		EEFTabContents tab = new EEFTabContents(sections);
		return tab;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		boolean isEqual = false;
		if (this.getClass() == object.getClass()) {
			AbstractEEFTabDescriptor descriptor = (AbstractEEFTabDescriptor) object;
			if (this.getCategory().equals(descriptor.getCategory()) && this.getId().equals(descriptor.getId())
					&& this.getSectionDescriptors().size() == descriptor.getSectionDescriptors().size()) {

				Iterator<IEEFSectionDescriptor> i = this.getSectionDescriptors().iterator();
				Iterator<IEEFSectionDescriptor> j = descriptor.getSectionDescriptors().iterator();

				// the order is important here - so as long as the sizes of the
				// lists are the same and id of the section at the same
				// positions are the same - the lists are the same
				while (i.hasNext()) {
					IEEFSectionDescriptor source = i.next();
					IEEFSectionDescriptor target = j.next();
					if (!source.getId().equals(target.getId())) {
						isEqual = false;
					}
				}
				isEqual = true;
			}
		} else {
			isEqual = false;
		}

		return isEqual;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		int hashCode = getCategory().hashCode();
		hashCode ^= getId().hashCode();
		for (IEEFSectionDescriptor sectionDescriptor : sectionDescriptors) {
			hashCode ^= sectionDescriptor.getId().hashCode();
		}
		return hashCode;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFTabDescriptor#getAfterTab()
	 */
	@Override
	public String getAfterTab() {
		return TOP;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFTabItem#getImage()
	 */
	@Override
	public Image getImage() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFTabDescriptor#getSectionDescriptors()
	 */
	@Override
	public List<IEEFSectionDescriptor> getSectionDescriptors() {
		return sectionDescriptors;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFTabItem#getText()
	 */
	@Override
	public String getText() {
		return getLabel();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFTabItem#isIndented()
	 */
	@Override
	public boolean isIndented() {
		return false;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.properties.ui.api.IEEFTabItem#isSelected()
	 */
	@Override
	public boolean isSelected() {
		return false;
	}

	/**
	 * Set the list of section descriptors for the tab.
	 *
	 * @param sectionDescriptors
	 *            the list of section descriptors for the tab.
	 */
	public void setSectionDescriptors(List<IEEFSectionDescriptor> sectionDescriptors) {
		this.sectionDescriptors = sectionDescriptors;
	}
}
