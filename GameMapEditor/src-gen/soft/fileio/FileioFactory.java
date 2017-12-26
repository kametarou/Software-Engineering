/**
 */
package soft.fileio;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see soft.fileio.FileioPackage
 * @generated
 */
public interface FileioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FileioFactory eINSTANCE = soft.fileio.impl.FileioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Xml Writer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Writer</em>'.
	 * @generated
	 */
	XmlWriter createXmlWriter();

	/**
	 * Returns a new object of class '<em>Xml Reader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Reader</em>'.
	 * @generated
	 */
	XmlReader createXmlReader();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FileioPackage getFileioPackage();

} //FileioFactory
