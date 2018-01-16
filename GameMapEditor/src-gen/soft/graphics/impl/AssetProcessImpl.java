/**
 */
package soft.graphics.impl;

import java.awt.Color;
import java.awt.Graphics2D;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import soft.graphics.AssetProcess;
import soft.graphics.GraphicsPackage;

import soft.mapping.Asset;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link soft.graphics.impl.AssetProcessImpl#getThumbnailX <em>Thumbnail X</em>}</li>
 *   <li>{@link soft.graphics.impl.AssetProcessImpl#getThumbnailY <em>Thumbnail Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetProcessImpl extends MinimalEObjectImpl.Container implements AssetProcess {
	/**
	 * The default value of the '{@link #getThumbnailX() <em>Thumbnail X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbnailX()
	 * @generated
	 * @ordered
	 */
	protected static final int THUMBNAIL_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThumbnailX() <em>Thumbnail X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbnailX()
	 * @generated
	 * @ordered
	 */
	protected int thumbnailX = THUMBNAIL_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getThumbnailY() <em>Thumbnail Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbnailY()
	 * @generated
	 * @ordered
	 */
	protected static final int THUMBNAIL_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThumbnailY() <em>Thumbnail Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbnailY()
	 * @generated
	 * @ordered
	 */
	protected int thumbnailY = THUMBNAIL_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphicsPackage.Literals.ASSET_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getThumbnailX() {
		return thumbnailX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThumbnailX(int newThumbnailX) {
		int oldThumbnailX = thumbnailX;
		thumbnailX = newThumbnailX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicsPackage.ASSET_PROCESS__THUMBNAIL_X, oldThumbnailX, thumbnailX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getThumbnailY() {
		return thumbnailY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThumbnailY(int newThumbnailY) {
		int oldThumbnailY = thumbnailY;
		thumbnailY = newThumbnailY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicsPackage.ASSET_PROCESS__THUMBNAIL_Y, oldThumbnailY, thumbnailY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graphics2D backgroundFilter(Graphics2D origin, Color color) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graphics2D normalizeAsset(Asset asset) {
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
			case GraphicsPackage.ASSET_PROCESS__THUMBNAIL_X:
				return getThumbnailX();
			case GraphicsPackage.ASSET_PROCESS__THUMBNAIL_Y:
				return getThumbnailY();
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
			case GraphicsPackage.ASSET_PROCESS__THUMBNAIL_X:
				setThumbnailX((Integer)newValue);
				return;
			case GraphicsPackage.ASSET_PROCESS__THUMBNAIL_Y:
				setThumbnailY((Integer)newValue);
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
			case GraphicsPackage.ASSET_PROCESS__THUMBNAIL_X:
				setThumbnailX(THUMBNAIL_X_EDEFAULT);
				return;
			case GraphicsPackage.ASSET_PROCESS__THUMBNAIL_Y:
				setThumbnailY(THUMBNAIL_Y_EDEFAULT);
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
			case GraphicsPackage.ASSET_PROCESS__THUMBNAIL_X:
				return thumbnailX != THUMBNAIL_X_EDEFAULT;
			case GraphicsPackage.ASSET_PROCESS__THUMBNAIL_Y:
				return thumbnailY != THUMBNAIL_Y_EDEFAULT;
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
			case GraphicsPackage.ASSET_PROCESS___BACKGROUND_FILTER__GRAPHICS2D_COLOR:
				return backgroundFilter((Graphics2D)arguments.get(0), (Color)arguments.get(1));
			case GraphicsPackage.ASSET_PROCESS___NORMALIZE_ASSET__ASSET:
				return normalizeAsset((Asset)arguments.get(0));
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
		result.append(" (thumbnailX: ");
		result.append(thumbnailX);
		result.append(", thumbnailY: ");
		result.append(thumbnailY);
		result.append(')');
		return result.toString();
	}

} //AssetProcessImpl
