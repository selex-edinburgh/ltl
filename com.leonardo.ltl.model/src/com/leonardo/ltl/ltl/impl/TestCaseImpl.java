/**
 */
package com.leonardo.ltl.ltl.impl;

import com.leonardo.ltl.ltl.LtlPackage;
import com.leonardo.ltl.ltl.TestCase;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestCaseImpl#getTestingMethod <em>Testing Method</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestCaseImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestCaseImpl#getExpectedResult <em>Expected Result</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestCaseImpl#getActualResult <em>Actual Result</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestCaseImpl#isPassed <em>Passed</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestCaseImpl#getIncident <em>Incident</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestCaseImpl extends TestSpecificationImpl implements TestCase {
	/**
	 * The default value of the '{@link #getTestingMethod() <em>Testing Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTING_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestingMethod() <em>Testing Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingMethod()
	 * @generated
	 * @ordered
	 */
	protected String testingMethod = TESTING_METHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> inputs;

	/**
	 * The default value of the '{@link #getExpectedResult() <em>Expected Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedResult()
	 * @generated
	 * @ordered
	 */
	protected static final Object EXPECTED_RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpectedResult() <em>Expected Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedResult()
	 * @generated
	 * @ordered
	 */
	protected Object expectedResult = EXPECTED_RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualResult() <em>Actual Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualResult()
	 * @generated
	 * @ordered
	 */
	protected static final Object ACTUAL_RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualResult() <em>Actual Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualResult()
	 * @generated
	 * @ordered
	 */
	protected Object actualResult = ACTUAL_RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #isPassed() <em>Passed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PASSED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPassed() <em>Passed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassed()
	 * @generated
	 * @ordered
	 */
	protected boolean passed = PASSED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncident() <em>Incident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncident()
	 * @generated
	 * @ordered
	 */
	protected static final String INCIDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncident() <em>Incident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncident()
	 * @generated
	 * @ordered
	 */
	protected String incident = INCIDENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LtlPackage.Literals.TEST_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingMethod() {
		return testingMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingMethod(String newTestingMethod) {
		String oldTestingMethod = testingMethod;
		testingMethod = newTestingMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LtlPackage.TEST_CASE__TESTING_METHOD, oldTestingMethod, testingMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getInputs() {
		if (inputs == null) {
			inputs = new EDataTypeUniqueEList<Object>(Object.class, this, LtlPackage.TEST_CASE__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getExpectedResult() {
		return expectedResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedResult(Object newExpectedResult) {
		Object oldExpectedResult = expectedResult;
		expectedResult = newExpectedResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LtlPackage.TEST_CASE__EXPECTED_RESULT, oldExpectedResult, expectedResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getActualResult() {
		return actualResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualResult(Object newActualResult) {
		Object oldActualResult = actualResult;
		actualResult = newActualResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LtlPackage.TEST_CASE__ACTUAL_RESULT, oldActualResult, actualResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPassed() {
		return passed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassed(boolean newPassed) {
		boolean oldPassed = passed;
		passed = newPassed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LtlPackage.TEST_CASE__PASSED, oldPassed, passed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIncident() {
		return incident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncident(String newIncident) {
		String oldIncident = incident;
		incident = newIncident;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LtlPackage.TEST_CASE__INCIDENT, oldIncident, incident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LtlPackage.TEST_CASE__TESTING_METHOD:
				return getTestingMethod();
			case LtlPackage.TEST_CASE__INPUTS:
				return getInputs();
			case LtlPackage.TEST_CASE__EXPECTED_RESULT:
				return getExpectedResult();
			case LtlPackage.TEST_CASE__ACTUAL_RESULT:
				return getActualResult();
			case LtlPackage.TEST_CASE__PASSED:
				return isPassed();
			case LtlPackage.TEST_CASE__INCIDENT:
				return getIncident();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LtlPackage.TEST_CASE__TESTING_METHOD:
				setTestingMethod((String)newValue);
				return;
			case LtlPackage.TEST_CASE__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Object>)newValue);
				return;
			case LtlPackage.TEST_CASE__EXPECTED_RESULT:
				setExpectedResult(newValue);
				return;
			case LtlPackage.TEST_CASE__ACTUAL_RESULT:
				setActualResult(newValue);
				return;
			case LtlPackage.TEST_CASE__PASSED:
				setPassed((Boolean)newValue);
				return;
			case LtlPackage.TEST_CASE__INCIDENT:
				setIncident((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LtlPackage.TEST_CASE__TESTING_METHOD:
				setTestingMethod(TESTING_METHOD_EDEFAULT);
				return;
			case LtlPackage.TEST_CASE__INPUTS:
				getInputs().clear();
				return;
			case LtlPackage.TEST_CASE__EXPECTED_RESULT:
				setExpectedResult(EXPECTED_RESULT_EDEFAULT);
				return;
			case LtlPackage.TEST_CASE__ACTUAL_RESULT:
				setActualResult(ACTUAL_RESULT_EDEFAULT);
				return;
			case LtlPackage.TEST_CASE__PASSED:
				setPassed(PASSED_EDEFAULT);
				return;
			case LtlPackage.TEST_CASE__INCIDENT:
				setIncident(INCIDENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LtlPackage.TEST_CASE__TESTING_METHOD:
				return TESTING_METHOD_EDEFAULT == null ? testingMethod != null : !TESTING_METHOD_EDEFAULT.equals(testingMethod);
			case LtlPackage.TEST_CASE__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case LtlPackage.TEST_CASE__EXPECTED_RESULT:
				return EXPECTED_RESULT_EDEFAULT == null ? expectedResult != null : !EXPECTED_RESULT_EDEFAULT.equals(expectedResult);
			case LtlPackage.TEST_CASE__ACTUAL_RESULT:
				return ACTUAL_RESULT_EDEFAULT == null ? actualResult != null : !ACTUAL_RESULT_EDEFAULT.equals(actualResult);
			case LtlPackage.TEST_CASE__PASSED:
				return passed != PASSED_EDEFAULT;
			case LtlPackage.TEST_CASE__INCIDENT:
				return INCIDENT_EDEFAULT == null ? incident != null : !INCIDENT_EDEFAULT.equals(incident);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (testingMethod: ");
		result.append(testingMethod);
		result.append(", inputs: ");
		result.append(inputs);
		result.append(", expectedResult: ");
		result.append(expectedResult);
		result.append(", actualResult: ");
		result.append(actualResult);
		result.append(", passed: ");
		result.append(passed);
		result.append(", incident: ");
		result.append(incident);
		result.append(')');
		return result.toString();
	}

} //TestCaseImpl
