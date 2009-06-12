/**
 * Generated with Acceleo
 */
package org.eclipse.emf.eef.nonreg.components;

// Start of user code for imports

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.command.MoveCommand;

import org.eclipse.emf.eef.nonreg.Talk;

import org.eclipse.emf.eef.ab.abstractnonreg.AbstractnonregPackage;
import org.eclipse.emf.eef.ab.abstractnonreg.parts.AbstractnonregViewsRepository;


import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.eef.nonreg.TALK_TYPE;
import org.eclipse.emf.eef.nonreg.Person;
import org.eclipse.emf.eef.nonreg.Person;
import org.eclipse.emf.eef.nonreg.NonregPackage;
import org.eclipse.emf.eef.nonreg.NonregFactory;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.nonreg.NonregPackage;
import org.eclipse.emf.eef.nonreg.parts.TalkPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesContextService;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.nonreg.TALK_TYPE;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.nonreg.Person;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.ab.abstractnonreg.parts.AbstractnonregViewsRepository;
import org.eclipse.emf.eef.nonreg.parts.NonregViewsRepository;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.viewers.Viewer;


// End of user code
/**
 * 
 */
public class TalkBasePropertiesEditionComponent extends StandardPropertiesEditionComponent {

	public static String BASE_PART = "Base"; //$NON-NLS-1$

	private String[] parts = {BASE_PART};

	/**
	 * The EObject to edit
	 */
	private Talk talk;

	/**
	 * The Base part
	 */
	private TalkPropertiesEditionPart basePart;

	/**
	 * Default constructor
	 */
	public TalkBasePropertiesEditionComponent(EObject talk, String editing_mode) {
		if (talk instanceof Talk) {
			this.talk = (Talk)talk;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.talk.eAdapters().add(semanticAdapter);
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
				if (basePart == null)
					TalkBasePropertiesEditionComponent.this.dispose();
				else {
					if (NonregPackage.eINSTANCE.getTalk_Title().equals(msg.getFeature()) && basePart != null)
						basePart.setTitle((String)msg.getNewValue());

					if (NonregPackage.eINSTANCE.getTalk_Type().equals(msg.getFeature()) && basePart != null)
						basePart.setType((Enumerator)msg.getNewValue());

					if (NonregPackage.eINSTANCE.getTalk_Presenter().equals(msg.getFeature()) && basePart != null)
						basePart.setPresenter((EObject)msg.getNewValue());
					if (NonregPackage.eINSTANCE.getTalk_Creator().equals(msg.getFeature()) && basePart != null)
						basePart.setCreator((Object)msg.getNewValue());



				}
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
			return NonregViewsRepository.Talk.class;
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
		if (talk != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(NonregViewsRepository.class);
				if (provider != null) {
					basePart = (TalkPropertiesEditionPart)provider.getPropertiesEditionPart(NonregViewsRepository.Talk.class, kind, this);
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
		if (key == NonregViewsRepository.Talk.class)
			this.basePart = (TalkPropertiesEditionPart) propertiesEditionPart;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Class, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	public void initPart(java.lang.Class key, int kind, EObject elt, ResourceSet allResource) {
		if (basePart != null && key == NonregViewsRepository.Talk.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			Talk talk = (Talk)elt;
			// init values
			if (talk.getTitle() != null)
				basePart.setTitle(talk.getTitle());

			basePart.initType((EEnum) NonregPackage.eINSTANCE.getTalk_Type().getEType(), talk.getType());
			basePart.initPresenter(allResource, talk.getPresenter());
			basePart.initCreator(allResource, talk.getCreator());
			
			// init filters


			basePart.addFilterToPresenter(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof Person);
				}

			});
			// Start of user code for additional businessfilters for presenter
			
			// End of user code
			basePart.addFilterToCreator(new ViewerFilter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof String && element.equals("")) || (element instanceof Person);  //$NON-NLS-1$ 					
				}

			});
			// Start of user code for additional businessfilters for creator
			
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
		if (talk != null) {
			cc.append(SetCommand.create(editingDomain, talk, NonregPackage.eINSTANCE.getTalk_Title(), basePart.getTitle()));

			cc.append(SetCommand.create(editingDomain, talk, NonregPackage.eINSTANCE.getTalk_Type(), basePart.getType()));

			if (talk.eGet(NonregPackage.eINSTANCE.getTalk_Presenter()) == null || !talk.eGet(NonregPackage.eINSTANCE.getTalk_Presenter()).equals(basePart.getPresenter())) {
				cc.append(SetCommand.create(editingDomain, talk, NonregPackage.eINSTANCE.getTalk_Presenter(), basePart.getPresenter()));
			}
			cc.append(SetCommand.create(editingDomain, talk, NonregPackage.eINSTANCE.getTalk_Creator(), basePart.getCreator()));



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
		if (source instanceof Talk) {
			Talk talkToUpdate = (Talk)source;
			talkToUpdate.setTitle(basePart.getTitle());

			talkToUpdate.setType((TALK_TYPE)basePart.getType());

			talkToUpdate.setPresenter((Person)basePart.getPresenter());
			talkToUpdate.setCreator((Person)basePart.getCreator());



			return talkToUpdate;
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
			if (NonregViewsRepository.Talk.title == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, talk, NonregPackage.eINSTANCE.getTalk_Title(), event.getNewValue()));

			if (NonregViewsRepository.Talk.type == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, talk, NonregPackage.eINSTANCE.getTalk_Type(), event.getNewValue()));

