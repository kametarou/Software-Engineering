/**
 */
package soft.graphics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see soft.graphics.GraphicsPackage
 * @generated
 */
public interface GraphicsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphicsFactory eINSTANCE = soft.graphics.impl.GraphicsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Image Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Process</em>'.
	 * @generated
	 */
	ImageProcess createImageProcess();

	/**
	 * Returns a new object of class '<em>Asset Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset Process</em>'.
	 * @generated
	 */
	AssetProcess createAssetProcess();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GraphicsPackage getGraphicsPackage();

} //GraphicsFactory
