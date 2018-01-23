/**
 */
package soft.fileio.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import soft.fileio.FileioFactory;
import soft.fileio.FileioPackage;
import soft.fileio.MyImageReader;
import soft.fileio.MyImageWriter;
import soft.fileio.XmlReader;
import soft.fileio.XmlWriter;

import soft.graphics.GraphicsPackage;
import soft.graphics.impl.GraphicsPackageImpl;
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
public class FileioPackageImpl extends EPackageImpl implements FileioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlWriterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlReaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myImageReaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myImageWriterEClass = null;

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
	 * @see soft.fileio.FileioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FileioPackageImpl() {
		super(eNS_URI, FileioFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FileioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FileioPackage init() {
		if (isInited) return (FileioPackage)EPackage.Registry.INSTANCE.getEPackage(FileioPackage.eNS_URI);

		// Obtain or create and register package
		FileioPackageImpl theFileioPackage = (FileioPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FileioPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FileioPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MappingPackageImpl theMappingPackage = (MappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) : MappingPackage.eINSTANCE);
		MainPackageImpl theMainPackage = (MainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI) instanceof MainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MainPackage.eNS_URI) : MainPackage.eINSTANCE);
		GraphicsPackageImpl theGraphicsPackage = (GraphicsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GraphicsPackage.eNS_URI) instanceof GraphicsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GraphicsPackage.eNS_URI) : GraphicsPackage.eINSTANCE);

		// Create package meta-data objects
		theFileioPackage.createPackageContents();
		theMappingPackage.createPackageContents();
		theMainPackage.createPackageContents();
		theGraphicsPackage.createPackageContents();

		// Initialize created meta-data
		theFileioPackage.initializePackageContents();
		theMappingPackage.initializePackageContents();
		theMainPackage.initializePackageContents();
		theGraphicsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFileioPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FileioPackage.eNS_URI, theFileioPackage);
		return theFileioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXmlWriter() {
		return xmlWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXmlWriter__Init() {
		return xmlWriterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXmlWriter__Map2xml__String() {
		return xmlWriterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXmlReader() {
		return xmlReaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXmlReader__Init() {
		return xmlReaderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXmlReader__Xml2map__String() {
		return xmlReaderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXmlReader__Xml2assets__String() {
		return xmlReaderEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMyImageReader() {
		return myImageReaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMyImageReader__Init() {
		return myImageReaderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMyImageReader__Image2graphics2D__String() {
		return myImageReaderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMyImageReader__Image2asset__String() {
		return myImageReaderEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMyImageWriter() {
		return myImageWriterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMyImageWriter__Init() {
		return myImageWriterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMyImageWriter__Graphics2D2image__Graphics2D() {
		return myImageWriterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMyImageWriter__Asset2graphics2D__Asset() {
		return myImageWriterEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileioFactory getFileioFactory() {
		return (FileioFactory)getEFactoryInstance();
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
		xmlWriterEClass = createEClass(XML_WRITER);
		createEOperation(xmlWriterEClass, XML_WRITER___INIT);
		createEOperation(xmlWriterEClass, XML_WRITER___MAP2XML__STRING);

		xmlReaderEClass = createEClass(XML_READER);
		createEOperation(xmlReaderEClass, XML_READER___INIT);
		createEOperation(xmlReaderEClass, XML_READER___XML2MAP__STRING);
		createEOperation(xmlReaderEClass, XML_READER___XML2ASSETS__STRING);

		myImageReaderEClass = createEClass(MY_IMAGE_READER);
		createEOperation(myImageReaderEClass, MY_IMAGE_READER___INIT);
		createEOperation(myImageReaderEClass, MY_IMAGE_READER___IMAGE2GRAPHICS2_D__STRING);
		createEOperation(myImageReaderEClass, MY_IMAGE_READER___IMAGE2ASSET__STRING);

		myImageWriterEClass = createEClass(MY_IMAGE_WRITER);
		createEOperation(myImageWriterEClass, MY_IMAGE_WRITER___INIT);
		createEOperation(myImageWriterEClass, MY_IMAGE_WRITER___GRAPHICS2_D2IMAGE__GRAPHICS2D);
		createEOperation(myImageWriterEClass, MY_IMAGE_WRITER___ASSET2GRAPHICS2_D__ASSET);
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
		initEClass(xmlWriterEClass, XmlWriter.class, "XmlWriter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getXmlWriter__Init(), null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getXmlWriter__Map2xml__String(), null, "map2xml", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filepath", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xmlReaderEClass, XmlReader.class, "XmlReader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getXmlReader__Init(), null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlReader__Xml2map__String(), theMappingPackage.getMap(), "xml2map", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filepath", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlReader__Xml2assets__String(), theMappingPackage.getAsset(), "xml2assets", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filepath", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(myImageReaderEClass, MyImageReader.class, "MyImageReader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMyImageReader__Init(), null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMyImageReader__Image2graphics2D__String(), theMappingPackage.getGraphics2D(), "image2graphics2D", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filename", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMyImageReader__Image2asset__String(), theMappingPackage.getAsset(), "image2asset", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filename", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(myImageWriterEClass, MyImageWriter.class, "MyImageWriter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMyImageWriter__Init(), null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMyImageWriter__Graphics2D2image__Graphics2D(), null, "graphics2D2image", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMappingPackage.getGraphics2D(), "g", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMyImageWriter__Asset2graphics2D__Asset(), null, "asset2graphics2D", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMappingPackage.getAsset(), "asset", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FileioPackageImpl
