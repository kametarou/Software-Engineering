/**
 */
package soft.mapping;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link soft.mapping.Map#getGetLogs <em>Get Logs</em>}</li>
 *   <li>{@link soft.mapping.Map#getCells <em>Cells</em>}</li>
 *   <li>{@link soft.mapping.Map#getCurrentLayer <em>Current Layer</em>}</li>
 * </ul>
 *
 * @see soft.mapping.MappingPackage#getMap()
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
	 * @see soft.mapping.MappingPackage#getMap_GetLogs()
	 * @model required="true" changeable="false"
	 * @generated
	 */
	Logs getGetLogs();

	/**
	 * Returns the value of the '<em><b>Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cells</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' attribute.
	 * @see #setCells(EList)
	 * @see soft.mapping.MappingPackage#getMap_Cells()
	 * @model many="false"
	 * @generated
	 */
	EList<?> getCells();

	/**
	 * Sets the value of the '{@link soft.mapping.Map#getCells <em>Cells</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cells</em>' attribute.
	 * @see #getCells()
	 * @generated
	 */
	void setCells(EList<?> value);

	/**
	 * Returns the value of the '<em><b>Current Layer</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Layer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Layer</em>' attribute.
	 * @see #setCurrentLayer(int)
	 * @see soft.mapping.MappingPackage#getMap_CurrentLayer()
	 * @model default=""
	 * @generated
	 */
	int getCurrentLayer();

	/**
	 * Sets the value of the '{@link soft.mapping.Map#getCurrentLayer <em>Current Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Layer</em>' attribute.
	 * @see #getCurrentLayer()
	 * @generated
	 */
	void setCurrentLayer(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init(int height, int width);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean setLayer(int layer);

} // Map
