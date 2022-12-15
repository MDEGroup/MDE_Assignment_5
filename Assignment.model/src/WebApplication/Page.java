/**
 */
package WebApplication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebApplication.Page#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see WebApplication.WebApplicationPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link WebApplication.Content}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see WebApplication.WebApplicationPackage#getPage_Content()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Content> getContent();

} // Page
