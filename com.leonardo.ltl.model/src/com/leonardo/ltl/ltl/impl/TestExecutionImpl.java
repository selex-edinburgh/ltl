/**
 */
package com.leonardo.ltl.ltl.impl;

import com.leonardo.ltl.ltl.LtlPackage;
import com.leonardo.ltl.ltl.TestExecution;
import com.leonardo.ltl.ltl.TestResult;
import com.leonardo.ltl.ltl.TestSpecification;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestExecutionImpl#getExecutionDate <em>Execution Date</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestExecutionImpl#getTestSpecifications <em>Test Specifications</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestExecutionImpl#getTestResults <em>Test Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestExecutionImpl extends PackagableElementImpl implements TestExecution {
	/**
	 * The default value of the '{@link #getExecutionDate() <em>Execution Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXECUTION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionDate() <em>Execution Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionDate()
	 * @generated
	 * @ordered
	 */
	protected Date executionDate = EXECUTION_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestSpecifications() <em>Test Specifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<TestSpecification> testSpecifications;

	/**
	 * The cached value of the '{@link #getTestResults() <em>Test Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestResults()
	 * @generated
	 * @ordered
	 */
	protected EList<TestResult> testResults;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LtlPackage.Literals.TEST_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExecutionDate() {
		return executionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutionDate(Date newExecutionDate) {
		Date oldExecutionDate = executionDate;
		executionDate = newExecutionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LtlPackage.TEST_EXECUTION__EXECUTION_DATE, oldExecutionDate, executionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TestSpecification> getTestSpecifications() {
		if (testSpecifications == null) {
			testSpecifications = new EObjectResolvingEList<TestSpecification>(TestSpecification.class, this, LtlPackage.TEST_EXECUTION__TEST_SPECIFICATIONS);
		}
		return testSpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TestResult> getTestResults() {
		if (testResults == null) {
			testResults = new EObjectContainmentEList<TestResult>(TestResult.class, this, LtlPackage.TEST_EXECUTION__TEST_RESULTS);
		}
		return testResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LtlPackage.TEST_EXECUTION__TEST_RESULTS:
				return ((InternalEList<?>)getTestResults()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LtlPackage.TEST_EXECUTION__EXECUTION_DATE:
				return getExecutionDate();
			case LtlPackage.TEST_EXECUTION__TEST_SPECIFICATIONS:
				return getTestSpecifications();
			case LtlPackage.TEST_EXECUTION__TEST_RESULTS:
				return getTestResults();
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
			case LtlPackage.TEST_EXECUTION__EXECUTION_DATE:
				setExecutionDate((Date)newValue);
				return;
			case LtlPackage.TEST_EXECUTION__TEST_SPECIFICATIONS:
				getTestSpecifications().clear();
				getTestSpecifications().addAll((Collection<? extends TestSpecification>)newValue);
				return;
			case LtlPackage.TEST_EXECUTION__TEST_RESULTS:
				getTestResults().clear();
				getTestResults().addAll((Collection<? extends TestResult>)newValue);
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
			case LtlPackage.TEST_EXECUTION__EXECUTION_DATE:
				setExecutionDate(EXECUTION_DATE_EDEFAULT);
				return;
			case LtlPackage.TEST_EXECUTION__TEST_SPECIFICATIONS:
				getTestSpecifications().clear();
				return;
			case LtlPackage.TEST_EXECUTION__TEST_RESULTS:
				getTestResults().clear();
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
			case LtlPackage.TEST_EXECUTION__EXECUTION_DATE:
				return EXECUTION_DATE_EDEFAULT == null ? executionDate != null : !EXECUTION_DATE_EDEFAULT.equals(executionDate);
			case LtlPackage.TEST_EXECUTION__TEST_SPECIFICATIONS:
				return testSpecifications != null && !testSpecifications.isEmpty();
			case LtlPackage.TEST_EXECUTION__TEST_RESULTS:
				return testResults != null && !testResults.isEmpty();
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
		result.append(" (executionDate: ");
		result.append(executionDate);
		result.append(')');
		return result.toString();
	}

} //TestExecutionImpl
