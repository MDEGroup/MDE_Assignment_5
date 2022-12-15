/**
 */
package WebApplication;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebApplication.Individual#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see WebApplication.WebApplicationPackage#getIndividual()
 * @model
 * @generated
 */
public interface Individual extends DynamicContent, Index {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(Index)
	 * @see WebApplication.WebApplicationPackage#getIndividual_Index()
	 * @model containment="true"
	 * @generated
	 */
	Index getIndex();

	/**
	 * Sets the value of the '{@link WebApplication.Individual#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Index value);

} // Individual
