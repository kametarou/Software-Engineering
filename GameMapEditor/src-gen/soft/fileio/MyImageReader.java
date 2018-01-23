/**
 */
package soft.fileio;

import java.awt.Graphics2D;

import org.eclipse.emf.ecore.EObject;

import soft.mapping.Asset;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Image Reader</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see soft.fileio.FileioPackage#getMyImageReader()
 * @model
 * @generated
 */
public interface MyImageReader extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="soft.mapping.Graphics2D" filenameRequired="true"
	 * @generated
	 */
	Graphics2D image2graphics2D(String filename);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model filenameRequired="true"
	 * @generated
	 */
	Asset image2asset(String filename);

} // MyImageReader
