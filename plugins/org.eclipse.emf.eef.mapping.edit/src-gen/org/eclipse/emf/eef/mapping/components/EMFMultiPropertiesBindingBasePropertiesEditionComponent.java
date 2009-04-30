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
 * $Id: EMFMultiPropertiesBindingBasePropertiesEditionComponent.java,v 1.2 2009/04/30 17:48:58 nlepine Exp $
 */
package org.eclipse.emf.eef.mapping.components;

// Start of user code for imports

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.mapping.EMFMultiPropertiesBinding;
import org.eclipse.emf.eef.mapping.MappingPackage;
import org.eclipse.emf.eef.mapping.parts.EMFMultiPropertiesBindingPropertiesEditionPart;
import org.eclipse.emf.eef.mapping.parts.MappingViewsRepository;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesContextService;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.jface.dialogs.IMessageProvider;

// End of user code
/**
 * @author <a href="mailto:nathalie.lepine@obeo.fr">Nathalie Lepine</a>
 */
public class EMFMultiPropertiesBindingBasePropertiesEditionComponent extends StandardPropertiesEditionComponent {

	public static String BASE_PART = "Base"; //$NON-NLS-1$
	
	private String[] parts = {BASE_PART};
	
	/**
	 * The EObject to edit
	 */
	private EMFMultiPropertiesBinding eMFMultiPropertiesBinding;
	
	/**
	 * The Base part
	 */
	private EMFMultiPropertiesBindingPropertiesEditionPart basePart;
	
