/**
 */
package WebApplication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebApplication.Form#getElements <em>Elements</em>}</li>
 *   <li>{@link WebApplication.Form#getEntity <em>Entity</em>}</li>
 *   <li>{@link WebApplication.Form#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see WebApplication.WebApplicationPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends Content {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link WebApplication.Elements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see WebApplication.WebApplicationPackage#getForm_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Elements> getElements();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(Entity)
	 * @see WebApplication.WebApplicationPackage#getForm_Entity()
	 * @model containment="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link WebApplication.Form#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link WebApplication.Methodtype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see WebApplication.Methodtype
	 * @see #setMethod(Methodtype)
	 * @see WebApplication.WebApplicationPackage#getForm_Method()
	 * @model
	 * @generated
	 */
	Methodtype getMethod();

	/**
	 * Sets the value of the '{@link WebApplication.Form#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see WebApplication.Methodtype
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Methodtype value);

} // Form
