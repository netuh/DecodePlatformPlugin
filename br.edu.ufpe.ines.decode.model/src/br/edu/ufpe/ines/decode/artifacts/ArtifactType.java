/**
 */
package br.edu.ufpe.ines.decode.artifacts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Artifact Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getArtifactType()
 * @model
 * @generated
 */
public enum ArtifactType implements Enumerator {
	/**
	 * The '<em><b>Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE_VALUE
	 * @generated
	 * @ordered
	 */
	CODE(0, "Code", "Code"),

	/**
	 * The '<em><b>Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_VALUE
	 * @generated
	 * @ordered
	 */
	TEST(1, "Test", "Test"),

	/**
	 * The '<em><b>Description</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	DESCRIPTION(2, "Description", "Description"),

	/**
	 * The '<em><b>Design</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESIGN_VALUE
	 * @generated
	 * @ordered
	 */
	DESIGN(3, "Design", "Design");

	/**
	 * The '<em><b>Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Code</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CODE
	 * @model name="Code"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_VALUE = 0;

	/**
	 * The '<em><b>Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Test</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEST
	 * @model name="Test"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_VALUE = 1;

	/**
	 * The '<em><b>Description</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Description</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESCRIPTION
	 * @model name="Description"
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIPTION_VALUE = 2;

	/**
	 * The '<em><b>Design</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Design</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESIGN
	 * @model name="Design"
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Artifact Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArtifactType[] VALUES_ARRAY =
		new ArtifactType[] {
			CODE,
			TEST,
			DESCRIPTION,
			DESIGN,
		};

	/**
	 * A public read-only list of all the '<em><b>Artifact Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArtifactType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Artifact Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactType get(int value) {
		switch (value) {
			case CODE_VALUE: return CODE;
			case TEST_VALUE: return TEST;
			case DESCRIPTION_VALUE: return DESCRIPTION;
			case DESIGN_VALUE: return DESIGN;
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
	private ArtifactType(int value, String name, String literal) {
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
	
} //ArtifactType
