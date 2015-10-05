package org.eclipse.eef.documentation.validator.api;

import org.eclipse.emf.ecore.EStructuralFeature;

public class EStructuralFeatureValidationStatus extends AbstractValidationStatus {

	private EStructuralFeature eStructuralFeature;

	public EStructuralFeatureValidationStatus(EStructuralFeature eStructuralFeature, ValidationStatusKind validationStatusKind) {
		super(validationStatusKind);
		this.eStructuralFeature = eStructuralFeature;
	}
	
	public EStructuralFeature getEStructuralFeature() {
		return eStructuralFeature;
	}

}
