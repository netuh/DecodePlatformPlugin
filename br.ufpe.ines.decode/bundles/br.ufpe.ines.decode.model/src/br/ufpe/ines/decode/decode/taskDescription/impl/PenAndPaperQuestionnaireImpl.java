/**
 */
package br.ufpe.ines.decode.decode.taskDescription.impl;

import br.ufpe.ines.decode.decode.artifacts.OtherFile;

import br.ufpe.ines.decode.decode.taskDescription.PenAndPaperQuestionnaire;
import br.ufpe.ines.decode.decode.taskDescription.TaskDescriptionPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pen And Paper Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.decode.taskDescription.impl.PenAndPaperQuestionnaireImpl#getFilePDF <em>File PDF</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PenAndPaperQuestionnaireImpl extends QuestionnairemeasureImpl implements PenAndPaperQuestionnaire {
	/**
	 * The cached value of the '{@link #getFilePDF() <em>File PDF</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePDF()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherFile> filePDF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PenAndPaperQuestionnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskDescriptionPackage.Literals.PEN_AND_PAPER_QUESTIONNAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherFile> getFilePDF() {
		if (filePDF == null) {
			filePDF = new EObjectResolvingEList<OtherFile>(OtherFile.class, this, TaskDescriptionPackage.PEN_AND_PAPER_QUESTIONNAIRE__FILE_PDF);
		}
		return filePDF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskDescriptionPackage.PEN_AND_PAPER_QUESTIONNAIRE__FILE_PDF:
				return getFilePDF();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TaskDescriptionPackage.PEN_AND_PAPER_QUESTIONNAIRE__FILE_PDF:
				getFilePDF().clear();
				getFilePDF().addAll((Collection<? extends OtherFile>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TaskDescriptionPackage.PEN_AND_PAPER_QUESTIONNAIRE__FILE_PDF:
				getFilePDF().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TaskDescriptionPackage.PEN_AND_PAPER_QUESTIONNAIRE__FILE_PDF:
				return filePDF != null && !filePDF.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PenAndPaperQuestionnaireImpl
