/**
 */
package br.edu.ufpe.ines.decode.taskDescription.impl;

import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage;
import br.edu.ufpe.ines.decode.taskDescription.TimeRestriction;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.impl.TimeRestrictionImpl#getTimeFrame <em>Time Frame</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.impl.TimeRestrictionImpl#getDeadline <em>Deadline</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeRestrictionImpl extends RestrictionImpl implements TimeRestriction {
	/**
	 * The default value of the '{@link #getTimeFrame() <em>Time Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFrame()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TIME_FRAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeFrame() <em>Time Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFrame()
	 * @generated
	 * @ordered
	 */
	protected BigInteger timeFrame = TIME_FRAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEADLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar deadline = DEADLINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeRestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskDescriptionPackage.Literals.TIME_RESTRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTimeFrame() {
		return timeFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeFrame(BigInteger newTimeFrame) {
		BigInteger oldTimeFrame = timeFrame;
		timeFrame = newTimeFrame;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskDescriptionPackage.TIME_RESTRICTION__TIME_FRAME, oldTimeFrame, timeFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(XMLGregorianCalendar newDeadline) {
		XMLGregorianCalendar oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskDescriptionPackage.TIME_RESTRICTION__DEADLINE, oldDeadline, deadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskDescriptionPackage.TIME_RESTRICTION__TIME_FRAME:
				return getTimeFrame();
			case TaskDescriptionPackage.TIME_RESTRICTION__DEADLINE:
				return getDeadline();
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
			case TaskDescriptionPackage.TIME_RESTRICTION__TIME_FRAME:
				setTimeFrame((BigInteger)newValue);
				return;
			case TaskDescriptionPackage.TIME_RESTRICTION__DEADLINE:
				setDeadline((XMLGregorianCalendar)newValue);
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
			case TaskDescriptionPackage.TIME_RESTRICTION__TIME_FRAME:
				setTimeFrame(TIME_FRAME_EDEFAULT);
				return;
			case TaskDescriptionPackage.TIME_RESTRICTION__DEADLINE:
				setDeadline(DEADLINE_EDEFAULT);
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
			case TaskDescriptionPackage.TIME_RESTRICTION__TIME_FRAME:
				return TIME_FRAME_EDEFAULT == null ? timeFrame != null : !TIME_FRAME_EDEFAULT.equals(timeFrame);
			case TaskDescriptionPackage.TIME_RESTRICTION__DEADLINE:
				return DEADLINE_EDEFAULT == null ? deadline != null : !DEADLINE_EDEFAULT.equals(deadline);
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
		result.append(" (timeFrame: ");
		result.append(timeFrame);
		result.append(", deadline: ");
		result.append(deadline);
		result.append(')');
		return result.toString();
	}

} //TimeRestrictionImpl
