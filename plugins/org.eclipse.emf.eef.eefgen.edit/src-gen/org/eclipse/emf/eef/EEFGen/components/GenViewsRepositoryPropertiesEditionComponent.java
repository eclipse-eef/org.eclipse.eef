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
 * $Id: GenViewsRepositoryPropertiesEditionComponent.java,v 1.3 2009/05/18 16:08:57 sbouchet Exp $
 */
package org.eclipse.emf.eef.EEFGen.components;

// Start of user code for imports

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.EEFGen.EEFGenPackage;
import org.eclipse.emf.eef.EEFGen.GenViewsRepository;
import org.eclipse.emf.eef.EEFGen.HELP_STRATEGY;
import org.eclipse.emf.eef.EEFGen.parts.EEFGenViewsRepository;
import org.eclipse.emf.eef.EEFGen.parts.GenViewsRepositoryPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesContextService;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.views.ViewsRepository;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

// End of user code
/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class GenViewsRepositoryPropertiesEditionComponent extends StandardPropertiesEditionComponent {

	public static String BASE_PART = "Base"; //$NON-NLS-1$
	
	private String[] parts = {BASE_PART};
	
	/**
	 * The EObject to edit
	 */
	private GenViewsRepository genViewsRepository;
	
	/**
	 * The Base part
	 */
	private GenViewsRepositoryPropertiesEditionPart basePart;
	
	/**
	 * Default constructor
	 */
	public GenViewsRepositoryPropertiesEditionComponent(EObject genViewsRepository, String editing_mode) {
		if (genViewsRepository instanceof GenViewsRepository) {
			this.genViewsRepository = (GenViewsRepository)genViewsRepository;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.genViewsRepository.eAdapters().add(semanticAdapter);
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
			public void notifyChanged(Notification msg) {
				if (EEFGenPackage.eINSTANCE.getGenViewsRepository_BasePackage().equals(msg.getFeature()) && basePart != null)
					basePart.setBasePackage((String)msg.getNewValue());

				if (EEFGenPackage.eINSTANCE.getGenViewsRepository_SwtViews().equals(msg.getFeature()) && basePart != null)
					basePart.setSwtViews((Boolean)msg.getNewValue());

				if (EEFGenPackage.eINSTANCE.getGenViewsRepository_FormViews().equals(msg.getFeature()) && basePart != null)
					basePart.setFormViews((Boolean)msg.getNewValue());

				if (EEFGenPackage.eINSTANCE.getGenViewsRepository_HelpStrategy().equals(msg.getFeature()) && basePart != null)
					basePart.setHelpStrategy((Enumerator)msg.getNewValue());

				if (EEFGenPackage.eINSTANCE.getGenViewsRepository_ViewsRepository().equals(msg.getFeature()) && basePart != null)
					basePart.setViewsRepository((EObject)msg.getNewValue());


			}

		};
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#translatePart(java.lang.String)
	 */
	public java.lang.Class translatePart(String key) {
		if (BASE_PART.equals(key))
			return EEFGenViewsRepository.GenViewsRepository.class;
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
	 * (java.lang.String, java.lang.String)
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (genViewsRepository != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(EEFGenViewsRepository.class);
				if (provider != null) {
					basePart = (GenViewsRepositoryPropertiesEditionPart)provider.getPropertiesEditionPart(EEFGenViewsRepository.GenViewsRepository.class, kind, this);
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
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Class, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	public void initPart(java.lang.Class key, int kind, EObject elt, ResourceSet allResource) {
		if (basePart != null && key == EEFGenViewsRepository.GenViewsRepository.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			GenViewsRepository genViewsRepository = (GenViewsRepository)elt;
			// init values
			if (genViewsRepository.getBasePackage() != null)
				basePart.setBasePackage(genViewsRepository.getBasePackage());

			basePart.setSwtViews(genViewsRepository.isSwtViews());

			basePart.setFormViews(genViewsRepository.isFormViews());

			basePart.initHelpStrategy((EEnum) EEFGenPackage.eINSTANCE.getGenViewsRepository_HelpStrategy().getEType(), genViewsRepository.getHelpStrategy());
			basePart.initViewsRepository(allResource, genViewsRepository.getViewsRepository());
			
			// init filters
			
			
			
			
			basePart.addFilterToViewsRepository(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof ViewsRepository);
				}

			});
			// Start of user code for additional businessfilters for viewsRepository
			
			// End of user code
		}
		// init values for referenced views

		// init filters for referenced views

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionCommand
	 *     (org.eclipse.emf.edit.domain.EditingDomain)
	 */
	public CompoundCommand getPropertiesEditionCommand(EditingDomain editingDomain) {
		CompoundCommand cc = new CompoundCommand();
		if (genViewsRepository != null) {
			cc.append(SetCommand.create(editingDomain, genViewsRepository, EEFGenPackage.eINSTANCE.getGenViewsRepository_BasePackage(), basePart.getBasePackage()));

			cc.append(SetCommand.create(editingDomain, genViewsRepository, EEFGenPackage.eINSTANCE.getGenViewsRepository_SwtViews(), basePart.getSwtViews()));

			cc.append(SetCommand.create(editingDomain, genViewsRepository, EEFGenPackage.eINSTANCE.getGenViewsRepository_FormViews(), basePart.getFormViews()));

			cc.append(SetCommand.create(editingDomain, genViewsRepository, EEFGenPackage.eINSTANCE.getGenViewsRepository_HelpStrategy(), basePart.getHelpStrategy()));

			cc.append(SetCommand.create(editingDomain, genViewsRepository, EEFGenPackage.eINSTANCE.getGenViewsRepository_ViewsRepository(), basePart.getViewsRepository()));


		}
		if (!cc.isEmpty())
			return cc;
		cc.append(UnexecutableCommand.INSTANCE);
		return cc;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionObject()
	 */
	public EObject getPropertiesEditionObject(EObject source) {
		if (source instanceof GenViewsRepository) {
			GenViewsRepository genViewsRepositoryToUpdate = (GenViewsRepository)source;
			genViewsRepositoryToUpdate.setBasePackage(basePart.getBasePackage());

			genViewsRepositoryToUpdate.setSwtViews(new Boolean(basePart.getSwtViews()).booleanValue());

			genViewsRepositoryToUpdate.setFormViews(new Boolean(basePart.getFormViews()).booleanValue());

			genViewsRepositoryToUpdate.setHelpStrategy((HELP_STRATEGY)basePart.getHelpStrategy());	

			genViewsRepositoryToUpdate.setViewsRepository((ViewsRepository)basePart.getViewsRepository());


			return genViewsRepositoryToUpdate;
		}
		else
			return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.common.notify.Notification)
	 */
	public void firePropertiesChanged(PropertiesEditionEvent event) {
		super.firePropertiesChanged(event);
		if (PropertiesEditionEvent.COMMIT == event.getState() && IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
			CompoundCommand command = new CompoundCommand();
			if (EEFGenViewsRepository.GenViewsRepository.basePackage == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, genViewsRepository, EEFGenPackage.eINSTANCE.getGenViewsRepository_BasePackage(), event.getNewValue()));

			if (EEFGenViewsRepository.GenViewsRepository.swtViews == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, genViewsRepository, EEFGenPackage.eINSTANCE.getGenViewsRepository_SwtViews(), event.getNewValue()));

			if (EEFGenViewsRepository.GenViewsRepository.formViews == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, genViewsRepository, EEFGenPackage.eINSTANCE.getGenViewsRepository_FormViews(), event.getNewValue()));

			if (EEFGenViewsRepository.GenViewsRepository.helpStrategy == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, genViewsRepository, EEFGenPackage.eINSTANCE.getGenViewsRepository_HelpStrategy(), event.getNewValue()));

			if (EEFGenViewsRepository.GenViewsRepository.viewsRepository == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, genViewsRepository, EEFGenPackage.eINSTANCE.getGenViewsRepository_ViewsRepository(), event.getNewValue()));


			liveEditingDomain.getCommandStack().execute(command);
		} else if (PropertiesEditionEvent.CHANGE == event.getState()) {
			Diagnostic diag = this.validateValue(event);
			if (diag != null && diag.getSeverity() != Diagnostic.OK) {
				if (EEFGenViewsRepository.GenViewsRepository.basePackage == event.getAffectedEditor())
					basePart.setMessageForBasePackage(diag.getMessage(), IMessageProvider.ERROR);
				
				
				
				


			} else {
				if (EEFGenViewsRepository.GenViewsRepository.basePackage == event.getAffectedEditor())
					basePart.unsetMessageForBasePackage();
				
				
				
				


			}
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.String, int)
	 */
	public boolean isRequired(String key, int kind) {
		return key == EEFGenViewsRepository.GenViewsRepository.helpStrategy || key == EEFGenViewsRepository.GenViewsRepository.viewsRepository;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.common.notify.Notification)
	 */
	public Diagnostic validateValue(PropertiesEditionEvent event) {
		String newStringValue = event.getNewValue().toString();
		Diagnostic ret = null;
		try {
			if (EEFGenViewsRepository.GenViewsRepository.basePackage == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getGenViewsRepository_BasePackage().getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getGenViewsRepository_BasePackage().getEAttributeType(), newValue);
			}
			if (EEFGenViewsRepository.GenViewsRepository.swtViews == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getGenViewsRepository_SwtViews().getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getGenViewsRepository_SwtViews().getEAttributeType(), newValue);
			}
			if (EEFGenViewsRepository.GenViewsRepository.formViews == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getGenViewsRepository_FormViews().getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getGenViewsRepository_FormViews().getEAttributeType(), newValue);
			}
			if (EEFGenViewsRepository.GenViewsRepository.helpStrategy == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(EEFGenPackage.eINSTANCE.getGenViewsRepository_HelpStrategy().getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(EEFGenPackage.eINSTANCE.getGenViewsRepository_HelpStrategy().getEAttributeType(), newValue);
			}

		} catch (IllegalArgumentException iae) {
			ret = BasicDiagnostic.toDiagnostic(iae);
		}
		return ret;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validate()
	 */
	public Diagnostic validate() {
		if (IPropertiesEditionComponent.BATCH_MODE.equals(editing_mode)) {
			EObject copy = EcoreUtil.copy(PropertiesContextService.getInstance().entryPointElement());
			copy = PropertiesContextService.getInstance().entryPointComponent().getPropertiesEditionObject(copy);
			return Diagnostician.INSTANCE.validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			return Diagnostician.INSTANCE.validate(genViewsRepository);
		else
			return null;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#dispose()
	 */
	public void dispose() {
		if (semanticAdapter != null)
			genViewsRepository.eAdapters().remove(semanticAdapter);
	}

}

