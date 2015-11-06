package org.eclipse.sirius.expression.text.scoping

import org.eclipse.xtext.resource.containers.IContainerState
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.resource.containers.IAllContainersState

class ExpressionTextContainerState implements IContainerState {
	String root
	IAllContainersState globalState
	
	new(String root, org.eclipse.xtext.resource.containers.IAllContainersState state) {
		this.root = root
		this.globalState = state
	}
	
	override contains(URI uri) {
		return getContents().contains(uri)
	}
	
	override getContents() {
		return globalState.getContainedURIs(root)
	}
	
	override isEmpty() {
		return globalState.isEmpty(root)
	}
	
	override toString() {
		return "container '" + root +"' from "+globalState
	}
	
}