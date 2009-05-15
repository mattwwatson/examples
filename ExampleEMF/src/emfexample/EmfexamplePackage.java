/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emfexample;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see emfexample.EmfexampleFactory
 * @model kind="package"
 * @generated
 */
public interface EmfexamplePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "emfexample";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "platform:/resource/ExampleEMF/model/ExampleEMF.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "emfex";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EmfexamplePackage eINSTANCE = emfexample.impl.EmfexamplePackageImpl.init();

    /**
     * The meta object id for the '{@link emfexample.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfexample.impl.PersonImpl
     * @see emfexample.impl.EmfexamplePackageImpl#getPerson()
     * @generated
     */
    int PERSON = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__NAME = 0;

    /**
     * The feature id for the '<em><b>Lives In</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__LIVES_IN = 1;

    /**
     * The feature id for the '<em><b>Email</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON__EMAIL = 2;

    /**
     * The number of structural features of the '<em>Person</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSON_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link emfexample.impl.ApplicantImpl <em>Applicant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfexample.impl.ApplicantImpl
     * @see emfexample.impl.EmfexamplePackageImpl#getApplicant()
     * @generated
     */
    int APPLICANT = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICANT__NAME = PERSON__NAME;

    /**
     * The feature id for the '<em><b>Lives In</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICANT__LIVES_IN = PERSON__LIVES_IN;

    /**
     * The feature id for the '<em><b>Email</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICANT__EMAIL = PERSON__EMAIL;

    /**
     * The feature id for the '<em><b>Applying For</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICANT__APPLYING_FOR = PERSON_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Applicant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICANT_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link emfexample.impl.CityImpl <em>City</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfexample.impl.CityImpl
     * @see emfexample.impl.EmfexamplePackageImpl#getCity()
     * @generated
     */
    int CITY = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CITY__NAME = 0;

    /**
     * The feature id for the '<em><b>People</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CITY__PEOPLE = 1;

    /**
     * The number of structural features of the '<em>City</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CITY_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link emfexample.impl.PositionImpl <em>Position</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfexample.impl.PositionImpl
     * @see emfexample.impl.EmfexamplePackageImpl#getPosition()
     * @generated
     */
    int POSITION = 2;

    /**
     * The feature id for the '<em><b>Location</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__LOCATION = 0;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__TITLE = 1;

    /**
     * The feature id for the '<em><b>Pay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__PAY = 2;

    /**
     * The feature id for the '<em><b>Managed By</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION__MANAGED_BY = 3;

    /**
     * The number of structural features of the '<em>Position</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POSITION_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link emfexample.impl.SupervisorImpl <em>Supervisor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfexample.impl.SupervisorImpl
     * @see emfexample.impl.EmfexamplePackageImpl#getSupervisor()
     * @generated
     */
    int SUPERVISOR = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR__NAME = PERSON__NAME;

    /**
     * The feature id for the '<em><b>Lives In</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR__LIVES_IN = PERSON__LIVES_IN;

    /**
     * The feature id for the '<em><b>Email</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR__EMAIL = PERSON__EMAIL;

    /**
     * The feature id for the '<em><b>Manages</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR__MANAGES = PERSON_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Supervisor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUPERVISOR_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;


    /**
     * Returns the meta object for class '{@link emfexample.Applicant <em>Applicant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Applicant</em>'.
     * @see emfexample.Applicant
     * @generated
     */
    EClass getApplicant();

    /**
     * Returns the meta object for the reference list '{@link emfexample.Applicant#getApplyingFor <em>Applying For</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Applying For</em>'.
     * @see emfexample.Applicant#getApplyingFor()
     * @see #getApplicant()
     * @generated
     */
    EReference getApplicant_ApplyingFor();

    /**
     * Returns the meta object for class '{@link emfexample.City <em>City</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>City</em>'.
     * @see emfexample.City
     * @generated
     */
    EClass getCity();

    /**
     * Returns the meta object for the attribute '{@link emfexample.City#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see emfexample.City#getName()
     * @see #getCity()
     * @generated
     */
    EAttribute getCity_Name();

    /**
     * Returns the meta object for the reference list '{@link emfexample.City#getPeople <em>People</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>People</em>'.
     * @see emfexample.City#getPeople()
     * @see #getCity()
     * @generated
     */
    EReference getCity_People();

    /**
     * Returns the meta object for class '{@link emfexample.Position <em>Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Position</em>'.
     * @see emfexample.Position
     * @generated
     */
    EClass getPosition();

    /**
     * Returns the meta object for the reference '{@link emfexample.Position#getLocation <em>Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Location</em>'.
     * @see emfexample.Position#getLocation()
     * @see #getPosition()
     * @generated
     */
    EReference getPosition_Location();

    /**
     * Returns the meta object for the attribute '{@link emfexample.Position#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see emfexample.Position#getTitle()
     * @see #getPosition()
     * @generated
     */
    EAttribute getPosition_Title();

    /**
     * Returns the meta object for the attribute '{@link emfexample.Position#getPay <em>Pay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pay</em>'.
     * @see emfexample.Position#getPay()
     * @see #getPosition()
     * @generated
     */
    EAttribute getPosition_Pay();

    /**
     * Returns the meta object for the reference '{@link emfexample.Position#getManagedBy <em>Managed By</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Managed By</em>'.
     * @see emfexample.Position#getManagedBy()
     * @see #getPosition()
     * @generated
     */
    EReference getPosition_ManagedBy();

    /**
     * Returns the meta object for class '{@link emfexample.Person <em>Person</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Person</em>'.
     * @see emfexample.Person
     * @generated
     */
    EClass getPerson();

    /**
     * Returns the meta object for the attribute '{@link emfexample.Person#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see emfexample.Person#getName()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_Name();

    /**
     * Returns the meta object for the reference '{@link emfexample.Person#getLivesIn <em>Lives In</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Lives In</em>'.
     * @see emfexample.Person#getLivesIn()
     * @see #getPerson()
     * @generated
     */
    EReference getPerson_LivesIn();

    /**
     * Returns the meta object for the attribute '{@link emfexample.Person#getEmail <em>Email</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Email</em>'.
     * @see emfexample.Person#getEmail()
     * @see #getPerson()
     * @generated
     */
    EAttribute getPerson_Email();

    /**
     * Returns the meta object for class '{@link emfexample.Supervisor <em>Supervisor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Supervisor</em>'.
     * @see emfexample.Supervisor
     * @generated
     */
    EClass getSupervisor();

    /**
     * Returns the meta object for the reference list '{@link emfexample.Supervisor#getManages <em>Manages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Manages</em>'.
     * @see emfexample.Supervisor#getManages()
     * @see #getSupervisor()
     * @generated
     */
    EReference getSupervisor_Manages();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    EmfexampleFactory getEmfexampleFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link emfexample.impl.ApplicantImpl <em>Applicant</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see emfexample.impl.ApplicantImpl
         * @see emfexample.impl.EmfexamplePackageImpl#getApplicant()
         * @generated
         */
        EClass APPLICANT = eINSTANCE.getApplicant();

        /**
         * The meta object literal for the '<em><b>Applying For</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICANT__APPLYING_FOR = eINSTANCE.getApplicant_ApplyingFor();

        /**
         * The meta object literal for the '{@link emfexample.impl.CityImpl <em>City</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see emfexample.impl.CityImpl
         * @see emfexample.impl.EmfexamplePackageImpl#getCity()
         * @generated
         */
        EClass CITY = eINSTANCE.getCity();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CITY__NAME = eINSTANCE.getCity_Name();

        /**
         * The meta object literal for the '<em><b>People</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CITY__PEOPLE = eINSTANCE.getCity_People();

        /**
         * The meta object literal for the '{@link emfexample.impl.PositionImpl <em>Position</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see emfexample.impl.PositionImpl
         * @see emfexample.impl.EmfexamplePackageImpl#getPosition()
         * @generated
         */
        EClass POSITION = eINSTANCE.getPosition();

        /**
         * The meta object literal for the '<em><b>Location</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference POSITION__LOCATION = eINSTANCE.getPosition_Location();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute POSITION__TITLE = eINSTANCE.getPosition_Title();

        /**
         * The meta object literal for the '<em><b>Pay</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute POSITION__PAY = eINSTANCE.getPosition_Pay();

        /**
         * The meta object literal for the '<em><b>Managed By</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference POSITION__MANAGED_BY = eINSTANCE.getPosition_ManagedBy();

        /**
         * The meta object literal for the '{@link emfexample.impl.PersonImpl <em>Person</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see emfexample.impl.PersonImpl
         * @see emfexample.impl.EmfexamplePackageImpl#getPerson()
         * @generated
         */
        EClass PERSON = eINSTANCE.getPerson();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

        /**
         * The meta object literal for the '<em><b>Lives In</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PERSON__LIVES_IN = eINSTANCE.getPerson_LivesIn();

        /**
         * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

        /**
         * The meta object literal for the '{@link emfexample.impl.SupervisorImpl <em>Supervisor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see emfexample.impl.SupervisorImpl
         * @see emfexample.impl.EmfexamplePackageImpl#getSupervisor()
         * @generated
         */
        EClass SUPERVISOR = eINSTANCE.getSupervisor();

        /**
         * The meta object literal for the '<em><b>Manages</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SUPERVISOR__MANAGES = eINSTANCE.getSupervisor_Manages();

    }

} //EmfexamplePackage
