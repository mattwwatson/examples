/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emfexample;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supervisor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfexample.Supervisor#getManages <em>Manages</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfexample.EmfexamplePackage#getSupervisor()
 * @model
 * @generated
 */
public interface Supervisor extends Person {

    /**
     * Returns the value of the '<em><b>Manages</b></em>' reference list.
     * The list contents are of type {@link emfexample.Position}.
     * It is bidirectional and its opposite is '{@link emfexample.Position#getManagedBy <em>Managed By</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Manages</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Manages</em>' reference list.
     * @see emfexample.EmfexamplePackage#getSupervisor_Manages()
     * @see emfexample.Position#getManagedBy
     * @model opposite="managedBy"
     * @generated
     */
    EList<Position> getManages();
} // Supervisor
