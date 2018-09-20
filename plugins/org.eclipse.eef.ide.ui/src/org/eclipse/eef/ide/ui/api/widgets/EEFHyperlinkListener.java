/*******************************************************************************
 * Copyright (c) 2016, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.eef.ide.ui.api.widgets;

import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.controllers.IEEFOnClickController;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Control;

/**
 * The listener of the hyperlink widget.
 *
 * @author sbegaudeau
 */
public class EEFHyperlinkListener implements MouseListener {

	/**
	 * The life cycle manager.
	 */
	private AbstractEEFWidgetLifecycleManager lifecycleManager;

	/**
	 * The hyperlink.
	 */
	private Control hyperlink;

	/**
	 * The Form container.
	 */
	private IEEFFormContainer container;

	/**
	 * The controller.
	 */
	private IEEFOnClickController controller;

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
	public EEFHyperlinkListener(AbstractEEFWidgetLifecycleManager lifecycleManager, Control hyperlink, IEEFFormContainer container,
			IEEFOnClickController controller) {
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

		if (!container.isRenderingInProgress()) {
			if (hyperlink instanceof StyledText) {
				try {
					int offset = ((StyledText) hyperlink).getOffsetAtLocation(new Point(e.x, e.y));
					StyleRange stylerange = ((StyledText) hyperlink).getStyleRangeAtOffset(offset);
					if (stylerange != null) {
						controller.onClick(hyperlink.getData(), EEFExpressionUtils.EEFList.SINGLE_CLICK);
						lifecycleManager.refresh();

					}
				} catch (@SuppressWarnings("unused") IllegalArgumentException exception) {
					// do not log, the user tried to click outside of the hyperlink
				}
			} else {
				controller.onClick(hyperlink.getData(), EEFExpressionUtils.EEFList.SINGLE_CLICK);
				lifecycleManager.refresh();
			}
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
