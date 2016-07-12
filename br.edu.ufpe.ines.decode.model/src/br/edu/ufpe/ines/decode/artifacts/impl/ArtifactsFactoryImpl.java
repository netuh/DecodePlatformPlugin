/**
 */
package br.edu.ufpe.ines.decode.artifacts.impl;

import br.edu.ufpe.ines.decode.artifacts.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
			case ArtifactsPackage.ATOMIC_ARTIFACT: return createAtomicArtifact();
			case ArtifactsPackage.PROVIDED_ARTEFACTS: return createProvidedArtefacts();
			case ArtifactsPackage.COMPLEX_ARTIFACT: return createComplexArtifact();
			case ArtifactsPackage.QUESTIONNAIRE: return createQuestionnaire();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ArtifactsPackage.ARTIFACT_TYPE:
				return createArtifactTypeFromString(eDataType, initialValue);
			case ArtifactsPackage.COMPLEX_ARTIFACT_TYPE:
				return createComplexArtifactTypeFromString(eDataType, initialValue);
			case ArtifactsPackage.ARTIFACT_LANGUAGE:
				return createArtifactLanguageFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ArtifactsPackage.ARTIFACT_TYPE:
				return convertArtifactTypeToString(eDataType, instanceValue);
			case ArtifactsPackage.COMPLEX_ARTIFACT_TYPE:
				return convertComplexArtifactTypeToString(eDataType, instanceValue);
			case ArtifactsPackage.ARTIFACT_LANGUAGE:
				return convertArtifactLanguageToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicArtifact createAtomicArtifact() {
		AtomicArtifactImpl atomicArtifact = new AtomicArtifactImpl();
		return atomicArtifact;
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
	public ComplexArtifact createComplexArtifact() {
		ComplexArtifactImpl complexArtifact = new ComplexArtifactImpl();
		return complexArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire createQuestionnaire() {
		QuestionnaireImpl questionnaire = new QuestionnaireImpl();
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactType createArtifactTypeFromString(EDataType eDataType, String initialValue) {
		ArtifactType result = ArtifactType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexArtifactType createComplexArtifactTypeFromString(EDataType eDataType, String initialValue) {
		ComplexArtifactType result = ComplexArtifactType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComplexArtifactTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactLanguage createArtifactLanguageFromString(EDataType eDataType, String initialValue) {
		ArtifactLanguage result = ArtifactLanguage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
