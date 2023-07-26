/**
 */
package com.leonardo.ltl.ltl.util;

import com.leonardo.ltl.ltl.LtlPackage;
import com.leonardo.ltl.ltl.Model;
import com.leonardo.ltl.ltl.PackagableElement;
import com.leonardo.ltl.ltl.TestCase;
import com.leonardo.ltl.ltl.TestExecution;
import com.leonardo.ltl.ltl.TestRequirement;
import com.leonardo.ltl.ltl.TestSpecification;
import com.leonardo.ltl.ltl.TestSuite;
import com.leonardo.ltl.ltl.TestableEntity;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.leonardo.ltl.ltl.LtlPackage
 * @generated
 */
public class LtlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LtlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LtlSwitch() {
		if (modelPackage == null) {
			modelPackage = LtlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LtlPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LtlPackage.PACKAGE: {
				com.leonardo.ltl.ltl.Package package_ = (com.leonardo.ltl.ltl.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LtlPackage.PACKAGABLE_ELEMENT: {
				PackagableElement packagableElement = (PackagableElement)theEObject;
				T result = casePackagableElement(packagableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LtlPackage.TEST_EXECUTION: {
				TestExecution testExecution = (TestExecution)theEObject;
				T result = caseTestExecution(testExecution);
				if (result == null) result = casePackagableElement(testExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LtlPackage.TESTABLE_ENTITY: {
				TestableEntity testableEntity = (TestableEntity)theEObject;
				T result = caseTestableEntity(testableEntity);
				if (result == null) result = casePackagableElement(testableEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LtlPackage.TEST_REQUIREMENT: {
				TestRequirement testRequirement = (TestRequirement)theEObject;
				T result = caseTestRequirement(testRequirement);
				if (result == null) result = casePackagableElement(testRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LtlPackage.TEST_SPECIFICATION: {
				TestSpecification testSpecification = (TestSpecification)theEObject;
				T result = caseTestSpecification(testSpecification);
				if (result == null) result = casePackagableElement(testSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LtlPackage.TEST_SUITE: {
				TestSuite testSuite = (TestSuite)theEObject;
				T result = caseTestSuite(testSuite);
				if (result == null) result = caseTestSpecification(testSuite);
				if (result == null) result = casePackagableElement(testSuite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LtlPackage.TEST_CASE: {
				TestCase testCase = (TestCase)theEObject;
				T result = caseTestCase(testCase);
				if (result == null) result = caseTestSpecification(testCase);
				if (result == null) result = casePackagableElement(testCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(com.leonardo.ltl.ltl.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packagable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packagable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackagableElement(PackagableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestExecution(TestExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Testable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Testable Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestableEntity(TestableEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestRequirement(TestRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestSpecification(TestSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Suite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Suite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestSuite(TestSuite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestCase(TestCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LtlSwitch
