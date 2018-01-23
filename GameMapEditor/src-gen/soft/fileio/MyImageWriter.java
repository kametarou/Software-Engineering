/**
 */
package soft.fileio;

import java.awt.Graphics2D;
import org.eclipse.emf.ecore.EObject;
import soft.mapping.Asset;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Image Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see soft.fileio.FileioPackage#getMyImageWriter()
 * @model
 * @generated
 */
public interface MyImageWriter extends EObject {

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
	 * @model gDataType="soft.mapping.Graphics2D" gRequired="true"
	 * @generated
	 */
	void graphics2D2image(Graphics2D g);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model assetRequired="true"
	 * @generated
	 */
	void asset2graphics2D(Asset asset);
} // MyImageWriter
