/**
 */
package br.ufpe.ines.decode.decode;

import br.ufpe.ines.decode.decode.aux.AuxPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.ufpe.ines.decode.decode.DecodeFactory
 * @model kind="package"
 * @generated
 */
public interface DecodePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "decode";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/modelDecode";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modelDecode";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DecodePackage eINSTANCE = br.ufpe.ines.decode.decode.impl.DecodePackageImpl.init();

	/**
	 * The meta object id for the '{@link br.ufpe.ines.decode.decode.impl.CodingExperimentImpl <em>Coding Experiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufpe.ines.decode.decode.impl.CodingExperimentImpl
	 * @see br.ufpe.ines.decode.decode.impl.DecodePackageImpl#getCodingExperiment()
	 * @generated
	 */
	int CODING_EXPERIMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_EXPERIMENT__NAME = AuxPackage.NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_EXPERIMENT__ELEMENT_ID = AuxPackage.NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_EXPERIMENT__TASK = AuxPackage.NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provided Artefacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_EXPERIMENT__PROVIDED_ARTEFACTS = AuxPackage.NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Coding Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_EXPERIMENT_FEATURE_COUNT = AuxPackage.NAMEABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Coding Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_EXPERIMENT_OPERATION_COUNT = AuxPackage.NAMEABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link br.ufpe.ines.decode.decode.CodingExperiment <em>Coding Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coding Experiment</em>'.
	 * @see br.ufpe.ines.decode.decode.CodingExperiment
	 * @generated
	 */
	EClass getCodingExperiment();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufpe.ines.decode.decode.CodingExperiment#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task</em>'.
	 * @see br.ufpe.ines.decode.decode.CodingExperiment#getTask()
	 * @see #getCodingExperiment()
	 * @generated
	 */
	EReference getCodingExperiment_Task();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufpe.ines.decode.decode.CodingExperiment#getProvidedArtefacts <em>Provided Artefacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provided Artefacts</em>'.
	 * @see br.ufpe.ines.decode.decode.CodingExperiment#getProvidedArtefacts()
	 * @see #getCodingExperiment()
	 * @generated
	 */
	EReference getCodingExperiment_ProvidedArtefacts();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DecodeFactory getDecodeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.ufpe.ines.decode.decode.impl.CodingExperimentImpl <em>Coding Experiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufpe.ines.decode.decode.impl.CodingExperimentImpl
		 * @see br.ufpe.ines.decode.decode.impl.DecodePackageImpl#getCodingExperiment()
		 * @generated
		 */
		EClass CODING_EXPERIMENT = eINSTANCE.getCodingExperiment();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING_EXPERIMENT__TASK = eINSTANCE.getCodingExperiment_Task();

		/**
		 * The meta object literal for the '<em><b>Provided Artefacts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING_EXPERIMENT__PROVIDED_ARTEFACTS = eINSTANCE.getCodingExperiment_ProvidedArtefacts();

	}

} //DecodePackage
