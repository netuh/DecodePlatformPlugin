/**
 */
package be.edu.ufpe.ines.decode.model.decode.artifacts.impl;

import be.edu.ufpe.ines.decode.model.decode.artifacts.AbstractArtifact;
import be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactLanguage;
import be.edu.ufpe.ines.decode.model.decode.artifacts.ArtifactsPackage;

import be.edu.ufpe.ines.decode.model.decode.aux.impl.NameableImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.edu.ufpe.ines.decode.model.decode.artifacts.impl.AbstractArtifactImpl#getArtifactDomain <em>Artifact Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractArtifactImpl extends NameableImpl implements AbstractArtifact {
	/**
	 * The default value of the '{@link #getArtifactDomain() <em>Artifact Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactDomain()
	 * @generated
	 * @ordered
	 */
	protected static final ArtifactLanguage ARTIFACT_DOMAIN_EDEFAULT = ArtifactLanguage.COMMON;
	/**
	 * The cached value of the '{@link #getArtifactDomain() <em>Artifact Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactDomain()
	 * @generated
	 * @ordered
	 */
	protected ArtifactLanguage artifactDomain = ARTIFACT_DOMAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArtifactsPackage.Literals.ABSTRACT_ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactLanguage getArtifactDomain() {
		return artifactDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactDomain(ArtifactLanguage newArtifactDomain) {
		ArtifactLanguage oldArtifactDomain = artifactDomain;
		artifactDomain = newArtifactDomain == null ? ARTIFACT_DOMAIN_EDEFAULT : newArtifactDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArtifactsPackage.ABSTRACT_ARTIFACT__ARTIFACT_DOMAIN, oldArtifactDomain, artifactDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArtifactsPackage.ABSTRACT_ARTIFACT__ARTIFACT_DOMAIN:
				return getArtifactDomain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArtifactsPackage.ABSTRACT_ARTIFACT__ARTIFACT_DOMAIN:
				setArtifactDomain((ArtifactLanguage)newValue);
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
			case ArtifactsPackage.ABSTRACT_ARTIFACT__ARTIFACT_DOMAIN:
				setArtifactDomain(ARTIFACT_DOMAIN_EDEFAULT);
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
			case ArtifactsPackage.ABSTRACT_ARTIFACT__ARTIFACT_DOMAIN:
				return artifactDomain != ARTIFACT_DOMAIN_EDEFAULT;
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
		result.append(" (artifactDomain: ");
		result.append(artifactDomain);
		result.append(')');
		return result.toString();
	}

} //AbstractArtifactImpl
