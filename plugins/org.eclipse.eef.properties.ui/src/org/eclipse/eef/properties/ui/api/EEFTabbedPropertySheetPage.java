/*******************************************************************************
 * Copyright (c) 2001, 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Obeo - Contribution in the project EEF
 *******************************************************************************/
package org.eclipse.eef.properties.ui.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.eef.properties.ui.internal.page.EEFPartListenerAdapter;
import org.eclipse.eef.properties.ui.internal.page.EEFTabbedPropertyComposite;
import org.eclipse.eef.properties.ui.internal.page.EEFTabbedPropertyListContentProvider;
import org.eclipse.eef.properties.ui.internal.page.EEFTabbedPropertySheetPageLabelProvider;
import org.eclipse.eef.properties.ui.internal.page.EEFTabbedPropertyViewer;
import org.eclipse.eef.properties.ui.internal.registry.EEFTabbedPropertyRegistry;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.part.IContributedContentsView;
import org.eclipse.ui.part.Page;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheet;

/**
 * A property sheet page that provides a tabbed UI.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 */
public class EEFTabbedPropertySheetPage extends Page implements IPropertySheetPage {

	/**
	 * The widget factory.
	 */
	private EEFTabbedPropertySheetWidgetFactory widgetFactory;

	/**
	 * The composite holding all the widgets.
	 */
	private EEFTabbedPropertyComposite tabbedPropertyComposite;

	/**
	 * The viewer.
	 */
	private EEFTabbedPropertyViewer tabbedPropertyViewer;

	/**
	 * The workbench part requesting the use of the property page.
	 */
	private IEEFTabbedPropertySheetPageContributor contributor;

	/**
	 * The content provider of the viewer.
	 */
	private EEFTabbedPropertyListContentProvider contentProvider;

	/**
	 * The currently active tab.
	 */
	private EEFTabContents currentTab;

	/**
	 * The map of the tab descriptor to their instantiated tab.
	 */
	private Map<IEEFTabDescriptor, EEFTabContents> descriptorToTab = new HashMap<IEEFTabDescriptor, EEFTabContents>();

	/**
	 * The map of the tab to their main composite.
	 */
	private Map<EEFTabContents, Composite> tabToComposite = new HashMap<EEFTabContents, Composite>();

	/**
	 * This queue will contain the list of the label of the selected tabs.
	 */
	private List<String> selectionQueue = new ArrayList<String>();

	/**
	 * Indicates that the selection queue is locked by the user.
	 */
	private boolean selectionQueueLocked;

	/**
	 * The tab selection listener.
	 */
	private List<IEEFTabSelectionListener> tabSelectionListeners = new ArrayList<IEEFTabSelectionListener>();

	/**
	 * The workbench window.
	 */
	private IWorkbenchWindow cachedWorkbenchWindow;

	/**
	 * The part activation listener used to manage a part of the lifecycle of the property sheet page.
	 */
	private IPartListener partActivationListener;

	/**
	 * Indicates if we should activate the property sheet.
	 */
	private boolean activePropertySheet;

	/**
	 * The current selection.
	 */
	private ISelection currentSelection;

	/**
	 * The registry.
	 */
	private EEFTabbedPropertyRegistry registry = EEFTabbedPropertyRegistry.getDefault();

	/**
	 * The constructor.
	 *
	 * @param contributor
	 *            The contributor
	 */
	public EEFTabbedPropertySheetPage(IEEFTabbedPropertySheetPageContributor contributor) {
		this.contributor = contributor;
		this.initContributor(this.contributor.getContributorId());
	}

