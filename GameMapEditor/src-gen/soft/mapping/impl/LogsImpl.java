/**
 */
package soft.mapping.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import soft.mapping.Logs;
import soft.mapping.Map;
import soft.mapping.MappingPackage;
import soft.mapping.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soft.mapping.impl.LogsImpl#getMaps <em>Maps</em>}</li>
 *   <li>{@link soft.mapping.impl.LogsImpl#getCurrent <em>Current</em>}</li>
 *   <li>{@link soft.mapping.impl.LogsImpl#getLogdata <em>Logdata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogsImpl extends MinimalEObjectImpl.Container implements Logs {
	/**
	 * The cached value of the '{@link #getMaps() <em>Maps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaps()
	 * @generated
	 * @ordered
	 */
	protected EList<Map> maps;

	/**
	 * The default value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected int current = CURRENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogdata() <em>Logdata</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogdata()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> logdata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.LOGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Map> getMaps() {
		if (maps == null) {
			maps = new EObjectContainmentEList<Map>(Map.class, this, MappingPackage.LOGS__MAPS);
		}
		return maps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrent() {
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent(int newCurrent) {
		int oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.LOGS__CURRENT, oldCurrent, current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getLogdata() {
		if (logdata == null) {
			logdata = new EObjectResolvingEList<Operation>(Operation.class, this, MappingPackage.LOGS__LOGDATA);
		}
		return logdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean undo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean redo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removelog() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addlog(Operation op) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void init() {
		this.current = 0;
		this.maps = null;
		this.logdata = null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.LOGS__MAPS:
				return ((InternalEList<?>)getMaps()).basicRemove(otherEnd, msgs);
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
			case MappingPackage.LOGS__MAPS:
				return getMaps();
			case MappingPackage.LOGS__CURRENT:
				return getCurrent();
			case MappingPackage.LOGS__LOGDATA:
				return getLogdata();
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
			case MappingPackage.LOGS__MAPS:
				getMaps().clear();
				getMaps().addAll((Collection<? extends Map>)newValue);
				return;
			case MappingPackage.LOGS__CURRENT:
				setCurrent((Integer)newValue);
				return;
			case MappingPackage.LOGS__LOGDATA:
				getLogdata().clear();
				getLogdata().addAll((Collection<? extends Operation>)newValue);
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
			case MappingPackage.LOGS__MAPS:
				getMaps().clear();
				return;
			case MappingPackage.LOGS__CURRENT:
				setCurrent(CURRENT_EDEFAULT);
				return;
			case MappingPackage.LOGS__LOGDATA:
				getLogdata().clear();
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
			case MappingPackage.LOGS__MAPS:
				return maps != null && !maps.isEmpty();
			case MappingPackage.LOGS__CURRENT:
				return current != CURRENT_EDEFAULT;
			case MappingPackage.LOGS__LOGDATA:
				return logdata != null && !logdata.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MappingPackage.LOGS___UNDO:
				return undo();
			case MappingPackage.LOGS___REDO:
				return redo();
			case MappingPackage.LOGS___REMOVELOG:
				removelog();
				return null;
			case MappingPackage.LOGS___ADDLOG__OPERATION:
				addlog((Operation)arguments.get(0));
				return null;
			case MappingPackage.LOGS___INIT:
				init();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (current: ");
		result.append(current);
		result.append(')');
		return result.toString();
	}

} //LogsImpl
