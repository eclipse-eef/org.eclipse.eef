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

import java.util.List;

import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.ide.ui.api.EEFTab;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A post-commit listener which refreshes the whole page when a significant change (an actual modification of a model
 * element) occurs in the current editing domain.
 *
 * @author pcdavid
 */
public class Updater implements IConsumer<List<Notification>> {

	// CHECKSTYLE:OFF
	private static final String EXPANDED_FEATURE_NAME = "expanded"; //$NON-NLS-1$

	private static final String DTREEITEM_CLASSNAME = "DTreeItem"; //$NON-NLS-1$

	private static final String TREE_MM_NSURI = "http://www.eclipse.org/sirius/tree/1.0.0"; //$NON-NLS-1$
	// CHECKSTYLE:ON

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
		section.getEEFPage().getView().getContextAdapter().onModelChange(this);
	}

	/**
	 * Stop listening to changes from the editing domain.
	 */
	public void disable() {
		section.getEEFPage().getView().getContextAdapter().removeModelChangeConsumer();
	}

	@Override
	public void apply(List<Notification> value) {
		if (!isTreeExpansionChangeOnly(value)) {
			formContainer.refreshPage();
		}
	}

	/**
	 * Checks whether the changes we are notified of only concerns Sirius tree items expansion/collapse. These are
	 * ignored for performance reasons.
	 *
	 * @param changes
	 *            the model changes.
	 * @return <code>true</code> if the changes only concert tree items expansion state changes.
	 */
	private boolean isTreeExpansionChangeOnly(List<Notification> changes) {
		for (Notification n : changes) {
			Object src = n.getNotifier();
			if (src instanceof EObject) {
				EObject obj = (EObject) src;
				String klassName = obj.eClass().getName();
				String nsURI = obj.eClass().getEPackage().getNsURI();
				Object feature = n.getFeature();
				String featureName;
				if (feature instanceof EStructuralFeature) {
					featureName = ((EStructuralFeature) feature).getName();
				} else {
					featureName = ""; //$NON-NLS-1$
				}
				boolean isTreeExpansionChange = TREE_MM_NSURI.equals(nsURI) && DTREEITEM_CLASSNAME.equals(klassName)
						&& EXPANDED_FEATURE_NAME.equals(featureName);
				if (!isTreeExpansionChange) {
					return false;
				}
			}
		}
		return true;
	}
}