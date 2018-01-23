/**
 */
package soft.fileio.impl;

import java.awt.Graphics2D;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import soft.fileio.FileioPackage;
import soft.fileio.MyImageWriter;
import soft.mapping.Asset;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Image Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MyImageWriterImpl extends MinimalEObjectImpl.Container implements MyImageWriter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyImageWriterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FileioPackage.Literals.MY_IMAGE_WRITER;
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
	public void graphics2D2image(Graphics2D g) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void asset2graphics2D(Asset asset) {
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
			case FileioPackage.MY_IMAGE_WRITER___INIT:
				init();
				return null;
			case FileioPackage.MY_IMAGE_WRITER___GRAPHICS2_D2IMAGE__GRAPHICS2D:
				graphics2D2image((Graphics2D)arguments.get(0));
				return null;
			case FileioPackage.MY_IMAGE_WRITER___ASSET2GRAPHICS2_D__ASSET:
				asset2graphics2D((Asset)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MyImageWriterImpl
