/**
 */
package soft.fileio.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import soft.fileio.FileioFactory;
import soft.fileio.FileioPackage;
import soft.fileio.XmlReader;
import soft.fileio.XmlWriter;

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

		// Create package meta-data objects
		theFileioPackage.createPackageContents();
		theMappingPackage.createPackageContents();
		theMainPackage.createPackageContents();

		// Initialize created meta-data
		theFileioPackage.initializePackageContents();
		theMappingPackage.initializePackageContents();
		theMainPackage.initializePackageContents();

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
	public EOperation getXmlWriter__Xml2map__String() {
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
	public EOperation getXmlReader__Map2xml() {
		return xmlReaderEClass.getEOperations().get(1);
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
		createEOperation(xmlWriterEClass, XML_WRITER___XML2MAP__STRING);

		xmlReaderEClass = createEClass(XML_READER);
		createEOperation(xmlReaderEClass, XML_READER___INIT);
		createEOperation(xmlReaderEClass, XML_READER___MAP2XML);
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

		EOperation op = initEOperation(getXmlWriter__Xml2map__String(), theMappingPackage.getMap(), "xml2map", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filepath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xmlReaderEClass, XmlReader.class, "XmlReader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getXmlReader__Init(), null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getXmlReader__Map2xml(), null, "map2xml", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FileioPackageImpl