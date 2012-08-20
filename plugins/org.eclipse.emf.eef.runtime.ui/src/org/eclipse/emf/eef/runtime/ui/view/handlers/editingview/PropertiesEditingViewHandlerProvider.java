/**
 * 
 */
package org.eclipse.emf.eef.runtime.ui.view.handlers.editingview;

import org.eclipse.emf.eef.runtime.binding.PropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.ui.view.PropertiesEditingView;
import org.eclipse.emf.eef.runtime.ui.view.propertyeditors.PropertyEditorProvider;
import org.eclipse.emf.eef.runtime.ui.view.services.ViewServiceRegistry;
import org.eclipse.emf.eef.runtime.view.handler.ViewHandler;
import org.eclipse.emf.eef.runtime.view.handler.ViewHandlerProvider;
import org.eclipse.emf.eef.views.View;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class PropertiesEditingViewHandlerProvider implements ViewHandlerProvider {

	private PropertyEditorProvider propertyEditorProvider;
	private ViewServiceRegistry viewServiceRegistry;
	
	/**
	 * @param propertyEditorProvider {@link PropertyEditorProvider} to use in {@link PropertiesEditingView}s to build
	 * 								their contents.
	 */
	public PropertiesEditingViewHandlerProvider(PropertyEditorProvider propertyEditorProvider) {
		this.propertyEditorProvider = propertyEditorProvider;
	}

	/**
	 * @return the propertyEditorProvider
	 */
	public PropertyEditorProvider getPropertyEditorProvider() {
		return propertyEditorProvider;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.view.handler.ViewHandlerProvider#canHandle(java.lang.Object)
	 */
	public boolean canHandle(Object view) {
		return view instanceof View;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.view.handler.ViewHandlerProvider#getHandler(org.eclipse.emf.eef.runtime.binding.PropertiesEditingComponent, java.lang.Object)
	 */
	public ViewHandler<?> getHandler(PropertiesEditingComponent editingComponent, Object view) {
		return new PropertiesEditingViewHandler(this, editingComponent, (View) view);
	}

	/**
	 * Returns the {@link ViewServiceRegistry} to use in the views created via this provider.
	 * @return the {@link ViewServiceRegistry} to use.
	 */
	public ViewServiceRegistry getViewServiceRegistry() {
		return viewServiceRegistry;
	}

	/**
	 * Defines the {@link ViewServiceRegistry} to use in the views created via this provider. 
	 * @param viewServiceRegistry the viewServiceRegistry to set
	 */
	public void setViewServiceRegistry(ViewServiceRegistry viewServiceRegistry) {
		this.viewServiceRegistry = viewServiceRegistry;
	}

}
