/**
 */
package soft.graphics;

import java.awt.image.BufferedImage;

import org.eclipse.emf.ecore.EObject;

import soft.mapping.Asset;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Process</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see soft.graphics.GraphicsPackage#getAssetProcess()
 * @model
 * @generated
 */
public interface AssetProcess extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model imageDataType="soft.graphics.BufferedImage"
	 * @generated
	 */
	Asset createAsset(BufferedImage image, String name);

} // AssetProcess
