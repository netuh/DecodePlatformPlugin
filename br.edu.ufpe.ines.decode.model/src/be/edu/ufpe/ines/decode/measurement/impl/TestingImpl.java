/**
 */
package be.edu.ufpe.ines.decode.measurement.impl;

import be.edu.ufpe.ines.decode.measurement.MeasurementPackage;
import be.edu.ufpe.ines.decode.measurement.Testing;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.measurement.impl.TestingImpl#getObservePassedTest <em>Observe Passed Test</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestingImpl extends ExecutionImpl implements Testing {
	/**
	 * The default value of the '{@link #getObservePassedTest() <em>Observe Passed Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservePassedTest()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean OBSERVE_PASSED_TEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservePassedTest() <em>Observe Passed Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservePassedTest()
	 * @generated
	 * @ordered
	 */
	protected Boolean observePassedTest = OBSERVE_PASSED_TEST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasurementPackage.Literals.TESTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getObservePassedTest() {
		return observePassedTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservePassedTest(Boolean newObservePassedTest) {
		Boolean oldObservePassedTest = observePassedTest;
		observePassedTest = newObservePassedTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasurementPackage.TESTING__OBSERVE_PASSED_TEST, oldObservePassedTest, observePassedTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeasurementPackage.TESTING__OBSERVE_PASSED_TEST:
				return getObservePassedTest();
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
			case MeasurementPackage.TESTING__OBSERVE_PASSED_TEST:
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
			case MeasurementPackage.TESTING__OBSERVE_PASSED_TEST:
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
			case MeasurementPackage.TESTING__OBSERVE_PASSED_TEST:
				return OBSERVE_PASSED_TEST_EDEFAULT == null ? observePassedTest != null : !OBSERVE_PASSED_TEST_EDEFAULT.equals(observePassedTest);
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
		result.append(" (ObservePassedTest: ");
		result.append(observePassedTest);
		result.append(')');
		return result.toString();
	}

} //TestingImpl
