/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emfexample.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import emfexample.Applicant;
import emfexample.EmfexamplePackage;
import emfexample.Position;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Applicant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emfexample.impl.ApplicantImpl#getApplyingFor <em>Applying For</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicantImpl extends PersonImpl implements Applicant {
    /**
     * The cached value of the '{@link #getApplyingFor() <em>Applying For</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApplyingFor()
     * @generated
     * @ordered
     */
    protected EList<Position> applyingFor;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ApplicantImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EmfexamplePackage.Literals.APPLICANT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Position> getApplyingFor() {
        if (applyingFor == null) {
            applyingFor = new EObjectResolvingEList<Position>(Position.class, this, EmfexamplePackage.APPLICANT__APPLYING_FOR);
        }
        return applyingFor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EmfexamplePackage.APPLICANT__APPLYING_FOR:
                return getApplyingFor();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case EmfexamplePackage.APPLICANT__APPLYING_FOR:
                getApplyingFor().clear();
                getApplyingFor().addAll((Collection<? extends Position>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case EmfexamplePackage.APPLICANT__APPLYING_FOR:
                getApplyingFor().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case EmfexamplePackage.APPLICANT__APPLYING_FOR:
                return applyingFor != null && !applyingFor.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ApplicantImpl
