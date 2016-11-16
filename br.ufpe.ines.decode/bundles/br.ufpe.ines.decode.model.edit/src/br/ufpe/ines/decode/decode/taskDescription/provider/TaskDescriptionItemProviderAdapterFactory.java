/**
 */
package br.ufpe.ines.decode.decode.taskDescription.provider;

import br.ufpe.ines.decode.decode.taskDescription.util.TaskDescriptionAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskDescriptionItemProviderAdapterFactory extends TaskDescriptionAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDescriptionItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.ufpe.ines.decode.decode.taskDescription.Sequencial} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequencialItemProvider sequencialItemProvider;

	/**
	 * This creates an adapter for a {@link br.ufpe.ines.decode.decode.taskDescription.Sequencial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequencialAdapter() {
		if (sequencialItemProvider == null) {
			sequencialItemProvider = new SequencialItemProvider(this);
		}

		return sequencialItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.ufpe.ines.decode.decode.taskDescription.Random} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RandomItemProvider randomItemProvider;

	/**
	 * This creates an adapter for a {@link br.ufpe.ines.decode.decode.taskDescription.Random}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRandomAdapter() {
		if (randomItemProvider == null) {
			randomItemProvider = new RandomItemProvider(this);
		}

		return randomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.ufpe.ines.decode.decode.taskDescription.ExperimentalTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentalTaskItemProvider experimentalTaskItemProvider;

	/**
	 * This creates an adapter for a {@link br.ufpe.ines.decode.decode.taskDescription.ExperimentalTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExperimentalTaskAdapter() {
		if (experimentalTaskItemProvider == null) {
			experimentalTaskItemProvider = new ExperimentalTaskItemProvider(this);
		}

		return experimentalTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.ufpe.ines.decode.decode.taskDescription.QuestionnaireMeasurement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireMeasurementItemProvider questionnaireMeasurementItemProvider;

	/**
	 * This creates an adapter for a {@link br.ufpe.ines.decode.decode.taskDescription.QuestionnaireMeasurement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuestionnaireMeasurementAdapter() {
		if (questionnaireMeasurementItemProvider == null) {
			questionnaireMeasurementItemProvider = new QuestionnaireMeasurementItemProvider(this);
		}

		return questionnaireMeasurementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.ufpe.ines.decode.decode.taskDescription.ExecutionDerivations} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionDerivationsItemProvider executionDerivationsItemProvider;

	/**
	 * This creates an adapter for a {@link br.ufpe.ines.decode.decode.taskDescription.ExecutionDerivations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecutionDerivationsAdapter() {
		if (executionDerivationsItemProvider == null) {
			executionDerivationsItemProvider = new ExecutionDerivationsItemProvider(this);
		}

		return executionDerivationsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.ufpe.ines.decode.decode.taskDescription.TimeRestriction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeRestrictionItemProvider timeRestrictionItemProvider;

	/**
	 * This creates an adapter for a {@link br.ufpe.ines.decode.decode.taskDescription.TimeRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeRestrictionAdapter() {
		if (timeRestrictionItemProvider == null) {
			timeRestrictionItemProvider = new TimeRestrictionItemProvider(this);
		}

		return timeRestrictionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.ufpe.ines.decode.decode.taskDescription.EclipseParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EclipseParameterItemProvider eclipseParameterItemProvider;

	/**
	 * This creates an adapter for a {@link br.ufpe.ines.decode.decode.taskDescription.EclipseParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEclipseParameterAdapter() {
		if (eclipseParameterItemProvider == null) {
			eclipseParameterItemProvider = new EclipseParameterItemProvider(this);
		}

		return eclipseParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.ufpe.ines.decode.decode.taskDescription.GeneralParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralParameterItemProvider generalParameterItemProvider;

	/**
	 * This creates an adapter for a {@link br.ufpe.ines.decode.decode.taskDescription.GeneralParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneralParameterAdapter() {
		if (generalParameterItemProvider == null) {
			generalParameterItemProvider = new GeneralParameterItemProvider(this);
		}

		return generalParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.ufpe.ines.decode.decode.taskDescription.OtherParameters} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OtherParametersItemProvider otherParametersItemProvider;

	/**
	 * This creates an adapter for a {@link br.ufpe.ines.decode.decode.taskDescription.OtherParameters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOtherParametersAdapter() {
		if (otherParametersItemProvider == null) {
			otherParametersItemProvider = new OtherParametersItemProvider(this);
		}

		return otherParametersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.ufpe.ines.decode.decode.taskDescription.Measurements} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementsItemProvider measurementsItemProvider;

	/**
	 * This creates an adapter for a {@link br.ufpe.ines.decode.decode.taskDescription.Measurements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMeasurementsAdapter() {
		if (measurementsItemProvider == null) {
			measurementsItemProvider = new MeasurementsItemProvider(this);
		}

		return measurementsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.ufpe.ines.decode.decode.taskDescription.PenAndPaperQuestionnaire} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PenAndPaperQuestionnaireItemProvider penAndPaperQuestionnaireItemProvider;

	/**
	 * This creates an adapter for a {@link br.ufpe.ines.decode.decode.taskDescription.PenAndPaperQuestionnaire}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPenAndPaperQuestionnaireAdapter() {
		if (penAndPaperQuestionnaireItemProvider == null) {
			penAndPaperQuestionnaireItemProvider = new PenAndPaperQuestionnaireItemProvider(this);
		}

		return penAndPaperQuestionnaireItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (sequencialItemProvider != null) sequencialItemProvider.dispose();
		if (randomItemProvider != null) randomItemProvider.dispose();
		if (experimentalTaskItemProvider != null) experimentalTaskItemProvider.dispose();
		if (questionnaireMeasurementItemProvider != null) questionnaireMeasurementItemProvider.dispose();
		if (executionDerivationsItemProvider != null) executionDerivationsItemProvider.dispose();
		if (timeRestrictionItemProvider != null) timeRestrictionItemProvider.dispose();
		if (eclipseParameterItemProvider != null) eclipseParameterItemProvider.dispose();
		if (generalParameterItemProvider != null) generalParameterItemProvider.dispose();
		if (otherParametersItemProvider != null) otherParametersItemProvider.dispose();
		if (measurementsItemProvider != null) measurementsItemProvider.dispose();
		if (penAndPaperQuestionnaireItemProvider != null) penAndPaperQuestionnaireItemProvider.dispose();
	}

}