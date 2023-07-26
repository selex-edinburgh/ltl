/*
 * generated by Xtext 2.31.0
 */
package com.leonardo.ltl.serializer;

import com.google.inject.Inject;
import com.leonardo.ltl.services.LTLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class LTLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LTLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_TestCase___EndKeyword_3_11_2_EntitiesKeyword_3_11_0__a;
	protected AbstractElementAlias match_TestCase___EntitiesKeyword_3_11_0_EndKeyword_3_11_2__a;
	protected AbstractElementAlias match_TestExecution___EndKeyword_2_2_2_SpecificationKeyword_2_2_0__a;
	protected AbstractElementAlias match_TestExecution___SpecificationKeyword_2_2_0_EndKeyword_2_2_2__a;
	protected AbstractElementAlias match_TestSuite___CasesKeyword_3_3_0_EndKeyword_3_3_2___EntitiesKeyword_3_4_0_EndKeyword_3_4_2__a__a;
	protected AbstractElementAlias match_TestSuite___CasesKeyword_3_3_0_EndKeyword_3_3_2__a;
	protected AbstractElementAlias match_TestSuite___EndKeyword_3_3_2___EntitiesKeyword_3_4_0_EndKeyword_3_4_2__a_CasesKeyword_3_3_0__a;
	protected AbstractElementAlias match_TestSuite___EndKeyword_3_4_2___CasesKeyword_3_3_0_EndKeyword_3_3_2__a_EntitiesKeyword_3_4_0__a;
	protected AbstractElementAlias match_TestSuite___EntitiesKeyword_3_4_0_EndKeyword_3_4_2___CasesKeyword_3_3_0_EndKeyword_3_3_2__a__a;
	protected AbstractElementAlias match_TestSuite___EntitiesKeyword_3_4_0_EndKeyword_3_4_2__a;
	protected AbstractElementAlias match_TestSuite_____CasesKeyword_3_3_0_EndKeyword_3_3_2___or___EntitiesKeyword_3_4_0_EndKeyword_3_4_2____a;
	protected AbstractElementAlias match_TestSuite_____CasesKeyword_3_3_0_EndKeyword_3_3_2__q___CasesKeyword_3_3_0_EndKeyword_3_3_2_EntitiesKeyword_3_4_0_EndKeyword_3_4_2__q__p;
	protected AbstractElementAlias match_TestSuite_____EntitiesKeyword_3_4_0_EndKeyword_3_4_2__q___EntitiesKeyword_3_4_0_EndKeyword_3_4_2_CasesKeyword_3_3_0_EndKeyword_3_3_2__q__p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LTLGrammarAccess) access;
		match_TestCase___EndKeyword_3_11_2_EntitiesKeyword_3_11_0__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTestCaseAccess().getEndKeyword_3_11_2()), new TokenAlias(false, false, grammarAccess.getTestCaseAccess().getEntitiesKeyword_3_11_0()));
		match_TestCase___EntitiesKeyword_3_11_0_EndKeyword_3_11_2__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTestCaseAccess().getEntitiesKeyword_3_11_0()), new TokenAlias(false, false, grammarAccess.getTestCaseAccess().getEndKeyword_3_11_2()));
		match_TestExecution___EndKeyword_2_2_2_SpecificationKeyword_2_2_0__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTestExecutionAccess().getEndKeyword_2_2_2()), new TokenAlias(false, false, grammarAccess.getTestExecutionAccess().getSpecificationKeyword_2_2_0()));
		match_TestExecution___SpecificationKeyword_2_2_0_EndKeyword_2_2_2__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTestExecutionAccess().getSpecificationKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getTestExecutionAccess().getEndKeyword_2_2_2()));
		match_TestSuite___CasesKeyword_3_3_0_EndKeyword_3_3_2___EntitiesKeyword_3_4_0_EndKeyword_3_4_2__a__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getCasesKeyword_3_3_0()), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEndKeyword_3_3_2()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEntitiesKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEndKeyword_3_4_2())));
		match_TestSuite___CasesKeyword_3_3_0_EndKeyword_3_3_2__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getCasesKeyword_3_3_0()), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEndKeyword_3_3_2()));
		match_TestSuite___EndKeyword_3_3_2___EntitiesKeyword_3_4_0_EndKeyword_3_4_2__a_CasesKeyword_3_3_0__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEndKeyword_3_3_2()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEntitiesKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEndKeyword_3_4_2())), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getCasesKeyword_3_3_0()));
		match_TestSuite___EndKeyword_3_4_2___CasesKeyword_3_3_0_EndKeyword_3_3_2__a_EntitiesKeyword_3_4_0__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEndKeyword_3_4_2()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getCasesKeyword_3_3_0()), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEndKeyword_3_3_2())), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEntitiesKeyword_3_4_0()));
		match_TestSuite___EntitiesKeyword_3_4_0_EndKeyword_3_4_2___CasesKeyword_3_3_0_EndKeyword_3_3_2__a__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEntitiesKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEndKeyword_3_4_2()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getCasesKeyword_3_3_0()), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEndKeyword_3_3_2())));
		match_TestSuite___EntitiesKeyword_3_4_0_EndKeyword_3_4_2__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEntitiesKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEndKeyword_3_4_2()));
		match_TestSuite_____CasesKeyword_3_3_0_EndKeyword_3_3_2___or___EntitiesKeyword_3_4_0_EndKeyword_3_4_2____a = new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getCasesKeyword_3_3_0()), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEndKeyword_3_3_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEntitiesKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEndKeyword_3_4_2())));
		match_TestSuite_____CasesKeyword_3_3_0_EndKeyword_3_3_2__q___CasesKeyword_3_3_0_EndKeyword_3_3_2_EntitiesKeyword_3_4_0_EndKeyword_3_4_2__q__p = new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getCasesKeyword_3_3_0()), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEndKeyword_3_3_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getCasesKeyword_3_3_0()), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEndKeyword_3_3_2()), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEntitiesKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEndKeyword_3_4_2())));
		match_TestSuite_____EntitiesKeyword_3_4_0_EndKeyword_3_4_2__q___EntitiesKeyword_3_4_0_EndKeyword_3_4_2_CasesKeyword_3_3_0_EndKeyword_3_3_2__q__p = new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEntitiesKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEndKeyword_3_4_2())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEntitiesKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEndKeyword_3_4_2()), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getCasesKeyword_3_3_0()), new TokenAlias(false, false, grammarAccess.getTestSuiteAccess().getEndKeyword_3_3_2())));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_TestCase___EndKeyword_3_11_2_EntitiesKeyword_3_11_0__a.equals(syntax))
				emit_TestCase___EndKeyword_3_11_2_EntitiesKeyword_3_11_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TestCase___EntitiesKeyword_3_11_0_EndKeyword_3_11_2__a.equals(syntax))
				emit_TestCase___EntitiesKeyword_3_11_0_EndKeyword_3_11_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TestExecution___EndKeyword_2_2_2_SpecificationKeyword_2_2_0__a.equals(syntax))
				emit_TestExecution___EndKeyword_2_2_2_SpecificationKeyword_2_2_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TestExecution___SpecificationKeyword_2_2_0_EndKeyword_2_2_2__a.equals(syntax))
				emit_TestExecution___SpecificationKeyword_2_2_0_EndKeyword_2_2_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TestSuite___CasesKeyword_3_3_0_EndKeyword_3_3_2___EntitiesKeyword_3_4_0_EndKeyword_3_4_2__a__a.equals(syntax))
				emit_TestSuite___CasesKeyword_3_3_0_EndKeyword_3_3_2___EntitiesKeyword_3_4_0_EndKeyword_3_4_2__a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TestSuite___CasesKeyword_3_3_0_EndKeyword_3_3_2__a.equals(syntax))
				emit_TestSuite___CasesKeyword_3_3_0_EndKeyword_3_3_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TestSuite___EndKeyword_3_3_2___EntitiesKeyword_3_4_0_EndKeyword_3_4_2__a_CasesKeyword_3_3_0__a.equals(syntax))
				emit_TestSuite___EndKeyword_3_3_2___EntitiesKeyword_3_4_0_EndKeyword_3_4_2__a_CasesKeyword_3_3_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TestSuite___EndKeyword_3_4_2___CasesKeyword_3_3_0_EndKeyword_3_3_2__a_EntitiesKeyword_3_4_0__a.equals(syntax))
				emit_TestSuite___EndKeyword_3_4_2___CasesKeyword_3_3_0_EndKeyword_3_3_2__a_EntitiesKeyword_3_4_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TestSuite___EntitiesKeyword_3_4_0_EndKeyword_3_4_2___CasesKeyword_3_3_0_EndKeyword_3_3_2__a__a.equals(syntax))
				emit_TestSuite___EntitiesKeyword_3_4_0_EndKeyword_3_4_2___CasesKeyword_3_3_0_EndKeyword_3_3_2__a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TestSuite___EntitiesKeyword_3_4_0_EndKeyword_3_4_2__a.equals(syntax))
				emit_TestSuite___EntitiesKeyword_3_4_0_EndKeyword_3_4_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TestSuite_____CasesKeyword_3_3_0_EndKeyword_3_3_2___or___EntitiesKeyword_3_4_0_EndKeyword_3_4_2____a.equals(syntax))
				emit_TestSuite_____CasesKeyword_3_3_0_EndKeyword_3_3_2___or___EntitiesKeyword_3_4_0_EndKeyword_3_4_2____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TestSuite_____CasesKeyword_3_3_0_EndKeyword_3_3_2__q___CasesKeyword_3_3_0_EndKeyword_3_3_2_EntitiesKeyword_3_4_0_EndKeyword_3_4_2__q__p.equals(syntax))
				emit_TestSuite_____CasesKeyword_3_3_0_EndKeyword_3_3_2__q___CasesKeyword_3_3_0_EndKeyword_3_3_2_EntitiesKeyword_3_4_0_EndKeyword_3_4_2__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TestSuite_____EntitiesKeyword_3_4_0_EndKeyword_3_4_2__q___EntitiesKeyword_3_4_0_EndKeyword_3_4_2_CasesKeyword_3_3_0_EndKeyword_3_3_2__q__p.equals(syntax))
				emit_TestSuite_____EntitiesKeyword_3_4_0_EndKeyword_3_4_2__q___EntitiesKeyword_3_4_0_EndKeyword_3_4_2_CasesKeyword_3_3_0_EndKeyword_3_3_2__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('end' 'entities')*
	 *
	 * This ambiguous syntax occurs at:
	 *     actualResult=STRING 'entities' (ambiguity) testableEntities+=[TestableEntity|QualifiedName]
	 *     date=STRING 'entities' (ambiguity) testableEntities+=[TestableEntity|QualifiedName]
	 *     description=STRING 'entities' (ambiguity) testableEntities+=[TestableEntity|QualifiedName]
	 *     expectedResult=STRING 'entities' (ambiguity) testableEntities+=[TestableEntity|QualifiedName]
	 *     incident=STRING 'entities' (ambiguity) testableEntities+=[TestableEntity|QualifiedName]
	 *     inputs+=STRING 'entities' (ambiguity) testableEntities+=[TestableEntity|QualifiedName]
	 *     name=QualifiedName 'entities' (ambiguity) testableEntities+=[TestableEntity|QualifiedName]
	 *     passed=Boolean 'entities' (ambiguity) testableEntities+=[TestableEntity|QualifiedName]
	 *     postcondition=STRING 'entities' (ambiguity) testableEntities+=[TestableEntity|QualifiedName]
	 *     precondition=STRING 'entities' (ambiguity) testableEntities+=[TestableEntity|QualifiedName]
	 *     testableEntities+=[TestableEntity|QualifiedName] (ambiguity) testableEntities+=[TestableEntity|QualifiedName]
	 *     testingMethod=STRING 'entities' (ambiguity) testableEntities+=[TestableEntity|QualifiedName]
	 *     version=STRING 'entities' (ambiguity) testableEntities+=[TestableEntity|QualifiedName]
	 
	 * </pre>
	 */
	protected void emit_TestCase___EndKeyword_3_11_2_EntitiesKeyword_3_11_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('entities' 'end')*
	 *
	 * This ambiguous syntax occurs at:
	 *     actualResult=STRING (ambiguity) 'actualResult' actualResult=STRING
	 *     actualResult=STRING (ambiguity) 'date' date=STRING
	 *     actualResult=STRING (ambiguity) 'description' description=STRING
	 *     actualResult=STRING (ambiguity) 'end' (rule end)
	 *     actualResult=STRING (ambiguity) 'expectedResult' expectedResult=STRING
	 *     actualResult=STRING (ambiguity) 'incident' incident=STRING
	 *     actualResult=STRING (ambiguity) 'inputs' inputs+=STRING
	 *     actualResult=STRING (ambiguity) 'method' testingMethod=STRING
	 *     actualResult=STRING (ambiguity) 'passed' passed=Boolean
	 *     actualResult=STRING (ambiguity) 'postcondition' postcondition=STRING
	 *     actualResult=STRING (ambiguity) 'precondition' precondition=STRING
	 *     actualResult=STRING (ambiguity) 'version' version=STRING
	 *     date=STRING (ambiguity) 'actualResult' actualResult=STRING
	 *     date=STRING (ambiguity) 'date' date=STRING
	 *     date=STRING (ambiguity) 'description' description=STRING
	 *     date=STRING (ambiguity) 'end' (rule end)
	 *     date=STRING (ambiguity) 'expectedResult' expectedResult=STRING
	 *     date=STRING (ambiguity) 'incident' incident=STRING
	 *     date=STRING (ambiguity) 'inputs' inputs+=STRING
	 *     date=STRING (ambiguity) 'method' testingMethod=STRING
	 *     date=STRING (ambiguity) 'passed' passed=Boolean
	 *     date=STRING (ambiguity) 'postcondition' postcondition=STRING
	 *     date=STRING (ambiguity) 'precondition' precondition=STRING
	 *     date=STRING (ambiguity) 'version' version=STRING
	 *     description=STRING (ambiguity) 'actualResult' actualResult=STRING
	 *     description=STRING (ambiguity) 'date' date=STRING
	 *     description=STRING (ambiguity) 'description' description=STRING
	 *     description=STRING (ambiguity) 'end' (rule end)
	 *     description=STRING (ambiguity) 'expectedResult' expectedResult=STRING
	 *     description=STRING (ambiguity) 'incident' incident=STRING
	 *     description=STRING (ambiguity) 'inputs' inputs+=STRING
	 *     description=STRING (ambiguity) 'method' testingMethod=STRING
	 *     description=STRING (ambiguity) 'passed' passed=Boolean
	 *     description=STRING (ambiguity) 'postcondition' postcondition=STRING
	 *     description=STRING (ambiguity) 'precondition' precondition=STRING
	 *     description=STRING (ambiguity) 'version' version=STRING
	 *     expectedResult=STRING (ambiguity) 'actualResult' actualResult=STRING
	 *     expectedResult=STRING (ambiguity) 'date' date=STRING
	 *     expectedResult=STRING (ambiguity) 'description' description=STRING
	 *     expectedResult=STRING (ambiguity) 'end' (rule end)
	 *     expectedResult=STRING (ambiguity) 'expectedResult' expectedResult=STRING
	 *     expectedResult=STRING (ambiguity) 'incident' incident=STRING
	 *     expectedResult=STRING (ambiguity) 'inputs' inputs+=STRING
	 *     expectedResult=STRING (ambiguity) 'method' testingMethod=STRING
	 *     expectedResult=STRING (ambiguity) 'passed' passed=Boolean
	 *     expectedResult=STRING (ambiguity) 'postcondition' postcondition=STRING
	 *     expectedResult=STRING (ambiguity) 'precondition' precondition=STRING
	 *     expectedResult=STRING (ambiguity) 'version' version=STRING
	 *     incident=STRING (ambiguity) 'actualResult' actualResult=STRING
	 *     incident=STRING (ambiguity) 'date' date=STRING
	 *     incident=STRING (ambiguity) 'description' description=STRING
	 *     incident=STRING (ambiguity) 'end' (rule end)
	 *     incident=STRING (ambiguity) 'expectedResult' expectedResult=STRING
	 *     incident=STRING (ambiguity) 'incident' incident=STRING
	 *     incident=STRING (ambiguity) 'inputs' inputs+=STRING
	 *     incident=STRING (ambiguity) 'method' testingMethod=STRING
	 *     incident=STRING (ambiguity) 'passed' passed=Boolean
	 *     incident=STRING (ambiguity) 'postcondition' postcondition=STRING
	 *     incident=STRING (ambiguity) 'precondition' precondition=STRING
	 *     incident=STRING (ambiguity) 'version' version=STRING
	 *     inputs+=STRING (ambiguity) 'actualResult' actualResult=STRING
	 *     inputs+=STRING (ambiguity) 'date' date=STRING
	 *     inputs+=STRING (ambiguity) 'description' description=STRING
	 *     inputs+=STRING (ambiguity) 'end' (rule end)
	 *     inputs+=STRING (ambiguity) 'expectedResult' expectedResult=STRING
	 *     inputs+=STRING (ambiguity) 'incident' incident=STRING
	 *     inputs+=STRING (ambiguity) 'inputs' inputs+=STRING
	 *     inputs+=STRING (ambiguity) 'method' testingMethod=STRING
	 *     inputs+=STRING (ambiguity) 'passed' passed=Boolean
	 *     inputs+=STRING (ambiguity) 'postcondition' postcondition=STRING
	 *     inputs+=STRING (ambiguity) 'precondition' precondition=STRING
	 *     inputs+=STRING (ambiguity) 'version' version=STRING
	 *     name=QualifiedName (ambiguity) 'actualResult' actualResult=STRING
	 *     name=QualifiedName (ambiguity) 'date' date=STRING
	 *     name=QualifiedName (ambiguity) 'description' description=STRING
	 *     name=QualifiedName (ambiguity) 'end' (rule end)
	 *     name=QualifiedName (ambiguity) 'expectedResult' expectedResult=STRING
	 *     name=QualifiedName (ambiguity) 'incident' incident=STRING
	 *     name=QualifiedName (ambiguity) 'inputs' inputs+=STRING
	 *     name=QualifiedName (ambiguity) 'method' testingMethod=STRING
	 *     name=QualifiedName (ambiguity) 'passed' passed=Boolean
	 *     name=QualifiedName (ambiguity) 'postcondition' postcondition=STRING
	 *     name=QualifiedName (ambiguity) 'precondition' precondition=STRING
	 *     name=QualifiedName (ambiguity) 'version' version=STRING
	 *     passed=Boolean (ambiguity) 'actualResult' actualResult=STRING
	 *     passed=Boolean (ambiguity) 'date' date=STRING
	 *     passed=Boolean (ambiguity) 'description' description=STRING
	 *     passed=Boolean (ambiguity) 'end' (rule end)
	 *     passed=Boolean (ambiguity) 'expectedResult' expectedResult=STRING
	 *     passed=Boolean (ambiguity) 'incident' incident=STRING
	 *     passed=Boolean (ambiguity) 'inputs' inputs+=STRING
	 *     passed=Boolean (ambiguity) 'method' testingMethod=STRING
	 *     passed=Boolean (ambiguity) 'passed' passed=Boolean
	 *     passed=Boolean (ambiguity) 'postcondition' postcondition=STRING
	 *     passed=Boolean (ambiguity) 'precondition' precondition=STRING
	 *     passed=Boolean (ambiguity) 'version' version=STRING
	 *     postcondition=STRING (ambiguity) 'actualResult' actualResult=STRING
	 *     postcondition=STRING (ambiguity) 'date' date=STRING
	 *     postcondition=STRING (ambiguity) 'description' description=STRING
	 *     postcondition=STRING (ambiguity) 'end' (rule end)
	 *     postcondition=STRING (ambiguity) 'expectedResult' expectedResult=STRING
	 *     postcondition=STRING (ambiguity) 'incident' incident=STRING
	 *     postcondition=STRING (ambiguity) 'inputs' inputs+=STRING
	 *     postcondition=STRING (ambiguity) 'method' testingMethod=STRING
	 *     postcondition=STRING (ambiguity) 'passed' passed=Boolean
	 *     postcondition=STRING (ambiguity) 'postcondition' postcondition=STRING
	 *     postcondition=STRING (ambiguity) 'precondition' precondition=STRING
	 *     postcondition=STRING (ambiguity) 'version' version=STRING
	 *     precondition=STRING (ambiguity) 'actualResult' actualResult=STRING
	 *     precondition=STRING (ambiguity) 'date' date=STRING
	 *     precondition=STRING (ambiguity) 'description' description=STRING
	 *     precondition=STRING (ambiguity) 'end' (rule end)
	 *     precondition=STRING (ambiguity) 'expectedResult' expectedResult=STRING
	 *     precondition=STRING (ambiguity) 'incident' incident=STRING
	 *     precondition=STRING (ambiguity) 'inputs' inputs+=STRING
	 *     precondition=STRING (ambiguity) 'method' testingMethod=STRING
	 *     precondition=STRING (ambiguity) 'passed' passed=Boolean
	 *     precondition=STRING (ambiguity) 'postcondition' postcondition=STRING
	 *     precondition=STRING (ambiguity) 'precondition' precondition=STRING
	 *     precondition=STRING (ambiguity) 'version' version=STRING
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' (ambiguity) 'actualResult' actualResult=STRING
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' (ambiguity) 'date' date=STRING
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' (ambiguity) 'description' description=STRING
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' (ambiguity) 'end' (rule end)
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' (ambiguity) 'expectedResult' expectedResult=STRING
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' (ambiguity) 'incident' incident=STRING
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' (ambiguity) 'inputs' inputs+=STRING
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' (ambiguity) 'method' testingMethod=STRING
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' (ambiguity) 'passed' passed=Boolean
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' (ambiguity) 'postcondition' postcondition=STRING
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' (ambiguity) 'precondition' precondition=STRING
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' (ambiguity) 'version' version=STRING
	 *     testingMethod=STRING (ambiguity) 'actualResult' actualResult=STRING
	 *     testingMethod=STRING (ambiguity) 'date' date=STRING
	 *     testingMethod=STRING (ambiguity) 'description' description=STRING
	 *     testingMethod=STRING (ambiguity) 'end' (rule end)
	 *     testingMethod=STRING (ambiguity) 'expectedResult' expectedResult=STRING
	 *     testingMethod=STRING (ambiguity) 'incident' incident=STRING
	 *     testingMethod=STRING (ambiguity) 'inputs' inputs+=STRING
	 *     testingMethod=STRING (ambiguity) 'method' testingMethod=STRING
	 *     testingMethod=STRING (ambiguity) 'passed' passed=Boolean
	 *     testingMethod=STRING (ambiguity) 'postcondition' postcondition=STRING
	 *     testingMethod=STRING (ambiguity) 'precondition' precondition=STRING
	 *     testingMethod=STRING (ambiguity) 'version' version=STRING
	 *     version=STRING (ambiguity) 'actualResult' actualResult=STRING
	 *     version=STRING (ambiguity) 'date' date=STRING
	 *     version=STRING (ambiguity) 'description' description=STRING
	 *     version=STRING (ambiguity) 'end' (rule end)
	 *     version=STRING (ambiguity) 'expectedResult' expectedResult=STRING
	 *     version=STRING (ambiguity) 'incident' incident=STRING
	 *     version=STRING (ambiguity) 'inputs' inputs+=STRING
	 *     version=STRING (ambiguity) 'method' testingMethod=STRING
	 *     version=STRING (ambiguity) 'passed' passed=Boolean
	 *     version=STRING (ambiguity) 'postcondition' postcondition=STRING
	 *     version=STRING (ambiguity) 'precondition' precondition=STRING
	 *     version=STRING (ambiguity) 'version' version=STRING
	 
	 * </pre>
	 */
	protected void emit_TestCase___EntitiesKeyword_3_11_0_EndKeyword_3_11_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('end' 'specification')*
	 *
	 * This ambiguous syntax occurs at:
	 *     date=STRING 'specification' (ambiguity) testSpecifications+=[TestSpecification|QualifiedName]
	 *     description=STRING 'specification' (ambiguity) testSpecifications+=[TestSpecification|QualifiedName]
	 *     name=QualifiedName 'specification' (ambiguity) testSpecifications+=[TestSpecification|QualifiedName]
	 *     testSpecifications+=[TestSpecification|QualifiedName] (ambiguity) testSpecifications+=[TestSpecification|QualifiedName]
	 
	 * </pre>
	 */
	protected void emit_TestExecution___EndKeyword_2_2_2_SpecificationKeyword_2_2_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('specification' 'end')*
	 *
	 * This ambiguous syntax occurs at:
	 *     date=STRING (ambiguity) 'date' date=STRING
	 *     date=STRING (ambiguity) 'description' description=STRING
	 *     date=STRING (ambiguity) 'end' (rule end)
	 *     description=STRING (ambiguity) 'date' date=STRING
	 *     description=STRING (ambiguity) 'description' description=STRING
	 *     description=STRING (ambiguity) 'end' (rule end)
	 *     name=QualifiedName (ambiguity) 'date' date=STRING
	 *     name=QualifiedName (ambiguity) 'description' description=STRING
	 *     name=QualifiedName (ambiguity) 'end' (rule end)
	 *     testSpecifications+=[TestSpecification|QualifiedName] 'end' (ambiguity) 'date' date=STRING
	 *     testSpecifications+=[TestSpecification|QualifiedName] 'end' (ambiguity) 'description' description=STRING
	 *     testSpecifications+=[TestSpecification|QualifiedName] 'end' (ambiguity) 'end' (rule end)
	 
	 * </pre>
	 */
	protected void emit_TestExecution___SpecificationKeyword_2_2_0_EndKeyword_2_2_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('cases' 'end' ('entities' 'end')*)*
	 *
	 * This ambiguous syntax occurs at:
	 *     testSpecifications+=[TestSpecification|QualifiedName] 'end' ('entities' 'end')* (ambiguity) 'date' date=STRING
	 *     testSpecifications+=[TestSpecification|QualifiedName] 'end' ('entities' 'end')* (ambiguity) 'description' description=STRING
	 *     testSpecifications+=[TestSpecification|QualifiedName] 'end' ('entities' 'end')* (ambiguity) 'end' (rule end)
	 *     testSpecifications+=[TestSpecification|QualifiedName] 'end' ('entities' 'end')* (ambiguity) 'version' version=STRING
	 
	 * </pre>
	 */
	protected void emit_TestSuite___CasesKeyword_3_3_0_EndKeyword_3_3_2___EntitiesKeyword_3_4_0_EndKeyword_3_4_2__a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('cases' 'end')*
	 *
	 * This ambiguous syntax occurs at:
	 *     date=STRING (ambiguity) 'entities' ('end' (ambiguity) 'entities')* testableEntities+=[TestableEntity|QualifiedName]
	 *     description=STRING (ambiguity) 'entities' ('end' (ambiguity) 'entities')* testableEntities+=[TestableEntity|QualifiedName]
	 *     name=QualifiedName (ambiguity) 'entities' ('end' (ambiguity) 'entities')* testableEntities+=[TestableEntity|QualifiedName]
	 *     testSpecifications+=[TestSpecification|QualifiedName] 'end' (ambiguity) (('entities' 'end')? ('entities' 'end' 'cases' 'end')?)+ 'entities' testableEntities+=[TestableEntity|QualifiedName]
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' (ambiguity) ('entities' 'end' (ambiguity))* 'date' date=STRING
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' (ambiguity) ('entities' 'end' (ambiguity))* 'description' description=STRING
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' (ambiguity) ('entities' 'end' (ambiguity))* 'end' (rule end)
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' (ambiguity) ('entities' 'end' (ambiguity))* 'version' version=STRING
	 *     version=STRING (ambiguity) 'entities' ('end' (ambiguity) 'entities')* testableEntities+=[TestableEntity|QualifiedName]
	 
	 * </pre>
	 */
	protected void emit_TestSuite___CasesKeyword_3_3_0_EndKeyword_3_3_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('end' ('entities' 'end')* 'cases')*
	 *
	 * This ambiguous syntax occurs at:
	 *     date=STRING ('entities' 'end')* 'cases' (ambiguity) testSpecifications+=[TestSpecification|QualifiedName]
	 *     description=STRING ('entities' 'end')* 'cases' (ambiguity) testSpecifications+=[TestSpecification|QualifiedName]
	 *     name=QualifiedName ('entities' 'end')* 'cases' (ambiguity) testSpecifications+=[TestSpecification|QualifiedName]
	 *     testSpecifications+=[TestSpecification|QualifiedName] (ambiguity) testSpecifications+=[TestSpecification|QualifiedName]
	 *     version=STRING ('entities' 'end')* 'cases' (ambiguity) testSpecifications+=[TestSpecification|QualifiedName]
	 
	 * </pre>
	 */
	protected void emit_TestSuite___EndKeyword_3_3_2___EntitiesKeyword_3_4_0_EndKeyword_3_4_2__a_CasesKeyword_3_3_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('end' ('cases' 'end')* 'entities')*
	 *
	 * This ambiguous syntax occurs at:
	 *     date=STRING ('cases' 'end')* 'entities' (ambiguity) testableEntities+=[TestableEntity|QualifiedName]
	 *     description=STRING ('cases' 'end')* 'entities' (ambiguity) testableEntities+=[TestableEntity|QualifiedName]
	 *     name=QualifiedName ('cases' 'end')* 'entities' (ambiguity) testableEntities+=[TestableEntity|QualifiedName]
	 *     testableEntities+=[TestableEntity|QualifiedName] (ambiguity) testableEntities+=[TestableEntity|QualifiedName]
	 *     version=STRING ('cases' 'end')* 'entities' (ambiguity) testableEntities+=[TestableEntity|QualifiedName]
	 
	 * </pre>
	 */
	protected void emit_TestSuite___EndKeyword_3_4_2___CasesKeyword_3_3_0_EndKeyword_3_3_2__a_EntitiesKeyword_3_4_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('entities' 'end' ('cases' 'end')*)*
	 *
	 * This ambiguous syntax occurs at:
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' ('cases' 'end')* (ambiguity) 'date' date=STRING
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' ('cases' 'end')* (ambiguity) 'description' description=STRING
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' ('cases' 'end')* (ambiguity) 'end' (rule end)
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' ('cases' 'end')* (ambiguity) 'version' version=STRING
	 
	 * </pre>
	 */
	protected void emit_TestSuite___EntitiesKeyword_3_4_0_EndKeyword_3_4_2___CasesKeyword_3_3_0_EndKeyword_3_3_2__a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('entities' 'end')*
	 *
	 * This ambiguous syntax occurs at:
	 *     date=STRING (ambiguity) 'cases' ('end' (ambiguity) 'cases')* testSpecifications+=[TestSpecification|QualifiedName]
	 *     description=STRING (ambiguity) 'cases' ('end' (ambiguity) 'cases')* testSpecifications+=[TestSpecification|QualifiedName]
	 *     name=QualifiedName (ambiguity) 'cases' ('end' (ambiguity) 'cases')* testSpecifications+=[TestSpecification|QualifiedName]
	 *     testSpecifications+=[TestSpecification|QualifiedName] 'end' (ambiguity) ('cases' 'end' (ambiguity))* 'date' date=STRING
	 *     testSpecifications+=[TestSpecification|QualifiedName] 'end' (ambiguity) ('cases' 'end' (ambiguity))* 'description' description=STRING
	 *     testSpecifications+=[TestSpecification|QualifiedName] 'end' (ambiguity) ('cases' 'end' (ambiguity))* 'end' (rule end)
	 *     testSpecifications+=[TestSpecification|QualifiedName] 'end' (ambiguity) ('cases' 'end' (ambiguity))* 'version' version=STRING
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' (ambiguity) (('cases' 'end')? ('cases' 'end' 'entities' 'end')?)+ 'cases' testSpecifications+=[TestSpecification|QualifiedName]
	 *     version=STRING (ambiguity) 'cases' ('end' (ambiguity) 'cases')* testSpecifications+=[TestSpecification|QualifiedName]
	 
	 * </pre>
	 */
	protected void emit_TestSuite___EntitiesKeyword_3_4_0_EndKeyword_3_4_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (('cases' 'end') | ('entities' 'end'))*
	 *
	 * This ambiguous syntax occurs at:
	 *     date=STRING (ambiguity) 'date' date=STRING
	 *     date=STRING (ambiguity) 'description' description=STRING
	 *     date=STRING (ambiguity) 'end' (rule end)
	 *     date=STRING (ambiguity) 'version' version=STRING
	 *     description=STRING (ambiguity) 'date' date=STRING
	 *     description=STRING (ambiguity) 'description' description=STRING
	 *     description=STRING (ambiguity) 'end' (rule end)
	 *     description=STRING (ambiguity) 'version' version=STRING
	 *     name=QualifiedName (ambiguity) 'date' date=STRING
	 *     name=QualifiedName (ambiguity) 'description' description=STRING
	 *     name=QualifiedName (ambiguity) 'end' (rule end)
	 *     name=QualifiedName (ambiguity) 'version' version=STRING
	 *     version=STRING (ambiguity) 'date' date=STRING
	 *     version=STRING (ambiguity) 'description' description=STRING
	 *     version=STRING (ambiguity) 'end' (rule end)
	 *     version=STRING (ambiguity) 'version' version=STRING
	 
	 * </pre>
	 */
	protected void emit_TestSuite_____CasesKeyword_3_3_0_EndKeyword_3_3_2___or___EntitiesKeyword_3_4_0_EndKeyword_3_4_2____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (('cases' 'end')? ('cases' 'end' 'entities' 'end')?)+
	 *
	 * This ambiguous syntax occurs at:
	 *     testableEntities+=[TestableEntity|QualifiedName] 'end' ('entities' 'end')* (ambiguity) 'cases' testSpecifications+=[TestSpecification|QualifiedName]
	 
	 * </pre>
	 */
	protected void emit_TestSuite_____CasesKeyword_3_3_0_EndKeyword_3_3_2__q___CasesKeyword_3_3_0_EndKeyword_3_3_2_EntitiesKeyword_3_4_0_EndKeyword_3_4_2__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (('entities' 'end')? ('entities' 'end' 'cases' 'end')?)+
	 *
	 * This ambiguous syntax occurs at:
	 *     testSpecifications+=[TestSpecification|QualifiedName] 'end' ('cases' 'end')* (ambiguity) 'entities' testableEntities+=[TestableEntity|QualifiedName]
	 
	 * </pre>
	 */
	protected void emit_TestSuite_____EntitiesKeyword_3_4_0_EndKeyword_3_4_2__q___EntitiesKeyword_3_4_0_EndKeyword_3_4_2_CasesKeyword_3_3_0_EndKeyword_3_3_2__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
