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
package org.eclipse.eef.core.internal;

import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.core.api.EEFContainer;
import org.eclipse.eef.core.api.EEFGroup;
import org.eclipse.eef.core.api.EEFPage;

/**
 * The implementation of tge {@link EEFGroup}.
 *
 * @author sbegaudeau
 */
public class EEFGroupImpl implements EEFGroup {
	/**
	 * The description.
	 */
	private EEFGroupDescription eefGroupDescription;

	/**
	 * The containing {@link EEFPage}.
	 */
	private EEFPage eefPage;

	/**
	 * The constructor.
	 *
	 * @param eefPage
	 *            The containing {@link EEFPage}
	 * @param eefGroupDescription
	 *            The description
	 */
	public EEFGroupImpl(EEFPage eefPage, EEFGroupDescription eefGroupDescription) {
		this.eefPage = eefPage;
		this.eefGroupDescription = eefGroupDescription;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFGroup#getDescription()
	 */
	@Override
	public EEFGroupDescription getDescription() {
		return this.eefGroupDescription;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFGroup#getPage()
	 */
	@Override
	public EEFPage getPage() {
		return this.eefPage;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.eef.core.api.EEFGroup#getContainer()
	 */
	@Override
	public EEFContainer getContainer() {
		return new EEFContainerImpl(this.eefGroupDescription.getContainer());
	}
}
