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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.controllers.IEEFListController;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

/**
 * This class is used to call the controller once the end user click on the table.
 *
 * @author sbegaudeau
 */
public class EEFListSelectionListener implements SelectionListener {

	/**
	 * The controller.
	 */
	private IEEFListController controller;

	/**
	 * The constructor.
	 *
	 * @param controller
	 *            The controller
	 */
	public EEFListSelectionListener(IEEFListController controller) {
		this.controller = controller;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	 */
	@Override
	public void widgetSelected(SelectionEvent event) {
		this.triggerOnClick(event, EEFExpressionUtils.EEFList.SINGLE_CLICK);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(org.eclipse.swt.events.SelectionEvent)
	 */
	@Override
	public void widgetDefaultSelected(SelectionEvent event) {
		this.triggerOnClick(event, EEFExpressionUtils.EEFList.DOUBLE_CLICK);
	}

	/**
	 * Triggers the on click operation of the controller.
	 *
	 * @param event
	 *            The event
	 * @param onClickEventKind
	 *            The kind of click realized by the end user
	 */
	private void triggerOnClick(SelectionEvent event, String onClickEventKind) {
		Object source = event.getSource();
		if (source instanceof Table) {
			Table table = (Table) source;
			TableItem[] selection = table.getSelection();
			if (selection != null) {
				List<Object> data = new ArrayList<Object>();
				for (TableItem tableItem : selection) {
					data.add(tableItem.getData());
				}
				this.controller.onClick(data, onClickEventKind);
			}
		}
	}
}
