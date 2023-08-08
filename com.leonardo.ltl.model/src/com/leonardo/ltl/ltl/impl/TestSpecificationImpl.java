/**
 */
package com.leonardo.ltl.ltl.impl;

import com.leonardo.ltl.ltl.LtlPackage;
import com.leonardo.ltl.ltl.TestRequirement;
import com.leonardo.ltl.ltl.TestSpecification;
import com.leonardo.ltl.ltl.TestableEntity;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestSpecificationImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestSpecificationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestSpecificationImpl#getTests <em>Tests</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestSpecificationImpl#getDemonstratesSatisfactionOf <em>Demonstrates Satisfaction Of</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestSpecificationImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link com.leonardo.ltl.ltl.impl.TestSpecificationImpl#getPostcondition <em>Postcondition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TestSpecificationImpl extends PackagableElementImpl implements TestSpecification {
	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected EList<TestableEntity> tests;

	/**
	 * The cached value of the '{@link #getDemonstratesSatisfactionOf() <em>Demonstrates Satisfaction Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemonstratesSatisfactionOf()
	 * @generated
	 * @ordered
	 */
	protected EList<TestRequirement> demonstratesSatisfactionOf;

	/**
	 * The default value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected String precondition = PRECONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostcondition() <em>Postcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTCONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected String postcondition = POSTCONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LtlPackage.Literals.TEST_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationDate(Date newCreationDate) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LtlPackage.TEST_SPECIFICATION__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LtlPackage.TEST_SPECIFICATION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TestableEntity> getTests() {
		if (tests == null) {
			tests = new EObjectResolvingEList<TestableEntity>(TestableEntity.class, this, LtlPackage.TEST_SPECIFICATION__TESTS);
		}
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TestRequirement> getDemonstratesSatisfactionOf() {
		if (demonstratesSatisfactionOf == null) {
			demonstratesSatisfactionOf = new EObjectResolvingEList<TestRequirement>(TestRequirement.class, this, LtlPackage.TEST_SPECIFICATION__DEMONSTRATES_SATISFACTION_OF);
		}
		return demonstratesSatisfactionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecondition(String newPrecondition) {
		String oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LtlPackage.TEST_SPECIFICATION__PRECONDITION, oldPrecondition, precondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostcondition() {
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostcondition(String newPostcondition) {
		String oldPostcondition = postcondition;
		postcondition = newPostcondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LtlPackage.TEST_SPECIFICATION__POSTCONDITION, oldPostcondition, postcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LtlPackage.TEST_SPECIFICATION__CREATION_DATE:
				return getCreationDate();
			case LtlPackage.TEST_SPECIFICATION__VERSION:
				return getVersion();
			case LtlPackage.TEST_SPECIFICATION__TESTS:
				return getTests();
			case LtlPackage.TEST_SPECIFICATION__DEMONSTRATES_SATISFACTION_OF:
				return getDemonstratesSatisfactionOf();
			case LtlPackage.TEST_SPECIFICATION__PRECONDITION:
				return getPrecondition();
			case LtlPackage.TEST_SPECIFICATION__POSTCONDITION:
				return getPostcondition();
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
			case LtlPackage.TEST_SPECIFICATION__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case LtlPackage.TEST_SPECIFICATION__VERSION:
				setVersion((String)newValue);
				return;
			case LtlPackage.TEST_SPECIFICATION__TESTS:
				getTests().clear();
				getTests().addAll((Collection<? extends TestableEntity>)newValue);
				return;
			case LtlPackage.TEST_SPECIFICATION__DEMONSTRATES_SATISFACTION_OF:
				getDemonstratesSatisfactionOf().clear();
				getDemonstratesSatisfactionOf().addAll((Collection<? extends TestRequirement>)newValue);
				return;
			case LtlPackage.TEST_SPECIFICATION__PRECONDITION:
				setPrecondition((String)newValue);
				return;
			case LtlPackage.TEST_SPECIFICATION__POSTCONDITION:
				setPostcondition((String)newValue);
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
			case LtlPackage.TEST_SPECIFICATION__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case LtlPackage.TEST_SPECIFICATION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case LtlPackage.TEST_SPECIFICATION__TESTS:
				getTests().clear();
				return;
			case LtlPackage.TEST_SPECIFICATION__DEMONSTRATES_SATISFACTION_OF:
				getDemonstratesSatisfactionOf().clear();
				return;
			case LtlPackage.TEST_SPECIFICATION__PRECONDITION:
				setPrecondition(PRECONDITION_EDEFAULT);
				return;
			case LtlPackage.TEST_SPECIFICATION__POSTCONDITION:
				setPostcondition(POSTCONDITION_EDEFAULT);
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
			case LtlPackage.TEST_SPECIFICATION__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case LtlPackage.TEST_SPECIFICATION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case LtlPackage.TEST_SPECIFICATION__TESTS:
				return tests != null && !tests.isEmpty();
			case LtlPackage.TEST_SPECIFICATION__DEMONSTRATES_SATISFACTION_OF:
				return demonstratesSatisfactionOf != null && !demonstratesSatisfactionOf.isEmpty();
			case LtlPackage.TEST_SPECIFICATION__PRECONDITION:
				return PRECONDITION_EDEFAULT == null ? precondition != null : !PRECONDITION_EDEFAULT.equals(precondition);
			case LtlPackage.TEST_SPECIFICATION__POSTCONDITION:
				return POSTCONDITION_EDEFAULT == null ? postcondition != null : !POSTCONDITION_EDEFAULT.equals(postcondition);
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
		result.append(" (creationDate: ");
		result.append(creationDate);
		result.append(", version: ");
		result.append(version);
		result.append(", precondition: ");
		result.append(precondition);
		result.append(", postcondition: ");
		result.append(postcondition);
		result.append(')');
		return result.toString();
	}

} //TestSpecificationImpl