	/**
	 * Default constructor
	 */
	public EMFMultiPropertiesBindingBasePropertiesEditionComponent(EObject eMFMultiPropertiesBinding, String editing_mode) {
		if (eMFMultiPropertiesBinding instanceof EMFMultiPropertiesBinding) {
			this.eMFMultiPropertiesBinding = (EMFMultiPropertiesBinding)eMFMultiPropertiesBinding;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.eMFMultiPropertiesBinding.eAdapters().add(semanticAdapter);
			}
		}
		listeners = new ArrayList();
		this.editing_mode = editing_mode;
	}
	
	/**
	 * Initialize the semantic model listener for live editing mode
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
				if (MappingPackage.eINSTANCE.getAbstractPropertyBinding_Name().equals(msg.getFeature()) && basePart != null)
					basePart.setName((String)msg.getNewValue());

				if (MappingPackage.eINSTANCE.getAbstractPropertyBinding_Views().equals(msg.getFeature()))
					basePart.updateViews(eMFMultiPropertiesBinding);
				if (MappingPackage.eINSTANCE.getEMFMultiPropertiesBinding_Model().equals(msg.getFeature()))
					basePart.updateModel(eMFMultiPropertiesBinding);


			}

		};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#translatePart(java.lang.String)
	 */
	public java.lang.Class translatePart(String key) {
		if (BASE_PART.equals(key))
			return MappingViewsRepository.EMFMultiPropertiesBinding.class;
		return super.translatePart(key);
	}
	

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#partsList()
	 */
	public String[] partsList() {
		return parts;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionPart
	 * (java.lang.String, java.lang.String)
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (eMFMultiPropertiesBinding != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(MappingViewsRepository.class);
				if (provider != null) {
					basePart = (EMFMultiPropertiesBindingPropertiesEditionPart)provider.getPropertiesEditionPart(MappingViewsRepository.EMFMultiPropertiesBinding.class, kind, this);
					listeners.add(basePart);
				}
			}
			return (IPropertiesEditionPart)basePart;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent
	 * 		#initPart(java.lang.Class, int, org.eclipse.emf.ecore.EObject, 
	 * 						org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	public void initPart(java.lang.Class key, int kind, EObject elt, ResourceSet allResource) {
		if (basePart != null && key == MappingViewsRepository.EMFMultiPropertiesBinding.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			EMFMultiPropertiesBinding eMFMultiPropertiesBinding = (EMFMultiPropertiesBinding)elt;
			if (eMFMultiPropertiesBinding.getName() != null)
				basePart.setName(eMFMultiPropertiesBinding.getName());

			basePart.initViews(eMFMultiPropertiesBinding, null, MappingPackage.eINSTANCE.getAbstractPropertyBinding_Views());
			basePart.initModel(eMFMultiPropertiesBinding, null, MappingPackage.eINSTANCE.getEMFMultiPropertiesBinding_Model());
		}

	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionCommand
	 * (org.eclipse.emf.edit.domain.EditingDomain)
	 */
	public CompoundCommand getPropertiesEditionCommand(EditingDomain editingDomain) {
		CompoundCommand cc = new CompoundCommand();
		if (eMFMultiPropertiesBinding != null) {
			cc.append(SetCommand.create(editingDomain, eMFMultiPropertiesBinding, MappingPackage.eINSTANCE.getAbstractPropertyBinding_Name(), basePart.getName()));

			List viewsToAdd = basePart.getViewsToAdd();
			for (Iterator iter = viewsToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, eMFMultiPropertiesBinding, MappingPackage.eINSTANCE.getAbstractPropertyBinding_Views(), iter.next()));
			List viewsToRemove = basePart.getViewsToRemove();
			for (Iterator iter = viewsToRemove.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, eMFMultiPropertiesBinding, MappingPackage.eINSTANCE.getAbstractPropertyBinding_Views(), iter.next()));
			//List viewsToMove = basePart.getViewsToMove();
			//for (Iterator iter = viewsToMove.iterator(); iter.hasNext();){
			//	org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, eMFMultiPropertiesBinding, MappingPackage.eINSTANCE.getElementEditor(), moveElement.getElement(), moveElement.getIndex()));
			//}
			List modelToAdd = basePart.getModelToAdd();
			for (Iterator iter = modelToAdd.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, eMFMultiPropertiesBinding, MappingPackage.eINSTANCE.getEMFMultiPropertiesBinding_Model(), iter.next()));
			List modelToRemove = basePart.getModelToRemove();
			for (Iterator iter = modelToRemove.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, eMFMultiPropertiesBinding, MappingPackage.eINSTANCE.getEMFMultiPropertiesBinding_Model(), iter.next()));
			//List modelToMove = basePart.getModelToMove();
			//for (Iterator iter = modelToMove.iterator(); iter.hasNext();){
			//	org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, eMFMultiPropertiesBinding, MappingPackage.eINSTANCE.getEStructuralFeature(), moveElement.getElement(), moveElement.getIndex()));
			//}


		}
		if (!cc.isEmpty())
			return cc;
		cc.append(UnexecutableCommand.INSTANCE);
		return cc;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionObject
	 * ()
	 */
	public EObject getPropertiesEditionObject(EObject source) {
		if (source instanceof EMFMultiPropertiesBinding) {
			EMFMultiPropertiesBinding eMFMultiPropertiesBindingToUpdate = (EMFMultiPropertiesBinding)source;
			eMFMultiPropertiesBindingToUpdate.setName(basePart.getName());

			eMFMultiPropertiesBindingToUpdate.getViews().addAll(basePart.getViewsToAdd());
			eMFMultiPropertiesBindingToUpdate.getModel().addAll(basePart.getModelToAdd());


			return eMFMultiPropertiesBindingToUpdate;
		}
		else
			return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.common.notify.Notification)
	 */
	public void firePropertiesChanged(PropertiesEditionEvent event) {
		super.firePropertiesChanged(event);
		if (PropertiesEditionEvent.COMMIT == event.getState() && IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
			CompoundCommand command = new CompoundCommand();
			if (MappingViewsRepository.EMFMultiPropertiesBinding.name == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, eMFMultiPropertiesBinding, MappingPackage.eINSTANCE.getAbstractPropertyBinding_Name(), event.getNewValue()));

			if (MappingViewsRepository.EMFMultiPropertiesBinding.views == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, eMFMultiPropertiesBinding, MappingPackage.eINSTANCE.getAbstractPropertyBinding_Views(), event.getNewValue()));
				if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, eMFMultiPropertiesBinding, MappingPackage.eINSTANCE.getAbstractPropertyBinding_Views(), event.getNewValue()));
				if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, eMFMultiPropertiesBinding, MappingPackage.eINSTANCE.getAbstractPropertyBinding_Views(), event.getNewValue(), event.getNewIndex()));
			}
			if (MappingViewsRepository.EMFMultiPropertiesBinding.model == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, eMFMultiPropertiesBinding, MappingPackage.eINSTANCE.getEMFMultiPropertiesBinding_Model(), event.getNewValue()));
				if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, eMFMultiPropertiesBinding, MappingPackage.eINSTANCE.getEMFMultiPropertiesBinding_Model(), event.getNewValue()));
				if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, eMFMultiPropertiesBinding, MappingPackage.eINSTANCE.getEMFMultiPropertiesBinding_Model(), event.getNewValue(), event.getNewIndex()));
			}


			if (command != null)
				liveEditingDomain.getCommandStack().execute(command);
		} else if (PropertiesEditionEvent.CHANGE == event.getState()) {
			Diagnostic diag = this.validateValue(event);
			if (diag != null && diag.getSeverity() != Diagnostic.OK) {
				if (MappingViewsRepository.EMFMultiPropertiesBinding.name == event.getAffectedEditor())
					basePart.setMessageForName(diag.getMessage(), IMessageProvider.ERROR);
				
				


			} else {
				if (MappingViewsRepository.EMFMultiPropertiesBinding.name == event.getAffectedEditor())
					basePart.unsetMessageForName();
				
				


			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.String, int)
	 */
	public boolean isRequired(String key, int kind) {
		return key == MappingViewsRepository.EMFMultiPropertiesBinding.name || key == MappingViewsRepository.EMFMultiPropertiesBinding.views || key == MappingViewsRepository.EMFMultiPropertiesBinding.model;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.String, int)
	 */
	public String getHelpContent(String key, int kind) {
			if (key == MappingViewsRepository.EMFMultiPropertiesBinding.name)
				return "The name of this property binding"; //$NON-NLS-1$
			if (key == MappingViewsRepository.EMFMultiPropertiesBinding.views)
				return "The mapped views"; //$NON-NLS-1$
			if (key == MappingViewsRepository.EMFMultiPropertiesBinding.model)
				return "The mapped properties"; //$NON-NLS-1$
		return super.getHelpContent(key, kind);
	}
	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.common.notify.Notification)
	 */
	public Diagnostic validateValue(PropertiesEditionEvent event) {
		String newStringValue = event.getNewValue().toString();
		Diagnostic ret = null;
		try {
			if (MappingViewsRepository.EMFMultiPropertiesBinding.name == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(MappingPackage.eINSTANCE.getAbstractPropertyBinding_Name().getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(MappingPackage.eINSTANCE.getAbstractPropertyBinding_Name().getEAttributeType(), newValue);
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
			return Diagnostician.INSTANCE.validate(eMFMultiPropertiesBinding);
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
			eMFMultiPropertiesBinding.eAdapters().remove(semanticAdapter);
	}

}

