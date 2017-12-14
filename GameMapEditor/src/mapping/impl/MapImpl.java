/**
 */
package mapping.impl;

import mapping.Logs;
import mapping.Map;
import mapping.MappingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mapping.impl.MapImpl#getGetLogs <em>Get Logs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapImpl extends MinimalEObjectImpl.Container implements Map {
	/**
	 * The cached value of the '{@link #getGetLogs() <em>Get Logs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetLogs()
	 * @generated
	 * @ordered
	 */
	protected Logs getLogs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logs getGetLogs() {
		if (getLogs != null && getLogs.eIsProxy()) {
			InternalEObject oldGetLogs = (InternalEObject)getLogs;
			getLogs = (Logs)eResolveProxy(oldGetLogs);
			if (getLogs != oldGetLogs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.MAP__GET_LOGS, oldGetLogs, getLogs));
			}
		}
		return getLogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logs basicGetGetLogs() {
		return getLogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.MAP__GET_LOGS:
				if (resolve) return getGetLogs();
				return basicGetGetLogs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MappingPackage.MAP__GET_LOGS:
				return getLogs != null;
		}
		return super.eIsSet(featureID);
	}

} //MapImpl