			if (NonregViewsRepository.Talk.presenter == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, talk, NonregPackage.eINSTANCE.getTalk_Presenter(), event.getNewValue()));
			if (NonregViewsRepository.Talk.creator == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, talk, NonregPackage.eINSTANCE.getTalk_Creator(), event.getNewValue()));



			liveEditingDomain.getCommandStack().execute(command);
		} else if (PropertiesEditionEvent.CHANGE == event.getState()) {
			Diagnostic diag = this.validateValue(event);
			if (diag != null && diag.getSeverity() != Diagnostic.OK) {
				if (NonregViewsRepository.Talk.title == event.getAffectedEditor())
					basePart.setMessageForTitle(diag.getMessage(), IMessageProvider.ERROR);






			} else {
				if (NonregViewsRepository.Talk.title == event.getAffectedEditor())
					basePart.unsetMessageForTitle();






			}
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.String, int)
	 */
	public boolean isRequired(String key, int kind) {
		return key == NonregViewsRepository.Talk.title || key == NonregViewsRepository.Talk.presenter;
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
			if (NonregViewsRepository.Talk.title == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(NonregPackage.eINSTANCE.getTalk_Title().getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(NonregPackage.eINSTANCE.getTalk_Title().getEAttributeType(), newValue);
			}
			if (NonregViewsRepository.Talk.type == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(NonregPackage.eINSTANCE.getTalk_Type().getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(NonregPackage.eINSTANCE.getTalk_Type().getEAttributeType(), newValue);
			}

			if (AbstractnonregViewsRepository.DocumentedElement.documentation == event.getAffectedEditor()) {
				Object newValue = EcoreUtil.createFromString(AbstractnonregPackage.eINSTANCE.getDocumentedElement_Documentation().getEAttributeType(), newStringValue);
				ret = Diagnostician.INSTANCE.validate(AbstractnonregPackage.eINSTANCE.getDocumentedElement_Documentation().getEAttributeType(), newValue);
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
		Diagnostic validate = null;
		if (IPropertiesEditionComponent.BATCH_MODE.equals(editing_mode)) {
			EObject copy = EcoreUtil.copy(PropertiesContextService.getInstance().entryPointElement());
			copy = PropertiesContextService.getInstance().entryPointComponent().getPropertiesEditionObject(copy);
			validate =  Diagnostician.INSTANCE.validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			validate = Diagnostician.INSTANCE.validate(talk);
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
			talk.eAdapters().remove(semanticAdapter);
	}

}

