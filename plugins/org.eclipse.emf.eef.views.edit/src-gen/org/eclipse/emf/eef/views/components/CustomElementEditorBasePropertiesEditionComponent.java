/**
 *  Copyright (c) 2008-2009 Obeo.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Obeo - initial API and implementation
 * 
 *
 */
package org.eclipse.emf.eef.views.components;

// Start of user code for imports

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesValidationEditionEvent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.util.EEFConverterUtil;
import org.eclipse.emf.eef.toolkits.Widget;
import org.eclipse.emf.eef.views.CustomElementEditor;
import org.eclipse.emf.eef.views.ViewsPackage;
import org.eclipse.emf.eef.views.parts.CustomElementEditorPropertiesEditionPart;
import org.eclipse.emf.eef.views.parts.ViewsViewsRepository;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

// End of user code

/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class CustomElementEditorBasePropertiesEditionComponent extends StandardPropertiesEditionComponent {

	public static String BASE_PART = "Base"; //$NON-NLS-1$

	private String[] parts = {BASE_PART};

	/**
	 * The EObject to edit
	 */
	private CustomElementEditor customElementEditor;

	/**
	 * The Base part
	 */
	protected CustomElementEditorPropertiesEditionPart basePart;

	/**
	 * Default constructor
	 */
	public CustomElementEditorBasePropertiesEditionComponent(EObject customElementEditor, String editing_mode) {
		if (customElementEditor instanceof CustomElementEditor) {
			this.customElementEditor = (CustomElementEditor)customElementEditor;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.customElementEditor.eAdapters().add(semanticAdapter);
			}
		}
		this.editing_mode = editing_mode;
	}

	/**
	 * Initialize the semantic model listener for live editing mode
	 * 
	 * @return the semantic model listener
	 */
	private AdapterImpl initializeSemanticAdapter() {
		return new EContentAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
			 */
			public void notifyChanged(final Notification msg) {
				if (basePart == null)
					CustomElementEditorBasePropertiesEditionComponent.this.dispose();
				else {
					Runnable updateRunnable = new Runnable() {
						public void run() {
							runUpdateRunnable(msg);
						}
					};
					if (null == Display.getCurrent()) {
						PlatformUI.getWorkbench().getDisplay().syncExec(updateRunnable);
					} else {
						updateRunnable.run();
					}
				}
			}

		};
	}

	/**
	 * Used to update the views
	 */
	protected void runUpdateRunnable(final Notification msg) {
		if (ViewsPackage.eINSTANCE.getViewElement_Representation().equals(msg.getFeature()) && basePart != null)
			basePart.setRepresentation((EObject)msg.getNewValue());
		if (ViewsPackage.eINSTANCE.getViewElement_Name().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
			} else {
				basePart.setName("");
			}
		}
		if (ViewsPackage.eINSTANCE.getElementEditor_ReadOnly().equals(msg.getFeature()) && basePart != null)
			basePart.setReadOnly((Boolean)msg.getNewValue());



	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#translatePart(java.lang.String)
	 */
	public java.lang.Class translatePart(String key) {
		if (BASE_PART.equals(key))
			return ViewsViewsRepository.CustomElementEditor.class;
		return super.translatePart(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#partsList()
	 */
	public String[] partsList() {
		return parts;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionPart
	 *  (java.lang.String, java.lang.String)
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (customElementEditor != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(ViewsViewsRepository.class);
				if (provider != null) {
					basePart = (CustomElementEditorPropertiesEditionPart)provider.getPropertiesEditionPart(ViewsViewsRepository.CustomElementEditor.class, kind, this);
					addListener((IPropertiesEditionListener)basePart);
				}
			}
			return (IPropertiesEditionPart)basePart;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#
	 *      setPropertiesEditionPart(java.lang.Class, int, org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 */
	public void setPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if (key == ViewsViewsRepository.CustomElementEditor.class)
			this.basePart = (CustomElementEditorPropertiesEditionPart) propertiesEditionPart;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Class, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	public void initPart(java.lang.Class key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (basePart != null && key == ViewsViewsRepository.CustomElementEditor.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			final CustomElementEditor customElementEditor = (CustomElementEditor)elt;
			// init values
			// init part
			basePart.initRepresentation(allResource, customElementEditor.getRepresentation());
			// set the button mode
			basePart.setRepresentationButtonMode(ButtonsModeEnum.BROWSE);
			if (customElementEditor.getName() != null)
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), customElementEditor.getName()));

			basePart.setReadOnly(customElementEditor.isReadOnly());

			// init filters
			basePart.addFilterToRepresentation(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof String && element.equals("")) || (element instanceof Widget); //$NON-NLS-1$ 

				}

			});
			// Start of user code for additional businessfilters for representation
			
			// End of user code


		}
		// init values for referenced views

		// init filters for referenced views

		setInitializing(false);
	}







	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionCommand
	 *     (org.eclipse.emf.edit.domain.EditingDomain)
	 */
	public CompoundCommand getPropertiesEditionCommand(EditingDomain editingDomain) {
		CompoundCommand cc = new CompoundCommand();
		if ((customElementEditor != null) && (basePart != null)) { 
			if (customElementEditor.eGet(ViewsPackage.eINSTANCE.getViewElement_Representation()) == null || !customElementEditor.eGet(ViewsPackage.eINSTANCE.getViewElement_Representation()).equals(basePart.getRepresentation())) {
				cc.append(SetCommand.create(editingDomain, customElementEditor, ViewsPackage.eINSTANCE.getViewElement_Representation(), basePart.getRepresentation()));
			}
			cc.append(SetCommand.create(editingDomain, customElementEditor, ViewsPackage.eINSTANCE.getViewElement_Name(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getName())));
			cc.append(SetCommand.create(editingDomain, customElementEditor, ViewsPackage.eINSTANCE.getElementEditor_ReadOnly(), basePart.getReadOnly()));



		}
		if (!cc.isEmpty())
			return cc;
		cc.append(IdentityCommand.INSTANCE);
		return cc;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionObject()
	 */
	public EObject getPropertiesEditionObject(EObject source) {
		if (source instanceof CustomElementEditor) {
			CustomElementEditor customElementEditorToUpdate = (CustomElementEditor)source;
			customElementEditorToUpdate.setRepresentation((Widget)basePart.getRepresentation());
			customElementEditorToUpdate.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getName()));

			customElementEditorToUpdate.setReadOnly(new Boolean(basePart.getReadOnly()).booleanValue());



			return customElementEditorToUpdate;
		}
		else
			return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		if (!isInitializing()) {
			Diagnostic valueDiagnostic = validateValue(event);
			if (PropertiesEditionEvent.COMMIT == event.getState() && IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode) && valueDiagnostic.getSeverity() == Diagnostic.OK) {
				CompoundCommand command = new CompoundCommand();
			if (ViewsViewsRepository.CustomElementEditor.representation == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, customElementEditor, ViewsPackage.eINSTANCE.getViewElement_Representation(), event.getNewValue()));
			if (ViewsViewsRepository.CustomElementEditor.name == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, customElementEditor, ViewsPackage.eINSTANCE.getViewElement_Name(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue())));
			}
			if (ViewsViewsRepository.CustomElementEditor.readOnly == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, customElementEditor, ViewsPackage.eINSTANCE.getElementEditor_ReadOnly(), event.getNewValue()));



				if (!command.isEmpty() && !command.canExecute()) {
					EEFRuntimePlugin.getDefault().logError("Cannot perform model change command.", null);
				} else {
					liveEditingDomain.getCommandStack().execute(command);
				}
			}
			if (valueDiagnostic.getSeverity() != Diagnostic.OK && valueDiagnostic instanceof BasicDiagnostic)
				super.firePropertiesChanged(new PropertiesValidationEditionEvent(event, valueDiagnostic));
			else {
				Diagnostic validate = validate();
				super.firePropertiesChanged(new PropertiesValidationEditionEvent(event, validate));
			}
			super.firePropertiesChanged(event);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.String, int)
	 */
	public boolean isRequired(String key, int kind) {
		return key == ViewsViewsRepository.CustomElementEditor.name || key == ViewsViewsRepository.CustomElementEditor.readOnly;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.String, int)
	 */
	public String getHelpContent(String key, int kind) {
		if (key == ViewsViewsRepository.CustomElementEditor.representation)
			return "The representation of this part of view"; //$NON-NLS-1$
		if (key == ViewsViewsRepository.CustomElementEditor.name)
			return "The element name"; //$NON-NLS-1$
		if (key == ViewsViewsRepository.CustomElementEditor.readOnly)
			return "Defines that this editor is in read only mode"; //$NON-NLS-1$
		return super.getHelpContent(key, kind);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			String newStringValue = event.getNewValue().toString();
			try {
				if (ViewsViewsRepository.CustomElementEditor.name == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ViewsPackage.eINSTANCE.getViewElement_Name().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ViewsPackage.eINSTANCE.getViewElement_Name().getEAttributeType(), newValue);
				}
				if (ViewsViewsRepository.CustomElementEditor.readOnly == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ViewsPackage.eINSTANCE.getElementEditor_ReadOnly().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ViewsPackage.eINSTANCE.getElementEditor_ReadOnly().getEAttributeType(), newValue);
				}

			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validate()
	 */
	public Diagnostic validate() {
		Diagnostic validate = Diagnostic.OK_INSTANCE;
		if (IPropertiesEditionComponent.BATCH_MODE.equals(editing_mode)) {
			EObject copy = EcoreUtil.copy(customElementEditor);
			copy = getPropertiesEditionObject(copy);
			validate =  EEFRuntimePlugin.getEEFValidator().validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			validate = EEFRuntimePlugin.getEEFValidator().validate(customElementEditor);
		// Start of user code for custom validation check
		
		// End of user code
		return validate;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#dispose()
	 */
	public void dispose() {
		if (semanticAdapter != null)
			customElementEditor.eAdapters().remove(semanticAdapter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getTabText(java.lang.String)
	 */
	public String getTabText(String p_key) {
		return basePart.getTitle();
	}
}
