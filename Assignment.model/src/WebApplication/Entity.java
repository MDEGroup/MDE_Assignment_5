/**
 */
package WebApplication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WebApplication.Entity#getFeatures <em>Features</em>}</li>
 *   <li>{@link WebApplication.Entity#getReferences <em>References</em>}</li>
 *   <li>{@link WebApplication.Entity#getRelationA <em>Relation A</em>}</li>
 *   <li>{@link WebApplication.Entity#getRelationR <em>Relation R</em>}</li>
 * </ul>
 *
 * @see WebApplication.WebApplicationPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends DynamicContent, NamedElement {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link WebApplication.Features}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see WebApplication.WebApplicationPackage#getEntity_Features()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Features> getFeatures();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link WebApplication.References}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see WebApplication.WebApplicationPackage#getEntity_References()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<References> getReferences();

	/**
	 * Returns the value of the '<em><b>Relation A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation A</em>' attribute.
	 * @see #setRelationA(String)
	 * @see WebApplication.WebApplicationPackage#getEntity_RelationA()
	 * @model required="true"
	 * @generated
	 */
	String getRelationA();

	/**
	 * Sets the value of the '{@link WebApplication.Entity#getRelationA <em>Relation A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation A</em>' attribute.
	 * @see #getRelationA()
	 * @generated
	 */
	void setRelationA(String value);

	/**
	 * Returns the value of the '<em><b>Relation R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation R</em>' containment reference.
	 * @see #setRelationR(Relation)
	 * @see WebApplication.WebApplicationPackage#getEntity_RelationR()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Relation getRelationR();

	/**
	 * Sets the value of the '{@link WebApplication.Entity#getRelationR <em>Relation R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation R</em>' containment reference.
	 * @see #getRelationR()
	 * @generated
	 */
	void setRelationR(Relation value);

} // Entity
