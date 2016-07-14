/**
 */
package br.edu.ufpe.ines.decode.artifacts.impl;

import br.edu.ufpe.ines.decode.artifacts.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactsFactoryImpl extends EFactoryImpl implements ArtifactsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArtifactsFactory init() {
		try {
			ArtifactsFactory theArtifactsFactory = (ArtifactsFactory)EPackage.Registry.INSTANCE.getEFactory(ArtifactsPackage.eNS_URI);
			if (theArtifactsFactory != null) {
				return theArtifactsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArtifactsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArtifactsPackage.PROVIDED_ARTEFACTS: return createProvidedArtefacts();
			case ArtifactsPackage.QUESTIONNAIRE_INNER: return createQuestionnaireInner();
			case ArtifactsPackage.PDF_FILE: return createPdfFIle();
			case ArtifactsPackage.JAVA_PROJECT: return createJavaProject();
			case ArtifactsPackage.JAVA_COMP_UNIT: return createJavaCompUnit();
			case ArtifactsPackage.OTHER_FILE: return createOtherFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedArtefacts createProvidedArtefacts() {
		ProvidedArtefactsImpl providedArtefacts = new ProvidedArtefactsImpl();
		return providedArtefacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireInner createQuestionnaireInner() {
		QuestionnaireInnerImpl questionnaireInner = new QuestionnaireInnerImpl();
		return questionnaireInner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PdfFIle createPdfFIle() {
		PdfFIleImpl pdfFIle = new PdfFIleImpl();
		return pdfFIle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaProject createJavaProject() {
		JavaProjectImpl javaProject = new JavaProjectImpl();
		return javaProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaCompUnit createJavaCompUnit() {
		JavaCompUnitImpl javaCompUnit = new JavaCompUnitImpl();
		return javaCompUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherFile createOtherFile() {
		OtherFileImpl otherFile = new OtherFileImpl();
		return otherFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactsPackage getArtifactsPackage() {
		return (ArtifactsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArtifactsPackage getPackage() {
		return ArtifactsPackage.eINSTANCE;
	}

} //ArtifactsFactoryImpl
