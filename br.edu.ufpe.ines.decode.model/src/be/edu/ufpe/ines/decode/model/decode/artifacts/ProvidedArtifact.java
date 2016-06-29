/**
 */
package be.edu.ufpe.ines.decode.model.decode.artifacts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provided Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.artifacts.ProvidedArtifact#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactsPackage#getProvidedArtifact()
 * @model
 * @generated
 */
public interface ProvidedArtifact extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactType
	 * @see #setType(ArtifactType)
	 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactsPackage#getProvidedArtifact_Type()
	 * @model
	 * @generated
	 */
	ArtifactType getType();

	/**
	 * Sets the value of the '{@link be.edu.ufpe.ines.decode.model.decode.artifacts.ProvidedArtifact#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactType
	 * @see #getType()
	 * @generated
	 */
	void setType(ArtifactType value);

} // ProvidedArtifact
