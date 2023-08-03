/**
 */
package com.leonardo.ltl.ltl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.leonardo.ltl.ltl.LtlPackage
 * @generated
 */
public interface LtlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LtlFactory eINSTANCE = com.leonardo.ltl.ltl.impl.LtlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Test Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Execution</em>'.
	 * @generated
	 */
	TestExecution createTestExecution();

	/**
	 * Returns a new object of class '<em>Testable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testable Entity</em>'.
	 * @generated
	 */
	TestableEntity createTestableEntity();

	/**
	 * Returns a new object of class '<em>Test Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Requirement</em>'.
	 * @generated
	 */
	TestRequirement createTestRequirement();

	/**
	 * Returns a new object of class '<em>Test Suite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Suite</em>'.
	 * @generated
	 */
	TestSuite createTestSuite();

	/**
	 * Returns a new object of class '<em>Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Case</em>'.
	 * @generated
	 */
	TestCase createTestCase();

	/**
	 * Returns a new object of class '<em>Test Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Result</em>'.
	 * @generated
	 */
	TestResult createTestResult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LtlPackage getLtlPackage();

} //LtlFactory
