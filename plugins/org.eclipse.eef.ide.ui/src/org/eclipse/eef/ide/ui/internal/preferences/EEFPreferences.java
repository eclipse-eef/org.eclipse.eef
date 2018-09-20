/*******************************************************************************
 * Copyright (c) 2017, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.internal.preferences;

import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.eef.ide.ui.internal.widgets.EEFTextLifecycleManager.ConflictResolutionMode;
import org.osgi.service.prefs.BackingStoreException;

/**
 * Preferences for the EEF UI.
 *
 * @author pcdavid
 */
public final class EEFPreferences {
	/**
	 * The key for the text conflict resolution mode.
	 */
	public static final String TEXT_CONFLICT_RESOLUTION_MODE = "TEXT_CONFLICT_RESOLUTION_MODE"; //$NON-NLS-1$

	/**
	 * The default value for text conflict resolution mode.
	 */
	public static final ConflictResolutionMode DEFAULT_TEXT_CONFLICT_RESOLUTION_MODE = ConflictResolutionMode.ASK_USER;

	/**
	 * The EEF Common preference scope.
	 */
	private static final IEclipsePreferences PREFERENCES_SCOPE = InstanceScope.INSTANCE.getNode(EEFIdeUiPlugin.PLUGIN_ID);

	/**
	 * The EEF Common default preference scope.
	 */
	private static final IEclipsePreferences DEFAULT_PREFERENCES_SCOPE = DefaultScope.INSTANCE.getNode(EEFIdeUiPlugin.PLUGIN_ID);

	/**
	 * The constructor.
	 */
	private EEFPreferences() {
		// prevent instantiation
	}

	/**
	 * Indicates how text conflicts should be resolved.
	 *
	 * @return the conflict resolution mode to be used.
	 */
	public static ConflictResolutionMode getTextConflictResolutionMode() {
		String mode = PREFERENCES_SCOPE.get(TEXT_CONFLICT_RESOLUTION_MODE, null);
		if (mode == null) {
			// No explicit preference was set, use the configured default (from the default scope), or the hard-coded
			// "default default" if none was set.
			mode = DEFAULT_PREFERENCES_SCOPE.get(TEXT_CONFLICT_RESOLUTION_MODE, DEFAULT_TEXT_CONFLICT_RESOLUTION_MODE.name());
		}
		try {
			return ConflictResolutionMode.valueOf(mode);
		} catch (@SuppressWarnings("unused") IllegalArgumentException iae) {
			return DEFAULT_TEXT_CONFLICT_RESOLUTION_MODE;
		}
	}

	/**
	 * Sets the state of the debug mode.
	 *
	 * @param mode
	 *            the conflict resolution mode to use.
	 */
	public static void setTextConflictResolutionMode(ConflictResolutionMode mode) {
		if (mode == null) {
			throw new IllegalArgumentException();
		} else {
			PREFERENCES_SCOPE.put(TEXT_CONFLICT_RESOLUTION_MODE, mode.name());
			save();
		}
	}

	/**
	 * Save the modification of the preference store.
	 */
	private static void save() {
		try {
			PREFERENCES_SCOPE.flush();
		} catch (BackingStoreException e) {
			EEFIdeUiPlugin.getPlugin().error(e.getMessage(), e);
		}
	}
}
