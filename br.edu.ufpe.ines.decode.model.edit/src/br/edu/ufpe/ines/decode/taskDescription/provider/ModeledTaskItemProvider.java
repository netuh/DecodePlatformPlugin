/**
 */
package br.edu.ufpe.ines.decode.taskDescription.provider;


import br.edu.ufpe.ines.decode.aux.provider.NameableItemProvider;

import br.edu.ufpe.ines.decode.provider.ModelDecodeEditPlugin;

import br.edu.ufpe.ines.decode.taskDescription.ModeledTask;
import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionFactory;
import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage;

import br.edu.ufpe.ines.decode.taskDescription.measurements.MeasurementsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link br.edu.ufpe.ines.decode.taskDescription.ModeledTask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeledTaskItemProvider extends NameableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeledTaskItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TaskDescriptionPackage.Literals.MODELED_TASK__RESTRICTION);
			childrenFeatures.add(TaskDescriptionPackage.Literals.MODELED_TASK__MEASUREMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModeledTask)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ModeledTask_type") :
			getString("_UI_ModeledTask_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ModeledTask.class)) {
			case TaskDescriptionPackage.MODELED_TASK__RESTRICTION:
			case TaskDescriptionPackage.MODELED_TASK__MEASUREMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TaskDescriptionPackage.Literals.MODELED_TASK__RESTRICTION,
				 TaskDescriptionFactory.eINSTANCE.createModeledRestrictions()));

		newChildDescriptors.add
			(createChildParameter
				(TaskDescriptionPackage.Literals.MODELED_TASK__MEASUREMENTS,
				 TaskDescriptionFactory.eINSTANCE.createQuestionnaireMeasurement()));

		newChildDescriptors.add
			(createChildParameter
				(TaskDescriptionPackage.Literals.MODELED_TASK__MEASUREMENTS,
				 MeasurementsFactory.eINSTANCE.createFinalTask()));

		newChildDescriptors.add
			(createChildParameter
				(TaskDescriptionPackage.Literals.MODELED_TASK__MEASUREMENTS,
				 MeasurementsFactory.eINSTANCE.createEdition()));

		newChildDescriptors.add
			(createChildParameter
				(TaskDescriptionPackage.Literals.MODELED_TASK__MEASUREMENTS,
				 MeasurementsFactory.eINSTANCE.createExecution()));

		newChildDescriptors.add
			(createChildParameter
				(TaskDescriptionPackage.Literals.MODELED_TASK__MEASUREMENTS,
				 MeasurementsFactory.eINSTANCE.createAnyAction()));

		newChildDescriptors.add
			(createChildParameter
				(TaskDescriptionPackage.Literals.MODELED_TASK__MEASUREMENTS,
				 MeasurementsFactory.eINSTANCE.createTestExecution()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModelDecodeEditPlugin.INSTANCE;
	}

}
