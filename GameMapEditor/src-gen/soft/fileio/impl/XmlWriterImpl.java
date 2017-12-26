/**
 */
package soft.fileio.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import soft.fileio.FileioPackage;
import soft.fileio.XmlWriter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XmlWriterImpl extends MinimalEObjectImpl.Container implements XmlWriter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlWriterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FileioPackage.Literals.XML_WRITER;
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
	public void map2xml(String filepath) {
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
			case FileioPackage.XML_WRITER___INIT:
				init();
				return null;
			case FileioPackage.XML_WRITER___MAP2XML__STRING:
				map2xml((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //XmlWriterImpl
