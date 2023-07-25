/**
 * generated by Xtext 2.31.0
 */
package org.leonardo.ltl.lTL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.leonardo.ltl.lTL.LTLPackage;
import org.leonardo.ltl.lTL.TestCase;
import org.leonardo.ltl.lTL.TestSuite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Suite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.leonardo.ltl.lTL.impl.TestSuiteImpl#getTestCases <em>Test Cases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestSuiteImpl extends TestSpecificationImpl implements TestSuite
{
  /**
   * The cached value of the '{@link #getTestCases() <em>Test Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestCases()
   * @generated
   * @ordered
   */
  protected EList<TestCase> testCases;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestSuiteImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LTLPackage.Literals.TEST_SUITE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<TestCase> getTestCases()
  {
    if (testCases == null)
    {
      testCases = new EObjectContainmentEList<TestCase>(TestCase.class, this, LTLPackage.TEST_SUITE__TEST_CASES);
    }
    return testCases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LTLPackage.TEST_SUITE__TEST_CASES:
        return ((InternalEList<?>)getTestCases()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LTLPackage.TEST_SUITE__TEST_CASES:
        return getTestCases();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LTLPackage.TEST_SUITE__TEST_CASES:
        getTestCases().clear();
        getTestCases().addAll((Collection<? extends TestCase>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LTLPackage.TEST_SUITE__TEST_CASES:
        getTestCases().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LTLPackage.TEST_SUITE__TEST_CASES:
        return testCases != null && !testCases.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TestSuiteImpl
