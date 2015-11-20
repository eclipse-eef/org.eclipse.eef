package org.eclipse.sirius.expression.text.scoping

import org.eclipse.xtext.resource.containers.StateBasedContainer
import org.eclipse.xtext.resource.IResourceDescriptions
import org.eclipse.xtext.resource.containers.IContainerState
import org.eclipse.xtext.resource.IEObjectDescription

class ExpressionTextStateBasedContainer extends StateBasedContainer {
	
	new(IResourceDescriptions descriptions, IContainerState state) {
		super(descriptions, state)
	}
	
	override protected filterByURI(Iterable<IEObjectDescription> unfiltered) {
		// Do not filter anything
		return unfiltered
	}
	
}