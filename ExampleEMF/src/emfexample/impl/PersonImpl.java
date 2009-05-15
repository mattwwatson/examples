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
import emfexample.Person;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emfexample.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link emfexample.impl.PersonImpl#getLivesIn <em>Lives In</em>}</li>
 *   <li>{@link emfexample.impl.PersonImpl#getEmail <em>Email</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getLivesIn() <em>Lives In</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLivesIn()
     * @generated
     * @ordered
     */
    protected City livesIn;

    /**
     * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmail()
     * @generated
     * @ordered
     */
    protected static final String EMAIL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmail()
     * @generated
     * @ordered
     */
    protected String email = EMAIL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PersonImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EmfexamplePackage.Literals.PERSON;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EmfexamplePackage.PERSON__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public City getLivesIn() {
        if (livesIn != null && livesIn.eIsProxy()) {
            InternalEObject oldLivesIn = (InternalEObject)livesIn;
            livesIn = (City)eResolveProxy(oldLivesIn);
            if (livesIn != oldLivesIn) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfexamplePackage.PERSON__LIVES_IN, oldLivesIn, livesIn));
            }
        }
        return livesIn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public City basicGetLivesIn() {
        return livesIn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLivesIn(City newLivesIn, NotificationChain msgs) {
        City oldLivesIn = livesIn;
        livesIn = newLivesIn;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfexamplePackage.PERSON__LIVES_IN, oldLivesIn, newLivesIn);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLivesIn(City newLivesIn) {
        if (newLivesIn != livesIn) {
            NotificationChain msgs = null;
            if (livesIn != null)
                msgs = ((InternalEObject)livesIn).eInverseRemove(this, EmfexamplePackage.CITY__PEOPLE, City.class, msgs);
            if (newLivesIn != null)
                msgs = ((InternalEObject)newLivesIn).eInverseAdd(this, EmfexamplePackage.CITY__PEOPLE, City.class, msgs);
            msgs = basicSetLivesIn(newLivesIn, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EmfexamplePackage.PERSON__LIVES_IN, newLivesIn, newLivesIn));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEmail(String newEmail) {
        String oldEmail = email;
        email = newEmail;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EmfexamplePackage.PERSON__EMAIL, oldEmail, email));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EmfexamplePackage.PERSON__LIVES_IN:
                if (livesIn != null)
                    msgs = ((InternalEObject)livesIn).eInverseRemove(this, EmfexamplePackage.CITY__PEOPLE, City.class, msgs);
                return basicSetLivesIn((City)otherEnd, msgs);
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
            case EmfexamplePackage.PERSON__LIVES_IN:
                return basicSetLivesIn(null, msgs);
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
            case EmfexamplePackage.PERSON__NAME:
                return getName();
            case EmfexamplePackage.PERSON__LIVES_IN:
                if (resolve) return getLivesIn();
                return basicGetLivesIn();
            case EmfexamplePackage.PERSON__EMAIL:
                return getEmail();
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
            case EmfexamplePackage.PERSON__NAME:
                setName((String)newValue);
                return;
            case EmfexamplePackage.PERSON__LIVES_IN:
                setLivesIn((City)newValue);
                return;
            case EmfexamplePackage.PERSON__EMAIL:
                setEmail((String)newValue);
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
            case EmfexamplePackage.PERSON__NAME:
                setName(NAME_EDEFAULT);
                return;
            case EmfexamplePackage.PERSON__LIVES_IN:
                setLivesIn((City)null);
                return;
            case EmfexamplePackage.PERSON__EMAIL:
                setEmail(EMAIL_EDEFAULT);
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
            case EmfexamplePackage.PERSON__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case EmfexamplePackage.PERSON__LIVES_IN:
                return livesIn != null;
            case EmfexamplePackage.PERSON__EMAIL:
                return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
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
        result.append(" (name: ");
        result.append(name);
        result.append(", email: ");
        result.append(email);
        result.append(')');
        return result.toString();
    }

} //PersonImpl
