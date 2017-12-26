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

import soft.mapping.Asset;
import soft.mapping.Cell;
import soft.mapping.Logs;
import soft.mapping.Map;
import soft.mapping.MappingPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Map</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soft.mapping.impl.MapImpl#getMyLogs <em>My Logs</em>}</li>
 *   <li>{@link soft.mapping.impl.MapImpl#getCurrentLayer <em>Current Layer</em>}</li>
 *   <li>{@link soft.mapping.impl.MapImpl#getCells <em>Cells</em>}</li>
 *   <li>{@link soft.mapping.impl.MapImpl#getMaxLayer <em>Max Layer</em>}</li>
 *   <li>{@link soft.mapping.impl.MapImpl#getAssetsSet <em>Assets Set</em>}</li>
 *   <li>{@link soft.mapping.impl.MapImpl#getMapheight <em>Mapheight</em>}</li>
 *   <li>{@link soft.mapping.impl.MapImpl#getMapwidth <em>Mapwidth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapImpl extends MinimalEObjectImpl.Container implements Map {
	/**
	 * The cached value of the '{@link #getMyLogs() <em>My Logs</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMyLogs()
	 * @generated
	 * @ordered
	 */
	protected Logs myLogs;

	/**
	 * The default value of the '{@link #getCurrentLayer() <em>Current Layer</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCurrentLayer()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_LAYER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentLayer() <em>Current Layer</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCurrentLayer()
	 * @generated
	 * @ordered
	 */
	protected int currentLayer = CURRENT_LAYER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCells() <em>Cells</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCells()
	 * @generated
	 * @ordered
	 */
	protected static final Cell[][][] CELLS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCells() <em>Cells</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCells()
	 * @generated
	 * @ordered
	 */
	protected Cell[][][] cells = CELLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLayer() <em>Max Layer</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxLayer()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LAYER_EDEFAULT = 3;

	/**
	 * The cached value of the '{@link #getMaxLayer() <em>Max Layer</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxLayer()
	 * @generated
	 * @ordered
	 */
	protected int maxLayer = MAX_LAYER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssetsSet() <em>Assets Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetsSet()
	 * @generated
	 * @ordered
	 */
	protected static final Asset[] ASSETS_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssetsSet() <em>Assets Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetsSet()
	 * @generated
	 * @ordered
	 */
	protected Asset[] assetsSet = ASSETS_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapheight() <em>Mapheight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapheight()
	 * @generated
	 * @ordered
	 */
	protected static final int MAPHEIGHT_EDEFAULT = 20;

	/**
	 * The cached value of the '{@link #getMapheight() <em>Mapheight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapheight()
	 * @generated
	 * @ordered
	 */
	protected int mapheight = MAPHEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapwidth() <em>Mapwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapwidth()
	 * @generated
	 * @ordered
	 */
	protected static final int MAPWIDTH_EDEFAULT = 20;

	/**
	 * The cached value of the '{@link #getMapwidth() <em>Mapwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapwidth()
	 * @generated
	 * @ordered
	 */
	protected int mapwidth = MAPWIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.MAP;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Logs getMyLogs() {
		if (myLogs != null && myLogs.eIsProxy()) {
			InternalEObject oldMyLogs = (InternalEObject)myLogs;
			myLogs = (Logs)eResolveProxy(oldMyLogs);
			if (myLogs != oldMyLogs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.MAP__MY_LOGS, oldMyLogs, myLogs));
			}
		}
		return myLogs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Logs basicGetMyLogs() {
		return myLogs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentLayer() {
		return currentLayer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentLayer(int newCurrentLayer) {
		int oldCurrentLayer = currentLayer;
		currentLayer = newCurrentLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAP__CURRENT_LAYER, oldCurrentLayer, currentLayer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Cell[][][] getCells() {
		return cells;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCells(Cell[][][] newCells) {
		Cell[][][] oldCells = cells;
		cells = newCells;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAP__CELLS, oldCells, cells));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxLayer() {
		return maxLayer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	public Asset[] getAssetsSet() {
		return assetsSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetsSet(Asset[] newAssetsSet) {
		Asset[] oldAssetsSet = assetsSet;
		assetsSet = newAssetsSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAP__ASSETS_SET, oldAssetsSet, assetsSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMapheight() {
		return mapheight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapheight(int newMapheight) {
		int oldMapheight = mapheight;
		mapheight = newMapheight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAP__MAPHEIGHT, oldMapheight, mapheight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMapwidth() {
		return mapwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapwidth(int newMapwidth) {
		int oldMapwidth = mapwidth;
		mapwidth = newMapwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAP__MAPWIDTH, oldMapwidth, mapwidth));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void init(final int height, final int width) {
			cells = new Cell[width][height][3];
		
				for (int x = 0; x < width; x++) {
					for (int y = 0; y < height; y++) {
						for (int z = 0; z < 3; z++) {
							CellImpl myCell = new CellImpl();
							myCell.init(x, y);
							cells[x][y][z] = myCell;
						}
					}
				}
		
				myLogs = new LogsImpl();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Cell getCellFromCurrentLayer(int x, int y) {
		return cells[currentLayer][x][y];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell getCellFromSpecifiedLayer(int x, int y, int layer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.MAP__MY_LOGS:
				if (resolve) return getMyLogs();
				return basicGetMyLogs();
			case MappingPackage.MAP__CURRENT_LAYER:
				return getCurrentLayer();
			case MappingPackage.MAP__CELLS:
				return getCells();
			case MappingPackage.MAP__MAX_LAYER:
				return getMaxLayer();
			case MappingPackage.MAP__ASSETS_SET:
				return getAssetsSet();
			case MappingPackage.MAP__MAPHEIGHT:
				return getMapheight();
			case MappingPackage.MAP__MAPWIDTH:
				return getMapwidth();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MappingPackage.MAP__CURRENT_LAYER:
				setCurrentLayer((Integer)newValue);
				return;
			case MappingPackage.MAP__CELLS:
				setCells((Cell[][][])newValue);
				return;
			case MappingPackage.MAP__MAX_LAYER:
				setMaxLayer((Integer)newValue);
				return;
			case MappingPackage.MAP__ASSETS_SET:
				setAssetsSet((Asset[])newValue);
				return;
			case MappingPackage.MAP__MAPHEIGHT:
				setMapheight((Integer)newValue);
				return;
			case MappingPackage.MAP__MAPWIDTH:
				setMapwidth((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
			case MappingPackage.MAP__ASSETS_SET:
				setAssetsSet(ASSETS_SET_EDEFAULT);
				return;
			case MappingPackage.MAP__MAPHEIGHT:
				setMapheight(MAPHEIGHT_EDEFAULT);
				return;
			case MappingPackage.MAP__MAPWIDTH:
				setMapwidth(MAPWIDTH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MappingPackage.MAP__MY_LOGS:
				return myLogs != null;
			case MappingPackage.MAP__CURRENT_LAYER:
				return currentLayer != CURRENT_LAYER_EDEFAULT;
			case MappingPackage.MAP__CELLS:
				return CELLS_EDEFAULT == null ? cells != null : !CELLS_EDEFAULT.equals(cells);
			case MappingPackage.MAP__MAX_LAYER:
				return maxLayer != MAX_LAYER_EDEFAULT;
			case MappingPackage.MAP__ASSETS_SET:
				return ASSETS_SET_EDEFAULT == null ? assetsSet != null : !ASSETS_SET_EDEFAULT.equals(assetsSet);
			case MappingPackage.MAP__MAPHEIGHT:
				return mapheight != MAPHEIGHT_EDEFAULT;
			case MappingPackage.MAP__MAPWIDTH:
				return mapwidth != MAPWIDTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MappingPackage.MAP___INIT__INT_INT:
				init((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case MappingPackage.MAP___GET_CELL_FROM_CURRENT_LAYER__INT_INT:
				return getCellFromCurrentLayer((Integer)arguments.get(0), (Integer)arguments.get(1));
			case MappingPackage.MAP___GET_CELL_FROM_SPECIFIED_LAYER__INT_INT_INT:
				return getCellFromSpecifiedLayer((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		result.append(", assetsSet: ");
		result.append(assetsSet);
		result.append(", mapheight: ");
		result.append(mapheight);
		result.append(", mapwidth: ");
		result.append(mapwidth);
		result.append(')');
		return result.toString();
	}

} // MapImpl
