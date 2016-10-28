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
package org.eclipse.eef.ide.ui.internal.widgets;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.controllers.IEEFHyperlinkController;
import org.eclipse.eef.ide.ui.internal.EEFIdeUiPlugin;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Point;

/**
 * The listener of the hyperlink widget.
 *
 * @author sbegaudeau
 */
public class EEFHyperlinkListener implements MouseListener {

	/**
	 * The life cycle manager.
	 */
	private EEFHyperlinkLifecycleManager lifecycleManager;

	/**
	 * The hyperlink.
	 */
	private StyledText hyperlink;

	/**
	 * The Form container.
	 */
	private IEEFFormContainer container;

	/**
	 * The controller.
	 */
	private IEEFHyperlinkController controller;

	/**
	 * The constructor.
	 *
	 * @param lifecycleManager
	 *            The life cycle manager
	 * @param hyperlink
	 *            The hyperlink
	 * @param container
	 *            The Form container
	 * @param controller
	 *            The controller
	 */
	public EEFHyperlinkListener(EEFHyperlinkLifecycleManager lifecycleManager, StyledText hyperlink, IEEFFormContainer container,
			IEEFHyperlinkController controller) {
		this.lifecycleManager = lifecycleManager;
		this.hyperlink = hyperlink;
		this.container = container;
		this.controller = controller;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.swt.events.MouseListener#mouseDoubleClick(org.eclipse.swt.events.MouseEvent)
	 */
	@Override
	public void mouseDoubleClick(MouseEvent e) {
		// nothing
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.swt.events.MouseListener#mouseDown(org.eclipse.swt.events.MouseEvent)
	 */
	@Override
	public void mouseDown(MouseEvent e) {
		try {
			int offset = hyperlink.getOffsetAtLocation(new Point(e.x, e.y));
			StyleRange stylerange = hyperlink.getStyleRangeAtOffset(offset);
			if (stylerange != null) {
				if (!container.isRenderingInProgress()) {
					IStatus result = controller.onClick(hyperlink.getData());
					if (result != null && result.getSeverity() == IStatus.ERROR) {
						EEFIdeUiPlugin.INSTANCE.log(result);
					} else {
						lifecycleManager.refresh();
					}
				}
			}
		} catch (IllegalArgumentException exception) {
			// do not log, the user tried to click outside of the hyperlink
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.swt.events.MouseListener#mouseUp(org.eclipse.swt.events.MouseEvent)
	 */
	@Override
	public void mouseUp(MouseEvent e) {
		// nothing
	}
}
