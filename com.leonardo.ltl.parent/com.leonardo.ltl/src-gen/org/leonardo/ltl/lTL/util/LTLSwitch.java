/**
 * generated by Xtext 2.31.0
 */
package org.leonardo.ltl.lTL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.leonardo.ltl.lTL.ExpectedResults;
import org.leonardo.ltl.lTL.Input;
import org.leonardo.ltl.lTL.LTLPackage;
import org.leonardo.ltl.lTL.Model;
import org.leonardo.ltl.lTL.TestCase;
import org.leonardo.ltl.lTL.TestRequirement;
import org.leonardo.ltl.lTL.TestSpecification;
import org.leonardo.ltl.lTL.TestSuite;
import org.leonardo.ltl.lTL.TestableEntity;
import org.leonardo.ltl.lTL.Testing;
import org.leonardo.ltl.lTL.TestingActivity;
import org.leonardo.ltl.lTL.TestingAnalysis;
import org.leonardo.ltl.lTL.TestingDesign;
import org.leonardo.ltl.lTL.TestingMethod;
import org.leonardo.ltl.lTL.TestingRealisation;

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
 * @see org.leonardo.ltl.lTL.LTLPackage
 * @generated
 */
public class LTLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LTLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LTLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LTLPackage.eINSTANCE;
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
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LTLPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LTLPackage.PACKAGE:
      {
        org.leonardo.ltl.lTL.Package package_ = (org.leonardo.ltl.lTL.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LTLPackage.TESTING:
      {
        Testing testing = (Testing)theEObject;
        T result = caseTesting(testing);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LTLPackage.TESTING_ACTIVITY:
      {
        TestingActivity testingActivity = (TestingActivity)theEObject;
        T result = caseTestingActivity(testingActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LTLPackage.TESTING_DESIGN:
      {
        TestingDesign testingDesign = (TestingDesign)theEObject;
        T result = caseTestingDesign(testingDesign);
        if (result == null) result = caseTestingActivity(testingDesign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LTLPackage.TESTING_REALISATION:
      {
        TestingRealisation testingRealisation = (TestingRealisation)theEObject;
        T result = caseTestingRealisation(testingRealisation);
        if (result == null) result = caseTestingActivity(testingRealisation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LTLPackage.TESTING_ANALYSIS:
      {
        TestingAnalysis testingAnalysis = (TestingAnalysis)theEObject;
        T result = caseTestingAnalysis(testingAnalysis);
        if (result == null) result = caseTestingActivity(testingAnalysis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LTLPackage.TESTABLE_ENTITY:
      {
        TestableEntity testableEntity = (TestableEntity)theEObject;
        T result = caseTestableEntity(testableEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LTLPackage.TEST_REQUIREMENT:
      {
        TestRequirement testRequirement = (TestRequirement)theEObject;
        T result = caseTestRequirement(testRequirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LTLPackage.TEST_SPECIFICATION:
      {
        TestSpecification testSpecification = (TestSpecification)theEObject;
        T result = caseTestSpecification(testSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LTLPackage.TEST_SUITE:
      {
        TestSuite testSuite = (TestSuite)theEObject;
        T result = caseTestSuite(testSuite);
        if (result == null) result = caseTestSpecification(testSuite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LTLPackage.TEST_CASE:
      {
        TestCase testCase = (TestCase)theEObject;
        T result = caseTestCase(testCase);
        if (result == null) result = caseTestSpecification(testCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LTLPackage.INPUT:
      {
        Input input = (Input)theEObject;
        T result = caseInput(input);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LTLPackage.EXPECTED_RESULTS:
      {
        ExpectedResults expectedResults = (ExpectedResults)theEObject;
        T result = caseExpectedResults(expectedResults);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LTLPackage.TESTING_METHOD:
      {
        TestingMethod testingMethod = (TestingMethod)theEObject;
        T result = caseTestingMethod(testingMethod);
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
  public T caseModel(Model object)
  {
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
  public T casePackage(org.leonardo.ltl.lTL.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Testing</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Testing</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTesting(Testing object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Testing Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Testing Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTestingActivity(TestingActivity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Testing Design</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Testing Design</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTestingDesign(TestingDesign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Testing Realisation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Testing Realisation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTestingRealisation(TestingRealisation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Testing Analysis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Testing Analysis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTestingAnalysis(TestingAnalysis object)
  {
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
  public T caseTestableEntity(TestableEntity object)
  {
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
  public T caseTestRequirement(TestRequirement object)
  {
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
  public T caseTestSpecification(TestSpecification object)
  {
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
  public T caseTestSuite(TestSuite object)
  {
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
  public T caseTestCase(TestCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInput(Input object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expected Results</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expected Results</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpectedResults(ExpectedResults object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Testing Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Testing Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTestingMethod(TestingMethod object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LTLSwitch