/**
 */
package com.leonardo.ltl.ltl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Test Suite consists of many test cases and other test suites.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.leonardo.ltl.ltl.TestSuite#getTestSpecifications <em>Test Specifications</em>}</li>
 * </ul>
 *
 * @see com.leonardo.ltl.ltl.LtlPackage#getTestSuite()
 * @model
 * @generated
 */
public interface TestSuite extends TestSpecification {
	/**
	 * Returns the value of the '<em><b>Test Specifications</b></em>' reference list.
	 * The list contents are of type {@link com.leonardo.ltl.ltl.TestSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The test cases and other test suites contained in the test suite.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Specifications</em>' reference list.
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestSuite_TestSpecifications()
	 * @model
	 * @generated
	 */
	EList<TestSpecification> getTestSpecifications();

} // TestSuite
