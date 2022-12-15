/**
 */
package WebApplication;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>References</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebApplication.References#getForeignKey <em>Foreign Key</em>}</li>
 * </ul>
 *
 * @see WebApplication.WebApplicationPackage#getReferences()
 * @model
 * @generated
 */
public interface References extends Features, Entity {
	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' containment reference.
	 * @see #setForeignKey(Entity)
	 * @see WebApplication.WebApplicationPackage#getReferences_ForeignKey()
	 * @model containment="true"
	 * @generated
	 */
	Entity getForeignKey();

	/**
	 * Sets the value of the '{@link WebApplication.References#getForeignKey <em>Foreign Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key</em>' containment reference.
	 * @see #getForeignKey()
	 * @generated
	 */
	void setForeignKey(Entity value);

} // References
