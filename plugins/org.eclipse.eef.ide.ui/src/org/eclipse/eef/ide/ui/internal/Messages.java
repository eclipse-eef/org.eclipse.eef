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

import org.eclipse.eef.common.api.utils.I18N;
import org.eclipse.eef.common.api.utils.I18N.TranslatableMessage;

/**
 * Utility class used for the internationalization.
 *
 * @author sbegaudeau
 */
public final class Messages {

	static {
		I18N.initializeMessages(Messages.class, EEFIdeUiPlugin.INSTANCE);
	}

	// CHECKSTYLE:OFF
	@TranslatableMessage
	public static String EEFPreferencePage_DebugButton_Text;

	@TranslatableMessage
	public static String EEFPreferencePage_DebugButton_Tooltip;

	@TranslatableMessage
	public static String EEFIdeUiPlugin_lifecycleManagerNotFound;

	@TranslatableMessage
	public static String EEFIdeUiPlugin_lifecycleManagerInvalid;

	@TranslatableMessage
	public static String EEFColor_invalidColorCode;

	@TranslatableMessage
	public static String AbstractEEFWidgetLifecycleManager_invalidSelectionType;

	@TranslatableMessage
	public static String EEFQuickFixWizard_windowTitle;

	@TranslatableMessage
	public static String EEFQuickFixWizard_applyQuickFix;

	@TranslatableMessage
	public static String EEFQuickFixPage_title;

	@TranslatableMessage
	public static String EEFQuickFixPage_description;

	@TranslatableMessage
	public static String EEFQuickFixPage_label;

	@TranslatableMessage
	public static String EEFValidationRulesPage_title;

	@TranslatableMessage
	public static String EEFValidationRulesPage_description;

	@TranslatableMessage
	public static String EEFValidationRulesPage_label;

	@TranslatableMessage
	public static String EEFQuickFixWizard_noQuickFixAvailable;

	@TranslatableMessage
	public static String AbstractEEFWidgetLifecycleManager_noDescriptionAvailable;

	// CHECKSTYLE:ON

	/**
	 * The constructor.
	 */
	private Messages() {
		// Prevents instanciation.
	}
}
