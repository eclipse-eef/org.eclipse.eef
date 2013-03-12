/**
 * 
 */
package org.eclipse.emf.eef.runtime.ui.view.propertyeditors;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public interface PropertyEditorViewer<VIEWER> {

	/**
	 * @return the main {@link Viewer} of this editor.
	 */
	VIEWER getViewer();

	/**
	 * Locks the current editor towards the given {@link EEFPropertyLock}.
	 * @param lock lock configuration.
	 */
	void lock();
	
	/**
	 * Unlocks the current editor.
	 */
	void unlock();
}
