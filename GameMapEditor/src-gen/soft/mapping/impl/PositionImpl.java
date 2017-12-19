/**
 */
package soft.mapping.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import soft.mapping.Cell;
import soft.mapping.MappingPackage;
import soft.mapping.Position;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soft.mapping.impl.PositionImpl#getX <em>X</em>}</li>
 *   <li>{@link soft.mapping.impl.PositionImpl#getY <em>Y</em>}</li>
 *   <li>{@link soft.mapping.impl.PositionImpl#getMyCell <em>My Cell</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionImpl extends MinimalEObjectImpl.Container implements Position {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMyCell() <em>My Cell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyCell()
	 * @generated
	 * @ordered
	 */
	protected Cell myCell;

	/**
	 * This is true if the My Cell containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean myCellESet;

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
		return MappingPackage.Literals.POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.POSITION__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.POSITION__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell getMyCell() {
		return myCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMyCell(Cell newMyCell, NotificationChain msgs) {
		Cell oldMyCell = myCell;
		myCell = newMyCell;
		boolean oldMyCellESet = myCellESet;
		myCellESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingPackage.POSITION__MY_CELL, oldMyCell, newMyCell, !oldMyCellESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyCell(Cell newMyCell) {
		if (newMyCell != myCell) {
			NotificationChain msgs = null;
			if (myCell != null)
				msgs = ((InternalEObject)myCell).eInverseRemove(this, MappingPackage.CELL__POSITION, Cell.class, msgs);
			if (newMyCell != null)
				msgs = ((InternalEObject)newMyCell).eInverseAdd(this, MappingPackage.CELL__POSITION, Cell.class, msgs);
			msgs = basicSetMyCell(newMyCell, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMyCellESet = myCellESet;
			myCellESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.POSITION__MY_CELL, newMyCell, newMyCell, !oldMyCellESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetMyCell(NotificationChain msgs) {
		Cell oldMyCell = myCell;
		myCell = null;
		boolean oldMyCellESet = myCellESet;
		myCellESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, MappingPackage.POSITION__MY_CELL, oldMyCell, null, oldMyCellESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMyCell() {
		if (myCell != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)myCell).eInverseRemove(this, MappingPackage.CELL__POSITION, Cell.class, msgs);
			msgs = basicUnsetMyCell(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMyCellESet = myCellESet;
			myCellESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, MappingPackage.POSITION__MY_CELL, null, null, oldMyCellESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMyCell() {
		return myCellESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.POSITION__MY_CELL:
				if (myCell != null)
					msgs = ((InternalEObject)myCell).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingPackage.POSITION__MY_CELL, null, msgs);
				return basicSetMyCell((Cell)otherEnd, msgs);
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
			case MappingPackage.POSITION__MY_CELL:
				return basicUnsetMyCell(msgs);
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
			case MappingPackage.POSITION__X:
				return getX();
			case MappingPackage.POSITION__Y:
				return getY();
			case MappingPackage.POSITION__MY_CELL:
				return getMyCell();
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
			case MappingPackage.POSITION__X:
				setX((Integer)newValue);
				return;
			case MappingPackage.POSITION__Y:
				setY((Integer)newValue);
				return;
			case MappingPackage.POSITION__MY_CELL:
				setMyCell((Cell)newValue);
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
			case MappingPackage.POSITION__X:
				setX(X_EDEFAULT);
				return;
			case MappingPackage.POSITION__Y:
				setY(Y_EDEFAULT);
				return;
			case MappingPackage.POSITION__MY_CELL:
				unsetMyCell();
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
			case MappingPackage.POSITION__X:
				return x != X_EDEFAULT;
			case MappingPackage.POSITION__Y:
				return y != Y_EDEFAULT;
			case MappingPackage.POSITION__MY_CELL:
				return isSetMyCell();
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //PositionImpl
