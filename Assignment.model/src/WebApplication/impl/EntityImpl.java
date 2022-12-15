/**
 */
package WebApplication.impl;

import WebApplication.Entity;
import WebApplication.Features;
import WebApplication.References;
import WebApplication.Relation;
import WebApplication.WebApplicationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WebApplication.impl.EntityImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link WebApplication.impl.EntityImpl#getReferences <em>References</em>}</li>
 *   <li>{@link WebApplication.impl.EntityImpl#getRelationA <em>Relation A</em>}</li>
 *   <li>{@link WebApplication.impl.EntityImpl#getRelationR <em>Relation R</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends DynamicContentImpl implements Entity {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Features> features;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<References> references;

	/**
	 * The default value of the '{@link #getRelationA() <em>Relation A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationA()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATION_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationA() <em>Relation A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationA()
	 * @generated
	 * @ordered
	 */
	protected String relationA = RELATION_A_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelationR() <em>Relation R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationR()
	 * @generated
	 * @ordered
	 */
	protected Relation relationR;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebApplicationPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Features> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Features>(Features.class, this, WebApplicationPackage.ENTITY__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<References> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<References>(References.class, this, WebApplicationPackage.ENTITY__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelationA() {
		return relationA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationA(String newRelationA) {
		String oldRelationA = relationA;
		relationA = newRelationA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationPackage.ENTITY__RELATION_A, oldRelationA, relationA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getRelationR() {
		return relationR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationR(Relation newRelationR, NotificationChain msgs) {
		Relation oldRelationR = relationR;
		relationR = newRelationR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebApplicationPackage.ENTITY__RELATION_R, oldRelationR, newRelationR);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationR(Relation newRelationR) {
		if (newRelationR != relationR) {
			NotificationChain msgs = null;
			if (relationR != null)
				msgs = ((InternalEObject)relationR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebApplicationPackage.ENTITY__RELATION_R, null, msgs);
			if (newRelationR != null)
				msgs = ((InternalEObject)newRelationR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebApplicationPackage.ENTITY__RELATION_R, null, msgs);
			msgs = basicSetRelationR(newRelationR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationPackage.ENTITY__RELATION_R, newRelationR, newRelationR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebApplicationPackage.ENTITY__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case WebApplicationPackage.ENTITY__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case WebApplicationPackage.ENTITY__RELATION_R:
				return basicSetRelationR(null, msgs);
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
			case WebApplicationPackage.ENTITY__FEATURES:
				return getFeatures();
			case WebApplicationPackage.ENTITY__REFERENCES:
				return getReferences();
			case WebApplicationPackage.ENTITY__RELATION_A:
				return getRelationA();
			case WebApplicationPackage.ENTITY__RELATION_R:
				return getRelationR();
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
			case WebApplicationPackage.ENTITY__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Features>)newValue);
				return;
			case WebApplicationPackage.ENTITY__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends References>)newValue);
				return;
			case WebApplicationPackage.ENTITY__RELATION_A:
				setRelationA((String)newValue);
				return;
			case WebApplicationPackage.ENTITY__RELATION_R:
				setRelationR((Relation)newValue);
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
			case WebApplicationPackage.ENTITY__FEATURES:
				getFeatures().clear();
				return;
			case WebApplicationPackage.ENTITY__REFERENCES:
				getReferences().clear();
				return;
			case WebApplicationPackage.ENTITY__RELATION_A:
				setRelationA(RELATION_A_EDEFAULT);
				return;
			case WebApplicationPackage.ENTITY__RELATION_R:
				setRelationR((Relation)null);
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
			case WebApplicationPackage.ENTITY__FEATURES:
				return features != null && !features.isEmpty();
			case WebApplicationPackage.ENTITY__REFERENCES:
				return references != null && !references.isEmpty();
			case WebApplicationPackage.ENTITY__RELATION_A:
				return RELATION_A_EDEFAULT == null ? relationA != null : !RELATION_A_EDEFAULT.equals(relationA);
			case WebApplicationPackage.ENTITY__RELATION_R:
				return relationR != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (RelationA: ");
		result.append(relationA);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
