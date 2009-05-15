/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emfexample.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import emfexample.City;
import emfexample.EmfexamplePackage;
import emfexample.Position;
import emfexample.Supervisor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emfexample.impl.PositionImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link emfexample.impl.PositionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link emfexample.impl.PositionImpl#getPay <em>Pay</em>}</li>
 *   <li>{@link emfexample.impl.PositionImpl#getManagedBy <em>Managed By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PositionImpl extends EObjectImpl implements Position {
    /**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected City location;

    /**
     * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected static final String TITLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected String title = TITLE_EDEFAULT;

    /**
     * The default value of the '{@link #getPay() <em>Pay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPay()
     * @generated
     * @ordered
     */
    protected static final double PAY_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getPay() <em>Pay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPay()
     * @generated
     * @ordered
     */
    protected double pay = PAY_EDEFAULT;

    /**
     * The cached value of the '{@link #getManagedBy() <em>Managed By</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getManagedBy()
     * @generated
     * @ordered
     */
    protected Supervisor managedBy;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PositionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EmfexamplePackage.Literals.POSITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public City getLocation() {
        if (location != null && location.eIsProxy()) {
            InternalEObject oldLocation = (InternalEObject)location;
            location = (City)eResolveProxy(oldLocation);
            if (location != oldLocation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfexamplePackage.POSITION__LOCATION, oldLocation, location));
            }
        }
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public City basicGetLocation() {
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocation(City newLocation) {
        City oldLocation = location;
        location = newLocation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EmfexamplePackage.POSITION__LOCATION, oldLocation, location));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTitle(String newTitle) {
        String oldTitle = title;
        title = newTitle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EmfexamplePackage.POSITION__TITLE, oldTitle, title));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getPay() {
        return pay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPay(double newPay) {
        double oldPay = pay;
        pay = newPay;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EmfexamplePackage.POSITION__PAY, oldPay, pay));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Supervisor getManagedBy() {
        if (managedBy != null && managedBy.eIsProxy()) {
            InternalEObject oldManagedBy = (InternalEObject)managedBy;
            managedBy = (Supervisor)eResolveProxy(oldManagedBy);
            if (managedBy != oldManagedBy) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfexamplePackage.POSITION__MANAGED_BY, oldManagedBy, managedBy));
            }
        }
        return managedBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Supervisor basicGetManagedBy() {
        return managedBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetManagedBy(Supervisor newManagedBy, NotificationChain msgs) {
        Supervisor oldManagedBy = managedBy;
        managedBy = newManagedBy;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfexamplePackage.POSITION__MANAGED_BY, oldManagedBy, newManagedBy);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setManagedBy(Supervisor newManagedBy) {
        if (newManagedBy != managedBy) {
            NotificationChain msgs = null;
            if (managedBy != null)
                msgs = ((InternalEObject)managedBy).eInverseRemove(this, EmfexamplePackage.SUPERVISOR__MANAGES, Supervisor.class, msgs);
            if (newManagedBy != null)
                msgs = ((InternalEObject)newManagedBy).eInverseAdd(this, EmfexamplePackage.SUPERVISOR__MANAGES, Supervisor.class, msgs);
            msgs = basicSetManagedBy(newManagedBy, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EmfexamplePackage.POSITION__MANAGED_BY, newManagedBy, newManagedBy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EmfexamplePackage.POSITION__MANAGED_BY:
                if (managedBy != null)
                    msgs = ((InternalEObject)managedBy).eInverseRemove(this, EmfexamplePackage.SUPERVISOR__MANAGES, Supervisor.class, msgs);
                return basicSetManagedBy((Supervisor)otherEnd, msgs);
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
            case EmfexamplePackage.POSITION__MANAGED_BY:
                return basicSetManagedBy(null, msgs);
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
            case EmfexamplePackage.POSITION__LOCATION:
                if (resolve) return getLocation();
                return basicGetLocation();
            case EmfexamplePackage.POSITION__TITLE:
                return getTitle();
            case EmfexamplePackage.POSITION__PAY:
                return getPay();
            case EmfexamplePackage.POSITION__MANAGED_BY:
                if (resolve) return getManagedBy();
                return basicGetManagedBy();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case EmfexamplePackage.POSITION__LOCATION:
                setLocation((City)newValue);
                return;
            case EmfexamplePackage.POSITION__TITLE:
                setTitle((String)newValue);
                return;
            case EmfexamplePackage.POSITION__PAY:
                setPay((Double)newValue);
                return;
            case EmfexamplePackage.POSITION__MANAGED_BY:
                setManagedBy((Supervisor)newValue);
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
            case EmfexamplePackage.POSITION__LOCATION:
                setLocation((City)null);
                return;
            case EmfexamplePackage.POSITION__TITLE:
                setTitle(TITLE_EDEFAULT);
                return;
            case EmfexamplePackage.POSITION__PAY:
                setPay(PAY_EDEFAULT);
                return;
            case EmfexamplePackage.POSITION__MANAGED_BY:
                setManagedBy((Supervisor)null);
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
            case EmfexamplePackage.POSITION__LOCATION:
                return location != null;
            case EmfexamplePackage.POSITION__TITLE:
                return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
            case EmfexamplePackage.POSITION__PAY:
                return pay != PAY_EDEFAULT;
            case EmfexamplePackage.POSITION__MANAGED_BY:
                return managedBy != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (title: ");
        result.append(title);
        result.append(", pay: ");
        result.append(pay);
        result.append(')');
        return result.toString();
    }

} //PositionImpl
