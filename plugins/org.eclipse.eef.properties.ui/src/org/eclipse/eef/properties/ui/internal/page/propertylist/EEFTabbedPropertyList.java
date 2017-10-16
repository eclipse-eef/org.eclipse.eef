/*******************************************************************************
 * Copyright (c) 2001, 2016 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Mariot Chauvin <mariot.chauvin@obeo.fr> - bug 259553
 *     Amit Joglekar <joglekar@us.ibm.com> - Support for dynamic images (bug 385795)
 *     Obeo - Contribution to the EEF project
 *******************************************************************************/
package org.eclipse.eef.properties.ui.internal.page.propertylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.eef.common.ui.api.EEFWidgetFactory;
import org.eclipse.eef.properties.ui.api.IEEFTabItem;
import org.eclipse.eef.properties.ui.internal.Messages;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.accessibility.ACC;
import org.eclipse.swt.accessibility.Accessible;
import org.eclipse.swt.accessibility.AccessibleAdapter;
import org.eclipse.swt.accessibility.AccessibleEvent;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

/**
 * Shows the list of tabs in the tabbed property sheet page.
 *
 * @author Anthony Hunter
 * @author Stephane Begaudeau
 */

public class EEFTabbedPropertyList extends Composite {
	/**
	 * This constant is used to indicate NONE (for example the index of the currently selected tab).
	 */
	public static final int NONE = -1;

	/**
	 * The number of spaces used to indent a tab.
	 */
	public static final int INDENT = 7;

	/**
	 * The widget factory.
	 */
	private EEFWidgetFactory widgetFactory;

	/**
	 * The top navigation element.
	 */
	private EEFTopNavigationElement topNavigationElement;

	/**
	 * The bottom navigation element.
	 */
	private EEFBottomNavigationElement bottomNavigationElement;

	/**
	 * Boolean used to indicate if the list has the focus.
	 */
	private boolean focus;

	/**
	 * The index of the selected element.
	 */
	private int selectedElementIndex = NONE;

	/**
	 * The index of the widest label.
	 */
	private int widestLabelIndex = NONE;

	/**
	 * The index of the top visible element.
	 */
	private int topVisibleIndex = NONE;

	/**
	 * The index of the bottom visible element.
	 */
	private int bottomVisibleIndex = NONE;

	/**
	 * The elements displayed.
	 */
	private List<EEFListElement> elements = new ArrayList<EEFListElement>();

	/**
	 * The color holder.
	 */
	private EEFTabbedPropertyListColorHolder colorHolder;

	/**
	 * The number of tabs that can fit in the composite.
	 */
	private int tabsThatFitInComposite;

	/**
	 * This map specifies the number of dynamic images for a tab. It has a ITabItem as key and number of dynamic images
	 * for the tab as value. It is set using the setDynamicImageCount() method. It is used to calculate the width of the
	 * widest tab by setting aside enough space for displaying the dynamic images. Individual dynamic images are
	 * displayed/removed from a tab by using the showDynamicImage() and hideDynamicImage() methods on the tab's
	 * ListElement object.
	 */
	private Map<IEEFTabItem, Integer> tabToDynamicImageCountMap = new HashMap<IEEFTabItem, Integer>();

	/**
	 * The constructor.
	 *
	 * @param parent
	 *            The parent composite
	 * @param widgetFactory
	 *            The widget factory
	 */
	public EEFTabbedPropertyList(Composite parent, EEFWidgetFactory widgetFactory) {
		super(parent, SWT.NO_FOCUS);
		this.widgetFactory = widgetFactory;

		this.removeAll();

		this.setLayout(new FormLayout());
		this.initColors();
		this.initAccessible();
		this.topNavigationElement = new EEFTopNavigationElement(this);
		this.bottomNavigationElement = new EEFBottomNavigationElement(this);
		this.initListeners();
	}

	/**
	 * Remove all the elements from this list.
	 */
	public void removeAll() {
		if (this.elements != null) {
			for (EEFListElement element : elements) {
				element.dispose();
			}
		}
		this.elements = new ArrayList<EEFListElement>();
		this.selectedElementIndex = NONE;
		this.widestLabelIndex = NONE;
		this.topVisibleIndex = NONE;
		this.bottomVisibleIndex = NONE;
	}

