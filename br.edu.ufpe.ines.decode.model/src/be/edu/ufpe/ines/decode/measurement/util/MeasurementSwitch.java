/**
 */
package be.edu.ufpe.ines.decode.measurement.util;

import be.edu.ufpe.ines.decode.aux.Nameable;

import be.edu.ufpe.ines.decode.measurement.*;

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
 * @see be.edu.ufpe.ines.decode.measurement.MeasurementPackage
 * @generated
 */
public class MeasurementSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MeasurementPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementSwitch() {
		if (modelPackage == null) {
			modelPackage = MeasurementPackage.eINSTANCE;
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
			case MeasurementPackage.MEASUREMENTS: {
				Measurements measurements = (Measurements)theEObject;
				T result = caseMeasurements(measurements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasurementPackage.SURVEY: {
				Survey survey = (Survey)theEObject;
				T result = caseSurvey(survey);
				if (result == null) result = caseAbstractMeasurement(survey);
				if (result == null) result = caseNameable(survey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasurementPackage.TIME_ON_TASK: {
				TimeOnTask timeOnTask = (TimeOnTask)theEObject;
				T result = caseTimeOnTask(timeOnTask);
				if (result == null) result = caseAbstractMeasurement(timeOnTask);
				if (result == null) result = caseNameable(timeOnTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasurementPackage.OBSERVING_ARTIFACT: {
				ObservingArtifact observingArtifact = (ObservingArtifact)theEObject;
				T result = caseObservingArtifact(observingArtifact);
				if (result == null) result = caseAbstractMeasurement(observingArtifact);
				if (result == null) result = caseNameable(observingArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasurementPackage.OBSERVING_PROVIDED_ARTIFACT: {
				ObservingProvidedArtifact observingProvidedArtifact = (ObservingProvidedArtifact)theEObject;
				T result = caseObservingProvidedArtifact(observingProvidedArtifact);
				if (result == null) result = caseObservingArtifact(observingProvidedArtifact);
				if (result == null) result = caseAbstractMeasurement(observingProvidedArtifact);
				if (result == null) result = caseNameable(observingProvidedArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasurementPackage.OBSERVING_PRODUCED_ARTIFACT: {
				ObservingProducedArtifact observingProducedArtifact = (ObservingProducedArtifact)theEObject;
				T result = caseObservingProducedArtifact(observingProducedArtifact);
				if (result == null) result = caseObservingArtifact(observingProducedArtifact);
				if (result == null) result = caseAbstractMeasurement(observingProducedArtifact);
				if (result == null) result = caseNameable(observingProducedArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasurementPackage.OBSERVING_ALL_ARTIFACTS: {
				ObservingAllArtifacts observingAllArtifacts = (ObservingAllArtifacts)theEObject;
				T result = caseObservingAllArtifacts(observingAllArtifacts);
				if (result == null) result = caseObservingArtifact(observingAllArtifacts);
				if (result == null) result = caseAbstractMeasurement(observingAllArtifacts);
				if (result == null) result = caseNameable(observingAllArtifacts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasurementPackage.ASPECT_OBSERVED: {
				AspectObserved aspectObserved = (AspectObserved)theEObject;
				T result = caseAspectObserved(aspectObserved);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasurementPackage.EDITION: {
				Edition edition = (Edition)theEObject;
				T result = caseEdition(edition);
				if (result == null) result = caseAspectObserved(edition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasurementPackage.EXECUTION: {
				Execution execution = (Execution)theEObject;
				T result = caseExecution(execution);
				if (result == null) result = caseAspectObserved(execution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasurementPackage.TESTING: {
				Testing testing = (Testing)theEObject;
				T result = caseTesting(testing);
				if (result == null) result = caseExecution(testing);
				if (result == null) result = caseAspectObserved(testing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasurementPackage.ABSTRACT_MEASUREMENT: {
				AbstractMeasurement abstractMeasurement = (AbstractMeasurement)theEObject;
				T result = caseAbstractMeasurement(abstractMeasurement);
				if (result == null) result = caseNameable(abstractMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MeasurementPackage.ANY_ACTION: {
				AnyAction anyAction = (AnyAction)theEObject;
				T result = caseAnyAction(anyAction);
				if (result == null) result = caseAspectObserved(anyAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurements(Measurements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Survey</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Survey</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurvey(Survey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time On Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time On Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeOnTask(TimeOnTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observing Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observing Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservingArtifact(ObservingArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observing Provided Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observing Provided Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservingProvidedArtifact(ObservingProvidedArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observing Produced Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observing Produced Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservingProducedArtifact(ObservingProducedArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observing All Artifacts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observing All Artifacts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservingAllArtifacts(ObservingAllArtifacts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect Observed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect Observed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAspectObserved(AspectObserved object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdition(Edition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecution(Execution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Testing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Testing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTesting(Testing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMeasurement(AbstractMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyAction(AnyAction object) {
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

} //MeasurementSwitch
