/**
 */
package WebApplication.impl;

import WebApplication.Attributes;
import WebApplication.DynamicContent;
import WebApplication.Entity;
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
 * An implementation of the model object '<em><b>Dynamic Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WebApplication.impl.DynamicContentImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link WebApplication.impl.DynamicContentImpl#getAttributesD <em>Attributes D</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicContentImpl extends ContentImpl implements DynamicContent {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * The cached value of the '{@link #getAttributesD() <em>Attributes D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributesD()
	 * @generated
	 * @ordered
	 */
	protected EList<Attributes> attributesD;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebApplicationPackage.Literals.DYNAMIC_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebApplicationPackage.DYNAMIC_CONTENT__ENTITY, oldEntity, newEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity) {
		if (newEntity != entity) {
			NotificationChain msgs = null;
			if (entity != null)
				msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebApplicationPackage.DYNAMIC_CONTENT__ENTITY, null, msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebApplicationPackage.DYNAMIC_CONTENT__ENTITY, null, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationPackage.DYNAMIC_CONTENT__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attributes> getAttributesD() {
		if (attributesD == null) {
			attributesD = new EObjectContainmentEList<Attributes>(Attributes.class, this, WebApplicationPackage.DYNAMIC_CONTENT__ATTRIBUTES_D);
		}
		return attributesD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebApplicationPackage.DYNAMIC_CONTENT__ENTITY:
				return basicSetEntity(null, msgs);
			case WebApplicationPackage.DYNAMIC_CONTENT__ATTRIBUTES_D:
				return ((InternalEList<?>)getAttributesD()).basicRemove(otherEnd, msgs);
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
			case WebApplicationPackage.DYNAMIC_CONTENT__ENTITY:
				return getEntity();
			case WebApplicationPackage.DYNAMIC_CONTENT__ATTRIBUTES_D:
				return getAttributesD();
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
			case WebApplicationPackage.DYNAMIC_CONTENT__ENTITY:
				setEntity((Entity)newValue);
				return;
			case WebApplicationPackage.DYNAMIC_CONTENT__ATTRIBUTES_D:
				getAttributesD().clear();
				getAttributesD().addAll((Collection<? extends Attributes>)newValue);
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
			case WebApplicationPackage.DYNAMIC_CONTENT__ENTITY:
				setEntity((Entity)null);
				return;
			case WebApplicationPackage.DYNAMIC_CONTENT__ATTRIBUTES_D:
				getAttributesD().clear();
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
			case WebApplicationPackage.DYNAMIC_CONTENT__ENTITY:
				return entity != null;
			case WebApplicationPackage.DYNAMIC_CONTENT__ATTRIBUTES_D:
				return attributesD != null && !attributesD.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DynamicContentImpl
