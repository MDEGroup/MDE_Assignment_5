/**
 */
package WebApplication;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebApplication.Features#getReference <em>Reference</em>}</li>
 *   <li>{@link WebApplication.Features#getAttributesF <em>Attributes F</em>}</li>
 * </ul>
 *
 * @see WebApplication.WebApplicationPackage#getFeatures()
 * @model
 * @generated
 */
public interface Features extends Entity, NamedElement {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(References)
	 * @see WebApplication.WebApplicationPackage#getFeatures_Reference()
	 * @model containment="true"
	 * @generated
	 */
	References getReference();

	/**
	 * Sets the value of the '{@link WebApplication.Features#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(References value);

	/**
	 * Returns the value of the '<em><b>Attributes F</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes F</em>' containment reference.
	 * @see #setAttributesF(Attributes)
	 * @see WebApplication.WebApplicationPackage#getFeatures_AttributesF()
	 * @model containment="true"
	 * @generated
	 */
	Attributes getAttributesF();

	/**
	 * Sets the value of the '{@link WebApplication.Features#getAttributesF <em>Attributes F</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes F</em>' containment reference.
	 * @see #getAttributesF()
	 * @generated
	 */
	void setAttributesF(Attributes value);

} // Features
