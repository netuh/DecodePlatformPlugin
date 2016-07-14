/**
 */
package br.edu.ufpe.ines.decode.artifacts;

import br.edu.ufpe.ines.decode.aux.Nameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.FileArtifact#getFile <em>File</em>}</li>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.FileArtifact#getLocalFilePath <em>Local File Path</em>}</li>
 * </ul>
 *
 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getFileArtifact()
 * @model abstract="true"
 * @generated
 */
public interface FileArtifact extends Nameable, AbstractArtifact {
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
	 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getFileArtifact_File()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 * @generated
	 */
	byte[] getFile();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.artifacts.FileArtifact#getFile <em>File</em>}' attribute.
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
	 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage#getFileArtifact_LocalFilePath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getLocalFilePath();

	/**
	 * Sets the value of the '{@link br.edu.ufpe.ines.decode.artifacts.FileArtifact#getLocalFilePath <em>Local File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local File Path</em>' attribute.
	 * @see #getLocalFilePath()
	 * @generated
	 */
	void setLocalFilePath(String value);

} // FileArtifact
