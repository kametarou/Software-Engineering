/**
 */
package soft.mapping.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link soft.mapping.impl.MapImpl#getOpLogs <em>Op Logs</em>}</li>
 *   <li>{@link soft.mapping.impl.MapImpl#getCurrentLayer <em>Current Layer</em>}</li>
 *   <li>{@link soft.mapping.impl.MapImpl#getCells <em>Cells</em>}</li>
 *   <li>{@link soft.mapping.impl.MapImpl#getMaxLayer <em>Max Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapImpl extends MinimalEObjectImpl.Container implements Map {
	/**
	 * The cached value of the '{@link #getOpLogs() <em>Op Logs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpLogs()
	 * @generated
	 * @ordered
	 */
	protected Logs opLogs;

	/**
	 * The default value of the '{@link #getCurrentLayer() <em>Current Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLayer()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_LAYER_EDEFAULT = 0;

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
	 * The default value of the '{@link #getCells() <em>Cells</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCells()
	 * @generated
	 * @ordered
	 */
	protected static final Cell[][] CELLS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCells() <em>Cells</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCells()
	 * @generated
	 * @ordered
	 */
	protected Cell[][] cells = CELLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLayer() <em>Max Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLayer()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LAYER_EDEFAULT = 3;

	/**
	 * The cached value of the '{@link #getMaxLayer() <em>Max Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLayer()
	 * @generated
	 * @ordered
	 */
	protected int maxLayer = MAX_LAYER_EDEFAULT;

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
	public Logs getOpLogs() {
		if (opLogs != null && opLogs.eIsProxy()) {
			InternalEObject oldOpLogs = (InternalEObject)opLogs;
			opLogs = (Logs)eResolveProxy(oldOpLogs);
			if (opLogs != oldOpLogs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.MAP__OP_LOGS, oldOpLogs, opLogs));
			}
		}
		return opLogs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logs basicGetOpLogs() {
		return opLogs;
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
	public Cell[][] getCells() {
		return cells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCells(Cell[][] newCells) {
		Cell[][] oldCells = cells;
		cells = newCells;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAP__CELLS, oldCells, cells));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxLayer() {
		return maxLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLayer(int newMaxLayer) {
		int oldMaxLayer = maxLayer;
		maxLayer = newMaxLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAP__MAX_LAYER, oldMaxLayer, maxLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init(final int height, final int width) {
		cells = new Cell[width][height];
		
		for(int x=0; x < width; x++){
		  for(int y=0; y < height; y++){
		    CellImpl myCell = new CellImpl();
		    myCell.init(x,y);
		    cells[x][y] = myCell;
		  }
		}
		
		opLogs = new LogsImpl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean setLayer(final int layer) {
		if(layer < 0 || layer >= maxLayer){
		  return false;
		}
		
		currentLayer = layer;
		
		return currentLayer == layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.MAP__OP_LOGS:
				if (resolve) return getOpLogs();
				return basicGetOpLogs();
			case MappingPackage.MAP__CURRENT_LAYER:
				return getCurrentLayer();
			case MappingPackage.MAP__CELLS:
				return getCells();
			case MappingPackage.MAP__MAX_LAYER:
				return getMaxLayer();
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
			case MappingPackage.MAP__CURRENT_LAYER:
				setCurrentLayer((Integer)newValue);
				return;
			case MappingPackage.MAP__CELLS:
				setCells((Cell[][])newValue);
				return;
			case MappingPackage.MAP__MAX_LAYER:
				setMaxLayer((Integer)newValue);
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
				setCells(CELLS_EDEFAULT);
				return;
			case MappingPackage.MAP__MAX_LAYER:
				setMaxLayer(MAX_LAYER_EDEFAULT);
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
			case MappingPackage.MAP__OP_LOGS:
				return opLogs != null;
			case MappingPackage.MAP__CURRENT_LAYER:
				return currentLayer != CURRENT_LAYER_EDEFAULT;
			case MappingPackage.MAP__CELLS:
				return CELLS_EDEFAULT == null ? cells != null : !CELLS_EDEFAULT.equals(cells);
			case MappingPackage.MAP__MAX_LAYER:
				return maxLayer != MAX_LAYER_EDEFAULT;
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
		result.append(", cells: ");
		result.append(cells);
		result.append(", maxLayer: ");
		result.append(maxLayer);
		result.append(')');
		return result.toString();
	}

} //MapImpl
