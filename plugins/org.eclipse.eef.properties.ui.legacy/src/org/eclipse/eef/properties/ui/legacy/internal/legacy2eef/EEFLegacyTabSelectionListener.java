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
package org.eclipse.eef.properties.ui.legacy.internal.legacy2eef;

import org.eclipse.eef.properties.ui.api.IEEFTabDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFTabSelectionListener;
import org.eclipse.eef.properties.ui.legacy.internal.eef2legacy.LegacyTabDescriptor;
import org.eclipse.ui.views.properties.tabbed.ITabSelectionListener;

/**
 * Wraps an {@link ITabSelectionListener} to an {@link IEEFTabSelectionListener}.
 *
 * @author mbats
 */
public class EEFLegacyTabSelectionListener implements IEEFTabSelectionListener {

	/**
	 * A legacy tab selection listener.
	 */
	private ITabSelectionListener listener;

	/**
	 * The constructor.
	 *
	 * @param legacyTabSelectionListener
	 *            A legacy tab selectionListener
	 */
	public EEFLegacyTabSelectionListener(ITabSelectionListener legacyTabSelectionListener) {
		this.listener = legacyTabSelectionListener;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see IEEFTabSelectionListener#tabSelected(IEEFTabDescriptor)
	 */
	@Override
	public void tabSelected(IEEFTabDescriptor tabDescriptor) {
		this.listener.tabSelected(new LegacyTabDescriptor(tabDescriptor));
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see IEEFTabSelectionListener#equals(Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof EEFLegacyTabSelectionListener) {
			EEFLegacyTabSelectionListener tabSelectionListener = (EEFLegacyTabSelectionListener) obj;
			return this.listener.equals(tabSelectionListener.listener);
		}
		return super.equals(obj);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see IEEFTabSelectionListener#hashCode()
	 */
	@Override
	public int hashCode() {
		return this.listener.hashCode();
	}

}
