/*******************************************************************************
 * Copyright (c) 2015, 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.core.api;

/**
 * Utility class containing the constants from the EEFExpression model.
 *
 * @author sbegaudeau
 */
public final class EEFExpressionUtils {

	/**
	 * The self variable.
	 */
	public static final String SELF = "self"; //$NON-NLS-1$

	/**
	 * The input variable.
	 */
	public static final String INPUT = "input"; //$NON-NLS-1$

	/**
	 * The name of the variable which will hold the result of the audit.
	 */
	public static final String AUDIT_RESULT = "auditResult"; //$NON-NLS-1$

	/**
	 * The constructor.
	 */
	private EEFExpressionUtils() {
		// prevent instantiation
	}

	/**
	 * Utility class containing the constants related to the {@link org.eclipse.eef.core.api.EEFText}.
	 *
	 * @author sbegaudeau
	 */
	public final class EEFText {
		/**
		 * The name of the variable newValue.
		 */
		public static final String NEW_VALUE = "newValue"; //$NON-NLS-1$

		/**
		 * The constructor.
		 */
		private EEFText() {
			// prevent instantiation
		}
	}

	/**
	 * Utility class containing the constants related to the Checkbox widget.
	 *
	 * @author mbats
	 */
	public final class EEFCheckbox {
		/**
		 * The name of the variable newValue.
		 */
		public static final String NEW_VALUE = "newValue"; //$NON-NLS-1$

		/**
		 * The constructor.
		 */
		private EEFCheckbox() {
			// prevent instantiation
		}
	}

	/**
	 * Utility class containing the constants related to the Select widget.
	 *
	 * @author mbats
	 */
	public final class EEFSelect {
		/**
		 * The name of the variable candidate.
		 */
		public static final String CANDIDATE = "candidate"; //$NON-NLS-1$

		/**
		 * The constructor.
		 */
		private EEFSelect() {
			// prevent instantiation
		}
	}

	// CHECKSTYLE:OFF Some constants are repeated more than twice, it will be fixed with the removal of the reference
	// widget

	/**
	 * Utility class containing the constants related to the reference widgets.
	 *
	 * @author mbats
	 */
	public final class EEFReference {
		/**
		 * The name of the variable value.
		 */
		public static final String VALUE = "value"; //$NON-NLS-1$

		/**
		 * The name of the variable selection.
		 */
		public static final String SELECTION = "selection"; //$NON-NLS-1$

		/**
		 * The name of the variable used to indicate the kind of click event.
		 */
		public static final String ON_CLICK_EVENT_KIND = "onClickEventKind"; //$NON-NLS-1$

		/**
		 * The value used to indicate a single click.
		 */
		public static final String SINGLE_CLICK = "SINGLE_CLICK"; //$NON-NLS-1$

		/**
		 * The value used to indicate a double click.
		 */
		public static final String DOUBLE_CLICK = "DOUBLE_CLICK"; //$NON-NLS-1$

		/**
		 * The constructor.
		 */
		private EEFReference() {
			// prevent instantiation
		}
	}

	/**
	 * Utility class containing the constants related to the list widgets.
	 *
	 * @author sbegaudeau
	 */
	public final class EEFList {
		/**
		 * The name of the variable value.
		 */
		public static final String VALUE = "value"; //$NON-NLS-1$

		/**
		 * The name of the variable selection.
		 */
		public static final String SELECTION = "selection"; //$NON-NLS-1$

		/**
		 * The name of the variable used to indicate the kind of click event.
		 */
		public static final String ON_CLICK_EVENT_KIND = "onClickEventKind"; //$NON-NLS-1$

		/**
		 * The value used to indicate a single click.
		 */
		public static final String SINGLE_CLICK = "SINGLE_CLICK"; //$NON-NLS-1$

		/**
		 * The value used to indicate a double click.
		 */
		public static final String DOUBLE_CLICK = "DOUBLE_CLICK"; //$NON-NLS-1$

		/**
		 * The constructor.
		 */
		private EEFList() {
			// prevent instantiation
		}
	}

	/**
	 * Utility class containing the constants related to the EEFHyperlink.
	 *
	 * @author mbats
	 */
	public final class EEFHyperlink {
		/**
		 * The name of the variable selection.
		 */
		public static final String SELECTION = "selection"; //$NON-NLS-1$

		/**
		 * The constructor.
		 */
		private EEFHyperlink() {
			// prevent instantiation
		}
	}
}
