/**
 */
package com.leonardo.ltl.ltl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Test Specification is the concrete executable artefact to perform testing. It can be a TestCase or a TestSuite, a group of TestCase.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.leonardo.ltl.ltl.TestSpecification#getDate <em>Date</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.TestSpecification#getVersion <em>Version</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.TestSpecification#getTestableEntities <em>Testable Entities</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.TestSpecification#getTestRequirements <em>Test Requirements</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.TestSpecification#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.TestSpecification#getPostcondition <em>Postcondition</em>}</li>
 * </ul>
 *
 * @see com.leonardo.ltl.ltl.LtlPackage#getTestSpecification()
 * @model abstract="true"
 * @generated
 */
public interface TestSpecification extends PackagableElement {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date time the test specification is executed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestSpecification_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link com.leonardo.ltl.ltl.TestSpecification#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the test specification
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestSpecification_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link com.leonardo.ltl.ltl.TestSpecification#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Testable Entities</b></em>' reference list.
	 * The list contents are of type {@link com.leonardo.ltl.ltl.TestableEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entities that are being tested
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Testable Entities</em>' reference list.
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestSpecification_TestableEntities()
	 * @model
	 * @generated
	 */
	EList<TestableEntity> getTestableEntities();

	/**
	 * Returns the value of the '<em><b>Test Requirements</b></em>' reference list.
	 * The list contents are of type {@link com.leonardo.ltl.ltl.TestRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The test requirements that the test specification addresses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Requirements</em>' reference list.
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestSpecification_TestRequirements()
	 * @model
	 * @generated
	 */
	EList<TestRequirement> getTestRequirements();

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The precondition that must be set up before running test specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precondition</em>' attribute.
	 * @see #setPrecondition(String)
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestSpecification_Precondition()
	 * @model
	 * @generated
	 */
	String getPrecondition();

	/**
	 * Sets the value of the '{@link com.leonardo.ltl.ltl.TestSpecification#getPrecondition <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' attribute.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(String value);

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The postcondition after running the test specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postcondition</em>' attribute.
	 * @see #setPostcondition(String)
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestSpecification_Postcondition()
	 * @model
	 * @generated
	 */
	String getPostcondition();

	/**
	 * Sets the value of the '{@link com.leonardo.ltl.ltl.TestSpecification#getPostcondition <em>Postcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcondition</em>' attribute.
	 * @see #getPostcondition()
	 * @generated
	 */
	void setPostcondition(String value);

} // TestSpecification
