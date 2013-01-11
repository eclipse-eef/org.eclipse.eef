/*******************************************************************************
 * Copyright (c) 2008, 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.ui.widgets;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.impl.filters.business.BusinessViewerFilter;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.impl.utils.ModelViewerHelper;
import org.eclipse.emf.eef.runtime.impl.utils.PatternTool;
import org.eclipse.emf.eef.runtime.impl.utils.StringTools;
import org.eclipse.emf.eef.runtime.ui.comparator.EMFModelViewerComparator;
import org.eclipse.emf.eef.runtime.ui.utils.EEFRuntimeUIMessages;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.settings.EEFEditorSettings;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public abstract class EMFModelViewerDialog extends Dialog {

	protected TableViewer elements;

	protected ITableLabelProvider labelProvider;

	protected ILabelProvider labelProviderElement;

	private List<ViewerFilter> filters;

	private List<ViewerFilter> brFilters;

	private Button filteredContent;

	private List<Button> checkButtons;

	private Text fFilter;

	private boolean nullable;

	private boolean isMulti;

	protected Object input;

	private ViewerComparator comparator;

	private boolean customComparator;

	/**
	 * Constructor.
	 * 
	 * @param labelProvider
	 *            the label provider
	 * @param input
	 *            the contents
	 * @param filters
	 *            the content filters
	 * @param bpFilters
	 *            the business filters
	 * @param nullable
	 *            if the viewer can contains empty (null) value
	 * @param isMulti
	 *            if the selection can be unique or not
	 */
	public EMFModelViewerDialog(ILabelProvider labelProvider, Object input, List<ViewerFilter> filters,
			List<ViewerFilter> bpFilters, boolean nullable, boolean isMulti) {
		super(Display.getDefault().getActiveShell());
		this.labelProviderElement = labelProvider;
		this.filters = filters;
		this.brFilters = bpFilters;
		this.input = input;
		this.nullable = nullable;
		this.isMulti = isMulti;
		setShellStyle(SWT.CLOSE | SWT.TITLE | SWT.BORDER | SWT.APPLICATION_MODAL | SWT.RESIZE);
		customComparator = false;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets .Composite)
	 */
	protected Control createDialogArea(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		GridData gd = new GridData(GridData.FILL_BOTH);
		container.setLayoutData(gd);
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		container.setLayout(layout);
		fFilter = new Text(container, SWT.BORDER | SWT.FLAT);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		fFilter.setLayoutData(gd);
		fFilter.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				patternChanged(((Text)e.widget));
			}
		});
		fFilter.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.keyCode == SWT.ARROW_DOWN) {
					elements.getTable().setFocus();
				}
			}

		});
		if (isMulti)
			elements = new TableViewer(container, SWT.FULL_SELECTION | SWT.MULTI);
		else
			elements = new TableViewer(container, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER
					| SWT.FULL_SELECTION);
		GridData gd2 = new GridData(GridData.FILL_BOTH);

		elements.getTable().setLayoutData(gd2);

		// ADD EXTENSION: CNO
		final Table table = buildTable();

		if (input instanceof EEFEditorSettings) {
			EEFEditorContentProvider provider = new EEFEditorContentProvider();
			provider.kind = EEFEditorContentProvider.MATCHING_VALUES_KIND;
			elements.setContentProvider(provider);
		}
		if (labelProvider == null) {
			this.labelProvider = new AdapterFactoryLabelProvider(new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE)) {

				public String getColumnText(Object object, int columnIndex) {
					if (object instanceof EObject) {
						if (columnIndex == 0) {
							String result = ((EObject)object).eClass().getName();
							if (result == null || result == StringTools.EMPTY_STRING)
								return StringTools.EMPTY_STRING;
							if (result.equals("EClass")) { //$NON-NLS-1$
								return getColumnText(object, 1);
							}
							return result;
						}
						if (columnIndex == 1)
							return formatNomFWithLabelProvider(object);

					}
					return StringTools.EMPTY_STRING;
				}

				public Image getColumnImage(Object object, int columnIndex) {
					return null;
				}
			};
		}
		elements.setLabelProvider(labelProvider);
		if (!customComparator) {
			comparator = new EMFModelViewerComparator(labelProvider);
		}
		elements.setComparator(comparator);

		elements.addDoubleClickListener(new IDoubleClickListener() {

			public void doubleClick(DoubleClickEvent event) {
				okPressed();
			}

		});

		if (filters != null) {
			for (ViewerFilter filter : filters) {
				elements.addFilter(filter);
			}
		}
		// business rules
		checkButtons = new ArrayList<Button>();
		if (brFilters != null && !brFilters.isEmpty()) {
			String currentModel = EEFRuntimeUIMessages.EMFModelViewerDialog_current_model_filter_title;
			String referencedModels = EEFRuntimeUIMessages.EMFModelViewerDialog_referenced_models_filter_title;
			String differentContainer = EEFRuntimeUIMessages.EMFModelViewerDialog_different_container_filter_title;
			for (int i = 0; i < brFilters.size(); i++) {
				String filterName = null;
				if (brFilters.get(i) instanceof BusinessViewerFilter) {
					final BusinessViewerFilter viewerFilter = (BusinessViewerFilter)brFilters.get(i);

					filteredContent = new Button(container, SWT.CHECK);
					filterName = viewerFilter.getName();
					if (filterName != null) {
						filteredContent.setText(filterName);
					} else {
						filteredContent.setText(EEFRuntimeUIMessages.EMFModelViewerDialog_filter_name);
					}

					filteredContent.setData(viewerFilter);
					checkButtons.add(filteredContent);
				}

				// selection "contenu filtre"

				if (filterName != null && !filterName.equals(currentModel)
						&& !filterName.equals(referencedModels) && !filterName.equals(differentContainer)) {
					checkButtons.get(i).setSelection(true);
					elements.addFilter((ViewerFilter)checkButtons.get(i).getData());
					for (int j = 0; j < table.getColumns().length; j++) {
						table.getColumn(j).pack();
					}
				}
			}

			// selection listener for business rules
			for (final Button b : checkButtons) {
				b.addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent e) {
						if (b.getSelection() == false) {
							elements.removeFilter((ViewerFilter)b.getData());
						} else {
							elements.addFilter((ViewerFilter)b.getData());
						}
						for (int i = 0; i < table.getColumns().length; i++) {
							table.getColumn(i).pack();
						}
					}

				});
			}

		}
		elements.setInput(input);
		for (int i = 0; i < table.getColumns().length; i++) {
			table.getColumn(i).pack();
		}

		setFirstSelection();
		return parent;
	}

	/**
	 * @author cnotot
	 * @return Table
	 */
	protected Table buildTable() {

		final Table table = elements.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setSortDirection(SWT.DOWN);

		buildColumns(table);

		return table;

	}

	/**
	 * @author cnotot
	 * @param table
	 */
	protected void buildColumns(Table table) {

		addColumn(table, 0, EEFRuntimeUIMessages.EMFModelViewerDialog_type_column_title);
		addColumn(table, 1, EEFRuntimeUIMessages.EMFModelViewerDialog_name_column_title);

	}

	/**
	 * @author cnotot
	 * @param table
	 * @param index
	 * @param label
	 */
	protected void addColumn(final Table table, final int index, String label) {

		final TableColumn myPackage = new TableColumn(table, SWT.NONE);
		myPackage.setText(label);
		myPackage.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				((EMFModelViewerComparator)elements.getComparator()).doSort(index);
				elements.refresh();
				table.setSortColumn(myPackage);
				table.setSortDirection(changeSortDirection(table.getSortDirection()));
			}
		});

	}

	/**
	 * set the selection on opening the dialog
	 */
	private void setFirstSelection() {
		IStructuredSelection selection = ModelViewerHelper.getLastSelection();
		if (selection == null || selection.isEmpty()
				|| elements.testFindItem(selection.getFirstElement()) == null) {
			if (elements.getElementAt(0) != null) {
				elements.setSelection(new StructuredSelection(elements.getElementAt(0)));
			}
		} else {
			elements.setSelection(selection);
		}
	}

	private void setSelection() {
		ISelection selection = elements.getSelection();
		if (selection == null || selection.isEmpty()) {
			if (elements.getElementAt(0) != null) {
				elements.setSelection(new StructuredSelection(elements.getElementAt(0)));
			}
		}
	}

	protected int changeSortDirection(int sortDirection) {
		if (sortDirection == SWT.UP) {
			return SWT.DOWN;
		}
		if (sortDirection == SWT.DOWN) {
			return SWT.UP;
		}
		return SWT.UP;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	protected void okPressed() {
		if (elements.getSelection() instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection)elements.getSelection();
			if (selection.getFirstElement() instanceof EObject) {
				process(selection);
				ModelViewerHelper.setLastSelection(selection);
			} else if (nullable) {
				process(null);
				ModelViewerHelper.setLastSelection(null);
			}
		}
		super.okPressed();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#getInitialSize()
	 */
	protected Point getInitialSize() {
		Point point = super.getInitialSize();
		int width = point.x < 800 ? 800 : point.x;
		if (width > SWTUtils.getWidth())
			return new Point(SWTUtils.getWidth(), SWTUtils.getHeight());
		return new Point(width, SWTUtils.getHeight());
	}

	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		if (isMulti)
			shell.setText(EEFRuntimeUIMessages.EMFModelViewerDialog_multi_selection_title);
		else
			shell.setText(EEFRuntimeUIMessages.EMFModelViewerDialog_single_element_title);
	}

	public abstract void process(IStructuredSelection selection);

	protected void patternChanged(final Text text) {
		elements.addFilter(new ViewerFilter() {
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (text.getText() == null || text.getText().equals("")) //$NON-NLS-1$
					return true;
				else {
					String libelle = null;
					if (labelProviderElement != null) {
						libelle = formatNomFWithLabelProvider(element);
					} else {
						libelle = ModelViewerHelper.getName(element);
					}
					if (EEFUtils.isBundleLoaded(EEFUtils.JDT_CORE_SYMBOLIC_NAME))
						return PatternTool.getPattern(libelle, text.getText());
					else
						return text.getText() == null || text.getText().equals("") //$NON-NLS-1$
								|| libelle.startsWith(text.getText());
				}
			}
		});
		for (int i = 0; i < elements.getTable().getColumns().length; i++) {
			elements.getTable().getColumn(i).pack();
		}
		setSelection();
	}

	protected String formatNomFWithLabelProvider(Object element) {
		if (labelProviderElement == null)
			return StringTools.EMPTY_STRING;
		String result = labelProviderElement.getText(element);
		if (result == null)
			return StringTools.EMPTY_STRING;
		return result;
	}

	public void setComparator(ViewerComparator comparator) {
		this.comparator = comparator;
		customComparator = true;
	}
	
	
}
