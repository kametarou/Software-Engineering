/**
 */
package mapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mapping.AreaVector#getStart <em>Start</em>}</li>
 *   <li>{@link mapping.AreaVector#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see mapping.MappingPackage#getAreaVector()
 * @model
 * @generated
 */
public interface AreaVector extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(Position)
	 * @see mapping.MappingPackage#getAreaVector_Start()
	 * @model
	 * @generated
	 */
	Position getStart();

	/**
	 * Sets the value of the '{@link mapping.AreaVector#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Position value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Position)
	 * @see mapping.MappingPackage#getAreaVector_End()
	 * @model
	 * @generated
	 */
	Position getEnd();

	/**
	 * Sets the value of the '{@link mapping.AreaVector#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Position value);

} // AreaVector
