/**
 */
package soft.mapping.impl;

import java.awt.Color;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import soft.mapping.AreaVector;
import soft.mapping.Asset;
import soft.mapping.Cell;
import soft.mapping.MappingPackage;
import soft.mapping.Position;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soft.mapping.impl.CellImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link soft.mapping.impl.CellImpl#getMyAsset <em>My Asset</em>}</li>
 *   <li>{@link soft.mapping.impl.CellImpl#getMyAssetArea <em>My Asset Area</em>}</li>
 *   <li>{@link soft.mapping.impl.CellImpl#getReferenceCell <em>Reference Cell</em>}</li>
 *   <li>{@link soft.mapping.impl.CellImpl#getCellColor <em>Cell Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellImpl extends MinimalEObjectImpl.Container implements Cell {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getMyAsset() <em>My Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset myAsset;
	/**
	 * The cached value of the '{@link #getMyAssetArea() <em>My Asset Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyAssetArea()
	 * @generated
	 * @ordered
	 */
	protected AreaVector myAssetArea;
	/**
	 * The cached value of the '{@link #getReferenceCell() <em>Reference Cell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceCell()
	 * @generated
	 * @ordered
	 */
	protected Cell referenceCell;

	/**
	 * The default value of the '{@link #getCellColor() <em>Cell Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellColor()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Color CELL_COLOR_EDEFAULT = Color.WHITE;

	/**
	 * The cached value of the '{@link #getCellColor() <em>Cell Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellColor()
	 * @generated
	 * @ordered
	 */
	protected Color cellColor = CELL_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		if (eContainerFeatureID() != MappingPackage.CELL__POSITION) return null;
		return (Position)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Position newPosition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPosition, MappingPackage.CELL__POSITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		if (newPosition != eInternalContainer() || (eContainerFeatureID() != MappingPackage.CELL__POSITION && newPosition != null)) {
			if (EcoreUtil.isAncestor(this, newPosition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, MappingPackage.POSITION__MY_CELL, Position.class, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.CELL__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset getMyAsset() {
		if (myAsset != null && myAsset.eIsProxy()) {
			InternalEObject oldMyAsset = (InternalEObject)myAsset;
			myAsset = (Asset)eResolveProxy(oldMyAsset);
			if (myAsset != oldMyAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.CELL__MY_ASSET, oldMyAsset, myAsset));
			}
		}
		return myAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetMyAsset() {
		return myAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyAsset(Asset newMyAsset) {
		Asset oldMyAsset = myAsset;
		myAsset = newMyAsset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.CELL__MY_ASSET, oldMyAsset, myAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaVector getMyAssetArea() {
		if (myAssetArea != null && myAssetArea.eIsProxy()) {
			InternalEObject oldMyAssetArea = (InternalEObject)myAssetArea;
			myAssetArea = (AreaVector)eResolveProxy(oldMyAssetArea);
			if (myAssetArea != oldMyAssetArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.CELL__MY_ASSET_AREA, oldMyAssetArea, myAssetArea));
			}
		}
		return myAssetArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaVector basicGetMyAssetArea() {
		return myAssetArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyAssetArea(AreaVector newMyAssetArea) {
		AreaVector oldMyAssetArea = myAssetArea;
		myAssetArea = newMyAssetArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.CELL__MY_ASSET_AREA, oldMyAssetArea, myAssetArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell getReferenceCell() {
		if (referenceCell != null && referenceCell.eIsProxy()) {
			InternalEObject oldReferenceCell = (InternalEObject)referenceCell;
			referenceCell = (Cell)eResolveProxy(oldReferenceCell);
			if (referenceCell != oldReferenceCell) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.CELL__REFERENCE_CELL, oldReferenceCell, referenceCell));
			}
		}
		return referenceCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell basicGetReferenceCell() {
		return referenceCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceCell(Cell newReferenceCell) {
		Cell oldReferenceCell = referenceCell;
		referenceCell = newReferenceCell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.CELL__REFERENCE_CELL, oldReferenceCell, referenceCell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getCellColor() {
		return cellColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellColor(Color newCellColor) {
		Color oldCellColor = cellColor;
		cellColor = newCellColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.CELL__CELL_COLOR, oldCellColor, cellColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init(final int x, final int y) {
		Position myPos = new PositionImpl();
		
		myPos.setX(x);
		myPos.setY(y);
		myPos.setMyCell(this);
		
		this.setPosition(myPos);
		
		myAsset = null;
		myAssetArea = null;
		referenceCell = null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		Position myPos = getPosition();
				return "Cell ("+myPos.getX()+","+myPos.getY()+")";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.CELL__POSITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPosition((Position)otherEnd, msgs);
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
			case MappingPackage.CELL__POSITION:
				return basicSetPosition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MappingPackage.CELL__POSITION:
				return eInternalContainer().eInverseRemove(this, MappingPackage.POSITION__MY_CELL, Position.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.CELL__POSITION:
				return getPosition();
			case MappingPackage.CELL__MY_ASSET:
				if (resolve) return getMyAsset();
				return basicGetMyAsset();
			case MappingPackage.CELL__MY_ASSET_AREA:
				if (resolve) return getMyAssetArea();
				return basicGetMyAssetArea();
			case MappingPackage.CELL__REFERENCE_CELL:
				if (resolve) return getReferenceCell();
				return basicGetReferenceCell();
			case MappingPackage.CELL__CELL_COLOR:
				return getCellColor();
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
			case MappingPackage.CELL__POSITION:
				setPosition((Position)newValue);
				return;
			case MappingPackage.CELL__MY_ASSET:
				setMyAsset((Asset)newValue);
				return;
			case MappingPackage.CELL__MY_ASSET_AREA:
				setMyAssetArea((AreaVector)newValue);
				return;
			case MappingPackage.CELL__REFERENCE_CELL:
				setReferenceCell((Cell)newValue);
				return;
			case MappingPackage.CELL__CELL_COLOR:
				setCellColor((Color)newValue);
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
			case MappingPackage.CELL__POSITION:
				setPosition((Position)null);
				return;
			case MappingPackage.CELL__MY_ASSET:
				setMyAsset((Asset)null);
				return;
			case MappingPackage.CELL__MY_ASSET_AREA:
				setMyAssetArea((AreaVector)null);
				return;
			case MappingPackage.CELL__REFERENCE_CELL:
				setReferenceCell((Cell)null);
				return;
			case MappingPackage.CELL__CELL_COLOR:
				setCellColor(CELL_COLOR_EDEFAULT);
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
			case MappingPackage.CELL__POSITION:
				return getPosition() != null;
			case MappingPackage.CELL__MY_ASSET:
				return myAsset != null;
			case MappingPackage.CELL__MY_ASSET_AREA:
				return myAssetArea != null;
			case MappingPackage.CELL__REFERENCE_CELL:
				return referenceCell != null;
			case MappingPackage.CELL__CELL_COLOR:
				return CELL_COLOR_EDEFAULT == null ? cellColor != null : !CELL_COLOR_EDEFAULT.equals(cellColor);
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
			case MappingPackage.CELL___INIT__INT_INT:
				init((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case MappingPackage.CELL___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CellImpl
