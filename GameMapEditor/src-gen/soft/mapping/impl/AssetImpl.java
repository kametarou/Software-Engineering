/**
 */
package soft.mapping.impl;

import java.awt.Graphics2D;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import soft.mapping.Asset;
import soft.mapping.MappingFactory;
import soft.mapping.MappingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soft.mapping.impl.AssetImpl#getMyGraphics2d <em>My Graphics2d</em>}</li>
 *   <li>{@link soft.mapping.impl.AssetImpl#getX <em>X</em>}</li>
 *   <li>{@link soft.mapping.impl.AssetImpl#getY <em>Y</em>}</li>
 *   <li>{@link soft.mapping.impl.AssetImpl#getAssetId <em>Asset Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssetImpl extends MinimalEObjectImpl.Container implements Asset {
	/**
	 * The default value of the '{@link #getMyGraphics2d() <em>My Graphics2d</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyGraphics2d()
	 * @generated
	 * @ordered
	 */
	protected static final Graphics2D MY_GRAPHICS2D_EDEFAULT = (Graphics2D)MappingFactory.eINSTANCE.createFromString(MappingPackage.eINSTANCE.getGraphics2D(), "");

	/**
	 * The cached value of the '{@link #getMyGraphics2d() <em>My Graphics2d</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyGraphics2d()
	 * @generated
	 * @ordered
	 */
	protected Graphics2D myGraphics2d = MY_GRAPHICS2D_EDEFAULT;

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
	 * The default value of the '{@link #getAssetId() <em>Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetId()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssetId() <em>Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetId()
	 * @generated
	 * @ordered
	 */
	protected String assetId = ASSET_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graphics2D getMyGraphics2d() {
		return myGraphics2d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyGraphics2d(Graphics2D newMyGraphics2d) {
		Graphics2D oldMyGraphics2d = myGraphics2d;
		myGraphics2d = newMyGraphics2d;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.ASSET__MY_GRAPHICS2D, oldMyGraphics2d, myGraphics2d));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.ASSET__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.ASSET__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssetId() {
		return assetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetId(String newAssetId) {
		String oldAssetId = assetId;
		assetId = newAssetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.ASSET__ASSET_ID, oldAssetId, assetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init() {
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
			case MappingPackage.ASSET__MY_GRAPHICS2D:
				return getMyGraphics2d();
			case MappingPackage.ASSET__X:
				return getX();
			case MappingPackage.ASSET__Y:
				return getY();
			case MappingPackage.ASSET__ASSET_ID:
				return getAssetId();
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
			case MappingPackage.ASSET__MY_GRAPHICS2D:
				setMyGraphics2d((Graphics2D)newValue);
				return;
			case MappingPackage.ASSET__X:
				setX((Integer)newValue);
				return;
			case MappingPackage.ASSET__Y:
				setY((Integer)newValue);
				return;
			case MappingPackage.ASSET__ASSET_ID:
				setAssetId((String)newValue);
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
			case MappingPackage.ASSET__MY_GRAPHICS2D:
				setMyGraphics2d(MY_GRAPHICS2D_EDEFAULT);
				return;
			case MappingPackage.ASSET__X:
				setX(X_EDEFAULT);
				return;
			case MappingPackage.ASSET__Y:
				setY(Y_EDEFAULT);
				return;
			case MappingPackage.ASSET__ASSET_ID:
				setAssetId(ASSET_ID_EDEFAULT);
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
			case MappingPackage.ASSET__MY_GRAPHICS2D:
				return MY_GRAPHICS2D_EDEFAULT == null ? myGraphics2d != null : !MY_GRAPHICS2D_EDEFAULT.equals(myGraphics2d);
			case MappingPackage.ASSET__X:
				return x != X_EDEFAULT;
			case MappingPackage.ASSET__Y:
				return y != Y_EDEFAULT;
			case MappingPackage.ASSET__ASSET_ID:
				return ASSET_ID_EDEFAULT == null ? assetId != null : !ASSET_ID_EDEFAULT.equals(assetId);
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
			case MappingPackage.ASSET___INIT:
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
		result.append(" (myGraphics2d: ");
		result.append(myGraphics2d);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", assetId: ");
		result.append(assetId);
		result.append(')');
		return result.toString();
	}

} //AssetImpl
