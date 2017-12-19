/**
 */
package soft.mapping.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import soft.mapping.Cell;
import soft.mapping.Logs;
import soft.mapping.Map;
import soft.mapping.MappingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soft.mapping.impl.MapImpl#getGetLogs <em>Get Logs</em>}</li>
 *   <li>{@link soft.mapping.impl.MapImpl#getCurrentLayer <em>Current Layer</em>}</li>
 *   <li>{@link soft.mapping.impl.MapImpl#getCells <em>Cells</em>}</li>
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
	 * The default value of the '{@link #getCurrentLayer() <em>Current Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLayer()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_LAYER_EDEFAULT = 0; // TODO The default value literal "" is not valid.

	/**
	 * The cached value of the '{@link #getCurrentLayer() <em>Current Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLayer()
	 * @generated
	 * @ordered
	 */
	protected int currentLayer = CURRENT_LAYER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCells() <em>Cells</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCells()
	 * @generated
	 * @ordered
	 */
	protected EList<Cell> cells;

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
	public EList<Cell> getCells() {
		if (cells == null) {
			cells = new EObjectResolvingEList<Cell>(Cell.class, this, MappingPackage.MAP__CELLS);
		}
		return cells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentLayer() {
		return currentLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentLayer(int newCurrentLayer) {
		int oldCurrentLayer = currentLayer;
		currentLayer = newCurrentLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAP__CURRENT_LAYER, oldCurrentLayer, currentLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init(int height, int width) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean setLayer(int layer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case MappingPackage.MAP__CURRENT_LAYER:
				return getCurrentLayer();
			case MappingPackage.MAP__CELLS:
				return getCells();
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
			case MappingPackage.MAP__CURRENT_LAYER:
				setCurrentLayer((Integer)newValue);
				return;
			case MappingPackage.MAP__CELLS:
				getCells().clear();
				getCells().addAll((Collection<? extends Cell>)newValue);
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
			case MappingPackage.MAP__CURRENT_LAYER:
				setCurrentLayer(CURRENT_LAYER_EDEFAULT);
				return;
			case MappingPackage.MAP__CELLS:
				getCells().clear();
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
			case MappingPackage.MAP__GET_LOGS:
				return getLogs != null;
			case MappingPackage.MAP__CURRENT_LAYER:
				return currentLayer != CURRENT_LAYER_EDEFAULT;
			case MappingPackage.MAP__CELLS:
				return cells != null && !cells.isEmpty();
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
			case MappingPackage.MAP___INIT__INT_INT:
				init((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case MappingPackage.MAP___SET_LAYER__INT:
				return setLayer((Integer)arguments.get(0));
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
		result.append(" (currentLayer: ");
		result.append(currentLayer);
		result.append(')');
		return result.toString();
	}

} //MapImpl
