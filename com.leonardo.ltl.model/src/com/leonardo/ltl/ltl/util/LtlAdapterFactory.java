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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.leonardo.ltl.ltl.LtlPackage
 * @generated
 */
public class LtlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LtlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LtlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LtlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LtlSwitch<Adapter> modelSwitch =
		new LtlSwitch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter casePackage(com.leonardo.ltl.ltl.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter casePackagableElement(PackagableElement object) {
				return createPackagableElementAdapter();
			}
			@Override
			public Adapter caseTestExecution(TestExecution object) {
				return createTestExecutionAdapter();
			}
			@Override
			public Adapter caseTestableEntity(TestableEntity object) {
				return createTestableEntityAdapter();
			}
			@Override
			public Adapter caseTestRequirement(TestRequirement object) {
				return createTestRequirementAdapter();
			}
			@Override
			public Adapter caseTestSpecification(TestSpecification object) {
				return createTestSpecificationAdapter();
			}
			@Override
			public Adapter caseTestSuite(TestSuite object) {
				return createTestSuiteAdapter();
			}
			@Override
			public Adapter caseTestCase(TestCase object) {
				return createTestCaseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.leonardo.ltl.ltl.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.leonardo.ltl.ltl.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.leonardo.ltl.ltl.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.leonardo.ltl.ltl.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.leonardo.ltl.ltl.PackagableElement <em>Packagable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.leonardo.ltl.ltl.PackagableElement
	 * @generated
	 */
	public Adapter createPackagableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.leonardo.ltl.ltl.TestExecution <em>Test Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.leonardo.ltl.ltl.TestExecution
	 * @generated
	 */
	public Adapter createTestExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.leonardo.ltl.ltl.TestableEntity <em>Testable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.leonardo.ltl.ltl.TestableEntity
	 * @generated
	 */
	public Adapter createTestableEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.leonardo.ltl.ltl.TestRequirement <em>Test Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.leonardo.ltl.ltl.TestRequirement
	 * @generated
	 */
	public Adapter createTestRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.leonardo.ltl.ltl.TestSpecification <em>Test Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.leonardo.ltl.ltl.TestSpecification
	 * @generated
	 */
	public Adapter createTestSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.leonardo.ltl.ltl.TestSuite <em>Test Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.leonardo.ltl.ltl.TestSuite
	 * @generated
	 */
	public Adapter createTestSuiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.leonardo.ltl.ltl.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.leonardo.ltl.ltl.TestCase
	 * @generated
	 */
	public Adapter createTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LtlAdapterFactory
