/**
 */
package br.edu.ufpe.ines.decode.taskDescription.impl;

import br.edu.ufpe.ines.decode.taskDescription.EclipseRetriction;
import br.edu.ufpe.ines.decode.taskDescription.TaskDescriptionPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eclipse Retriction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.taskDescription.impl.EclipseRetrictionImpl#getForbiden <em>Forbiden</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EclipseRetrictionImpl extends SpecficRestrictionImpl implements EclipseRetriction {
	/**
	 * The cached value of the '{@link #getForbiden() <em>Forbiden</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForbiden()
	 * @generated
	 * @ordered
	 */
	protected EList<String> forbiden;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EclipseRetrictionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskDescriptionPackage.Literals.ECLIPSE_RETRICTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getForbiden() {
		if (forbiden == null) {
			forbiden = new EDataTypeUniqueEList<String>(String.class, this, TaskDescriptionPackage.ECLIPSE_RETRICTION__FORBIDEN);
		}
		return forbiden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskDescriptionPackage.ECLIPSE_RETRICTION__FORBIDEN:
				return getForbiden();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TaskDescriptionPackage.ECLIPSE_RETRICTION__FORBIDEN:
				getForbiden().clear();
				getForbiden().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TaskDescriptionPackage.ECLIPSE_RETRICTION__FORBIDEN:
				getForbiden().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TaskDescriptionPackage.ECLIPSE_RETRICTION__FORBIDEN:
				return forbiden != null && !forbiden.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (forbiden: ");
		result.append(forbiden);
		result.append(')');
		return result.toString();
	}

} //EclipseRetrictionImpl
