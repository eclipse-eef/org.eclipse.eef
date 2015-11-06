package org.eclipse.sirius.expression.text.scoping

import org.eclipse.xtext.resource.IResourceDescriptions
import org.eclipse.xtext.resource.containers.FlatResourceSetBasedAllContainersState
import org.eclipse.xtext.resource.containers.StateBasedContainerManager

class ExpressionTextStatedContainerManager extends StateBasedContainerManager {	
	
	override protected createContainer(String handle, IResourceDescriptions resourceDescriptions) {
		val state = getState(resourceDescriptions);
		val containerState = new org.eclipse.sirius.expression.text.scoping.ExpressionTextContainerState(handle, state);
		val result = new org.eclipse.sirius.expression.text.scoping.ExpressionTextStateBasedContainer(resourceDescriptions, containerState);
		if (state instanceof FlatResourceSetBasedAllContainersState)
			result.setUriToDescriptionCacheEnabled(false);
		return result;
	}
	
}

