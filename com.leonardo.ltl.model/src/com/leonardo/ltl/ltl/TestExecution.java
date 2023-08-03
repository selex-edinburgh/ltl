/**
 */
package com.leonardo.ltl.ltl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entity represents the execution of testing process.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.leonardo.ltl.ltl.TestExecution#getDate <em>Date</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.TestExecution#getTestSpecifications <em>Test Specifications</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.TestExecution#getTestResults <em>Test Results</em>}</li>
 * </ul>
 *
 * @see com.leonardo.ltl.ltl.LtlPackage#getTestExecution()
 * @model
 * @generated
 */
public interface TestExecution extends PackagableElement {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date time the test execution is performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestExecution_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link com.leonardo.ltl.ltl.TestExecution#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Test Specifications</b></em>' reference list.
	 * The list contents are of type {@link com.leonardo.ltl.ltl.TestSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The test specifications performed in the test execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Specifications</em>' reference list.
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestExecution_TestSpecifications()
	 * @model
	 * @generated
	 */
	EList<TestSpecification> getTestSpecifications();

	/**
	 * Returns the value of the '<em><b>Test Results</b></em>' containment reference list.
	 * The list contents are of type {@link com.leonardo.ltl.ltl.TestResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The test results produced from executing test specifications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Results</em>' containment reference list.
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestExecution_TestResults()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestResult> getTestResults();

} // TestExecution
