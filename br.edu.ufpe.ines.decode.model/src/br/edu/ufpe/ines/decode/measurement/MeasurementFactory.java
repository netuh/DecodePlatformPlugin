/**
 */
package br.edu.ufpe.ines.decode.measurement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.edu.ufpe.ines.decode.measurement.MeasurementPackage
 * @generated
 */
public interface MeasurementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MeasurementFactory eINSTANCE = br.edu.ufpe.ines.decode.measurement.impl.MeasurementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Measurements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurements</em>'.
	 * @generated
	 */
	Measurements createMeasurements();

	/**
	 * Returns a new object of class '<em>Survey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Survey</em>'.
	 * @generated
	 */
	Survey createSurvey();

	/**
	 * Returns a new object of class '<em>Time On Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time On Task</em>'.
	 * @generated
	 */
	TimeOnTask createTimeOnTask();

	/**
	 * Returns a new object of class '<em>Observing Provided Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observing Provided Artifact</em>'.
	 * @generated
	 */
	ObservingProvidedArtifact createObservingProvidedArtifact();

	/**
	 * Returns a new object of class '<em>Observing Produced Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observing Produced Artifact</em>'.
	 * @generated
	 */
	ObservingProducedArtifact createObservingProducedArtifact();

	/**
	 * Returns a new object of class '<em>Observing All Artifacts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observing All Artifacts</em>'.
	 * @generated
	 */
	ObservingAllArtifacts createObservingAllArtifacts();

	/**
	 * Returns a new object of class '<em>Edition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edition</em>'.
	 * @generated
	 */
	Edition createEdition();

	/**
	 * Returns a new object of class '<em>Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution</em>'.
	 * @generated
	 */
	Execution createExecution();

	/**
	 * Returns a new object of class '<em>Testing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testing</em>'.
	 * @generated
	 */
	Testing createTesting();

	/**
	 * Returns a new object of class '<em>Any Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Action</em>'.
	 * @generated
	 */
	AnyAction createAnyAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MeasurementPackage getMeasurementPackage();

} //MeasurementFactory
