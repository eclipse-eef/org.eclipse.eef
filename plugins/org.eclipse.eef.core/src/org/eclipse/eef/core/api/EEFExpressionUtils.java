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
package org.eclipse.eef.core.api;

/**
 * Utility class containing the constants from the EEFExpression model.
 *
 * @author sbegaudeau
 */
public class EEFExpressionUtils {

	/**
	 * Utility class containing the constants related to the {@link org.eclipse.eef.core.api.EEFView}.
	 *
	 * @author sbegaudeau
	 */
	public final class EEFView {
		/**
		 * The name of the variable viewSemanticCandidate.
		 */
		public static final String VIEW_SEMANTIC_CANDIDATE = "viewSemanticCandidate"; //$NON-NLS-1$

		/**
		 * The constructor.
		 */
		private EEFView() {
			// prevent instantiation
		}
	}

	/**
	 * Utility class containing the constants related to the {@link org.eclipse.eef.core.api.EEFPage}.
	 *
	 * @author sbegaudeau
	 */
	public final class EEFPage {

		/**
		 * The name of the variable pageSemanticCandidate.
		 */
		public static final String PAGE_SEMANTIC_CANDIDATE = "pageSemanticCandidate"; //$NON-NLS-1$

		/**
		 * The constructor.
		 */
		private EEFPage() {
			// prevent instantiation
		}
	}

	/**
	 * Utility class containing the constants related to the {@link org.eclipse.eef.core.api.EEFGroup}.
	 *
	 * @author sbegaudeau
	 */
	public final class EEFGroup {
		/**
		 * The name of the variable groupSemanticCandidate.
		 */
		public static final String GROUP_SEMANTIC_CANDIDATE = "groupSemanticCandidate"; //$NON-NLS-1$

		/**
		 * The constructor.
		 */
		private EEFGroup() {
			// prevent instantiation
		}
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
}
