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
package org.eclipse.emf.eef.runtime.ui.swt.internal.view.propertyeditors.impl.emfpropertiestoolkit.edatepicker;

import org.eclipse.emf.eef.runtime.ui.swt.view.propertyeditors.impl.emfpropertiestoolkit.EMFPropertiesToolkit;
import org.eclipse.emf.eef.runtime.ui.view.PropertiesEditingView;
import org.eclipse.emf.eef.runtime.ui.view.propertyeditors.PropertyEditor;
import org.eclipse.emf.eef.runtime.ui.view.propertyeditors.impl.WidgetPropertyEditorFactoryImpl;
import org.eclipse.emf.eef.views.ElementEditor;
import org.eclipse.emf.eef.views.toolkits.ToolkitsFactory;
import org.eclipse.emf.eef.views.toolkits.Widget;
import org.eclipse.swt.widgets.Composite;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class EDatePickerPropertyEditorFactory extends WidgetPropertyEditorFactoryImpl<Composite> {

	private static final Widget widget = ToolkitsFactory.eINSTANCE.createWidget();
	
	static {
		widget.setName("EDatePickerEditor");
	}
	
	protected final EMFPropertiesToolkit emfPropertiesToolkit;
	
	/**
	 * @param emfPropertiesToolkit
	 */
	public EDatePickerPropertyEditorFactory(EMFPropertiesToolkit emfPropertiesToolkit) {
		this.emfPropertiesToolkit = emfPropertiesToolkit;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.ui.view.propertyeditors.ModelPropertyEditorFactory#getModel()
	 */
	public Widget getModel() {
		return widget;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.ui.view.propertyeditors.WidgetPropertyEditorFactory#serviceFor(org.eclipse.emf.eef.runtime.ui.view.propertyeditors.PropertyEditorFactory.PropertyEditorContext)
	 */
	public boolean serviceFor(PropertyEditorContext editorContext) {
		return getModel() == editorContext.viewElement.getRepresentation() && editorContext.view.getContents() instanceof Composite;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.ui.view.propertyeditors.PropertyEditorFactory#getPropertyEditor(org.eclipse.emf.eef.runtime.ui.view.propertyeditors.PropertyEditorFactory.PropertyEditorContext)
	 */
	@SuppressWarnings("unchecked")
	protected PropertyEditor createPropertyEditor(PropertyEditorContext editorContext) {
		return new EDatePackerPropertyEditor((PropertiesEditingView<Composite>) editorContext.view, (ElementEditor) editorContext.viewElement, new EDatePickerSWTPropertyEditor(emfPropertiesToolkit.getEditUIProvidersFactory(), emfPropertiesToolkit.getImageManager(), (PropertiesEditingView<Composite>) editorContext.view, (ElementEditor) editorContext.viewElement));
	}

}
