/*
 * generated by Xtext
 */
package org.eclipse.sirius.expression.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.expression.dsl.expressionDSL.ExpressionDSLPackage;
import org.eclipse.sirius.expression.dsl.expressionDSL.Parameter;
import org.eclipse.sirius.expression.dsl.expressionDSL.SiriusExpressionClass;
import org.eclipse.sirius.expression.dsl.expressionDSL.SiriusExpressionDescription;
import org.eclipse.sirius.expression.dsl.expressionDSL.SiriusExpressionPackage;
import org.eclipse.sirius.expression.dsl.expressionDSL.SiriusVariable;
import org.eclipse.sirius.expression.dsl.services.ExpressionDSLGrammarAccess;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class ExpressionDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ExpressionDSLGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ExpressionDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExpressionDSLPackage.PARAMETER:
				sequence_Parameter(context, (Parameter) semanticObject); 
				return; 
			case ExpressionDSLPackage.SIRIUS_EXPRESSION_CLASS:
				sequence_SiriusExpressionClass(context, (SiriusExpressionClass) semanticObject); 
				return; 
			case ExpressionDSLPackage.SIRIUS_EXPRESSION_DESCRIPTION:
				sequence_SiriusExpressionDescription(context, (SiriusExpressionDescription) semanticObject); 
				return; 
			case ExpressionDSLPackage.SIRIUS_EXPRESSION_PACKAGE:
				sequence_SiriusExpressionPackage(context, (SiriusExpressionPackage) semanticObject); 
				return; 
			case ExpressionDSLPackage.SIRIUS_VARIABLE:
				sequence_SiriusVariable(context, (SiriusVariable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (optional?='optional'? variable=[SiriusVariable|FQN])
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (eClass=[EClass|FQN] variables+=SiriusVariable* expressionDescriptions+=SiriusExpressionDescription*)
	 */
	protected void sequence_SiriusExpressionClass(EObject context, SiriusExpressionClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         expression=[EAttribute|FQN] 
	 *         (parameters+=Parameter parameters+=Parameter*)? 
	 *         type=[EClassifier|FQN] 
	 *         lowerBound=Bound 
	 *         upperBound=Bound 
	 *         (contextableElements+=[EClass|FQN] contextableElements+=[EClass|FQN]*)?
	 *     )
	 */
	protected void sequence_SiriusExpressionDescription(EObject context, SiriusExpressionDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ePackage=[EPackage|FQN] expressionClasses+=SiriusExpressionClass*)
	 */
	protected void sequence_SiriusExpressionPackage(EObject context, SiriusExpressionPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (documentation=ML_COMMENT? name=ID eType=[EClassifier|FQN])
	 */
	protected void sequence_SiriusVariable(EObject context, SiriusVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
