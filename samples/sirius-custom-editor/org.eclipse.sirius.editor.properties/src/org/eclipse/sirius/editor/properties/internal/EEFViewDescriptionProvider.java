package org.eclipse.sirius.editor.properties.internal;

import org.eclipse.eef.EEFContainerDescription;
import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFPageDescription;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFViewDescription;
import org.eclipse.eef.EefFactory;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.api.IEEFViewDescriptionProvider;

public class EEFViewDescriptionProvider implements IEEFViewDescriptionProvider {

	@Override
	public EEFViewDescription get() {
		EefFactory eefFactory = EefPackage.eINSTANCE.getEefFactory();
		EEFViewDescription eefViewDescription = eefFactory.createEEFViewDescription();
		eefViewDescription.setIdentifier("eefPage");
		
		EEFPageDescription eefPageDescription = eefFactory.createEEFPageDescription();
		eefPageDescription.setIdentifier("eefPage");
		eefPageDescription.setLabelExpression("aql:viewSemanticCandidate.name");
		eefPageDescription.setSemanticCandidateExpression("aql:viewSemanticCandidate");
		eefViewDescription.getPages().add(eefPageDescription);
		
		EEFGroupDescription eefGroupDescription = eefFactory.createEEFGroupDescription();
		eefGroupDescription.setIdentifier("eefGroup");
		eefViewDescription.getGroups().add(eefGroupDescription);
		eefPageDescription.getGroups().add(eefGroupDescription);
		
		EEFContainerDescription eefContainerDescription = eefFactory.createEEFContainerDescription();
		EEFTextDescription eefTextDescription = eefFactory.createEEFTextDescription();
		eefTextDescription.setLabelExpression("aql:'label'");
		eefTextDescription.setValueExpression("aql:groupSemanticCandidate.name");
		eefContainerDescription.getWidgets().add(eefTextDescription);
		eefGroupDescription.setContainer(eefContainerDescription);
		
		return eefViewDescription;
	}

}
