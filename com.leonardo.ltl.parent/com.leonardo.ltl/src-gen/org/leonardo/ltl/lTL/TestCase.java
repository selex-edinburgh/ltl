/**
 * generated by Xtext 2.31.0
 */
package org.leonardo.ltl.lTL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.leonardo.ltl.lTL.TestCase#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.leonardo.ltl.lTL.TestCase#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link org.leonardo.ltl.lTL.TestCase#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.leonardo.ltl.lTL.TestCase#getExpectedResults <em>Expected Results</em>}</li>
 * </ul>
 *
 * @see org.leonardo.ltl.lTL.LTLPackage#getTestCase()
 * @model
 * @generated
 */
public interface TestCase extends TestSpecification
{
  /**
   * Returns the value of the '<em><b>Precondition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Precondition</em>' attribute.
   * @see #setPrecondition(String)
   * @see org.leonardo.ltl.lTL.LTLPackage#getTestCase_Precondition()
   * @model
   * @generated
   */
  String getPrecondition();

  /**
   * Sets the value of the '{@link org.leonardo.ltl.lTL.TestCase#getPrecondition <em>Precondition</em>}' attribute.
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
   * @return the value of the '<em>Postcondition</em>' attribute.
   * @see #setPostcondition(String)
   * @see org.leonardo.ltl.lTL.LTLPackage#getTestCase_Postcondition()
   * @model
   * @generated
   */
  String getPostcondition();

  /**
   * Sets the value of the '{@link org.leonardo.ltl.lTL.TestCase#getPostcondition <em>Postcondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Postcondition</em>' attribute.
   * @see #getPostcondition()
   * @generated
   */
  void setPostcondition(String value);

  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
   * The list contents are of type {@link org.leonardo.ltl.lTL.Input}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference list.
   * @see org.leonardo.ltl.lTL.LTLPackage#getTestCase_Inputs()
   * @model containment="true"
   * @generated
   */
  EList<Input> getInputs();

  /**
   * Returns the value of the '<em><b>Expected Results</b></em>' containment reference list.
   * The list contents are of type {@link org.leonardo.ltl.lTL.ExpectedResults}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expected Results</em>' containment reference list.
   * @see org.leonardo.ltl.lTL.LTLPackage#getTestCase_ExpectedResults()
   * @model containment="true"
   * @generated
   */
  EList<ExpectedResults> getExpectedResults();

} // TestCase
