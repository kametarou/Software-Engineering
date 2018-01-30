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
	 * @generated
	 */
	public Asset createAsset(BufferedImage image, String name) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GraphicsPackage.ASSET_PROCESS___CREATE_ASSET__BUFFEREDIMAGE_STRING:
				return createAsset((BufferedImage)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //AssetProcessImpl
