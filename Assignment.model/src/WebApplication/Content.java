/**
 */
package WebApplication;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebApplication.Content#getDynamicContent <em>Dynamic Content</em>}</li>
 * </ul>
 *
 * @see WebApplication.WebApplicationPackage#getContent()
 * @model
 * @generated
 */
public interface Content extends WebApplication.System, NamedElement {
	/**
	 * Returns the value of the '<em><b>Dynamic Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Content</em>' containment reference.
	 * @see #setDynamicContent(DynamicContent)
	 * @see WebApplication.WebApplicationPackage#getContent_DynamicContent()
	 * @model containment="true"
	 * @generated
	 */
	DynamicContent getDynamicContent();

	/**
	 * Sets the value of the '{@link WebApplication.Content#getDynamicContent <em>Dynamic Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Content</em>' containment reference.
	 * @see #getDynamicContent()
	 * @generated
	 */
	void setDynamicContent(DynamicContent value);

} // Content
