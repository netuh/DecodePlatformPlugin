/**
 */
package be.edu.ufpe.ines.decode.artifacts;

import be.edu.ufpe.ines.decode.aux.Nameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.artifacts.AbstractArtifact#getArtifactDomain <em>Artifact Domain</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.artifacts.AbstractArtifact#getFile <em>File</em>}</li>
 *   <li>{@link be.edu.ufpe.ines.decode.artifacts.AbstractArtifact#getLocalFilePath <em>Local File Path</em>}</li>
 * </ul>
 *
 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getAbstractArtifact()
 * @model abstract="true"
 * @generated
 */
public interface AbstractArtifact extends Nameable {
	/**
	 * Returns the value of the '<em><b>Artifact Domain</b></em>' attribute.
	 * The default value is <code>"Common"</code>.
	 * The literals are from the enumeration {@link be.edu.ufpe.ines.decode.artifacts.ArtifactLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Domain</em>' attribute.
	 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactLanguage
	 * @see #setArtifactDomain(ArtifactLanguage)
	 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getAbstractArtifact_ArtifactDomain()
	 * @model default="Common"
	 * @generated
	 */
	ArtifactLanguage getArtifactDomain();

	/**
	 * Sets the value of the '{@link be.edu.ufpe.ines.decode.artifacts.AbstractArtifact#getArtifactDomain <em>Artifact Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Domain</em>' attribute.
	 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactLanguage
	 * @see #getArtifactDomain()
	 * @generated
	 */
	void setArtifactDomain(ArtifactLanguage value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(byte[])
	 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getAbstractArtifact_File()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 * @generated
	 */
	byte[] getFile();

	/**
	 * Sets the value of the '{@link be.edu.ufpe.ines.decode.artifacts.AbstractArtifact#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(byte[] value);

	/**
	 * Returns the value of the '<em><b>Local File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local File Path</em>' attribute.
	 * @see #setLocalFilePath(String)
	 * @see be.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getAbstractArtifact_LocalFilePath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getLocalFilePath();

	/**
	 * Sets the value of the '{@link be.edu.ufpe.ines.decode.artifacts.AbstractArtifact#getLocalFilePath <em>Local File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local File Path</em>' attribute.
	 * @see #getLocalFilePath()
	 * @generated
	 */
	void setLocalFilePath(String value);

} // AbstractArtifact
