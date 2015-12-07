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
 * A listener interested in tab selection events that occur for the tabbed property sheet page.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 * @since 2.0.0
 */
public interface IEEFTabSelectionListener {

	/**
	 * Notifies this listener that the selected tab has changed.
	 *
	 * @param tabDescriptor
	 *            the selected tab descriptor.
	 */
	void tabSelected(IEEFTabDescriptor tabDescriptor);

}
