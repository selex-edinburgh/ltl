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
 *   <li>{@link com.leonardo.ltl.ltl.TestCase#getActualResult <em>Actual Result</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.TestCase#isPassed <em>Passed</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.TestCase#getIncident <em>Incident</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Actual Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual result of the test case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Result</em>' attribute.
	 * @see #setActualResult(Object)
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestCase_ActualResult()
	 * @model
	 * @generated
	 */
	Object getActualResult();

	/**
	 * Sets the value of the '{@link com.leonardo.ltl.ltl.TestCase#getActualResult <em>Actual Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Result</em>' attribute.
	 * @see #getActualResult()
	 * @generated
	 */
	void setActualResult(Object value);

	/**
	 * Returns the value of the '<em><b>Passed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the test case passed or False if it failed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passed</em>' attribute.
	 * @see #setPassed(boolean)
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestCase_Passed()
	 * @model default="true"
	 * @generated
	 */
	boolean isPassed();

	/**
	 * Sets the value of the '{@link com.leonardo.ltl.ltl.TestCase#isPassed <em>Passed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passed</em>' attribute.
	 * @see #isPassed()
	 * @generated
	 */
	void setPassed(boolean value);

	/**
	 * Returns the value of the '<em><b>Incident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description of the incidents captured during the test., eg., warnings ,errors, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incident</em>' attribute.
	 * @see #setIncident(String)
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestCase_Incident()
	 * @model
	 * @generated
	 */
	String getIncident();

	/**
	 * Sets the value of the '{@link com.leonardo.ltl.ltl.TestCase#getIncident <em>Incident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incident</em>' attribute.
	 * @see #getIncident()
	 * @generated
	 */
	void setIncident(String value);

} // TestCase
