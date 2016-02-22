/*******************************************************************************
 * Copyright (c) 2001, 2016 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Obeo - Contribution to the EEF project
 *******************************************************************************/
package org.eclipse.eef.properties.ui.internal.page;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.eef.properties.ui.api.IEEFTabDescriptor;
import org.eclipse.eef.properties.ui.internal.EEFTabbedPropertyViewPlugin;
import org.eclipse.eef.properties.ui.internal.page.propertylist.EEFTabbedPropertyList;
import org.eclipse.eef.properties.ui.internal.registry.EEFTabbedPropertyRegistry;
import org.eclipse.jface.util.OpenStrategy;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Viewer representing the property sheet page. On the left side it contains a list of tabs and on the right side it
 * contains the current selected tab.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 */
public class EEFTabbedPropertyViewer {

	/**
	 * Interface used to listen to changes to the currently selected tab.
	 *
	 * @author sbegaudeau
	 */
	public interface IEEFTabDescriptorChangedListener {
		/**
		 * React to a selection change event.
		 *
		 * @param descriptor
		 *            The descriptor selected
		 */
		void selectionChanged(IEEFTabDescriptor descriptor);
	}

	/**
	 * The elements displayed in the viewer.
	 */
	private List<IEEFTabDescriptor> elements = new ArrayList<IEEFTabDescriptor>();

	/**
	 * The listeners.
	 */
	private List<IEEFTabDescriptorChangedListener> listeners = new ArrayList<EEFTabbedPropertyViewer.IEEFTabDescriptorChangedListener>();

	/**
	 * The tabbed property list.
	 */
	private EEFTabbedPropertyList list;

	/**
	 * The workbench part.
	 */
	private IWorkbenchPart part;

	/**
	 * The tabbed property registry.
	 */
	private EEFTabbedPropertyRegistry registry;

	/**
	 * The input.
	 */
	private ISelection input;

	/**
	 * The constructor.
	 *
	 * @param tabbedPropertyList
	 *            The tabbed property list
	 * @param registry
	 *            The tabbed property registry
	 */
	public EEFTabbedPropertyViewer(EEFTabbedPropertyList tabbedPropertyList, EEFTabbedPropertyRegistry registry) {
		this.list = tabbedPropertyList;
		this.registry = registry;

		OpenStrategy handler = new OpenStrategy(this.list);
		handler.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int index = EEFTabbedPropertyViewer.this.list.getSelectionIndex();
				IEEFTabDescriptor descriptor = EEFTabbedPropertyViewer.this.getTabDescriptionAtIndex(index);
				EEFTabbedPropertyViewer.this.fireSelectionChanged(descriptor);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// do nothing
			}
		});
	}

	/**
	 * Fires a selection changed event.
	 *
	 * @param descriptor
	 *            The newly selected {@link IEEFTabDescriptor}
	 */
	private void fireSelectionChanged(IEEFTabDescriptor descriptor) {
		for (IEEFTabDescriptorChangedListener listener : this.listeners) {
			listener.selectionChanged(descriptor);
		}
	}

	/**
	 * Adds a selection listener.
	 *
	 * @param listener
	 *            The listener
	 */
	public void addSelectionListener(IEEFTabDescriptorChangedListener listener) {
		this.listeners.add(listener);
	}

	/**
	 * Set the input for viewer.
	 *
	 * @param workbenchPart
	 *            the workbench part.
	 * @param selection
	 *            the selection in the workbench part.
	 */
	public void setInput(IWorkbenchPart workbenchPart, ISelection selection) {
		EEFTabbedPropertyViewPlugin.getPlugin().debug("EEFTabbedPropertyViewer#setInput()"); //$NON-NLS-1$

		this.part = workbenchPart;
		this.input = selection;
		this.elements.clear();

		List<IEEFTabDescriptor> descriptors = this.registry.getTabDescriptors(this.part, selection);
		list.removeAll();
		for (IEEFTabDescriptor descriptor : descriptors) {
			this.elements.add(descriptor);
		}

		list.setElements(descriptors.toArray());
	}

	/**
	 * Return the input.
	 *
	 * @return the input
	 */
	public ISelection getInput() {
		return this.input;
	}

	/**
	 * Get the current workbench part.
	 *
	 * @return the current workbench part.
	 */
	public IWorkbenchPart getWorkbenchPart() {
		return part;
	}

	/**
	 * Return the elements.
	 *
	 * @return the elements
	 */
	public List<IEEFTabDescriptor> getElements() {
		return this.elements;
	}

	/**
	 * Returns the zero-relative index of the item which is currently selected in the receiver, or -1 if no item is
	 * selected.
	 *
	 * @return the index of the selected item
	 */
	public int getSelectionIndex() {
		return list.getSelectionIndex();
	}

	/**
	 * Returns the element at the given index.
	 *
	 * @param index
	 *            The index
	 * @return The element at the give index
	 */
	public IEEFTabDescriptor getTabDescriptionAtIndex(int index) {
		if (index >= 0 && index < this.elements.size()) {
			return this.elements.get(index);
		}
		return null;
	}

	/**
	 * Sets the tab descriptor to select.
	 *
	 * @param descriptor
	 *            The descriptor
	 */
	public void setSelectedTabDescriptor(IEEFTabDescriptor descriptor) {
		if (descriptor == null) {
			this.list.deselectAll();
		} else {
			int index = -1;
			for (int i = 0; i < this.elements.size(); i++) {
				if (this.elements.get(i) == descriptor) {
					index = i;
				}
			}

			this.list.select(index);
		}
	}

}
