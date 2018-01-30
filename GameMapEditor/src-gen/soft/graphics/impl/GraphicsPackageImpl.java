/**
 */
package soft.graphics.impl;

import java.awt.Color;
import java.awt.image.BufferedImage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import soft.fileio.FileioPackage;

import soft.fileio.impl.FileioPackageImpl;

import soft.graphics.AssetProcess;
import soft.graphics.GraphicsFactory;
import soft.graphics.GraphicsPackage;
import soft.graphics.ImageProcess;

import soft.main.MainPackage;

import soft.main.impl.MainPackageImpl;

import soft.mapping.MappingPackage;

import soft.mapping.impl.MappingPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphicsPackageImpl extends EPackageImpl implements GraphicsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bufferedImageEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see soft.graphics.GraphicsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GraphicsPackageImpl() {
		super(eNS_URI, GraphicsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GraphicsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GraphicsPackage init() {
		if (isInited) return (GraphicsPackage)EPackage.Registry.INSTANCE.getEPackage(GraphicsPackage.eNS_URI);

		// Obtain or create and register package
		GraphicsPackageImpl theGraphicsPackage = (GraphicsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GraphicsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GraphicsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MappingPackageImpl theMappingPackage = (MappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) : MappingPackage.eINSTANCE);
		MainPackageImpl theMainPackage = (MainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI) instanceof MainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI) : MainPackage.eINSTANCE);
		FileioPackageImpl theFileioPackage = (FileioPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FileioPackage.eNS_URI) instanceof FileioPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FileioPackage.eNS_URI) : FileioPackage.eINSTANCE);

		// Create package meta-data objects
		theGraphicsPackage.createPackageContents();
		theMappingPackage.createPackageContents();
		theMainPackage.createPackageContents();
		theFileioPackage.createPackageContents();

		// Initialize created meta-data
		theGraphicsPackage.initializePackageContents();
		theMappingPackage.initializePackageContents();
		theMainPackage.initializePackageContents();
		theFileioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGraphicsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GraphicsPackage.eNS_URI, theGraphicsPackage);
		return theGraphicsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageProcess() {
		return imageProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageProcess_Opacity() {
		return (EAttribute)imageProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImageProcess__Blending__BufferedImage_AreaVector_int_int() {
		return imageProcessEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImageProcess__Scaling__BufferedImage_int() {
		return imageProcessEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssetProcess() {
		return assetProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssetProcess__CreateAsset__BufferedImage_String() {
		return assetProcessEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor() {
		return colorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloatArray() {
		return floatArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBufferedImage() {
		return bufferedImageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicsFactory getGraphicsFactory() {
		return (GraphicsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		imageProcessEClass = createEClass(IMAGE_PROCESS);
		createEAttribute(imageProcessEClass, IMAGE_PROCESS__OPACITY);
		createEOperation(imageProcessEClass, IMAGE_PROCESS___BLENDING__BUFFEREDIMAGE_AREAVECTOR_INT_INT);
		createEOperation(imageProcessEClass, IMAGE_PROCESS___SCALING__BUFFEREDIMAGE_INT);

		assetProcessEClass = createEClass(ASSET_PROCESS);
		createEOperation(assetProcessEClass, ASSET_PROCESS___CREATE_ASSET__BUFFEREDIMAGE_STRING);

		// Create data types
		colorEDataType = createEDataType(COLOR);
		floatArrayEDataType = createEDataType(FLOAT_ARRAY);
		bufferedImageEDataType = createEDataType(BUFFERED_IMAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MappingPackage theMappingPackage = (MappingPackage)EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(imageProcessEClass, ImageProcess.class, "ImageProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageProcess_Opacity(), this.getFloatArray(), "opacity", null, 0, 1, ImageProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getImageProcess__Blending__BufferedImage_AreaVector_int_int(), this.getBufferedImage(), "blending", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedImage(), "wholeMap", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMappingPackage.getAreaVector(), "renewArea", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "currentLayer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "scale", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getImageProcess__Scaling__BufferedImage_int(), this.getBufferedImage(), "scaling", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedImage(), "wholeMap", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "scale", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assetProcessEClass, AssetProcess.class, "AssetProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAssetProcess__CreateAsset__BufferedImage_String(), theMappingPackage.getAsset(), "createAsset", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBufferedImage(), "image", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(colorEDataType, Color.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(floatArrayEDataType, Object[][].class, "FloatArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bufferedImageEDataType, BufferedImage.class, "BufferedImage", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //GraphicsPackageImpl