	/**
	 * Initialize the contributor with the provided contributor id.
	 *
	 * @param contributorId
	 *            The contributor id
	 */
	private void initContributor(String contributorId) {
		this.contentProvider = new EEFTabbedPropertyListContentProvider(this.registry);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.part.IPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		this.widgetFactory = new EEFTabbedPropertySheetWidgetFactory();
		this.tabbedPropertyComposite = new EEFTabbedPropertyComposite(parent, this.widgetFactory);
		this.widgetFactory.paintBordersFor(this.tabbedPropertyComposite);
		this.tabbedPropertyComposite.setLayout(new FormLayout());

		FormData formData = new FormData();
		formData.left = new FormAttachment(0, 0);
		formData.right = new FormAttachment(100, 0);
		formData.top = new FormAttachment(0, 0);
		formData.bottom = new FormAttachment(100, 0);
		this.tabbedPropertyComposite.setLayoutData(formData);

		this.tabbedPropertyViewer = new EEFTabbedPropertyViewer(this.tabbedPropertyComposite.getTabbedPropertyList());
		this.tabbedPropertyViewer.setContentProvider(this.contentProvider);
		this.tabbedPropertyViewer.setLabelProvider(new EEFTabbedPropertySheetPageLabelProvider());
		this.tabbedPropertyViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				EEFTabbedPropertySheetPage.this.processSelectionChanged(event);
			}
		});

		this.tabbedPropertyComposite.getScrolledComposite().addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {
				EEFTabbedPropertySheetPage.this.resizeScrolledComposite();
			}
		});

		this.partActivationListener = new EEFPartListenerAdapter() {
			@Override
			public void partOpened(IWorkbenchPart part) {
				EEFTabbedPropertySheetPage.this.handlePartActivated(part);
			}
		};

		this.cachedWorkbenchWindow = this.getSite().getWorkbenchWindow();
		this.cachedWorkbenchWindow.getPartService().addPartListener(this.partActivationListener);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.ISelectionListener#selectionChanged(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		this.setInput(part, selection);
	}

	/**
	 * Set the input of the page.
	 *
	 * @param part
	 *            The current workbench part
	 * @param selection
	 *            The current selection
	 */
	private void setInput(IWorkbenchPart part, ISelection selection) {
		if (selection.equals(currentSelection)) {
			return;
		}

		this.currentSelection = selection;

		// see if the selection provides a new contributor
		// validateRegistry(selection);
		List<IEEFTabDescriptor> descriptors = EEFTabbedPropertyRegistry.getDefault().getTabDescriptors();
		// If there are no descriptors for the given input we do not need to
		// touch the tab objects. We might reuse them for the next valid
		// input.
		if (descriptors.size() > 0) {
			this.updateTabs(descriptors);
		}
		// update tabs list
		this.tabbedPropertyViewer.setInput(part, currentSelection);
		int lastTabSelectionIndex = this.getLastTabSelection(part, currentSelection);
		Object selectedTab = this.tabbedPropertyViewer.getElementAt(lastTabSelectionIndex);
		this.selectionQueueLocked = true;
		try {
			if (selectedTab == null) {
				this.tabbedPropertyViewer.setSelection(null);
			} else {
				this.tabbedPropertyViewer.setSelection(new StructuredSelection(selectedTab));
			}
		} finally {
			this.selectionQueueLocked = false;
		}
	}

	/**
	 * Update the current tabs to represent the given input object. When tabs apply for both the old and new input they
	 * are reused otherwise they are disposed. If the current visible tab will not be reused (i.e. will be disposed) we
	 * have to send it an aboutToBeHidden() message.
	 *
	 * @param descriptors
	 *            The tab descriptors.
	 */
	protected void updateTabs(List<IEEFTabDescriptor> descriptors) {
		Map<IEEFTabDescriptor, EEFTabContents> newTabs = new HashMap<IEEFTabDescriptor, EEFTabContents>(descriptors.size() * 2);
		boolean disposingCurrentTab = this.currentTab != null;

		for (IEEFTabDescriptor descriptor : descriptors) {
			EEFTabContents tab = this.descriptorToTab.remove(descriptor);
			if (tab != null && tab.controlsHaveBeenCreated()) {
				if (tab == this.currentTab) {
					disposingCurrentTab = false;
				}
			} else {
				tab = this.createTab(descriptor);
			}

			newTabs.put(descriptor, tab);

		}

		if (disposingCurrentTab) {
			/**
			 * If the current tab is about to be disposed we have to call aboutToBeHidden
			 */
			this.currentTab.aboutToBeHidden();
			this.currentTab = null;
		}
		this.disposeTabs(this.descriptorToTab.values());
		this.descriptorToTab = newTabs;
	}

	/**
	 * Create the tab contents for the provided tab descriptor.
	 *
	 * @param tabDescriptor
	 *            the tab descriptor.
	 * @return the tab contents.
	 */
	protected EEFTabContents createTab(IEEFTabDescriptor tabDescriptor) {
		return tabDescriptor.createTab();
	}

	/**
	 * Returns the last known selected tab for the given input.
	 *
	 * @param part
	 *            The current workbench part
	 * @param input
	 *            The current selection
	 * @return The index of the currently selected tab (0, the first tab, by default)
	 */
	private int getLastTabSelection(IWorkbenchPart part, ISelection input) {
		List<IEEFTabDescriptor> descriptors = registry.getTabDescriptors(part, input);
		if (descriptors.size() != 0) {
			for (String text : this.selectionQueue) {
				int i = 0;
				for (IEEFTabDescriptor descriptor : descriptors) {
					if (text.equals(descriptor.getLabel())) {
						return i;
					}

					i = i + 1;
				}
			}
		}
		return 0;
	}

	/**
	 * Disposes the TabContents objects passed to this method. If the 'currentTab' is going to be disposed, then the
	 * caller should call aboutToBeHidden() on the currentTab and set it to null before calling this method. Also, the
	 * caller needs to ensure that descriptorToTab map entries corresponding to the disposed TabContents objects are
	 * also removed.
	 *
	 * @param tabs
	 *            The list of tabs
	 */
	protected void disposeTabs(Collection<EEFTabContents> tabs) {
		for (EEFTabContents tab : tabs) {
			Composite composite = tabToComposite.remove(tab);
			tab.dispose();
			if (composite != null) {
				composite.dispose();
			}
		}
	}

	/**
	 * Handle the part activated event.
	 *
	 * @param part
	 *            the new activated part.
	 */
	private void handlePartActivated(IWorkbenchPart part) {
		/*
		 * The properties view has been activated and the current page is this instance of TabbedPropertySheetPage
		 */
		boolean thisActivated = part instanceof PropertySheet && ((PropertySheet) part).getCurrentPage() == this;

		/*
		 * When the active part changes and the part does not provide a selection that affects this property sheet page,
		 * the PropertySheet does not send us a selectionChanged() event. We need to be informed of these events since
		 * we want to send aboutToBeHidden() and aboutToBeShown() when the property sheet is hidden or shown.
		 */
		IContributedContentsView view = null;
		if (!thisActivated && !part.equals(contributor) && !part.getSite().getId().equals(contributor.getContributorId())) {
			/*
			 * Is the part is a IContributedContentsView for the contributor, for example, outline view.
			 */
			view = part.getAdapter(IContributedContentsView.class);
		}

		if (view == null || (view.getContributingPart() != null && !view.getContributingPart().equals(contributor))) {
			if (this.activePropertySheet) {
				if (currentTab != null) {
					currentTab.aboutToBeHidden();
				}
				this.activePropertySheet = false;
			}
			return;
		}

		if (!this.activePropertySheet && currentTab != null) {
			currentTab.aboutToBeShown();
			currentTab.refresh();
		}
		this.activePropertySheet = true;
	}

	/**
	 * Handle the selection changed event.
	 *
	 * @param event
	 *            The selection changed event
	 */
	private void processSelectionChanged(SelectionChangedEvent event) {
		if (event.getSelection() instanceof IStructuredSelection
				&& ((IStructuredSelection) event.getSelection()).getFirstElement() instanceof IEEFTabDescriptor) {
			IEEFTabDescriptor descriptor = (IEEFTabDescriptor) ((IStructuredSelection) event.getSelection()).getFirstElement();
			EEFTabContents tab = null;

			if (descriptor == null) {
				// pretend the tab is empty.
				this.hideTab(this.currentTab);
			} else {
				// create tab if necessary
				// can not cache based on the id - tabs may have the same id,
				// but different section depending on the selection
				tab = this.descriptorToTab.get(descriptor);

				if (tab != this.currentTab) {
					this.hideTab(this.currentTab);
				}

				Composite tabComposite = this.tabToComposite.get(tab);
				if (tabComposite == null) {
					tabComposite = this.createTabComposite();
					tab.createControls(tabComposite, this);
					// tabAreaComposite.layout(true);
					this.tabToComposite.put(tab, tabComposite);
				}
				// force widgets to be resized
				tab.setInput(tabbedPropertyViewer.getWorkbenchPart(), (ISelection) tabbedPropertyViewer.getInput());

				// store tab selection
				this.storeCurrentTabSelection(descriptor.getLabel());

				if (tab != this.currentTab) {
					this.showTab(tab);
				}

				tab.refresh();
			}

			tabbedPropertyComposite.getTabComposite().layout(true);
			this.currentTab = tab;
			this.resizeScrolledComposite();

			if (descriptor != null) {
				this.handleTabSelection(descriptor);
			}
		}
	}

	/**
	 * Show the given tab.
	 *
	 * @param tab
	 *            The tab to show
	 */
	private void showTab(EEFTabContents tab) {
		if (tab != null) {
			Composite tabComposite = tabToComposite.get(tab);
			if (tabComposite != null) {
				/**
				 * the following method call order is important - do not change it or the widgets might be drawn
				 * incorrectly
				 */
				tabComposite.moveAbove(null);
				tab.aboutToBeShown();
				tabComposite.setVisible(true);
			}
		}
	}

	/**
	 * Hide the given tab.
	 *
	 * @param tab
	 *            The tab to hide
	 */
	private void hideTab(EEFTabContents tab) {
		if (tab != null) {
			Composite tabComposite = tabToComposite.get(tab);
			if (tabComposite != null) {
				tab.aboutToBeHidden();
				tabComposite.setVisible(false);
			}
		}
	}

	/**
	 * Create the composite for the tab.
	 *
	 * @return The composite to use for the new tab
	 */
	private Composite createTabComposite() {
		Composite result = this.widgetFactory.createComposite(tabbedPropertyComposite.getTabComposite(), SWT.NO_FOCUS);
		result.setVisible(false);
		result.setLayout(new FillLayout());
		FormData data = new FormData();
		data.top = new FormAttachment(0, 0);
		data.bottom = new FormAttachment(100, 0);
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(100, 0);
		result.setLayoutData(data);
		return result;
	}

	/**
	 * Stores the current tab label in the selection queue. Tab labels are used to carry the tab context from one input
	 * object to another. The queue specifies the selection priority. So if the first tab in the queue is not available
	 * for the input we try the second tab and so on. If none of the tabs are available we default to the first tab
	 * available for the input.
	 *
	 * @param label
	 *            The label of the currently selected tab.
	 */
	private void storeCurrentTabSelection(String label) {
		if (!selectionQueueLocked) {
			selectionQueue.remove(label);
			selectionQueue.add(0, label);
		}
	}

	/**
	 * Handle the tab selection.
	 *
	 * @param descriptor
	 *            The tab descriptor
	 */
	private void handleTabSelection(IEEFTabDescriptor descriptor) {
		if (selectionQueueLocked) {
			/*
			 * don't send tab selection events for non user changes.
			 */
			return;
		}
		for (IEEFTabSelectionListener listener : this.tabSelectionListeners) {
			listener.tabSelected(descriptor);
		}
	}

	/**
	 * Add a tab selection listener.
	 *
	 * @param listener
	 *            a tab selection listener.
	 */
	public void addTabSelectionListener(IEEFTabSelectionListener listener) {
		tabSelectionListeners.add(listener);
	}

	/**
	 * Remove a tab selection listener.
	 *
	 * @param listener
	 *            a tab selection listener.
	 */
	public void removeTabSelectionListener(IEEFTabSelectionListener listener) {
		tabSelectionListeners.remove(listener);
	}

	/**
	 * Resize the scrolled composite.
	 */
	private void resizeScrolledComposite() {
		Point currentTabSize = new Point(0, 0);
		if (this.currentTab != null) {
			Composite sizeReference = this.tabToComposite.get(this.currentTab);
			if (sizeReference != null) {
				currentTabSize = sizeReference.computeSize(SWT.DEFAULT, SWT.DEFAULT);
			}
		}
		this.tabbedPropertyComposite.getScrolledComposite().setMinSize(currentTabSize);

		ScrollBar verticalScrollBar = this.tabbedPropertyComposite.getScrolledComposite().getVerticalBar();
		if (verticalScrollBar != null) {
			Rectangle clientArea = this.tabbedPropertyComposite.getScrolledComposite().getClientArea();
			int increment = clientArea.height - 5;
			verticalScrollBar.setPageIncrement(increment);
		}

		ScrollBar horizontalScrollBar = this.tabbedPropertyComposite.getScrolledComposite().getHorizontalBar();
		if (horizontalScrollBar != null) {
			Rectangle clientArea = this.tabbedPropertyComposite.getScrolledComposite().getClientArea();
			int increment = clientArea.width - 5;
			horizontalScrollBar.setPageIncrement(increment);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.part.IPage#dispose()
	 */
	@Override
	public void dispose() {
		this.disposeContributor();
		this.widgetFactory.dispose();
	}

	/**
	 * Dispose the contributor with the provided contributor id. This happens on part close as well as when contributors
	 * switch between the workbench part and contributor from a selection.
	 */
	private void disposeContributor() {
		if (this.currentTab != null) {
			this.currentTab.aboutToBeHidden();
		}

		Collection<EEFTabContents> tabs = this.descriptorToTab.values();
		for (EEFTabContents tab : tabs) {
			Composite composite = this.tabToComposite.remove(tab);
			tab.dispose();
			if (composite != null) {
				composite.dispose();
			}
		}
		this.descriptorToTab = new HashMap<IEEFTabDescriptor, EEFTabContents>();
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.part.IPage#getControl()
	 */
	@Override
	public Control getControl() {
		return this.tabbedPropertyComposite;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.part.IPage#setActionBars(org.eclipse.ui.IActionBars)
	 */
	@Override
	public void setActionBars(IActionBars actionBars) {
		// do nothing for now
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.ui.part.IPage#setFocus()
	 */
	@Override
	public void setFocus() {
		this.getControl().setFocus();
	}

	/**
	 * Return the widgetFactory.
	 *
	 * @return the widgetFactory
	 */
	public EEFTabbedPropertySheetWidgetFactory getWidgetFactory() {
		return this.widgetFactory;
	}

}
