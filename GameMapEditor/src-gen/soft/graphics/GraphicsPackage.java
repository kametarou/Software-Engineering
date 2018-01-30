/**
 */
package soft.graphics;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see soft.graphics.GraphicsFactory
 * @model kind="package"
 * @generated
 */
public interface GraphicsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graphics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "/Users/tkn/class/software-engineering";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graphics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphicsPackage eINSTANCE = soft.graphics.impl.GraphicsPackageImpl.init();

	/**
	 * The meta object id for the '{@link soft.graphics.impl.ImageProcessImpl <em>Image Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.graphics.impl.ImageProcessImpl
	 * @see soft.graphics.impl.GraphicsPackageImpl#getImageProcess()
	 * @generated
	 */
	int IMAGE_PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PROCESS__OPACITY = 0;

	/**
	 * The number of structural features of the '<em>Image Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PROCESS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Blending</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PROCESS___BLENDING__BUFFEREDIMAGE_AREAVECTOR_INT_INT = 0;

	/**
	 * The operation id for the '<em>Scaling</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PROCESS___SCALING__BUFFEREDIMAGE_INT = 1;

	/**
	 * The number of operations of the '<em>Image Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PROCESS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link soft.graphics.impl.AssetProcessImpl <em>Asset Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.graphics.impl.AssetProcessImpl
	 * @see soft.graphics.impl.GraphicsPackageImpl#getAssetProcess()
	 * @generated
	 */
	int ASSET_PROCESS = 1;

	/**
	 * The number of structural features of the '<em>Asset Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROCESS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROCESS___CREATE_ASSET__BUFFEREDIMAGE_STRING = 0;

	/**
	 * The operation id for the '<em>Initial Asset Array</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROCESS___INITIAL_ASSET_ARRAY = 1;

	/**
	 * The number of operations of the '<em>Asset Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_PROCESS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.awt.Color
	 * @see soft.graphics.impl.GraphicsPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 2;

	/**
	 * The meta object id for the '<em>Float Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.graphics.impl.GraphicsPackageImpl#getFloatArray()
	 * @generated
	 */
	int FLOAT_ARRAY = 3;


	/**
	 * The meta object id for the '<em>Buffered Image</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.awt.image.BufferedImage
	 * @see soft.graphics.impl.GraphicsPackageImpl#getBufferedImage()
	 * @generated
	 */
	int BUFFERED_IMAGE = 4;


	/**
	 * Returns the meta object for class '{@link soft.graphics.ImageProcess <em>Image Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Process</em>'.
	 * @see soft.graphics.ImageProcess
	 * @generated
	 */
	EClass getImageProcess();

	/**
	 * Returns the meta object for the attribute '{@link soft.graphics.ImageProcess#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see soft.graphics.ImageProcess#getOpacity()
	 * @see #getImageProcess()
	 * @generated
	 */
	EAttribute getImageProcess_Opacity();

	/**
	 * Returns the meta object for the '{@link soft.graphics.ImageProcess#blending(java.awt.image.BufferedImage, soft.mapping.AreaVector, int, int) <em>Blending</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Blending</em>' operation.
	 * @see soft.graphics.ImageProcess#blending(java.awt.image.BufferedImage, soft.mapping.AreaVector, int, int)
	 * @generated
	 */
	EOperation getImageProcess__Blending__BufferedImage_AreaVector_int_int();

	/**
	 * Returns the meta object for the '{@link soft.graphics.ImageProcess#scaling(java.awt.image.BufferedImage, int) <em>Scaling</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Scaling</em>' operation.
	 * @see soft.graphics.ImageProcess#scaling(java.awt.image.BufferedImage, int)
	 * @generated
	 */
	EOperation getImageProcess__Scaling__BufferedImage_int();

	/**
	 * Returns the meta object for class '{@link soft.graphics.AssetProcess <em>Asset Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Process</em>'.
	 * @see soft.graphics.AssetProcess
	 * @generated
	 */
	EClass getAssetProcess();

	/**
	 * Returns the meta object for the '{@link soft.graphics.AssetProcess#createAsset(java.awt.image.BufferedImage, java.lang.String) <em>Create Asset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Asset</em>' operation.
	 * @see soft.graphics.AssetProcess#createAsset(java.awt.image.BufferedImage, java.lang.String)
	 * @generated
	 */
	EOperation getAssetProcess__CreateAsset__BufferedImage_String();

	/**
	 * Returns the meta object for the '{@link soft.graphics.AssetProcess#initialAssetArray() <em>Initial Asset Array</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initial Asset Array</em>' operation.
	 * @see soft.graphics.AssetProcess#initialAssetArray()
	 * @generated
	 */
	EOperation getAssetProcess__InitialAssetArray();

	/**
	 * Returns the meta object for data type '{@link java.awt.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color</em>'.
	 * @see java.awt.Color
	 * @model instanceClass="java.awt.Color"
	 * @generated
	 */
	EDataType getColor();

	/**
	 * Returns the meta object for data type '<em>Float Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float Array</em>'.
	 * @model instanceClass="java.lang.Object[][]"
	 * @generated
	 */
	EDataType getFloatArray();

	/**
	 * Returns the meta object for data type '{@link java.awt.image.BufferedImage <em>Buffered Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Buffered Image</em>'.
	 * @see java.awt.image.BufferedImage
	 * @model instanceClass="java.awt.image.BufferedImage"
	 * @generated
	 */
	EDataType getBufferedImage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphicsFactory getGraphicsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link soft.graphics.impl.ImageProcessImpl <em>Image Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.graphics.impl.ImageProcessImpl
		 * @see soft.graphics.impl.GraphicsPackageImpl#getImageProcess()
		 * @generated
		 */
		EClass IMAGE_PROCESS = eINSTANCE.getImageProcess();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_PROCESS__OPACITY = eINSTANCE.getImageProcess_Opacity();

		/**
		 * The meta object literal for the '<em><b>Blending</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE_PROCESS___BLENDING__BUFFEREDIMAGE_AREAVECTOR_INT_INT = eINSTANCE.getImageProcess__Blending__BufferedImage_AreaVector_int_int();

		/**
		 * The meta object literal for the '<em><b>Scaling</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE_PROCESS___SCALING__BUFFEREDIMAGE_INT = eINSTANCE.getImageProcess__Scaling__BufferedImage_int();

		/**
		 * The meta object literal for the '{@link soft.graphics.impl.AssetProcessImpl <em>Asset Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.graphics.impl.AssetProcessImpl
		 * @see soft.graphics.impl.GraphicsPackageImpl#getAssetProcess()
		 * @generated
		 */
		EClass ASSET_PROCESS = eINSTANCE.getAssetProcess();

		/**
		 * The meta object literal for the '<em><b>Create Asset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSET_PROCESS___CREATE_ASSET__BUFFEREDIMAGE_STRING = eINSTANCE.getAssetProcess__CreateAsset__BufferedImage_String();

		/**
		 * The meta object literal for the '<em><b>Initial Asset Array</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSET_PROCESS___INITIAL_ASSET_ARRAY = eINSTANCE.getAssetProcess__InitialAssetArray();

		/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.awt.Color
		 * @see soft.graphics.impl.GraphicsPackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em>Float Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.graphics.impl.GraphicsPackageImpl#getFloatArray()
		 * @generated
		 */
		EDataType FLOAT_ARRAY = eINSTANCE.getFloatArray();

		/**
		 * The meta object literal for the '<em>Buffered Image</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.awt.image.BufferedImage
		 * @see soft.graphics.impl.GraphicsPackageImpl#getBufferedImage()
		 * @generated
		 */
		EDataType BUFFERED_IMAGE = eINSTANCE.getBufferedImage();

	}

} //GraphicsPackage
