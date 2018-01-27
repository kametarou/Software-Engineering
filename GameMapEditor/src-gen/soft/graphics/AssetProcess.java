/**
 */
package soft.graphics;

import java.awt.Color;
import java.awt.Graphics2D;

import org.eclipse.emf.ecore.EObject;

import soft.mapping.Asset;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soft.graphics.AssetProcess#getThumbnailX <em>Thumbnail X</em>}</li>
 *   <li>{@link soft.graphics.AssetProcess#getThumbnailY <em>Thumbnail Y</em>}</li>
 * </ul>
 *
 * @see soft.graphics.GraphicsPackage#getAssetProcess()
 * @model
 * @generated
 */
public interface AssetProcess extends EObject {
	/**
	 * Returns the value of the '<em><b>Thumbnail X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thumbnail X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thumbnail X</em>' attribute.
	 * @see #setThumbnailX(int)
	 * @see soft.graphics.GraphicsPackage#getAssetProcess_ThumbnailX()
	 * @model
	 * @generated
	 */
	int getThumbnailX();

	/**
	 * Sets the value of the '{@link soft.graphics.AssetProcess#getThumbnailX <em>Thumbnail X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thumbnail X</em>' attribute.
	 * @see #getThumbnailX()
	 * @generated
	 */
	void setThumbnailX(int value);

	/**
	 * Returns the value of the '<em><b>Thumbnail Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thumbnail Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thumbnail Y</em>' attribute.
	 * @see #setThumbnailY(int)
	 * @see soft.graphics.GraphicsPackage#getAssetProcess_ThumbnailY()
	 * @model
	 * @generated
	 */
	int getThumbnailY();

	/**
	 * Sets the value of the '{@link soft.graphics.AssetProcess#getThumbnailY <em>Thumbnail Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thumbnail Y</em>' attribute.
	 * @see #getThumbnailY()
	 * @generated
	 */
	void setThumbnailY(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="soft.mapping.Graphics2D" originDataType="soft.mapping.Graphics2D" colorDataType="soft.graphics.Color"
	 * @generated
	 */
	Graphics2D backgroundFilter(Graphics2D origin, Color color);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="soft.mapping.Graphics2D"
	 * @generated
	 */
	Graphics2D normalizeAsset(Asset asset);

} // AssetProcess
