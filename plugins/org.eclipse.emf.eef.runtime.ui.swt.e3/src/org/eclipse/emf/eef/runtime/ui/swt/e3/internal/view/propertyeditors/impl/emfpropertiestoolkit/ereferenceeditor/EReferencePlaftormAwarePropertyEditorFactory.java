/*******************************************************************************
 * Copyright (c) 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.ui.swt.e3.internal.view.propertyeditors.impl.emfpropertiestoolkit.ereferenceeditor;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.eef.runtime.ui.swt.EEFSWTConstants;
import org.eclipse.emf.eef.runtime.ui.swt.internal.view.propertyeditors.impl.emfpropertiestoolkit.edatepicker.EDatePickerPropertyEditorFactory;
import org.eclipse.emf.eef.runtime.ui.swt.internal.view.propertyeditors.impl.emfpropertiestoolkit.ereferenceeditor.EReferencePropertyEditorFactory;
import org.eclipse.emf.eef.runtime.ui.swt.internal.view.propertyeditors.impl.emfpropertiestoolkit.ereferenceeditor.EReferenceSWTPropertyEditor;
import org.eclipse.emf.eef.runtime.ui.swt.view.propertyeditors.impl.emfpropertiestoolkit.EMFPropertiesToolkit;
import org.eclipse.emf.eef.runtime.ui.view.PropertiesEditingView;
import org.eclipse.emf.eef.runtime.ui.view.propertyeditors.PropertyEditor;
import org.eclipse.emf.eef.views.ElementEditor;
import org.eclipse.emf.eef.views.toolkits.Widget;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 * 
 */
public class EReferencePlaftormAwarePropertyEditorFactory extends EReferencePropertyEditorFactory {

	/**
	 * @param toolkit
	 */
	public EReferencePlaftormAwarePropertyEditorFactory(EMFPropertiesToolkit emfPropertiesToolkit) {
		super(emfPropertiesToolkit);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.ui.view.propertyeditors.WidgetPropertyEditorFactory#serviceFor(org.eclipse.emf.eef.runtime.ui.propertyeditors.PropertyEditorFactory.PropertyEditorContext)
	 */
	public boolean serviceFor(PropertyEditorContext editorContext) {
		return EReferencePropertyEditorFactory.class.getName().equals(editorContext.viewElement.getRepresentation().getImplementation()) && editorContext.view.getContents() instanceof Composite;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.ui.swt.view.propertyeditors.impl.emfpropertiestoolkit.ecomboeditor.EComboPropertyEditorFactory#createPropertyEditor(org.eclipse.emf.eef.runtime.ui.propertyeditors.PropertyEditorFactory.PropertyEditorContext)
	 */
	@SuppressWarnings("unchecked")
	protected PropertyEditor createPropertyEditor(PropertyEditorContext editorContext) {
		FormToolkit formtoolkit = editorContext.view.getEditingComponent().getEditingContext().getOptions().getOption(EEFSWTConstants.FORM_TOOLKIT);
		if (formtoolkit != null) {
			return new EReferenceE3PropertyEditor(toolkit.getEMFServiceProvider(), toolkit.getEEFEditingServiceProvider(), toolkit.getEditUIProvidersFactory(), toolkit.getImageManager(), toolkit.getViewerFilterBuilderProvider(), (PropertiesEditingView<Composite>) editorContext.view,
					(ElementEditor) editorContext.viewElement, new EReferenceFormPropertyEditor(toolkit.getImageManager(), (PropertiesEditingView<Composite>) editorContext.view, (ElementEditor) editorContext.viewElement));
		} else {
			return new EReferenceE3PropertyEditor(toolkit.getEMFServiceProvider(), toolkit.getEEFEditingServiceProvider(), toolkit.getEditUIProvidersFactory(), toolkit.getImageManager(), toolkit.getViewerFilterBuilderProvider(), (PropertiesEditingView<Composite>) editorContext.view,
					(ElementEditor) editorContext.viewElement, new EReferenceSWTPropertyEditor(toolkit.getImageManager(), (PropertiesEditingView<Composite>) editorContext.view, (ElementEditor) editorContext.viewElement));
		}
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.eef.runtime.ui.view.propertyeditors.impl.WidgetPropertyEditorFactoryImpl#getModel(org.eclipse.emf.ecore.resource.Resource)
	 */
	public Widget getModel(Resource resource) {
		TreeIterator<EObject> allContents = resource.getAllContents();
		while (allContents.hasNext()) {
			EObject next = allContents.next();
			if (next instanceof Widget) {
				if (EReferencePropertyEditorFactory.class.getName().equals(((Widget) next).getImplementation())) {
					return (Widget) next;
				}
 			}
		}
		return null;
	}
}
