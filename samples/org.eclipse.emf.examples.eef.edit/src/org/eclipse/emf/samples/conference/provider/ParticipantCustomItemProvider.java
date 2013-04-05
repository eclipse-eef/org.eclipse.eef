/**
 * 
 */
package org.eclipse.emf.samples.conference.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public class ParticipantCustomItemProvider extends ParticipantItemProvider implements ITableItemLabelProvider {

	/**
	 * @param adapterFactory
	 */
	public ParticipantCustomItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getColumnImage(java.lang.Object, int)
	 */
	
	public Object getColumnImage(Object object, int columnIndex) {
		return getImage(object);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getColumnText(java.lang.Object, int)
	 */
	
	public String getColumnText(Object object, int columnIndex) {
		return getText(object);
	}

}
