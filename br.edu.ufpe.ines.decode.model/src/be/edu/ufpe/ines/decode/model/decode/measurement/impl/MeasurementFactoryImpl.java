/**
 */
package be.edu.ufpe.ines.decode.model.decode.measurement.impl;

import be.edu.ufpe.ines.decode.model.decode.measurement.*;

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
public class MeasurementFactoryImpl extends EFactoryImpl implements MeasurementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeasurementFactory init() {
		try {
			MeasurementFactory theMeasurementFactory = (MeasurementFactory)EPackage.Registry.INSTANCE.getEFactory(MeasurementPackage.eNS_URI);
			if (theMeasurementFactory != null) {
				return theMeasurementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MeasurementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementFactoryImpl() {
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
			case MeasurementPackage.MEASUREMENTS: return createMeasurements();
			case MeasurementPackage.SURVEY: return createSurvey();
			case MeasurementPackage.TIME_ON_TASK: return createTimeOnTask();
			case MeasurementPackage.OBSERVING_PROVIDED_ARTIFACT: return createObservingProvidedArtifact();
			case MeasurementPackage.OBSERVING_PRODUCED_ARTIFACT: return createObservingProducedArtifact();
			case MeasurementPackage.OBSERVING_ALL_ARTIFACTS: return createObservingAllArtifacts();
			case MeasurementPackage.EDITION: return createEdition();
			case MeasurementPackage.EXECUTION: return createExecution();
			case MeasurementPackage.TESTING: return createTesting();
			case MeasurementPackage.ANY_ACTION: return createAnyAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurements createMeasurements() {
		MeasurementsImpl measurements = new MeasurementsImpl();
		return measurements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Survey createSurvey() {
		SurveyImpl survey = new SurveyImpl();
		return survey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeOnTask createTimeOnTask() {
		TimeOnTaskImpl timeOnTask = new TimeOnTaskImpl();
		return timeOnTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservingProvidedArtifact createObservingProvidedArtifact() {
		ObservingProvidedArtifactImpl observingProvidedArtifact = new ObservingProvidedArtifactImpl();
		return observingProvidedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservingProducedArtifact createObservingProducedArtifact() {
		ObservingProducedArtifactImpl observingProducedArtifact = new ObservingProducedArtifactImpl();
		return observingProducedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservingAllArtifacts createObservingAllArtifacts() {
		ObservingAllArtifactsImpl observingAllArtifacts = new ObservingAllArtifactsImpl();
		return observingAllArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edition createEdition() {
		EditionImpl edition = new EditionImpl();
		return edition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execution createExecution() {
		ExecutionImpl execution = new ExecutionImpl();
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Testing createTesting() {
		TestingImpl testing = new TestingImpl();
		return testing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyAction createAnyAction() {
		AnyActionImpl anyAction = new AnyActionImpl();
		return anyAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementPackage getMeasurementPackage() {
		return (MeasurementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MeasurementPackage getPackage() {
		return MeasurementPackage.eINSTANCE;
	}

} //MeasurementFactoryImpl
