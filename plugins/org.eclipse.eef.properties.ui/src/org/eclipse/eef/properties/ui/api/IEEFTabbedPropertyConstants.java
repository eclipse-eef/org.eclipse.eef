/*******************************************************************************
 * Copyright (c) 2001, 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Obeo - Contribution to the project EEF
 *******************************************************************************/
package org.eclipse.eef.properties.ui.api;

/**
 * Constants used by the implementors of IEEFTabbedPropertySection.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 * @since 2.0.0
 */
public interface IEEFTabbedPropertyConstants {
	/**
	 * These horizontal margin around the composite. Each section should use a margin of 0, 0.
	 */
	int HMARGIN = 6;

	/**
	 * These horizontal margin around the composite.
	 */
	int VMARGIN = 6;

	/**
	 * Horizontal space to leave between related widgets. Each section should use these values for spacing its widgets.
	 * For example, you can use +/- HSPACE as the offset of a left or right FlatFormAttachment.
	 *
	 * The tabbed property composite also inserts VSPACE pixels between section composites if more than one section is
	 * displayed.
	 */
	int HSPACE = 5;

	/**
	 * Horizontal space to leave between related widgets.
	 */
	int VSPACE = 4;

	/**
	 * Space to leave between the center of the property tab and the closest widget to the left or right. I.e. for a
	 * property tab whose widgets are logically divided into two halves, the total space between the halves should be
	 * 2*CENTER_SPACE.
	 */
	int CENTER_SPACE = 10;
}