	/**
	 * Initialize all the colors.
	 */
	private void initColors() {
		this.colorHolder = new EEFTabbedPropertyListColorHolder(this.widgetFactory);
	}

	/**
	 * Calculate the number of tabs that will fit in the tab list composite.
	 */
	@SuppressWarnings({ "checkstyle:magicnumber" })
	protected void computeTabsThatFitInComposite() {
		tabsThatFitInComposite = Math.round((getSize().y - 22) / getTabHeight());
		if (tabsThatFitInComposite <= 0) {
			tabsThatFitInComposite = 1;
		}
	}

	/**
	 * Get the height of a tab. The height of the tab is the height of the text plus buffer.
	 *
	 * @return the height of a tab.
	 */
	@SuppressWarnings({ "checkstyle:magicnumber" })
	private int getTabHeight() {
		int tabHeight = getTextDimension("").y + INDENT; //$NON-NLS-1$
		if (tabsThatFitInComposite == 1) {
			/*
			 * if only one tab will fix, reduce the size of the tab height so that the navigation elements fit.
			 */
			int ret = getBounds().height - 20;

			int result = ret;
			if (ret > tabHeight) {
				result = tabHeight;
			} else if (ret < 5) {
				result = 5;
			}
			return result;
		}
		return tabHeight;
	}

	/**
	 * Get the dimensions of the provided string.
	 *
	 * @param text
	 *            the string.
	 * @return the dimensions of the provided string.
	 */
	private Point getTextDimension(String text) {
		GC gc = new GC(this);
		gc.setFont(JFaceResources.getFontRegistry().getBold(JFaceResources.DEFAULT_FONT));
		Point point = gc.textExtent(text);
		point.x++;
		gc.dispose();
		return point;
	}

	/**
	 * Returns the number of elements in this list viewer.
	 *
	 * @return number of elements
	 */
	public int getNumberOfElements() {
		return elements.size();
	}

	/**
	 * Returns the element with the given index from this list viewer. Returns <code>null</code> if the index is out of
	 * range.
	 *
	 * @param index
	 *            the zero-based index
	 * @return the element at the given index, or <code>null</code> if the index is out of range
	 */
	public EEFListElement getElementAt(int index) {
		if (index >= 0 && index < elements.size()) {
			return elements.get(index);
		}
		return null;
	}

	/**
	 * Returns the zero-relative index of the item which is currently selected in the receiver, or -1 if no item is
	 * selected.
	 *
	 * @return the index of the selected item
	 */
	public int getSelectionIndex() {
		return selectedElementIndex;
	}

	/**
	 * Returns zero-relative index of the widest item, or -1 if this list is empty.
	 *
	 * @return zero-relative index of the widest item, or -1 if this list is empty.
	 */
	public int getWidestLabelIndex() {
		return widestLabelIndex;
	}

	/**
	 * Sets a map containing an IEEFTabItem as key and number of dynamic images as value. It is used to calculate the
	 * width of the widest tab by setting aside enough space (16 pixels per image) for displaying the dynamic images.
	 * Individual dynamic images are displayed/removed from a tab by using the showDynamicImage() and hideDynamicImage()
	 * methods on the tab's ListElement object.
	 *
	 * @param map
	 *            The new map of tabs to dynamic image count
	 */
	public void setDynamicImageCount(Map<IEEFTabItem, Integer> map) {
		this.tabToDynamicImageCountMap = map;
	}

	/**
	 * Sets the new list elements.
	 *
	 * @param children
	 *            The children
	 */
	public void setElements(Object[] children) {
		if (elements.size() != 0) {
			removeAll();
		}
		elements = new ArrayList<EEFListElement>(children.length);
		if (children.length == 0) {
			widestLabelIndex = NONE;
		} else {
			widestLabelIndex = 0;
			for (int i = 0; i < children.length; i++) {
				int dynamicImageCount = 0;
				if (tabToDynamicImageCountMap != null && tabToDynamicImageCountMap.containsKey(children[i])) {
					dynamicImageCount = tabToDynamicImageCountMap.get(children[i]).intValue();
				}
				EEFListElement element = new EEFListElement(this, (IEEFTabItem) children[i], dynamicImageCount, i, this);
				element.setVisible(false);
				element.setLayoutData(null);

				elements.add(element);

				if (i != widestLabelIndex) {
					int width = getTabWidth((IEEFTabItem) children[i]);
					if (width > getTabWidth((IEEFTabItem) children[widestLabelIndex])) {
						widestLabelIndex = i;
					}
				}
			}
		}

		computeTopAndBottomTab();
	}

