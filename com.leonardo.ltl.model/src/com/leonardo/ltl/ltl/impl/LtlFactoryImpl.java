/**
 */
package com.leonardo.ltl.ltl.impl;

import com.leonardo.ltl.ltl.LtlFactory;
import com.leonardo.ltl.ltl.LtlPackage;
import com.leonardo.ltl.ltl.Model;
import com.leonardo.ltl.ltl.TestCase;
import com.leonardo.ltl.ltl.TestExecution;
import com.leonardo.ltl.ltl.TestRequirement;
import com.leonardo.ltl.ltl.TestResult;
import com.leonardo.ltl.ltl.TestSuite;
import com.leonardo.ltl.ltl.TestableEntity;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LtlFactoryImpl extends EFactoryImpl implements LtlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LtlFactory init() {
		try {
			LtlFactory theLtlFactory = (LtlFactory)EPackage.Registry.INSTANCE.getEFactory(LtlPackage.eNS_URI);
			if (theLtlFactory != null) {
				return theLtlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LtlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LtlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LtlPackage.MODEL: return createModel();
			case LtlPackage.PACKAGE: return createPackage();
			case LtlPackage.TEST_EXECUTION: return createTestExecution();
			case LtlPackage.TESTABLE_ENTITY: return createTestableEntity();
			case LtlPackage.TEST_REQUIREMENT: return createTestRequirement();
			case LtlPackage.TEST_SUITE: return createTestSuite();
			case LtlPackage.TEST_CASE: return createTestCase();
			case LtlPackage.TEST_RESULT: return createTestResult();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public com.leonardo.ltl.ltl.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestExecution createTestExecution() {
		TestExecutionImpl testExecution = new TestExecutionImpl();
		return testExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestableEntity createTestableEntity() {
		TestableEntityImpl testableEntity = new TestableEntityImpl();
		return testableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestRequirement createTestRequirement() {
		TestRequirementImpl testRequirement = new TestRequirementImpl();
		return testRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestSuite createTestSuite() {
		TestSuiteImpl testSuite = new TestSuiteImpl();
		return testSuite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestCase createTestCase() {
		TestCaseImpl testCase = new TestCaseImpl();
		return testCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestResult createTestResult() {
		TestResultImpl testResult = new TestResultImpl();
		return testResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LtlPackage getLtlPackage() {
		return (LtlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LtlPackage getPackage() {
		return LtlPackage.eINSTANCE;
	}

} //LtlFactoryImpl
