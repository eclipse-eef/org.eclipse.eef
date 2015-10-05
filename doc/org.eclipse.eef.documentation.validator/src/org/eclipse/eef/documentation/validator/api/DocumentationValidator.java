package org.eclipse.eef.documentation.validator.api;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

public class DocumentationValidator {
	private Set<EClassifier> eClassifiers = new LinkedHashSet<>();
	private Set<EStructuralFeature> eStructuralFeatures = new LinkedHashSet<>();
	
	private List<AbstractValidationStatus> status = new ArrayList<>();
	
	public void validateLines(Stream<String> lines, Resource resource) {
		EObject eObject = resource.getContents().get(0);
		if (eObject instanceof EPackage) {
			EPackage ePackage = (EPackage) eObject;
			
			// Validate the documentation
			lines.forEach(line -> {
				if (!line.contains("#")) {
					validateEClassifier(line, ePackage);
				} else {
					validateEStructuralFeature(line, ePackage);
				}
			});
			
			// Find the EClassifier that have not been documented
			ePackage.getEClassifiers().forEach(eClassifier -> {
				if (!eClassifiers.contains(eClassifier)) {
					this.status.add(new EClassifierValidationStatus(eClassifier, ValidationStatusKind.UNDOCUMENTED_ECLASSIFIER));
					System.out.println("Undocumented EClassifier \"" + eClassifier.getName() + "\"");
				}
				
				// Find the EStructuralFeature that have not been documented
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					eClass.getEStructuralFeatures().forEach(eStructuralFeature -> {
						if (!eStructuralFeatures.contains(eStructuralFeature)) {
							this.status.add(new EStructuralFeatureValidationStatus(eStructuralFeature, ValidationStatusKind.UNDOCUMENTED_ESTRUCTURAL_FEATURE));
							System.out.println("Undocumented EStructuralFeature \"" + eClass.getName() + "#" + eStructuralFeature.getName() + "\"");
						}
					});
				}
			});
			
		}
	}
	
	private String getQualifiedName(EStructuralFeature eStructuralFeature) {
		return eStructuralFeature.getEContainingClass().getName() + "#" + eStructuralFeature.getName();
	}

	private void validateEClassifier(String line, EPackage ePackage) {
		String eClassifierName = line.substring("* ".length()).trim();
		EClassifier eClassifier = ePackage.getEClassifier(eClassifierName);
		if (eClassifier == null) {
			this.status.add(new EClassifierValidationStatus(eClassifier, ValidationStatusKind.ECLASSIFIER_NOT_FOUND));
			System.err.println("EClassifier \"" + eClassifierName + "\" not found");
		} else {
			this.eClassifiers.add(eClassifier);
		}
	}

	private void validateEStructuralFeature(String line, EPackage ePackage) {
		String eStructuralFeatureDeclaration = line.substring("* ".length()).trim();
		String eClassifierName = eStructuralFeatureDeclaration.substring(0, eStructuralFeatureDeclaration.indexOf('#'));
		EClassifier eClassifier = ePackage.getEClassifier(eClassifierName);
		if (eClassifier == null) {
			this.status.add(new EClassifierValidationStatus(eClassifier, ValidationStatusKind.ECLASSIFIER_NOT_FOUND));
			System.err.println("EClassifier \"" + eClassifierName + "\" not found");
		} else {
			// We won't add the EClassifier here, it needs to be referenced directly
			
			String eStructuralFeatureName = eStructuralFeatureDeclaration.substring(eStructuralFeatureDeclaration.indexOf('#') + 1, eStructuralFeatureDeclaration.indexOf(':'));
			if (eClassifier instanceof EClass) {
				EClass eClass = (EClass) eClassifier;
				EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(eStructuralFeatureName);
				if (eStructuralFeature == null) {
					this.status.add(new EStructuralFeatureValidationStatus(eStructuralFeature, ValidationStatusKind.ESTRUCUTURAL_FEATURE_NOT_FOUND));
					System.err.println("EStructuralFeature \"" + eClassifierName + "#" + eStructuralFeatureName + "\" not found");
				} else {
					this.eStructuralFeatures.add(eStructuralFeature);
					
					validateEStructuralFeatureProperties(eStructuralFeatureDeclaration, eStructuralFeature);
				}
			}
		}
	}

	private void validateEStructuralFeatureProperties(String eStructuralFeatureDeclaration, EStructuralFeature eStructuralFeature) {
		String properties = eStructuralFeatureDeclaration.substring(eStructuralFeatureDeclaration.indexOf(":") + 1).trim();
		if (eStructuralFeature instanceof EAttribute) {
			// <type> [<lowerBound>..<upperBound>] return <type> [<lowerBound>..<upperBound>]
			EAttribute eAttribute = (EAttribute) eStructuralFeature;
			
			String type = properties.substring(0, properties.indexOf("[")).trim();
			String eAttributeType = eAttribute.getEAttributeType().getName();
			if (!eAttributeType.equals(type)) {
				this.status.add(new EStructuralFeatureValidationStatus(eStructuralFeature, ValidationStatusKind.INVALID_EATTRIBUTE_TYPE));
				System.err.println("Invalid EAttributeType for \"" + this.getQualifiedName(eStructuralFeature) + "\" expected \"" + eAttributeType + "\" but found \"" + type + "\"");
			}
			
			// <lowerBound> & <upperBound>
			String bounds = properties.substring(properties.indexOf("[") + 1, properties.indexOf("]"));
			this.validateBounds(bounds, eStructuralFeature);
		} else {
			// <type> [<lowerBound>..<upperBound>] <containment>
			EReference eReference = (EReference) eStructuralFeature;
			
			// <type>
			String type = properties.substring(0, properties.indexOf("[")).trim();
			String eReferenceType = eReference.getEReferenceType().getName();
			if (!eReferenceType.equals(type)) {
				this.status.add(new EStructuralFeatureValidationStatus(eStructuralFeature, ValidationStatusKind.INVALID_EREFERENCE_TYPE));
				System.err.println("Invalid EReferenceType for \"" + this.getQualifiedName(eStructuralFeature) + "\" expected \"" + eReferenceType + "\" but found \"" + type + "\"");
			}
			
			// <lowerBound> & <upperBound>
			String bounds = properties.substring(properties.indexOf("[") + 1, properties.indexOf("]"));
			this.validateBounds(bounds, eStructuralFeature);
			
			if (eReference.isContainment() && !properties.contains("containment")) {
				System.err.println("EReference \"" + this.getQualifiedName(eStructuralFeature) + "\" containment expected but non containment found");
			}
			if (properties.contains("containment") && !eReference.isContainment()) {
				System.err.println("EReference \"" + this.getQualifiedName(eStructuralFeature) + "\" non containment expected but containment found");
			}
		}
	}

	private void validateBounds(String bounds, EStructuralFeature eStructuralFeature) {
		int lowerBound = Integer.parseInt(bounds.substring(0, bounds.indexOf("..")));
		int upperBound = Integer.parseInt(bounds.substring(bounds.indexOf("..") + 2));
		
		if (eStructuralFeature.getLowerBound() != lowerBound) {
			System.err.println("Invalid lower bound for \"" + this.getQualifiedName(eStructuralFeature) + "\" expected \"" + eStructuralFeature.getLowerBound() + "\" but found \"" + lowerBound + "\"");
		}
		if (eStructuralFeature.getUpperBound() != upperBound) {
			System.err.println("Invalid upper bound for \"" + this.getQualifiedName(eStructuralFeature) + "\" expected \"" + eStructuralFeature.getUpperBound() + "\" but found \"" + upperBound + "\"");
		}
	}

}
