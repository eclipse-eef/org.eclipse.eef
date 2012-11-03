/**
 * 
 */
package org.eclipse.emf.eef.runtime.internal.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.editingModel.EClassBinding;
import org.eclipse.emf.eef.runtime.notify.PropertiesEditingEvent;
import org.eclipse.emf.eef.runtime.policies.EditingPolicyProcessing;
import org.eclipse.emf.eef.runtime.policies.EditingPolicyProcessing.ProcessingKind;

/**
 * @author <a href="mailto:goulwen.lefur@obeo.fr">Goulwen Le Fur</a>
 *
 */
public abstract class EObjectEditingPolicy extends AbstractEditingPolicyWithProcessor {

	private PropertiesEditingContext editingContext;
	private PropertiesEditingEvent editingEvent;

	/**
	 * @param editingContext
	 * @param editingEvent
	 */
	public EObjectEditingPolicy(PropertiesEditingContext editingContext, PropertiesEditingEvent editingEvent) {
		this.editingContext = editingContext;
		this.editingEvent = editingEvent;
	}

	/**
	 * @return the editingContext
	 */
	public PropertiesEditingContext getEditingContext() {
		return editingContext;
	}

	/**
	 * @return the editingEvent
	 */
	public final PropertiesEditingEvent getEditingEvent() {
		return editingEvent;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.internal.policies.AbstractEditingPolicyWithProcessor#getPolicyProcessing()
	 */
	@Override
	protected EditingPolicyProcessing getPolicyProcessing() {
		EditingPolicyProcessing processing = new EditingPolicyProcessing();
		EClassBinding binding = editingContext.getEditingComponent().getBinding();
		EStructuralFeature bindingFeature = binding.feature(editingEvent.getAffectedEditor(), editingContext.getEditingComponent().getEditingContext().getOptions().autowire());
		EObject editedObject = (EObject)editingContext.getEditingComponent().getEObject();
		EStructuralFeature feature = editingContext.getEditingComponent().getEditingContext().getEMFService().mapFeature(editedObject, bindingFeature);
		if (feature != null) {
			processing.target = editedObject;
			processing.feature = feature;
			switch (editingEvent.getEventType()) {
			case PropertiesEditingEvent.SET:
				processing.processingKind = ProcessingKind.SET;
				processing.value = editingEvent.getNewValue();
				break;
			case PropertiesEditingEvent.UNSET:
				processing.processingKind = ProcessingKind.UNSET;
				break;
			case PropertiesEditingEvent.ADD:
				processing.processingKind = ProcessingKind.ADD;
				processing.value = editingEvent.getNewValue();
				break;
			case PropertiesEditingEvent.ADD_MANY:
				processing.processingKind = ProcessingKind.ADD_MANY;
				processing.value = editingEvent.getNewValue();
				break;	
			case PropertiesEditingEvent.REMOVE:
				processing.processingKind = ProcessingKind.REMOVE;
				processing.value = editingEvent.getOldValue();
				break;
			case PropertiesEditingEvent.REMOVE_MANY:
				processing.processingKind = ProcessingKind.REMOVE_MANY;
				processing.value = editingEvent.getOldValue();
				break;
			case PropertiesEditingEvent.MOVE:
				processing.processingKind = ProcessingKind.MOVE;
				processing.oldIndex = (Integer)editingEvent.getOldValue();
				processing.newIndex = (Integer)editingEvent.getNewValue();
				break;
			default:
				processing.processingKind = ProcessingKind.SET;
				processing.value = editingEvent.getNewValue();
				break;
			}
		}
		return processing;
	}

}
