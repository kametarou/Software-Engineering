/**
 */
package soft.fileio.impl;

import java.awt.Graphics2D;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import soft.fileio.FileioPackage;
import soft.fileio.MyImageReader;

import soft.mapping.Asset;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Image Reader</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MyImageReaderImpl extends MinimalEObjectImpl.Container implements MyImageReader {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyImageReaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FileioPackage.Literals.MY_IMAGE_READER;
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
	public Graphics2D image2graphics2D(String filename) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset image2asset(String filename) {
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
			case FileioPackage.MY_IMAGE_READER___INIT:
				init();
				return null;
			case FileioPackage.MY_IMAGE_READER___IMAGE2GRAPHICS2_D__STRING:
				return image2graphics2D((String)arguments.get(0));
			case FileioPackage.MY_IMAGE_READER___IMAGE2ASSET__STRING:
				return image2asset((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //MyImageReaderImpl