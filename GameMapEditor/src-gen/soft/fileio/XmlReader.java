/**
 */
package soft.fileio;

import org.eclipse.emf.ecore.EObject;
import soft.mapping.Asset;
import soft.mapping.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Reader</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see soft.fileio.FileioPackage#getXmlReader()
 * @model
 * @generated
 */
public interface XmlReader extends EObject {
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
	 * @model
	 * @generated
	 */
	Map xml2map(String filepath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model filepathRequired="true"
	 * @generated
	 */
	Asset xml2assets(String filepath);

} // XmlReader
