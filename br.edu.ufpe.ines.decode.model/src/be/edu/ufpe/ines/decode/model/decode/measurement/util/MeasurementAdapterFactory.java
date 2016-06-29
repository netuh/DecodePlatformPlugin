/**
 */
package be.edu.ufpe.ines.decode.model.decode.measurement.util;

import be.edu.ufpe.ines.decode.model.decode.measurement.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see be.edu.ufpe.ines.decode.model.decode.measurement.MeasurementPackage
 * @generated
 */
public class MeasurementAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MeasurementPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MeasurementPackage.eINSTANCE;
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
	protected MeasurementSwitch<Adapter> modelSwitch =
		new MeasurementSwitch<Adapter>() {
			@Override
			public Adapter caseMeasurements(Measurements object) {
				return createMeasurementsAdapter();
			}
			@Override
			public Adapter caseSurvey(Survey object) {
				return createSurveyAdapter();
			}
			@Override
			public Adapter caseTimeOnTask(TimeOnTask object) {
				return createTimeOnTaskAdapter();
			}
			@Override
			public Adapter caseObservingArtifact(ObservingArtifact object) {
				return createObservingArtifactAdapter();
			}
			@Override
			public Adapter caseObservingProvidedArtifact(ObservingProvidedArtifact object) {
				return createObservingProvidedArtifactAdapter();
			}
			@Override
			public Adapter caseObservingProducedArtifact(ObservingProducedArtifact object) {
				return createObservingProducedArtifactAdapter();
			}
			@Override
			public Adapter caseObservingAllArtifacts(ObservingAllArtifacts object) {
				return createObservingAllArtifactsAdapter();
			}
			@Override
			public Adapter caseAspectObserved(AspectObserved object) {
				return createAspectObservedAdapter();
			}
			@Override
			public Adapter caseEdition(Edition object) {
				return createEditionAdapter();
			}
			@Override
			public Adapter caseExecution(Execution object) {
				return createExecutionAdapter();
			}
			@Override
			public Adapter caseTesting(Testing object) {
				return createTestingAdapter();
			}
			@Override
			public Adapter caseAbstractMeasurement(AbstractMeasurement object) {
				return createAbstractMeasurementAdapter();
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
	 * Creates a new adapter for an object of class '{@link be.edu.ufpe.ines.decode.model.decode.measurement.Measurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.edu.ufpe.ines.decode.model.decode.measurement.Measurements
	 * @generated
	 */
	public Adapter createMeasurementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.edu.ufpe.ines.decode.model.decode.measurement.Survey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.edu.ufpe.ines.decode.model.decode.measurement.Survey
	 * @generated
	 */
	public Adapter createSurveyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.edu.ufpe.ines.decode.model.decode.measurement.TimeOnTask <em>Time On Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.edu.ufpe.ines.decode.model.decode.measurement.TimeOnTask
	 * @generated
	 */
	public Adapter createTimeOnTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.edu.ufpe.ines.decode.model.decode.measurement.ObservingArtifact <em>Observing Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.edu.ufpe.ines.decode.model.decode.measurement.ObservingArtifact
	 * @generated
	 */
	public Adapter createObservingArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.edu.ufpe.ines.decode.model.decode.measurement.ObservingProvidedArtifact <em>Observing Provided Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.edu.ufpe.ines.decode.model.decode.measurement.ObservingProvidedArtifact
	 * @generated
	 */
	public Adapter createObservingProvidedArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.edu.ufpe.ines.decode.model.decode.measurement.ObservingProducedArtifact <em>Observing Produced Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.edu.ufpe.ines.decode.model.decode.measurement.ObservingProducedArtifact
	 * @generated
	 */
	public Adapter createObservingProducedArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.edu.ufpe.ines.decode.model.decode.measurement.ObservingAllArtifacts <em>Observing All Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.edu.ufpe.ines.decode.model.decode.measurement.ObservingAllArtifacts
	 * @generated
	 */
	public Adapter createObservingAllArtifactsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.edu.ufpe.ines.decode.model.decode.measurement.AspectObserved <em>Aspect Observed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.edu.ufpe.ines.decode.model.decode.measurement.AspectObserved
	 * @generated
	 */
	public Adapter createAspectObservedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.edu.ufpe.ines.decode.model.decode.measurement.Edition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.edu.ufpe.ines.decode.model.decode.measurement.Edition
	 * @generated
	 */
	public Adapter createEditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.edu.ufpe.ines.decode.model.decode.measurement.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.edu.ufpe.ines.decode.model.decode.measurement.Execution
	 * @generated
	 */
	public Adapter createExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.edu.ufpe.ines.decode.model.decode.measurement.Testing <em>Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.edu.ufpe.ines.decode.model.decode.measurement.Testing
	 * @generated
	 */
	public Adapter createTestingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.edu.ufpe.ines.decode.model.decode.measurement.AbstractMeasurement <em>Abstract Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.edu.ufpe.ines.decode.model.decode.measurement.AbstractMeasurement
	 * @generated
	 */
	public Adapter createAbstractMeasurementAdapter() {
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

} //MeasurementAdapterFactory
