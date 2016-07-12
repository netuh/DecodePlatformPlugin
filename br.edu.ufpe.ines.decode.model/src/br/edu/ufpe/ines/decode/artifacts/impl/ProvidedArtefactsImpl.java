/**
 */
package br.edu.ufpe.ines.decode.artifacts.impl;

import br.edu.ufpe.ines.decode.artifacts.AbstractArtifact;
import br.edu.ufpe.ines.decode.artifacts.ArtifactsPackage;
import br.edu.ufpe.ines.decode.artifacts.ProvidedArtefacts;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provided Artefacts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.edu.ufpe.ines.decode.artifacts.impl.ProvidedArtefactsImpl#getArtifact <em>Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidedArtefactsImpl extends MinimalEObjectImpl.Container implements ProvidedArtefacts {
	/**
	 * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractArtifact> artifact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedArtefactsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtifactsPackage.Literals.PROVIDED_ARTEFACTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractArtifact> getArtifact() {
		if (artifact == null) {
			artifact = new EObjectContainmentEList<AbstractArtifact>(AbstractArtifact.class, this, ArtifactsPackage.PROVIDED_ARTEFACTS__ARTIFACT);
		}
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArtifactsPackage.PROVIDED_ARTEFACTS__ARTIFACT:
				return ((InternalEList<?>)getArtifact()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArtifactsPackage.PROVIDED_ARTEFACTS__ARTIFACT:
				return getArtifact();
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
			case ArtifactsPackage.PROVIDED_ARTEFACTS__ARTIFACT:
				getArtifact().clear();
				getArtifact().addAll((Collection<? extends AbstractArtifact>)newValue);
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
			case ArtifactsPackage.PROVIDED_ARTEFACTS__ARTIFACT:
				getArtifact().clear();
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
			case ArtifactsPackage.PROVIDED_ARTEFACTS__ARTIFACT:
				return artifact != null && !artifact.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProvidedArtefactsImpl
