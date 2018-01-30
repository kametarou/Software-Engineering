/**
 */
package soft.graphics.impl;

import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import soft.graphics.AssetProcess;
import soft.graphics.GraphicsPackage;

import soft.mapping.Asset;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AssetProcessImpl extends MinimalEObjectImpl.Container implements AssetProcess {
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
	 * @generated NOT
	 */
	public Asset createAsset(BufferedImage image, string name) {
		int orgWidth = iamge.getWidth();
		int orgHeight = image.getHeight();
		boolean width32 = orgWidth % 32 == 0;
		boolean height32 = orgHeight % 32 == 0;
		int x, y;
		int marginx = 0, marginy = 0;
		int width, height;
		BufferedImage assetImage = null;
		int i, j;

		if(width32)
			x = orgWidth / 32;
		else {
			x = orgWidth / 32 + 1;
			marginx = (x * 32 - orgWidth) / 2;
		}
		if(height32)
			y = orgHeight / 32;
		else {
			y = orgHeight / 32 + 1;
			marginy = (y * 32 - orgHeight) / 2;
		}

		width = x * 32;
		height = y * 32;

		assetImage = new BufferedImage(width, height, image.getType());

		for(i=0; i<marginx; i++) {
			for(j=0; j<height; j++) {
				assetImage.setRGB(i, j, 0);
			}
		}
		for(; i<width - marginx; i++) {
			for(j=0; j<marginy; j++)
				assetImage.setRGB(i, j, 0);
			for(; j<height - marginy; j++)
				assetImage.setRGB(i, j, image.getRGB(i-marginx, j-marginy));
			for(; j<height; j++)
				assetImage.setRGB(i, j, 0);
		}

		Asset asset = factory.createAsset();
		asset.myBufferedImage = assetImage;
		asset.x = x;
		asset.y = y;
		asset.assetId = name;
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GraphicsPackage.ASSET_PROCESS___CREATE_ASSET__BUFFEREDIMAGE_STRING:
				return createAsset((BufferedImage)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AssetProcessImpl
