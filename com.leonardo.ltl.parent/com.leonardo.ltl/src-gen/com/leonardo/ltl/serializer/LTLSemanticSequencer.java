/*
 * generated by Xtext 2.31.0
 */
package com.leonardo.ltl.serializer;

import com.google.inject.Inject;
import com.leonardo.ltl.ltl.LtlPackage;
import com.leonardo.ltl.ltl.Model;
import com.leonardo.ltl.ltl.TestCase;
import com.leonardo.ltl.ltl.TestExecution;
import com.leonardo.ltl.ltl.TestRequirement;
import com.leonardo.ltl.ltl.TestSuite;
import com.leonardo.ltl.ltl.TestableEntity;
import com.leonardo.ltl.services.LTLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class LTLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LTLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LtlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LtlPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case LtlPackage.PACKAGE:
				sequence_Package(context, (com.leonardo.ltl.ltl.Package) semanticObject); 
				return; 
			case LtlPackage.TEST_CASE:
				sequence_TestCase(context, (TestCase) semanticObject); 
				return; 
			case LtlPackage.TEST_EXECUTION:
				sequence_TestExecution(context, (TestExecution) semanticObject); 
				return; 
			case LtlPackage.TEST_REQUIREMENT:
				sequence_TestRequirement(context, (TestRequirement) semanticObject); 
				return; 
			case LtlPackage.TEST_SUITE:
				sequence_TestSuite(context, (TestSuite) semanticObject); 
				return; 
			case LtlPackage.TESTABLE_ENTITY:
				sequence_TestableEntity(context, (TestableEntity) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     packages+=Package*
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Package returns Package
	 *
	 * Constraint:
	 *     (name=QualifiedName (description=STRING | packagableElements+=PackagableElement)*)
	 * </pre>
	 */
	protected void sequence_Package(ISerializationContext context, com.leonardo.ltl.ltl.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PackagableElement returns TestCase
	 *     TestSpecification returns TestCase
	 *     TestCase returns TestCase
	 *
	 * Constraint:
	 *     (
	 *         name=QualifiedName 
	 *         (
	 *             (
	 *                 description=STRING | 
	 *                 creationDate=DATE | 
	 *                 version=STRING | 
	 *                 precondition=STRING | 
	 *                 testingMethod=STRING | 
	 *                 expectedResult=STRING | 
	 *                 postcondition=STRING | 
	 *                 tests+=[TestableEntity|QualifiedName] | 
	 *                 demonstratesSatisfactionOf+=[TestRequirement|QualifiedName]
	 *             )? 
	 *             (inputs+=STRING inputs+=STRING*)?
	 *         )+
	 *     )
	 * </pre>
	 */
	protected void sequence_TestCase(ISerializationContext context, TestCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PackagableElement returns TestExecution
	 *     TestExecution returns TestExecution
	 *
	 * Constraint:
	 *     (name=QualifiedName (description=STRING | executionDate=DATE | testSpecifications+=[TestSpecification|QualifiedName])*)
	 * </pre>
	 */
	protected void sequence_TestExecution(ISerializationContext context, TestExecution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PackagableElement returns TestRequirement
	 *     TestRequirement returns TestRequirement
	 *
	 * Constraint:
	 *     (name=QualifiedName (description=STRING | version=STRING | testableEntity=[TestableEntity|QualifiedName])*)
	 * </pre>
	 */
	protected void sequence_TestRequirement(ISerializationContext context, TestRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PackagableElement returns TestSuite
	 *     TestSpecification returns TestSuite
	 *     TestSuite returns TestSuite
	 *
	 * Constraint:
	 *     (name=QualifiedName (description=STRING | creationDate=DATE | version=STRING | testSpecifications+=[TestSpecification|QualifiedName])*)
	 * </pre>
	 */
	protected void sequence_TestSuite(ISerializationContext context, TestSuite semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PackagableElement returns TestableEntity
	 *     TestableEntity returns TestableEntity
	 *
	 * Constraint:
	 *     (name=QualifiedName (description=STRING | version=STRING)*)
	 * </pre>
	 */
	protected void sequence_TestableEntity(ISerializationContext context, TestableEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
