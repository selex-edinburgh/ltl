/**
 */
package com.leonardo.ltl.ltl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This entitiy captures the results of test cases after execution.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.leonardo.ltl.ltl.TestResult#getDate <em>Date</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.TestResult#getExecutedTestCase <em>Executed Test Case</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.TestResult#getActualResult <em>Actual Result</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.TestResult#isPassed <em>Passed</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.TestResult#getIncident <em>Incident</em>}</li>
 * </ul>
 *
 * @see com.leonardo.ltl.ltl.LtlPackage#getTestResult()
 * @model
 * @generated
 */
public interface TestResult extends PackagableElement {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date time the test result is obtained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestResult_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link com.leonardo.ltl.ltl.TestResult#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Executed Test Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The executed test case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Executed Test Case</em>' reference.
	 * @see #setExecutedTestCase(TestCase)
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestResult_ExecutedTestCase()
	 * @model
	 * @generated
	 */
	TestCase getExecutedTestCase();

	/**
	 * Sets the value of the '{@link com.leonardo.ltl.ltl.TestResult#getExecutedTestCase <em>Executed Test Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executed Test Case</em>' reference.
	 * @see #getExecutedTestCase()
	 * @generated
	 */
	void setExecutedTestCase(TestCase value);

	/**
	 * Returns the value of the '<em><b>Actual Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual result of the test case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Result</em>' attribute.
	 * @see #setActualResult(Object)
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestResult_ActualResult()
	 * @model
	 * @generated
	 */
	Object getActualResult();

	/**
	 * Sets the value of the '{@link com.leonardo.ltl.ltl.TestResult#getActualResult <em>Actual Result</em>}' attribute.
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
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestResult_Passed()
	 * @model default="true"
	 * @generated
	 */
	boolean isPassed();

	/**
	 * Sets the value of the '{@link com.leonardo.ltl.ltl.TestResult#isPassed <em>Passed</em>}' attribute.
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
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestResult_Incident()
	 * @model
	 * @generated
	 */
	String getIncident();

	/**
	 * Sets the value of the '{@link com.leonardo.ltl.ltl.TestResult#getIncident <em>Incident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incident</em>' attribute.
	 * @see #getIncident()
	 * @generated
	 */
	void setIncident(String value);

} // TestResult
