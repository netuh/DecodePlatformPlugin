/**
 */
package br.ufpe.ines.decode.decode.taskDescription.impl;

import br.ufpe.ines.decode.decode.taskDescription.EclipseParameter;
import br.ufpe.ines.decode.decode.taskDescription.TaskDescriptionPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eclipse Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.ines.decode.decode.taskDescription.impl.EclipseParameterImpl#getForbiden <em>Forbiden</em>}</li>
 *   <li>{@link br.ufpe.ines.decode.decode.taskDescription.impl.EclipseParameterImpl#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EclipseParameterImpl extends IDEParameterImpl implements EclipseParameter {
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
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected EList<String> required;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EclipseParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskDescriptionPackage.Literals.ECLIPSE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getForbiden() {
		if (forbiden == null) {
			forbiden = new EDataTypeUniqueEList<String>(String.class, this, TaskDescriptionPackage.ECLIPSE_PARAMETER__FORBIDEN);
		}
		return forbiden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRequired() {
		if (required == null) {
			required = new EDataTypeUniqueEList<String>(String.class, this, TaskDescriptionPackage.ECLIPSE_PARAMETER__REQUIRED);
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskDescriptionPackage.ECLIPSE_PARAMETER__FORBIDEN:
				return getForbiden();
			case TaskDescriptionPackage.ECLIPSE_PARAMETER__REQUIRED:
				return getRequired();
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
			case TaskDescriptionPackage.ECLIPSE_PARAMETER__FORBIDEN:
				getForbiden().clear();
				getForbiden().addAll((Collection<? extends String>)newValue);
				return;
			case TaskDescriptionPackage.ECLIPSE_PARAMETER__REQUIRED:
				getRequired().clear();
				getRequired().addAll((Collection<? extends String>)newValue);
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
			case TaskDescriptionPackage.ECLIPSE_PARAMETER__FORBIDEN:
				getForbiden().clear();
				return;
			case TaskDescriptionPackage.ECLIPSE_PARAMETER__REQUIRED:
				getRequired().clear();
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
			case TaskDescriptionPackage.ECLIPSE_PARAMETER__FORBIDEN:
				return forbiden != null && !forbiden.isEmpty();
			case TaskDescriptionPackage.ECLIPSE_PARAMETER__REQUIRED:
				return required != null && !required.isEmpty();
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
		result.append(", required: ");
		result.append(required);
		result.append(')');
		return result.toString();
	}

} //EclipseParameterImpl
