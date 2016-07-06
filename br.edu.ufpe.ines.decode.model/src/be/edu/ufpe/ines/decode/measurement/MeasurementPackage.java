/**
 */
package be.edu.ufpe.ines.decode.measurement;

import be.edu.ufpe.ines.decode.aux.AuxPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see be.edu.ufpe.ines.decode.measurement.MeasurementFactory
 * @model kind="package"
 * @generated
 */
public interface MeasurementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "measurement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "measurement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "measurement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MeasurementPackage eINSTANCE = be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl.init();

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.measurement.impl.MeasurementsImpl <em>Measurements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementsImpl
	 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getMeasurements()
	 * @generated
	 */
	int MEASUREMENTS = 0;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENTS__MEASUREMENTS = 0;

	/**
	 * The number of structural features of the '<em>Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Measurements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.measurement.impl.AbstractMeasurementImpl <em>Abstract Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.measurement.impl.AbstractMeasurementImpl
	 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getAbstractMeasurement()
	 * @generated
	 */
	int ABSTRACT_MEASUREMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASUREMENT__NAME = AuxPackage.NAMEABLE__NAME;

	/**
	 * The number of structural features of the '<em>Abstract Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASUREMENT_FEATURE_COUNT = AuxPackage.NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MEASUREMENT_OPERATION_COUNT = AuxPackage.NAMEABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.measurement.impl.SurveyImpl <em>Survey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.measurement.impl.SurveyImpl
	 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getSurvey()
	 * @generated
	 */
	int SURVEY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__NAME = ABSTRACT_MEASUREMENT__NAME;

	/**
	 * The number of structural features of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_FEATURE_COUNT = ABSTRACT_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_OPERATION_COUNT = ABSTRACT_MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.measurement.impl.TimeOnTaskImpl <em>Time On Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.measurement.impl.TimeOnTaskImpl
	 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getTimeOnTask()
	 * @generated
	 */
	int TIME_ON_TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ON_TASK__NAME = ABSTRACT_MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Related Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ON_TASK__RELATED_TASK = ABSTRACT_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time On Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ON_TASK_FEATURE_COUNT = ABSTRACT_MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time On Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ON_TASK_OPERATION_COUNT = ABSTRACT_MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.measurement.impl.ObservingArtifactImpl <em>Observing Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.measurement.impl.ObservingArtifactImpl
	 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getObservingArtifact()
	 * @generated
	 */
	int OBSERVING_ARTIFACT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVING_ARTIFACT__NAME = ABSTRACT_MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Aspect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVING_ARTIFACT__ASPECT = ABSTRACT_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Observing Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVING_ARTIFACT_FEATURE_COUNT = ABSTRACT_MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Observing Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVING_ARTIFACT_OPERATION_COUNT = ABSTRACT_MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.measurement.impl.ObservingProvidedArtifactImpl <em>Observing Provided Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.measurement.impl.ObservingProvidedArtifactImpl
	 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getObservingProvidedArtifact()
	 * @generated
	 */
	int OBSERVING_PROVIDED_ARTIFACT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVING_PROVIDED_ARTIFACT__NAME = OBSERVING_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Aspect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVING_PROVIDED_ARTIFACT__ASPECT = OBSERVING_ARTIFACT__ASPECT;

	/**
	 * The feature id for the '<em><b>Observed Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVING_PROVIDED_ARTIFACT__OBSERVED_ARTIFACT = OBSERVING_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Observing Provided Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVING_PROVIDED_ARTIFACT_FEATURE_COUNT = OBSERVING_ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Observing Provided Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVING_PROVIDED_ARTIFACT_OPERATION_COUNT = OBSERVING_ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.measurement.impl.ObservingProducedArtifactImpl <em>Observing Produced Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.measurement.impl.ObservingProducedArtifactImpl
	 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getObservingProducedArtifact()
	 * @generated
	 */
	int OBSERVING_PRODUCED_ARTIFACT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVING_PRODUCED_ARTIFACT__NAME = OBSERVING_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Aspect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVING_PRODUCED_ARTIFACT__ASPECT = OBSERVING_ARTIFACT__ASPECT;

	/**
	 * The number of structural features of the '<em>Observing Produced Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVING_PRODUCED_ARTIFACT_FEATURE_COUNT = OBSERVING_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Observing Produced Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVING_PRODUCED_ARTIFACT_OPERATION_COUNT = OBSERVING_ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.measurement.impl.ObservingAllArtifactsImpl <em>Observing All Artifacts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.measurement.impl.ObservingAllArtifactsImpl
	 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getObservingAllArtifacts()
	 * @generated
	 */
	int OBSERVING_ALL_ARTIFACTS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVING_ALL_ARTIFACTS__NAME = OBSERVING_ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Aspect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVING_ALL_ARTIFACTS__ASPECT = OBSERVING_ARTIFACT__ASPECT;

	/**
	 * The number of structural features of the '<em>Observing All Artifacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVING_ALL_ARTIFACTS_FEATURE_COUNT = OBSERVING_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Observing All Artifacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVING_ALL_ARTIFACTS_OPERATION_COUNT = OBSERVING_ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.measurement.impl.AspectObservedImpl <em>Aspect Observed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.measurement.impl.AspectObservedImpl
	 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getAspectObserved()
	 * @generated
	 */
	int ASPECT_OBSERVED = 7;

	/**
	 * The number of structural features of the '<em>Aspect Observed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_OBSERVED_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Aspect Observed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_OBSERVED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.measurement.impl.EditionImpl <em>Edition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.measurement.impl.EditionImpl
	 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getEdition()
	 * @generated
	 */
	int EDITION = 8;

	/**
	 * The number of structural features of the '<em>Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION_FEATURE_COUNT = ASPECT_OBSERVED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION_OPERATION_COUNT = ASPECT_OBSERVED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.measurement.impl.ExecutionImpl <em>Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.measurement.impl.ExecutionImpl
	 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getExecution()
	 * @generated
	 */
	int EXECUTION = 9;

	/**
	 * The number of structural features of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEATURE_COUNT = ASPECT_OBSERVED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OPERATION_COUNT = ASPECT_OBSERVED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.measurement.impl.TestingImpl <em>Testing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.measurement.impl.TestingImpl
	 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getTesting()
	 * @generated
	 */
	int TESTING = 10;

	/**
	 * The feature id for the '<em><b>Observe Passed Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING__OBSERVE_PASSED_TEST = EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Testing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_FEATURE_COUNT = EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Testing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_OPERATION_COUNT = EXECUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link be.edu.ufpe.ines.decode.measurement.impl.AnyActionImpl <em>Any Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see be.edu.ufpe.ines.decode.measurement.impl.AnyActionImpl
	 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getAnyAction()
	 * @generated
	 */
	int ANY_ACTION = 12;

	/**
	 * The number of structural features of the '<em>Any Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ACTION_FEATURE_COUNT = ASPECT_OBSERVED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Any Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_ACTION_OPERATION_COUNT = ASPECT_OBSERVED_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.measurement.Measurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurements</em>'.
	 * @see be.edu.ufpe.ines.decode.measurement.Measurements
	 * @generated
	 */
	EClass getMeasurements();

	/**
	 * Returns the meta object for the containment reference list '{@link be.edu.ufpe.ines.decode.measurement.Measurements#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurements</em>'.
	 * @see be.edu.ufpe.ines.decode.measurement.Measurements#getMeasurements()
	 * @see #getMeasurements()
	 * @generated
	 */
	EReference getMeasurements_Measurements();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.measurement.Survey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Survey</em>'.
	 * @see be.edu.ufpe.ines.decode.measurement.Survey
	 * @generated
	 */
	EClass getSurvey();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.measurement.TimeOnTask <em>Time On Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time On Task</em>'.
	 * @see be.edu.ufpe.ines.decode.measurement.TimeOnTask
	 * @generated
	 */
	EClass getTimeOnTask();

	/**
	 * Returns the meta object for the reference list '{@link be.edu.ufpe.ines.decode.measurement.TimeOnTask#getRelatedTask <em>Related Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Task</em>'.
	 * @see be.edu.ufpe.ines.decode.measurement.TimeOnTask#getRelatedTask()
	 * @see #getTimeOnTask()
	 * @generated
	 */
	EReference getTimeOnTask_RelatedTask();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.measurement.ObservingArtifact <em>Observing Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observing Artifact</em>'.
	 * @see be.edu.ufpe.ines.decode.measurement.ObservingArtifact
	 * @generated
	 */
	EClass getObservingArtifact();

	/**
	 * Returns the meta object for the containment reference '{@link be.edu.ufpe.ines.decode.measurement.ObservingArtifact#getAspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aspect</em>'.
	 * @see be.edu.ufpe.ines.decode.measurement.ObservingArtifact#getAspect()
	 * @see #getObservingArtifact()
	 * @generated
	 */
	EReference getObservingArtifact_Aspect();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.measurement.ObservingProvidedArtifact <em>Observing Provided Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observing Provided Artifact</em>'.
	 * @see be.edu.ufpe.ines.decode.measurement.ObservingProvidedArtifact
	 * @generated
	 */
	EClass getObservingProvidedArtifact();

	/**
	 * Returns the meta object for the reference '{@link be.edu.ufpe.ines.decode.measurement.ObservingProvidedArtifact#getObservedArtifact <em>Observed Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Observed Artifact</em>'.
	 * @see be.edu.ufpe.ines.decode.measurement.ObservingProvidedArtifact#getObservedArtifact()
	 * @see #getObservingProvidedArtifact()
	 * @generated
	 */
	EReference getObservingProvidedArtifact_ObservedArtifact();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.measurement.ObservingProducedArtifact <em>Observing Produced Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observing Produced Artifact</em>'.
	 * @see be.edu.ufpe.ines.decode.measurement.ObservingProducedArtifact
	 * @generated
	 */
	EClass getObservingProducedArtifact();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.measurement.ObservingAllArtifacts <em>Observing All Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observing All Artifacts</em>'.
	 * @see be.edu.ufpe.ines.decode.measurement.ObservingAllArtifacts
	 * @generated
	 */
	EClass getObservingAllArtifacts();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.measurement.AspectObserved <em>Aspect Observed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect Observed</em>'.
	 * @see be.edu.ufpe.ines.decode.measurement.AspectObserved
	 * @generated
	 */
	EClass getAspectObserved();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.measurement.Edition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edition</em>'.
	 * @see be.edu.ufpe.ines.decode.measurement.Edition
	 * @generated
	 */
	EClass getEdition();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.measurement.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution</em>'.
	 * @see be.edu.ufpe.ines.decode.measurement.Execution
	 * @generated
	 */
	EClass getExecution();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.measurement.Testing <em>Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing</em>'.
	 * @see be.edu.ufpe.ines.decode.measurement.Testing
	 * @generated
	 */
	EClass getTesting();

	/**
	 * Returns the meta object for the attribute '{@link be.edu.ufpe.ines.decode.measurement.Testing#getObservePassedTest <em>Observe Passed Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observe Passed Test</em>'.
	 * @see be.edu.ufpe.ines.decode.measurement.Testing#getObservePassedTest()
	 * @see #getTesting()
	 * @generated
	 */
	EAttribute getTesting_ObservePassedTest();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.measurement.AbstractMeasurement <em>Abstract Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Measurement</em>'.
	 * @see be.edu.ufpe.ines.decode.measurement.AbstractMeasurement
	 * @generated
	 */
	EClass getAbstractMeasurement();

	/**
	 * Returns the meta object for class '{@link be.edu.ufpe.ines.decode.measurement.AnyAction <em>Any Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Action</em>'.
	 * @see be.edu.ufpe.ines.decode.measurement.AnyAction
	 * @generated
	 */
	EClass getAnyAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MeasurementFactory getMeasurementFactory();

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
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.measurement.impl.MeasurementsImpl <em>Measurements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementsImpl
		 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getMeasurements()
		 * @generated
		 */
		EClass MEASUREMENTS = eINSTANCE.getMeasurements();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENTS__MEASUREMENTS = eINSTANCE.getMeasurements_Measurements();

		/**
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.measurement.impl.SurveyImpl <em>Survey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.measurement.impl.SurveyImpl
		 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getSurvey()
		 * @generated
		 */
		EClass SURVEY = eINSTANCE.getSurvey();

		/**
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.measurement.impl.TimeOnTaskImpl <em>Time On Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.measurement.impl.TimeOnTaskImpl
		 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getTimeOnTask()
		 * @generated
		 */
		EClass TIME_ON_TASK = eINSTANCE.getTimeOnTask();

		/**
		 * The meta object literal for the '<em><b>Related Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ON_TASK__RELATED_TASK = eINSTANCE.getTimeOnTask_RelatedTask();

		/**
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.measurement.impl.ObservingArtifactImpl <em>Observing Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.measurement.impl.ObservingArtifactImpl
		 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getObservingArtifact()
		 * @generated
		 */
		EClass OBSERVING_ARTIFACT = eINSTANCE.getObservingArtifact();

		/**
		 * The meta object literal for the '<em><b>Aspect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVING_ARTIFACT__ASPECT = eINSTANCE.getObservingArtifact_Aspect();

		/**
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.measurement.impl.ObservingProvidedArtifactImpl <em>Observing Provided Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.measurement.impl.ObservingProvidedArtifactImpl
		 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getObservingProvidedArtifact()
		 * @generated
		 */
		EClass OBSERVING_PROVIDED_ARTIFACT = eINSTANCE.getObservingProvidedArtifact();

		/**
		 * The meta object literal for the '<em><b>Observed Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVING_PROVIDED_ARTIFACT__OBSERVED_ARTIFACT = eINSTANCE.getObservingProvidedArtifact_ObservedArtifact();

		/**
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.measurement.impl.ObservingProducedArtifactImpl <em>Observing Produced Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.measurement.impl.ObservingProducedArtifactImpl
		 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getObservingProducedArtifact()
		 * @generated
		 */
		EClass OBSERVING_PRODUCED_ARTIFACT = eINSTANCE.getObservingProducedArtifact();

		/**
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.measurement.impl.ObservingAllArtifactsImpl <em>Observing All Artifacts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.measurement.impl.ObservingAllArtifactsImpl
		 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getObservingAllArtifacts()
		 * @generated
		 */
		EClass OBSERVING_ALL_ARTIFACTS = eINSTANCE.getObservingAllArtifacts();

		/**
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.measurement.impl.AspectObservedImpl <em>Aspect Observed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.measurement.impl.AspectObservedImpl
		 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getAspectObserved()
		 * @generated
		 */
		EClass ASPECT_OBSERVED = eINSTANCE.getAspectObserved();

		/**
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.measurement.impl.EditionImpl <em>Edition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.measurement.impl.EditionImpl
		 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getEdition()
		 * @generated
		 */
		EClass EDITION = eINSTANCE.getEdition();

		/**
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.measurement.impl.ExecutionImpl <em>Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.measurement.impl.ExecutionImpl
		 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getExecution()
		 * @generated
		 */
		EClass EXECUTION = eINSTANCE.getExecution();

		/**
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.measurement.impl.TestingImpl <em>Testing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.measurement.impl.TestingImpl
		 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getTesting()
		 * @generated
		 */
		EClass TESTING = eINSTANCE.getTesting();

		/**
		 * The meta object literal for the '<em><b>Observe Passed Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING__OBSERVE_PASSED_TEST = eINSTANCE.getTesting_ObservePassedTest();

		/**
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.measurement.impl.AbstractMeasurementImpl <em>Abstract Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.measurement.impl.AbstractMeasurementImpl
		 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getAbstractMeasurement()
		 * @generated
		 */
		EClass ABSTRACT_MEASUREMENT = eINSTANCE.getAbstractMeasurement();

		/**
		 * The meta object literal for the '{@link be.edu.ufpe.ines.decode.measurement.impl.AnyActionImpl <em>Any Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see be.edu.ufpe.ines.decode.measurement.impl.AnyActionImpl
		 * @see be.edu.ufpe.ines.decode.measurement.impl.MeasurementPackageImpl#getAnyAction()
		 * @generated
		 */
		EClass ANY_ACTION = eINSTANCE.getAnyAction();

	}

} //MeasurementPackage
