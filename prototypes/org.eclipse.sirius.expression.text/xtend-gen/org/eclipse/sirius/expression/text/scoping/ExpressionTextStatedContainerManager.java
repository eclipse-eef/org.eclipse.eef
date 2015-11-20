package org.eclipse.sirius.expression.text.scoping;

import org.eclipse.sirius.expression.text.scoping.ExpressionTextContainerState;
import org.eclipse.sirius.expression.text.scoping.ExpressionTextStateBasedContainer;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.containers.FlatResourceSetBasedAllContainersState;
import org.eclipse.xtext.resource.containers.IAllContainersState;
import org.eclipse.xtext.resource.containers.StateBasedContainerManager;

@SuppressWarnings("all")
public class ExpressionTextStatedContainerManager extends StateBasedContainerManager {
  @Override
  protected IContainer createContainer(final String handle, final IResourceDescriptions resourceDescriptions) {
    final IAllContainersState state = this.getState(resourceDescriptions);
    final ExpressionTextContainerState containerState = new ExpressionTextContainerState(handle, state);
    final ExpressionTextStateBasedContainer result = new ExpressionTextStateBasedContainer(resourceDescriptions, containerState);
    if ((state instanceof FlatResourceSetBasedAllContainersState)) {
      result.setUriToDescriptionCacheEnabled(false);
    }
    return result;
  }
}
