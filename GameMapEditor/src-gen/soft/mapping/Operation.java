/**
 */
package soft.mapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link soft.mapping.Operation#getLayer <em>Layer</em>}</li>
 *   <li>{@link soft.mapping.Operation#getArea <em>Area</em>}</li>
 *   <li>{@link soft.mapping.Operation#getBeforeMap <em>Before Map</em>}</li>
 *   <li>{@link soft.mapping.Operation#getAfterMap <em>After Map</em>}</li>
 * </ul>
 *
 * @see soft.mapping.MappingPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer</em>' attribute.
	 * @see #setLayer(int)
	 * @see soft.mapping.MappingPackage#getOperation_Layer()
	 * @model
	 * @generated
	 */
	int getLayer();

	/**
	 * Sets the value of the '{@link soft.mapping.Operation#getLayer <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' attribute.
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(int value);

	/**
	 * Returns the value of the '<em><b>Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' reference.
	 * @see #setArea(AreaVector)
	 * @see soft.mapping.MappingPackage#getOperation_Area()
	 * @model
	 * @generated
	 */
	AreaVector getArea();

	/**
	 * Sets the value of the '{@link soft.mapping.Operation#getArea <em>Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' reference.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(AreaVector value);

	/**
	 * Returns the value of the '<em><b>Before Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Map</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Map</em>' reference.
	 * @see #setBeforeMap(Map)
	 * @see soft.mapping.MappingPackage#getOperation_BeforeMap()
	 * @model
	 * @generated
	 */
	Map getBeforeMap();

	/**
	 * Sets the value of the '{@link soft.mapping.Operation#getBeforeMap <em>Before Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Map</em>' reference.
	 * @see #getBeforeMap()
	 * @generated
	 */
	void setBeforeMap(Map value);

	/**
	 * Returns the value of the '<em><b>After Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Map</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Map</em>' reference.
	 * @see #setAfterMap(Map)
	 * @see soft.mapping.MappingPackage#getOperation_AfterMap()
	 * @model
	 * @generated
	 */
	Map getAfterMap();

	/**
	 * Sets the value of the '{@link soft.mapping.Operation#getAfterMap <em>After Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Map</em>' reference.
	 * @see #getAfterMap()
	 * @generated
	 */
	void setAfterMap(Map value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init();

} // Operation
