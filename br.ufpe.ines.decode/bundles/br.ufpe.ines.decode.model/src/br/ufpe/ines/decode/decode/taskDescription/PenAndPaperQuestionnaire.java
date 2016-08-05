/**
 */
package br.ufpe.ines.decode.decode.taskDescription;

import br.ufpe.ines.decode.decode.artifacts.OtherFile;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pen And Paper Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.decode.taskDescription.PenAndPaperQuestionnaire#getFilePDF <em>File PDF</em>}</li>
 * </ul>
 *
 * @see br.ufpe.ines.decode.decode.taskDescription.TaskDescriptionPackage#getPenAndPaperQuestionnaire()
 * @model
 * @generated
 */
public interface PenAndPaperQuestionnaire extends Questionnairemeasure {
	/**
	 * Returns the value of the '<em><b>File PDF</b></em>' reference list.
	 * The list contents are of type {@link br.ufpe.ines.decode.decode.artifacts.OtherFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File PDF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File PDF</em>' reference list.
	 * @see br.ufpe.ines.decode.decode.taskDescription.TaskDescriptionPackage#getPenAndPaperQuestionnaire_FilePDF()
	 * @model required="true"
	 * @generated
	 */
	EList<OtherFile> getFilePDF();

} // PenAndPaperQuestionnaire
