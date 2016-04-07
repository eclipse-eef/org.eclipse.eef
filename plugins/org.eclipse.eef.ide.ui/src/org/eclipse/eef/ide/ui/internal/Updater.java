/*******************************************************************************
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.internal;

import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.ide.ui.api.EEFTab;

/**
 * A post-commit listener which refreshes the whole page when a significant change (an actual modification of a model
 * element) occurs in the current editing domain.
 *
 * @author pcdavid
 */
public class Updater implements Runnable {

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

	@Override
	public void run() {
		formContainer.refreshPage();
	}

	/**
	 * Start listening to changes from the current editing domain.
	 */
	public void enable() {
		disable();
		section.getEEFPage().getView().addExternalModelChangeListener(this);
	}

	/**
	 * Stop listening to changes from the editing domain.
	 */
	public void disable() {
		section.getEEFPage().getView().removeExternalModelChangeListener(this);
	}
}