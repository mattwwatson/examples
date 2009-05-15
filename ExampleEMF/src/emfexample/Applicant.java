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
 * A representation of the model object '<em><b>Applicant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfexample.Applicant#getApplyingFor <em>Applying For</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfexample.EmfexamplePackage#getApplicant()
 * @model
 * @generated
 */
public interface Applicant extends Person {
    /**
     * Returns the value of the '<em><b>Applying For</b></em>' reference list.
     * The list contents are of type {@link emfexample.Position}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Applying For</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Applying For</em>' reference list.
     * @see emfexample.EmfexamplePackage#getApplicant_ApplyingFor()
     * @model
     * @generated
     */
    EList<Position> getApplyingFor();

} // Applicant
