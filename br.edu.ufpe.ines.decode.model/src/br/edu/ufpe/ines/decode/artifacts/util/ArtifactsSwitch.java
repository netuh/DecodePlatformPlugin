/**
 */
package br.edu.ufpe.ines.decode.artifacts.util;

import br.edu.ufpe.ines.decode.artifacts.*;

import br.edu.ufpe.ines.decode.aux.Nameable;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage
 * @generated
 */
public class ArtifactsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArtifactsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactsSwitch() {
		if (modelPackage == null) {
			modelPackage = ArtifactsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ArtifactsPackage.PROVIDED_ARTEFACTS: {
				ProvidedArtefacts providedArtefacts = (ProvidedArtefacts)theEObject;
				T result = caseProvidedArtefacts(providedArtefacts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtifactsPackage.FILE_ARTIFACT: {
				FileArtifact fileArtifact = (FileArtifact)theEObject;
				T result = caseFileArtifact(fileArtifact);
				if (result == null) result = caseNameable(fileArtifact);
				if (result == null) result = caseAbstractArtifact(fileArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtifactsPackage.ABSTRACT_ARTIFACT: {
				AbstractArtifact abstractArtifact = (AbstractArtifact)theEObject;
				T result = caseAbstractArtifact(abstractArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtifactsPackage.QUESTIONNAIRE_INNER: {
				QuestionnaireInner questionnaireInner = (QuestionnaireInner)theEObject;
				T result = caseQuestionnaireInner(questionnaireInner);
				if (result == null) result = caseAbstractArtifact(questionnaireInner);
				if (result == null) result = caseNameable(questionnaireInner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtifactsPackage.PROJECT_IDE: {
				ProjectIDE projectIDE = (ProjectIDE)theEObject;
				T result = caseProjectIDE(projectIDE);
				if (result == null) result = caseAbstractArtifact(projectIDE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtifactsPackage.COMPILATION_UNIT: {
				CompilationUnit compilationUnit = (CompilationUnit)theEObject;
				T result = caseCompilationUnit(compilationUnit);
				if (result == null) result = caseFileArtifact(compilationUnit);
				if (result == null) result = caseNameable(compilationUnit);
				if (result == null) result = caseAbstractArtifact(compilationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtifactsPackage.PDF_FILE: {
				PdfFIle pdfFIle = (PdfFIle)theEObject;
				T result = casePdfFIle(pdfFIle);
				if (result == null) result = caseFileArtifact(pdfFIle);
				if (result == null) result = caseNameable(pdfFIle);
				if (result == null) result = caseAbstractArtifact(pdfFIle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtifactsPackage.JAVA_PROJECT: {
				JavaProject javaProject = (JavaProject)theEObject;
				T result = caseJavaProject(javaProject);
				if (result == null) result = caseProjectIDE(javaProject);
				if (result == null) result = caseAbstractArtifact(javaProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtifactsPackage.JAVA_COMP_UNIT: {
				JavaCompUnit javaCompUnit = (JavaCompUnit)theEObject;
				T result = caseJavaCompUnit(javaCompUnit);
				if (result == null) result = caseCompilationUnit(javaCompUnit);
				if (result == null) result = caseFileArtifact(javaCompUnit);
				if (result == null) result = caseNameable(javaCompUnit);
				if (result == null) result = caseAbstractArtifact(javaCompUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArtifactsPackage.OTHER_FILE: {
				OtherFile otherFile = (OtherFile)theEObject;
				T result = caseOtherFile(otherFile);
				if (result == null) result = caseFileArtifact(otherFile);
				if (result == null) result = caseNameable(otherFile);
				if (result == null) result = caseAbstractArtifact(otherFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provided Artefacts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provided Artefacts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidedArtefacts(ProvidedArtefacts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileArtifact(FileArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractArtifact(AbstractArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire Inner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire Inner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaireInner(QuestionnaireInner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project IDE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project IDE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectIDE(ProjectIDE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnit(CompilationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pdf FIle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pdf FIle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePdfFIle(PdfFIle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaProject(JavaProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Comp Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Comp Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaCompUnit(JavaCompUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherFile(OtherFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameable(Nameable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArtifactsSwitch
