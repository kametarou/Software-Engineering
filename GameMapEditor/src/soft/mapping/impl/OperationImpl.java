/**
 */
package soft.mapping.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import soft.mapping.AreaVector;
import soft.mapping.Map;
import soft.mapping.MappingPackage;
import soft.mapping.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soft.mapping.impl.OperationImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link soft.mapping.impl.OperationImpl#getArea <em>Area</em>}</li>
 *   <li>{@link soft.mapping.impl.OperationImpl#getBeforeMap <em>Before Map</em>}</li>
 *   <li>{@link soft.mapping.impl.OperationImpl#getAfterMap <em>After Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends MinimalEObjectImpl.Container implements Operation {
	/**
	 * The default value of the '{@link #getLayer() <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer()
	 * @generated
	 * @ordered
	 */
	protected static final int LAYER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLayer() <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer()
	 * @generated
	 * @ordered
	 */
	protected int layer = LAYER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected AreaVector area;

	/**
	 * The cached value of the '{@link #getBeforeMap() <em>Before Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeMap()
	 * @generated
	 * @ordered
	 */
	protected Map beforeMap;

	/**
	 * The cached value of the '{@link #getAfterMap() <em>After Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterMap()
	 * @generated
	 * @ordered
	 */
	protected Map afterMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLayer() {
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayer(int newLayer) {
		int oldLayer = layer;
		layer = newLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.OPERATION__LAYER, oldLayer, layer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaVector getArea() {
		if (area != null && area.eIsProxy()) {
			InternalEObject oldArea = (InternalEObject)area;
			area = (AreaVector)eResolveProxy(oldArea);
			if (area != oldArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.OPERATION__AREA, oldArea, area));
			}
		}
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaVector basicGetArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArea(AreaVector newArea) {
		AreaVector oldArea = area;
		area = newArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.OPERATION__AREA, oldArea, area));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getBeforeMap() {
		if (beforeMap != null && beforeMap.eIsProxy()) {
			InternalEObject oldBeforeMap = (InternalEObject)beforeMap;
			beforeMap = (Map)eResolveProxy(oldBeforeMap);
			if (beforeMap != oldBeforeMap) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.OPERATION__BEFORE_MAP, oldBeforeMap, beforeMap));
			}
		}
		return beforeMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map basicGetBeforeMap() {
		return beforeMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeMap(Map newBeforeMap) {
		Map oldBeforeMap = beforeMap;
		beforeMap = newBeforeMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.OPERATION__BEFORE_MAP, oldBeforeMap, beforeMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getAfterMap() {
		if (afterMap != null && afterMap.eIsProxy()) {
			InternalEObject oldAfterMap = (InternalEObject)afterMap;
			afterMap = (Map)eResolveProxy(oldAfterMap);
			if (afterMap != oldAfterMap) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.OPERATION__AFTER_MAP, oldAfterMap, afterMap));
			}
		}
		return afterMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map basicGetAfterMap() {
		return afterMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterMap(Map newAfterMap) {
		Map oldAfterMap = afterMap;
		afterMap = newAfterMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.OPERATION__AFTER_MAP, oldAfterMap, afterMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.OPERATION__LAYER:
				return getLayer();
			case MappingPackage.OPERATION__AREA:
				if (resolve) return getArea();
				return basicGetArea();
			case MappingPackage.OPERATION__BEFORE_MAP:
				if (resolve) return getBeforeMap();
				return basicGetBeforeMap();
			case MappingPackage.OPERATION__AFTER_MAP:
				if (resolve) return getAfterMap();
				return basicGetAfterMap();
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
			case MappingPackage.OPERATION__LAYER:
				setLayer((Integer)newValue);
				return;
			case MappingPackage.OPERATION__AREA:
				setArea((AreaVector)newValue);
				return;
			case MappingPackage.OPERATION__BEFORE_MAP:
				setBeforeMap((Map)newValue);
				return;
			case MappingPackage.OPERATION__AFTER_MAP:
				setAfterMap((Map)newValue);
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
			case MappingPackage.OPERATION__LAYER:
				setLayer(LAYER_EDEFAULT);
				return;
			case MappingPackage.OPERATION__AREA:
				setArea((AreaVector)null);
				return;
			case MappingPackage.OPERATION__BEFORE_MAP:
				setBeforeMap((Map)null);
				return;
			case MappingPackage.OPERATION__AFTER_MAP:
				setAfterMap((Map)null);
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
			case MappingPackage.OPERATION__LAYER:
				return layer != LAYER_EDEFAULT;
			case MappingPackage.OPERATION__AREA:
				return area != null;
			case MappingPackage.OPERATION__BEFORE_MAP:
				return beforeMap != null;
			case MappingPackage.OPERATION__AFTER_MAP:
				return afterMap != null;
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
		result.append(" (layer: ");
		result.append(layer);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
