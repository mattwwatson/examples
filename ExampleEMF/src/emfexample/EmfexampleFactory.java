/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emfexample;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see emfexample.EmfexamplePackage
 * @generated
 */
public interface EmfexampleFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EmfexampleFactory eINSTANCE = emfexample.impl.EmfexampleFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Applicant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Applicant</em>'.
     * @generated
     */
    Applicant createApplicant();

    /**
     * Returns a new object of class '<em>City</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>City</em>'.
     * @generated
     */
    City createCity();

    /**
     * Returns a new object of class '<em>Position</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Position</em>'.
     * @generated
     */
    Position createPosition();

    /**
     * Returns a new object of class '<em>Person</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Person</em>'.
     * @generated
     */
    Person createPerson();

    /**
     * Returns a new object of class '<em>Supervisor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Supervisor</em>'.
     * @generated
     */
    Supervisor createSupervisor();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    EmfexamplePackage getEmfexamplePackage();

} //EmfexampleFactory
