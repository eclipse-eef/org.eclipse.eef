/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.eefnr.filters.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.eefnr.filters.parts.ConcreteReferenceOwnerSamplePropertiesEditionPart;
import org.eclipse.emf.eef.eefnr.filters.parts.FiltersViewsRepository;
import org.eclipse.emf.eef.eefnr.filters.providers.FiltersMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.utils.SWTUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;


// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 * 
 */
public class ConcreteReferenceOwnerSamplePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ConcreteReferenceOwnerSamplePropertiesEditionPart {

	protected Text name;
	protected ReferencesTable abstractTarget;
	protected List<ViewerFilter> abstractTargetBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> abstractTargetFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable strictTyping;
	protected List<ViewerFilter> strictTypingBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> strictTypingFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ConcreteReferenceOwnerSamplePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence concreteReferenceOwnerSampleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = concreteReferenceOwnerSampleStep.addStep(FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.class);
		propertiesStep.addStep(FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.name);
		propertiesStep.addStep(FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.abstractTarget);
		propertiesStep.addStep(FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.strictTyping);
		
		
		composer = new PartComposer(concreteReferenceOwnerSampleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.name) {
					return createNameText(parent);
				}
				if (key == FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.abstractTarget) {
					return createAbstractTargetAdvancedReferencesTable(parent);
				}
				if (key == FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.strictTyping) {
					return createStrictTypingAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(FiltersMessages.ConcreteReferenceOwnerSamplePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.name, FiltersMessages.ConcreteReferenceOwnerSamplePropertiesEditionPart_NameLabel);
		name = SWTUtil.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConcreteReferenceOwnerSamplePropertiesEditionPartImpl.this, FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConcreteReferenceOwnerSamplePropertiesEditionPartImpl.this, FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.name, FiltersViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createAbstractTargetAdvancedReferencesTable(Composite parent) {
		String label = getDescription(FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.abstractTarget, FiltersMessages.ConcreteReferenceOwnerSamplePropertiesEditionPart_AbstractTargetLabel);		 
		this.abstractTarget = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addAbstractTarget(); }
			public void handleEdit(EObject element) { editAbstractTarget(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveAbstractTarget(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromAbstractTarget(element); }
			public void navigateTo(EObject element) { }
		});
		this.abstractTarget.setHelpText(propertiesEditionComponent.getHelpContent(FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.abstractTarget, FiltersViewsRepository.SWT_KIND));
		this.abstractTarget.createControls(parent);
		this.abstractTarget.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConcreteReferenceOwnerSamplePropertiesEditionPartImpl.this, FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.abstractTarget, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData abstractTargetData = new GridData(GridData.FILL_HORIZONTAL);
		abstractTargetData.horizontalSpan = 3;
		this.abstractTarget.setLayoutData(abstractTargetData);
		this.abstractTarget.disableMove();
		abstractTarget.setID(FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.abstractTarget);
		abstractTarget.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addAbstractTarget() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(abstractTarget.getInput(), abstractTargetFilters, abstractTargetBusinessFilters,
		"abstractTarget", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConcreteReferenceOwnerSamplePropertiesEditionPartImpl.this, FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.abstractTarget,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				abstractTarget.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveAbstractTarget(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConcreteReferenceOwnerSamplePropertiesEditionPartImpl.this, FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.abstractTarget, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		abstractTarget.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromAbstractTarget(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConcreteReferenceOwnerSamplePropertiesEditionPartImpl.this, FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.abstractTarget, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		abstractTarget.refresh();
	}

	/**
	 * 
	 */
	protected void editAbstractTarget(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				abstractTarget.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createStrictTypingAdvancedTableComposition(Composite parent) {
		this.strictTyping = new ReferencesTable(getDescription(FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.strictTyping, FiltersMessages.ConcreteReferenceOwnerSamplePropertiesEditionPart_StrictTypingLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConcreteReferenceOwnerSamplePropertiesEditionPartImpl.this, FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.strictTyping, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				strictTyping.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConcreteReferenceOwnerSamplePropertiesEditionPartImpl.this, FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.strictTyping, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				strictTyping.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConcreteReferenceOwnerSamplePropertiesEditionPartImpl.this, FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.strictTyping, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				strictTyping.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConcreteReferenceOwnerSamplePropertiesEditionPartImpl.this, FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.strictTyping, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				strictTyping.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.strictTypingFilters) {
			this.strictTyping.addFilter(filter);
		}
		this.strictTyping.setHelpText(propertiesEditionComponent.getHelpContent(FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.strictTyping, FiltersViewsRepository.SWT_KIND));
		this.strictTyping.createControls(parent);
		this.strictTyping.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConcreteReferenceOwnerSamplePropertiesEditionPartImpl.this, FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.strictTyping, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData strictTypingData = new GridData(GridData.FILL_HORIZONTAL);
		strictTypingData.horizontalSpan = 3;
		this.strictTyping.setLayoutData(strictTypingData);
		this.strictTyping.setLowerBound(0);
		this.strictTyping.setUpperBound(-1);
		strictTyping.setID(FiltersViewsRepository.ConcreteReferenceOwnerSample.Properties.strictTyping);
		strictTyping.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.ConcreteReferenceOwnerSamplePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.ConcreteReferenceOwnerSamplePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.ConcreteReferenceOwnerSamplePropertiesEditionPart#initAbstractTarget(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initAbstractTarget(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		abstractTarget.setContentProvider(contentProvider);
		abstractTarget.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.ConcreteReferenceOwnerSamplePropertiesEditionPart#updateAbstractTarget()
	 * 
	 */
	public void updateAbstractTarget() {
	abstractTarget.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.ConcreteReferenceOwnerSamplePropertiesEditionPart#addFilterAbstractTarget(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAbstractTarget(ViewerFilter filter) {
		abstractTargetFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.ConcreteReferenceOwnerSamplePropertiesEditionPart#addBusinessFilterAbstractTarget(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAbstractTarget(ViewerFilter filter) {
		abstractTargetBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.ConcreteReferenceOwnerSamplePropertiesEditionPart#isContainedInAbstractTargetTable(EObject element)
	 * 
	 */
	public boolean isContainedInAbstractTargetTable(EObject element) {
		return ((ReferencesTableSettings)abstractTarget.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.ConcreteReferenceOwnerSamplePropertiesEditionPart#initStrictTyping(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initStrictTyping(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		strictTyping.setContentProvider(contentProvider);
		strictTyping.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.ConcreteReferenceOwnerSamplePropertiesEditionPart#updateStrictTyping()
	 * 
	 */
	public void updateStrictTyping() {
	strictTyping.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.ConcreteReferenceOwnerSamplePropertiesEditionPart#addFilterStrictTyping(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStrictTyping(ViewerFilter filter) {
		strictTypingFilters.add(filter);
		if (this.strictTyping != null) {
			this.strictTyping.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.ConcreteReferenceOwnerSamplePropertiesEditionPart#addBusinessFilterStrictTyping(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStrictTyping(ViewerFilter filter) {
		strictTypingBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.filters.parts.ConcreteReferenceOwnerSamplePropertiesEditionPart#isContainedInStrictTypingTable(EObject element)
	 * 
	 */
	public boolean isContainedInStrictTypingTable(EObject element) {
		return ((ReferencesTableSettings)strictTyping.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FiltersMessages.ConcreteReferenceOwnerSample_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
