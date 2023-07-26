/**
 */
package com.leonardo.ltl.ltl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.leonardo.ltl.ltl.LtlFactory
 * @model kind="package"
 * @generated
 */
public interface LtlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ltl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.leonardo.com/ltl/LTL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ltl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LtlPackage eINSTANCE = com.leonardo.ltl.ltl.impl.LtlPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.leonardo.ltl.ltl.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.leonardo.ltl.ltl.impl.ModelImpl
	 * @see com.leonardo.ltl.ltl.impl.LtlPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PACKAGES = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.leonardo.ltl.ltl.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.leonardo.ltl.ltl.impl.PackageImpl
	 * @see com.leonardo.ltl.ltl.impl.LtlPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Packagable Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGABLE_ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.leonardo.ltl.ltl.impl.PackagableElementImpl <em>Packagable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.leonardo.ltl.ltl.impl.PackagableElementImpl
	 * @see com.leonardo.ltl.ltl.impl.LtlPackageImpl#getPackagableElement()
	 * @generated
	 */
	int PACKAGABLE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGABLE_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGABLE_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Packagable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGABLE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.leonardo.ltl.ltl.impl.TestExecutionImpl <em>Test Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.leonardo.ltl.ltl.impl.TestExecutionImpl
	 * @see com.leonardo.ltl.ltl.impl.LtlPackageImpl#getTestExecution()
	 * @generated
	 */
	int TEST_EXECUTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EXECUTION__NAME = PACKAGABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EXECUTION__DESCRIPTION = PACKAGABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EXECUTION__DATE = PACKAGABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test Specifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EXECUTION__TEST_SPECIFICATIONS = PACKAGABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_EXECUTION_FEATURE_COUNT = PACKAGABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.leonardo.ltl.ltl.impl.TestableEntityImpl <em>Testable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.leonardo.ltl.ltl.impl.TestableEntityImpl
	 * @see com.leonardo.ltl.ltl.impl.LtlPackageImpl#getTestableEntity()
	 * @generated
	 */
	int TESTABLE_ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTABLE_ENTITY__NAME = PACKAGABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTABLE_ENTITY__DESCRIPTION = PACKAGABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTABLE_ENTITY__VERSION = PACKAGABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Testable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTABLE_ENTITY_FEATURE_COUNT = PACKAGABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.leonardo.ltl.ltl.impl.TestRequirementImpl <em>Test Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.leonardo.ltl.ltl.impl.TestRequirementImpl
	 * @see com.leonardo.ltl.ltl.impl.LtlPackageImpl#getTestRequirement()
	 * @generated
	 */
	int TEST_REQUIREMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_REQUIREMENT__NAME = PACKAGABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_REQUIREMENT__DESCRIPTION = PACKAGABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_REQUIREMENT__VERSION = PACKAGABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Testable Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_REQUIREMENT__TESTABLE_ENTITY = PACKAGABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_REQUIREMENT_FEATURE_COUNT = PACKAGABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.leonardo.ltl.ltl.impl.TestSpecificationImpl <em>Test Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.leonardo.ltl.ltl.impl.TestSpecificationImpl
	 * @see com.leonardo.ltl.ltl.impl.LtlPackageImpl#getTestSpecification()
	 * @generated
	 */
	int TEST_SPECIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__NAME = PACKAGABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__DESCRIPTION = PACKAGABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__DATE = PACKAGABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__VERSION = PACKAGABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Testable Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__TESTABLE_ENTITIES = PACKAGABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Test Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__TEST_REQUIREMENTS = PACKAGABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__PRECONDITION = PACKAGABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION__POSTCONDITION = PACKAGABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Test Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SPECIFICATION_FEATURE_COUNT = PACKAGABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.leonardo.ltl.ltl.impl.TestSuiteImpl <em>Test Suite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.leonardo.ltl.ltl.impl.TestSuiteImpl
	 * @see com.leonardo.ltl.ltl.impl.LtlPackageImpl#getTestSuite()
	 * @generated
	 */
	int TEST_SUITE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__NAME = TEST_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__DESCRIPTION = TEST_SPECIFICATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__DATE = TEST_SPECIFICATION__DATE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__VERSION = TEST_SPECIFICATION__VERSION;

	/**
	 * The feature id for the '<em><b>Testable Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__TESTABLE_ENTITIES = TEST_SPECIFICATION__TESTABLE_ENTITIES;

	/**
	 * The feature id for the '<em><b>Test Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__TEST_REQUIREMENTS = TEST_SPECIFICATION__TEST_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__PRECONDITION = TEST_SPECIFICATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__POSTCONDITION = TEST_SPECIFICATION__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Test Specifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE__TEST_SPECIFICATIONS = TEST_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_FEATURE_COUNT = TEST_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.leonardo.ltl.ltl.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.leonardo.ltl.ltl.impl.TestCaseImpl
	 * @see com.leonardo.ltl.ltl.impl.LtlPackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__NAME = TEST_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__DESCRIPTION = TEST_SPECIFICATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__DATE = TEST_SPECIFICATION__DATE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__VERSION = TEST_SPECIFICATION__VERSION;

	/**
	 * The feature id for the '<em><b>Testable Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__TESTABLE_ENTITIES = TEST_SPECIFICATION__TESTABLE_ENTITIES;

	/**
	 * The feature id for the '<em><b>Test Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__TEST_REQUIREMENTS = TEST_SPECIFICATION__TEST_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__PRECONDITION = TEST_SPECIFICATION__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__POSTCONDITION = TEST_SPECIFICATION__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Testing Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__TESTING_METHOD = TEST_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__INPUTS = TEST_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expected Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__EXPECTED_RESULT = TEST_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actual Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__ACTUAL_RESULT = TEST_SPECIFICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Passed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__PASSED = TEST_SPECIFICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Incident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__INCIDENT = TEST_SPECIFICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = TEST_SPECIFICATION_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link com.leonardo.ltl.ltl.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.leonardo.ltl.ltl.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.leonardo.ltl.ltl.Model#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see com.leonardo.ltl.ltl.Model#getPackages()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Packages();

	/**
	 * Returns the meta object for class '{@link com.leonardo.ltl.ltl.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see com.leonardo.ltl.ltl.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link com.leonardo.ltl.ltl.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.leonardo.ltl.ltl.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.leonardo.ltl.ltl.Package#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.leonardo.ltl.ltl.Package#getDescription()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.leonardo.ltl.ltl.Package#getPackagableElements <em>Packagable Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packagable Elements</em>'.
	 * @see com.leonardo.ltl.ltl.Package#getPackagableElements()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_PackagableElements();

	/**
	 * Returns the meta object for class '{@link com.leonardo.ltl.ltl.PackagableElement <em>Packagable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packagable Element</em>'.
	 * @see com.leonardo.ltl.ltl.PackagableElement
	 * @generated
	 */
	EClass getPackagableElement();

	/**
	 * Returns the meta object for the attribute '{@link com.leonardo.ltl.ltl.PackagableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.leonardo.ltl.ltl.PackagableElement#getName()
	 * @see #getPackagableElement()
	 * @generated
	 */
	EAttribute getPackagableElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.leonardo.ltl.ltl.PackagableElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.leonardo.ltl.ltl.PackagableElement#getDescription()
	 * @see #getPackagableElement()
	 * @generated
	 */
	EAttribute getPackagableElement_Description();

	/**
	 * Returns the meta object for class '{@link com.leonardo.ltl.ltl.TestExecution <em>Test Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Execution</em>'.
	 * @see com.leonardo.ltl.ltl.TestExecution
	 * @generated
	 */
	EClass getTestExecution();

	/**
	 * Returns the meta object for the attribute '{@link com.leonardo.ltl.ltl.TestExecution#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see com.leonardo.ltl.ltl.TestExecution#getDate()
	 * @see #getTestExecution()
	 * @generated
	 */
	EAttribute getTestExecution_Date();

	/**
	 * Returns the meta object for the reference list '{@link com.leonardo.ltl.ltl.TestExecution#getTestSpecifications <em>Test Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test Specifications</em>'.
	 * @see com.leonardo.ltl.ltl.TestExecution#getTestSpecifications()
	 * @see #getTestExecution()
	 * @generated
	 */
	EReference getTestExecution_TestSpecifications();

	/**
	 * Returns the meta object for class '{@link com.leonardo.ltl.ltl.TestableEntity <em>Testable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testable Entity</em>'.
	 * @see com.leonardo.ltl.ltl.TestableEntity
	 * @generated
	 */
	EClass getTestableEntity();

	/**
	 * Returns the meta object for the attribute '{@link com.leonardo.ltl.ltl.TestableEntity#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.leonardo.ltl.ltl.TestableEntity#getVersion()
	 * @see #getTestableEntity()
	 * @generated
	 */
	EAttribute getTestableEntity_Version();

	/**
	 * Returns the meta object for class '{@link com.leonardo.ltl.ltl.TestRequirement <em>Test Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Requirement</em>'.
	 * @see com.leonardo.ltl.ltl.TestRequirement
	 * @generated
	 */
	EClass getTestRequirement();

	/**
	 * Returns the meta object for the attribute '{@link com.leonardo.ltl.ltl.TestRequirement#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.leonardo.ltl.ltl.TestRequirement#getVersion()
	 * @see #getTestRequirement()
	 * @generated
	 */
	EAttribute getTestRequirement_Version();

	/**
	 * Returns the meta object for the reference '{@link com.leonardo.ltl.ltl.TestRequirement#getTestableEntity <em>Testable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Testable Entity</em>'.
	 * @see com.leonardo.ltl.ltl.TestRequirement#getTestableEntity()
	 * @see #getTestRequirement()
	 * @generated
	 */
	EReference getTestRequirement_TestableEntity();

	/**
	 * Returns the meta object for class '{@link com.leonardo.ltl.ltl.TestSpecification <em>Test Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Specification</em>'.
	 * @see com.leonardo.ltl.ltl.TestSpecification
	 * @generated
	 */
	EClass getTestSpecification();

	/**
	 * Returns the meta object for the attribute '{@link com.leonardo.ltl.ltl.TestSpecification#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see com.leonardo.ltl.ltl.TestSpecification#getDate()
	 * @see #getTestSpecification()
	 * @generated
	 */
	EAttribute getTestSpecification_Date();

	/**
	 * Returns the meta object for the attribute '{@link com.leonardo.ltl.ltl.TestSpecification#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.leonardo.ltl.ltl.TestSpecification#getVersion()
	 * @see #getTestSpecification()
	 * @generated
	 */
	EAttribute getTestSpecification_Version();

	/**
	 * Returns the meta object for the reference list '{@link com.leonardo.ltl.ltl.TestSpecification#getTestableEntities <em>Testable Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Testable Entities</em>'.
	 * @see com.leonardo.ltl.ltl.TestSpecification#getTestableEntities()
	 * @see #getTestSpecification()
	 * @generated
	 */
	EReference getTestSpecification_TestableEntities();

	/**
	 * Returns the meta object for the reference list '{@link com.leonardo.ltl.ltl.TestSpecification#getTestRequirements <em>Test Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test Requirements</em>'.
	 * @see com.leonardo.ltl.ltl.TestSpecification#getTestRequirements()
	 * @see #getTestSpecification()
	 * @generated
	 */
	EReference getTestSpecification_TestRequirements();

	/**
	 * Returns the meta object for the attribute '{@link com.leonardo.ltl.ltl.TestSpecification#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition</em>'.
	 * @see com.leonardo.ltl.ltl.TestSpecification#getPrecondition()
	 * @see #getTestSpecification()
	 * @generated
	 */
	EAttribute getTestSpecification_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link com.leonardo.ltl.ltl.TestSpecification#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postcondition</em>'.
	 * @see com.leonardo.ltl.ltl.TestSpecification#getPostcondition()
	 * @see #getTestSpecification()
	 * @generated
	 */
	EAttribute getTestSpecification_Postcondition();

	/**
	 * Returns the meta object for class '{@link com.leonardo.ltl.ltl.TestSuite <em>Test Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Suite</em>'.
	 * @see com.leonardo.ltl.ltl.TestSuite
	 * @generated
	 */
	EClass getTestSuite();

	/**
	 * Returns the meta object for the reference list '{@link com.leonardo.ltl.ltl.TestSuite#getTestSpecifications <em>Test Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test Specifications</em>'.
	 * @see com.leonardo.ltl.ltl.TestSuite#getTestSpecifications()
	 * @see #getTestSuite()
	 * @generated
	 */
	EReference getTestSuite_TestSpecifications();

	/**
	 * Returns the meta object for class '{@link com.leonardo.ltl.ltl.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see com.leonardo.ltl.ltl.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the attribute '{@link com.leonardo.ltl.ltl.TestCase#getTestingMethod <em>Testing Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Method</em>'.
	 * @see com.leonardo.ltl.ltl.TestCase#getTestingMethod()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_TestingMethod();

	/**
	 * Returns the meta object for the attribute list '{@link com.leonardo.ltl.ltl.TestCase#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inputs</em>'.
	 * @see com.leonardo.ltl.ltl.TestCase#getInputs()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_Inputs();

	/**
	 * Returns the meta object for the attribute '{@link com.leonardo.ltl.ltl.TestCase#getExpectedResult <em>Expected Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Result</em>'.
	 * @see com.leonardo.ltl.ltl.TestCase#getExpectedResult()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_ExpectedResult();

	/**
	 * Returns the meta object for the attribute '{@link com.leonardo.ltl.ltl.TestCase#getActualResult <em>Actual Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Result</em>'.
	 * @see com.leonardo.ltl.ltl.TestCase#getActualResult()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_ActualResult();

	/**
	 * Returns the meta object for the attribute '{@link com.leonardo.ltl.ltl.TestCase#isPassed <em>Passed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passed</em>'.
	 * @see com.leonardo.ltl.ltl.TestCase#isPassed()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_Passed();

	/**
	 * Returns the meta object for the attribute '{@link com.leonardo.ltl.ltl.TestCase#getIncident <em>Incident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incident</em>'.
	 * @see com.leonardo.ltl.ltl.TestCase#getIncident()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_Incident();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LtlFactory getLtlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.leonardo.ltl.ltl.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.leonardo.ltl.ltl.impl.ModelImpl
		 * @see com.leonardo.ltl.ltl.impl.LtlPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PACKAGES = eINSTANCE.getModel_Packages();

		/**
		 * The meta object literal for the '{@link com.leonardo.ltl.ltl.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.leonardo.ltl.ltl.impl.PackageImpl
		 * @see com.leonardo.ltl.ltl.impl.LtlPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__DESCRIPTION = eINSTANCE.getPackage_Description();

		/**
		 * The meta object literal for the '<em><b>Packagable Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGABLE_ELEMENTS = eINSTANCE.getPackage_PackagableElements();

		/**
		 * The meta object literal for the '{@link com.leonardo.ltl.ltl.impl.PackagableElementImpl <em>Packagable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.leonardo.ltl.ltl.impl.PackagableElementImpl
		 * @see com.leonardo.ltl.ltl.impl.LtlPackageImpl#getPackagableElement()
		 * @generated
		 */
		EClass PACKAGABLE_ELEMENT = eINSTANCE.getPackagableElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGABLE_ELEMENT__NAME = eINSTANCE.getPackagableElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGABLE_ELEMENT__DESCRIPTION = eINSTANCE.getPackagableElement_Description();

		/**
		 * The meta object literal for the '{@link com.leonardo.ltl.ltl.impl.TestExecutionImpl <em>Test Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.leonardo.ltl.ltl.impl.TestExecutionImpl
		 * @see com.leonardo.ltl.ltl.impl.LtlPackageImpl#getTestExecution()
		 * @generated
		 */
		EClass TEST_EXECUTION = eINSTANCE.getTestExecution();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_EXECUTION__DATE = eINSTANCE.getTestExecution_Date();

		/**
		 * The meta object literal for the '<em><b>Test Specifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_EXECUTION__TEST_SPECIFICATIONS = eINSTANCE.getTestExecution_TestSpecifications();

		/**
		 * The meta object literal for the '{@link com.leonardo.ltl.ltl.impl.TestableEntityImpl <em>Testable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.leonardo.ltl.ltl.impl.TestableEntityImpl
		 * @see com.leonardo.ltl.ltl.impl.LtlPackageImpl#getTestableEntity()
		 * @generated
		 */
		EClass TESTABLE_ENTITY = eINSTANCE.getTestableEntity();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTABLE_ENTITY__VERSION = eINSTANCE.getTestableEntity_Version();

		/**
		 * The meta object literal for the '{@link com.leonardo.ltl.ltl.impl.TestRequirementImpl <em>Test Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.leonardo.ltl.ltl.impl.TestRequirementImpl
		 * @see com.leonardo.ltl.ltl.impl.LtlPackageImpl#getTestRequirement()
		 * @generated
		 */
		EClass TEST_REQUIREMENT = eINSTANCE.getTestRequirement();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_REQUIREMENT__VERSION = eINSTANCE.getTestRequirement_Version();

		/**
		 * The meta object literal for the '<em><b>Testable Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_REQUIREMENT__TESTABLE_ENTITY = eINSTANCE.getTestRequirement_TestableEntity();

		/**
		 * The meta object literal for the '{@link com.leonardo.ltl.ltl.impl.TestSpecificationImpl <em>Test Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.leonardo.ltl.ltl.impl.TestSpecificationImpl
		 * @see com.leonardo.ltl.ltl.impl.LtlPackageImpl#getTestSpecification()
		 * @generated
		 */
		EClass TEST_SPECIFICATION = eINSTANCE.getTestSpecification();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_SPECIFICATION__DATE = eINSTANCE.getTestSpecification_Date();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_SPECIFICATION__VERSION = eINSTANCE.getTestSpecification_Version();

		/**
		 * The meta object literal for the '<em><b>Testable Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SPECIFICATION__TESTABLE_ENTITIES = eINSTANCE.getTestSpecification_TestableEntities();

		/**
		 * The meta object literal for the '<em><b>Test Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SPECIFICATION__TEST_REQUIREMENTS = eINSTANCE.getTestSpecification_TestRequirements();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_SPECIFICATION__PRECONDITION = eINSTANCE.getTestSpecification_Precondition();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_SPECIFICATION__POSTCONDITION = eINSTANCE.getTestSpecification_Postcondition();

		/**
		 * The meta object literal for the '{@link com.leonardo.ltl.ltl.impl.TestSuiteImpl <em>Test Suite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.leonardo.ltl.ltl.impl.TestSuiteImpl
		 * @see com.leonardo.ltl.ltl.impl.LtlPackageImpl#getTestSuite()
		 * @generated
		 */
		EClass TEST_SUITE = eINSTANCE.getTestSuite();

		/**
		 * The meta object literal for the '<em><b>Test Specifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SUITE__TEST_SPECIFICATIONS = eINSTANCE.getTestSuite_TestSpecifications();

		/**
		 * The meta object literal for the '{@link com.leonardo.ltl.ltl.impl.TestCaseImpl <em>Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.leonardo.ltl.ltl.impl.TestCaseImpl
		 * @see com.leonardo.ltl.ltl.impl.LtlPackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>Testing Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__TESTING_METHOD = eINSTANCE.getTestCase_TestingMethod();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__INPUTS = eINSTANCE.getTestCase_Inputs();

		/**
		 * The meta object literal for the '<em><b>Expected Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__EXPECTED_RESULT = eINSTANCE.getTestCase_ExpectedResult();

		/**
		 * The meta object literal for the '<em><b>Actual Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__ACTUAL_RESULT = eINSTANCE.getTestCase_ActualResult();

		/**
		 * The meta object literal for the '<em><b>Passed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__PASSED = eINSTANCE.getTestCase_Passed();

		/**
		 * The meta object literal for the '<em><b>Incident</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__INCIDENT = eINSTANCE.getTestCase_Incident();

	}

} //LtlPackage
