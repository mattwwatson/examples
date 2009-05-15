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
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfexample.Position#getLocation <em>Location</em>}</li>
 *   <li>{@link emfexample.Position#getTitle <em>Title</em>}</li>
 *   <li>{@link emfexample.Position#getPay <em>Pay</em>}</li>
 *   <li>{@link emfexample.Position#getManagedBy <em>Managed By</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfexample.EmfexamplePackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject {
    /**
     * Returns the value of the '<em><b>Location</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Location</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Location</em>' reference.
     * @see #setLocation(City)
     * @see emfexample.EmfexamplePackage#getPosition_Location()
     * @model required="true"
     * @generated
     */
    City getLocation();

    /**
     * Sets the value of the '{@link emfexample.Position#getLocation <em>Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' reference.
     * @see #getLocation()
     * @generated
     */
    void setLocation(City value);

    /**
     * Returns the value of the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Title</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Title</em>' attribute.
     * @see #setTitle(String)
     * @see emfexample.EmfexamplePackage#getPosition_Title()
     * @model
     * @generated
     */
    String getTitle();

    /**
     * Sets the value of the '{@link emfexample.Position#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Title</em>' attribute.
     * @see #getTitle()
     * @generated
     */
    void setTitle(String value);

    /**
     * Returns the value of the '<em><b>Pay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pay</em>' attribute.
     * @see #setPay(double)
     * @see emfexample.EmfexamplePackage#getPosition_Pay()
     * @model
     * @generated
     */
    double getPay();

    /**
     * Sets the value of the '{@link emfexample.Position#getPay <em>Pay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pay</em>' attribute.
     * @see #getPay()
     * @generated
     */
    void setPay(double value);

    /**
     * Returns the value of the '<em><b>Managed By</b></em>' reference.
     * It is bidirectional and its opposite is '{@link emfexample.Supervisor#getManages <em>Manages</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Managed By</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Managed By</em>' reference.
     * @see #setManagedBy(Supervisor)
     * @see emfexample.EmfexamplePackage#getPosition_ManagedBy()
     * @see emfexample.Supervisor#getManages
     * @model opposite="manages" required="true"
     * @generated
     */
    Supervisor getManagedBy();

    /**
     * Sets the value of the '{@link emfexample.Position#getManagedBy <em>Managed By</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Managed By</em>' reference.
     * @see #getManagedBy()
     * @generated
     */
    void setManagedBy(Supervisor value);

} // Position
