/**
 */
package mapping;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mapping.Logs#getMaps <em>Maps</em>}</li>
 * </ul>
 *
 * @see mapping.MappingPackage#getLogs()
 * @model
 * @generated
 */
public interface Logs extends EObject {
	/**
	 * Returns the value of the '<em><b>Maps</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.Map}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maps</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps</em>' containment reference list.
	 * @see mapping.MappingPackage#getLogs_Maps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Map> getMaps();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean undo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean redo();

} // Logs