	/**
	 *
	 * Returns the width of the tab.
	 *
	 * @param tabItem
	 *            The tab
	 * @return The width of the tab
	 */
	@SuppressWarnings({ "checkstyle:magicnumber" })
	private int getTabWidth(IEEFTabItem tabItem) {
		int width = getTextDimension(tabItem.getText()).x;
		/*
		 * To anticipate for the icon placement we should always keep the space available after the label. So when the
		 * active tab includes an icon the width of the tab doesn't change.
		 */
		if (tabItem.getImage() != null) {
			width = width + 16 + 4;
		}
		if (tabItem.isIndented()) {
			width = width + INDENT;
		}
		if (tabToDynamicImageCountMap != null) {
			int dynamicImageCount = 0;
			if (tabToDynamicImageCountMap.containsKey(tabItem)) {
				dynamicImageCount = tabToDynamicImageCountMap.get(tabItem).intValue();
			}
			if (dynamicImageCount > 0) {
				/*
				 * Keep some space between tab's text and first dynamic image
				 */
				width = width + 4;
				width = width + (dynamicImageCount * 16);
				/*
				 * Keep some space between consecutive dynamic images
				 */
				width = width + ((dynamicImageCount - 1) * 3);
			}
		}
		return width;
	}

	/**
	 * Selects one of the elements in the list.
	 *
	 * @param index
	 *            the index of the element to select.
	 */
	public void select(int index) {
		if (getSelectionIndex() == index) {
			/*
			 * this index is already selected.
			 */
			return;
		}
		if (index >= 0 && index < elements.size()) {
			int lastSelected = getSelectionIndex();
			elements.get(index).setSelected(true);
			selectedElementIndex = index;
			if (lastSelected != NONE) {
				elements.get(lastSelected).setSelected(false);
				if (getSelectionIndex() != elements.size() - 1) {
					/*
					 * redraw the next tab to fix the border by calling setSelected()
					 */
					elements.get(getSelectionIndex() + 1).setSelected(false);
				}
			}
			topNavigationElement.redraw();
			bottomNavigationElement.redraw();

			if (selectedElementIndex < topVisibleIndex || selectedElementIndex > bottomVisibleIndex) {
				computeTopAndBottomTab();
			}
		}
		notifyListeners(SWT.Selection, new Event());
	}

