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
package org.eclipse.eef.ide.ui.api.widgets;

import org.eclipse.eef.EEFTextDescription;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.swt.widgets.Composite;

/**
 * This interface will be used to delegate the behavior of the source viewer to another class.
 *
 * @author sbegaudeau
 */
public interface IEEFSourceViewerManager {
	/**
	 * Indicates if the given description can be handled.
	 * 
	 * @param description
	 *            The description
	 * @return <code>true</code> if the description is supported, <code>false</code> otherwise
	 */
	boolean canHandle(EEFTextDescription description);

	/**
	 * Creates and configures the source viewer.
	 *
	 * @param parent
	 *            The parent
	 * @param style
	 *            The style
	 * @return The source viewer created
	 */
	SourceViewer createSourceViewer(Composite parent, int style);
}
