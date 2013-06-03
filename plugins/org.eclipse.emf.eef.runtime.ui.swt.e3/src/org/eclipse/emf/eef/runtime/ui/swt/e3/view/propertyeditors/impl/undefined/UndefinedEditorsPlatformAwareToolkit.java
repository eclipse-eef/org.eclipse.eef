/**
 * 
 */
package org.eclipse.emf.eef.runtime.ui.swt.e3.view.propertyeditors.impl.undefined;

import org.eclipse.emf.eef.runtime.ui.swt.e3.view.propertyeditors.impl.undefined.editor.UndefinedPlatformAwarePropertyEditorProvider;
import org.eclipse.emf.eef.runtime.ui.swt.view.propertyeditors.impl.undefined.UndefinedEditorsToolkit;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class UndefinedEditorsPlatformAwareToolkit extends UndefinedEditorsToolkit {

	/**
	 * TODO: Ugly pattern ... need a redesign.
	 * If we don't clear the editorProviders instanciated by the default constructor, the PlatformAware editorProviders
	 * aren't use since the editorProvider selection algorithm (method 
	 *  org.eclipse.emf.eef.runtime.ui.view.propertyeditors.impl.ToolkitPropertyEditorImpl.getPropertyEditor(PropertyEditorContext)) 
	 *  don't have an ordering system between the different editorProviders.
	 */
	public UndefinedEditorsPlatformAwareToolkit() {
		clearEditorProviders();
		addPropertyEditorProvider(new UndefinedPlatformAwarePropertyEditorProvider());
	}

}
