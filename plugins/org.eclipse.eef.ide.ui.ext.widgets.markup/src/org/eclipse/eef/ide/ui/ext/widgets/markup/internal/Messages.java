/*******************************************************************************
 * Copyright (c) 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.ext.widgets.markup.internal;

import org.eclipse.osgi.util.NLS;

/**
 * @author Arthur Daussy
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.eef.ide.ui.ext.widgets.markup.internal.messages"; //$NON-NLS-1$
	public static String HTMLLifeCycleManager_Error_UnableToOpenURLInBrowser;
	public static String HTMLLifeCycleManager_Warning_InvalidURL;
	public static String MarkdownEditDialog_DialogTitle;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
