/**
 */
package br.edu.ufpe.ines.decode.taskDescription.measurements;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Log Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.edu.ufpe.ines.decode.taskDescription.measurements.MeasurementsPackage#getLogType()
 * @model
 * @generated
 */
public enum LogType implements Enumerator {
	/**
	 * The '<em><b>Log Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOG_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	LOG_TIME(0, "LogTime", "LogTime"),

	/**
	 * The '<em><b>Log Artifact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOG_ARTIFACT_VALUE
	 * @generated
	 * @ordered
	 */
	LOG_ARTIFACT(1, "LogArtifact", "LogArtifact");

	/**
	 * The '<em><b>Log Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Log Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOG_TIME
	 * @model name="LogTime"
	 * @generated
	 * @ordered
	 */
	public static final int LOG_TIME_VALUE = 0;

	/**
	 * The '<em><b>Log Artifact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Log Artifact</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOG_ARTIFACT
	 * @model name="LogArtifact"
	 * @generated
	 * @ordered
	 */
	public static final int LOG_ARTIFACT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Log Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LogType[] VALUES_ARRAY =
		new LogType[] {
			LOG_TIME,
			LOG_ARTIFACT,
		};

	/**
	 * A public read-only list of all the '<em><b>Log Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LogType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Log Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LogType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LogType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Log Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LogType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LogType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Log Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LogType get(int value) {
		switch (value) {
			case LOG_TIME_VALUE: return LOG_TIME;
			case LOG_ARTIFACT_VALUE: return LOG_ARTIFACT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LogType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //LogType
