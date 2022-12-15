/**
 */
package WebApplication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebApplication.Index#getIndividual <em>Individual</em>}</li>
 * </ul>
 *
 * @see WebApplication.WebApplicationPackage#getIndex()
 * @model
 * @generated
 */
public interface Index extends DynamicContent {
	/**
	 * Returns the value of the '<em><b>Individual</b></em>' containment reference list.
	 * The list contents are of type {@link WebApplication.Individual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual</em>' containment reference list.
	 * @see WebApplication.WebApplicationPackage#getIndex_Individual()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Individual> getIndividual();

} // Index
