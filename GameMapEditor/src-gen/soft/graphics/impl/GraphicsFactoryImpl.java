/**
 */
package soft.graphics.impl;

import java.awt.Color;
import java.awt.image.BufferedImage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import soft.graphics.AssetProcess;
import soft.graphics.GraphicsFactory;
import soft.graphics.GraphicsPackage;
import soft.graphics.ImageProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphicsFactoryImpl extends EFactoryImpl implements GraphicsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GraphicsFactory init() {
		try {
			GraphicsFactory theGraphicsFactory = (GraphicsFactory)EPackage.Registry.INSTANCE.getEFactory(GraphicsPackage.eNS_URI);
			if (theGraphicsFactory != null) {
				return theGraphicsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GraphicsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GraphicsPackage.IMAGE_PROCESS: return createImageProcess();
			case GraphicsPackage.ASSET_PROCESS: return createAssetProcess();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GraphicsPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case GraphicsPackage.FLOAT_ARRAY:
				return createFloatArrayFromString(eDataType, initialValue);
			case GraphicsPackage.BUFFERED_IMAGE:
				return createBufferedImageFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GraphicsPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case GraphicsPackage.FLOAT_ARRAY:
				return convertFloatArrayToString(eDataType, instanceValue);
			case GraphicsPackage.BUFFERED_IMAGE:
				return convertBufferedImageToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageProcess createImageProcess() {
		ImageProcessImpl imageProcess = new ImageProcessImpl();
		return imageProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetProcess createAssetProcess() {
		AssetProcessImpl assetProcess = new AssetProcessImpl();
		return assetProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		return (Color)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object[][] createFloatArrayFromString(EDataType eDataType, String initialValue) {
		return (Object[][])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BufferedImage createBufferedImageFromString(EDataType eDataType, String initialValue) {
		if (initialValue == "") return null;
		return (BufferedImage)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBufferedImageToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicsPackage getGraphicsPackage() {
		return (GraphicsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GraphicsPackage getPackage() {
		return GraphicsPackage.eINSTANCE;
	}

} //GraphicsFactoryImpl
