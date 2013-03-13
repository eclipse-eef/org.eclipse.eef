/**
 * 
 */
package org.eclipse.emf.example.eef.application.handlers;

import java.util.ArrayList;
import java.util.Collection;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.context.DomainAwarePropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContextFactory;
import org.eclipse.emf.eef.runtime.services.EEFServiceRegistry;
import org.eclipse.emf.eef.runtime.ui.platform.application.handlers.AbstractEEFOpenViewHandler;
import org.eclipse.emf.eef.runtime.ui.platform.application.parts.E4EEFPart;
import org.eclipse.emf.eef.runtime.ui.platform.application.utils.EditingInput;
import org.eclipse.emf.eef.runtime.ui.platform.application.utils.impl.EditingContextEditingInput;
import org.eclipse.emf.eef.runtime.ui.platform.application.utils.impl.URIEditingInput;
import org.eclipse.emf.eef.runtime.ui.swt.viewer.filters.ViewFilter;
import org.eclipse.emf.example.eef.application.ConferenceApplicationConstants;
import org.eclipse.emf.samples.conference.Conference;
import org.eclipse.swt.widgets.Shell;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class OpenScheduleViewHandler extends AbstractEEFOpenViewHandler {

	@Inject
	@Named(IServiceConstants.ACTIVE_PART)
	private MPart activePart;
	
	@Inject
	private EEFServiceRegistry serviceRegistry;
	
	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_PART)MPart activePart) {
		return activePart != null;
	}
	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.ui.platform.application.handlers.AbstractEEFOpenViewHandler#getEditingInput(org.eclipse.e4.core.contexts.IEclipseContext, org.eclipse.e4.ui.model.application.ui.basic.MPart, org.eclipse.swt.widgets.Shell)
	 */
	@Override
	protected EditingInput getEditingInput(IEclipseContext context, MPart mPart, Shell shell) {
		EditingInput editingInput = activePart.getContext().get(EditingInput.class);
		if (editingInput instanceof URIEditingInput) {
			EditingDomain editingDomain = editingInput.getEditingDomain();
			URI uri = ((URIEditingInput) editingInput).getUri();
			Resource resource = editingDomain.getResourceSet().getResource(uri, true);
			EObject root = resource.getContents().get(0);
			if (root instanceof Conference) {
				PropertiesEditingContextFactory contextFactory = serviceRegistry.getService(PropertiesEditingContextFactory.class, root);
				//TODO: is the ED always an AFED ?
				PropertiesEditingContext editingContext = contextFactory.createPropertiesEditingContext((AdapterFactoryEditingDomain)editingDomain, ((Conference) root).getSchedule());
				return new EditingContextEditingInput(uri, (DomainAwarePropertiesEditingContext) editingContext);
			}
		} 
		return editingInput;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.ui.platform.application.handlers.AbstractEEFOpenViewHandler#getElementContainerID()
	 */
	@Override
	protected String getElementContainerID() {
		return ConferenceApplicationConstants.MAIN_PARTSTACK;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.ui.platform.application.handlers.AbstractEEFOpenHandler#configureCreatedPart(org.eclipse.e4.ui.workbench.modeling.EModelService, org.eclipse.e4.ui.model.application.MApplication, org.eclipse.e4.ui.model.application.ui.basic.MPart)
	 */
	@Override
	protected void configureCreatedPart(EModelService modelService, MApplication applicationModel, MPart mPart) {
		mPart.setLabel("Schedule");
	}
}
