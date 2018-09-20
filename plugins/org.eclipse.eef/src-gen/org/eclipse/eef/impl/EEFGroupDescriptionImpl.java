/**
 * Copyright (c) 2015, 2018 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors: Obeo - initial API and implementation
 */
package org.eclipse.eef.impl;

import java.util.Collection;

import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.EEFGroupConditionalStyle;
import org.eclipse.eef.EEFGroupDescription;
import org.eclipse.eef.EEFGroupStyle;
import org.eclipse.eef.EEFPropertyValidationRuleDescription;
import org.eclipse.eef.EEFSemanticValidationRuleDescription;
import org.eclipse.eef.EEFToolbarAction;
import org.eclipse.eef.EefPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>EEF Group Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.eef.impl.EEFGroupDescriptionImpl#getIdentifier <em>Identifier</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFGroupDescriptionImpl#getLabelExpression <em>Label Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFGroupDescriptionImpl#getDomainClass <em>Domain Class</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFGroupDescriptionImpl#getSemanticCandidateExpression <em>Semantic Candidate
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFGroupDescriptionImpl#getPreconditionExpression <em>Precondition
 * Expression</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFGroupDescriptionImpl#getControls <em>Controls</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFGroupDescriptionImpl#getSemanticValidationRules <em>Semantic Validation
 * Rules</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFGroupDescriptionImpl#getPropertyValidationRules <em>Property Validation
 * Rules</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFGroupDescriptionImpl#getStyle <em>Style</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFGroupDescriptionImpl#getConditionalStyles <em>Conditional Styles</em>}</li>
 * <li>{@link org.eclipse.eef.impl.EEFGroupDescriptionImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEFGroupDescriptionImpl extends MinimalEObjectImpl.Container implements EEFGroupDescription {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = EEFGroupDescriptionImpl.IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelExpression() <em>Label Expression</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getLabelExpression()
	 * @generated
	 * @ordered
	 */
	protected String labelExpression = EEFGroupDescriptionImpl.LABEL_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainClass() <em>Domain Class</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDomainClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainClass() <em>Domain Class</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDomainClass()
	 * @generated
	 * @ordered
	 */
	protected String domainClass = EEFGroupDescriptionImpl.DOMAIN_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemanticCandidateExpression() <em>Semantic Candidate Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSemanticCandidateExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticCandidateExpression() <em>Semantic Candidate Expression</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSemanticCandidateExpression()
	 * @generated
	 * @ordered
	 */
	protected String semanticCandidateExpression = EEFGroupDescriptionImpl.SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreconditionExpression() <em>Precondition Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPreconditionExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDITION_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreconditionExpression() <em>Precondition Expression</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPreconditionExpression()
	 * @generated
	 * @ordered
	 */
	protected String preconditionExpression = EEFGroupDescriptionImpl.PRECONDITION_EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFControlDescription> controls;

	/**
	 * The cached value of the '{@link #getSemanticValidationRules() <em>Semantic Validation Rules</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSemanticValidationRules()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFSemanticValidationRuleDescription> semanticValidationRules;

	/**
	 * The cached value of the '{@link #getPropertyValidationRules() <em>Property Validation Rules</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPropertyValidationRules()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFPropertyValidationRuleDescription> propertyValidationRules;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected EEFGroupStyle style;

	/**
	 * The cached value of the '{@link #getConditionalStyles() <em>Conditional Styles</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConditionalStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFGroupConditionalStyle> conditionalStyles;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<EEFToolbarAction> actions;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EEFGroupDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPackage.Literals.EEF_GROUP_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_GROUP_DESCRIPTION__IDENTIFIER, oldIdentifier, identifier));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getLabelExpression() {
		return labelExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLabelExpression(String newLabelExpression) {
		String oldLabelExpression = labelExpression;
		labelExpression = newLabelExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_GROUP_DESCRIPTION__LABEL_EXPRESSION, oldLabelExpression,
					labelExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getDomainClass() {
		return domainClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDomainClass(String newDomainClass) {
		String oldDomainClass = domainClass;
		domainClass = newDomainClass;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_GROUP_DESCRIPTION__DOMAIN_CLASS, oldDomainClass, domainClass));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getSemanticCandidateExpression() {
		return semanticCandidateExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSemanticCandidateExpression(String newSemanticCandidateExpression) {
		String oldSemanticCandidateExpression = semanticCandidateExpression;
		semanticCandidateExpression = newSemanticCandidateExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_GROUP_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION,
					oldSemanticCandidateExpression, semanticCandidateExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getPreconditionExpression() {
		return preconditionExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPreconditionExpression(String newPreconditionExpression) {
		String oldPreconditionExpression = preconditionExpression;
		preconditionExpression = newPreconditionExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_GROUP_DESCRIPTION__PRECONDITION_EXPRESSION,
					oldPreconditionExpression, preconditionExpression));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EEFControlDescription> getControls() {
		if (controls == null) {
			controls = new EObjectContainmentEList.Resolving<>(EEFControlDescription.class, this,
					EefPackage.EEF_GROUP_DESCRIPTION__CONTROLS);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EEFSemanticValidationRuleDescription> getSemanticValidationRules() {
		if (semanticValidationRules == null) {
			semanticValidationRules = new EObjectContainmentEList.Resolving<>(
					EEFSemanticValidationRuleDescription.class, this, EefPackage.EEF_GROUP_DESCRIPTION__SEMANTIC_VALIDATION_RULES);
		}
		return semanticValidationRules;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EEFPropertyValidationRuleDescription> getPropertyValidationRules() {
		if (propertyValidationRules == null) {
			propertyValidationRules = new EObjectContainmentEList.Resolving<>(
					EEFPropertyValidationRuleDescription.class, this, EefPackage.EEF_GROUP_DESCRIPTION__PROPERTY_VALIDATION_RULES);
		}
		return propertyValidationRules;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEFGroupStyle getStyle() {
		if (style != null && style.eIsProxy()) {
			InternalEObject oldStyle = (InternalEObject) style;
			style = (EEFGroupStyle) eResolveProxy(oldStyle);
			if (style != oldStyle) {
				InternalEObject newStyle = (InternalEObject) style;
				NotificationChain msgs = oldStyle.eInverseRemove(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_GROUP_DESCRIPTION__STYLE, null, null);
				if (newStyle.eInternalContainer() == null) {
					msgs = newStyle.eInverseAdd(this, InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_GROUP_DESCRIPTION__STYLE, null, msgs);
				}
				if (msgs != null) {
					msgs.dispatch();
				}
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefPackage.EEF_GROUP_DESCRIPTION__STYLE, oldStyle, style));
				}
			}
		}
		return style;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEFGroupStyle basicGetStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStyle(EEFGroupStyle newStyle, NotificationChain msgs) {
		EEFGroupStyle oldStyle = style;
		style = newStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EefPackage.EEF_GROUP_DESCRIPTION__STYLE, oldStyle,
					newStyle);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setStyle(EEFGroupStyle newStyle) {
		if (newStyle != style) {
			NotificationChain msgs = null;
			if (style != null) {
				msgs = ((InternalEObject) style).eInverseRemove(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_GROUP_DESCRIPTION__STYLE, null, msgs);
			}
			if (newStyle != null) {
				msgs = ((InternalEObject) newStyle).eInverseAdd(this,
						InternalEObject.EOPPOSITE_FEATURE_BASE - EefPackage.EEF_GROUP_DESCRIPTION__STYLE, null, msgs);
			}
			msgs = basicSetStyle(newStyle, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, EefPackage.EEF_GROUP_DESCRIPTION__STYLE, newStyle, newStyle));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EEFGroupConditionalStyle> getConditionalStyles() {
		if (conditionalStyles == null) {
			conditionalStyles = new EObjectContainmentEList.Resolving<>(EEFGroupConditionalStyle.class, this,
					EefPackage.EEF_GROUP_DESCRIPTION__CONDITIONAL_STYLES);
		}
		return conditionalStyles;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<EEFToolbarAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList.Resolving<>(EEFToolbarAction.class, this,
					EefPackage.EEF_GROUP_DESCRIPTION__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EefPackage.EEF_GROUP_DESCRIPTION__CONTROLS:
			return ((InternalEList<?>) getControls()).basicRemove(otherEnd, msgs);
		case EefPackage.EEF_GROUP_DESCRIPTION__SEMANTIC_VALIDATION_RULES:
			return ((InternalEList<?>) getSemanticValidationRules()).basicRemove(otherEnd, msgs);
		case EefPackage.EEF_GROUP_DESCRIPTION__PROPERTY_VALIDATION_RULES:
			return ((InternalEList<?>) getPropertyValidationRules()).basicRemove(otherEnd, msgs);
		case EefPackage.EEF_GROUP_DESCRIPTION__STYLE:
			return basicSetStyle(null, msgs);
		case EefPackage.EEF_GROUP_DESCRIPTION__CONDITIONAL_STYLES:
			return ((InternalEList<?>) getConditionalStyles()).basicRemove(otherEnd, msgs);
		case EefPackage.EEF_GROUP_DESCRIPTION__ACTIONS:
			return ((InternalEList<?>) getActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefPackage.EEF_GROUP_DESCRIPTION__IDENTIFIER:
			return getIdentifier();
		case EefPackage.EEF_GROUP_DESCRIPTION__LABEL_EXPRESSION:
			return getLabelExpression();
		case EefPackage.EEF_GROUP_DESCRIPTION__DOMAIN_CLASS:
			return getDomainClass();
		case EefPackage.EEF_GROUP_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION:
			return getSemanticCandidateExpression();
		case EefPackage.EEF_GROUP_DESCRIPTION__PRECONDITION_EXPRESSION:
			return getPreconditionExpression();
		case EefPackage.EEF_GROUP_DESCRIPTION__CONTROLS:
			return getControls();
		case EefPackage.EEF_GROUP_DESCRIPTION__SEMANTIC_VALIDATION_RULES:
			return getSemanticValidationRules();
		case EefPackage.EEF_GROUP_DESCRIPTION__PROPERTY_VALIDATION_RULES:
			return getPropertyValidationRules();
		case EefPackage.EEF_GROUP_DESCRIPTION__STYLE:
			if (resolve) {
				return getStyle();
			}
			return basicGetStyle();
		case EefPackage.EEF_GROUP_DESCRIPTION__CONDITIONAL_STYLES:
			return getConditionalStyles();
		case EefPackage.EEF_GROUP_DESCRIPTION__ACTIONS:
			return getActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EefPackage.EEF_GROUP_DESCRIPTION__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__LABEL_EXPRESSION:
			setLabelExpression((String) newValue);
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__DOMAIN_CLASS:
			setDomainClass((String) newValue);
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION:
			setSemanticCandidateExpression((String) newValue);
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__PRECONDITION_EXPRESSION:
			setPreconditionExpression((String) newValue);
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__CONTROLS:
			getControls().clear();
			getControls().addAll((Collection<? extends EEFControlDescription>) newValue);
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__SEMANTIC_VALIDATION_RULES:
			getSemanticValidationRules().clear();
			getSemanticValidationRules().addAll((Collection<? extends EEFSemanticValidationRuleDescription>) newValue);
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__PROPERTY_VALIDATION_RULES:
			getPropertyValidationRules().clear();
			getPropertyValidationRules().addAll((Collection<? extends EEFPropertyValidationRuleDescription>) newValue);
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__STYLE:
			setStyle((EEFGroupStyle) newValue);
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__CONDITIONAL_STYLES:
			getConditionalStyles().clear();
			getConditionalStyles().addAll((Collection<? extends EEFGroupConditionalStyle>) newValue);
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends EEFToolbarAction>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EefPackage.EEF_GROUP_DESCRIPTION__IDENTIFIER:
			setIdentifier(EEFGroupDescriptionImpl.IDENTIFIER_EDEFAULT);
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__LABEL_EXPRESSION:
			setLabelExpression(EEFGroupDescriptionImpl.LABEL_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__DOMAIN_CLASS:
			setDomainClass(EEFGroupDescriptionImpl.DOMAIN_CLASS_EDEFAULT);
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION:
			setSemanticCandidateExpression(EEFGroupDescriptionImpl.SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__PRECONDITION_EXPRESSION:
			setPreconditionExpression(EEFGroupDescriptionImpl.PRECONDITION_EXPRESSION_EDEFAULT);
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__CONTROLS:
			getControls().clear();
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__SEMANTIC_VALIDATION_RULES:
			getSemanticValidationRules().clear();
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__PROPERTY_VALIDATION_RULES:
			getPropertyValidationRules().clear();
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__STYLE:
			setStyle((EEFGroupStyle) null);
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__CONDITIONAL_STYLES:
			getConditionalStyles().clear();
			return;
		case EefPackage.EEF_GROUP_DESCRIPTION__ACTIONS:
			getActions().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EefPackage.EEF_GROUP_DESCRIPTION__IDENTIFIER:
			return EEFGroupDescriptionImpl.IDENTIFIER_EDEFAULT == null ? identifier != null
					: !EEFGroupDescriptionImpl.IDENTIFIER_EDEFAULT.equals(identifier);
		case EefPackage.EEF_GROUP_DESCRIPTION__LABEL_EXPRESSION:
			return EEFGroupDescriptionImpl.LABEL_EXPRESSION_EDEFAULT == null ? labelExpression != null
					: !EEFGroupDescriptionImpl.LABEL_EXPRESSION_EDEFAULT.equals(labelExpression);
		case EefPackage.EEF_GROUP_DESCRIPTION__DOMAIN_CLASS:
			return EEFGroupDescriptionImpl.DOMAIN_CLASS_EDEFAULT == null ? domainClass != null
					: !EEFGroupDescriptionImpl.DOMAIN_CLASS_EDEFAULT.equals(domainClass);
		case EefPackage.EEF_GROUP_DESCRIPTION__SEMANTIC_CANDIDATE_EXPRESSION:
			return EEFGroupDescriptionImpl.SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT == null ? semanticCandidateExpression != null
					: !EEFGroupDescriptionImpl.SEMANTIC_CANDIDATE_EXPRESSION_EDEFAULT.equals(semanticCandidateExpression);
		case EefPackage.EEF_GROUP_DESCRIPTION__PRECONDITION_EXPRESSION:
			return EEFGroupDescriptionImpl.PRECONDITION_EXPRESSION_EDEFAULT == null ? preconditionExpression != null
					: !EEFGroupDescriptionImpl.PRECONDITION_EXPRESSION_EDEFAULT.equals(preconditionExpression);
		case EefPackage.EEF_GROUP_DESCRIPTION__CONTROLS:
			return controls != null && !controls.isEmpty();
		case EefPackage.EEF_GROUP_DESCRIPTION__SEMANTIC_VALIDATION_RULES:
			return semanticValidationRules != null && !semanticValidationRules.isEmpty();
		case EefPackage.EEF_GROUP_DESCRIPTION__PROPERTY_VALIDATION_RULES:
			return propertyValidationRules != null && !propertyValidationRules.isEmpty();
		case EefPackage.EEF_GROUP_DESCRIPTION__STYLE:
			return style != null;
		case EefPackage.EEF_GROUP_DESCRIPTION__CONDITIONAL_STYLES:
			return conditionalStyles != null && !conditionalStyles.isEmpty();
		case EefPackage.EEF_GROUP_DESCRIPTION__ACTIONS:
			return actions != null && !actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (identifier: "); //$NON-NLS-1$
		result.append(identifier);
		result.append(", labelExpression: "); //$NON-NLS-1$
		result.append(labelExpression);
		result.append(", domainClass: "); //$NON-NLS-1$
		result.append(domainClass);
		result.append(", semanticCandidateExpression: "); //$NON-NLS-1$
		result.append(semanticCandidateExpression);
		result.append(", preconditionExpression: "); //$NON-NLS-1$
		result.append(preconditionExpression);
		result.append(')');
		return result.toString();
	}

} // EEFGroupDescriptionImpl
