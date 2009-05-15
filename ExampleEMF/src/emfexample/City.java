/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emfexample;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfexample.City#getName <em>Name</em>}</li>
 *   <li>{@link emfexample.City#getPeople <em>People</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfexample.EmfexamplePackage#getCity()
 * @model
 * @generated
 */
public interface City extends EObject {
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
     * @see emfexample.EmfexamplePackage#getCity_Name()
     * @model id="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link emfexample.City#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>People</b></em>' reference list.
     * The list contents are of type {@link emfexample.Person}.
     * It is bidirectional and its opposite is '{@link emfexample.Person#getLivesIn <em>Lives In</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>People</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>People</em>' reference list.
     * @see emfexample.EmfexamplePackage#getCity_People()
     * @see emfexample.Person#getLivesIn
     * @model opposite="livesIn"
     * @generated
     */
    EList<Person> getPeople();

} // City
