/*******************************************************************************
 * Copyright (c) 2007, 2016 IBM Corporation and others.
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

import java.util.List;

/**
 * Represents a tab descriptor for the tabbed property view.
 * <p>
 * This interface should not be extended or implemented. New instances should be created using
 * <code>AbstractEEFTabDescriptor</code>.
 * </p>
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 * @since 1.6.0
 */
public interface IEEFTabDescriptor extends IEEFTabItem {

	/**
	 * If afterTab is not specified in the descriptor, we default to be the top tab.
	 */
	String TOP = "top"; //$NON-NLS-1$

	/**
	 * Instantiate this tab's sections.
	 *
	 * @return The tab contents for this section.
	 */
	EEFTabContents createTab();

	/**
	 * Get the identifier of the tab after which this tab should be displayed. When two or more tabs belong to the same
	 * category, they are sorted by the after tab values.
	 *
	 * @return the identifier of the tab.
	 */
	String getAfterTab();

	/**
	 * Get the category this tab belongs to.
	 *
	 * @return Get the category this tab belongs to.
	 */
	String getCategory();

	/**
	 * Get the unique identifier for the tab.
	 *
	 * @return the unique identifier for the tab.
	 */
	String getId();

	/**
	 * Get the text label for the tab.
	 *
	 * @return the text label for the tab.
	 */
	String getLabel();

	/**
	 * Get the list of section descriptors for the tab.
	 *
	 * @return the list of section descriptors for the tab.
	 */
	List<IEEFSectionDescriptor> getSectionDescriptors();
}
