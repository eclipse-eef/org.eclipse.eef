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
package org.eclipse.eef.uml.editor.sample.internal.properties;

import org.eclipse.eef.uml.editor.sample.internal.editor.EEFUmlEditor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * The tabbed property sheet page.
 *
 * @author sbegaudeau
 */
public class UmlPropertySheetPage extends TabbedPropertySheetPage {

	/**
	 * The constructor.
	 *
	 * @param eefUmlEditor
	 *            The editor
	 */
	public UmlPropertySheetPage(EEFUmlEditor eefUmlEditor) {
		super(eefUmlEditor);
	}

}
