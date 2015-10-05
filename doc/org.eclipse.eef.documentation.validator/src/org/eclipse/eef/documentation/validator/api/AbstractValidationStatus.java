package org.eclipse.eef.documentation.validator.api;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractValidationStatus {
	private ValidationStatusKind validationStatusKind;
	
	protected List<Object> additionalInformation = new ArrayList<>();
	
	public AbstractValidationStatus(ValidationStatusKind validationStatusKind) {
		this.validationStatusKind = validationStatusKind;
	}
	
	public ValidationStatusKind getValidationStatusKind() {
		return validationStatusKind;
	}
	
	public List<Object> getAdditionalInformation() {
		return additionalInformation;
	}
}
