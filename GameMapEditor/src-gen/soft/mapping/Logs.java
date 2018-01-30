/**
 */
package soft.mapping;

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
 *   <li>{@link soft.mapping.Logs#getMaps <em>Maps</em>}</li>
 *   <li>{@link soft.mapping.Logs#getCurrent <em>Current</em>}</li>
 *   <li>{@link soft.mapping.Logs#getLogdata <em>Logdata</em>}</li>
 * </ul>
 *
 * @see soft.mapping.MappingPackage#getLogs()
 * @model
 * @generated
 */
public interface Logs extends EObject {
	/**
	 * Returns the value of the '<em><b>Maps</b></em>' containment reference list.
	 * The list contents are of type {@link soft.mapping.Map}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps</em>' containment reference list.
	 * @see soft.mapping.MappingPackage#getLogs_Maps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Map> getMaps();

	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see #setCurrent(int)
	 * @see soft.mapping.MappingPackage#getLogs_Current()
	 * @model default="0"
	 * @generated
	 */
	int getCurrent();

	/**
	 * Sets the value of the '{@link soft.mapping.Logs#getCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(int value);

	/**
	 * Returns the value of the '<em><b>Logdata</b></em>' reference list.
	 * The list contents are of type {@link soft.mapping.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logdata</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logdata</em>' reference list.
	 * @see soft.mapping.MappingPackage#getLogs_Logdata()
	 * @model
	 * @generated
	 */
	EList<Operation> getLogdata();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removelog();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addLog(Operation op);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init(Map map);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addMap(Map map);

} // Logs
