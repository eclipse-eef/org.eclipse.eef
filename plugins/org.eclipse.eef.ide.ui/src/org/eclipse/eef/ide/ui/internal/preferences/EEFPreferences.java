/*******************************************************************************
 * Copyright (c) 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.internal.preferences;

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
	 * The default value for text conflict resolution mode.
	 */
	private static final ConflictResolutionMode DEFAULT_TEXT_CONFLICT_RESOLUTION_MODE = ConflictResolutionMode.USE_MODEL_VERSION;

	/**
	 * The key for the text conflict resolution mode.
	 */
	private static final String TEXT_CONFLICT_RESOLUTION_MODE = "TEXT_CONFLICT_RESOLUTION_MODE"; //$NON-NLS-1$

	/**
	 * The EEF Common preference scope.
	 */
	private static final IEclipsePreferences PREFERENCES_SCOPE = InstanceScope.INSTANCE.getNode(EEFIdeUiPlugin.PLUGIN_ID);

	/**
	 * The constructor.
	 */
	private EEFPreferences() {
		// prevent instantiation
	}

	/**
	 * Indices how text conflict should be resolved.
	 *
	 * @return the conflict resolution mode to be used.
	 */
	public static ConflictResolutionMode getTextConflictResolutionMode() {
		String str = PREFERENCES_SCOPE.get(TEXT_CONFLICT_RESOLUTION_MODE, DEFAULT_TEXT_CONFLICT_RESOLUTION_MODE.name());
		try {
			return ConflictResolutionMode.valueOf(str);
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
			PREFERENCES_SCOPE.put(TEXT_CONFLICT_RESOLUTION_MODE, DEFAULT_TEXT_CONFLICT_RESOLUTION_MODE.name());
		} else {
			PREFERENCES_SCOPE.put(TEXT_CONFLICT_RESOLUTION_MODE, mode.name());
		}
		save();
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
