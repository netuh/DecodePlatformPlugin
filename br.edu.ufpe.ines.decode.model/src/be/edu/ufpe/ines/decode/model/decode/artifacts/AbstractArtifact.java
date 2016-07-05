/**
 */
package be.edu.ufpe.ines.decode.model.decode.artifacts;

import be.edu.ufpe.ines.decode.model.decode.aux.Nameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.artifacts.AbstractArtifact#getArtifactDomain <em>Artifact Domain</em>}</li>
 * </ul>
 *
 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactsPackage#getAbstractArtifact()
 * @model abstract="true"
 * @generated
 */
public interface AbstractArtifact extends Nameable {

	/**
	 * Returns the value of the '<em><b>Artifact Domain</b></em>' attribute.
	 * The default value is <code>"Common"</code>.
	 * The literals are from the enumeration {@link be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Domain</em>' attribute.
	 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactLanguage
	 * @see #setArtifactDomain(ArtifactLanguage)
	 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactsPackage#getAbstractArtifact_ArtifactDomain()
	 * @model default="Common"
	 * @generated
	 */
	ArtifactLanguage getArtifactDomain();

	/**
	 * Sets the value of the '{@link be.edu.ufpe.ines.decode.model.decode.artifacts.AbstractArtifact#getArtifactDomain <em>Artifact Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Domain</em>' attribute.
	 * @see be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactLanguage
	 * @see #getArtifactDomain()
	 * @generated
	 */
	void setArtifactDomain(ArtifactLanguage value);
} // AbstractArtifact
