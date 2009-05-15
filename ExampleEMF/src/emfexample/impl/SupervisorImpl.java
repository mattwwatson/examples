/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emfexample.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import emfexample.EmfexamplePackage;
import emfexample.Position;
import emfexample.Supervisor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supervisor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emfexample.impl.SupervisorImpl#getManages <em>Manages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupervisorImpl extends PersonImpl implements Supervisor {
    /**
     * The cached value of the '{@link #getManages() <em>Manages</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getManages()
     * @generated
     * @ordered
     */
    protected EList<Position> manages;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SupervisorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EmfexamplePackage.Literals.SUPERVISOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Position> getManages() {
        if (manages == null) {
            manages = new EObjectWithInverseResolvingEList<Position>(Position.class, this, EmfexamplePackage.SUPERVISOR__MANAGES, EmfexamplePackage.POSITION__MANAGED_BY);
        }
        return manages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EmfexamplePackage.SUPERVISOR__MANAGES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getManages()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EmfexamplePackage.SUPERVISOR__MANAGES:
                return ((InternalEList<?>)getManages()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EmfexamplePackage.SUPERVISOR__MANAGES:
                return getManages();
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
            case EmfexamplePackage.SUPERVISOR__MANAGES:
                getManages().clear();
                getManages().addAll((Collection<? extends Position>)newValue);
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
            case EmfexamplePackage.SUPERVISOR__MANAGES:
                getManages().clear();
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
            case EmfexamplePackage.SUPERVISOR__MANAGES:
                return manages != null && !manages.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //SupervisorImpl
