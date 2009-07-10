/*******************************************************************************
 * Copyright (c) 2008-2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.eef.runtime.ui.properties.sections;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.EMFPropertiesRuntime;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionProvider;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionComponentService;
import org.eclipse.emf.eef.runtime.ui.properties.TabbedPropertiesEditionSheetPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 */
public class PropertiesEditionSection extends AbstractPropertySection {

	/**
	 * the property sheet page for this section.
	 */
	private TabbedPropertiesEditionSheetPage propertySheetPage;

	/**
	 * the section's parent
	 */
	protected Composite parent;

	/**
	 * The current selected object or the first object in the selection when multiple objects are selected.
	 */
	protected EObject eObject;

	/**
	 * The list of current selected objects.
	 */
	protected List eObjectList;

	/**
	 * The component that have to managed the edition
	 */
	private IPropertiesEditionComponent propertiesEditionComponent = null;

	/**
	 * The view manager
	 */
	private IPropertiesEditionPart editionPart = null;

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		this.propertySheetPage = (TabbedPropertiesEditionSheetPage)aTabbedPropertySheetPage;
		this.parent = parent;
	}

	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#setInput(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		if (!(selection instanceof IStructuredSelection)) {
			return;
		}
		if (((IStructuredSelection)selection).getFirstElement() instanceof EObject) {
			EObject newEObject = (EObject)((IStructuredSelection)selection).getFirstElement();
			if (newEObject != eObject) {
				eObject = newEObject;
				if (eObject != null) {
					IPropertiesEditionProvider provider = PropertiesEditionComponentService.getInstance()
							.getProvider(eObject);
					if (provider != null) {
						if (this.propertiesEditionComponent != null)
							this.propertiesEditionComponent.dispose();
						String descriptor = getDescriptor();
						this.propertiesEditionComponent = provider.getPropertiesEditionComponent(eObject,
								IPropertiesEditionComponent.LIVE_MODE);
						if (this.propertiesEditionComponent != null) {
							this.propertiesEditionComponent.setLiveEditingDomain(propertySheetPage
									.getEditingDomain());
							this.editionPart = propertiesEditionComponent.getPropertiesEditionPart(1,
									descriptor);
							if (editionPart instanceof IFormPropertiesEditionPart) {
								for (int i = 0; i < parent.getChildren().length; i++) {
									Composite child = (Composite)parent.getChildren()[i];
									child.dispose();
								}
								((IFormPropertiesEditionPart)this.editionPart).createFigure(parent,
										getWidgetFactory());
								parent.layout();
								this.propertiesEditionComponent.initPart(this.propertiesEditionComponent
										.translatePart(descriptor), 1, eObject);
							}
						}
					}
				}
			}
		}
		eObjectList = ((IStructuredSelection)selection).toList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.views.properties.tabbed.AbstractPropertySection#dispose()
	 */
	public void dispose() {
		super.dispose();
		if (this.propertiesEditionComponent != null) {
			this.propertiesEditionComponent.dispose();
			this.propertiesEditionComponent = null;
			this.editionPart = null;
		}
		
	}

	/**
	 * Magic method For eclipse 3.2 & 3.3 & 3.4 & 3.5
	 * 
	 * @return
	 */
	protected String getDescriptor() {
		Map descriptor = propertySheetPage.getDescriptor();
		for (Iterator iterator = descriptor.keySet().iterator(); iterator.hasNext();) {
			Object key = iterator.next();
			Object tab = descriptor.get(key);
			Method getSectionAtIndex = getMethod(tab, "getSectionAtIndex", int.class);
			if (getSectionAtIndex != null) {
				Object result = callMethod(tab, getSectionAtIndex, 0);
				if (result == this) {
					Method getId = getMethod(key, "getId");
					if (getId != null) {
						String id = (String)callMethod(key, getId);
						return id;
					}
				}
			}
		}
		return "";
	}

	/**
	 * @param source
	 *            the source object
	 * @param name
	 *            the method to get
	 * @param argsType
	 *            the method arguments type
	 * @return the given method
	 */
	private Method getMethod(Object source, String name, Class... argsType) {
		try {
			return source.getClass().getDeclaredMethod(name, argsType);
		} catch (Exception e) {
			EMFPropertiesRuntime.getDefault().logError("Cannot found method " + name, e);
		}
		return null;
	}

	/**
	 * @param source
	 *            the source object
	 * @param name
	 *            the method to get
	 * @param argsType
	 *            the method arguments type
	 * @return the result of the given method
	 */
	private Object callMethod(Object source, Method method, Object... args) {
		try {
			return method.invoke(source, args);
		} catch (Exception e) {
			EMFPropertiesRuntime.getDefault().logError("An error occured on " + method.getName() + " call.",
					e);
		}
		return null;
	}
}
