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
package org.eclipse.emf.eef.extended.editor.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.extended.editor.EEFMasterPage;
import org.eclipse.emf.eef.extended.editor.EditorPackage;
import org.eclipse.emf.eef.extended.editor.parts.EEFMasterPagePropertiesEditionPart;
import org.eclipse.emf.eef.extended.editor.parts.EditorViewsRepository;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.views.ViewsPackage;


// End of user code

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen LeFur</a>
 * 
 */
public class EEFMasterPageBasePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public EEFMasterPageBasePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject eEFMasterPage, String editing_mode) {
		super(editingContext, eEFMasterPage, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EditorViewsRepository.class;
		partKey = EditorViewsRepository.EEFMasterPage.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final EEFMasterPage eEFMasterPage = (EEFMasterPage)elt;
			final EEFMasterPagePropertiesEditionPart basePart = (EEFMasterPagePropertiesEditionPart)editingPart;
			// init values
			if (eEFMasterPage.getName() != null && isAccessible(EditorViewsRepository.EEFMasterPage.Naming.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eEFMasterPage.getName()));
			
			if (eEFMasterPage.getTitle() != null && isAccessible(EditorViewsRepository.EEFMasterPage.Naming.title_))
				basePart.setTitle_(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eEFMasterPage.getTitle()));
			
			if (isAccessible(EditorViewsRepository.EEFMasterPage.Settings.orientable)) {
				basePart.setOrientable(eEFMasterPage.isOrientable());
			}
			if (isAccessible(EditorViewsRepository.EEFMasterPage.Settings.showValidatePage)) {
				basePart.setShowValidatePage(eEFMasterPage.isShowValidatePage());
			}
			// init filters
			
			
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}







	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == EditorViewsRepository.EEFMasterPage.Naming.name) {
			return ViewsPackage.eINSTANCE.getViewElement_Name();
		}
		if (editorKey == EditorViewsRepository.EEFMasterPage.Naming.title_) {
			return EditorPackage.eINSTANCE.getEEFPage_Title();
		}
		if (editorKey == EditorViewsRepository.EEFMasterPage.Settings.orientable) {
			return EditorPackage.eINSTANCE.getEEFMasterPage_Orientable();
		}
		if (editorKey == EditorViewsRepository.EEFMasterPage.Settings.showValidatePage) {
			return EditorPackage.eINSTANCE.getEEFMasterPage_ShowValidatePage();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EEFMasterPage eEFMasterPage = (EEFMasterPage)semanticObject;
		if (EditorViewsRepository.EEFMasterPage.Naming.name == event.getAffectedEditor()) {
			eEFMasterPage.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (EditorViewsRepository.EEFMasterPage.Naming.title_ == event.getAffectedEditor()) {
			eEFMasterPage.setTitle((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (EditorViewsRepository.EEFMasterPage.Settings.orientable == event.getAffectedEditor()) {
			eEFMasterPage.setOrientable((Boolean)event.getNewValue());
		}
		if (EditorViewsRepository.EEFMasterPage.Settings.showValidatePage == event.getAffectedEditor()) {
			eEFMasterPage.setShowValidatePage((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			EEFMasterPagePropertiesEditionPart basePart = (EEFMasterPagePropertiesEditionPart)editingPart;
			if (ViewsPackage.eINSTANCE.getViewElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(EditorViewsRepository.EEFMasterPage.Naming.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (EditorPackage.eINSTANCE.getEEFPage_Title().equals(msg.getFeature()) && basePart != null && isAccessible(EditorViewsRepository.EEFMasterPage.Naming.title_)) {
				if (msg.getNewValue() != null) {
					basePart.setTitle_(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setTitle_("");
				}
			}
			if (EditorPackage.eINSTANCE.getEEFMasterPage_Orientable().equals(msg.getFeature()) && basePart != null && isAccessible(EditorViewsRepository.EEFMasterPage.Settings.orientable))
				basePart.setOrientable((Boolean)msg.getNewValue());
			
			if (EditorPackage.eINSTANCE.getEEFMasterPage_ShowValidatePage().equals(msg.getFeature()) && basePart != null && isAccessible(EditorViewsRepository.EEFMasterPage.Settings.showValidatePage))
				basePart.setShowValidatePage((Boolean)msg.getNewValue());
			
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			ViewsPackage.eINSTANCE.getViewElement_Name(),
			EditorPackage.eINSTANCE.getEEFPage_Title(),
			EditorPackage.eINSTANCE.getEEFMasterPage_Orientable(),
			EditorPackage.eINSTANCE.getEEFMasterPage_ShowValidatePage());
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EditorViewsRepository.EEFMasterPage.Naming.name;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getHelpContent(java.lang.Object, int)
	 * 
	 */
	public String getHelpContent(Object key, int kind) {
		if (key == EditorViewsRepository.EEFMasterPage.Naming.name)
			return "The element name"; //$NON-NLS-1$
		return super.getHelpContent(key, kind);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (EditorViewsRepository.EEFMasterPage.Naming.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ViewsPackage.eINSTANCE.getViewElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ViewsPackage.eINSTANCE.getViewElement_Name().getEAttributeType(), newValue);
				}
				if (EditorViewsRepository.EEFMasterPage.Naming.title_ == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EditorPackage.eINSTANCE.getEEFPage_Title().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EditorPackage.eINSTANCE.getEEFPage_Title().getEAttributeType(), newValue);
				}
				if (EditorViewsRepository.EEFMasterPage.Settings.orientable == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EditorPackage.eINSTANCE.getEEFMasterPage_Orientable().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EditorPackage.eINSTANCE.getEEFMasterPage_Orientable().getEAttributeType(), newValue);
				}
				if (EditorViewsRepository.EEFMasterPage.Settings.showValidatePage == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EditorPackage.eINSTANCE.getEEFMasterPage_ShowValidatePage().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EditorPackage.eINSTANCE.getEEFMasterPage_ShowValidatePage().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
