/**
 */
package WebApplication;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebApplication.Elements#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see WebApplication.WebApplicationPackage#getElements()
 * @model
 * @generated
 */
public interface Elements extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attributes)
	 * @see WebApplication.WebApplicationPackage#getElements_Attribute()
	 * @model
	 * @generated
	 */
	Attributes getAttribute();

	/**
	 * Sets the value of the '{@link WebApplication.Elements#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attributes value);

} // Elements
