package org.eclipse.eef;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class EEFExpressionSetter {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ResourceSet resSet = new ResourceSetImpl();
		// Load ecore
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		Resource ecoreRes = resSet.getResource(URI.createFileURI("./model/expression.ecore"), true);
		EPackage expressionEPackage = (EPackage) ecoreRes.getContents().get(0);
		// Register EPackage
		resSet.getPackageRegistry().put(expressionEPackage.getNsURI(), expressionEPackage);
		// Load ecore
		Resource ecoreEefRes = resSet.getResource(URI.createFileURI("./model/eef.ecore"), true);
		EPackage eefEPackage = (EPackage) ecoreEefRes.getContents().get(0);

		// Register EPackage
		resSet.getPackageRegistry().put(eefEPackage.getNsURI(), eefEPackage);
		// Load XMI
		Resource xmiRes = resSet.getResource(URI.createFileURI("./model/EEFExpression.xmi"), true);
		EObject expressionPackage = (EObject) xmiRes.getContents().get(0);

		// setExpressionToVariables(expressionPackage);

		// Show expression to variables
		// printExpressionToVariables(expressionPackage);
		// xmiRes.save(null);

		setExpressionToContextableExpressions(eefEPackage, expressionPackage);

		printExpressionToContextableElements(expressionPackage);
		xmiRes.save(null);

	}

	private static void setExpressionToContextableExpressions(EPackage eefEPackage, EObject expressionPackage) {
		Map<String, EObject> contextableElements = getAllContextableElements(eefEPackage);
		// Get all expression classes
		List<EObject> expressionClasses = (List<EObject>) expressionPackage
				.eGet(expressionPackage.eClass().getEStructuralFeature("expressionClasses"));
		for (EObject expressionClass : expressionClasses) {
			Object expressionClassLabel = expressionClass.eGet(expressionClass.eClass().getEStructuralFeature("label"));
			// Get expression descriptions
			List<EObject> expressionDescriptions = (List<EObject>) expressionClass
					.eGet(expressionClass.eClass().getEStructuralFeature("expressionDescriptions"));
			for (EObject expressionDescription : expressionDescriptions) {
				Object expressionDescriptionLabel = expressionDescription
						.eGet(expressionDescription.eClass().getEStructuralFeature("label"));
				if (expressionClassLabel.equals("View")) {
					// Nothing
				} else if (expressionClassLabel.equals("Page")) {
					// Set view contextable elements
					((EList<EObject>) expressionDescription
							.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements")))
									.add(contextableElements.get("View"));
				} else if (expressionClassLabel.equals("Group")) {
					// Set view and page contextable elements
					((EList<EObject>) expressionDescription
							.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements")))
									.add(contextableElements.get("View"));
					((EList<EObject>) expressionDescription
							.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements")))
									.add(contextableElements.get("Page"));
				} else if (expressionClassLabel.equals("Container")) {
					// Set view, page, group contextable elements
					((EList<EObject>) expressionDescription
							.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements")))
									.add(contextableElements.get("View"));
					((EList<EObject>) expressionDescription
							.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements")))
									.add(contextableElements.get("Page"));
					((EList<EObject>) expressionDescription
							.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements")))
									.add(contextableElements.get("Group"));
				} else if (expressionClassLabel.equals("Widget")) {
					// Set view, page, group, container contextable elements
					((EList<EObject>) expressionDescription
							.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements")))
									.add(contextableElements.get("View"));
					((EList<EObject>) expressionDescription
							.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements")))
									.add(contextableElements.get("Page"));
					((EList<EObject>) expressionDescription
							.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements")))
									.add(contextableElements.get("Group"));
					((EList<EObject>) expressionDescription
							.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements")))
									.add(contextableElements.get("Container"));
				} else if (expressionClassLabel.equals("CellWidget")) {
					// Set view, page, group, container, widget contextable
					// elements
					((EList<EObject>) expressionDescription
							.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements")))
									.add(contextableElements.get("View"));
					((EList<EObject>) expressionDescription
							.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements")))
									.add(contextableElements.get("Page"));
					((EList<EObject>) expressionDescription
							.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements")))
									.add(contextableElements.get("Group"));
					((EList<EObject>) expressionDescription
							.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements")))
									.add(contextableElements.get("Container"));
					((EList<EObject>) expressionDescription
							.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements")))
									.add(contextableElements.get("Widget"));
				} else {
					((EList<EObject>) expressionDescription
							.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements")))
									.add(contextableElements.get("View"));
					((EList<EObject>) expressionDescription
							.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements")))
									.add(contextableElements.get("Page"));
					((EList<EObject>) expressionDescription
							.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements")))
									.add(contextableElements.get("Group"));
					((EList<EObject>) expressionDescription
							.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements")))
									.add(contextableElements.get("Container"));
				}
			}
		}
	}

	private static void setExpressionToVariables(EObject expressionPackage) {
		Map<String, List<EObject>> parentVariables = getAllParentVariables(expressionPackage);
		// Get all expression classes
		List<EObject> expressionClasses = (List<EObject>) expressionPackage
				.eGet(expressionPackage.eClass().getEStructuralFeature("expressionClasses"));
		for (EObject expressionClass : expressionClasses) {
			Object expressionClassLabel = expressionClass.eGet(expressionClass.eClass().getEStructuralFeature("label"));
			// Get expression descriptions
			List<EObject> expressionDescriptions = (List<EObject>) expressionClass
					.eGet(expressionClass.eClass().getEStructuralFeature("expressionDescriptions"));
			for (EObject expressionDescription : expressionDescriptions) {
				Object expressionDescriptionLabel = expressionDescription
						.eGet(expressionDescription.eClass().getEStructuralFeature("label"));
				if (expressionClassLabel.equals("View")) {
					// Nothing
				} else if (expressionClassLabel.equals("Page")) {
					// Set view variables
					for (EObject parentVariable : parentVariables.get("View")) {
						((EList<EObject>) expressionDescription
								.eGet(expressionDescription.eClass().getEStructuralFeature("variables")))
										.add(parentVariable);
					}
				} else if (expressionClassLabel.equals("Group")) {
					// Set view and page variables
					for (EObject parentVariable : parentVariables.get("View")) {
						((EList<EObject>) expressionDescription
								.eGet(expressionDescription.eClass().getEStructuralFeature("variables")))
										.add(parentVariable);
					}
					for (EObject parentVariable : parentVariables.get("Page")) {
						((EList<EObject>) expressionDescription
								.eGet(expressionDescription.eClass().getEStructuralFeature("variables")))
										.add(parentVariable);
					}
				} else if (expressionClassLabel.equals("Container")) {
					// Set view, page, group variables
					for (EObject parentVariable : parentVariables.get("View")) {
						((EList<EObject>) expressionDescription
								.eGet(expressionDescription.eClass().getEStructuralFeature("variables")))
										.add(parentVariable);
					}
					for (EObject parentVariable : parentVariables.get("Page")) {
						((EList<EObject>) expressionDescription
								.eGet(expressionDescription.eClass().getEStructuralFeature("variables")))
										.add(parentVariable);
					}
					for (EObject parentVariable : parentVariables.get("Group")) {
						((EList<EObject>) expressionDescription
								.eGet(expressionDescription.eClass().getEStructuralFeature("variables")))
										.add(parentVariable);
					}
				} else if (expressionClassLabel.equals("Widget")) {
					// Set view, page, group, container variables
					for (EObject parentVariable : parentVariables.get("View")) {
						((EList<EObject>) expressionDescription
								.eGet(expressionDescription.eClass().getEStructuralFeature("variables")))
										.add(parentVariable);
					}
					for (EObject parentVariable : parentVariables.get("Page")) {
						((EList<EObject>) expressionDescription
								.eGet(expressionDescription.eClass().getEStructuralFeature("variables")))
										.add(parentVariable);
					}
					for (EObject parentVariable : parentVariables.get("Group")) {
						((EList<EObject>) expressionDescription
								.eGet(expressionDescription.eClass().getEStructuralFeature("variables")))
										.add(parentVariable);
					}
					for (EObject parentVariable : parentVariables.get("Container")) {
						((EList<EObject>) expressionDescription
								.eGet(expressionDescription.eClass().getEStructuralFeature("variables")))
										.add(parentVariable);
					}
				} else if (expressionClassLabel.equals("CellWidget")) {
					// Set view, page, group, container, widget variables
					for (EObject parentVariable : parentVariables.get("View")) {
						((EList<EObject>) expressionDescription
								.eGet(expressionDescription.eClass().getEStructuralFeature("variables")))
										.add(parentVariable);
					}
					for (EObject parentVariable : parentVariables.get("Page")) {
						((EList<EObject>) expressionDescription
								.eGet(expressionDescription.eClass().getEStructuralFeature("variables")))
										.add(parentVariable);
					}
					for (EObject parentVariable : parentVariables.get("Group")) {
						((EList<EObject>) expressionDescription
								.eGet(expressionDescription.eClass().getEStructuralFeature("variables")))
										.add(parentVariable);
					}
					for (EObject parentVariable : parentVariables.get("Container")) {
						((EList<EObject>) expressionDescription
								.eGet(expressionDescription.eClass().getEStructuralFeature("variables")))
										.add(parentVariable);
					}
					for (EObject parentVariable : parentVariables.get("Widget")) {
						((EList<EObject>) expressionDescription
								.eGet(expressionDescription.eClass().getEStructuralFeature("variables")))
										.add(parentVariable);
					}
				} else {
					for (EObject parentVariable : parentVariables.get("View")) {
						((EList<EObject>) expressionDescription
								.eGet(expressionDescription.eClass().getEStructuralFeature("variables")))
										.add(parentVariable);
					}
					for (EObject parentVariable : parentVariables.get("Page")) {
						((EList<EObject>) expressionDescription
								.eGet(expressionDescription.eClass().getEStructuralFeature("variables")))
										.add(parentVariable);
					}
					for (EObject parentVariable : parentVariables.get("Group")) {
						((EList<EObject>) expressionDescription
								.eGet(expressionDescription.eClass().getEStructuralFeature("variables")))
										.add(parentVariable);
					}
					for (EObject parentVariable : parentVariables.get("Container")) {
						((EList<EObject>) expressionDescription
								.eGet(expressionDescription.eClass().getEStructuralFeature("variables")))
										.add(parentVariable);
					}
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	private static void printExpressionToVariables(EObject expressionPackage) {
		// Get all expression classes
		List<EObject> expressionClasses = (List<EObject>) expressionPackage
				.eGet(expressionPackage.eClass().getEStructuralFeature("expressionClasses"));
		for (EObject expressionClass : expressionClasses) {
			Object expressionClassLabel = expressionClass.eGet(expressionClass.eClass().getEStructuralFeature("label"));
			// Get expression descriptions
			List<EObject> expressionDescriptions = (List<EObject>) expressionClass
					.eGet(expressionClass.eClass().getEStructuralFeature("expressionDescriptions"));
			for (EObject expressionDescription : expressionDescriptions) {
				Object expressionDescriptionLabel = expressionDescription
						.eGet(expressionDescription.eClass().getEStructuralFeature("label"));
				// Get variables
				List<EObject> expressionVariables = (List<EObject>) expressionDescription
						.eGet(expressionDescription.eClass().getEStructuralFeature("variables"));
				for (EObject expressionVariable : expressionVariables) {
					Object expressionVariableName = expressionVariable
							.eGet(expressionVariable.eClass().getEStructuralFeature("name"));
					EObject expressionVariableContainer = expressionVariable.eContainer();
					Object expressionVariableContainerLabel = expressionVariableContainer
							.eGet(expressionVariableContainer.eClass().getEStructuralFeature("label"));
					System.out.println(expressionClassLabel + ":" + expressionDescriptionLabel + "->("
							+ expressionVariableContainerLabel + "," + expressionVariableName + ")");
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	private static Map<String, List<EObject>> getAllParentVariables(EObject expressionPackage) {
		Map<String, List<EObject>> parentVariables = new HashMap<String, List<EObject>>();
		// Get all expression classes
		List<EObject> expressionClasses = (List<EObject>) expressionPackage
				.eGet(expressionPackage.eClass().getEStructuralFeature("expressionClasses"));
		for (EObject expressionClass : expressionClasses) {
			String expressionClassLabel = (String) expressionClass
					.eGet(expressionClass.eClass().getEStructuralFeature("label"));
			// Get expression descriptions
			List<EObject> expressionDescriptions = (List<EObject>) expressionClass
					.eGet(expressionClass.eClass().getEStructuralFeature("expressionDescriptions"));
			for (EObject expressionDescription : expressionDescriptions) {
				// Get variables
				List<EObject> expressionVariables = (List<EObject>) expressionDescription
						.eGet(expressionDescription.eClass().getEStructuralFeature("variables"));
				for (EObject expressionVariable : expressionVariables) {
					if (expressionClassLabel.equals("View") || expressionClassLabel.equals("Page")
							|| expressionClassLabel.equals("Group") || expressionClassLabel.equals("Container")
							|| expressionClassLabel.equals("Widget") || expressionClassLabel.equals("CellWidget")) {
						List<EObject> variables = new ArrayList<EObject>();
						if (parentVariables.get(expressionClassLabel) != null) {
							variables = parentVariables.get(expressionClassLabel);
						}
						variables.add(expressionVariable);
						parentVariables.put(expressionClassLabel, variables);
					}
				}
			}
		}
		return parentVariables;
	}

	@SuppressWarnings("unchecked")
	private static void printExpressionToContextableElements(EObject expressionPackage) {
		// Get all expression classes
		List<EObject> expressionClasses = (List<EObject>) expressionPackage
				.eGet(expressionPackage.eClass().getEStructuralFeature("expressionClasses"));
		for (EObject expressionClass : expressionClasses) {
			Object expressionClassLabel = expressionClass.eGet(expressionClass.eClass().getEStructuralFeature("label"));
			// Get expression descriptions
			List<EObject> expressionDescriptions = (List<EObject>) expressionClass
					.eGet(expressionClass.eClass().getEStructuralFeature("expressionDescriptions"));
			for (EObject expressionDescription : expressionDescriptions) {
				Object expressionDescriptionLabel = expressionDescription
						.eGet(expressionDescription.eClass().getEStructuralFeature("label"));
				// Get contextableElements
				List<EObject> expressionContextableElements = (List<EObject>) expressionDescription
						.eGet(expressionDescription.eClass().getEStructuralFeature("contextableElements"));
				for (EObject expressionContextableElement : expressionContextableElements) {
					Object expressionContextableElementName = expressionContextableElement
							.eGet(expressionContextableElement.eClass().getEStructuralFeature("name"));
					System.out.println(expressionClassLabel + ":" + expressionDescriptionLabel + "-"
							+ expressionContextableElementName);
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	private static Map<String, EObject> getAllContextableElements(EObject eefEPackage) {
		Map<String, EObject> contextableElements = new HashMap<String, EObject>();
		for (EObject eObject : eefEPackage.eContents()) {
			if (eObject.eGet(eObject.eClass().getEStructuralFeature("name")).equals("View")
					|| eObject.eGet(eObject.eClass().getEStructuralFeature("name")).equals("Page")
					|| eObject.eGet(eObject.eClass().getEStructuralFeature("name")).equals("Group")
					|| eObject.eGet(eObject.eClass().getEStructuralFeature("name")).equals("Container")
					|| eObject.eGet(eObject.eClass().getEStructuralFeature("name")).equals("Widget")) {
				contextableElements.put((String) eObject.eGet(eObject.eClass().getEStructuralFeature("name")), eObject);
			}
		}
		System.out.println(contextableElements);
		return contextableElements;
	}

}
