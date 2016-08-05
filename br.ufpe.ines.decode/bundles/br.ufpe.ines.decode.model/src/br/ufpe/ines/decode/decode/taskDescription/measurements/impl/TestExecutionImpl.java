/**
 */
package br.ufpe.ines.decode.decode.taskDescription.measurements.impl;

import br.ufpe.ines.decode.decode.taskDescription.measurements.MeasurementsPackage;
import br.ufpe.ines.decode.decode.taskDescription.measurements.TestExecution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.decode.taskDescription.measurements.impl.TestExecutionImpl#isObservePassedTest <em>Observe Passed Test</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestExecutionImpl extends ExecutionImpl implements TestExecution {
	/**
	 * The default value of the '{@link #isObservePassedTest() <em>Observe Passed Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObservePassedTest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBSERVE_PASSED_TEST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObservePassedTest() <em>Observe Passed Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObservePassedTest()
	 * @generated
	 * @ordered
	 */
	protected boolean observePassedTest = OBSERVE_PASSED_TEST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasurementsPackage.Literals.TEST_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObservePassedTest() {
		return observePassedTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservePassedTest(boolean newObservePassedTest) {
		boolean oldObservePassedTest = observePassedTest;
		observePassedTest = newObservePassedTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasurementsPackage.TEST_EXECUTION__OBSERVE_PASSED_TEST, oldObservePassedTest, observePassedTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeasurementsPackage.TEST_EXECUTION__OBSERVE_PASSED_TEST:
				return isObservePassedTest();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MeasurementsPackage.TEST_EXECUTION__OBSERVE_PASSED_TEST:
				setObservePassedTest((Boolean)newValue);
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
			case MeasurementsPackage.TEST_EXECUTION__OBSERVE_PASSED_TEST:
				setObservePassedTest(OBSERVE_PASSED_TEST_EDEFAULT);
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
			case MeasurementsPackage.TEST_EXECUTION__OBSERVE_PASSED_TEST:
				return observePassedTest != OBSERVE_PASSED_TEST_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (observePassedTest: ");
		result.append(observePassedTest);
		result.append(')');
		return result.toString();
	}

} //TestExecutionImpl
