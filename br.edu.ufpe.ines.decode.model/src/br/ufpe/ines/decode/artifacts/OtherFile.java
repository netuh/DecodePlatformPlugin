/**
 */
package br.ufpe.ines.decode.artifacts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Other File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.artifacts.OtherFile#getFolder <em>Folder</em>}</li>
 *   <li>{@link br.ufpe.ines.decode.artifacts.OtherFile#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see br.ufpe.ines.decode.artifacts.ArtifactsPackage#getOtherFile()
 * @model
 * @generated
 */
public interface OtherFile extends FileArtifact {
	/**
	 * Returns the value of the '<em><b>Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder</em>' attribute.
	 * @see #setFolder(String)
	 * @see br.ufpe.ines.decode.artifacts.ArtifactsPackage#getOtherFile_Folder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getFolder();

	/**
	 * Sets the value of the '{@link br.ufpe.ines.decode.artifacts.OtherFile#getFolder <em>Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' attribute.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see br.ufpe.ines.decode.artifacts.ArtifactsPackage#getOtherFile_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link br.ufpe.ines.decode.artifacts.OtherFile#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // OtherFile