	/**
	 * Deselects all the elements in the list.
	 */
	public void deselectAll() {
		if (getSelectionIndex() != NONE) {
			elements.get(getSelectionIndex()).setSelected(false);
			selectedElementIndex = NONE;
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.swt.widgets.Composite#computeSize(int, int, boolean)
	 */
	@Override
	public Point computeSize(int wHint, int hHint, boolean changed) {
		Point result = super.computeSize(hHint, wHint, changed);
		if (widestLabelIndex == -1) {
			String propertiesNotAvailable = Messages.EEFTabbedPropertyList_propertiesNotAvailable;
			result.x = getTextDimension(propertiesNotAvailable).x + INDENT;
		} else {
			/*
			 * Add INDENT pixels to the left of the longest tab as a margin.
			 */
			int width = getTabWidth(elements.get(widestLabelIndex).getTabItem()) + INDENT;
			/*
			 * Add 10 pixels to the right of the longest tab as a margin.
			 */
			result.x = width + 10;
		}
		return result;
	}

	/**
	 * Determine if a downward scrolling is required.
	 *
	 * @return true if downward scrolling is required.
	 */
	public boolean isDownScrollRequired() {
		return elements.size() > tabsThatFitInComposite && bottomVisibleIndex != elements.size() - 1;
	}

	/**
	 * Determine if an upward scrolling is required.
	 *
	 * @return true if upward scrolling is required.
	 */
	public boolean isUpScrollRequired() {
		return elements.size() > tabsThatFitInComposite && topVisibleIndex != 0;
	}

	/**
	 * Compute the top and bottom tab.
	 */
	private void computeTopAndBottomTab() {
		computeTabsThatFitInComposite();
		if (elements.size() == 0) {
			/*
			 * no tabs to display.
			 */
			topVisibleIndex = 0;
			bottomVisibleIndex = 0;
		} else if (tabsThatFitInComposite >= elements.size()) {
			/*
			 * all the tabs fit.
			 */
			topVisibleIndex = 0;
			bottomVisibleIndex = elements.size() - 1;
		} else if (getSelectionIndex() == NONE) {
			/*
			 * there is no selected tab yet, assume that tab one would be selected for now.
			 */
			topVisibleIndex = 0;
			bottomVisibleIndex = tabsThatFitInComposite - 1;
		} else if (getSelectionIndex() + tabsThatFitInComposite > elements.size()) {
			/*
			 * the selected tab is near the bottom.
			 */
			bottomVisibleIndex = elements.size() - 1;
			topVisibleIndex = bottomVisibleIndex - tabsThatFitInComposite + 1;
		} else {
			/*
			 * the selected tab is near the top.
			 */
			topVisibleIndex = selectedElementIndex;
			bottomVisibleIndex = selectedElementIndex + tabsThatFitInComposite - 1;
		}
		layoutTabs();
	}

	/**
	 * Layout the tabs.
	 */
	public void layoutTabs() {
		// System.out.println("TabFit " + tabsThatFitInComposite + " length "
		// + elements.length + " top " + topVisibleIndex + " bottom "
		// + bottomVisibleIndex);
		if (tabsThatFitInComposite == NONE || elements.size() == 0) {
			FormData formData = new FormData();
			formData.left = new FormAttachment(0, 0);
			formData.right = new FormAttachment(100, 0);
			formData.top = new FormAttachment(0, 0);
			formData.height = getTabHeight();
			topNavigationElement.setLayoutData(formData);

			formData = new FormData();
			formData.left = new FormAttachment(0, 0);
			formData.right = new FormAttachment(100, 0);
			formData.top = new FormAttachment(topNavigationElement, 0);
			formData.bottom = new FormAttachment(100, 0);
			bottomNavigationElement.setLayoutData(formData);
		} else {

			FormData formData = new FormData();
			formData.left = new FormAttachment(0, 0);
			formData.right = new FormAttachment(100, 0);
			formData.top = new FormAttachment(0, 0);
			formData.height = 10;
			topNavigationElement.setLayoutData(formData);

			/*
			 * use nextElement to attach the layout to the previous canvas widget in the list.
			 */
			Canvas nextElement = topNavigationElement;

			for (int i = 0; i < elements.size(); i++) {
				// System.out.print(i + " [" + elements[i].getText() + "]");
				if (i < topVisibleIndex || i > bottomVisibleIndex) {
					/*
					 * this tab is not visible
					 */
					elements.get(i).setLayoutData(null);
					elements.get(i).setVisible(false);
				} else {
					/*
					 * this tab is visible.
					 */
					// System.out.print(" visible");
					formData = new FormData();
					formData.height = getTabHeight();
					formData.left = new FormAttachment(0, 0);
					formData.right = new FormAttachment(100, 0);
					formData.top = new FormAttachment(nextElement, 0);
					nextElement = elements.get(i);
					elements.get(i).setLayoutData(formData);
					elements.get(i).setVisible(true);
				}

				// if (i == selectedElementIndex) {
				// System.out.print(" selected");
				// }
				// System.out.println("");
			}
			formData = new FormData();
			formData.left = new FormAttachment(0, 0);
			formData.right = new FormAttachment(100, 0);
			formData.top = new FormAttachment(nextElement, 0);
			formData.bottom = new FormAttachment(100, 0);
			formData.height = 10;
			bottomNavigationElement.setLayoutData(formData);
		}
		// System.out.println("");

		// layout so that we have enough space for the new labels
		Composite grandparent = getParent().getParent();
		grandparent.layout(true);
		layout(true);
	}

	public EEFTabbedPropertyListColorHolder getColorHolder() {
		return this.colorHolder;
	}

	/**
	 * Return the topVisibleIndex.
	 *
	 * @return the topVisibleIndex
	 */
	public int getTopVisibleIndex() {
		return this.topVisibleIndex;
	}

	/**
	 * Sets the topVisibleIndex.
	 *
	 * @param topVisibleIndex
	 *            the topVisibleIndex to set
	 */
	public void setTopVisibleIndex(int topVisibleIndex) {
		this.topVisibleIndex = topVisibleIndex;
	}

	/**
	 * Return the bottomVisibleIndex.
	 *
	 * @return the bottomVisibleIndex
	 */
	public int getBottomVisibleIndex() {
		return this.bottomVisibleIndex;
	}

	/**
	 * Sets the bottomVisibleIndex.
	 *
	 * @param bottomVisibleIndex
	 *            the bottomVisibleIndex to set
	 */
	public void setBottomVisibleIndex(int bottomVisibleIndex) {
		this.bottomVisibleIndex = bottomVisibleIndex;
	}

	/**
	 * Return the topNavigationElement.
	 *
	 * @return the topNavigationElement
	 */
	public EEFTopNavigationElement getTopNavigationElement() {
		return this.topNavigationElement;
	}

	/**
	 * Return the bottomNavigationElement.
	 *
	 * @return the bottomNavigationElement
	 */
	public EEFBottomNavigationElement getBottomNavigationElement() {
		return this.bottomNavigationElement;
	}

	/**
	 * Return the focus.
	 *
	 * @return the focus
	 */
	public boolean getFocus() {
		return this.focus;
	}

	/**
	 * Sets the focus.
	 *
	 * @param focus
	 *            the focus to set
	 */
	public void setFocus(boolean focus) {
		this.focus = focus;
	}

	/**
	 * Initialize the accessibility behavior.
	 */
	private void initAccessible() {
		final Accessible accessible = this.getAccessible();
		accessible.addAccessibleListener(new AccessibleAdapter() {
			@Override
			public void getName(AccessibleEvent event) {
				int index = EEFTabbedPropertyList.this.getSelectionIndex();
				if (index != NONE) {
					event.result = EEFTabbedPropertyList.this.elements.get(index).getTabItem().getText();
				}
			}

			@Override
			public void getHelp(AccessibleEvent event) {
				int index = EEFTabbedPropertyList.this.getSelectionIndex();
				if (index != NONE) {
					event.result = EEFTabbedPropertyList.this.elements.get(index).getTabItem().getText();
				}
			}
		});

		accessible.addAccessibleControlListener(new EEFAccessibleControlAdapter(this));

		this.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				if (EEFTabbedPropertyList.this.isFocusControl()) {
					accessible.setFocus(ACC.CHILDID_SELF);
				}
			}
		});

