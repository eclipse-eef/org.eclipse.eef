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
package org.eclipse.eef.common.api.preferences;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.eef.common.internal.EEFCommonPlugin;
import org.eclipse.eef.common.internal.preferences.IEEFPreferenceConstants;
import org.osgi.service.prefs.BackingStoreException;

/**
 * The preferences of the bundle EEF Core.
 *
 * @author sbegaudeau
 */
public final class EEFCommonPreferences {

	/**
	 * The EEF Core preference scope.
	 */
	private static final IEclipsePreferences PREFERENCES_SCOPE = InstanceScope.INSTANCE.getNode(EEFCommonPlugin.PLUGIN_ID);

	/**
	 * The constructor.
	 */
	private EEFCommonPreferences() {
		// prevent instantiation
	}

	/**
	 * Indicates if the debug mode is enabled.
	 *
	 * @return <code>true</code> if it is enabled, <code>false</code> otherwise
	 */
	public static boolean isDebugEnabled() {
		return PREFERENCES_SCOPE.getBoolean(IEEFPreferenceConstants.DEBUG, false);
	}

	/**
	 * Sets the state of the debug mode.
	 *
	 * @param isEnabled
	 *            <code>true</code> to activate the debug mode, <code>false</code> to deactivate it
	 */
	public static void setDebug(boolean isEnabled) {
		PREFERENCES_SCOPE.putBoolean(IEEFPreferenceConstants.DEBUG, isEnabled);
		save();
	}

	/**
	 * Save the modification of the preference store.
	 */
	private static void save() {
		try {
			PREFERENCES_SCOPE.flush();
		} catch (BackingStoreException e) {
			EEFCommonPlugin.getPlugin().error(e.getMessage(), e);
		}
	}
}
