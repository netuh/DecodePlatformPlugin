/**
 */
package br.edu.ufpe.ines.decode.taskDescription;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.TimeRestriction#getTimeFrame <em>Time Frame</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.TimeRestriction#getDeadline <em>Deadline</em>}</li>
 * </ul>
 *
 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getTimeRestriction()
 * @model
 * @generated
 */
public interface TimeRestriction extends Restriction {
	/**
	 * Returns the value of the '<em><b>Time Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Frame</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Frame</em>' attribute.
	 * @see #setTimeFrame(BigInteger)
	 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getTimeRestriction_TimeFrame()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 * @generated
	 */
	BigInteger getTimeFrame();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.taskDescription.TimeRestriction#getTimeFrame <em>Time Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Frame</em>' attribute.
	 * @see #getTimeFrame()
	 * @generated
	 */
	void setTimeFrame(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #setDeadline(XMLGregorianCalendar)
	 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getTimeRestriction_Deadline()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 * @generated
	 */
	XMLGregorianCalendar getDeadline();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.taskDescription.TimeRestriction#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(XMLGregorianCalendar value);

} // TimeRestriction
