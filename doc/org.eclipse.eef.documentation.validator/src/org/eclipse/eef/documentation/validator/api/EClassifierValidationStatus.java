package org.eclipse.eef.documentation.validator.api;

import org.eclipse.emf.ecore.EClassifier;

public class EClassifierValidationStatus extends AbstractValidationStatus {

	private EClassifier eClassifier;

	public EClassifierValidationStatus(EClassifier eClassifier, ValidationStatusKind validationStatusKind) {
		super(validationStatusKind);
		this.eClassifier = eClassifier;
	}
	
	public EClassifier getEClassifier() {
		return eClassifier;
	}

}
