/**
 */
package WebApplication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebApplication.DynamicContent#getEntity <em>Entity</em>}</li>
 *   <li>{@link WebApplication.DynamicContent#getAttributesD <em>Attributes D</em>}</li>
 * </ul>
 *
 * @see WebApplication.WebApplicationPackage#getDynamicContent()
 * @model
 * @generated
 */
public interface DynamicContent extends Content {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(Entity)
	 * @see WebApplication.WebApplicationPackage#getDynamicContent_Entity()
	 * @model containment="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link WebApplication.DynamicContent#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Attributes D</b></em>' containment reference list.
	 * The list contents are of type {@link WebApplication.Attributes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes D</em>' containment reference list.
	 * @see WebApplication.WebApplicationPackage#getDynamicContent_AttributesD()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attributes> getAttributesD();

} // DynamicContent
