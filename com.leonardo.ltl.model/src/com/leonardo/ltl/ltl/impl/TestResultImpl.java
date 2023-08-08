/**
 */
package com.leonardo.ltl.ltl.impl;

import com.leonardo.ltl.ltl.LtlPackage;
import com.leonardo.ltl.ltl.TestCase;
import com.leonardo.ltl.ltl.TestResult;
import com.leonardo.ltl.ltl.TestSpecification;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestResultImpl#getResultDate <em>Result Date</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestResultImpl#getExecutedTestCase <em>Executed Test Case</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestResultImpl#getActualResult <em>Actual Result</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestResultImpl#isPassed <em>Passed</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestResultImpl#getIncident <em>Incident</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestResultImpl extends PackagableElementImpl implements TestResult {
	/**
	 * The default value of the '{@link #getResultDate() <em>Result Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RESULT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultDate() <em>Result Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultDate()
	 * @generated
	 * @ordered
	 */
	protected Date resultDate = RESULT_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExecutedTestCase() <em>Executed Test Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedTestCase()
	 * @generated
	 * @ordered
	 */
	protected TestCase executedTestCase;

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
	protected TestResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LtlPackage.Literals.TEST_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getResultDate() {
		return resultDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultDate(Date newResultDate) {
		Date oldResultDate = resultDate;
		resultDate = newResultDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LtlPackage.TEST_RESULT__RESULT_DATE, oldResultDate, resultDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestCase getExecutedTestCase() {
		if (executedTestCase != null && executedTestCase.eIsProxy()) {
			InternalEObject oldExecutedTestCase = (InternalEObject)executedTestCase;
			executedTestCase = (TestCase)eResolveProxy(oldExecutedTestCase);
			if (executedTestCase != oldExecutedTestCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LtlPackage.TEST_RESULT__EXECUTED_TEST_CASE, oldExecutedTestCase, executedTestCase));
			}
		}
		return executedTestCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCase basicGetExecutedTestCase() {
		return executedTestCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutedTestCase(TestCase newExecutedTestCase) {
		TestCase oldExecutedTestCase = executedTestCase;
		executedTestCase = newExecutedTestCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LtlPackage.TEST_RESULT__EXECUTED_TEST_CASE, oldExecutedTestCase, executedTestCase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LtlPackage.TEST_RESULT__ACTUAL_RESULT, oldActualResult, actualResult));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LtlPackage.TEST_RESULT__PASSED, oldPassed, passed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LtlPackage.TEST_RESULT__INCIDENT, oldIncident, incident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LtlPackage.TEST_RESULT__RESULT_DATE:
				return getResultDate();
			case LtlPackage.TEST_RESULT__EXECUTED_TEST_CASE:
				if (resolve) return getExecutedTestCase();
				return basicGetExecutedTestCase();
			case LtlPackage.TEST_RESULT__ACTUAL_RESULT:
				return getActualResult();
			case LtlPackage.TEST_RESULT__PASSED:
				return isPassed();
			case LtlPackage.TEST_RESULT__INCIDENT:
				return getIncident();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LtlPackage.TEST_RESULT__RESULT_DATE:
				setResultDate((Date)newValue);
				return;
			case LtlPackage.TEST_RESULT__EXECUTED_TEST_CASE:
				setExecutedTestCase((TestCase)newValue);
				return;
			case LtlPackage.TEST_RESULT__ACTUAL_RESULT:
				setActualResult(newValue);
				return;
			case LtlPackage.TEST_RESULT__PASSED:
				setPassed((Boolean)newValue);
				return;
			case LtlPackage.TEST_RESULT__INCIDENT:
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
			case LtlPackage.TEST_RESULT__RESULT_DATE:
				setResultDate(RESULT_DATE_EDEFAULT);
				return;
			case LtlPackage.TEST_RESULT__EXECUTED_TEST_CASE:
				setExecutedTestCase((TestCase)null);
				return;
			case LtlPackage.TEST_RESULT__ACTUAL_RESULT:
				setActualResult(ACTUAL_RESULT_EDEFAULT);
				return;
			case LtlPackage.TEST_RESULT__PASSED:
				setPassed(PASSED_EDEFAULT);
				return;
			case LtlPackage.TEST_RESULT__INCIDENT:
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
			case LtlPackage.TEST_RESULT__RESULT_DATE:
				return RESULT_DATE_EDEFAULT == null ? resultDate != null : !RESULT_DATE_EDEFAULT.equals(resultDate);
			case LtlPackage.TEST_RESULT__EXECUTED_TEST_CASE:
				return executedTestCase != null;
			case LtlPackage.TEST_RESULT__ACTUAL_RESULT:
				return ACTUAL_RESULT_EDEFAULT == null ? actualResult != null : !ACTUAL_RESULT_EDEFAULT.equals(actualResult);
			case LtlPackage.TEST_RESULT__PASSED:
				return passed != PASSED_EDEFAULT;
			case LtlPackage.TEST_RESULT__INCIDENT:
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
		result.append(" (resultDate: ");
		result.append(resultDate);
		result.append(", actualResult: ");
		result.append(actualResult);
		result.append(", passed: ");
		result.append(passed);
		result.append(", incident: ");
		result.append(incident);
		result.append(')');
		return result.toString();
	}

} //TestResultImpl
