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
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Viewer representing the property sheet page. On the left side it contains a list of tabs and on the right side it
 * contains the current selected tab.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 */
public class EEFTabbedPropertyViewer extends StructuredViewer {

	/**
	 * The elements displayed in the viewer.
	 */
	private List<IEEFTabDescriptor> elements = new ArrayList<IEEFTabDescriptor>();

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
		this.hookControl(this.list);
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
		this.setInput(selection);
	}

	/**
	 * Return the input.
	 *
	 * @return the input
	 */
	@Override
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

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.StructuredViewer#getSelectionFromWidget()
	 */
	@Override
	protected List getSelectionFromWidget() {
		List result = new ArrayList();
		IEEFTabDescriptor tabDescriptor = this.getTabDescriptionAtIndex(this.getSelectionIndex());
		if (tabDescriptor != null) {
			result.add(tabDescriptor);
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.StructuredViewer#setSelectionToWidget(java.util.List, boolean)
	 */
	@Override
	protected void setSelectionToWidget(List l, boolean reveal) {
		IEEFTabDescriptor tabDescriptor = null;
		if (l != null && l.size() > 0 && l.get(0) instanceof IEEFTabDescriptor) {
			tabDescriptor = (IEEFTabDescriptor) l.get(0);
		}
		this.setSelectedTabDescriptor(tabDescriptor);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.Viewer#getControl()
	 */
	@Override
	public Control getControl() {
		return this.list;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.Viewer#inputChanged(java.lang.Object, java.lang.Object)
	 */
	@Override
	protected void inputChanged(Object newInput, Object oldInput) {
		this.elements.clear();

		List<IEEFTabDescriptor> descriptors = this.registry.getTabDescriptors(this.part, this.getSelection());
		list.removeAll();
		for (IEEFTabDescriptor descriptor : descriptors) {
			this.elements.add(descriptor);
		}

		list.setElements(descriptors.toArray());
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.StructuredViewer#internalRefresh(java.lang.Object)
	 */
	@Override
	protected void internalRefresh(Object element) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.StructuredViewer#doUpdateItem(org.eclipse.swt.widgets.Widget, java.lang.Object,
	 *      boolean)
	 */
	@Override
	protected void doUpdateItem(Widget item, Object element, boolean fullMap) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.StructuredViewer#reveal(java.lang.Object)
	 */
	@Override
	public void reveal(Object element) {
		// do nothing
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.StructuredViewer#doFindInputItem(java.lang.Object)
	 */
	@Override
	protected Widget doFindInputItem(Object element) {
		// do nothing
		return null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.viewers.StructuredViewer#doFindItem(java.lang.Object)
	 */
	@Override
	protected Widget doFindItem(Object element) {
		// do nothing
		return null;
	}

}
