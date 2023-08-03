/**
 */
package com.leonardo.ltl.ltl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TestCase is the smallest executable unit of testing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.leonardo.ltl.ltl.TestCase#getTestingMethod <em>Testing Method</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.TestCase#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.TestCase#getExpectedResult <em>Expected Result</em>}</li>
 * </ul>
 *
 * @see com.leonardo.ltl.ltl.LtlPackage#getTestCase()
 * @model
 * @generated
 */
public interface TestCase extends TestSpecification {
	/**
	 * Returns the value of the '<em><b>Testing Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The testing method used in in the test case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Testing Method</em>' attribute.
	 * @see #setTestingMethod(String)
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestCase_TestingMethod()
	 * @model
	 * @generated
	 */
	String getTestingMethod();

	/**
	 * Sets the value of the '{@link com.leonardo.ltl.ltl.TestCase#getTestingMethod <em>Testing Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testing Method</em>' attribute.
	 * @see #getTestingMethod()
	 * @generated
	 */
	void setTestingMethod(String value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inputs used in the test case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inputs</em>' attribute list.
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestCase_Inputs()
	 * @model
	 * @generated
	 */
	EList<Object> getInputs();

	/**
	 * Returns the value of the '<em><b>Expected Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expected result of the test case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Result</em>' attribute.
	 * @see #setExpectedResult(Object)
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestCase_ExpectedResult()
	 * @model
	 * @generated
	 */
	Object getExpectedResult();

	/**
	 * Sets the value of the '{@link com.leonardo.ltl.ltl.TestCase#getExpectedResult <em>Expected Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Result</em>' attribute.
	 * @see #getExpectedResult()
	 * @generated
	 */
	void setExpectedResult(Object value);

} // TestCase
