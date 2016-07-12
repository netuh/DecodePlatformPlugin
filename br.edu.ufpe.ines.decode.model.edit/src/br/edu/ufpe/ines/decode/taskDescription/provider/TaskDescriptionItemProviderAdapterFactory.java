/**
 */
package br.edu.ufpe.ines.decode.taskDescription.provider;

import br.edu.ufpe.ines.decode.taskDescription.util.TaskDescriptionAdapterFactory;

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
	 * This keeps track of the one adapter used for all {@link br.edu.ufpe.ines.decode.taskDescription.Sequencial} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequencialItemProvider sequencialItemProvider;

	/**
	 * This creates an adapter for a {@link br.edu.ufpe.ines.decode.taskDescription.Sequencial}.
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
	 * This keeps track of the one adapter used for all {@link br.edu.ufpe.ines.decode.taskDescription.Random} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RandomItemProvider randomItemProvider;

	/**
	 * This creates an adapter for a {@link br.edu.ufpe.ines.decode.taskDescription.Random}.
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
	 * This keeps track of the one adapter used for all {@link br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentalTaskItemProvider experimentalTaskItemProvider;

	/**
	 * This creates an adapter for a {@link br.edu.ufpe.ines.decode.taskDescription.ExperimentalTask}.
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
	 * This keeps track of the one adapter used for all {@link br.edu.ufpe.ines.decode.taskDescription.PlacementQuestionnaire} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlacementQuestionnaireItemProvider placementQuestionnaireItemProvider;

	/**
	 * This creates an adapter for a {@link br.edu.ufpe.ines.decode.taskDescription.PlacementQuestionnaire}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlacementQuestionnaireAdapter() {
		if (placementQuestionnaireItemProvider == null) {
			placementQuestionnaireItemProvider = new PlacementQuestionnaireItemProvider(this);
		}

		return placementQuestionnaireItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.edu.ufpe.ines.decode.taskDescription.ExecutionDerivations} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionDerivationsItemProvider executionDerivationsItemProvider;

	/**
	 * This creates an adapter for a {@link br.edu.ufpe.ines.decode.taskDescription.ExecutionDerivations}.
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
	 * This keeps track of the one adapter used for all {@link br.edu.ufpe.ines.decode.taskDescription.TimeRestriction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeRestrictionItemProvider timeRestrictionItemProvider;

	/**
	 * This creates an adapter for a {@link br.edu.ufpe.ines.decode.taskDescription.TimeRestriction}.
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
	 * This keeps track of the one adapter used for all {@link br.edu.ufpe.ines.decode.taskDescription.EclipseRetriction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EclipseRetrictionItemProvider eclipseRetrictionItemProvider;

	/**
	 * This creates an adapter for a {@link br.edu.ufpe.ines.decode.taskDescription.EclipseRetriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEclipseRetrictionAdapter() {
		if (eclipseRetrictionItemProvider == null) {
			eclipseRetrictionItemProvider = new EclipseRetrictionItemProvider(this);
		}

		return eclipseRetrictionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.edu.ufpe.ines.decode.taskDescription.OtherRestriction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OtherRestrictionItemProvider otherRestrictionItemProvider;

	/**
	 * This creates an adapter for a {@link br.edu.ufpe.ines.decode.taskDescription.OtherRestriction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOtherRestrictionAdapter() {
		if (otherRestrictionItemProvider == null) {
			otherRestrictionItemProvider = new OtherRestrictionItemProvider(this);
		}

		return otherRestrictionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link br.edu.ufpe.ines.decode.taskDescription.ModeledRestrictions} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeledRestrictionsItemProvider modeledRestrictionsItemProvider;

	/**
	 * This creates an adapter for a {@link br.edu.ufpe.ines.decode.taskDescription.ModeledRestrictions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModeledRestrictionsAdapter() {
		if (modeledRestrictionsItemProvider == null) {
			modeledRestrictionsItemProvider = new ModeledRestrictionsItemProvider(this);
		}

		return modeledRestrictionsItemProvider;
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
		if (placementQuestionnaireItemProvider != null) placementQuestionnaireItemProvider.dispose();
		if (executionDerivationsItemProvider != null) executionDerivationsItemProvider.dispose();
		if (timeRestrictionItemProvider != null) timeRestrictionItemProvider.dispose();
		if (eclipseRetrictionItemProvider != null) eclipseRetrictionItemProvider.dispose();
		if (otherRestrictionItemProvider != null) otherRestrictionItemProvider.dispose();
		if (modeledRestrictionsItemProvider != null) modeledRestrictionsItemProvider.dispose();
	}

}