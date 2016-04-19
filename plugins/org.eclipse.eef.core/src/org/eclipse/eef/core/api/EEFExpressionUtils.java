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
	 * The expression used to retrieve self.
	 */
	public static final String VAR_SELF = "var:self"; //$NON-NLS-1$

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

	/**
	 * Utility class containing the constants related to the {@link org.eclipse.eef.core.api.EEFMultiReferences}.
	 *
	 * @author mbats
	 */
	public final class EEFMultiReferences {
		/**
		 * The name of the variable selection.
		 */
		public static final String SELECTION = "selection"; //$NON-NLS-1$

		/**
		 * The constructor.
		 */
		private EEFMultiReferences() {
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
