/**
 * 
 */
package org.eclipse.emf.eef.runtime.editingModel;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.eef.runtime.ui.view.handlers.editingview.PropertiesEditingViewHandlerProvider;
import org.eclipse.emf.eef.runtime.ui.view.handlers.reflect.ReflectViewHandlerProvider;
import org.eclipse.emf.eef.runtime.ui.view.handlers.swt.SWTViewHandlerProvider;
import org.eclipse.emf.eef.runtime.ui.view.propertyeditors.PropertyEditorProvider;
import org.eclipse.emf.eef.runtime.ui.view.propertyeditors.impl.ComposedPropertyEditorProvider;
import org.eclipse.emf.eef.runtime.ui.view.propertyeditors.impl.emfpropertiestoolkit.EMFPropertiesToolkit;
import org.eclipse.emf.eef.runtime.ui.view.propertyeditors.impl.swttoolkit.SWTToolkit;
import org.eclipse.emf.eef.runtime.view.handler.ComposedViewHandlerProvider;
import org.eclipse.emf.eef.runtime.view.handler.ViewHandlerProvider;

import com.google.common.collect.Lists;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class PropertiesEditingProvider extends AbstractPropertiesEditingProvider {

	/**
	 * This method can be overridden by subclasses to provide their own EditingModel.
	 * @return an URI style path to the editing model to load for this provider.
	 */
	protected String getEditingModelPath() {
		return null;
	}
	
	/**
	 * This method can be overridden by subclasses to provide their own EditingModel.
	 * @return to the editing model to load for this provider.
	 */
	protected PropertiesEditingModel getEditingModel() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.editingModel.AbstractPropertiesEditingProvider#initSpecificEditingModel()
	 */
	@Override
	protected final Collection<? extends PropertiesEditingModel> initSpecificEditingModel() {
		Collection<PropertiesEditingModel> result = Lists.newArrayList();
		if (getEditingModelPath() != null && !"".equals(getEditingModelPath())) {
			URI modelURI = URI.createURI(getEditingModelPath());
			try {
				Resource resource = getEditingModelEnvironment().getResourceSet().getResource(modelURI, true);
				result.addAll(getAllEditingModels(resource));
			} catch (WrappedException e) {
				//Unable to load the file. Nothing to do.
			}
		} else if (getEditingModel() != null) {
			result.add(getEditingModel());
		}
		if (!result.isEmpty()) {
			return result;
		} else {
			return super.initSpecificEditingModel();
		}
	}



	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.editingModel.AbstractPropertiesEditingProvider#initViewHandlerProvider()
	 */
	@Override
	protected final ViewHandlerProvider initViewHandlerProvider() {
		ComposedViewHandlerProvider.Builder builder = new ComposedViewHandlerProvider.Builder();
		if (getSpecificViewHandlerProviders() != null && !getSpecificViewHandlerProviders().isEmpty()) {
			builder.addAllHandlers(getSpecificViewHandlerProviders());
		}
		return builder
						.addHandler(new PropertiesEditingViewHandlerProvider(buildPropertyEditorProvider()))
						.addHandler(new SWTViewHandlerProvider())
						.addHandler(new ReflectViewHandlerProvider())
							.build();
	}
	
	/**
	 * This method returns specific {@link ViewHandlerProvider}s to use in the context of this provider.
	 * This method can be overridden by subclasses to provide their own {@link ViewHandlerProvider}s.
	 * @return a collection of {@link ViewHandlerProvider}s.
	 */
	protected Collection<ViewHandlerProvider> getSpecificViewHandlerProviders() {
		return Collections.emptyList();
	}
	
	
	
	// Search all instances of PropertiesEditingModel in the given resource.
	// This implementation only search in the roots the resource.
	private Collection<? extends PropertiesEditingModel> getAllEditingModels(Resource resource) {
		Collection<PropertiesEditingModel> result = Lists.newArrayList();
		for (EObject root : resource.getContents()) {
			if (root instanceof PropertiesEditingModel) {
				result.add((PropertiesEditingModel) root);
			}
		}
		return result;
	}
	
	
	
	// Build the EEF default PropertyEditorProviders (i.e. SWTToolkit and EMFPropertiesToolkit).
	private PropertyEditorProvider buildPropertyEditorProvider() {
		return new ComposedPropertyEditorProvider.Builder()
						.addPropertyEditorProvider(new SWTToolkit())
						.addPropertyEditorProvider(new EMFPropertiesToolkit())
						.build();
	}
	
}
