/**
 */
package com.leonardo.ltl.ltl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Test Requirement states what must be verified/validated of a Testable Entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.leonardo.ltl.ltl.TestRequirement#getVersion <em>Version</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.TestRequirement#getTestableEntity <em>Testable Entity</em>}</li>
 * </ul>
 *
 * @see com.leonardo.ltl.ltl.LtlPackage#getTestRequirement()
 * @model
 * @generated
 */
public interface TestRequirement extends PackagableElement {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestRequirement_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link com.leonardo.ltl.ltl.TestRequirement#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Testable Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The entity associated with the requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Testable Entity</em>' reference.
	 * @see #setTestableEntity(TestableEntity)
	 * @see com.leonardo.ltl.ltl.LtlPackage#getTestRequirement_TestableEntity()
	 * @model
	 * @generated
	 */
	TestableEntity getTestableEntity();

	/**
	 * Sets the value of the '{@link com.leonardo.ltl.ltl.TestRequirement#getTestableEntity <em>Testable Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testable Entity</em>' reference.
	 * @see #getTestableEntity()
	 * @generated
	 */
	void setTestableEntity(TestableEntity value);

} // TestRequirement
