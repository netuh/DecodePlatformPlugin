/**
 */
package be.edu.ufpe.ines.decode.artifacts;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.artifacts.ComplexArtifact#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getComplexArtifact()
 * @model
 * @generated
 */
public interface ComplexArtifact extends AbstractArtifact {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Project"</code>.
	 * The literals are from the enumeration {@link be.edu.ufpe.ines.decode.artifacts.ComplexArtifactType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see be.edu.ufpe.ines.decode.artifacts.ComplexArtifactType
	 * @see #setType(ComplexArtifactType)
	 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getComplexArtifact_Type()
	 * @model default="Project"
	 * @generated
	 */
	ComplexArtifactType getType();

	/**
	 * Sets the value of the '{@link be.edu.ufpe.ines.decode.artifacts.ComplexArtifact#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see be.edu.ufpe.ines.decode.artifacts.ComplexArtifactType
	 * @see #getType()
	 * @generated
	 */
	void setType(ComplexArtifactType value);

} // ComplexArtifact
