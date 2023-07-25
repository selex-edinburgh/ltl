/**
 * generated by Xtext 2.31.0
 */
package org.leonardo.ltl.lTL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.leonardo.ltl.lTL.ExpectedResults;
import org.leonardo.ltl.lTL.Input;
import org.leonardo.ltl.lTL.LTLFactory;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LTLFactoryImpl extends EFactoryImpl implements LTLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LTLFactory init()
  {
    try
    {
      LTLFactory theLTLFactory = (LTLFactory)EPackage.Registry.INSTANCE.getEFactory(LTLPackage.eNS_URI);
      if (theLTLFactory != null)
      {
        return theLTLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LTLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LTLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LTLPackage.MODEL: return createModel();
      case LTLPackage.PACKAGE: return createPackage();
      case LTLPackage.TESTING: return createTesting();
      case LTLPackage.TESTING_ACTIVITY: return createTestingActivity();
      case LTLPackage.TESTING_DESIGN: return createTestingDesign();
      case LTLPackage.TESTING_REALISATION: return createTestingRealisation();
      case LTLPackage.TESTING_ANALYSIS: return createTestingAnalysis();
      case LTLPackage.TESTABLE_ENTITY: return createTestableEntity();
      case LTLPackage.TEST_REQUIREMENT: return createTestRequirement();
      case LTLPackage.TEST_SPECIFICATION: return createTestSpecification();
      case LTLPackage.TEST_SUITE: return createTestSuite();
      case LTLPackage.TEST_CASE: return createTestCase();
      case LTLPackage.INPUT: return createInput();
      case LTLPackage.EXPECTED_RESULTS: return createExpectedResults();
      case LTLPackage.TESTING_METHOD: return createTestingMethod();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public org.leonardo.ltl.lTL.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Testing createTesting()
  {
    TestingImpl testing = new TestingImpl();
    return testing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TestingActivity createTestingActivity()
  {
    TestingActivityImpl testingActivity = new TestingActivityImpl();
    return testingActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TestingDesign createTestingDesign()
  {
    TestingDesignImpl testingDesign = new TestingDesignImpl();
    return testingDesign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TestingRealisation createTestingRealisation()
  {
    TestingRealisationImpl testingRealisation = new TestingRealisationImpl();
    return testingRealisation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TestingAnalysis createTestingAnalysis()
  {
    TestingAnalysisImpl testingAnalysis = new TestingAnalysisImpl();
    return testingAnalysis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TestableEntity createTestableEntity()
  {
    TestableEntityImpl testableEntity = new TestableEntityImpl();
    return testableEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TestRequirement createTestRequirement()
  {
    TestRequirementImpl testRequirement = new TestRequirementImpl();
    return testRequirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TestSpecification createTestSpecification()
  {
    TestSpecificationImpl testSpecification = new TestSpecificationImpl();
    return testSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TestSuite createTestSuite()
  {
    TestSuiteImpl testSuite = new TestSuiteImpl();
    return testSuite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TestCase createTestCase()
  {
    TestCaseImpl testCase = new TestCaseImpl();
    return testCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpectedResults createExpectedResults()
  {
    ExpectedResultsImpl expectedResults = new ExpectedResultsImpl();
    return expectedResults;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TestingMethod createTestingMethod()
  {
    TestingMethodImpl testingMethod = new TestingMethodImpl();
    return testingMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LTLPackage getLTLPackage()
  {
    return (LTLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LTLPackage getPackage()
  {
    return LTLPackage.eINSTANCE;
  }

} //LTLFactoryImpl