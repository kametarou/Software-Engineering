/**
 */
package soft.fileio.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import soft.fileio.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FileioFactoryImpl extends EFactoryImpl implements FileioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FileioFactory init() {
		try {
			FileioFactory theFileioFactory = (FileioFactory)EPackage.Registry.INSTANCE.getEFactory(FileioPackage.eNS_URI);
			if (theFileioFactory != null) {
				return theFileioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FileioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileioFactoryImpl() {
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
			case FileioPackage.XML_WRITER: return createXmlWriter();
			case FileioPackage.XML_READER: return createXmlReader();
			case FileioPackage.MY_IMAGE_READER: return createMyImageReader();
			case FileioPackage.MY_IMAGE_WRITER: return createMyImageWriter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlWriter createXmlWriter() {
		XmlWriterImpl xmlWriter = new XmlWriterImpl();
		return xmlWriter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlReader createXmlReader() {
		XmlReaderImpl xmlReader = new XmlReaderImpl();
		return xmlReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyImageReader createMyImageReader() {
		MyImageReaderImpl myImageReader = new MyImageReaderImpl();
		return myImageReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyImageWriter createMyImageWriter() {
		MyImageWriterImpl myImageWriter = new MyImageWriterImpl();
		return myImageWriter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileioPackage getFileioPackage() {
		return (FileioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FileioPackage getPackage() {
		return FileioPackage.eINSTANCE;
	}

} //FileioFactoryImpl