		this.addListener(SWT.FocusIn, new Listener() {
			@Override
			public void handleEvent(Event event) {
				accessible.setFocus(ACC.CHILDID_SELF);
			}
		});
	}

	/**
	 * Initialize the listener of the property list.
	 */
	private void initListeners() {
		this.addFocusListener(new EEFPropertyListFocusListener(this));

		this.addControlListener(new ControlAdapter() {
			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.ControlAdapter#controlResized(org.eclipse.swt.events.ControlEvent)
			 */
			@Override
			public void controlResized(ControlEvent e) {
				EEFTabbedPropertyList.this.computeTopAndBottomTab();
			}
		});

		this.addTraverseListener(new TraverseListener() {
			@Override
			public void keyTraversed(TraverseEvent event) {
				if (event.detail == SWT.TRAVERSE_ARROW_PREVIOUS || event.detail == SWT.TRAVERSE_ARROW_NEXT) {
					int nMax = elements.size() - 1;
					int nCurrent = EEFTabbedPropertyList.this.getSelectionIndex();
					if (event.detail == SWT.TRAVERSE_ARROW_PREVIOUS) {
						nCurrent -= 1;
						nCurrent = Math.max(0, nCurrent);
					} else if (event.detail == SWT.TRAVERSE_ARROW_NEXT) {
						nCurrent += 1;
						nCurrent = Math.min(nCurrent, nMax);
					}
					EEFTabbedPropertyList.this.select(nCurrent);
					EEFTabbedPropertyList.this.redraw();
				} else {
					event.doit = true;
				}
			}
		});
	}

}
