/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emfexample;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfexample.Person#getName <em>Name</em>}</li>
 *   <li>{@link emfexample.Person#getLivesIn <em>Lives In</em>}</li>
 *   <li>{@link emfexample.Person#getEmail <em>Email</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfexample.EmfexamplePackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see emfexample.EmfexamplePackage#getPerson_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link emfexample.Person#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Lives In</b></em>' reference.
     * It is bidirectional and its opposite is '{@link emfexample.City#getPeople <em>People</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lives In</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lives In</em>' reference.
     * @see #setLivesIn(City)
     * @see emfexample.EmfexamplePackage#getPerson_LivesIn()
     * @see emfexample.City#getPeople
     * @model opposite="people" required="true"
     * @generated
     */
    City getLivesIn();

    /**
     * Sets the value of the '{@link emfexample.Person#getLivesIn <em>Lives In</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lives In</em>' reference.
     * @see #getLivesIn()
     * @generated
     */
    void setLivesIn(City value);

    /**
     * Returns the value of the '<em><b>Email</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Email</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Email</em>' attribute.
     * @see #setEmail(String)
     * @see emfexample.EmfexamplePackage#getPerson_Email()
     * @model id="true"
     * @generated
     */
    String getEmail();

    /**
     * Sets the value of the '{@link emfexample.Person#getEmail <em>Email</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Email</em>' attribute.
     * @see #getEmail()
     * @generated
     */
    void setEmail(String value);

} // Person
