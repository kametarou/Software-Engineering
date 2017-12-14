/**
 */
package mapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mapping.Map#getGetLogs <em>Get Logs</em>}</li>
 * </ul>
 *
 * @see mapping.MappingPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Get Logs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Logs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Logs</em>' reference.
	 * @see mapping.MappingPackage#getMap_GetLogs()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	Logs getGetLogs();

} // Map
