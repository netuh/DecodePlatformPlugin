/**
 */
package br.edu.ufpe.ines.decode.taskDescription.impl;

import br.edu.ufpe.ines.decode.taskDescription.Restriction;
import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.impl.RestrictionImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.impl.RestrictionImpl#getTimeFrame <em>Time Frame</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestrictionImpl extends MinimalEObjectImpl.Container implements Restriction {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskDescriptionPackage.Literals.RESTRICTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskDescriptionPackage.RESTRICTION__DEADLINE, oldDeadline, deadline));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskDescriptionPackage.RESTRICTION__TIME_FRAME, oldTimeFrame, timeFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskDescriptionPackage.RESTRICTION__DEADLINE:
				return getDeadline();
			case TaskDescriptionPackage.RESTRICTION__TIME_FRAME:
				return getTimeFrame();
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
			case TaskDescriptionPackage.RESTRICTION__DEADLINE:
				setDeadline((XMLGregorianCalendar)newValue);
				return;
			case TaskDescriptionPackage.RESTRICTION__TIME_FRAME:
				setTimeFrame((BigInteger)newValue);
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
			case TaskDescriptionPackage.RESTRICTION__DEADLINE:
				setDeadline(DEADLINE_EDEFAULT);
				return;
			case TaskDescriptionPackage.RESTRICTION__TIME_FRAME:
				setTimeFrame(TIME_FRAME_EDEFAULT);
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
			case TaskDescriptionPackage.RESTRICTION__DEADLINE:
				return DEADLINE_EDEFAULT == null ? deadline != null : !DEADLINE_EDEFAULT.equals(deadline);
			case TaskDescriptionPackage.RESTRICTION__TIME_FRAME:
				return TIME_FRAME_EDEFAULT == null ? timeFrame != null : !TIME_FRAME_EDEFAULT.equals(timeFrame);
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
		result.append(" (deadline: ");
		result.append(deadline);
		result.append(", timeFrame: ");
		result.append(timeFrame);
		result.append(')');
		return result.toString();
	}

} //RestrictionImpl
