/**
 */
package soft.mapping.impl;

import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import soft.graphics.GraphicsFactory;
import soft.graphics.GraphicsPackage;
import soft.mapping.Asset;
import soft.mapping.MappingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soft.mapping.impl.AssetImpl#getMyBufferedImage <em>My Buffered Image</em>}</li>
 *   <li>{@link soft.mapping.impl.AssetImpl#getX <em>X</em>}</li>
 *   <li>{@link soft.mapping.impl.AssetImpl#getY <em>Y</em>}</li>
 *   <li>{@link soft.mapping.impl.AssetImpl#getAssetId <em>Asset Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssetImpl extends MinimalEObjectImpl.Container implements Asset {
	/**
	 * The default value of the '{@link #getMyBufferedImage() <em>My Buffered Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyBufferedImage()
	 * @generated NOT
	 * @ordered
	 */
	protected static final BufferedImage MY_BUFFERED_IMAGE_EDEFAULT = (BufferedImage)GraphicsFactory.eINSTANCE.createFromString(GraphicsPackage.eINSTANCE.getBufferedImage(), "");
//	protected static final BufferedImage MY_BUFFERED_IMAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMyBufferedImage() <em>My Buffered Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyBufferedImage()
	 * @generated
	 * @ordered
	 */
	protected BufferedImage myBufferedImage = MY_BUFFERED_IMAGE_EDEFAULT;

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
	public BufferedImage getMyBufferedImage() {
		return myBufferedImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyBufferedImage(BufferedImage newMyBufferedImage) {
		BufferedImage oldMyBufferedImage = myBufferedImage;
		myBufferedImage = newMyBufferedImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.ASSET__MY_BUFFERED_IMAGE, oldMyBufferedImage, myBufferedImage));
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
	 * @generated NOT
	 */
	public void init() {
		// TODO: set constant value
		this.myBufferedImage = null;
		this.x = -1;
		this.y = -1;
		this.assetId = null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.ASSET__MY_BUFFERED_IMAGE:
				return getMyBufferedImage();
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
			case MappingPackage.ASSET__MY_BUFFERED_IMAGE:
				setMyBufferedImage((BufferedImage)newValue);
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
			case MappingPackage.ASSET__MY_BUFFERED_IMAGE:
				setMyBufferedImage(MY_BUFFERED_IMAGE_EDEFAULT);
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
			case MappingPackage.ASSET__MY_BUFFERED_IMAGE:
				return MY_BUFFERED_IMAGE_EDEFAULT == null ? myBufferedImage != null : !MY_BUFFERED_IMAGE_EDEFAULT.equals(myBufferedImage);
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
		result.append(" (myBufferedImage: ");
		result.append(myBufferedImage);
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
