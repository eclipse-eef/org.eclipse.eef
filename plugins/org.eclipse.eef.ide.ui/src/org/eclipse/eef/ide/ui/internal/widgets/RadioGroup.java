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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.eef.properties.ui.api.EEFTabbedPropertySheetWidgetFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TypedListener;

/**
 * Group of radio widgets.
 *
 * @author mbats
 */
public class RadioGroup extends Composite {

	/**
	 * The group.
	 */
	private Group group;

	/**
	 * The radio buttons.
	 */
	private Map<Integer, Button> buttons = new HashMap<Integer, Button>();

	/**
	 * The widget factory.
	 */
	private EEFTabbedPropertySheetWidgetFactory widgetFactory;

	/**
	 * Constructs a new instance of this class given its parent and a style value describing its behavior and
	 * appearance.
	 *
	 * @param parent
	 *            a composite control which will be the parent of the new instance (cannot be null)
	 * @param widgetFactory
	 *            the style of control to construct
	 */
	public RadioGroup(Composite parent, EEFTabbedPropertySheetWidgetFactory widgetFactory) {
		super(parent, SWT.RADIO);
		this.widgetFactory = widgetFactory;
		this.group = widgetFactory.createGroup(parent, ""); //$NON-NLS-1$
		this.group.setLayout(new RowLayout(SWT.HORIZONTAL));

		addListener(SWT.Dispose, new Listener() {
			@Override
			public void handleEvent(Event event) {
				handleDispose(event);
			}
		});
	}

	/**
	 * Dispose.
	 *
	 * @param event
	 *            Event
	 */
	protected void handleDispose(Event event) {
		removeAll();
	}

	/**
	 * Sets the text of the item in the receiver's list at the given zero-relative index to the string argument.
	 *
	 * @param index
	 *            the index for the item
	 * @param string
	 *            the new text for the item
	 */
	public void setItem(int index, String string) {
		add(string, index);

		Button button = buttons.get(index);
		button.setText(string);
	}

	/**
	 * Adds the argument to the receiver's list at the given zero-relative index.
	 *
	 * @param string
	 *            the new item
	 * @param index
	 *            the index for the item
	 */
	public void add(String string, int index) {
		if (buttons.get(index) == null) {
			Button button = widgetFactory.createButton(group, string, SWT.RADIO);
			buttons.put(index, button);
		}
	}

	/**
	 * Returns the number of items contained in the receiver's list.
	 *
	 * @return the number of items
	 */
	public int getItemCount() {
		return buttons.size();
	}

	/**
	 * Add selection listener.
	 *
	 * @param listener
	 *            The selection listener
	 */
	public void addSelectionListener(SelectionListener listener) {
		TypedListener typedListener = new TypedListener(listener);
		addListener(SWT.Selection, typedListener);
		addListener(SWT.DefaultSelection, typedListener);
	}

	/**
	 * Remove selection listener.
	 *
	 * @param listener
	 *            The selection listener
	 */
	public void removeSelectionListener(SelectionListener listener) {
		removeListener(SWT.Selection, listener);
		removeListener(SWT.DefaultSelection, listener);
	}

	/**
	 * Returns the zero-relative index of the item which is currently selected in the receiver's list, or -1 if no item
	 * is selected.
	 *
	 * @return the index of the selected item
	 */
	public int[] getSelectionIndex() {
		for (Map.Entry<Integer, Button> entry : buttons.entrySet()) {
			Button button = entry.getValue();
			if (button.getSelection()) {
				return new int[] { entry.getKey() };
			}
		}
		return new int[] { -1 };
	}

	/**
	 * Sets the receiver's list to be the given array of items.
	 *
	 * @param items
	 *            the array of items
	 */
	public void setItem(String[] items) {
		int i = 0;
		for (String item : items) {
			setItem(i, item);
			i++;
		}
	}

	/**
	 * Removes all of the items from the receiver's list and clear the contents of receiver's text field.
	 */
	public void removeAll() {
		int size = buttons.size();
		for (int i = 0; i < size; i++) {
			remove(i);
		}
	}

	/**
	 * Removes the item from the receiver's list at the given zero-relative index.
	 *
	 * @param index
	 *            the index for the item
	 */
	public void remove(int index) {
		Button button = buttons.get(index);
		if (button != null && !button.isDisposed()) {
			button.dispose();
			buttons.remove(index);
		}

	}

	/**
	 * Selects the item at the given zero-relative index in the receiver's list. If the item at the index was already
	 * selected, it remains selected. Indices that are out of range are ignored.
	 *
	 * @param index
	 *            the index of the item to select
	 */
	public void select(int index) {
		buttons.get(index).setSelection(true);
	}

	/**
	 * Deselects all selected items in the receiver's list.
	 */
	public void deselectAll() {
		for (Button button : buttons.values()) {
			button.setSelection(false);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.swt.widgets.Widget#dispose()
	 */
	@Override
	public void dispose() {
		for (Button button : buttons.values()) {
			button.dispose();
		}
		super.dispose();
	}
}
