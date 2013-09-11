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
package org.eclipse.emf.eef.extended.editor.parts.forms;

// Start of user code for imports
import org.eclipse.emf.eef.extended.editor.parts.EditorViewsRepository;
import org.eclipse.emf.eef.extended.editor.parts.TreeMasterPagePropertiesEditionPart;
import org.eclipse.emf.eef.extended.editor.providers.EditorMessages;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;


// End of user code

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen LeFur</a>
 * 
 */
public class TreeMasterPagePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TreeMasterPagePropertiesEditionPart {

	protected Text name;
	protected Text title_;
	protected Button toolbarVisible;



	/**
	 * For {@link ISection} use only.
	 */
	public TreeMasterPagePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TreeMasterPagePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence treeMasterPageStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep namingStep = treeMasterPageStep.addStep(EditorViewsRepository.TreeMasterPage.Naming.class);
		namingStep.addStep(EditorViewsRepository.TreeMasterPage.Naming.name);
		namingStep.addStep(EditorViewsRepository.TreeMasterPage.Naming.title_);
		
		treeMasterPageStep
			.addStep(EditorViewsRepository.TreeMasterPage.Settings.class)
			.addStep(EditorViewsRepository.TreeMasterPage.Settings.toolbarVisible);
		
		
		composer = new PartComposer(treeMasterPageStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EditorViewsRepository.TreeMasterPage.Naming.class) {
					return createNamingGroup(widgetFactory, parent);
				}
				if (key == EditorViewsRepository.TreeMasterPage.Naming.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == EditorViewsRepository.TreeMasterPage.Naming.title_) {
					return createTitle_Text(widgetFactory, parent);
				}
				if (key == EditorViewsRepository.TreeMasterPage.Settings.class) {
					return createSettingsGroup(widgetFactory, parent);
				}
				if (key == EditorViewsRepository.TreeMasterPage.Settings.toolbarVisible) {
					return createToolbarVisibleCheckbox(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createNamingGroup(FormToolkit widgetFactory, final Composite parent) {
		Section namingSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		namingSection.setText(EditorMessages.TreeMasterPagePropertiesEditionPart_NamingGroupLabel);
		GridData namingSectionData = new GridData(GridData.FILL_HORIZONTAL);
		namingSectionData.horizontalSpan = 3;
		namingSection.setLayoutData(namingSectionData);
		Composite namingGroup = widgetFactory.createComposite(namingSection);
		GridLayout namingGroupLayout = new GridLayout();
		namingGroupLayout.numColumns = 3;
		namingGroup.setLayout(namingGroupLayout);
		namingSection.setClient(namingGroup);
		return namingGroup;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EditorViewsRepository.TreeMasterPage.Naming.name, EditorMessages.TreeMasterPagePropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TreeMasterPagePropertiesEditionPartForm.this,
							EditorViewsRepository.TreeMasterPage.Naming.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TreeMasterPagePropertiesEditionPartForm.this,
									EditorViewsRepository.TreeMasterPage.Naming.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TreeMasterPagePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TreeMasterPagePropertiesEditionPartForm.this, EditorViewsRepository.TreeMasterPage.Naming.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, EditorViewsRepository.TreeMasterPage.Naming.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.TreeMasterPage.Naming.name, EditorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createTitle_Text(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EditorViewsRepository.TreeMasterPage.Naming.title_, EditorMessages.TreeMasterPagePropertiesEditionPart_Title_Label);
		title_ = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		title_.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData title_Data = new GridData(GridData.FILL_HORIZONTAL);
		title_.setLayoutData(title_Data);
		title_.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TreeMasterPagePropertiesEditionPartForm.this,
							EditorViewsRepository.TreeMasterPage.Naming.title_,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, title_.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TreeMasterPagePropertiesEditionPartForm.this,
									EditorViewsRepository.TreeMasterPage.Naming.title_,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, title_.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TreeMasterPagePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		title_.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TreeMasterPagePropertiesEditionPartForm.this, EditorViewsRepository.TreeMasterPage.Naming.title_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, title_.getText()));
				}
			}
		});
		EditingUtils.setID(title_, EditorViewsRepository.TreeMasterPage.Naming.title_);
		EditingUtils.setEEFtype(title_, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.TreeMasterPage.Naming.title_, EditorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createTitle_Text

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSettingsGroup(FormToolkit widgetFactory, final Composite parent) {
		Section settingsSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		settingsSection.setText(EditorMessages.TreeMasterPagePropertiesEditionPart_SettingsGroupLabel);
		GridData settingsSectionData = new GridData(GridData.FILL_HORIZONTAL);
		settingsSectionData.horizontalSpan = 3;
		settingsSection.setLayoutData(settingsSectionData);
		Composite settingsGroup = widgetFactory.createComposite(settingsSection);
		GridLayout settingsGroupLayout = new GridLayout();
		settingsGroupLayout.numColumns = 3;
		settingsGroup.setLayout(settingsGroupLayout);
		settingsSection.setClient(settingsGroup);
		return settingsGroup;
	}

	
	protected Composite createToolbarVisibleCheckbox(FormToolkit widgetFactory, Composite parent) {
		toolbarVisible = widgetFactory.createButton(parent, getDescription(EditorViewsRepository.TreeMasterPage.Settings.toolbarVisible, EditorMessages.TreeMasterPagePropertiesEditionPart_ToolbarVisibleLabel), SWT.CHECK);
		toolbarVisible.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TreeMasterPagePropertiesEditionPartForm.this, EditorViewsRepository.TreeMasterPage.Settings.toolbarVisible, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(toolbarVisible.getSelection())));
			}

		});
		GridData toolbarVisibleData = new GridData(GridData.FILL_HORIZONTAL);
		toolbarVisibleData.horizontalSpan = 2;
		toolbarVisible.setLayoutData(toolbarVisibleData);
		EditingUtils.setID(toolbarVisible, EditorViewsRepository.TreeMasterPage.Settings.toolbarVisible);
		EditingUtils.setEEFtype(toolbarVisible, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EditorViewsRepository.TreeMasterPage.Settings.toolbarVisible, EditorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createToolbarVisibleCheckbox

		// End of user code
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
	 * @see org.eclipse.emf.eef.extended.editor.parts.TreeMasterPagePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.TreeMasterPagePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EditorViewsRepository.TreeMasterPage.Naming.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(EditorMessages.TreeMasterPage_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.TreeMasterPagePropertiesEditionPart#getTitle_()
	 * 
	 */
	public String getTitle_() {
		return title_.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.TreeMasterPagePropertiesEditionPart#setTitle_(String newValue)
	 * 
	 */
	public void setTitle_(String newValue) {
		if (newValue != null) {
			title_.setText(newValue);
		} else {
			title_.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EditorViewsRepository.TreeMasterPage.Naming.title_);
		if (eefElementEditorReadOnlyState && title_.isEnabled()) {
			title_.setEnabled(false);
			title_.setToolTipText(EditorMessages.TreeMasterPage_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !title_.isEnabled()) {
			title_.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.TreeMasterPagePropertiesEditionPart#getToolbarVisible()
	 * 
	 */
	public Boolean getToolbarVisible() {
		return Boolean.valueOf(toolbarVisible.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.extended.editor.parts.TreeMasterPagePropertiesEditionPart#setToolbarVisible(Boolean newValue)
	 * 
	 */
	public void setToolbarVisible(Boolean newValue) {
		if (newValue != null) {
			toolbarVisible.setSelection(newValue.booleanValue());
		} else {
			toolbarVisible.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EditorViewsRepository.TreeMasterPage.Settings.toolbarVisible);
		if (eefElementEditorReadOnlyState && toolbarVisible.isEnabled()) {
			toolbarVisible.setEnabled(false);
			toolbarVisible.setToolTipText(EditorMessages.TreeMasterPage_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !toolbarVisible.isEnabled()) {
			toolbarVisible.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EditorMessages.TreeMasterPage_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
