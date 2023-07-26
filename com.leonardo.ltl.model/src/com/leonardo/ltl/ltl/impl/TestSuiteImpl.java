/**
 */
package com.leonardo.ltl.ltl.impl;

import com.leonardo.ltl.ltl.LtlPackage;
import com.leonardo.ltl.ltl.TestSpecification;
import com.leonardo.ltl.ltl.TestSuite;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Suite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestSuiteImpl#getTestSpecifications <em>Test Specifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestSuiteImpl extends TestSpecificationImpl implements TestSuite {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestSuiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LtlPackage.Literals.TEST_SUITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TestSpecification> getTestSpecifications() {
		if (testSpecifications == null) {
			testSpecifications = new EObjectResolvingEList<TestSpecification>(TestSpecification.class, this, LtlPackage.TEST_SUITE__TEST_SPECIFICATIONS);
		}
		return testSpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LtlPackage.TEST_SUITE__TEST_SPECIFICATIONS:
				return getTestSpecifications();
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
			case LtlPackage.TEST_SUITE__TEST_SPECIFICATIONS:
				getTestSpecifications().clear();
				getTestSpecifications().addAll((Collection<? extends TestSpecification>)newValue);
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
			case LtlPackage.TEST_SUITE__TEST_SPECIFICATIONS:
				getTestSpecifications().clear();
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
			case LtlPackage.TEST_SUITE__TEST_SPECIFICATIONS:
				return testSpecifications != null && !testSpecifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TestSuiteImpl
