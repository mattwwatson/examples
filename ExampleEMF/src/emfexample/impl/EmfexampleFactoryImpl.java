/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emfexample.impl;

import emfexample.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import emfexample.Applicant;
import emfexample.City;
import emfexample.EmfexampleFactory;
import emfexample.EmfexamplePackage;
import emfexample.Person;
import emfexample.Position;
import emfexample.Supervisor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfexampleFactoryImpl extends EFactoryImpl implements EmfexampleFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EmfexampleFactory init() {
        try {
            EmfexampleFactory theEmfexampleFactory = (EmfexampleFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/ExampleEMF/model/ExampleEMF.ecore"); 
            if (theEmfexampleFactory != null) {
                return theEmfexampleFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new EmfexampleFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EmfexampleFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case EmfexamplePackage.APPLICANT: return createApplicant();
            case EmfexamplePackage.CITY: return createCity();
            case EmfexamplePackage.POSITION: return createPosition();
            case EmfexamplePackage.PERSON: return createPerson();
            case EmfexamplePackage.SUPERVISOR: return createSupervisor();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Applicant createApplicant() {
        ApplicantImpl applicant = new ApplicantImpl();
        return applicant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public City createCity() {
        CityImpl city = new CityImpl();
        return city;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Position createPosition() {
        PositionImpl position = new PositionImpl();
        return position;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Person createPerson() {
        PersonImpl person = new PersonImpl();
        return person;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Supervisor createSupervisor() {
        SupervisorImpl supervisor = new SupervisorImpl();
        return supervisor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EmfexamplePackage getEmfexamplePackage() {
        return (EmfexamplePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static EmfexamplePackage getPackage() {
        return EmfexamplePackage.eINSTANCE;
    }

} //EmfexampleFactoryImpl
