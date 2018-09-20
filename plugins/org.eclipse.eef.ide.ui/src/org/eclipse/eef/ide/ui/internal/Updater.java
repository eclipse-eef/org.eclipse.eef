/*******************************************************************************
 * Copyright (c) 2016, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.internal;

import java.util.List;
import java.util.function.Consumer;

import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.ide.ui.api.EEFTab;
import org.eclipse.emf.common.notify.Notification;

/**
 * A post-commit listener which refreshes the whole page when a significant change (an actual modification of a model
 * element) occurs in the current editing domain.
 *
 * @author pcdavid
 */
public class Updater implements Consumer<List<Notification>> {

	/**
	 * The top-level page the section is part of.
	 */
	private final IEEFFormContainer formContainer;

	/**
	 * The section to refresh.
	 */
	private final EEFTab section;

	/**
	 * Creates a new updater.
	 *
	 * @param section
	 *            The section to refresh.
	 * @param formContainer
	 *            The container of the form.
	 */
	public Updater(EEFTab section, IEEFFormContainer formContainer) {
		this.section = section;
		this.formContainer = formContainer;
	}

	/**
	 * Start listening to changes from the current editing domain.
	 */
	public void enable() {
		disable();
		section.getEEFPage().getView().getContextAdapter().registerModelChangeListener(this);
	}

	/**
	 * Stop listening to changes from the editing domain.
	 */
	public void disable() {
		section.getEEFPage().getView().getContextAdapter().unregisterModelChangeListener();
	}

	@Override
	public void accept(List<Notification> value) {
		formContainer.refreshPage();
	}
}