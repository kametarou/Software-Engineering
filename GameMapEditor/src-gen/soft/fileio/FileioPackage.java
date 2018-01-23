/**
 */
package soft.fileio;

import org.eclipse.emf.ecore.EClass;
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
 * @see soft.fileio.FileioFactory
 * @model kind="package"
 * @generated
 */
public interface FileioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fileio";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "/Users/ayumi/SE";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fileio";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FileioPackage eINSTANCE = soft.fileio.impl.FileioPackageImpl.init();

	/**
	 * The meta object id for the '{@link soft.fileio.impl.XmlWriterImpl <em>Xml Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.fileio.impl.XmlWriterImpl
	 * @see soft.fileio.impl.FileioPackageImpl#getXmlWriter()
	 * @generated
	 */
	int XML_WRITER = 0;

	/**
	 * The number of structural features of the '<em>Xml Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_WRITER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_WRITER___INIT = 0;

	/**
	 * The operation id for the '<em>Map2xml</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_WRITER___MAP2XML__STRING = 1;

	/**
	 * The number of operations of the '<em>Xml Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_WRITER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link soft.fileio.impl.XmlReaderImpl <em>Xml Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.fileio.impl.XmlReaderImpl
	 * @see soft.fileio.impl.FileioPackageImpl#getXmlReader()
	 * @generated
	 */
	int XML_READER = 1;

	/**
	 * The number of structural features of the '<em>Xml Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_READER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_READER___INIT = 0;

	/**
	 * The operation id for the '<em>Xml2map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_READER___XML2MAP__STRING = 1;

	/**
	 * The operation id for the '<em>Xml2assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_READER___XML2ASSETS__STRING = 2;

	/**
	 * The number of operations of the '<em>Xml Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_READER_OPERATION_COUNT = 3;


	/**
	 * The meta object id for the '{@link soft.fileio.impl.MyImageReaderImpl <em>My Image Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.fileio.impl.MyImageReaderImpl
	 * @see soft.fileio.impl.FileioPackageImpl#getMyImageReader()
	 * @generated
	 */
	int MY_IMAGE_READER = 2;

	/**
	 * The number of structural features of the '<em>My Image Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_IMAGE_READER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_IMAGE_READER___INIT = 0;

	/**
	 * The operation id for the '<em>Image2graphics2 D</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_IMAGE_READER___IMAGE2GRAPHICS2_D__STRING = 1;

	/**
	 * The operation id for the '<em>Image2asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_IMAGE_READER___IMAGE2ASSET__STRING = 2;

	/**
	 * The number of operations of the '<em>My Image Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_IMAGE_READER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link soft.fileio.impl.MyImageWriterImpl <em>My Image Writer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see soft.fileio.impl.MyImageWriterImpl
	 * @see soft.fileio.impl.FileioPackageImpl#getMyImageWriter()
	 * @generated
	 */
	int MY_IMAGE_WRITER = 3;

	/**
	 * The number of structural features of the '<em>My Image Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_IMAGE_WRITER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>My Image Writer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_IMAGE_WRITER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link soft.fileio.XmlWriter <em>Xml Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Writer</em>'.
	 * @see soft.fileio.XmlWriter
	 * @generated
	 */
	EClass getXmlWriter();

	/**
	 * Returns the meta object for the '{@link soft.fileio.XmlWriter#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see soft.fileio.XmlWriter#init()
	 * @generated
	 */
	EOperation getXmlWriter__Init();

	/**
	 * Returns the meta object for the '{@link soft.fileio.XmlWriter#map2xml(java.lang.String) <em>Map2xml</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Map2xml</em>' operation.
	 * @see soft.fileio.XmlWriter#map2xml(java.lang.String)
	 * @generated
	 */
	EOperation getXmlWriter__Map2xml__String();

	/**
	 * Returns the meta object for class '{@link soft.fileio.XmlReader <em>Xml Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Reader</em>'.
	 * @see soft.fileio.XmlReader
	 * @generated
	 */
	EClass getXmlReader();

	/**
	 * Returns the meta object for the '{@link soft.fileio.XmlReader#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see soft.fileio.XmlReader#init()
	 * @generated
	 */
	EOperation getXmlReader__Init();

	/**
	 * Returns the meta object for the '{@link soft.fileio.XmlReader#xml2map(java.lang.String) <em>Xml2map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Xml2map</em>' operation.
	 * @see soft.fileio.XmlReader#xml2map(java.lang.String)
	 * @generated
	 */
	EOperation getXmlReader__Xml2map__String();

	/**
	 * Returns the meta object for the '{@link soft.fileio.XmlReader#xml2assets(java.lang.String) <em>Xml2assets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Xml2assets</em>' operation.
	 * @see soft.fileio.XmlReader#xml2assets(java.lang.String)
	 * @generated
	 */
	EOperation getXmlReader__Xml2assets__String();

	/**
	 * Returns the meta object for class '{@link soft.fileio.MyImageReader <em>My Image Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Image Reader</em>'.
	 * @see soft.fileio.MyImageReader
	 * @generated
	 */
	EClass getMyImageReader();

	/**
	 * Returns the meta object for the '{@link soft.fileio.MyImageReader#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see soft.fileio.MyImageReader#init()
	 * @generated
	 */
	EOperation getMyImageReader__Init();

	/**
	 * Returns the meta object for the '{@link soft.fileio.MyImageReader#image2graphics2D(java.lang.String) <em>Image2graphics2 D</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Image2graphics2 D</em>' operation.
	 * @see soft.fileio.MyImageReader#image2graphics2D(java.lang.String)
	 * @generated
	 */
	EOperation getMyImageReader__Image2graphics2D__String();

	/**
	 * Returns the meta object for the '{@link soft.fileio.MyImageReader#image2asset(java.lang.String) <em>Image2asset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Image2asset</em>' operation.
	 * @see soft.fileio.MyImageReader#image2asset(java.lang.String)
	 * @generated
	 */
	EOperation getMyImageReader__Image2asset__String();

	/**
	 * Returns the meta object for class '{@link soft.fileio.MyImageWriter <em>My Image Writer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Image Writer</em>'.
	 * @see soft.fileio.MyImageWriter
	 * @generated
	 */
	EClass getMyImageWriter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FileioFactory getFileioFactory();

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
		 * The meta object literal for the '{@link soft.fileio.impl.XmlWriterImpl <em>Xml Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.fileio.impl.XmlWriterImpl
		 * @see soft.fileio.impl.FileioPackageImpl#getXmlWriter()
		 * @generated
		 */
		EClass XML_WRITER = eINSTANCE.getXmlWriter();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_WRITER___INIT = eINSTANCE.getXmlWriter__Init();

		/**
		 * The meta object literal for the '<em><b>Map2xml</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_WRITER___MAP2XML__STRING = eINSTANCE.getXmlWriter__Map2xml__String();

		/**
		 * The meta object literal for the '{@link soft.fileio.impl.XmlReaderImpl <em>Xml Reader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.fileio.impl.XmlReaderImpl
		 * @see soft.fileio.impl.FileioPackageImpl#getXmlReader()
		 * @generated
		 */
		EClass XML_READER = eINSTANCE.getXmlReader();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_READER___INIT = eINSTANCE.getXmlReader__Init();

		/**
		 * The meta object literal for the '<em><b>Xml2map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_READER___XML2MAP__STRING = eINSTANCE.getXmlReader__Xml2map__String();

		/**
		 * The meta object literal for the '<em><b>Xml2assets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_READER___XML2ASSETS__STRING = eINSTANCE.getXmlReader__Xml2assets__String();

		/**
		 * The meta object literal for the '{@link soft.fileio.impl.MyImageReaderImpl <em>My Image Reader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.fileio.impl.MyImageReaderImpl
		 * @see soft.fileio.impl.FileioPackageImpl#getMyImageReader()
		 * @generated
		 */
		EClass MY_IMAGE_READER = eINSTANCE.getMyImageReader();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MY_IMAGE_READER___INIT = eINSTANCE.getMyImageReader__Init();

		/**
		 * The meta object literal for the '<em><b>Image2graphics2 D</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MY_IMAGE_READER___IMAGE2GRAPHICS2_D__STRING = eINSTANCE.getMyImageReader__Image2graphics2D__String();

		/**
		 * The meta object literal for the '<em><b>Image2asset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MY_IMAGE_READER___IMAGE2ASSET__STRING = eINSTANCE.getMyImageReader__Image2asset__String();

		/**
		 * The meta object literal for the '{@link soft.fileio.impl.MyImageWriterImpl <em>My Image Writer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see soft.fileio.impl.MyImageWriterImpl
		 * @see soft.fileio.impl.FileioPackageImpl#getMyImageWriter()
		 * @generated
		 */
		EClass MY_IMAGE_WRITER = eINSTANCE.getMyImageWriter();

	}

} //FileioPackage
