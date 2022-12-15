/**
 */
package WebApplication.impl;

import WebApplication.Attributes;
import WebApplication.Features;
import WebApplication.References;
import WebApplication.WebApplicationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Features</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WebApplication.impl.FeaturesImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link WebApplication.impl.FeaturesImpl#getAttributesF <em>Attributes F</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeaturesImpl extends EntityImpl implements Features {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected References reference;

	/**
	 * The cached value of the '{@link #getAttributesF() <em>Attributes F</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributesF()
	 * @generated
	 * @ordered
	 */
	protected Attributes attributesF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeaturesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebApplicationPackage.Literals.FEATURES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public References getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(References newReference, NotificationChain msgs) {
		References oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebApplicationPackage.FEATURES__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(References newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebApplicationPackage.FEATURES__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebApplicationPackage.FEATURES__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationPackage.FEATURES__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes getAttributesF() {
		return attributesF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributesF(Attributes newAttributesF, NotificationChain msgs) {
		Attributes oldAttributesF = attributesF;
		attributesF = newAttributesF;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebApplicationPackage.FEATURES__ATTRIBUTES_F, oldAttributesF, newAttributesF);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributesF(Attributes newAttributesF) {
		if (newAttributesF != attributesF) {
			NotificationChain msgs = null;
			if (attributesF != null)
				msgs = ((InternalEObject)attributesF).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebApplicationPackage.FEATURES__ATTRIBUTES_F, null, msgs);
			if (newAttributesF != null)
				msgs = ((InternalEObject)newAttributesF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebApplicationPackage.FEATURES__ATTRIBUTES_F, null, msgs);
			msgs = basicSetAttributesF(newAttributesF, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationPackage.FEATURES__ATTRIBUTES_F, newAttributesF, newAttributesF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebApplicationPackage.FEATURES__REFERENCE:
				return basicSetReference(null, msgs);
			case WebApplicationPackage.FEATURES__ATTRIBUTES_F:
				return basicSetAttributesF(null, msgs);
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
			case WebApplicationPackage.FEATURES__REFERENCE:
				return getReference();
			case WebApplicationPackage.FEATURES__ATTRIBUTES_F:
				return getAttributesF();
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
			case WebApplicationPackage.FEATURES__REFERENCE:
				setReference((References)newValue);
				return;
			case WebApplicationPackage.FEATURES__ATTRIBUTES_F:
				setAttributesF((Attributes)newValue);
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
			case WebApplicationPackage.FEATURES__REFERENCE:
				setReference((References)null);
				return;
			case WebApplicationPackage.FEATURES__ATTRIBUTES_F:
				setAttributesF((Attributes)null);
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
			case WebApplicationPackage.FEATURES__REFERENCE:
				return reference != null;
			case WebApplicationPackage.FEATURES__ATTRIBUTES_F:
				return attributesF != null;
		}
		return super.eIsSet(featureID);
	}

} //FeaturesImpl
