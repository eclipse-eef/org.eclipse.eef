/*******************************************************************************
 * Copyright (c) 2016, 2023 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.properties.ui.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Wrapper for contributors who want to use this version of the framework but can not have a hard dependency (via
 * inheritance) towards IEEFTabbedPropertySheetPageContributor.
 *
 * @author pcdavid
 */
public abstract class AbstractEEFTabbedPropertySheetPageContributorWrapper implements IEEFTabbedPropertySheetPageContributor {
	/**
	 * The original contributor object.
	 */
	protected final Object realContributor;

	/**
	 * The contributor id.
	 */
	protected final String contributorId;

	/**
	 * The list of contributor ids.
	 */
	private final List<String> contributorIds = new ArrayList<>();

	/**
	 * Creates a wrapper.
	 *
	 * @param realContributor
	 *            the original contributor object.
	 * @param contributorId
	 *            the contributor id.
	 */
	public AbstractEEFTabbedPropertySheetPageContributorWrapper(Object realContributor, String contributorId) {
		this.realContributor = realContributor;
		this.contributorId = contributorId;
		this.contributorIds.add(contributorId);
	}

	/**
	 * Creates a wrapper.
	 *
	 * @param realContributor
	 *            the original contributor object.
	 * @param contributorIds
	 *            the list of contributor ids
	 */
	public AbstractEEFTabbedPropertySheetPageContributorWrapper(Object realContributor, List<String> contributorIds) {
		Objects.requireNonNull(contributorIds);
		this.realContributor = realContributor;
		this.contributorIds.addAll(contributorIds);
		if (!contributorIds.isEmpty()) {
			this.contributorId = contributorIds.get(0);
		} else {
			this.contributorId = null;
		}
	}

	@Override
	public String getContributorId() {
		return contributorId;
	}

	@Override
	public List<String> getContributorIds() {
		return this.contributorIds;
	}

	/**
	 * Return the original (wrapped) Contributor.
	 *
	 * @return the original (wrapped) Contributor.
	 */
	public Object getRealContributor() {
		return this.realContributor;
	}
}