/**
 */
package soft.fileio.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import soft.fileio.FileioPackage;
import soft.fileio.XmlReader;
import soft.mapping.Asset;
import soft.mapping.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Reader</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XmlReaderImpl extends MinimalEObjectImpl.Container implements XmlReader {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlReaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FileioPackage.Literals.XML_READER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map xml2map(String filepath) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset xml2assets(String filepath) {
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
			case FileioPackage.XML_READER___INIT:
				init();
				return null;
			case FileioPackage.XML_READER___XML2MAP__STRING:
				return xml2map((String)arguments.get(0));
			case FileioPackage.XML_READER___XML2ASSETS__STRING:
				return xml2assets((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //XmlReaderImpl
