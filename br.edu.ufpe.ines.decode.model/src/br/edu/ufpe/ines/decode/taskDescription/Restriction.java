/**
 */
package br.edu.ufpe.ines.decode.taskDescription;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restriction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.Restriction#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.Restriction#getTimeFrame <em>Time Frame</em>}</li>
 * </ul>
 *
 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getRestriction()
 * @model
 * @generated
 */
public interface Restriction extends EObject {
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
	 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getRestriction_Deadline()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 * @generated
	 */
	XMLGregorianCalendar getDeadline();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.taskDescription.Restriction#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(XMLGregorianCalendar value);

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
	 * @see br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage#getRestriction_TimeFrame()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 * @generated
	 */
	BigInteger getTimeFrame();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.taskDescription.Restriction#getTimeFrame <em>Time Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Frame</em>' attribute.
	 * @see #getTimeFrame()
	 * @generated
	 */
	void setTimeFrame(BigInteger value);

} // Restriction
