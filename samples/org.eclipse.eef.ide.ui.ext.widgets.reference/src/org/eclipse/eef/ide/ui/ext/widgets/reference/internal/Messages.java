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
package org.eclipse.eef.ide.ui.ext.widgets.reference.internal;

import org.eclipse.eef.common.api.utils.I18N;
import org.eclipse.eef.common.api.utils.I18N.TranslatableMessage;

/**
 * Utility class used for the internationalization.
 *
 * @author sbegaudeau
 */
public final class Messages {

	static {
		I18N.initializeMessages(Messages.class, EEFExtReferenceUIPlugin.INSTANCE);
	}

	// @CHECKSTYLE:OFF

	@TranslatableMessage
	public static String ReferenceCreationWizard_windowTitle;

	@TranslatableMessage
	public static String ReferenceCreationWizardPage_title;

	@TranslatableMessage
	public static String ReferenceCreationWizardPage_description;

	@TranslatableMessage
	public static String ReferenceCreationWizardPage_eClassToCreateLabel;

	@TranslatableMessage
	public static String ReferenceCreationWizardPage_eContainerSelectionLabel;

	@TranslatableMessage
	public static String ReferenceCreationWizardPage_eContainerToUseLabel;

	@TranslatableMessage
	public static String ReferenceCreationWizardPage_missingEClassToCreate;

	@TranslatableMessage
	public static String ReferenceCreationWizardPage_missingEContainer;

	@TranslatableMessage
	public static String ReferenceCreationWizardPage_missingContainmentEReference;

	@TranslatableMessage
	public static String ReferenceSelectionWizard_windowTitle;

	@TranslatableMessage
	public static String ReferenceSelectionWizardPage_title;

	@TranslatableMessage
	public static String ReferenceSelectionWizardPage_description;

	@TranslatableMessage
	public static String ReferenceSelectionWizardPage_missingEObject;

	@TranslatableMessage
	public static String SingleReference_noValue;

	@TranslatableMessage
	public static String ReferenceBrowseButton_tooltipText;

	@TranslatableMessage
	public static String ReferenceAddButton_tooltipText;

	@TranslatableMessage
	public static String ReferenceRemoveButton_tooltipText;

	@TranslatableMessage
	public static String ReferenceUpButton_tooltipText;

	@TranslatableMessage
	public static String ReferenceDownButton_tooltipText;

	/**
	 * The constructor.
	 */
	private Messages() {
		// Prevent instantiation
	}
}
