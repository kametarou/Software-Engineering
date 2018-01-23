/**
 */
package soft.fileio;

import java.awt.Graphics2D;

import org.eclipse.emf.ecore.EObject;

import soft.mapping.Asset;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Reader</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see soft.fileio.FileioPackage#getImageReader()
 * @model
 * @generated
 */
public interface ImageReader extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="soft.mapping.Graphics2D" required="true" filenameRequired="true"
	 * @generated
	 */
	Graphics2D image2graphics2D(String filename);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" filenameRequired="true"
	 * @generated
	 */
	Asset image2asset(String filename);

} // ImageReader
