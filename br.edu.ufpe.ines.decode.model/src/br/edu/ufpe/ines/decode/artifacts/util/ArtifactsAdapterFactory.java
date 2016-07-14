/**
 */
package br.edu.ufpe.ines.decode.artifacts.util;

import br.edu.ufpe.ines.decode.artifacts.*;

import br.edu.ufpe.ines.decode.aux.Nameable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage
 * @generated
 */
public class ArtifactsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArtifactsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArtifactsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactsSwitch<Adapter> modelSwitch =
		new ArtifactsSwitch<Adapter>() {
			@Override
			public Adapter caseProvidedArtefacts(ProvidedArtefacts object) {
				return createProvidedArtefactsAdapter();
			}
			@Override
			public Adapter caseFileArtifact(FileArtifact object) {
				return createFileArtifactAdapter();
			}
			@Override
			public Adapter caseAbstractArtifact(AbstractArtifact object) {
				return createAbstractArtifactAdapter();
			}
			@Override
			public Adapter caseQuestionnaireInner(QuestionnaireInner object) {
				return createQuestionnaireInnerAdapter();
			}
			@Override
			public Adapter caseProjectIDE(ProjectIDE object) {
				return createProjectIDEAdapter();
			}
			@Override
			public Adapter caseCompilationUnit(CompilationUnit object) {
				return createCompilationUnitAdapter();
			}
			@Override
			public Adapter casePdfFIle(PdfFIle object) {
				return createPdfFIleAdapter();
			}
			@Override
			public Adapter caseJavaProject(JavaProject object) {
				return createJavaProjectAdapter();
			}
			@Override
			public Adapter caseJavaCompUnit(JavaCompUnit object) {
				return createJavaCompUnitAdapter();
			}
			@Override
			public Adapter caseOtherFile(OtherFile object) {
				return createOtherFileAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseNameable(Nameable object) {
				return createNameableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.artifacts.ProvidedArtefacts <em>Provided Artefacts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.artifacts.ProvidedArtefacts
	 * @generated
	 */
	public Adapter createProvidedArtefactsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.artifacts.FileArtifact <em>File Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.artifacts.FileArtifact
	 * @generated
	 */
	public Adapter createFileArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.artifacts.AbstractArtifact <em>Abstract Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.artifacts.AbstractArtifact
	 * @generated
	 */
	public Adapter createAbstractArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.artifacts.QuestionnaireInner <em>Questionnaire Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.artifacts.QuestionnaireInner
	 * @generated
	 */
	public Adapter createQuestionnaireInnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.artifacts.ProjectIDE <em>Project IDE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.artifacts.ProjectIDE
	 * @generated
	 */
	public Adapter createProjectIDEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.artifacts.CompilationUnit <em>Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.artifacts.CompilationUnit
	 * @generated
	 */
	public Adapter createCompilationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.artifacts.PdfFIle <em>Pdf FIle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.artifacts.PdfFIle
	 * @generated
	 */
	public Adapter createPdfFIleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.artifacts.JavaProject <em>Java Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.artifacts.JavaProject
	 * @generated
	 */
	public Adapter createJavaProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.artifacts.JavaCompUnit <em>Java Comp Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.artifacts.JavaCompUnit
	 * @generated
	 */
	public Adapter createJavaCompUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.artifacts.OtherFile <em>Other File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.artifacts.OtherFile
	 * @generated
	 */
	public Adapter createOtherFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.artifacts.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.artifacts.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.ufpe.ines.decode.aux.Nameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.ufpe.ines.decode.aux.Nameable
	 * @generated
	 */
	public Adapter createNameableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArtifactsAdapterFactory
