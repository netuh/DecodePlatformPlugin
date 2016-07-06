/**
 */
package be.edu.ufpe.ines.decode.artifacts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.artifacts.AtomicArtifact#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getAtomicArtifact()
 * @model
 * @generated
 */
public interface AtomicArtifact extends AbstractArtifact {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link be.edu.ufpe.ines.decode.artifacts.ArtifactType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactType
	 * @see #setType(ArtifactType)
	 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getAtomicArtifact_Type()
	 * @model
	 * @generated
	 */
	ArtifactType getType();

	/**
	 * Sets the value of the '{@link be.edu.ufpe.ines.decode.artifacts.AtomicArtifact#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactType
	 * @see #getType()
	 * @generated
	 */
	void setType(ArtifactType value);

} // AtomicArtifact
