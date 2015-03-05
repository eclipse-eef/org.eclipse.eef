/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.eef.runtime.editingModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.eef.runtime.editingModel.EClassBinding#getEditingModel <em>Editing Model</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.runtime.editingModel.EClassBinding#getEClass <em>EClass</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.runtime.editingModel.EClassBinding#getViews <em>Views</em>}</li>
 *   <li>{@link org.eclipse.emf.eef.runtime.editingModel.EClassBinding#getPropertyBindings <em>Property Bindings</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.eef.runtime.editingModel.EditingModelPackage#getEClassBinding()
 * @model
 * @extends EModelElement
 * @generated
 */
public interface EClassBinding extends EModelElement {
	/**
	 * Returns the value of the '<em><b>Editing Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.eef.runtime.editingModel.PropertiesEditingModel#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editing Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editing Model</em>' container reference.
	 * @see #setEditingModel(PropertiesEditingModel)
	 * @see org.eclipse.emf.eef.runtime.editingModel.EditingModelPackage#getEClassBinding_EditingModel()
	 * @see org.eclipse.emf.eef.runtime.editingModel.PropertiesEditingModel#getBindings
	 * @model opposite="bindings" required="true" transient="false"
	 * @generated
	 */
	PropertiesEditingModel getEditingModel();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.runtime.editingModel.EClassBinding#getEditingModel <em>Editing Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editing Model</em>' container reference.
	 * @see #getEditingModel()
	 * @generated
	 */
	void setEditingModel(PropertiesEditingModel value);

	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @see org.eclipse.emf.eef.runtime.editingModel.EditingModelPackage#getEClassBinding_EClass()
	 * @model required="true"
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.eef.runtime.editingModel.EClassBinding#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.runtime.editingModel.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see org.eclipse.emf.eef.runtime.editingModel.EditingModelPackage#getEClassBinding_Views()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<View> getViews();

	/**
	 * Returns the value of the '<em><b>Property Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.eef.runtime.editingModel.PropertyBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Bindings</em>' containment reference list.
	 * @see org.eclipse.emf.eef.runtime.editingModel.EditingModelPackage#getEClassBinding_PropertyBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyBinding> getPropertyBindings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eObjectRequired="true" featureRequired="true" autowireRequired="true"
	 * @generated
	 */
	Object propertyEditor(EObject eObject, EStructuralFeature feature, boolean autowire);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model viewRequired="true" autowireRequired="true"
	 * @generated
	 */
	PropertyBinding propertyBinding(Object view, boolean autowire);

} // EClassBinding
