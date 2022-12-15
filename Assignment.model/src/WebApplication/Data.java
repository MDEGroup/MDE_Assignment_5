/**
 */
package WebApplication;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebApplication.Data#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see WebApplication.WebApplicationPackage#getData()
 * @model
 * @generated
 */
public interface Data extends WebApplication.System {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(Entity)
	 * @see WebApplication.WebApplicationPackage#getData_Entity()
	 * @model containment="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link WebApplication.Data#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // Data
