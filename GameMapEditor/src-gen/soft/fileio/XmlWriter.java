/**
 */
package soft.fileio;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see soft.fileio.FileioPackage#getXmlWriter()
 * @model
 * @generated
 */
public interface XmlWriter extends EObject {
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
	 * @model filepathRequired="true"
	 * @generated
	 */
	void map2xml(String filepath);

} // XmlWriter