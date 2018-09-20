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
package org.eclipse.eef.ide.ui.internal.widgets;

import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.jface.viewers.AbstractListViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * A concrete viewer based either on a radio group.
 *
 * @author mbats
 */
public class RadioGroupViewer extends AbstractListViewer {

	/**
	 * The radio group.
	 */
	private RadioGroup radioGroup;

	/**
	 * Creates a radio group viewer on a newly-created radio group control under the given parent. The combo control is
	 * created using the given SWT style bits.
	 *
	 * @param parent
	 *            the parent control
	 * @param widgetFactory
	 *            the widget factory
	 * @param numberOfColumns
	 *            The number of columns to use to display the candidates
	 */
	public RadioGroupViewer(Composite parent, EEFWidgetFactory widgetFactory, int numberOfColumns) {
		this(new RadioGroup(parent, widgetFactory, numberOfColumns));
	}

	/**
	 * Creates a radio group viewer on the given radio group control.
	 *
	 * @param list
	 *            the combo control
	 */
	public RadioGroupViewer(RadioGroup list) {
		this.radioGroup = list;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.AbstractListViewer#listAdd(java.lang.String, int)
	 */
	@Override
	protected void listAdd(String string, int index) {
		radioGroup.add(string, index);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.AbstractListViewer#listSetItem(int, java.lang.String)
	 */
	@Override
	protected void listSetItem(int index, String string) {
		radioGroup.setItem(index, string);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.AbstractListViewer#listGetSelectionIndices()
	 */
	@Override
	protected int[] listGetSelectionIndices() {
		return radioGroup.getSelectionIndex();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.AbstractListViewer#listGetItemCount()
	 */
	@Override
	protected int listGetItemCount() {
		return radioGroup.getItemCount();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.AbstractListViewer#listSetItems(java.lang.String[])
	 */
	@Override
	protected void listSetItems(String[] labels) {
		radioGroup.setItem(labels);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.AbstractListViewer#listRemoveAll()
	 */
	@Override
	protected void listRemoveAll() {
		// Nothing to do
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.AbstractListViewer#listRemove(int)
	 */
	@Override
	protected void listRemove(int index) {
		radioGroup.remove(index);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.AbstractListViewer#listSetSelection(int[])
	 */
	@Override
	protected void listSetSelection(int[] ixs) {
		radioGroup.deselectAll();
		for (int ix : ixs) {
			radioGroup.select(ix);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.AbstractListViewer#listShowSelection()
	 */
	@Override
	protected void listShowSelection() {
		// Nothing todo
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.AbstractListViewer#listDeselectAll()
	 */
	@Override
	protected void listDeselectAll() {
		radioGroup.deselectAll();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.StructuredViewer#reveal(java.lang.Object)
	 */
	@Override
	public void reveal(Object element) {
		// Nothing todo
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.Viewer#getControl()
	 */
	@Override
	public Control getControl() {
		return radioGroup;
	}

	/**
	 * Returns this list viewer's list control.
	 *
	 * @return the list control
	 */
	public RadioGroup getRadioGroup() {
		return radioGroup;
	}
}
