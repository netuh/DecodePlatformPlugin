/**
 */
package br.ufpe.ines.decode.decode.taskDescription.impl;

import br.ufpe.ines.decode.decode.taskDescription.ComposedTask;
import br.ufpe.ines.decode.decode.taskDescription.TaskDescriptionPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composed Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ComposedTaskImpl extends ModeledTaskImpl implements ComposedTask {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskDescriptionPackage.Literals.COMPOSED_TASK;
	}

} //ComposedTaskImpl
